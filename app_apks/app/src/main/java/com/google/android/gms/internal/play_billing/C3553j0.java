package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3553j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f30183a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30184b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3547i0 f30185c;

    public final C3553j0 a(Object obj, Object obj2) {
        int i10 = this.f30184b + 1;
        Object[] objArr = this.f30183a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f30183a = Arrays.copyOf(objArr, AbstractC3505b0.a(length, i11));
        }
        O.b(obj, obj2);
        Object[] objArr2 = this.f30183a;
        int i12 = this.f30184b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f30184b = i12 + 1;
        return this;
    }

    public final AbstractC3559k0 b() {
        C3547i0 c3547i0 = this.f30185c;
        if (c3547i0 != null) {
            throw c3547i0.a();
        }
        I0 i0G = I0.g(this.f30184b, this.f30183a, this);
        C3547i0 c3547i02 = this.f30185c;
        if (c3547i02 == null) {
            return i0G;
        }
        throw c3547i02.a();
    }
}
