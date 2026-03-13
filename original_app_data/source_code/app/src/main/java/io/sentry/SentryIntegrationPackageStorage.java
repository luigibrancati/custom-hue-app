package io.sentry;

import io.sentry.protocol.SentryPackage;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryIntegrationPackageStorage {
    private static volatile SentryIntegrationPackageStorage INSTANCE;
    private final Set<String> integrations = new CopyOnWriteArraySet();
    private final Set<SentryPackage> packages = new CopyOnWriteArraySet();
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();
    private static volatile Boolean mixedVersionsDetected = null;
    private static final AutoClosableReentrantLock mixedVersionsLock = new AutoClosableReentrantLock();

    private SentryIntegrationPackageStorage() {
    }

    public static SentryIntegrationPackageStorage getInstance() {
        if (INSTANCE == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new SentryIntegrationPackageStorage();
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

    public void addIntegration(String str) {
        Objects.requireNonNull(str, "integration is required.");
        this.integrations.add(str);
    }

    public void addPackage(String str, String str2) {
        Objects.requireNonNull(str, "name is required.");
        Objects.requireNonNull(str2, "version is required.");
        this.packages.add(new SentryPackage(str, str2));
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = mixedVersionsLock.acquire();
        try {
            mixedVersionsDetected = null;
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

    public boolean checkForMixedVersions(ILogger iLogger) {
        Boolean bool = mixedVersionsDetected;
        if (bool != null) {
            return bool.booleanValue();
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = mixedVersionsLock.acquire();
        try {
            boolean z10 = false;
            for (SentryPackage sentryPackage : this.packages) {
                if (sentryPackage.getName().startsWith("maven:io.sentry:") && !"8.32.0".equalsIgnoreCase(sentryPackage.getVersion())) {
                    iLogger.log(SentryLevel.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", sentryPackage.getName(), "8.32.0", sentryPackage.getVersion());
                    z10 = true;
                }
            }
            if (z10) {
                SentryLevel sentryLevel = SentryLevel.ERROR;
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            mixedVersionsDetected = Boolean.valueOf(z10);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return z10;
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

    public void clearStorage() {
        this.integrations.clear();
        this.packages.clear();
    }

    public Set<String> getIntegrations() {
        return this.integrations;
    }

    public Set<SentryPackage> getPackages() {
        return this.packages;
    }
}
