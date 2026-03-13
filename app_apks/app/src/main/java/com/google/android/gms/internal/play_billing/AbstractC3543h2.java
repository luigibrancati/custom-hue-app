package com.google.android.gms.internal.play_billing;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3543h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f30178a = 100;

    public static int a(byte[] bArr, int i10, C3531f2 c3531f2) throws V2 {
        int iH = h(bArr, i10, c3531f2);
        int i11 = c3531f2.f30160a;
        if (i11 < 0) {
            throw new V2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iH) {
            throw new V2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c3531f2.f30162c = AbstractC3597q2.f30229b;
            return iH;
        }
        c3531f2.f30162c = AbstractC3597q2.p(bArr, iH, i11);
        return iH + i11;
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & ForkServer.ERROR;
        int i12 = bArr[i10 + 1] & ForkServer.ERROR;
        int i13 = bArr[i10 + 2] & ForkServer.ERROR;
        return ((bArr[i10 + 3] & ForkServer.ERROR) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int c(InterfaceC3633w3 interfaceC3633w3, byte[] bArr, int i10, int i11, int i12, C3531f2 c3531f2) throws V2 {
        Object objD = interfaceC3633w3.d();
        int iL = l(objD, interfaceC3633w3, bArr, i10, i11, i12, c3531f2);
        interfaceC3633w3.c(objD);
        c3531f2.f30162c = objD;
        return iL;
    }

    public static int d(InterfaceC3633w3 interfaceC3633w3, byte[] bArr, int i10, int i11, C3531f2 c3531f2) throws V2 {
        Object objD = interfaceC3633w3.d();
        int iM = m(objD, interfaceC3633w3, bArr, i10, i11, c3531f2);
        interfaceC3633w3.c(objD);
        c3531f2.f30162c = objD;
        return iM;
    }

    public static int e(InterfaceC3633w3 interfaceC3633w3, int i10, byte[] bArr, int i11, int i12, S2 s22, C3531f2 c3531f2) throws V2 {
        int iD = d(interfaceC3633w3, bArr, i11, i12, c3531f2);
        s22.add(c3531f2.f30162c);
        while (iD < i12) {
            int iH = h(bArr, iD, c3531f2);
            if (i10 != c3531f2.f30160a) {
                break;
            }
            iD = d(interfaceC3633w3, bArr, iH, i12, c3531f2);
            s22.add(c3531f2.f30162c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i10, S2 s22, C3531f2 c3531f2) throws V2 {
        P2 p22 = (P2) s22;
        int iH = h(bArr, i10, c3531f2);
        int i11 = c3531f2.f30160a + iH;
        while (iH < i11) {
            iH = h(bArr, iH, c3531f2);
            p22.f(c3531f2.f30160a);
        }
        if (iH == i11) {
            return iH;
        }
        throw new V2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, J3 j32, C3531f2 c3531f2) throws V2 {
        if ((i10 >>> 3) == 0) {
            throw new V2("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, c3531f2);
            j32.j(i10, Long.valueOf(c3531f2.f30161b));
            return iK;
        }
        if (i13 == 1) {
            j32.j(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, c3531f2);
            int i14 = c3531f2.f30160a;
            if (i14 < 0) {
                throw new V2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iH) {
                throw new V2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                j32.j(i10, AbstractC3597q2.f30229b);
            } else {
                j32.j(i10, AbstractC3597q2.p(bArr, iH, i14));
            }
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new V2("Protocol message contained an invalid tag (zero).");
            }
            j32.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        J3 j3F = J3.f();
        int i16 = c3531f2.f30164e + 1;
        c3531f2.f30164e = i16;
        o(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iH2 = h(bArr, i11, c3531f2);
            int i18 = c3531f2.f30160a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iH2;
                break;
            }
            i11 = g(i18, bArr, iH2, i12, j3F, c3531f2);
            i17 = i18;
        }
        c3531f2.f30164e--;
        if (i11 > i12 || i17 != i15) {
            throw new V2("Failed to parse the message.");
        }
        j32.j(i10, j3F);
        return i11;
    }

    public static int h(byte[] bArr, int i10, C3531f2 c3531f2) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, c3531f2);
        }
        c3531f2.f30160a = b10;
        return i11;
    }

    public static int i(int i10, byte[] bArr, int i11, C3531f2 c3531f2) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c3531f2.f30160a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c3531f2.f30160a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c3531f2.f30160a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c3531f2.f30160a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c3531f2.f30160a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, S2 s22, C3531f2 c3531f2) {
        P2 p22 = (P2) s22;
        int iH = h(bArr, i11, c3531f2);
        p22.f(c3531f2.f30160a);
        while (iH < i12) {
            int iH2 = h(bArr, iH, c3531f2);
            if (i10 != c3531f2.f30160a) {
                break;
            }
            iH = h(bArr, iH2, c3531f2);
            p22.f(c3531f2.f30160a);
        }
        return iH;
    }

    public static int k(byte[] bArr, int i10, C3531f2 c3531f2) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c3531f2.f30161b = j10;
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
        c3531f2.f30161b = j11;
        return i12;
    }

    public static int l(Object obj, InterfaceC3633w3 interfaceC3633w3, byte[] bArr, int i10, int i11, int i12, C3531f2 c3531f2) throws V2 {
        int i13 = c3531f2.f30164e + 1;
        c3531f2.f30164e = i13;
        o(i13);
        int iY = ((C3586o3) interfaceC3633w3).y(obj, bArr, i10, i11, i12, c3531f2);
        c3531f2.f30164e--;
        c3531f2.f30162c = obj;
        return iY;
    }

    public static int m(Object obj, InterfaceC3633w3 interfaceC3633w3, byte[] bArr, int i10, int i11, C3531f2 c3531f2) throws V2 {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, c3531f2);
            i13 = c3531f2.f30160a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new V2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = c3531f2.f30164e + 1;
        c3531f2.f30164e = i15;
        o(i15);
        int i16 = i14 + i13;
        interfaceC3633w3.i(obj, bArr, i14, i16, c3531f2);
        c3531f2.f30164e--;
        c3531f2.f30162c = obj;
        return i16;
    }

    public static long n(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static void o(int i10) throws V2 {
        if (i10 >= f30178a) {
            throw new V2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
