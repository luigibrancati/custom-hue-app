package i2;

import D1.C0753k;
import D1.o;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: i2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4322b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f36925a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f36926b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f36927c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f36928d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f36929e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f36930f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0482b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36937g;

        public C0482b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f36931a = str;
            this.f36932b = i10;
            this.f36934d = i11;
            this.f36933c = i12;
            this.f36935e = i13;
            this.f36936f = i14;
            this.f36937g = i15;
        }
    }

    public static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((G1.M.P(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f36926b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f36930f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f36929e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static D1.o d(G1.C c10, String str, String str2, C0753k c0753k) {
        G1.B b10 = new G1.B();
        b10.m(c10);
        int i10 = f36926b[b10.h(2)];
        b10.r(8);
        int i11 = f36928d[b10.h(3)];
        if (b10.h(1) != 0) {
            i11++;
        }
        int i12 = f36929e[b10.h(5)] * 1000;
        b10.c();
        c10.a0(b10.d());
        return new o.b().j0(str).y0("audio/ac3").T(i11).z0(i10).c0(c0753k).n0(str2).S(i12).t0(i12).P();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f36925a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0482b f(G1.B b10) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = b10.e();
        b10.r(40);
        boolean z10 = b10.h(5) > 10;
        b10.p(iE);
        int i19 = -1;
        if (z10) {
            b10.r(16);
            int iH = b10.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            b10.r(3);
            iC = (b10.h(11) + 1) * 2;
            int iH2 = b10.h(2);
            if (iH2 == 3) {
                i10 = f36927c[b10.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = b10.h(2);
                int i20 = f36925a[iH3];
                i14 = iH3;
                i10 = f36926b[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = b10.h(3);
            boolean zG = b10.g();
            i11 = f36928d[iH4] + (zG ? 1 : 0);
            b10.r(10);
            if (b10.g()) {
                b10.r(8);
            }
            if (iH4 == 0) {
                b10.r(5);
                if (b10.g()) {
                    b10.r(8);
                }
            }
            if (i19 == 1 && b10.g()) {
                b10.r(16);
            }
            if (b10.g()) {
                if (iH4 > 2) {
                    b10.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    b10.r(6);
                }
                if ((iH4 & 4) != 0) {
                    b10.r(i17);
                }
                if (zG && b10.g()) {
                    b10.r(5);
                }
                if (i19 == 0) {
                    if (b10.g()) {
                        i18 = 6;
                        b10.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && b10.g()) {
                        b10.r(i18);
                    }
                    if (b10.g()) {
                        b10.r(i18);
                    }
                    int iH5 = b10.h(2);
                    if (iH5 == 1) {
                        b10.r(5);
                    } else if (iH5 == 2) {
                        b10.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = b10.h(5);
                        if (b10.g()) {
                            b10.r(5);
                            if (b10.g()) {
                                b10.r(4);
                            }
                            if (b10.g()) {
                                b10.r(4);
                            }
                            if (b10.g()) {
                                b10.r(4);
                            }
                            if (b10.g()) {
                                b10.r(4);
                            }
                            if (b10.g()) {
                                b10.r(4);
                            }
                            if (b10.g()) {
                                b10.r(4);
                            }
                            if (b10.g()) {
                                b10.r(4);
                            }
                            if (b10.g()) {
                                if (b10.g()) {
                                    b10.r(4);
                                }
                                if (b10.g()) {
                                    b10.r(4);
                                }
                            }
                        }
                        if (b10.g()) {
                            b10.r(5);
                            if (b10.g()) {
                                b10.r(7);
                                if (b10.g()) {
                                    b10.r(8);
                                }
                            }
                        }
                        b10.r((iH6 + 2) * 8);
                        b10.c();
                    }
                    if (iH4 < 2) {
                        if (b10.g()) {
                            b10.r(14);
                        }
                        if (iH4 == 0 && b10.g()) {
                            b10.r(14);
                        }
                    }
                    if (b10.g()) {
                        if (i14 == 0) {
                            b10.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (b10.g()) {
                                    b10.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (b10.g()) {
                b10.r(5);
                if (iH4 == 2) {
                    b10.r(4);
                }
                if (iH4 >= 6) {
                    b10.r(2);
                }
                if (b10.g()) {
                    b10.r(8);
                }
                if (iH4 == 0 && b10.g()) {
                    b10.r(8);
                }
                if (iH2 < 3) {
                    b10.q();
                }
            }
            if (i19 == 0 && i14 != 3) {
                b10.q();
            }
            if (i19 == 2 && (i14 == 3 || b10.g())) {
                i16 = 6;
                b10.r(6);
            } else {
                i16 = 6;
            }
            str = (b10.g() && b10.h(i16) == 1 && b10.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            b10.r(32);
            int iH7 = b10.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = b10.h(6);
            int i22 = f36929e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            b10.r(8);
            int iH9 = b10.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                b10.r(2);
            }
            if ((iH9 & 4) != 0) {
                b10.r(2);
            }
            if (iH9 == 2) {
                b10.r(2);
            }
            int[] iArr = f36926b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f36928d[iH9] + (b10.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C0482b(str, i19, i11, i10, iC, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & ForkServer.ERROR) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static D1.o h(G1.C r7, java.lang.String r8, java.lang.String r9, D1.C0753k r10) {
        /*
            G1.B r0 = new G1.B
            r0.<init>()
            r0.m(r7)
            r1 = 13
            int r1 = r0.h(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.r(r2)
            r3 = 2
            int r3 = r0.h(r3)
            int[] r4 = i2.AbstractC4322b.f36926b
            r3 = r4[r3]
            r4 = 10
            r0.r(r4)
            int[] r4 = i2.AbstractC4322b.f36928d
            int r5 = r0.h(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.h(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.r(r2)
            r2 = 4
            int r2 = r0.h(r2)
            r0.r(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.r(r2)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.r(r5)
        L4f:
            int r2 = r0.b()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.r(r6)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.c()
            int r0 = r0.d()
            r7.a0(r0)
            D1.o$b r7 = new D1.o$b
            r7.<init>()
            D1.o$b r7 = r7.j0(r8)
            D1.o$b r7 = r7.y0(r2)
            D1.o$b r7 = r7.T(r4)
            D1.o$b r7 = r7.z0(r3)
            D1.o$b r7 = r7.c0(r10)
            D1.o$b r7 = r7.n0(r9)
            D1.o$b r7 = r7.t0(r1)
            D1.o r7 = r7.P()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.AbstractC4322b.h(G1.C, java.lang.String, java.lang.String, D1.k):D1.o");
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & ForkServer.ERROR) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & ForkServer.ERROR) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
