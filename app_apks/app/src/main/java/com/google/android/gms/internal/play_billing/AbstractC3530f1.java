package com.google.android.gms.internal.play_billing;

import N6.AbstractC1398m1;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3530f1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!AbstractC1398m1.a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
