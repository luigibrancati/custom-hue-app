package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3499a0 extends AbstractC3505b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f30115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30117c;

    public AbstractC3499a0(int i10) {
        O.a(i10, "initialCapacity");
        this.f30115a = new Object[i10];
        this.f30116b = 0;
    }

    public final AbstractC3499a0 b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f30115a;
        int i10 = this.f30116b;
        this.f30116b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void c(Object[] objArr, int i10) {
        AbstractC3630w0.b(objArr, i10);
        d(i10);
        System.arraycopy(objArr, 0, this.f30115a, this.f30116b, i10);
        this.f30116b += i10;
    }

    public final void d(int i10) {
        int length = this.f30115a.length;
        int iA = AbstractC3505b0.a(length, this.f30116b + i10);
        if (iA > length || this.f30117c) {
            this.f30115a = Arrays.copyOf(this.f30115a, iA);
            this.f30117c = false;
        }
    }
}
