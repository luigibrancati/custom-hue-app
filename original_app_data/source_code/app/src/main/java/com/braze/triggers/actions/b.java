package com.braze.triggers.actions;

import com.braze.enums.inappmessage.MessageType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28659a;

    static {
        int[] iArr = new int[MessageType.values().length];
        try {
            iArr[MessageType.HTML_FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessageType.MODAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MessageType.SLIDEUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MessageType.HTML.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f28659a = iArr;
    }
}
