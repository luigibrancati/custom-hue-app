package com.signify.hue.flutterreactiveble.model;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/signify/hue/flutterreactiveble/model/ScanMode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "OPPORTUNISTIC", "LOW_POWER", "BALANCED", "LOW_LATENCY", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScanMode {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ ScanMode[] $VALUES;
    private final int code;
    public static final ScanMode OPPORTUNISTIC = new ScanMode("OPPORTUNISTIC", 0, -1);
    public static final ScanMode LOW_POWER = new ScanMode("LOW_POWER", 1, 0);
    public static final ScanMode BALANCED = new ScanMode("BALANCED", 2, 1);
    public static final ScanMode LOW_LATENCY = new ScanMode("LOW_LATENCY", 3, 2);

    private static final /* synthetic */ ScanMode[] $values() {
        return new ScanMode[]{OPPORTUNISTIC, LOW_POWER, BALANCED, LOW_LATENCY};
    }

    static {
        ScanMode[] scanModeArr$values = $values();
        $VALUES = scanModeArr$values;
        $ENTRIES = AbstractC5277b.a(scanModeArr$values);
    }

    private ScanMode(String str, int i10, int i11) {
        this.code = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static ScanMode valueOf(String str) {
        return (ScanMode) Enum.valueOf(ScanMode.class, str);
    }

    public static ScanMode[] values() {
        return (ScanMode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
