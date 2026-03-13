package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class HostnameCache {
    private static volatile HostnameCache INSTANCE;
    private final long cacheDuration;
    private final ExecutorService executorService;
    private volatile long expirationTimestamp;
    private final Callable<InetAddress> getLocalhost;
    private volatile String hostname;
    private final AtomicBoolean updateRunning;
    private static final long HOSTNAME_CACHE_DURATION = TimeUnit.HOURS.toMillis(5);
    private static final long GET_HOSTNAME_TIMEOUT = TimeUnit.SECONDS.toMillis(1);
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class HostnameCacheThreadFactory implements ThreadFactory {
        private int cnt;

        private HostnameCacheThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i10 = this.cnt;
            this.cnt = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private HostnameCache() {
        this(HOSTNAME_CACHE_DURATION);
    }

    public static /* synthetic */ Void b(HostnameCache hostnameCache) {
        hostnameCache.getClass();
        try {
            hostnameCache.hostname = hostnameCache.getLocalhost.call().getCanonicalHostName();
            hostnameCache.expirationTimestamp = System.currentTimeMillis() + hostnameCache.cacheDuration;
            hostnameCache.updateRunning.set(false);
            return null;
        } catch (Throwable th) {
            hostnameCache.updateRunning.set(false);
            throw th;
        }
    }

    public static HostnameCache getInstance() {
        if (INSTANCE == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new HostnameCache();
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
        return INSTANCE;
    }

    private void handleCacheUpdateFailure() {
        this.expirationTimestamp = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void updateCache() {
        try {
            this.executorService.submit(new Callable() { // from class: io.sentry.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return HostnameCache.b(this.f38733a);
                }
            }).get(GET_HOSTNAME_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            handleCacheUpdateFailure();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            handleCacheUpdateFailure();
        }
    }

    public void close() {
        this.executorService.shutdown();
    }

    public String getHostname() {
        if (this.expirationTimestamp < System.currentTimeMillis() && this.updateRunning.compareAndSet(false, true)) {
            updateCache();
        }
        return this.hostname;
    }

    public boolean isClosed() {
        return this.executorService.isShutdown();
    }

    public HostnameCache(long j10) {
        this(j10, new Callable() { // from class: io.sentry.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    public HostnameCache(long j10, Callable<InetAddress> callable) {
        this.updateRunning = new AtomicBoolean(false);
        this.executorService = Executors.newSingleThreadExecutor(new HostnameCacheThreadFactory());
        this.cacheDuration = j10;
        this.getLocalhost = (Callable) Objects.requireNonNull(callable, "getLocalhost is required");
        updateCache();
    }
}
