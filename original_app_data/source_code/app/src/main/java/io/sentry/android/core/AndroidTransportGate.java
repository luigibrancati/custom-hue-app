package io.sentry.android.core;

import io.sentry.IConnectionStatusProvider;
import io.sentry.SentryOptions;
import io.sentry.transport.ITransportGate;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class AndroidTransportGate implements ITransportGate {
    private final SentryOptions options;

    /* JADX INFO: renamed from: io.sentry.android.core.AndroidTransportGate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus;

        static {
            int[] iArr = new int[IConnectionStatusProvider.ConnectionStatus.values().length];
            $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus = iArr;
            try {
                iArr[IConnectionStatusProvider.ConnectionStatus.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[IConnectionStatusProvider.ConnectionStatus.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AndroidTransportGate(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.transport.ITransportGate
    public boolean isConnected() {
        return isConnected(this.options.getConnectionStatusProvider().getConnectionStatus());
    }

    public boolean isConnected(IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        int i10 = AnonymousClass1.$SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[connectionStatus.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
