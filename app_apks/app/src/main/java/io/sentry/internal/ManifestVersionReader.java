package io.sentry.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.BuildConfig;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ManifestVersionReader {
    private static volatile ManifestVersionReader INSTANCE;
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();
    private volatile boolean hasManifestBeenRead = false;
    private final VersionInfoHolder versionInfo = new VersionInfoHolder();
    private AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class VersionInfoHolder {
        private volatile String sdkName;
        private volatile String sdkVersion;

        public String getSdkName() {
            return this.sdkName;
        }

        public String getSdkVersion() {
            return this.sdkVersion;
        }
    }

    private ManifestVersionReader() {
    }

    public static ManifestVersionReader getInstance() {
        if (INSTANCE == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new ManifestVersionReader();
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

    public void readManifestFiles() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire;
        if (this.hasManifestBeenRead) {
            return;
        }
        try {
            iSentryLifecycleTokenAcquire = this.lock.acquire();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.hasManifestBeenRead = true;
            throw th;
        }
        try {
            if (this.hasManifestBeenRead) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                this.hasManifestBeenRead = true;
                return;
            }
            Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                try {
                    Attributes mainAttributes = new Manifest(FirebasePerfUrlConnection.openStream(resources.nextElement())).getMainAttributes();
                    if (mainAttributes != null) {
                        String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                        String value2 = mainAttributes.getValue("Implementation-Version");
                        String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                        String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                        if (value != null && value2 != null) {
                            this.versionInfo.sdkName = value;
                            this.versionInfo.sdkVersion = value2;
                            String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                            if (value5 != null) {
                                SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                SentryIntegrationPackageStorage.getInstance().addIntegration("OpenTelemetry");
                            }
                            String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                            if (value6 != null) {
                                SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                SentryIntegrationPackageStorage.getInstance().addIntegration("OpenTelemetry-Agent");
                            }
                            if (value.equals("sentry.java.opentelemetry.agentless")) {
                                SentryIntegrationPackageStorage.getInstance().addIntegration("OpenTelemetry-Agentless");
                            }
                            if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                SentryIntegrationPackageStorage.getInstance().addIntegration("OpenTelemetry-Agentless-Spring");
                            }
                        }
                        if (value3 != null && value2 != null && value4 != null && value3.startsWith(BuildConfig.SENTRY_JAVA_SDK_NAME)) {
                            SentryIntegrationPackageStorage.getInstance().addPackage(value4, value2);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            this.hasManifestBeenRead = true;
            this.hasManifestBeenRead = true;
        } finally {
        }
    }

    public VersionInfoHolder readOpenTelemetryVersion() {
        readManifestFiles();
        if (this.versionInfo.sdkVersion == null) {
            return null;
        }
        return this.versionInfo;
    }
}
