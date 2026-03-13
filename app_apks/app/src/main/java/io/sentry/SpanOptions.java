package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SpanOptions {
    private SentryDate startTimestamp = null;
    private ScopeBindingMode scopeBindingMode = ScopeBindingMode.AUTO;
    private boolean trimStart = false;
    private boolean trimEnd = false;
    private boolean isIdle = false;
    protected String origin = SpanContext.DEFAULT_ORIGIN;

    public String getOrigin() {
        return this.origin;
    }

    public ScopeBindingMode getScopeBindingMode() {
        return this.scopeBindingMode;
    }

    public SentryDate getStartTimestamp() {
        return this.startTimestamp;
    }

    public boolean isIdle() {
        return this.isIdle;
    }

    public boolean isTrimEnd() {
        return this.trimEnd;
    }

    public boolean isTrimStart() {
        return this.trimStart;
    }

    public void setIdle(boolean z10) {
        this.isIdle = z10;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setScopeBindingMode(ScopeBindingMode scopeBindingMode) {
        this.scopeBindingMode = scopeBindingMode;
    }

    public void setStartTimestamp(SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    public void setTrimEnd(boolean z10) {
        this.trimEnd = z10;
    }

    public void setTrimStart(boolean z10) {
        this.trimStart = z10;
    }
}
