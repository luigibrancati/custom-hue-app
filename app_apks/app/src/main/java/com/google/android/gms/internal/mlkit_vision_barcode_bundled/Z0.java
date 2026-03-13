package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z0 extends AbstractC3464t0 implements RandomAccess, InterfaceC3431m1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z0 f29826d = new Z0(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f29827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29828c;

    public Z0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f29827b = fArr;
        this.f29828c = i10;
    }

    public static Z0 e() {
        return f29826d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f29828c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f29827b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f29827b, i10, fArr2, i12, this.f29828c - i10);
            this.f29827b = fArr2;
        }
        this.f29827b[i10] = fFloatValue;
        this.f29828c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = AbstractC3446p1.f29896a;
        collection.getClass();
        if (!(collection instanceof Z0)) {
            return super.addAll(collection);
        }
        Z0 z02 = (Z0) collection;
        int i10 = z02.f29828c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29828c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f29827b;
        if (i12 > fArr.length) {
            this.f29827b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(z02.f29827b, 0, this.f29827b, this.f29828c, z02.f29828c);
        this.f29828c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final float d(int i10) {
        h(i10);
        return this.f29827b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z0)) {
            return super.equals(obj);
        }
        Z0 z02 = (Z0) obj;
        if (this.f29828c != z02.f29828c) {
            return false;
        }
        float[] fArr = z02.f29827b;
        for (int i10 = 0; i10 < this.f29828c; i10++) {
            if (Float.floatToIntBits(this.f29827b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f29828c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Float.valueOf(this.f29827b[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f29828c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f29828c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f29827b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f29828c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29827b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3431m1
    public final void k0(float f10) {
        c();
        int i10 = this.f29828c;
        float[] fArr = this.f29827b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f29827b = fArr2;
        }
        float[] fArr3 = this.f29827b;
        int i11 = this.f29828c;
        this.f29828c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3431m1 g(int i10) {
        if (i10 >= this.f29828c) {
            return new Z0(Arrays.copyOf(this.f29827b, i10), this.f29828c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3464t0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        h(i10);
        float[] fArr = this.f29827b;
        float f10 = fArr[i10];
        if (i10 < this.f29828c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f29828c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f29827b;
        System.arraycopy(fArr, i11, fArr, i10, this.f29828c - i11);
        this.f29828c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        h(i10);
        float[] fArr = this.f29827b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29828c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k0(((Float) obj).floatValue());
        return true;
    }
}
