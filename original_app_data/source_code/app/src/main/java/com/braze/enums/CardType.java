package com.braze.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000f"}, d2 = {"Lcom/braze/enums/CardType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "CAPTIONED_IMAGE", "DEFAULT", "SHORT_NEWS", "TEXT_ANNOUNCEMENT", "CONTROL", "value", "", "getValue", "()I", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardType {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CardType IMAGE = new CardType("IMAGE", 0);
    public static final CardType CAPTIONED_IMAGE = new CardType("CAPTIONED_IMAGE", 1);
    public static final CardType DEFAULT = new CardType("DEFAULT", 2);
    public static final CardType SHORT_NEWS = new CardType("SHORT_NEWS", 3);
    public static final CardType TEXT_ANNOUNCEMENT = new CardType("TEXT_ANNOUNCEMENT", 4);
    public static final CardType CONTROL = new CardType("CONTROL", 5);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/enums/CardType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/braze/enums/CardType;", "value", "", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final CardType fromValue(int value) {
            return (CardType) CardType.getEntries().get(value);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CardType[] $values() {
        return new CardType[]{IMAGE, CAPTIONED_IMAGE, DEFAULT, SHORT_NEWS, TEXT_ANNOUNCEMENT, CONTROL};
    }

    static {
        CardType[] cardTypeArr$values = $values();
        $VALUES = cardTypeArr$values;
        $ENTRIES = AbstractC5277b.a(cardTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private CardType(String str, int i10) {
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }

    public final int getValue() {
        return ordinal();
    }
}
