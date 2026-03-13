package com.signify.hue.flutterreactiveble.ble;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/CharOperationFailed;", "Lcom/signify/hue/flutterreactiveble/ble/CharOperationResult;", "deviceId", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CharOperationFailed extends CharOperationResult {
    private final String deviceId;
    private final String errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharOperationFailed(String deviceId, String errorMessage) {
        super(null);
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(errorMessage, "errorMessage");
        this.deviceId = deviceId;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ CharOperationFailed copy$default(CharOperationFailed charOperationFailed, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = charOperationFailed.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = charOperationFailed.errorMessage;
        }
        return charOperationFailed.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final CharOperationFailed copy(String deviceId, String errorMessage) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(errorMessage, "errorMessage");
        return new CharOperationFailed(deviceId, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharOperationFailed)) {
            return false;
        }
        CharOperationFailed charOperationFailed = (CharOperationFailed) other;
        return AbstractC4862t.a(this.deviceId, charOperationFailed.deviceId) && AbstractC4862t.a(this.errorMessage, charOperationFailed.errorMessage);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "CharOperationFailed(deviceId=" + this.deviceId + ", errorMessage=" + this.errorMessage + ')';
    }
}
