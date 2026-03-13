package com.google.protobuf;

import com.google.protobuf.N;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC3708c implements N.g, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f32128d = new M(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f32129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32130c;

    public M() {
        this(new int[10], 0, true);
    }

    public static M h() {
        return f32128d;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f32130c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f32130c;
    }

    @Override // com.google.protobuf.N.g
    public int D(int i10, int i11) {
        c();
        k(i10);
        int[] iArr = this.f32129b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        N.a(collection);
        if (!(collection instanceof M)) {
            return super.addAll(collection);
        }
        M m10 = (M) collection;
        int i10 = m10.f32130c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f32130c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f32129b;
        if (i12 > iArr.length) {
            this.f32129b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(m10.f32129b, 0, this.f32129b, this.f32130c, m10.f32130c);
        this.f32130c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        f(i10, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        x0(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return super.equals(obj);
        }
        M m10 = (M) obj;
        if (this.f32130c != m10.f32130c) {
            return false;
        }
        int[] iArr = m10.f32129b;
        for (int i10 = 0; i10 < this.f32130c; i10++) {
            if (this.f32129b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f32130c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int[] iArr = this.f32129b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f32129b, i10, iArr2, i10 + 1, this.f32130c - i10);
            this.f32129b = iArr2;
        }
        this.f32129b[i10] = i11;
        this.f32130c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.N.g
    public int getInt(int i10) {
        k(i10);
        return this.f32129b[i10];
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f32130c; i11++) {
            i10 = (i10 * 31) + this.f32129b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f32129b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        c();
        k(i10);
        int[] iArr = this.f32129b;
        int i11 = iArr[i10];
        if (i10 < this.f32130c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f32130c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(D(i10, num.intValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f32129b;
        System.arraycopy(iArr, i11, iArr, i10, this.f32130c - i11);
        this.f32130c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32130c;
    }

    @Override // com.google.protobuf.N.g
    public void x0(int i10) {
        c();
        int i11 = this.f32130c;
        int[] iArr = this.f32129b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f32129b = iArr2;
        }
        int[] iArr3 = this.f32129b;
        int i12 = this.f32130c;
        this.f32130c = i12 + 1;
        iArr3[i12] = i10;
    }

    public M(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f32129b = iArr;
        this.f32130c = i10;
    }

    @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
    public N.g a(int i10) {
        if (i10 >= this.f32130c) {
            return new M(Arrays.copyOf(this.f32129b, i10), this.f32130c, true);
        }
        throw new IllegalArgumentException();
    }
}
