package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 extends AbstractC3464t0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S1 f29802d = new S1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f29803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29804c;

    public S1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f29803b = objArr;
        this.f29804c = i10;
    }

    public static S1 d() {
        return f29802d;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f29804c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f29804c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f29803b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f29803b, i10, objArr2, i12, this.f29804c - i10);
            this.f29803b = objArr2;
        }
        this.f29803b[i10] = obj;
        this.f29804c++;
        ((AbstractList) this).modCount++;
    }

    public final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f29804c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1
    public final /* bridge */ /* synthetic */ InterfaceC3441o1 g(int i10) {
        if (i10 >= this.f29804c) {
            return new S1(Arrays.copyOf(this.f29803b, i10), this.f29804c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return this.f29803b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        f(i10);
        Object[] objArr = this.f29803b;
        Object obj = objArr[i10];
        if (i10 < this.f29804c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f29804c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        f(i10);
        Object[] objArr = this.f29803b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29804c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f29804c;
        Object[] objArr = this.f29803b;
        if (i10 == objArr.length) {
            this.f29803b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f29803b;
        int i11 = this.f29804c;
        this.f29804c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
