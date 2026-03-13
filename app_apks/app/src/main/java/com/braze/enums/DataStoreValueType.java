package com.braze.enums;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/braze/enums/DataStoreValueType;", "", "<init>", "(Ljava/lang/String;I)V", "STRING", "LONG", "INT", "DOUBLE", "FLOAT", "BOOLEAN", "MAP", "LIST", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStoreValueType {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ DataStoreValueType[] $VALUES;
    public static final DataStoreValueType STRING = new DataStoreValueType("STRING", 0);
    public static final DataStoreValueType LONG = new DataStoreValueType("LONG", 1);
    public static final DataStoreValueType INT = new DataStoreValueType("INT", 2);
    public static final DataStoreValueType DOUBLE = new DataStoreValueType("DOUBLE", 3);
    public static final DataStoreValueType FLOAT = new DataStoreValueType("FLOAT", 4);
    public static final DataStoreValueType BOOLEAN = new DataStoreValueType("BOOLEAN", 5);
    public static final DataStoreValueType MAP = new DataStoreValueType("MAP", 6);
    public static final DataStoreValueType LIST = new DataStoreValueType("LIST", 7);

    private static final /* synthetic */ DataStoreValueType[] $values() {
        return new DataStoreValueType[]{STRING, LONG, INT, DOUBLE, FLOAT, BOOLEAN, MAP, LIST};
    }

    static {
        DataStoreValueType[] dataStoreValueTypeArr$values = $values();
        $VALUES = dataStoreValueTypeArr$values;
        $ENTRIES = AbstractC5277b.a(dataStoreValueTypeArr$values);
    }

    private DataStoreValueType(String str, int i10) {
    }

    public static DataStoreValueType valueOf(String str) {
        return (DataStoreValueType) Enum.valueOf(DataStoreValueType.class, str);
    }

    public static DataStoreValueType[] values() {
        return (DataStoreValueType[]) $VALUES.clone();
    }
}
