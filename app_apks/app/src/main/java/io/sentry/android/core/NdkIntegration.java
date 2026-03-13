package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NdkIntegration implements Integration, Closeable {
    public static final String SENTRY_NDK_CLASS_NAME = "io.sentry.android.ndk.SentryNdk";
    private SentryAndroidOptions options;
    private final Class<?> sentryNdkClass;

    public NdkIntegration(Class<?> cls) {
        this.sentryNdkClass = cls;
    }

    private void disableNdkIntegration(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.sentryNdkClass;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.options.getLogger().log(SentryLevel.DEBUG, "NdkIntegration removed.", new Object[0]);
                        disableNdkIntegration(this.options);
                    } catch (Throwable th) {
                        this.options.getLogger().log(SentryLevel.ERROR, "Failed to close SentryNdk.", th);
                        disableNdkIntegration(this.options);
                    }
                } catch (NoSuchMethodException e10) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                    disableNdkIntegration(this.options);
                }
            }
        } catch (Throwable th2) {
            disableNdkIntegration(this.options);
            throw th2;
        }
    }

    public Class<?> getSentryNdkClass() {
        return this.sentryNdkClass;
    }

    @Override // io.sentry.Integration
    public final void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.sentryNdkClass == null) {
            disableNdkIntegration(this.options);
            return;
        }
        if (this.options.getCacheDirPath() == null) {
            this.options.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            disableNdkIntegration(this.options);
            return;
        }
        try {
            this.sentryNdkClass.getMethod(Session.JsonKeys.INIT, SentryAndroidOptions.class).invoke(null, this.options);
            this.options.getLogger().log(sentryLevel, "NdkIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("Ndk");
        } catch (NoSuchMethodException e10) {
            disableNdkIntegration(this.options);
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th) {
            disableNdkIntegration(this.options);
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
