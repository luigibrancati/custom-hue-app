package io.sentry.ndk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NdkOptions {
    private final String dist;
    private final String dsn;
    private final String environment;
    private final boolean isDebug;
    private final int maxBreadcrumbs;
    private final String outboxPath;
    private final String release;
    private final String sdkName;
    private NdkHandlerStrategy ndkHandlerStrategy = NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private float tracesSampleRate = 0.0f;

    public NdkOptions(String str, boolean z10, String str2, String str3, String str4, String str5, int i10, String str6) {
        this.dsn = str;
        this.isDebug = z10;
        this.outboxPath = str2;
        this.release = str3;
        this.environment = str4;
        this.dist = str5;
        this.maxBreadcrumbs = i10;
        this.sdkName = str6;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public String getOutboxPath() {
        return this.outboxPath;
    }

    public String getRelease() {
        return this.release;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public float getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setNdkHandlerStrategy(NdkHandlerStrategy ndkHandlerStrategy) {
        this.ndkHandlerStrategy = ndkHandlerStrategy;
    }

    public void setTracesSampleRate(float f10) {
        this.tracesSampleRate = f10;
    }
}
