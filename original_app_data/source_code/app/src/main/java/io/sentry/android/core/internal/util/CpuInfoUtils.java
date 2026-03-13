package io.sentry.android.core.internal.util;

import io.sentry.ISentryLifecycleToken;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class CpuInfoUtils {
    static final String CPUINFO_MAX_FREQ_PATH = "cpufreq/cpuinfo_max_freq";
    private static final String SYSTEM_CPU_PATH = "/sys/devices/system/cpu";
    private static final CpuInfoUtils instance = new CpuInfoUtils();
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private final List<Integer> cpuMaxFrequenciesMhz = new ArrayList();

    private CpuInfoUtils() {
    }

    public static CpuInfoUtils getInstance() {
        return instance;
    }

    public void clear() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.cpuMaxFrequenciesMhz.clear();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String getSystemCpuPath() {
        return SYSTEM_CPU_PATH;
    }

    public List<Integer> readMaxFrequencies() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.cpuMaxFrequenciesMhz.isEmpty()) {
                List<Integer> list = this.cpuMaxFrequenciesMhz;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(getSystemCpuPath()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String text = FileUtils.readText(new File(file, CPUINFO_MAX_FREQ_PATH));
                        if (text != null) {
                            this.cpuMaxFrequenciesMhz.add(Integer.valueOf((int) (Long.parseLong(text.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            List<Integer> list2 = this.cpuMaxFrequenciesMhz;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return list2;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void setCpuMaxFrequencies(List<Integer> list) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.cpuMaxFrequenciesMhz.clear();
            this.cpuMaxFrequenciesMhz.addAll(list);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
