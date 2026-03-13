package io.sentry.android.core;

import io.sentry.ISentryClient;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AppState;
import io.sentry.logger.LoggerBatchProcessor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLoggerBatchProcessor extends LoggerBatchProcessor implements AppState.AppStateListener {
    public AndroidLoggerBatchProcessor(SentryOptions sentryOptions, ISentryClient iSentryClient) {
        super(sentryOptions, iSentryClient);
        AppState.getInstance().addAppStateListener(this);
    }

    @Override // io.sentry.logger.LoggerBatchProcessor, io.sentry.logger.ILoggerBatchProcessor
    public void close(boolean z10) {
        AppState.getInstance().removeAppStateListener(this);
        super.close(z10);
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.AndroidLoggerBatchProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    AndroidLoggerBatchProcessor.this.flush(5000L);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
    }
}
