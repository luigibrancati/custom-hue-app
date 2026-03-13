package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryDateProvider;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.internal.util.AndroidConnectionStatusProvider;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    volatile NetworkBreadcrumbsNetworkCallback networkCallback;
    private SentryOptions options;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class NetworkBreadcrumbConnectionDetail {
        final int downBandwidth;
        final boolean isVpn;
        final int signalStrength;
        private long timestampNanos;
        final String type;
        final int upBandwidth;

        @SuppressLint({"NewApi"})
        public NetworkBreadcrumbConnectionDetail(NetworkCapabilities networkCapabilities, BuildInfoProvider buildInfoProvider, long j10) {
            Objects.requireNonNull(networkCapabilities, "NetworkCapabilities is required");
            Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
            this.downBandwidth = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.upBandwidth = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = buildInfoProvider.getSdkInfoVersion() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.signalStrength = signalStrength > -100 ? signalStrength : 0;
            this.isVpn = networkCapabilities.hasTransport(4);
            String connectionType = AndroidConnectionStatusProvider.getConnectionType(networkCapabilities);
            this.type = connectionType == null ? "" : connectionType;
            this.timestampNanos = j10;
        }

        public boolean isSimilar(NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail) {
            int iAbs = Math.abs(this.signalStrength - networkBreadcrumbConnectionDetail.signalStrength);
            int iAbs2 = Math.abs(this.downBandwidth - networkBreadcrumbConnectionDetail.downBandwidth);
            int iAbs3 = Math.abs(this.upBandwidth - networkBreadcrumbConnectionDetail.upBandwidth);
            boolean z10 = DateUtils.nanosToMillis((double) Math.abs(this.timestampNanos - networkBreadcrumbConnectionDetail.timestampNanos)) < 5000.0d;
            return this.isVpn == networkBreadcrumbConnectionDetail.isVpn && this.type.equals(networkBreadcrumbConnectionDetail.type) && (z10 || iAbs <= 5) && (z10 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.downBandwidth)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.downBandwidth)) * 0.1d) ? 0 : -1)) <= 0) && (z10 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.upBandwidth)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.upBandwidth)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NetworkBreadcrumbsNetworkCallback extends ConnectivityManager.NetworkCallback {
        final BuildInfoProvider buildInfoProvider;
        final SentryDateProvider dateProvider;
        NetworkCapabilities lastCapabilities = null;
        long lastCapabilityNanos = 0;
        final IScopes scopes;

        public NetworkBreadcrumbsNetworkCallback(IScopes iScopes, BuildInfoProvider buildInfoProvider, SentryDateProvider sentryDateProvider) {
            this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
            this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
            this.dateProvider = (SentryDateProvider) Objects.requireNonNull(sentryDateProvider, "SentryDateProvider is required");
        }

        private Breadcrumb createBreadcrumb(String str) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType("system");
            breadcrumb.setCategory("network.event");
            breadcrumb.setData("action", str);
            breadcrumb.setLevel(SentryLevel.INFO);
            return breadcrumb;
        }

        private NetworkBreadcrumbConnectionDetail getNewConnectionDetails(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j10, long j11) {
            if (networkCapabilities == null) {
                return new NetworkBreadcrumbConnectionDetail(networkCapabilities2, this.buildInfoProvider, j11);
            }
            NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail = new NetworkBreadcrumbConnectionDetail(networkCapabilities, this.buildInfoProvider, j10);
            NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail2 = new NetworkBreadcrumbConnectionDetail(networkCapabilities2, this.buildInfoProvider, j11);
            if (networkBreadcrumbConnectionDetail.isSimilar(networkBreadcrumbConnectionDetail2)) {
                return null;
            }
            return networkBreadcrumbConnectionDetail2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.scopes.addBreadcrumb(createBreadcrumb("NETWORK_AVAILABLE"));
            this.lastCapabilities = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            long jNanoTimestamp = this.dateProvider.now().nanoTimestamp();
            NetworkBreadcrumbConnectionDetail newConnectionDetails = getNewConnectionDetails(this.lastCapabilities, networkCapabilities, this.lastCapabilityNanos, jNanoTimestamp);
            if (newConnectionDetails == null) {
                return;
            }
            this.lastCapabilities = networkCapabilities;
            this.lastCapabilityNanos = jNanoTimestamp;
            Breadcrumb breadcrumbCreateBreadcrumb = createBreadcrumb("NETWORK_CAPABILITIES_CHANGED");
            breadcrumbCreateBreadcrumb.setData("download_bandwidth", Integer.valueOf(newConnectionDetails.downBandwidth));
            breadcrumbCreateBreadcrumb.setData("upload_bandwidth", Integer.valueOf(newConnectionDetails.upBandwidth));
            breadcrumbCreateBreadcrumb.setData("vpn_active", Boolean.valueOf(newConnectionDetails.isVpn));
            breadcrumbCreateBreadcrumb.setData("network_type", newConnectionDetails.type);
            int i10 = newConnectionDetails.signalStrength;
            if (i10 != 0) {
                breadcrumbCreateBreadcrumb.setData("signal_strength", Integer.valueOf(i10));
            }
            Hint hint = new Hint();
            hint.set(TypeCheckHint.ANDROID_NETWORK_CAPABILITIES, newConnectionDetails);
            this.scopes.addBreadcrumb(breadcrumbCreateBreadcrumb, hint);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.scopes.addBreadcrumb(createBreadcrumb("NETWORK_LOST"));
            this.lastCapabilities = null;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, BuildInfoProvider buildInfoProvider) {
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "Context is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            NetworkBreadcrumbsNetworkCallback networkBreadcrumbsNetworkCallback = this.networkCallback;
            this.networkCallback = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (networkBreadcrumbsNetworkCallback != null) {
                AndroidConnectionStatusProvider.removeNetworkCallback(networkBreadcrumbsNetworkCallback);
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

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryOptions;
        ILogger logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.buildInfoProvider.getSdkInfoVersion() < 24) {
                sentryOptions.getLogger().log(sentryLevel, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                this.networkCallback = new NetworkBreadcrumbsNetworkCallback(iScopes, this.buildInfoProvider, sentryOptions.getDateProvider());
                if (AndroidConnectionStatusProvider.addNetworkCallback(this.context, sentryOptions.getLogger(), this.buildInfoProvider, this.networkCallback)) {
                    sentryOptions.getLogger().log(sentryLevel, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    IntegrationUtils.addIntegrationToSdkVersion("NetworkBreadcrumbs");
                } else {
                    sentryOptions.getLogger().log(sentryLevel, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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
    }
}
