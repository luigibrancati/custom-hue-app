package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3571m0 extends A implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3571m0 f30197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3571m0 f30198c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient AbstractC3541h0 f30199a;

    static {
        Q0 q02 = AbstractC3541h0.f30177b;
        f30197b = new C3571m0(D0.f30011e);
        f30198c = new C3571m0(AbstractC3541h0.t(A0.a()));
    }

    public C3571m0(AbstractC3541h0 abstractC3541h0) {
        this.f30199a = abstractC3541h0;
    }

    public static C3571m0 a() {
        return f30198c;
    }

    public static C3571m0 c() {
        return f30197b;
    }

    @Override // com.google.android.gms.internal.play_billing.C0
    public final /* bridge */ /* synthetic */ Set b() {
        return this.f30199a.isEmpty() ? J0.f30045i : new K0(this.f30199a, C3648z0.f30274a);
    }
}
