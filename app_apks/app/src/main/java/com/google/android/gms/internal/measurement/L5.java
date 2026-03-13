package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L5 extends AbstractC3299r4 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f29261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L5 f29262e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f29263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29264c;

    static {
        Object[] objArr = new Object[0];
        f29261d = objArr;
        f29262e = new L5(objArr, 0, false);
    }

    public L5(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f29263b = objArr;
        this.f29264c = i10;
    }

    public static L5 d() {
        return f29262e;
    }

    private static int f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f29264c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f29264c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f29263b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[f(length)];
            System.arraycopy(this.f29263b, 0, objArr2, 0, i10);
            System.arraycopy(this.f29263b, i10, objArr2, i12, this.f29264c - i10);
            this.f29263b = objArr2;
        }
        this.f29263b[i10] = obj;
        this.f29264c++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i10) {
        int length = this.f29263b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f29263b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = f(length);
        }
        this.f29263b = Arrays.copyOf(this.f29263b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f29263b[i10];
    }

    public final String k(int i10) {
        return C3317t4.a(this.f29264c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3202g5
    public final /* bridge */ /* synthetic */ InterfaceC3202g5 q(int i10) {
        if (i10 >= this.f29264c) {
            return new L5(i10 == 0 ? f29261d : Arrays.copyOf(this.f29263b, i10), this.f29264c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        h(i10);
        Object[] objArr = this.f29263b;
        Object obj = objArr[i10];
        if (i10 < this.f29264c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f29264c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        h(i10);
        Object[] objArr = this.f29263b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29264c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f29264c;
        int length = this.f29263b.length;
        if (i10 == length) {
            this.f29263b = Arrays.copyOf(this.f29263b, f(length));
        }
        Object[] objArr = this.f29263b;
        int i11 = this.f29264c;
        this.f29264c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
