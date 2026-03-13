package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends AbstractC3656c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f31431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f31432e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f31433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31434c;

    static {
        Object[] objArr = new Object[0];
        f31431d = objArr;
        f31432e = new c0(objArr, 0, false);
    }

    public c0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f31433b = objArr;
        this.f31434c = i10;
    }

    public static Object[] d(int i10) {
        return new Object[i10];
    }

    public static c0 e() {
        return f31432e;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f31434c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f31434c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i10 = this.f31434c;
        Object[] objArr = this.f31433b;
        if (i10 == objArr.length) {
            this.f31433b = Arrays.copyOf(this.f31433b, h(objArr.length));
        }
        Object[] objArr2 = this.f31433b;
        int i11 = this.f31434c;
        this.f31434c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        f(i10);
        return this.f31433b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3678z.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c0 a(int i10) {
        if (i10 >= this.f31434c) {
            return new c0(i10 == 0 ? f31431d : Arrays.copyOf(this.f31433b, i10), this.f31434c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3656c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        c();
        f(i10);
        Object[] objArr = this.f31433b;
        Object obj = objArr[i10];
        if (i10 < this.f31434c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f31434c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        c();
        f(i10);
        Object[] objArr = this.f31433b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f31434c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f31434c)) {
            Object[] objArr = this.f31433b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrD = d(h(objArr.length));
                System.arraycopy(this.f31433b, 0, objArrD, 0, i10);
                System.arraycopy(this.f31433b, i10, objArrD, i10 + 1, this.f31434c - i10);
                this.f31433b = objArrD;
            }
            this.f31433b[i10] = obj;
            this.f31434c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }
}
