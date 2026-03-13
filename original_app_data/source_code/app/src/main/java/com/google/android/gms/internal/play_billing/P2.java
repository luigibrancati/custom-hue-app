package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P2 extends AbstractC3519d2 implements RandomAccess, R2, InterfaceC3609s3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f30070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final P2 f30071e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f30072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30073c;

    static {
        int[] iArr = new int[0];
        f30070d = iArr;
        f30071e = new P2(iArr, 0, false);
    }

    public P2(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f30072b = iArr;
        this.f30073c = i10;
    }

    public static P2 e() {
        return f30071e;
    }

    public static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f30073c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f30072b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[k(length)];
            System.arraycopy(this.f30072b, 0, iArr2, 0, i10);
            System.arraycopy(this.f30072b, i10, iArr2, i12, this.f30073c - i10);
            this.f30072b = iArr2;
        }
        this.f30072b[i10] = iIntValue;
        this.f30073c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3519d2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = T2.f30091a;
        collection.getClass();
        if (!(collection instanceof P2)) {
            return super.addAll(collection);
        }
        P2 p22 = (P2) collection;
        int i10 = p22.f30073c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f30073c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f30072b;
        if (i12 > iArr.length) {
            this.f30072b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(p22.f30072b, 0, this.f30072b, this.f30073c, p22.f30073c);
        this.f30073c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        n(i10);
        return this.f30072b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3519d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2)) {
            return super.equals(obj);
        }
        P2 p22 = (P2) obj;
        if (this.f30073c != p22.f30073c) {
            return false;
        }
        int[] iArr = p22.f30072b;
        for (int i10 = 0; i10 < this.f30073c; i10++) {
            if (this.f30072b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        c();
        int i11 = this.f30073c;
        int length = this.f30072b.length;
        if (i11 == length) {
            int[] iArr = new int[k(length)];
            System.arraycopy(this.f30072b, 0, iArr, 0, this.f30073c);
            this.f30072b = iArr;
        }
        int[] iArr2 = this.f30072b;
        int i12 = this.f30073c;
        this.f30073c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.S2
    public final /* bridge */ /* synthetic */ S2 g(int i10) {
        if (i10 >= this.f30073c) {
            return new P2(i10 == 0 ? f30070d : Arrays.copyOf(this.f30072b, i10), this.f30073c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Integer.valueOf(this.f30072b[i10]);
    }

    public final void h(int i10) {
        int length = this.f30072b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f30072b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f30072b = Arrays.copyOf(this.f30072b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3519d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f30073c; i11++) {
            i10 = (i10 * 31) + this.f30072b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f30073c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f30072b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f30073c;
    }

    public final void n(int i10) {
        if (i10 < 0 || i10 >= this.f30073c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3519d2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        n(i10);
        int[] iArr = this.f30072b;
        int i11 = iArr[i10];
        if (i10 < this.f30073c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f30073c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f30072b;
        System.arraycopy(iArr, i11, iArr, i10, this.f30073c - i11);
        this.f30073c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        n(i10);
        int[] iArr = this.f30072b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30073c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
