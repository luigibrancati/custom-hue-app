package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3658e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f31442a = 100;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f31444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C3669p f31446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f31447e;

        public a(C3669p c3669p) {
            c3669p.getClass();
            this.f31446d = c3669p;
        }
    }

    public static int A(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        AbstractC3677y abstractC3677y = (AbstractC3677y) dVar;
        int I10 = I(bArr, i11, aVar);
        abstractC3677y.x0(AbstractC3662i.d(aVar.f31443a));
        while (I10 < i12) {
            int I11 = I(bArr, I10, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            I10 = I(bArr, I11, aVar);
            abstractC3677y.x0(AbstractC3662i.d(aVar.f31443a));
        }
        return I10;
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        H h10 = (H) dVar;
        int iL = L(bArr, i11, aVar);
        h10.C0(AbstractC3662i.e(aVar.f31444b));
        while (iL < i12) {
            int I10 = I(bArr, iL, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            iL = L(bArr, I10, aVar);
            h10.C0(AbstractC3662i.e(aVar.f31444b));
        }
        return iL;
    }

    public static int C(byte[] bArr, int i10, a aVar) throws A {
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a;
        if (i11 < 0) {
            throw A.g();
        }
        if (i11 == 0) {
            aVar.f31445c = "";
            return I10;
        }
        aVar.f31445c = new String(bArr, I10, i11, AbstractC3678z.f31578b);
        return I10 + i11;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) throws A {
        int I10 = I(bArr, i11, aVar);
        int i13 = aVar.f31443a;
        if (i13 < 0) {
            throw A.g();
        }
        if (i13 == 0) {
            dVar.add("");
        } else {
            dVar.add(new String(bArr, I10, i13, AbstractC3678z.f31578b));
            I10 += i13;
        }
        while (I10 < i12) {
            int I11 = I(bArr, I10, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            I10 = I(bArr, I11, aVar);
            int i14 = aVar.f31443a;
            if (i14 < 0) {
                throw A.g();
            }
            if (i14 == 0) {
                dVar.add("");
            } else {
                dVar.add(new String(bArr, I10, i14, AbstractC3678z.f31578b));
                I10 += i14;
            }
        }
        return I10;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) throws A {
        int I10 = I(bArr, i11, aVar);
        int i13 = aVar.f31443a;
        if (i13 < 0) {
            throw A.g();
        }
        if (i13 == 0) {
            dVar.add("");
        } else {
            int i14 = I10 + i13;
            if (!q0.m(bArr, I10, i14)) {
                throw A.d();
            }
            dVar.add(new String(bArr, I10, i13, AbstractC3678z.f31578b));
            I10 = i14;
        }
        while (I10 < i12) {
            int I11 = I(bArr, I10, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            I10 = I(bArr, I11, aVar);
            int i15 = aVar.f31443a;
            if (i15 < 0) {
                throw A.g();
            }
            if (i15 == 0) {
                dVar.add("");
            } else {
                int i16 = I10 + i15;
                if (!q0.m(bArr, I10, i16)) {
                    throw A.d();
                }
                dVar.add(new String(bArr, I10, i15, AbstractC3678z.f31578b));
                I10 = i16;
            }
        }
        return I10;
    }

    public static int F(byte[] bArr, int i10, a aVar) throws A {
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a;
        if (i11 < 0) {
            throw A.g();
        }
        if (i11 == 0) {
            aVar.f31445c = "";
            return I10;
        }
        aVar.f31445c = q0.e(bArr, I10, i11);
        return I10 + i11;
    }

    public static int G(int i10, byte[] bArr, int i11, int i12, n0 n0Var, a aVar) throws A {
        if (r0.a(i10) == 0) {
            throw A.c();
        }
        int iB = r0.b(i10);
        if (iB == 0) {
            int iL = L(bArr, i11, aVar);
            n0Var.n(i10, Long.valueOf(aVar.f31444b));
            return iL;
        }
        if (iB == 1) {
            n0Var.n(i10, Long.valueOf(j(bArr, i11)));
            return i11 + 8;
        }
        if (iB == 2) {
            int I10 = I(bArr, i11, aVar);
            int i13 = aVar.f31443a;
            if (i13 < 0) {
                throw A.g();
            }
            if (i13 > bArr.length - I10) {
                throw A.m();
            }
            if (i13 == 0) {
                n0Var.n(i10, AbstractC3661h.f31448b);
            } else {
                n0Var.n(i10, AbstractC3661h.k(bArr, I10, i13));
            }
            return I10 + i13;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw A.c();
            }
            n0Var.n(i10, Integer.valueOf(h(bArr, i11)));
            return i11 + 4;
        }
        n0 n0VarK = n0.k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = aVar.f31447e + 1;
        aVar.f31447e = i15;
        a(i15);
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int I11 = I(bArr, i11, aVar);
            i16 = aVar.f31443a;
            if (i16 == i14) {
                i11 = I11;
                break;
            }
            i11 = G(i16, bArr, I11, i12, n0VarK, aVar);
        }
        aVar.f31447e--;
        if (i11 > i12 || i16 != i14) {
            throw A.h();
        }
        n0Var.n(i10, n0VarK);
        return i11;
    }

    public static int H(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f31443a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f31443a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f31443a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f31443a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                aVar.f31443a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int I(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return H(b10, bArr, i11, aVar);
        }
        aVar.f31443a = b10;
        return i11;
    }

    public static int J(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        AbstractC3677y abstractC3677y = (AbstractC3677y) dVar;
        int I10 = I(bArr, i11, aVar);
        abstractC3677y.x0(aVar.f31443a);
        while (I10 < i12) {
            int I11 = I(bArr, I10, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            I10 = I(bArr, I11, aVar);
            abstractC3677y.x0(aVar.f31443a);
        }
        return I10;
    }

    public static int K(long j10, byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & 127)) << i12;
            i11 = i13;
            b10 = b11;
        }
        aVar.f31444b = j11;
        return i11;
    }

    public static int L(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return K(j10, bArr, i11, aVar);
        }
        aVar.f31444b = j10;
        return i11;
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        H h10 = (H) dVar;
        int iL = L(bArr, i11, aVar);
        h10.C0(aVar.f31444b);
        while (iL < i12) {
            int I10 = I(bArr, iL, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            iL = L(bArr, I10, aVar);
            h10.C0(aVar.f31444b);
        }
        return iL;
    }

    public static int N(Object obj, f0 f0Var, byte[] bArr, int i10, int i11, int i12, a aVar) throws A {
        int i13 = aVar.f31447e + 1;
        aVar.f31447e = i13;
        a(i13);
        int iB0 = ((U) f0Var).b0(obj, bArr, i10, i11, i12, aVar);
        aVar.f31447e--;
        aVar.f31445c = obj;
        return iB0;
    }

    public static int O(Object obj, f0 f0Var, byte[] bArr, int i10, int i11, a aVar) throws A {
        int iH = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iH = H(i12, bArr, iH, aVar);
            i12 = aVar.f31443a;
        }
        int i13 = iH;
        if (i12 < 0 || i12 > i11 - i13) {
            throw A.m();
        }
        int i14 = aVar.f31447e + 1;
        aVar.f31447e = i14;
        a(i14);
        int i15 = i13 + i12;
        f0Var.g(obj, bArr, i13, i15, aVar);
        aVar.f31447e--;
        aVar.f31445c = obj;
        return i15;
    }

    public static int P(int i10, byte[] bArr, int i11, int i12, a aVar) throws A {
        if (r0.a(i10) == 0) {
            throw A.c();
        }
        int iB = r0.b(i10);
        if (iB == 0) {
            return L(bArr, i11, aVar);
        }
        if (iB == 1) {
            return i11 + 8;
        }
        if (iB == 2) {
            return I(bArr, i11, aVar) + aVar.f31443a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i11 + 4;
            }
            throw A.c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = I(bArr, i11, aVar);
            i14 = aVar.f31443a;
            if (i14 == i13) {
                break;
            }
            i11 = P(i14, bArr, i11, i12, aVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw A.h();
        }
        return i11;
    }

    public static void a(int i10) throws A {
        if (i10 >= f31442a) {
            throw A.i();
        }
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        AbstractC3659f abstractC3659f = (AbstractC3659f) dVar;
        int iL = L(bArr, i11, aVar);
        abstractC3659f.d(aVar.f31444b != 0);
        while (iL < i12) {
            int I10 = I(bArr, iL, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            iL = L(bArr, I10, aVar);
            abstractC3659f.d(aVar.f31444b != 0);
        }
        return iL;
    }

    public static int c(byte[] bArr, int i10, a aVar) throws A {
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a;
        if (i11 < 0) {
            throw A.g();
        }
        if (i11 > bArr.length - I10) {
            throw A.m();
        }
        if (i11 == 0) {
            aVar.f31445c = AbstractC3661h.f31448b;
            return I10;
        }
        aVar.f31445c = AbstractC3661h.k(bArr, I10, i11);
        return I10 + i11;
    }

    public static int d(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) throws A {
        int I10 = I(bArr, i11, aVar);
        int i13 = aVar.f31443a;
        if (i13 < 0) {
            throw A.g();
        }
        if (i13 > bArr.length - I10) {
            throw A.m();
        }
        if (i13 == 0) {
            dVar.add(AbstractC3661h.f31448b);
        } else {
            dVar.add(AbstractC3661h.k(bArr, I10, i13));
            I10 += i13;
        }
        while (I10 < i12) {
            int I11 = I(bArr, I10, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            I10 = I(bArr, I11, aVar);
            int i14 = aVar.f31443a;
            if (i14 < 0) {
                throw A.g();
            }
            if (i14 > bArr.length - I10) {
                throw A.m();
            }
            if (i14 == 0) {
                dVar.add(AbstractC3661h.f31448b);
            } else {
                dVar.add(AbstractC3661h.k(bArr, I10, i14));
                I10 += i14;
            }
        }
        return I10;
    }

    public static double e(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        AbstractC3666m abstractC3666m = (AbstractC3666m) dVar;
        abstractC3666m.G0(e(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I10 = I(bArr, i13, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            abstractC3666m.G0(e(bArr, I10));
            i13 = I10 + 8;
        }
        return i13;
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, Object obj, Q q10, m0 m0Var, a aVar) {
        aVar.f31446d.a(q10, i10 >>> 3);
        return G(i10, bArr, i11, i12, U.u(obj), aVar);
    }

    public static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & ForkServer.ERROR) << 24) | (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16);
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        AbstractC3677y abstractC3677y = (AbstractC3677y) dVar;
        abstractC3677y.x0(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I10 = I(bArr, i13, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            abstractC3677y.x0(h(bArr, I10));
            i13 = I10 + 4;
        }
        return i13;
    }

    public static long j(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        H h10 = (H) dVar;
        h10.C0(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I10 = I(bArr, i13, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            h10.C0(j(bArr, I10));
            i13 = I10 + 8;
        }
        return i13;
    }

    public static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    public static int m(int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) {
        AbstractC3674v abstractC3674v = (AbstractC3674v) dVar;
        abstractC3674v.d(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I10 = I(bArr, i13, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            abstractC3674v.d(l(bArr, I10));
            i13 = I10 + 4;
        }
        return i13;
    }

    public static int n(f0 f0Var, byte[] bArr, int i10, int i11, int i12, a aVar) throws A {
        Object objNewInstance = f0Var.newInstance();
        int iN = N(objNewInstance, f0Var, bArr, i10, i11, i12, aVar);
        f0Var.b(objNewInstance);
        aVar.f31445c = objNewInstance;
        return iN;
    }

    public static int o(f0 f0Var, int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) throws A {
        int i13 = (i10 & (-8)) | 4;
        int iN = n(f0Var, bArr, i11, i12, i13, aVar);
        dVar.add(aVar.f31445c);
        while (iN < i12) {
            int I10 = I(bArr, iN, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            iN = n(f0Var, bArr, I10, i12, i13, aVar);
            dVar.add(aVar.f31445c);
        }
        return iN;
    }

    public static int p(f0 f0Var, byte[] bArr, int i10, int i11, a aVar) throws A {
        Object objNewInstance = f0Var.newInstance();
        int iO = O(objNewInstance, f0Var, bArr, i10, i11, aVar);
        f0Var.b(objNewInstance);
        aVar.f31445c = objNewInstance;
        return iO;
    }

    public static int q(f0 f0Var, int i10, byte[] bArr, int i11, int i12, AbstractC3678z.d dVar, a aVar) throws A {
        int iP = p(f0Var, bArr, i11, i12, aVar);
        dVar.add(aVar.f31445c);
        while (iP < i12) {
            int I10 = I(bArr, iP, aVar);
            if (i10 != aVar.f31443a) {
                break;
            }
            iP = p(f0Var, bArr, I10, i12, aVar);
            dVar.add(aVar.f31445c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        AbstractC3659f abstractC3659f = (AbstractC3659f) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a + I10;
        while (I10 < i11) {
            I10 = L(bArr, I10, aVar);
            abstractC3659f.d(aVar.f31444b != 0);
        }
        if (I10 == i11) {
            return I10;
        }
        throw A.m();
    }

    public static int s(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        AbstractC3666m abstractC3666m = (AbstractC3666m) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a;
        int i12 = I10 + i11;
        if (i12 > bArr.length) {
            throw A.m();
        }
        abstractC3666m.d(abstractC3666m.size() + (i11 / 8));
        while (I10 < i12) {
            abstractC3666m.G0(e(bArr, I10));
            I10 += 8;
        }
        if (I10 == i12) {
            return I10;
        }
        throw A.m();
    }

    public static int t(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        AbstractC3677y abstractC3677y = (AbstractC3677y) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a;
        int i12 = I10 + i11;
        if (i12 > bArr.length) {
            throw A.m();
        }
        abstractC3677y.d(abstractC3677y.size() + (i11 / 4));
        while (I10 < i12) {
            abstractC3677y.x0(h(bArr, I10));
            I10 += 4;
        }
        if (I10 == i12) {
            return I10;
        }
        throw A.m();
    }

    public static int u(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        H h10 = (H) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a;
        int i12 = I10 + i11;
        if (i12 > bArr.length) {
            throw A.m();
        }
        h10.d(h10.size() + (i11 / 8));
        while (I10 < i12) {
            h10.C0(j(bArr, I10));
            I10 += 8;
        }
        if (I10 == i12) {
            return I10;
        }
        throw A.m();
    }

    public static int v(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        AbstractC3674v abstractC3674v = (AbstractC3674v) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a;
        int i12 = I10 + i11;
        if (i12 > bArr.length) {
            throw A.m();
        }
        abstractC3674v.e(abstractC3674v.size() + (i11 / 4));
        while (I10 < i12) {
            abstractC3674v.d(l(bArr, I10));
            I10 += 4;
        }
        if (I10 == i12) {
            return I10;
        }
        throw A.m();
    }

    public static int w(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        AbstractC3677y abstractC3677y = (AbstractC3677y) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a + I10;
        while (I10 < i11) {
            I10 = I(bArr, I10, aVar);
            abstractC3677y.x0(AbstractC3662i.d(aVar.f31443a));
        }
        if (I10 == i11) {
            return I10;
        }
        throw A.m();
    }

    public static int x(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        H h10 = (H) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a + I10;
        while (I10 < i11) {
            I10 = L(bArr, I10, aVar);
            h10.C0(AbstractC3662i.e(aVar.f31444b));
        }
        if (I10 == i11) {
            return I10;
        }
        throw A.m();
    }

    public static int y(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        AbstractC3677y abstractC3677y = (AbstractC3677y) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a + I10;
        while (I10 < i11) {
            I10 = I(bArr, I10, aVar);
            abstractC3677y.x0(aVar.f31443a);
        }
        if (I10 == i11) {
            return I10;
        }
        throw A.m();
    }

    public static int z(byte[] bArr, int i10, AbstractC3678z.d dVar, a aVar) throws A {
        H h10 = (H) dVar;
        int I10 = I(bArr, i10, aVar);
        int i11 = aVar.f31443a + I10;
        while (I10 < i11) {
            I10 = L(bArr, I10, aVar);
            h10.C0(aVar.f31444b);
        }
        if (I10 == i11) {
            return I10;
        }
        throw A.m();
    }
}
