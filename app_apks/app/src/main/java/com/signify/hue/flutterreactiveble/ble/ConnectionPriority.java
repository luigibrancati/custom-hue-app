package com.signify.hue.flutterreactiveble.ble;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/ConnectionPriority;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "BALANCED", "HIGH_PERFORMACE", "LOW_POWER", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectionPriority {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ ConnectionPriority[] $VALUES;
    public static final ConnectionPriority BALANCED = new ConnectionPriority("BALANCED", 0, 0);
    public static final ConnectionPriority HIGH_PERFORMACE = new ConnectionPriority("HIGH_PERFORMACE", 1, 1);
    public static final ConnectionPriority LOW_POWER = new ConnectionPriority("LOW_POWER", 2, 2);
    private final int code;

    private static final /* synthetic */ ConnectionPriority[] $values() {
        return new ConnectionPriority[]{BALANCED, HIGH_PERFORMACE, LOW_POWER};
    }

    static {
        ConnectionPriority[] connectionPriorityArr$values = $values();
        $VALUES = connectionPriorityArr$values;
        $ENTRIES = AbstractC5277b.a(connectionPriorityArr$values);
    }

    private ConnectionPriority(String str, int i10, int i11) {
        this.code = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static ConnectionPriority valueOf(String str) {
        return (ConnectionPriority) Enum.valueOf(ConnectionPriority.class, str);
    }

    public static ConnectionPriority[] values() {
        return (ConnectionPriority[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
