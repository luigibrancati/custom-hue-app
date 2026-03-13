package io.sentry.android.ndk;

import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IScope;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.ndk.INativeScope;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NdkScopeObserver extends ScopeObserverAdapter {
    private final INativeScope nativeScope;
    private final SentryOptions options;

    public NdkScopeObserver(SentryOptions sentryOptions) {
        this(sentryOptions, new NativeScope());
    }

    public static /* synthetic */ void a(NdkScopeObserver ndkScopeObserver, User user) {
        if (user == null) {
            ndkScopeObserver.nativeScope.removeUser();
        } else {
            ndkScopeObserver.nativeScope.setUser(user.getId(), user.getEmail(), user.getIpAddress(), user.getUsername());
        }
    }

    public static /* synthetic */ void d(NdkScopeObserver ndkScopeObserver, Breadcrumb breadcrumb) {
        ndkScopeObserver.getClass();
        String strSerialize = null;
        String lowerCase = breadcrumb.getLevel() != null ? breadcrumb.getLevel().name().toLowerCase(Locale.ROOT) : null;
        String timestamp = DateUtils.getTimestamp(breadcrumb.getTimestamp());
        try {
            Map<String, Object> data = breadcrumb.getData();
            if (!data.isEmpty()) {
                strSerialize = ndkScopeObserver.options.getSerializer().serialize(data);
            }
        } catch (Throwable th) {
            ndkScopeObserver.options.getLogger().log(SentryLevel.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
        }
        ndkScopeObserver.nativeScope.addBreadcrumb(lowerCase, breadcrumb.getMessage(), breadcrumb.getCategory(), breadcrumb.getType(), timestamp, strSerialize);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addBreadcrumb(final Breadcrumb breadcrumb) {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    NdkScopeObserver.d(this.f38628a, breadcrumb);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void removeExtra(final String str) {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38638a.nativeScope.removeExtra(str);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void removeTag(final String str) {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38633a.nativeScope.removeTag(str);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setExtra(final String str, final String str2) {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38630a.nativeScope.setExtra(str, str2);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTag(final String str, final String str2) {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38635a.nativeScope.setTag(str, str2);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTrace(final SpanContext spanContext, IScope iScope) {
        if (spanContext == null) {
            return;
        }
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.a
                @Override // java.lang.Runnable
                public final void run() {
                    NdkScopeObserver ndkScopeObserver = this.f38626a;
                    SpanContext spanContext2 = spanContext;
                    ndkScopeObserver.nativeScope.setTrace(spanContext2.getTraceId().toString(), spanContext2.getSpanId().toString());
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setUser(final User user) {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.g
                @Override // java.lang.Runnable
                public final void run() {
                    NdkScopeObserver.a(this.f38640a, user);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    public NdkScopeObserver(SentryOptions sentryOptions, INativeScope iNativeScope) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions object is required.");
        this.nativeScope = (INativeScope) Objects.requireNonNull(iNativeScope, "The NativeScope object is required.");
    }
}
