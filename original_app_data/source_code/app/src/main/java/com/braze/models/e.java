package com.braze.models;

import com.braze.enums.CardType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28052a;

    static {
        int[] iArr = new int[CardType.values().length];
        try {
            iArr[CardType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardType.CONTROL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f28052a = iArr;
    }
}
