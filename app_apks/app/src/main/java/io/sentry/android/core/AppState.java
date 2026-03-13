package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.NoOpLogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AppState implements Closeable {
    private static AppState instance = new AppState();
    private volatile LifecycleObserver lifecycleObserver;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private MainLooperHandler handler = new MainLooperHandler();
    private volatile Boolean inBackground = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AppStateListener {
        void onBackground();

        void onForeground();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class LifecycleObserver implements DefaultLifecycleObserver {
        final List<AppStateListener> listeners = new CopyOnWriteArrayList<AppStateListener>() { // from class: io.sentry.android.core.AppState.LifecycleObserver.1
            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public boolean add(AppStateListener appStateListener) {
                boolean zAdd = super.add(appStateListener);
                if (Boolean.FALSE.equals(AppState.this.inBackground)) {
                    appStateListener.onForeground();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(AppState.this.inBackground)) {
                    appStateListener.onBackground();
                }
                return zAdd;
            }
        };

        public LifecycleObserver() {
        }

        public List<AppStateListener> getListeners() {
            return this.listeners;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC2758n interfaceC2758n) {
            AppState.this.setInBackground(false);
            Iterator<AppStateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onForeground();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC2758n interfaceC2758n) {
            AppState.this.setInBackground(true);
            Iterator<AppStateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onBackground();
            }
        }
    }

    private AppState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObserverInternal(ILogger iLogger) {
        LifecycleObserver lifecycleObserver = this.lifecycleObserver;
        if (lifecycleObserver != null) {
            try {
                ProcessLifecycleOwner.k().getLifecycle().a(lifecycleObserver);
            } catch (Throwable th) {
                this.lifecycleObserver = null;
                iLogger.log(SentryLevel.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    private void ensureLifecycleObserver(final ILogger iLogger) {
        if (this.lifecycleObserver != null) {
            return;
        }
        try {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
            this.lifecycleObserver = new LifecycleObserver();
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                addObserverInternal(iLogger);
            } else {
                this.handler.post(new Runnable() { // from class: io.sentry.android.core.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38480a.addObserverInternal(iLogger);
                    }
                });
            }
        } catch (ClassNotFoundException unused) {
            iLogger.log(SentryLevel.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public static AppState getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeObserverInternal(LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver != null) {
            ProcessLifecycleOwner.k().getLifecycle().c(lifecycleObserver);
        }
    }

    public void addAppStateListener(AppStateListener appStateListener) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ensureLifecycleObserver(NoOpLogger.getInstance());
            if (this.lifecycleObserver != null) {
                this.lifecycleObserver.listeners.add(appStateListener);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        unregisterLifecycleObserver();
    }

    public LifecycleObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    public Boolean isInBackground() {
        return this.inBackground;
    }

    public void registerLifecycleObserver(SentryOptions sentryOptions) {
        if (this.lifecycleObserver != null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ensureLifecycleObserver(sentryOptions != null ? sentryOptions.getLogger() : NoOpLogger.getInstance());
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void removeAppStateListener(AppStateListener appStateListener) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.lifecycleObserver != null) {
                this.lifecycleObserver.listeners.remove(appStateListener);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void resetInstance() {
        instance = new AppState();
    }

    public void setHandler(MainLooperHandler mainLooperHandler) {
        this.handler = mainLooperHandler;
    }

    public void setInBackground(boolean z10) {
        this.inBackground = Boolean.valueOf(z10);
    }

    public void unregisterLifecycleObserver() {
        if (this.lifecycleObserver == null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            final LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            this.lifecycleObserver.listeners.clear();
            this.lifecycleObserver = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                removeObserverInternal(lifecycleObserver);
            } else {
                this.handler.post(new Runnable() { // from class: io.sentry.android.core.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38482a.removeObserverInternal(lifecycleObserver);
                    }
                });
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
