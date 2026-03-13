package org.apache.tika.pipes;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.config.ConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PipesConfigBase extends ConfigBase {
    public static final int DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS = 10000;
    public static final long DEFAULT_MAX_FOR_EMIT_BATCH = 100000;
    public static final int DEFAULT_NUM_CLIENTS = 4;
    public static final long DEFAULT_SHUTDOWN_CLIENT_AFTER_MILLS = 300000;
    public static final int DEFAULT_STALE_FETCHER_DELAY_SECONDS = 60;
    public static final int DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS = 600;
    public static final long DEFAULT_STARTUP_TIMEOUT_MILLIS = 240000;
    public static final long DEFAULT_TIMEOUT_MILLIS = 60000;
    private Path tikaConfig;
    private long maxForEmitBatchBytes = DEFAULT_MAX_FOR_EMIT_BATCH;
    private long timeoutMillis = 60000;
    private long startupTimeoutMillis = DEFAULT_STARTUP_TIMEOUT_MILLIS;
    private long sleepOnStartupTimeoutMillis = DEFAULT_STARTUP_TIMEOUT_MILLIS;
    private long shutdownClientAfterMillis = 300000;
    private int numClients = 4;
    private int maxFilesProcessedPerProcess = 10000;
    private int staleFetcherTimeoutSeconds = DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS;
    private int staleFetcherDelaySeconds = 60;
    private List<String> forkedJvmArgs = new ArrayList();
    private String javaPath = "java";

    public List<String> getForkedJvmArgs() {
        return new ArrayList(this.forkedJvmArgs);
    }

    public String getJavaPath() {
        return this.javaPath;
    }

    public int getMaxFilesProcessedPerProcess() {
        return this.maxFilesProcessedPerProcess;
    }

    public long getMaxForEmitBatchBytes() {
        return this.maxForEmitBatchBytes;
    }

    public int getNumClients() {
        return this.numClients;
    }

    public long getShutdownClientAfterMillis() {
        return this.shutdownClientAfterMillis;
    }

    public long getSleepOnStartupTimeoutMillis() {
        return this.sleepOnStartupTimeoutMillis;
    }

    public int getStaleFetcherDelaySeconds() {
        return this.staleFetcherDelaySeconds;
    }

    public int getStaleFetcherTimeoutSeconds() {
        return this.staleFetcherTimeoutSeconds;
    }

    public long getStartupTimeoutMillis() {
        return this.startupTimeoutMillis;
    }

    public Path getTikaConfig() {
        return this.tikaConfig;
    }

    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public void setForkedJvmArgs(List<String> list) {
        this.forkedJvmArgs = Collections.unmodifiableList(list);
    }

    public void setJavaPath(String str) {
        this.javaPath = str;
    }

    public void setMaxFilesProcessedPerProcess(int i10) {
        this.maxFilesProcessedPerProcess = i10;
    }

    public void setMaxForEmitBatchBytes(long j10) {
        this.maxForEmitBatchBytes = j10;
    }

    public void setNumClients(int i10) {
        this.numClients = i10;
    }

    public void setShutdownClientAfterMillis(long j10) {
        this.shutdownClientAfterMillis = j10;
    }

    public void setSleepOnStartupTimeoutMillis(long j10) {
        this.sleepOnStartupTimeoutMillis = j10;
    }

    public void setStaleFetcherDelaySeconds(int i10) {
        this.staleFetcherDelaySeconds = i10;
    }

    public void setStaleFetcherTimeoutSeconds(int i10) {
        this.staleFetcherTimeoutSeconds = i10;
    }

    public void setStartupTimeoutMillis(long j10) {
        this.startupTimeoutMillis = j10;
    }

    public void setTikaConfig(Path path) {
        this.tikaConfig = path;
    }

    public void setTimeoutMillis(long j10) {
        this.timeoutMillis = j10;
    }

    public void setTikaConfig(String str) {
        setTikaConfig(Paths.get(str, new String[0]));
    }
}
