package com.signify.hue.flutterreactiveble.ble;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/BleStatus;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "UNKNOWN", "UNSUPPORTED", "UNAUTHORIZED", "POWERED_OFF", "LOCATION_SERVICES_DISABLED", "READY", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BleStatus {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ BleStatus[] $VALUES;
    private final int code;
    public static final BleStatus UNKNOWN = new BleStatus("UNKNOWN", 0, 0);
    public static final BleStatus UNSUPPORTED = new BleStatus("UNSUPPORTED", 1, 1);
    public static final BleStatus UNAUTHORIZED = new BleStatus("UNAUTHORIZED", 2, 2);
    public static final BleStatus POWERED_OFF = new BleStatus("POWERED_OFF", 3, 3);
    public static final BleStatus LOCATION_SERVICES_DISABLED = new BleStatus("LOCATION_SERVICES_DISABLED", 4, 4);
    public static final BleStatus READY = new BleStatus("READY", 5, 5);

    private static final /* synthetic */ BleStatus[] $values() {
        return new BleStatus[]{UNKNOWN, UNSUPPORTED, UNAUTHORIZED, POWERED_OFF, LOCATION_SERVICES_DISABLED, READY};
    }

    static {
        BleStatus[] bleStatusArr$values = $values();
        $VALUES = bleStatusArr$values;
        $ENTRIES = AbstractC5277b.a(bleStatusArr$values);
    }

    private BleStatus(String str, int i10, int i11) {
        this.code = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static BleStatus valueOf(String str) {
        return (BleStatus) Enum.valueOf(BleStatus.class, str);
    }

    public static BleStatus[] values() {
        return (BleStatus[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
