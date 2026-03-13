package com.signify.hue.flutterreactiveble.ble;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/RequestConnectionPrioritySuccess;", "Lcom/signify/hue/flutterreactiveble/ble/RequestConnectionPriorityResult;", "deviceId", "", "<init>", "(Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequestConnectionPrioritySuccess extends RequestConnectionPriorityResult {
    private final String deviceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestConnectionPrioritySuccess(String deviceId) {
        super(null);
        AbstractC4862t.e(deviceId, "deviceId");
        this.deviceId = deviceId;
    }

    public static /* synthetic */ RequestConnectionPrioritySuccess copy$default(RequestConnectionPrioritySuccess requestConnectionPrioritySuccess, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = requestConnectionPrioritySuccess.deviceId;
        }
        return requestConnectionPrioritySuccess.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final RequestConnectionPrioritySuccess copy(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        return new RequestConnectionPrioritySuccess(deviceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestConnectionPrioritySuccess) && AbstractC4862t.a(this.deviceId, ((RequestConnectionPrioritySuccess) other).deviceId);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return this.deviceId.hashCode();
    }

    public String toString() {
        return "RequestConnectionPrioritySuccess(deviceId=" + this.deviceId + ')';
    }
}
