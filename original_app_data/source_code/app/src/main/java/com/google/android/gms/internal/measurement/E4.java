package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class E4 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E4 f29169b = new D4(AbstractC3211h5.f29487b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29170a = 0;

    static {
        int i10 = AbstractC3308s4.f29604a;
    }

    public static E4 l(byte[] bArr, int i10, int i11) {
        p(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new D4(bArr2);
    }

    public static int p(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public abstract byte c(int i10);

    public abstract byte d(int i10);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract E4 f(int i10, int i11);

    public abstract void h(C3334v4 c3334v4);

    public final int hashCode() {
        int iK = this.f29170a;
        if (iK == 0) {
            int iE = e();
            iK = k(iE, 0, iE);
            if (iK == 0) {
                iK = 1;
            }
            this.f29170a = iK;
        }
        return iK;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C3350x4(this);
    }

    public abstract int k(int i10, int i11, int i12);

    public final int n() {
        return this.f29170a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? W5.a(this) : W5.a(f(0, 47)).concat("..."));
    }
}
