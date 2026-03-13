package i2;

import D1.C0753k;
import D1.o;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: i2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4335o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f37031a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f37032b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f37033c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, RecognitionOptions.UPC_E, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, RecognitionOptions.PDF417, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecognitionOptions.AZTEC, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f37034d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f37035e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f37036f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f37037g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f37038h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f37039i = {5, 8, 10, 12};

    /* JADX INFO: renamed from: i2.o$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f37043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f37044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f37045f;

        public b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f37040a = str;
            this.f37042c = i10;
            this.f37041b = i11;
            this.f37043d = i12;
            this.f37044e = j10;
            this.f37045f = i13;
        }
    }

    public static void a(byte[] bArr, int i10) throws D1.w {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & ForkServer.ERROR) | ((bArr[i11] << 8) & 65535)) != G1.M.u(bArr, 0, i11, 65535)) {
            throw D1.w.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.AbstractC4335o.b(byte[]):int");
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static G1.B d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new G1.B(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        G1.B b12 = new G1.B(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            G1.B b13 = new G1.B(bArrCopyOf);
            while (b13.b() >= 16) {
                b13.r(2);
                b12.f(b13.h(14), 14);
            }
        }
        b12.n(bArrCopyOf);
        return b12;
    }

    public static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return RecognitionOptions.UPC_E;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return RecognitionOptions.AZTEC;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static D1.o h(byte[] bArr, String str, String str2, int i10, String str3, C0753k c0753k) {
        G1.B bD = d(bArr);
        bD.r(60);
        int i11 = f37031a[bD.h(6)];
        int i12 = f37032b[bD.h(4)];
        int iH = bD.h(5);
        int[] iArr = f37033c;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        bD.r(10);
        return new o.b().j0(str).W(str3).y0("audio/vnd.dts").S(i13).T(i11 + (bD.h(2) > 0 ? 1 : 0)).z0(i12).c0(c0753k).n0(str2).w0(i10).P();
    }

    public static b i(byte[] bArr) throws D1.w {
        int i10;
        int i11;
        int iH;
        int i12;
        long jA1;
        int i13;
        G1.B bD = d(bArr);
        bD.r(40);
        int iH2 = bD.h(2);
        if (bD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        bD.r(i11);
        int iH3 = bD.h(i10) + 1;
        boolean zG = bD.g();
        int iH4 = -1;
        int i14 = 0;
        if (zG) {
            iH = bD.h(2);
            int iH5 = (bD.h(3) + 1) * 512;
            if (bD.g()) {
                bD.r(36);
            }
            int iH6 = bD.h(3) + 1;
            int iH7 = bD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw D1.w.e("Multiple audio presentations or assets not supported");
            }
            int i15 = iH2 + 1;
            int iH8 = bD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    bD.r(8);
                }
            }
            if (bD.g()) {
                bD.r(2);
                int iH9 = (bD.h(2) + 1) << 2;
                int iH10 = bD.h(2) + 1;
                while (i14 < iH10) {
                    bD.r(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        bD.r(i10);
        bD.r(12);
        if (zG) {
            if (bD.g()) {
                bD.r(4);
            }
            if (bD.g()) {
                bD.r(24);
            }
            if (bD.g()) {
                bD.s(bD.h(10) + 1);
            }
            bD.r(5);
            i12 = f37034d[bD.h(4)];
            iH4 = bD.h(8) + 1;
        } else {
            i12 = -2147483647;
        }
        int i17 = i12;
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = 44100;
            } else {
                if (iH != 2) {
                    throw D1.w.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = 48000;
            }
            jA1 = G1.M.a1(i14, 1000000L, i13);
        } else {
            jA1 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH4, i17, iH3, jA1, 0);
    }

    public static int j(byte[] bArr) {
        G1.B bD = d(bArr);
        bD.r(42);
        return bD.h(bD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws D1.w {
        int iH;
        long jA1;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        G1.B bD = d(bArr);
        int i12 = bD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(bD, f37035e, true) + 1;
        if (i12 == 0) {
            iH = -2147483647;
            jA1 = -9223372036854775807L;
        } else {
            if (!bD.g()) {
                throw D1.w.e("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = bD.h(2);
            if (iH2 == 0) {
                i10 = 512;
            } else if (iH2 == 1) {
                i10 = 480;
            } else {
                if (iH2 != 2) {
                    throw D1.w.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = 384;
            }
            int iH3 = i10 * (bD.h(3) + 1);
            int iH4 = bD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = 44100;
            } else {
                if (iH4 != 2) {
                    throw D1.w.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = 48000;
            }
            if (bD.g()) {
                bD.r(36);
            }
            iH = (1 << bD.h(2)) * i11;
            jA1 = G1.M.a1(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jA1;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(bD, f37036f, true);
        }
        if (i12 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(bD, f37037g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM + iM2 + (atomicInteger2.get() != 0 ? m(bD, f37038h, true) : 0), j10, 0);
    }

    public static int l(byte[] bArr) {
        G1.B bD = d(bArr);
        bD.r(32);
        return m(bD, f37039i, true) + 1;
    }

    public static int m(G1.B b10, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && b10.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + b10.h(iArr[i11]);
    }
}
