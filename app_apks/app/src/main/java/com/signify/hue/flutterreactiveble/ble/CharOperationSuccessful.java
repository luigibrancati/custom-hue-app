package com.signify.hue.flutterreactiveble.ble;

import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/CharOperationSuccessful;", "Lcom/signify/hue/flutterreactiveble/ble/CharOperationResult;", "deviceId", "", "value", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "getValue", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CharOperationSuccessful extends CharOperationResult {
    private final String deviceId;
    private final List<Byte> value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharOperationSuccessful(String deviceId, List<Byte> value) {
        super(null);
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(value, "value");
        this.deviceId = deviceId;
        this.value = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharOperationSuccessful copy$default(CharOperationSuccessful charOperationSuccessful, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = charOperationSuccessful.deviceId;
        }
        if ((i10 & 2) != 0) {
            list = charOperationSuccessful.value;
        }
        return charOperationSuccessful.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final List<Byte> component2() {
        return this.value;
    }

    public final CharOperationSuccessful copy(String deviceId, List<Byte> value) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(value, "value");
        return new CharOperationSuccessful(deviceId, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharOperationSuccessful)) {
            return false;
        }
        CharOperationSuccessful charOperationSuccessful = (CharOperationSuccessful) other;
        return AbstractC4862t.a(this.deviceId, charOperationSuccessful.deviceId) && AbstractC4862t.a(this.value, charOperationSuccessful.value);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final List<Byte> getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "CharOperationSuccessful(deviceId=" + this.deviceId + ", value=" + this.value + ')';
    }
}
