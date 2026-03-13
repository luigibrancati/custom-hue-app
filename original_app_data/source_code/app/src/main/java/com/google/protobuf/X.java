package com.google.protobuf;

import com.google.protobuf.N;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X extends AbstractC3708c implements N.i, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X f32201d = new X(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f32202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32203c;

    public X() {
        this(new long[10], 0, true);
    }

    public static X h() {
        return f32201d;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f32203c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f32203c;
    }

    @Override // com.google.protobuf.N.i
    public void C0(long j10) {
        c();
        int i10 = this.f32203c;
        long[] jArr = this.f32202b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f32202b = jArr2;
        }
        long[] jArr3 = this.f32202b;
        int i11 = this.f32203c;
        this.f32203c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.protobuf.N.i
    public long Q0(int i10, long j10) {
        c();
        k(i10);
        long[] jArr = this.f32202b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        N.a(collection);
        if (!(collection instanceof X)) {
            return super.addAll(collection);
        }
        X x10 = (X) collection;
        int i10 = x10.f32203c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f32203c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f32202b;
        if (i12 > jArr.length) {
            this.f32202b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(x10.f32202b, 0, this.f32202b, this.f32203c, x10.f32203c);
        this.f32203c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        f(i10, l10.longValue());
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        C0(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x10 = (X) obj;
        if (this.f32203c != x10.f32203c) {
            return false;
        }
        long[] jArr = x10.f32202b;
        for (int i10 = 0; i10 < this.f32203c; i10++) {
            if (this.f32202b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10, long j10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f32203c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        long[] jArr = this.f32202b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f32202b, i10, jArr2, i10 + 1, this.f32203c - i10);
            this.f32202b = jArr2;
        }
        this.f32202b[i10] = j10;
        this.f32203c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.N.i
    public long getLong(int i10) {
        k(i10);
        return this.f32202b[i10];
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f32203c; i10++) {
            iF = (iF * 31) + N.f(this.f32202b[i10]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f32202b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        c();
        k(i10);
        long[] jArr = this.f32202b;
        long j10 = jArr[i10];
        if (i10 < this.f32203c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f32203c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(Q0(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f32202b;
        System.arraycopy(jArr, i11, jArr, i10, this.f32203c - i11);
        this.f32203c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32203c;
    }

    public X(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f32202b = jArr;
        this.f32203c = i10;
    }

    @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
    public N.i a(int i10) {
        if (i10 >= this.f32203c) {
            return new X(Arrays.copyOf(this.f32202b, i10), this.f32203c, true);
        }
        throw new IllegalArgumentException();
    }
}
