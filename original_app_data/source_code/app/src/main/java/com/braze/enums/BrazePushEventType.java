package com.braze.enums;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/braze/enums/BrazePushEventType;", "", "<init>", "(Ljava/lang/String;I)V", "NOTIFICATION_RECEIVED", "NOTIFICATION_DELETED", "NOTIFICATION_OPENED", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazePushEventType {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ BrazePushEventType[] $VALUES;
    public static final BrazePushEventType NOTIFICATION_RECEIVED = new BrazePushEventType("NOTIFICATION_RECEIVED", 0);
    public static final BrazePushEventType NOTIFICATION_DELETED = new BrazePushEventType("NOTIFICATION_DELETED", 1);
    public static final BrazePushEventType NOTIFICATION_OPENED = new BrazePushEventType("NOTIFICATION_OPENED", 2);

    private static final /* synthetic */ BrazePushEventType[] $values() {
        return new BrazePushEventType[]{NOTIFICATION_RECEIVED, NOTIFICATION_DELETED, NOTIFICATION_OPENED};
    }

    static {
        BrazePushEventType[] brazePushEventTypeArr$values = $values();
        $VALUES = brazePushEventTypeArr$values;
        $ENTRIES = AbstractC5277b.a(brazePushEventTypeArr$values);
    }

    private BrazePushEventType(String str, int i10) {
    }

    public static BrazePushEventType valueOf(String str) {
        return (BrazePushEventType) Enum.valueOf(BrazePushEventType.class, str);
    }

    public static BrazePushEventType[] values() {
        return (BrazePushEventType[]) $VALUES.clone();
    }
}
