package com.signify.hue.flutterreactiveble.ble;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/EstablishedConnection;", "Lcom/signify/hue/flutterreactiveble/ble/EstablishConnectionResult;", "", "deviceId", "Lka/N;", "rxConnection", "<init>", "(Ljava/lang/String;Lka/N;)V", "component1", "()Ljava/lang/String;", "component2", "()Lka/N;", "copy", "(Ljava/lang/String;Lka/N;)Lcom/signify/hue/flutterreactiveble/ble/EstablishedConnection;", "toString", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "Lka/N;", "getRxConnection", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EstablishedConnection extends EstablishConnectionResult {
    private final String deviceId;
    private final ka.N rxConnection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EstablishedConnection(String deviceId, ka.N rxConnection) {
        super(null);
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(rxConnection, "rxConnection");
        this.deviceId = deviceId;
        this.rxConnection = rxConnection;
    }

    public static /* synthetic */ EstablishedConnection copy$default(EstablishedConnection establishedConnection, String str, ka.N n10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = establishedConnection.deviceId;
        }
        if ((i10 & 2) != 0) {
            n10 = establishedConnection.rxConnection;
        }
        return establishedConnection.copy(str, n10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ka.N getRxConnection() {
        return this.rxConnection;
    }

    public final EstablishedConnection copy(String deviceId, ka.N rxConnection) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(rxConnection, "rxConnection");
        return new EstablishedConnection(deviceId, rxConnection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EstablishedConnection)) {
            return false;
        }
        EstablishedConnection establishedConnection = (EstablishedConnection) other;
        return AbstractC4862t.a(this.deviceId, establishedConnection.deviceId) && AbstractC4862t.a(this.rxConnection, establishedConnection.rxConnection);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final ka.N getRxConnection() {
        return this.rxConnection;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.rxConnection.hashCode();
    }

    public String toString() {
        return "EstablishedConnection(deviceId=" + this.deviceId + ", rxConnection=" + this.rxConnection + ')';
    }
}
