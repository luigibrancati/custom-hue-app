package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3479w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f29955a = 100;

    public static int a(byte[] bArr, int i10, C3474v0 c3474v0) throws C3455r1 {
        int iJ = j(bArr, i10, c3474v0);
        int i11 = c3474v0.f29947a;
        if (i11 < 0) {
            throw new C3455r1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iJ) {
            throw new C3455r1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c3474v0.f29949c = G0.f29754b;
            return iJ;
        }
        c3474v0.f29949c = G0.z(bArr, iJ, i11);
        return iJ + i11;
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, AbstractC3391e1 abstractC3391e1, C3401g1 c3401g1, AbstractC3447p2 abstractC3447p2, C3474v0 c3474v0) throws C3455r1 {
        X0 x02 = abstractC3391e1.zzb;
        D2 d22 = c3401g1.f29854b.f29851b;
        Object objValueOf = null;
        if (d22 == D2.zzn) {
            j(bArr, i11, c3474v0);
            throw null;
        }
        switch (d22.ordinal()) {
            case 0:
                i11 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(q(bArr, i11)));
                break;
            case 1:
                i11 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(c(bArr, i11)));
                break;
            case 2:
            case 3:
                i11 = m(bArr, i11, c3474v0);
                objValueOf = Long.valueOf(c3474v0.f29948b);
                break;
            case 4:
            case 12:
                i11 = j(bArr, i11, c3474v0);
                objValueOf = Integer.valueOf(c3474v0.f29947a);
                break;
            case 5:
            case 15:
                i11 += 8;
                objValueOf = Long.valueOf(q(bArr, i11));
                break;
            case 6:
            case 14:
                i11 += 4;
                objValueOf = Integer.valueOf(c(bArr, i11));
                break;
            case 7:
                i11 = m(bArr, i11, c3474v0);
                objValueOf = Boolean.valueOf(c3474v0.f29948b != 0);
                break;
            case 8:
                i11 = h(bArr, i11, c3474v0);
                objValueOf = c3474v0.f29949c;
                break;
            case 9:
                int i13 = ((i10 >>> 3) << 3) | 4;
                InterfaceC3382c2 interfaceC3382c2B = R1.a().b(c3401g1.f29853a.getClass());
                Object objE = x02.e(c3401g1.f29854b);
                if (objE == null) {
                    objE = interfaceC3382c2B.d();
                    x02.i(c3401g1.f29854b, objE);
                }
                return n(objE, interfaceC3382c2B, bArr, i11, i12, i13, c3474v0);
            case 10:
                InterfaceC3382c2 interfaceC3382c2B2 = R1.a().b(c3401g1.f29853a.getClass());
                Object objE2 = x02.e(c3401g1.f29854b);
                if (objE2 == null) {
                    objE2 = interfaceC3382c2B2.d();
                    x02.i(c3401g1.f29854b, objE2);
                }
                return o(objE2, interfaceC3382c2B2, bArr, i11, i12, c3474v0);
            case 11:
                i11 = a(bArr, i11, c3474v0);
                objValueOf = c3474v0.f29949c;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i11 = j(bArr, i11, c3474v0);
                objValueOf = Integer.valueOf(K0.a(c3474v0.f29947a));
                break;
            case 17:
                i11 = m(bArr, i11, c3474v0);
                objValueOf = Long.valueOf(K0.b(c3474v0.f29948b));
                break;
        }
        x02.i(c3401g1.f29854b, objValueOf);
        return i11;
    }

    public static int c(byte[] bArr, int i10) {
        int i11 = bArr[i10] & ForkServer.ERROR;
        int i12 = bArr[i10 + 1] & ForkServer.ERROR;
        int i13 = bArr[i10 + 2] & ForkServer.ERROR;
        return ((bArr[i10 + 3] & ForkServer.ERROR) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int d(InterfaceC3382c2 interfaceC3382c2, byte[] bArr, int i10, int i11, int i12, C3474v0 c3474v0) throws C3455r1 {
        Object objD = interfaceC3382c2.d();
        int iN = n(objD, interfaceC3382c2, bArr, i10, i11, i12, c3474v0);
        interfaceC3382c2.c(objD);
        c3474v0.f29949c = objD;
        return iN;
    }

    public static int e(InterfaceC3382c2 interfaceC3382c2, byte[] bArr, int i10, int i11, C3474v0 c3474v0) throws C3455r1 {
        Object objD = interfaceC3382c2.d();
        int iO = o(objD, interfaceC3382c2, bArr, i10, i11, c3474v0);
        interfaceC3382c2.c(objD);
        c3474v0.f29949c = objD;
        return iO;
    }

    public static int f(InterfaceC3382c2 interfaceC3382c2, int i10, byte[] bArr, int i11, int i12, InterfaceC3441o1 interfaceC3441o1, C3474v0 c3474v0) throws C3455r1 {
        int iE = e(interfaceC3382c2, bArr, i11, i12, c3474v0);
        interfaceC3441o1.add(c3474v0.f29949c);
        while (iE < i12) {
            int iJ = j(bArr, iE, c3474v0);
            if (i10 != c3474v0.f29947a) {
                break;
            }
            iE = e(interfaceC3382c2, bArr, iJ, i12, c3474v0);
            interfaceC3441o1.add(c3474v0.f29949c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i10, InterfaceC3441o1 interfaceC3441o1, C3474v0 c3474v0) throws C3455r1 {
        C3411i1 c3411i1 = (C3411i1) interfaceC3441o1;
        int iJ = j(bArr, i10, c3474v0);
        int i11 = c3474v0.f29947a + iJ;
        while (iJ < i11) {
            iJ = j(bArr, iJ, c3474v0);
            c3411i1.f(c3474v0.f29947a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw new C3455r1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int h(byte[] bArr, int i10, C3474v0 c3474v0) throws C3455r1 {
        int iJ = j(bArr, i10, c3474v0);
        int i11 = c3474v0.f29947a;
        if (i11 < 0) {
            throw new C3455r1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            c3474v0.f29949c = "";
            return iJ;
        }
        c3474v0.f29949c = new String(bArr, iJ, i11, AbstractC3446p1.f29896a);
        return iJ + i11;
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, C3452q2 c3452q2, C3474v0 c3474v0) throws C3455r1 {
        if ((i10 >>> 3) == 0) {
            throw new C3455r1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM = m(bArr, i11, c3474v0);
            c3452q2.j(i10, Long.valueOf(c3474v0.f29948b));
            return iM;
        }
        if (i13 == 1) {
            c3452q2.j(i10, Long.valueOf(q(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iJ = j(bArr, i11, c3474v0);
            int i14 = c3474v0.f29947a;
            if (i14 < 0) {
                throw new C3455r1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iJ) {
                throw new C3455r1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c3452q2.j(i10, G0.f29754b);
            } else {
                c3452q2.j(i10, G0.z(bArr, iJ, i14));
            }
            return iJ + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C3455r1("Protocol message contained an invalid tag (zero).");
            }
            c3452q2.j(i10, Integer.valueOf(c(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C3452q2 c3452q2F = C3452q2.f();
        int i16 = c3474v0.f29951e + 1;
        c3474v0.f29951e = i16;
        r(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iJ2 = j(bArr, i11, c3474v0);
            int i18 = c3474v0.f29947a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iJ2;
                break;
            }
            i11 = i(i18, bArr, iJ2, i12, c3452q2F, c3474v0);
            i17 = i18;
        }
        c3474v0.f29951e--;
        if (i11 > i12 || i17 != i15) {
            throw new C3455r1("Failed to parse the message.");
        }
        c3452q2.j(i10, c3452q2F);
        return i11;
    }

    public static int j(byte[] bArr, int i10, C3474v0 c3474v0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, c3474v0);
        }
        c3474v0.f29947a = b10;
        return i11;
    }

    public static int k(int i10, byte[] bArr, int i11, C3474v0 c3474v0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c3474v0.f29947a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c3474v0.f29947a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c3474v0.f29947a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c3474v0.f29947a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c3474v0.f29947a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, InterfaceC3441o1 interfaceC3441o1, C3474v0 c3474v0) {
        C3411i1 c3411i1 = (C3411i1) interfaceC3441o1;
        int iJ = j(bArr, i11, c3474v0);
        c3411i1.f(c3474v0.f29947a);
        while (iJ < i12) {
            int iJ2 = j(bArr, iJ, c3474v0);
            if (i10 != c3474v0.f29947a) {
                break;
            }
            iJ = j(bArr, iJ2, c3474v0);
            c3411i1.f(c3474v0.f29947a);
        }
        return iJ;
    }

    public static int m(byte[] bArr, int i10, C3474v0 c3474v0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c3474v0.f29948b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        c3474v0.f29948b = j11;
        return i12;
    }

    public static int n(Object obj, InterfaceC3382c2 interfaceC3382c2, byte[] bArr, int i10, int i11, int i12, C3474v0 c3474v0) throws C3455r1 {
        int i13 = c3474v0.f29951e + 1;
        c3474v0.f29951e = i13;
        r(i13);
        int iY = ((M1) interfaceC3382c2).y(obj, bArr, i10, i11, i12, c3474v0);
        c3474v0.f29951e--;
        c3474v0.f29949c = obj;
        return iY;
    }

    public static int o(Object obj, InterfaceC3382c2 interfaceC3382c2, byte[] bArr, int i10, int i11, C3474v0 c3474v0) throws C3455r1 {
        int iK = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iK = k(i12, bArr, iK, c3474v0);
            i12 = c3474v0.f29947a;
        }
        int i13 = iK;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new C3455r1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c3474v0.f29951e + 1;
        c3474v0.f29951e = i14;
        r(i14);
        int i15 = i13 + i12;
        interfaceC3382c2.i(obj, bArr, i13, i15, c3474v0);
        c3474v0.f29951e--;
        c3474v0.f29949c = obj;
        return i15;
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, C3474v0 c3474v0) throws C3455r1 {
        if ((i10 >>> 3) == 0) {
            throw new C3455r1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m(bArr, i11, c3474v0);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return j(bArr, i11, c3474v0) + c3474v0.f29947a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new C3455r1("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = j(bArr, i11, c3474v0);
            i15 = c3474v0.f29947a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, c3474v0);
        }
        if (i11 > i12 || i15 != i14) {
            throw new C3455r1("Failed to parse the message.");
        }
        return i11;
    }

    public static long q(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static void r(int i10) throws C3455r1 {
        if (i10 >= f29955a) {
            throw new C3455r1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
