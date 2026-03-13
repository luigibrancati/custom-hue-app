package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends AbstractC3708c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x0 f32332d = new x0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f32333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32334c;

    public x0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f32333b = objArr;
        this.f32334c = i10;
    }

    public static Object[] d(int i10) {
        return new Object[i10];
    }

    public static x0 e() {
        return f32332d;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f32334c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f32334c;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i10 = this.f32334c;
        Object[] objArr = this.f32333b;
        if (i10 == objArr.length) {
            this.f32333b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f32333b;
        int i11 = this.f32334c;
        this.f32334c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        f(i10);
        return this.f32333b[i10];
    }

    @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public x0 a(int i10) {
        if (i10 >= this.f32334c) {
            return new x0(Arrays.copyOf(this.f32333b, i10), this.f32334c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        c();
        f(i10);
        Object[] objArr = this.f32333b;
        Object obj = objArr[i10];
        if (i10 < this.f32334c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f32334c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        c();
        f(i10);
        Object[] objArr = this.f32333b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32334c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f32334c)) {
            Object[] objArr = this.f32333b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrD = d(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f32333b, 0, objArrD, 0, i10);
                System.arraycopy(this.f32333b, i10, objArrD, i10 + 1, this.f32334c - i10);
                this.f32333b = objArrD;
            }
            this.f32333b[i10] = obj;
            this.f32334c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i10));
    }
}
