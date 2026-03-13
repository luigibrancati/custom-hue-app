package com.google.protobuf;

import com.google.protobuf.N;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3745y extends AbstractC3708c implements N.b, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3745y f32335d = new C3745y(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f32336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32337c;

    public C3745y() {
        this(new double[10], 0, true);
    }

    public static C3745y h() {
        return f32335d;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f32337c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f32337c;
    }

    @Override // com.google.protobuf.N.b
    public void G0(double d10) {
        c();
        int i10 = this.f32337c;
        double[] dArr = this.f32336b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f32336b = dArr2;
        }
        double[] dArr3 = this.f32336b;
        int i11 = this.f32337c;
        this.f32337c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        N.a(collection);
        if (!(collection instanceof C3745y)) {
            return super.addAll(collection);
        }
        C3745y c3745y = (C3745y) collection;
        int i10 = c3745y.f32337c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f32337c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f32336b;
        if (i12 > dArr.length) {
            this.f32336b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c3745y.f32336b, 0, this.f32336b, this.f32337c, c3745y.f32337c);
        this.f32337c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        f(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        G0(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3745y)) {
            return super.equals(obj);
        }
        C3745y c3745y = (C3745y) obj;
        if (this.f32337c != c3745y.f32337c) {
            return false;
        }
        double[] dArr = c3745y.f32336b;
        for (int i10 = 0; i10 < this.f32337c; i10++) {
            if (Double.doubleToLongBits(this.f32336b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f32337c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        double[] dArr = this.f32336b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f32336b, i10, dArr2, i10 + 1, this.f32337c - i10);
            this.f32336b = dArr2;
        }
        this.f32336b[i10] = d10;
        this.f32337c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.N.b
    public double getDouble(int i10) {
        k(i10);
        return this.f32336b[i10];
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f32337c; i10++) {
            iF = (iF * 31) + N.f(Double.doubleToLongBits(this.f32336b[i10]));
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f32336b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        c();
        k(i10);
        double[] dArr = this.f32336b;
        double d10 = dArr[i10];
        if (i10 < this.f32337c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f32337c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // com.google.protobuf.N.b
    public double p0(int i10, double d10) {
        c();
        k(i10);
        double[] dArr = this.f32336b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(p0(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f32336b;
        System.arraycopy(dArr, i11, dArr, i10, this.f32337c - i11);
        this.f32337c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32337c;
    }

    public C3745y(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f32336b = dArr;
        this.f32337c = i10;
    }

    @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
    public N.b a(int i10) {
        if (i10 >= this.f32337c) {
            return new C3745y(Arrays.copyOf(this.f32336b, i10), this.f32337c, true);
        }
        throw new IllegalArgumentException();
    }
}
