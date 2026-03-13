package com.braze.enums;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/braze/enums/Channel;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "INAPP_MESSAGE", "CONTENT_CARD", "UNKNOWN", "BANNER", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Channel {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ Channel[] $VALUES;
    public static final Channel PUSH = new Channel("PUSH", 0);
    public static final Channel INAPP_MESSAGE = new Channel("INAPP_MESSAGE", 1);
    public static final Channel CONTENT_CARD = new Channel("CONTENT_CARD", 2);
    public static final Channel UNKNOWN = new Channel("UNKNOWN", 3);
    public static final Channel BANNER = new Channel("BANNER", 4);

    private static final /* synthetic */ Channel[] $values() {
        return new Channel[]{PUSH, INAPP_MESSAGE, CONTENT_CARD, UNKNOWN, BANNER};
    }

    static {
        Channel[] channelArr$values = $values();
        $VALUES = channelArr$values;
        $ENTRIES = AbstractC5277b.a(channelArr$values);
    }

    private Channel(String str, int i10) {
    }

    public static Channel valueOf(String str) {
        return (Channel) Enum.valueOf(Channel.class, str);
    }

    public static Channel[] values() {
        return (Channel[]) $VALUES.clone();
    }
}
