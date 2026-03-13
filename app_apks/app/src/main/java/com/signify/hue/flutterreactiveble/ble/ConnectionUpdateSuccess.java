package com.signify.hue.flutterreactiveble.ble;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdateSuccess;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdate;", "deviceId", "", "connectionState", "", "<init>", "(Ljava/lang/String;I)V", "getDeviceId", "()Ljava/lang/String;", "getConnectionState", "()I", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "toString", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConnectionUpdateSuccess extends ConnectionUpdate {
    private final int connectionState;
    private final String deviceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionUpdateSuccess(String deviceId, int i10) {
        super(null);
        AbstractC4862t.e(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.connectionState = i10;
    }

    public static /* synthetic */ ConnectionUpdateSuccess copy$default(ConnectionUpdateSuccess connectionUpdateSuccess, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = connectionUpdateSuccess.deviceId;
        }
        if ((i11 & 2) != 0) {
            i10 = connectionUpdateSuccess.connectionState;
        }
        return connectionUpdateSuccess.copy(str, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConnectionState() {
        return this.connectionState;
    }

    public final ConnectionUpdateSuccess copy(String deviceId, int connectionState) {
        AbstractC4862t.e(deviceId, "deviceId");
        return new ConnectionUpdateSuccess(deviceId, connectionState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionUpdateSuccess)) {
            return false;
        }
        ConnectionUpdateSuccess connectionUpdateSuccess = (ConnectionUpdateSuccess) other;
        return AbstractC4862t.a(this.deviceId, connectionUpdateSuccess.deviceId) && this.connectionState == connectionUpdateSuccess.connectionState;
    }

    public final int getConnectionState() {
        return this.connectionState;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + Integer.hashCode(this.connectionState);
    }

    public String toString() {
        return "ConnectionUpdateSuccess(deviceId=" + this.deviceId + ", connectionState=" + this.connectionState + ')';
    }
}
