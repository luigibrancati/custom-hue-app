package com.google.android.gms.internal.play_billing;

import O4.C1588f0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h5 {
    public static InterfaceFutureC3649z1 a(C1588f0 c1588f0) {
        d5 d5Var = new d5();
        g5 g5Var = new g5(d5Var);
        d5Var.f30151b = g5Var;
        d5Var.f30150a = c1588f0.getClass();
        try {
            d5Var.f30150a = c1588f0.a(d5Var);
            return g5Var;
        } catch (Exception e10) {
            g5Var.d(e10);
            return g5Var;
        }
    }
}
