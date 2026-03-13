package com.signify.hue.flutterreactiveble.model;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/signify/hue/flutterreactiveble/model/ScanErrorType;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "UNKNOWN", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScanErrorType {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ ScanErrorType[] $VALUES;
    public static final ScanErrorType UNKNOWN = new ScanErrorType("UNKNOWN", 0, 0);
    private final int code;

    private static final /* synthetic */ ScanErrorType[] $values() {
        return new ScanErrorType[]{UNKNOWN};
    }

    static {
        ScanErrorType[] scanErrorTypeArr$values = $values();
        $VALUES = scanErrorTypeArr$values;
        $ENTRIES = AbstractC5277b.a(scanErrorTypeArr$values);
    }

    private ScanErrorType(String str, int i10, int i11) {
        this.code = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static ScanErrorType valueOf(String str) {
        return (ScanErrorType) Enum.valueOf(ScanErrorType.class, str);
    }

    public static ScanErrorType[] values() {
        return (ScanErrorType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
