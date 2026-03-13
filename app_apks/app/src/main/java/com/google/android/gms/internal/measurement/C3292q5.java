package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3292q5 extends AbstractC3299r4 implements RandomAccess, InterfaceC3193f5, J5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f29586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3292q5 f29587e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f29588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29589c;

    static {
        long[] jArr = new long[0];
        f29586d = jArr;
        f29587e = new C3292q5(jArr, 0, false);
    }

    public C3292q5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f29588b = jArr;
        this.f29589c = i10;
    }

    public static C3292q5 d() {
        return f29587e;
    }

    public static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3193f5
    public final long S(int i10) {
        k(i10);
        return this.f29588b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f29589c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f29588b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[h(length)];
            System.arraycopy(this.f29588b, 0, jArr2, 0, i10);
            System.arraycopy(this.f29588b, i10, jArr2, i12, this.f29589c - i10);
            this.f29588b = jArr2;
        }
        this.f29588b[i10] = jLongValue;
        this.f29589c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = AbstractC3211h5.f29486a;
        collection.getClass();
        if (!(collection instanceof C3292q5)) {
            return super.addAll(collection);
        }
        C3292q5 c3292q5 = (C3292q5) collection;
        int i10 = c3292q5.f29589c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29589c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f29588b;
        if (i12 > jArr.length) {
            this.f29588b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c3292q5.f29588b, 0, this.f29588b, this.f29589c, c3292q5.f29589c);
        this.f29589c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j10) {
        c();
        int i10 = this.f29589c;
        int length = this.f29588b.length;
        if (i10 == length) {
            long[] jArr = new long[h(length)];
            System.arraycopy(this.f29588b, 0, jArr, 0, this.f29589c);
            this.f29588b = jArr;
        }
        long[] jArr2 = this.f29588b;
        int i11 = this.f29589c;
        this.f29589c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3292q5)) {
            return super.equals(obj);
        }
        C3292q5 c3292q5 = (C3292q5) obj;
        if (this.f29589c != c3292q5.f29589c) {
            return false;
        }
        long[] jArr = c3292q5.f29588b;
        for (int i10 = 0; i10 < this.f29589c; i10++) {
            if (this.f29588b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        int length = this.f29588b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f29588b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = h(length);
        }
        this.f29588b = Arrays.copyOf(this.f29588b, length);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3202g5
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3193f5 q(int i10) {
        if (i10 >= this.f29589c) {
            return new C3292q5(i10 == 0 ? f29586d : Arrays.copyOf(this.f29588b, i10), this.f29589c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f29588b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29589c; i11++) {
            long j10 = this.f29588b[i11];
            Charset charset = AbstractC3211h5.f29486a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f29589c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29588b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f29589c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    public final String l(int i10) {
        return C3317t4.a(this.f29589c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3299r4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        long[] jArr = this.f29588b;
        long j10 = jArr[i10];
        if (i10 < this.f29589c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f29589c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f29588b;
        System.arraycopy(jArr, i11, jArr, i10, this.f29589c - i11);
        this.f29589c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        k(i10);
        long[] jArr = this.f29588b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29589c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
