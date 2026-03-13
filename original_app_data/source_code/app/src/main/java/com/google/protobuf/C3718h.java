package com.google.protobuf;

import com.google.protobuf.N;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3718h extends AbstractC3708c implements N.a, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3718h f32232d = new C3718h(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f32233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32234c;

    public C3718h() {
        this(new boolean[10], 0, true);
    }

    public static C3718h k() {
        return f32232d;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        N.a(collection);
        if (!(collection instanceof C3718h)) {
            return super.addAll(collection);
        }
        C3718h c3718h = (C3718h) collection;
        int i10 = c3718h.f32234c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f32234c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f32233b;
        if (i12 > zArr.length) {
            this.f32233b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c3718h.f32233b, 0, this.f32233b, this.f32234c, c3718h.f32234c);
        this.f32234c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        f(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        h(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3718h)) {
            return super.equals(obj);
        }
        C3718h c3718h = (C3718h) obj;
        if (this.f32234c != c3718h.f32234c) {
            return false;
        }
        boolean[] zArr = c3718h.f32233b;
        for (int i10 = 0; i10 < this.f32234c; i10++) {
            if (this.f32233b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10, boolean z10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f32234c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        boolean[] zArr = this.f32233b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f32233b, i10, zArr2, i10 + 1, this.f32234c - i10);
            this.f32233b = zArr2;
        }
        this.f32233b[i10] = z10;
        this.f32234c++;
        ((AbstractList) this).modCount++;
    }

    public void h(boolean z10) {
        c();
        int i10 = this.f32234c;
        boolean[] zArr = this.f32233b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f32233b = zArr2;
        }
        boolean[] zArr3 = this.f32233b;
        int i11 = this.f32234c;
        this.f32234c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f32234c; i10++) {
            iC = (iC * 31) + N.c(this.f32233b[i10]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f32233b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f32234c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(p(i10));
    }

    public boolean p(int i10) {
        l(i10);
        return this.f32233b[i10];
    }

    public final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f32234c;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f32233b;
        System.arraycopy(zArr, i11, zArr, i10, this.f32234c - i11);
        this.f32234c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        c();
        l(i10);
        boolean[] zArr = this.f32233b;
        boolean z10 = zArr[i10];
        if (i10 < this.f32234c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f32234c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32234c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(v(i10, bool.booleanValue()));
    }

    public boolean v(int i10, boolean z10) {
        c();
        l(i10);
        boolean[] zArr = this.f32233b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    public C3718h(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f32233b = zArr;
        this.f32234c = i10;
    }

    @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
    public N.a a(int i10) {
        if (i10 >= this.f32234c) {
            return new C3718h(Arrays.copyOf(this.f32233b, i10), this.f32234c, true);
        }
        throw new IllegalArgumentException();
    }
}
