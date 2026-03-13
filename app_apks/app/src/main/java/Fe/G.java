package Fe;

import gc.C4202o;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class G extends C0846h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient byte[][] f4077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f4078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(byte[][] segments, int[] directory) {
        super(C0846h.f4118e.s());
        AbstractC4862t.e(segments, "segments");
        AbstractC4862t.e(directory, "directory");
        this.f4077f = segments;
        this.f4078g = directory;
    }

    @Override // Fe.C0846h
    public byte[] B() {
        return V();
    }

    @Override // Fe.C0846h
    public byte C(int i10) {
        AbstractC0840b.b(T()[U().length - 1], i10, 1L);
        int iB = Ge.e.b(this, i10);
        return U()[iB][(i10 - (iB == 0 ? 0 : T()[iB - 1])) + T()[U().length + iB]];
    }

    @Override // Fe.C0846h
    public int E(byte[] other, int i10) {
        AbstractC4862t.e(other, "other");
        return W().E(other, i10);
    }

    @Override // Fe.C0846h
    public boolean I(int i10, C0846h other, int i11, int i12) {
        AbstractC4862t.e(other, "other");
        if (i10 < 0 || i10 > size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = Ge.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : T()[iB - 1];
            int i15 = T()[iB] - i14;
            int i16 = T()[U().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.J(i11, U()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // Fe.C0846h
    public boolean J(int i10, byte[] other, int i11, int i12) {
        AbstractC4862t.e(other, "other");
        if (i10 < 0 || i10 > size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = Ge.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : T()[iB - 1];
            int i15 = T()[iB] - i14;
            int i16 = T()[U().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC0840b.a(U()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // Fe.C0846h
    public C0846h O(int i10, int i11) {
        int iD = AbstractC0840b.d(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iD > size()) {
            throw new IllegalArgumentException(("endIndex=" + iD + " > length(" + size() + ')').toString());
        }
        int i12 = iD - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iD + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iD == size()) {
            return this;
        }
        if (i10 == iD) {
            return C0846h.f4118e;
        }
        int iB = Ge.e.b(this, i10);
        int iB2 = Ge.e.b(this, iD - 1);
        byte[][] bArr = (byte[][]) C4202o.u(U(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(T()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = T()[U().length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? T()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new G(bArr, iArr);
    }

    @Override // Fe.C0846h
    public C0846h Q() {
        return W().Q();
    }

    @Override // Fe.C0846h
    public void S(C0843e buffer, int i10, int i11) {
        AbstractC4862t.e(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = Ge.e.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : T()[iB - 1];
            int i14 = T()[iB] - i13;
            int i15 = T()[U().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            E e10 = new E(U()[iB], i16, i16 + iMin, true, false);
            E e11 = buffer.f4108a;
            if (e11 == null) {
                e10.f4071g = e10;
                e10.f4070f = e10;
                buffer.f4108a = e10;
            } else {
                AbstractC4862t.b(e11);
                E e12 = e11.f4071g;
                AbstractC4862t.b(e12);
                e12.c(e10);
            }
            i10 += iMin;
            iB++;
        }
        buffer.C0(buffer.size() + ((long) i11));
    }

    public final int[] T() {
        return this.f4078g;
    }

    public final byte[][] U() {
        return this.f4077f;
    }

    public byte[] V() {
        byte[] bArr = new byte[size()];
        int length = U().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = T()[length + i10];
            int i14 = T()[i10];
            int i15 = i14 - i11;
            C4202o.i(U()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final C0846h W() {
        return new C0846h(V());
    }

    @Override // Fe.C0846h
    public String a() {
        return W().a();
    }

    @Override // Fe.C0846h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0846h) {
            C0846h c0846h = (C0846h) obj;
            if (c0846h.size() == size() && I(0, c0846h, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // Fe.C0846h
    public int hashCode() {
        int iU = u();
        if (iU != 0) {
            return iU;
        }
        int length = U().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = T()[length + i10];
            int i14 = T()[i10];
            byte[] bArr = U()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        K(i11);
        return i11;
    }

    @Override // Fe.C0846h
    public C0846h j(String algorithm) throws NoSuchAlgorithmException {
        AbstractC4862t.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = U().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = T()[length + i10];
            int i13 = T()[i10];
            messageDigest.update(U()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC4862t.b(bArrDigest);
        return new C0846h(bArrDigest);
    }

    @Override // Fe.C0846h
    public String toString() {
        return W().toString();
    }

    @Override // Fe.C0846h
    public int v() {
        return T()[U().length - 1];
    }

    @Override // Fe.C0846h
    public String x() {
        return W().x();
    }

    @Override // Fe.C0846h
    public int z(byte[] other, int i10) {
        AbstractC4862t.e(other, "other");
        return W().z(other, i10);
    }
}
