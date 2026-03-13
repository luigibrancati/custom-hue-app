package org.apache.tika.utils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileProcessResult {
    String stderr = "";
    String stdout = "";
    int exitValue = -1;
    long processTimeMillis = -1;
    boolean isTimeout = false;
    long stdoutLength = -1;
    long stderrLength = -1;
    boolean stderrTruncated = false;
    boolean stdoutTruncated = false;

    public int getExitValue() {
        return this.exitValue;
    }

    public long getProcessTimeMillis() {
        return this.processTimeMillis;
    }

    public String getStderr() {
        return this.stderr;
    }

    public long getStderrLength() {
        return this.stderrLength;
    }

    public String getStdout() {
        return this.stdout;
    }

    public long getStdoutLength() {
        return this.stdoutLength;
    }

    public boolean isStderrTruncated() {
        return this.stderrTruncated;
    }

    public boolean isStdoutTruncated() {
        return this.stdoutTruncated;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setExitValue(int i10) {
        this.exitValue = i10;
    }

    public void setProcessTimeMillis(long j10) {
        this.processTimeMillis = j10;
    }

    public void setStderr(String str) {
        this.stderr = str;
    }

    public void setStderrLength(long j10) {
        this.stderrLength = j10;
    }

    public void setStderrTruncated(boolean z10) {
        this.stderrTruncated = z10;
    }

    public void setStdout(String str) {
        this.stdout = str;
    }

    public void setStdoutLength(long j10) {
        this.stdoutLength = j10;
    }

    public void setStdoutTruncated(boolean z10) {
        this.stdoutTruncated = z10;
    }

    public void setTimeout(boolean z10) {
        this.isTimeout = z10;
    }

    public String toString() {
        return "FileProcessResult{stderr='" + this.stderr + "', stdout='" + this.stdout + "', exitValue=" + this.exitValue + ", processTimeMillis=" + this.processTimeMillis + ", isTimeout=" + this.isTimeout + ", stdoutLength=" + this.stdoutLength + ", stderrLength=" + this.stderrLength + ", stderrTruncated=" + this.stderrTruncated + ", stdoutTruncated=" + this.stdoutTruncated + "}";
    }
}
