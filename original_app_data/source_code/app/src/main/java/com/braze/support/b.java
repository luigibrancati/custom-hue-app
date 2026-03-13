package com.braze.support;

import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28631a;

    static {
        int[] iArr = new int[BrazeLogger.Priority.values().length];
        try {
            iArr[BrazeLogger.Priority.f28624D.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BrazeLogger.Priority.f28626I.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BrazeLogger.Priority.f28625E.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BrazeLogger.Priority.f28628W.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BrazeLogger.Priority.f28627V.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f28631a = iArr;
    }
}
