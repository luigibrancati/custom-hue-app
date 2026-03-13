package com.braze.enums;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/braze/enums/BrazeViewBounds;", "", "widthDp", "", "heightDp", "<init>", "(Ljava/lang/String;III)V", "getWidthDp", "()I", "getHeightDp", "NOTIFICATION_EXPANDED_IMAGE", "NOTIFICATION_INLINE_PUSH_IMAGE", "NOTIFICATION_LARGE_ICON", "NOTIFICATION_ONE_IMAGE_STORY", "BASE_CARD_VIEW", "IN_APP_MESSAGE_MODAL", "IN_APP_MESSAGE_SLIDEUP", "NO_BOUNDS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeViewBounds {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ BrazeViewBounds[] $VALUES;
    private final int heightDp;
    private final int widthDp;
    public static final BrazeViewBounds NOTIFICATION_EXPANDED_IMAGE = new BrazeViewBounds("NOTIFICATION_EXPANDED_IMAGE", 0, 478, 256);
    public static final BrazeViewBounds NOTIFICATION_INLINE_PUSH_IMAGE = new BrazeViewBounds("NOTIFICATION_INLINE_PUSH_IMAGE", 1, 384, 256);
    public static final BrazeViewBounds NOTIFICATION_LARGE_ICON = new BrazeViewBounds("NOTIFICATION_LARGE_ICON", 2, 64, 64);
    public static final BrazeViewBounds NOTIFICATION_ONE_IMAGE_STORY = new BrazeViewBounds("NOTIFICATION_ONE_IMAGE_STORY", 3, 256, 128);
    public static final BrazeViewBounds BASE_CARD_VIEW = new BrazeViewBounds("BASE_CARD_VIEW", 4, 512, 512);
    public static final BrazeViewBounds IN_APP_MESSAGE_MODAL = new BrazeViewBounds("IN_APP_MESSAGE_MODAL", 5, 580, 580);
    public static final BrazeViewBounds IN_APP_MESSAGE_SLIDEUP = new BrazeViewBounds("IN_APP_MESSAGE_SLIDEUP", 6, 100, 100);
    public static final BrazeViewBounds NO_BOUNDS = new BrazeViewBounds("NO_BOUNDS", 7, 0, 0);

    private static final /* synthetic */ BrazeViewBounds[] $values() {
        return new BrazeViewBounds[]{NOTIFICATION_EXPANDED_IMAGE, NOTIFICATION_INLINE_PUSH_IMAGE, NOTIFICATION_LARGE_ICON, NOTIFICATION_ONE_IMAGE_STORY, BASE_CARD_VIEW, IN_APP_MESSAGE_MODAL, IN_APP_MESSAGE_SLIDEUP, NO_BOUNDS};
    }

    static {
        BrazeViewBounds[] brazeViewBoundsArr$values = $values();
        $VALUES = brazeViewBoundsArr$values;
        $ENTRIES = AbstractC5277b.a(brazeViewBoundsArr$values);
    }

    private BrazeViewBounds(String str, int i10, int i11, int i12) {
        this.widthDp = i11;
        this.heightDp = i12;
    }

    public static BrazeViewBounds valueOf(String str) {
        return (BrazeViewBounds) Enum.valueOf(BrazeViewBounds.class, str);
    }

    public static BrazeViewBounds[] values() {
        return (BrazeViewBounds[]) $VALUES.clone();
    }

    public final int getHeightDp() {
        return this.heightDp;
    }

    public final int getWidthDp() {
        return this.widthDp;
    }
}
