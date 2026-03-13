package io.sentry;

import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {
    private final Runtime runtime;
    private Thread thread;

    public ShutdownHookIntegration(Runtime runtime) {
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "Runtime is required");
    }

    public static /* synthetic */ void a(ShutdownHookIntegration shutdownHookIntegration, SentryOptions sentryOptions) {
        shutdownHookIntegration.runtime.addShutdownHook(shutdownHookIntegration.thread);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("ShutdownHook");
    }

    private void handleShutdownInProgress(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.thread != null) {
            handleShutdownInProgress(new Runnable() { // from class: io.sentry.P0
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f38448a;
                    shutdownHookIntegration.runtime.removeShutdownHook(shutdownHookIntegration.thread);
                }
            });
        }
    }

    public Thread getHook() {
        return this.thread;
    }

    @Override // io.sentry.Integration
    public void register(final IScopes iScopes, final SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.thread = new Thread(new Runnable() { // from class: io.sentry.N0
                @Override // java.lang.Runnable
                public final void run() {
                    iScopes.flush(sentryOptions.getFlushTimeoutMillis());
                }
            }, "sentry-shutdownhook");
            handleShutdownInProgress(new Runnable() { // from class: io.sentry.O0
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.a(this.f38445a, sentryOptions);
                }
            });
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
