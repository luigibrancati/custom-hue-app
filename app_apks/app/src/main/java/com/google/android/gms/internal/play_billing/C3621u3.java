package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3621u3 extends AbstractC3519d2 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f30253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3621u3 f30254e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f30255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30256c;

    static {
        Object[] objArr = new Object[0];
        f30253d = objArr;
        f30254e = new C3621u3(objArr, 0, false);
    }

    public C3621u3(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f30255b = objArr;
        this.f30256c = i10;
    }

    public static C3621u3 d() {
        return f30254e;
    }

    public static int f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f30256c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f30255b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[f(length)];
            System.arraycopy(this.f30255b, 0, objArr2, 0, i10);
            System.arraycopy(this.f30255b, i10, objArr2, i12, this.f30256c - i10);
            this.f30255b = objArr2;
        }
        this.f30255b[i10] = obj;
        this.f30256c++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i10) {
        int length = this.f30255b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f30255b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = f(length);
        }
        this.f30255b = Arrays.copyOf(this.f30255b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.S2
    public final /* bridge */ /* synthetic */ S2 g(int i10) {
        if (i10 >= this.f30256c) {
            return new C3621u3(i10 == 0 ? f30253d : Arrays.copyOf(this.f30255b, i10), this.f30256c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return this.f30255b[i10];
    }

    public final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f30256c;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f30256c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3519d2, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        k(i10);
        Object[] objArr = this.f30255b;
        Object obj = objArr[i10];
        if (i10 < this.f30256c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f30256c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        k(i10);
        Object[] objArr = this.f30255b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30256c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f30256c;
        int length = this.f30255b.length;
        if (i10 == length) {
            this.f30255b = Arrays.copyOf(this.f30255b, f(length));
        }
        Object[] objArr = this.f30255b;
        int i11 = this.f30256c;
        this.f30256c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
