package io.sentry;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IConnectionStatusProvider extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ConnectionStatus {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IConnectionStatusObserver {
        void onConnectionStatusChanged(ConnectionStatus connectionStatus);
    }

    boolean addConnectionStatusObserver(IConnectionStatusObserver iConnectionStatusObserver);

    ConnectionStatus getConnectionStatus();

    String getConnectionType();

    void removeConnectionStatusObserver(IConnectionStatusObserver iConnectionStatusObserver);
}
