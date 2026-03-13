package io.sentry;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryWrapper {
    public static /* synthetic */ void a(IScopes iScopes, Runnable runnable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            runnable.run();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ Object b(IScopes iScopes, Supplier supplier) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            Object obj = supplier.get();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return obj;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ Object c(IScopes iScopes, Callable callable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            Object objCall = callable.call();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return objCall;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static <U> Callable<U> wrapCallable(final Callable<U> callable) {
        final IScopes iScopesForkedScopes = Sentry.getCurrentScopes().forkedScopes("SentryWrapper.wrapCallable");
        return new Callable() { // from class: io.sentry.K0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryWrapper.c(iScopesForkedScopes, callable);
            }
        };
    }

    public static Runnable wrapRunnable(final Runnable runnable) {
        final IScopes iScopesForkedScopes = Sentry.forkedScopes("SentryWrapper.wrapRunnable");
        return new Runnable() { // from class: io.sentry.M0
            @Override // java.lang.Runnable
            public final void run() {
                SentryWrapper.a(iScopesForkedScopes, runnable);
            }
        };
    }

    public static <U> Supplier<U> wrapSupplier(final Supplier<U> supplier) {
        final IScopes iScopesForkedScopes = Sentry.forkedScopes("SentryWrapper.wrapSupplier");
        return new Supplier() { // from class: io.sentry.L0
            @Override // java.util.function.Supplier
            public final Object get() {
                return SentryWrapper.b(iScopesForkedScopes, supplier);
            }
        };
    }
}
