package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G0 f29754b = new F0(AbstractC3446p1.f29897b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29755a = 0;

    static {
        int i10 = AbstractC3469u0.f29942a;
    }

    public static G0 A(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = inputStream.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            G0 g0Z = i10 == 0 ? null : z(bArr, 0, i10);
            if (g0Z == null) {
                break;
            }
            arrayList.add(g0Z);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f29754b : e(arrayList.iterator(), size);
    }

    public static void E(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static G0 e(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (G0) it.next();
        }
        int i11 = i10 >>> 1;
        G0 g0E = e(it, i11);
        G0 g0E2 = e(it, i10 - i11);
        if (Integer.MAX_VALUE - g0E.f() >= g0E2.f()) {
            return C3377b2.O(g0E, g0E2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + g0E.f() + "+" + g0E2.f());
    }

    public static int w(int i10, int i11, int i12) {
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

    public static G0 z(byte[] bArr, int i10, int i11) {
        w(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new F0(bArr2);
    }

    public final String B() {
        return f() == 0 ? "" : s(AbstractC3446p1.f29896a);
    }

    public final void I(byte[] bArr, int i10, int i11, int i12) {
        w(0, i12, f());
        w(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            h(bArr, 0, i11, i12);
        }
    }

    public final byte[] J() {
        int iF = f();
        if (iF == 0) {
            return AbstractC3446p1.f29897b;
        }
        byte[] bArr = new byte[iF];
        h(bArr, 0, 0, iF);
        return bArr;
    }

    public abstract byte c(int i10);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract void h(byte[] bArr, int i10, int i11, int i12);

    public final int hashCode() {
        int iN = this.f29755a;
        if (iN == 0) {
            int iF = f();
            iN = n(iF, 0, iF);
            if (iN == 0) {
                iN = 1;
            }
            this.f29755a = iN;
        }
        return iN;
    }

    public abstract int k();

    public abstract boolean l();

    public abstract int n(int i10, int i11, int i12);

    public abstract int p(int i10, int i11, int i12);

    public abstract G0 r(int i10, int i11);

    public abstract String s(Charset charset);

    public abstract void t(C3484x0 c3484x0);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f()), f() <= 50 ? AbstractC3437n2.a(this) : AbstractC3437n2.a(r(0, 47)).concat("..."));
    }

    public abstract boolean v();

    public final int x() {
        return this.f29755a;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C0 iterator() {
        return new C3489y0(this);
    }
}
