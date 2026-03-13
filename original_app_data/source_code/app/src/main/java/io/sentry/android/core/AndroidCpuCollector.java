package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.ILogger;
import io.sentry.IPerformanceSnapshotCollector;
import io.sentry.PerformanceCollectionData;
import io.sentry.SentryLevel;
import io.sentry.util.FileUtils;
import io.sentry.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidCpuCollector implements IPerformanceSnapshotCollector {
    private final ILogger logger;
    private long lastRealtimeNanos = 0;
    private long lastCpuNanos = 0;
    private long clockSpeedHz = 1;
    private long numCores = 1;
    private final long NANOSECOND_PER_SECOND = 1000000000;
    private double nanosecondsPerClockTick = 1.0E9d / 1;
    private final File selfStat = new File("/proc/self/stat");
    private boolean isEnabled = false;
    private final Pattern newLinePattern = Pattern.compile("[\n\t\r ]");

    public AndroidCpuCollector(ILogger iLogger) {
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    private long readTotalCpuNanos() {
        String text;
        try {
            text = FileUtils.readText(this.selfStat);
        } catch (IOException e10) {
            this.isEnabled = false;
            this.logger.log(SentryLevel.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            text = null;
        }
        if (text != null) {
            String[] strArrSplit = this.newLinePattern.split(text.trim());
            try {
                long j10 = Long.parseLong(strArrSplit[13]);
                long j11 = Long.parseLong(strArrSplit[14]);
                return (long) ((j10 + j11 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.nanosecondsPerClockTick);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                this.logger.log(SentryLevel.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(PerformanceCollectionData performanceCollectionData) {
        if (this.isEnabled) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = jElapsedRealtimeNanos - this.lastRealtimeNanos;
            this.lastRealtimeNanos = jElapsedRealtimeNanos;
            long totalCpuNanos = readTotalCpuNanos();
            long j11 = totalCpuNanos - this.lastCpuNanos;
            this.lastCpuNanos = totalCpuNanos;
            performanceCollectionData.setCpuUsagePercentage(Double.valueOf(((j11 / j10) / this.numCores) * 100.0d));
        }
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
        this.isEnabled = true;
        this.clockSpeedHz = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.numCores = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.nanosecondsPerClockTick = 1.0E9d / this.clockSpeedHz;
        this.lastCpuNanos = readTotalCpuNanos();
    }
}
