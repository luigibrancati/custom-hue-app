package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import com.google.protobuf.Q0;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f32225a = 100;

    /* JADX INFO: renamed from: com.google.protobuf.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32226a;

        static {
            int[] iArr = new int[Q0.b.values().length];
            f32226a = iArr;
            try {
                iArr[Q0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32226a[Q0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32226a[Q0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32226a[Q0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32226a[Q0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32226a[Q0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32226a[Q0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32226a[Q0.b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32226a[Q0.b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32226a[Q0.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32226a[Q0.b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32226a[Q0.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32226a[Q0.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32226a[Q0.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32226a[Q0.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32226a[Q0.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32226a[Q0.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32226a[Q0.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f32228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f32229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final D f32230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32231e;

        public b(D d10) {
            d10.getClass();
            this.f32230d = d10;
        }
    }

    public static int A(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        X x10 = (X) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            x10.C0(bVar.f32228b);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        M m10 = (M) jVar;
        int iJ = J(bArr, i11, bVar);
        m10.x0(AbstractC3724k.c(bVar.f32227a));
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            m10.x0(AbstractC3724k.c(bVar.f32227a));
        }
        return iJ;
    }

    public static int C(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        X x10 = (X) jVar;
        int iM = M(bArr, i11, bVar);
        x10.C0(AbstractC3724k.d(bVar.f32228b));
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            x10.C0(AbstractC3724k.d(bVar.f32228b));
        }
        return iM;
    }

    public static int D(byte[] bArr, int i10, b bVar) throws O {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a;
        if (i11 < 0) {
            throw O.g();
        }
        if (i11 == 0) {
            bVar.f32229c = "";
            return iJ;
        }
        bVar.f32229c = new String(bArr, iJ, i11, N.f32140b);
        return iJ + i11;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) throws O {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f32227a;
        if (i13 < 0) {
            throw O.g();
        }
        if (i13 == 0) {
            jVar.add("");
        } else {
            jVar.add(new String(bArr, iJ, i13, N.f32140b));
            iJ += i13;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            int i14 = bVar.f32227a;
            if (i14 < 0) {
                throw O.g();
            }
            if (i14 == 0) {
                jVar.add("");
            } else {
                jVar.add(new String(bArr, iJ, i14, N.f32140b));
                iJ += i14;
            }
        }
        return iJ;
    }

    public static int F(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) throws O {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f32227a;
        if (i13 < 0) {
            throw O.g();
        }
        if (i13 == 0) {
            jVar.add("");
        } else {
            int i14 = iJ + i13;
            if (!O0.t(bArr, iJ, i14)) {
                throw O.d();
            }
            jVar.add(new String(bArr, iJ, i13, N.f32140b));
            iJ = i14;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            int i15 = bVar.f32227a;
            if (i15 < 0) {
                throw O.g();
            }
            if (i15 == 0) {
                jVar.add("");
            } else {
                int i16 = iJ + i15;
                if (!O0.t(bArr, iJ, i16)) {
                    throw O.d();
                }
                jVar.add(new String(bArr, iJ, i15, N.f32140b));
                iJ = i16;
            }
        }
        return iJ;
    }

    public static int G(byte[] bArr, int i10, b bVar) throws O {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a;
        if (i11 < 0) {
            throw O.g();
        }
        if (i11 == 0) {
            bVar.f32229c = "";
            return iJ;
        }
        bVar.f32229c = O0.h(bArr, iJ, i11);
        return iJ + i11;
    }

    public static int H(int i10, byte[] bArr, int i11, int i12, K0 k02, b bVar) throws O {
        if (Q0.a(i10) == 0) {
            throw O.c();
        }
        int iB = Q0.b(i10);
        if (iB == 0) {
            int iM = M(bArr, i11, bVar);
            k02.r(i10, Long.valueOf(bVar.f32228b));
            return iM;
        }
        if (iB == 1) {
            k02.r(i10, Long.valueOf(k(bArr, i11)));
            return i11 + 8;
        }
        if (iB == 2) {
            int iJ = J(bArr, i11, bVar);
            int i13 = bVar.f32227a;
            if (i13 < 0) {
                throw O.g();
            }
            if (i13 > bArr.length - iJ) {
                throw O.m();
            }
            if (i13 == 0) {
                k02.r(i10, AbstractC3722j.f32236b);
            } else {
                k02.r(i10, AbstractC3722j.l(bArr, iJ, i13));
            }
            return iJ + i13;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw O.c();
            }
            k02.r(i10, Integer.valueOf(i(bArr, i11)));
            return i11 + 4;
        }
        K0 k0O = K0.o();
        int i14 = (i10 & (-8)) | 4;
        int i15 = bVar.f32231e + 1;
        bVar.f32231e = i15;
        a(i15);
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iJ2 = J(bArr, i11, bVar);
            i16 = bVar.f32227a;
            if (i16 == i14) {
                i11 = iJ2;
                break;
            }
            i11 = H(i16, bArr, iJ2, i12, k0O, bVar);
        }
        bVar.f32231e--;
        if (i11 > i12 || i16 != i14) {
            throw O.h();
        }
        k02.r(i10, k0O);
        return i11;
    }

    public static int I(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f32227a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f32227a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f32227a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f32227a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f32227a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int J(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return I(b10, bArr, i11, bVar);
        }
        bVar.f32227a = b10;
        return i11;
    }

    public static int K(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        M m10 = (M) jVar;
        int iJ = J(bArr, i11, bVar);
        m10.x0(bVar.f32227a);
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            m10.x0(bVar.f32227a);
        }
        return iJ;
    }

    public static int L(long j10, byte[] bArr, int i10, b bVar) {
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
        bVar.f32228b = j11;
        return i11;
    }

    public static int M(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return L(j10, bArr, i11, bVar);
        }
        bVar.f32228b = j10;
        return i11;
    }

    public static int N(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        X x10 = (X) jVar;
        int iM = M(bArr, i11, bVar);
        x10.C0(bVar.f32228b);
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            x10.C0(bVar.f32228b);
        }
        return iM;
    }

    public static int O(Object obj, A0 a02, byte[] bArr, int i10, int i11, int i12, b bVar) throws O {
        int i13 = bVar.f32231e + 1;
        bVar.f32231e = i13;
        a(i13);
        int iD0 = ((C3723j0) a02).d0(obj, bArr, i10, i11, i12, bVar);
        bVar.f32231e--;
        bVar.f32229c = obj;
        return iD0;
    }

    public static int P(Object obj, A0 a02, byte[] bArr, int i10, int i11, b bVar) throws O {
        int I10 = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            I10 = I(i12, bArr, I10, bVar);
            i12 = bVar.f32227a;
        }
        int i13 = I10;
        if (i12 < 0 || i12 > i11 - i13) {
            throw O.m();
        }
        int i14 = bVar.f32231e + 1;
        bVar.f32231e = i14;
        a(i14);
        int i15 = i13 + i12;
        a02.i(obj, bArr, i13, i15, bVar);
        bVar.f32231e--;
        bVar.f32229c = obj;
        return i15;
    }

    public static int Q(int i10, byte[] bArr, int i11, int i12, b bVar) throws O {
        if (Q0.a(i10) == 0) {
            throw O.c();
        }
        int iB = Q0.b(i10);
        if (iB == 0) {
            return M(bArr, i11, bVar);
        }
        if (iB == 1) {
            return i11 + 8;
        }
        if (iB == 2) {
            return J(bArr, i11, bVar) + bVar.f32227a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i11 + 4;
            }
            throw O.c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = J(bArr, i11, bVar);
            i14 = bVar.f32227a;
            if (i14 == i13) {
                break;
            }
            i11 = Q(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw O.h();
        }
        return i11;
    }

    public static void a(int i10) throws O {
        if (i10 >= f32225a) {
            throw O.i();
        }
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        C3718h c3718h = (C3718h) jVar;
        int iM = M(bArr, i11, bVar);
        c3718h.h(bVar.f32228b != 0);
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            c3718h.h(bVar.f32228b != 0);
        }
        return iM;
    }

    public static int c(byte[] bArr, int i10, b bVar) throws O {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a;
        if (i11 < 0) {
            throw O.g();
        }
        if (i11 > bArr.length - iJ) {
            throw O.m();
        }
        if (i11 == 0) {
            bVar.f32229c = AbstractC3722j.f32236b;
            return iJ;
        }
        bVar.f32229c = AbstractC3722j.l(bArr, iJ, i11);
        return iJ + i11;
    }

    public static int d(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) throws O {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f32227a;
        if (i13 < 0) {
            throw O.g();
        }
        if (i13 > bArr.length - iJ) {
            throw O.m();
        }
        if (i13 == 0) {
            jVar.add(AbstractC3722j.f32236b);
        } else {
            jVar.add(AbstractC3722j.l(bArr, iJ, i13));
            iJ += i13;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            int i14 = bVar.f32227a;
            if (i14 < 0) {
                throw O.g();
            }
            if (i14 > bArr.length - iJ) {
                throw O.m();
            }
            if (i14 == 0) {
                jVar.add(AbstractC3722j.f32236b);
            } else {
                jVar.add(AbstractC3722j.l(bArr, iJ, i14));
                iJ += i14;
            }
        }
        return iJ;
    }

    public static double e(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        C3745y c3745y = (C3745y) jVar;
        c3745y.G0(e(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            c3745y.G0(e(bArr, iJ));
            i13 = iJ + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.f fVar, J0 j02, b bVar) throws O {
        int i13;
        int i14;
        I i15 = extendableMessage.extensions;
        int i16 = i10 >>> 3;
        if (fVar.f32103d.f() && fVar.f32103d.h()) {
            switch (a.f32226a[fVar.d().ordinal()]) {
                case 1:
                    C3745y c3745y = new C3745y();
                    int iT = t(bArr, i11, c3745y, bVar);
                    i15.C(fVar.f32103d, c3745y);
                    return iT;
                case 2:
                    K k10 = new K();
                    int iW = w(bArr, i11, k10, bVar);
                    i15.C(fVar.f32103d, k10);
                    return iW;
                case 3:
                case 4:
                    X x10 = new X();
                    int iA = A(bArr, i11, x10, bVar);
                    i15.C(fVar.f32103d, x10);
                    return iA;
                case 5:
                case 6:
                    M m10 = new M();
                    int iZ = z(bArr, i11, m10, bVar);
                    i15.C(fVar.f32103d, m10);
                    return iZ;
                case 7:
                case 8:
                    X x11 = new X();
                    int iV = v(bArr, i11, x11, bVar);
                    i15.C(fVar.f32103d, x11);
                    return iV;
                case 9:
                case 10:
                    M m11 = new M();
                    int iU = u(bArr, i11, m11, bVar);
                    i15.C(fVar.f32103d, m11);
                    return iU;
                case 11:
                    C3718h c3718h = new C3718h();
                    int iS = s(bArr, i11, c3718h, bVar);
                    i15.C(fVar.f32103d, c3718h);
                    return iS;
                case 12:
                    M m12 = new M();
                    int iX = x(bArr, i11, m12, bVar);
                    i15.C(fVar.f32103d, m12);
                    return iX;
                case 13:
                    X x12 = new X();
                    int iY = y(bArr, i11, x12, bVar);
                    i15.C(fVar.f32103d, x12);
                    return iY;
                case 14:
                    M m13 = new M();
                    int iZ2 = z(bArr, i11, m13, bVar);
                    C0.z(extendableMessage, i16, m13, fVar.f32103d.b(), null, j02);
                    i15.C(fVar.f32103d, m13);
                    return iZ2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + fVar.f32103d.g());
            }
        }
        Object objValueOf = null;
        if (fVar.d() == Q0.b.ENUM) {
            i11 = J(bArr, i11, bVar);
            if (fVar.f32103d.b().findValueByNumber(bVar.f32227a) == null) {
                C0.J(extendableMessage, i16, bVar.f32227a, null, j02);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar.f32227a);
        } else {
            switch (a.f32226a[fVar.d().ordinal()]) {
                case 1:
                    i13 = i11;
                    objValueOf = Double.valueOf(e(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 2:
                    i14 = i11;
                    objValueOf = Float.valueOf(m(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 3:
                case 4:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.f32228b);
                    break;
                case 5:
                case 6:
                    i11 = J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f32227a);
                    break;
                case 7:
                case 8:
                    i13 = i11;
                    objValueOf = Long.valueOf(k(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 9:
                case 10:
                    i14 = i11;
                    objValueOf = Integer.valueOf(i(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 11:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.f32228b != 0);
                    break;
                case 12:
                    i11 = J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(AbstractC3724k.c(bVar.f32227a));
                    break;
                case 13:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(AbstractC3724k.d(bVar.f32228b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = c(bArr, i11, bVar);
                    objValueOf = bVar.f32229c;
                    break;
                case 16:
                    i11 = D(bArr, i11, bVar);
                    objValueOf = bVar.f32229c;
                    break;
                case 17:
                    int i17 = (i16 << 3) | 4;
                    A0 a0C = w0.a().c(fVar.e().getClass());
                    if (fVar.g()) {
                        int iO = o(a0C, bArr, i11, i12, i17, bVar);
                        i15.a(fVar.f32103d, bVar.f32229c);
                        return iO;
                    }
                    Object objI = i15.i(fVar.f32103d);
                    if (objI == null) {
                        objI = a0C.newInstance();
                        i15.C(fVar.f32103d, objI);
                    }
                    return O(objI, a0C, bArr, i11, i12, i17, bVar);
                case 18:
                    A0 a0C2 = w0.a().c(fVar.e().getClass());
                    if (fVar.g()) {
                        int iQ = q(a0C2, bArr, i11, i12, bVar);
                        i15.a(fVar.f32103d, bVar.f32229c);
                        return iQ;
                    }
                    Object objI2 = i15.i(fVar.f32103d);
                    if (objI2 == null) {
                        objI2 = a0C2.newInstance();
                        i15.C(fVar.f32103d, objI2);
                    }
                    return P(objI2, a0C2, bArr, i11, i12, bVar);
            }
        }
        if (fVar.g()) {
            i15.a(fVar.f32103d, objValueOf);
            return i11;
        }
        i15.C(fVar.f32103d, objValueOf);
        return i11;
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, Object obj, InterfaceC3717g0 interfaceC3717g0, J0 j02, b bVar) {
        GeneratedMessageLite.f fVarA = bVar.f32230d.a(interfaceC3717g0, i10 >>> 3);
        if (fVarA == null) {
            return H(i10, bArr, i11, i12, C3723j0.w(obj), bVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return g(i10, bArr, i11, i12, extendableMessage, fVarA, j02, bVar);
    }

    public static int i(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & ForkServer.ERROR) << 24) | (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16);
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        M m10 = (M) jVar;
        m10.x0(i(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            m10.x0(i(bArr, iJ));
            i13 = iJ + 4;
        }
        return i13;
    }

    public static long k(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        X x10 = (X) jVar;
        x10.C0(k(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            x10.C0(k(bArr, iJ));
            i13 = iJ + 8;
        }
        return i13;
    }

    public static float m(byte[] bArr, int i10) {
        return Float.intBitsToFloat(i(bArr, i10));
    }

    public static int n(int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) {
        K k10 = (K) jVar;
        k10.f(m(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            k10.f(m(bArr, iJ));
            i13 = iJ + 4;
        }
        return i13;
    }

    public static int o(A0 a02, byte[] bArr, int i10, int i11, int i12, b bVar) throws O {
        Object objNewInstance = a02.newInstance();
        int iO = O(objNewInstance, a02, bArr, i10, i11, i12, bVar);
        a02.b(objNewInstance);
        bVar.f32229c = objNewInstance;
        return iO;
    }

    public static int p(A0 a02, int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) throws O {
        int i13 = (i10 & (-8)) | 4;
        int iO = o(a02, bArr, i11, i12, i13, bVar);
        jVar.add(bVar.f32229c);
        while (iO < i12) {
            int iJ = J(bArr, iO, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iO = o(a02, bArr, iJ, i12, i13, bVar);
            jVar.add(bVar.f32229c);
        }
        return iO;
    }

    public static int q(A0 a02, byte[] bArr, int i10, int i11, b bVar) throws O {
        Object objNewInstance = a02.newInstance();
        int iP = P(objNewInstance, a02, bArr, i10, i11, bVar);
        a02.b(objNewInstance);
        bVar.f32229c = objNewInstance;
        return iP;
    }

    public static int r(A0 a02, int i10, byte[] bArr, int i11, int i12, N.j jVar, b bVar) throws O {
        int iQ = q(a02, bArr, i11, i12, bVar);
        jVar.add(bVar.f32229c);
        while (iQ < i12) {
            int iJ = J(bArr, iQ, bVar);
            if (i10 != bVar.f32227a) {
                break;
            }
            iQ = q(a02, bArr, iJ, i12, bVar);
            jVar.add(bVar.f32229c);
        }
        return iQ;
    }

    public static int s(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        C3718h c3718h = (C3718h) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            c3718h.h(bVar.f32228b != 0);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int t(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        C3745y c3745y = (C3745y) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            c3745y.G0(e(bArr, iJ));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int u(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        M m10 = (M) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            m10.x0(i(bArr, iJ));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int v(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        X x10 = (X) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            x10.C0(k(bArr, iJ));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int w(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        K k10 = (K) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            k10.f(m(bArr, iJ));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int x(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        M m10 = (M) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, bVar);
            m10.x0(AbstractC3724k.c(bVar.f32227a));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int y(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        X x10 = (X) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            x10.C0(AbstractC3724k.d(bVar.f32228b));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }

    public static int z(byte[] bArr, int i10, N.j jVar, b bVar) throws O {
        M m10 = (M) jVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f32227a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, bVar);
            m10.x0(bVar.f32227a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw O.m();
    }
}
