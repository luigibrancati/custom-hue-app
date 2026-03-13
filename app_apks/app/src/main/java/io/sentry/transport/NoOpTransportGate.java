package io.sentry.transport;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransportGate implements ITransportGate {
    private static final NoOpTransportGate instance = new NoOpTransportGate();

    private NoOpTransportGate() {
    }

    public static NoOpTransportGate getInstance() {
        return instance;
    }

    @Override // io.sentry.transport.ITransportGate
    public boolean isConnected() {
        return true;
    }
}
