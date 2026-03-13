package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3597q2 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3597q2 f30229b = new C3585o2(T2.f30092b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30230a = 0;

    static {
        int i10 = AbstractC3525e2.f30156a;
    }

    public static int l(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC3597q2 p(byte[] bArr, int i10, int i11) {
        l(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C3585o2(bArr2);
    }

    public abstract byte c(int i10);

    public abstract byte d(int i10);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract int f(int i10, int i11, int i12);

    public abstract AbstractC3597q2 h(int i10, int i11);

    public final int hashCode() {
        int iF = this.f30230a;
        if (iF == 0) {
            int iE = e();
            iF = f(iE, 0, iE);
            if (iF == 0) {
                iF = 1;
            }
            this.f30230a = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C3555j2(this);
    }

    public abstract void k(C3549i2 c3549i2);

    public final int n() {
        return this.f30230a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? G3.a(this) : G3.a(h(0, 47)).concat("..."));
    }
}
