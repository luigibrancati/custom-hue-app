package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3157b5 extends AbstractC3299r4 implements RandomAccess, InterfaceC3184e5, J5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f29420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3157b5 f29421e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f29422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29423c;

    static {
        int[] iArr = new int[0];
        f29420d = iArr;
        f29421e = new C3157b5(iArr, 0, false);
    }

    public C3157b5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f29422b = iArr;
        this.f29423c = i10;
    }

    public static C3157b5 d() {
        return f29421e;
    }

    public static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3202g5
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3184e5 q(int i10) {
        if (i10 >= this.f29423c) {
            return new C3157b5(i10 == 0 ? f29420d : Arrays.copyOf(this.f29422b, i10), this.f29423c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f29423c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f29422b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[k(length)];
            System.arraycopy(this.f29422b, 0, iArr2, 0, i10);
            System.arraycopy(this.f29422b, i10, iArr2, i12, this.f29423c - i10);
            this.f29422b = iArr2;
        }
        this.f29422b[i10] = iIntValue;
        this.f29423c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = AbstractC3211h5.f29486a;
        collection.getClass();
        if (!(collection instanceof C3157b5)) {
            return super.addAll(collection);
        }
        C3157b5 c3157b5 = (C3157b5) collection;
        int i10 = c3157b5.f29423c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29423c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f29422b;
        if (i12 > iArr.length) {
            this.f29422b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c3157b5.f29422b, 0, this.f29422b, this.f29423c, c3157b5.f29423c);
        this.f29423c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        l(i10);
        return this.f29422b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3157b5)) {
            return super.equals(obj);
        }
        C3157b5 c3157b5 = (C3157b5) obj;
        if (this.f29423c != c3157b5.f29423c) {
            return false;
        }
        int[] iArr = c3157b5.f29422b;
        for (int i10 = 0; i10 < this.f29423c; i10++) {
            if (this.f29422b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        c();
        int i11 = this.f29423c;
        int length = this.f29422b.length;
        if (i11 == length) {
            int[] iArr = new int[k(length)];
            System.arraycopy(this.f29422b, 0, iArr, 0, this.f29423c);
            this.f29422b = iArr;
        }
        int[] iArr2 = this.f29422b;
        int i12 = this.f29423c;
        this.f29423c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Integer.valueOf(this.f29422b[i10]);
    }

    public final void h(int i10) {
        int length = this.f29422b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f29422b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f29422b = Arrays.copyOf(this.f29422b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29423c; i11++) {
            i10 = (i10 * 31) + this.f29422b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f29423c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29422b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f29423c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    public final String n(int i10) {
        return C3317t4.a(this.f29423c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        l(i10);
        int[] iArr = this.f29422b;
        int i11 = iArr[i10];
        if (i10 < this.f29423c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f29423c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29422b;
        System.arraycopy(iArr, i11, iArr, i10, this.f29423c - i11);
        this.f29423c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        l(i10);
        int[] iArr = this.f29422b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29423c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
