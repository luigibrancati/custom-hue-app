package com.google.protobuf;

import com.google.protobuf.N;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC3708c implements N.f, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K f32117d = new K(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f32118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32119c;

    public K() {
        this(new float[10], 0, true);
    }

    public static K k() {
        return f32117d;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f32119c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f32119c;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        N.a(collection);
        if (!(collection instanceof K)) {
            return super.addAll(collection);
        }
        K k10 = (K) collection;
        int i10 = k10.f32119c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f32119c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f32118b;
        if (i12 > fArr.length) {
            this.f32118b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(k10.f32118b, 0, this.f32118b, this.f32119c, k10.f32119c);
        this.f32119c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        h(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        f(f10.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return super.equals(obj);
        }
        K k10 = (K) obj;
        if (this.f32119c != k10.f32119c) {
            return false;
        }
        float[] fArr = k10.f32118b;
        for (int i10 = 0; i10 < this.f32119c; i10++) {
            if (Float.floatToIntBits(this.f32118b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public void f(float f10) {
        c();
        int i10 = this.f32119c;
        float[] fArr = this.f32118b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f32118b = fArr2;
        }
        float[] fArr3 = this.f32118b;
        int i11 = this.f32119c;
        this.f32119c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void h(int i10, float f10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f32119c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        float[] fArr = this.f32118b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f32118b, i10, fArr2, i10 + 1, this.f32119c - i10);
            this.f32118b = fArr2;
        }
        this.f32118b[i10] = f10;
        this.f32119c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f32119c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f32118b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f32118b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(p(i10));
    }

    public float p(int i10) {
        l(i10);
        return this.f32118b[i10];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f32118b;
        System.arraycopy(fArr, i11, fArr, i10, this.f32119c - i11);
        this.f32119c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        c();
        l(i10);
        float[] fArr = this.f32118b;
        float f10 = fArr[i10];
        if (i10 < this.f32119c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f32119c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32119c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(v(i10, f10.floatValue()));
    }

    public float v(int i10, float f10) {
        c();
        l(i10);
        float[] fArr = this.f32118b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public K(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f32118b = fArr;
        this.f32119c = i10;
    }

    @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
    public N.f a(int i10) {
        if (i10 >= this.f32119c) {
            return new K(Arrays.copyOf(this.f32118b, i10), this.f32119c, true);
        }
        throw new IllegalArgumentException();
    }
}
