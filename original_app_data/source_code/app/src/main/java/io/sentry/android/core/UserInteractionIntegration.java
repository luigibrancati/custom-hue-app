package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2758n;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.gestures.NoOpWindowCallback;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.android.core.internal.gestures.SentryWindowCallback;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    private final Application application;
    private final boolean isAndroidXAvailable;
    private final boolean isAndroidxLifecycleAvailable;
    private SentryAndroidOptions options;
    private IScopes scopes;

    public UserInteractionIntegration(Application application, io.sentry.util.LoadClass loadClass) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
        this.isAndroidXAvailable = loadClass.isClassAvailable("androidx.core.view.GestureDetectorCompat", this.options);
        this.isAndroidxLifecycleAvailable = loadClass.isClassAvailable("androidx.lifecycle.Lifecycle", this.options);
    }

    private void startTracking(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.scopes == null || this.options == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new NoOpWindowCallback();
        }
        if (callback instanceof SentryWindowCallback) {
            return;
        }
        window.setCallback(new SentryWindowCallback(callback, activity, new SentryGestureListener(activity, this.scopes, this.options), this.options));
    }

    private void stopTracking(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof SentryWindowCallback) {
            SentryWindowCallback sentryWindowCallback = (SentryWindowCallback) callback;
            sentryWindowCallback.stopTracking();
            if (sentryWindowCallback.getDelegate() instanceof NoOpWindowCallback) {
                window.setCallback(null);
            } else {
                window.setCallback(sentryWindowCallback.getDelegate());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        stopTracking(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        startTracking(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        boolean z10 = this.options.isEnableUserInteractionBreadcrumbs() || this.options.isEnableUserInteractionTracing();
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            if (!this.isAndroidXAvailable) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.application.registerActivityLifecycleCallbacks(this);
            this.options.getLogger().log(sentryLevel, "UserInteractionIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("UserInteraction");
            if (this.isAndroidxLifecycleAvailable) {
                Activity activity = CurrentActivityHolder.getInstance().getActivity();
                if ((activity instanceof InterfaceC2758n) && ((InterfaceC2758n) activity).getLifecycle().b() == AbstractC2754j.b.RESUMED) {
                    startTracking(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
