package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3411i1 extends AbstractC3464t0 implements RandomAccess, InterfaceC3436n1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3411i1 f29861d = new C3411i1(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f29862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29863c;

    public C3411i1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f29862b = iArr;
        this.f29863c = i10;
    }

    public static C3411i1 e() {
        return f29861d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f29863c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f29862b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f29862b, i10, iArr2, i12, this.f29863c - i10);
            this.f29862b = iArr2;
        }
        this.f29862b[i10] = iIntValue;
        this.f29863c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = AbstractC3446p1.f29896a;
        collection.getClass();
        if (!(collection instanceof C3411i1)) {
            return super.addAll(collection);
        }
        C3411i1 c3411i1 = (C3411i1) collection;
        int i10 = c3411i1.f29863c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29863c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f29862b;
        if (i12 > iArr.length) {
            this.f29862b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c3411i1.f29862b, 0, this.f29862b, this.f29863c, c3411i1.f29863c);
        this.f29863c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        k(i10);
        return this.f29862b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3411i1)) {
            return super.equals(obj);
        }
        C3411i1 c3411i1 = (C3411i1) obj;
        if (this.f29863c != c3411i1.f29863c) {
            return false;
        }
        int[] iArr = c3411i1.f29862b;
        for (int i10 = 0; i10 < this.f29863c; i10++) {
            if (this.f29862b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        c();
        int i11 = this.f29863c;
        int[] iArr = this.f29862b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f29862b = iArr2;
        }
        int[] iArr3 = this.f29862b;
        int i12 = this.f29863c;
        this.f29863c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1
    public final /* bridge */ /* synthetic */ InterfaceC3441o1 g(int i10) {
        if (i10 >= this.f29863c) {
            return new C3411i1(Arrays.copyOf(this.f29862b, i10), this.f29863c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f29862b[i10]);
    }

    public final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f29863c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29863c; i11++) {
            i10 = (i10 * 31) + this.f29862b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f29863c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29862b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f29863c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        int[] iArr = this.f29862b;
        int i11 = iArr[i10];
        if (i10 < this.f29863c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f29863c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29862b;
        System.arraycopy(iArr, i11, iArr, i10, this.f29863c - i11);
        this.f29863c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        k(i10);
        int[] iArr = this.f29862b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29863c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
