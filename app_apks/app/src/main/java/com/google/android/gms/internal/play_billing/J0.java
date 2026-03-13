package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 extends AbstractC3583o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f30044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J0 f30045i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f30046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f30047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f30048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f30049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f30050g;

    static {
        Object[] objArr = new Object[0];
        f30044h = objArr;
        f30045i = new J0(objArr, 0, objArr, 0, 0);
    }

    public J0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f30046c = objArr;
        this.f30047d = i10;
        this.f30048e = objArr2;
        this.f30049f = i11;
        this.f30050g = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f30046c, 0, objArr, 0, this.f30050g);
        return this.f30050g;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f30048e;
            if (objArr.length != 0) {
                int iA = Z.a(obj.hashCode());
                while (true) {
                    int i10 = iA & this.f30049f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int d() {
        return this.f30050g;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30047d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final Object[] k() {
        return this.f30046c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0
    public final AbstractC3541h0 n() {
        return AbstractC3541h0.p(this.f30046c, this.f30050g);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30050g;
    }
}
