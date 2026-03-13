package com.braze.enums.inappmessage;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/enums/inappmessage/ClickAction;", "", "<init>", "(Ljava/lang/String;I)V", "URI", "NONE", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClickAction {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ ClickAction[] $VALUES;
    public static final ClickAction URI = new ClickAction("URI", 0);
    public static final ClickAction NONE = new ClickAction("NONE", 1);

    private static final /* synthetic */ ClickAction[] $values() {
        return new ClickAction[]{URI, NONE};
    }

    static {
        ClickAction[] clickActionArr$values = $values();
        $VALUES = clickActionArr$values;
        $ENTRIES = AbstractC5277b.a(clickActionArr$values);
    }

    private ClickAction(String str, int i10) {
    }

    public static ClickAction valueOf(String str) {
        return (ClickAction) Enum.valueOf(ClickAction.class, str);
    }

    public static ClickAction[] values() {
        return (ClickAction[]) $VALUES.clone();
    }
}
