package io.sentry;

import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.SentryTransaction;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class SentryRuntimeEventProcessor implements EventProcessor {
    private final String javaVendor;
    private final String javaVersion;

    public SentryRuntimeEventProcessor(String str, String str2) {
        this.javaVersion = str;
        this.javaVendor = str2;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 2000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        return (SentryEvent) process(sentryEvent);
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return (SentryTransaction) process(sentryTransaction);
    }

    private <T extends SentryBaseEvent> T process(T t10) {
        if (t10.getContexts().getRuntime() == null) {
            t10.getContexts().setRuntime(new SentryRuntime());
        }
        SentryRuntime runtime = t10.getContexts().getRuntime();
        if (runtime != null && runtime.getName() == null && runtime.getVersion() == null) {
            runtime.setName(this.javaVendor);
            runtime.setVersion(this.javaVersion);
        }
        return t10;
    }

    public SentryRuntimeEventProcessor() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
