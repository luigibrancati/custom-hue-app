package i2;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: i2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4323c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f36938a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, RecognitionOptions.PDF417};

    /* JADX INFO: renamed from: i2.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f36943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f36944f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36945g;

        public b() {
            this.f36939a = true;
            this.f36940b = -1;
            this.f36941c = -1;
            this.f36942d = true;
            this.f36943e = 2;
            this.f36944f = 1;
            this.f36945g = 0;
        }
    }

    /* JADX INFO: renamed from: i2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0483c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36950e;

        public C0483c(int i10, int i11, int i12, int i13, int i14) {
            this.f36946a = i10;
            this.f36948c = i11;
            this.f36947b = i12;
            this.f36949d = i13;
            this.f36950e = i14;
        }
    }

    public static String a(int i10, int i11, int i12) {
        return G1.M.G("ac-4.%02d.%02d.%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static void b(int i10, G1.C c10) {
        c10.W(7);
        byte[] bArrF = c10.f();
        bArrF[0] = -84;
        bArrF[1] = 64;
        bArrF[2] = -1;
        bArrF[3] = -1;
        bArrF[4] = (byte) ((i10 >> 16) & 255);
        bArrF[5] = (byte) ((i10 >> 8) & 255);
        bArrF[6] = (byte) (i10 & 255);
    }

    public static int c(int i10, boolean z10, int i11) {
        int iD = d(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return iD;
        }
        if (!z10) {
            iD -= 2;
        }
        return i11 != 0 ? i11 != 1 ? iD : iD - 2 : iD - 4;
    }

    public static int d(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static D1.o e(G1.C r20, java.lang.String r21, java.lang.String r22, D1.C0753k r23) throws D1.w {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.AbstractC4323c.e(G1.C, java.lang.String, java.lang.String, D1.k):D1.o");
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return g(new G1.B(bArr)).f36950e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i2.AbstractC4323c.C0483c g(G1.B r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = k(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r4 = r7
            goto L55
        L53:
            r4 = r7
            r7 = r6
        L55:
            int r11 = r11.h(r3)
            if (r7 != r6) goto L65
            r6 = 13
            if (r11 != r6) goto L65
            int[] r0 = i2.AbstractC4323c.f36938a
            r11 = r0[r11]
        L63:
            r9 = r11
            goto L95
        L65:
            if (r7 != r4) goto L93
            int[] r4 = i2.AbstractC4323c.f36938a
            int r6 = r4.length
            if (r11 >= r6) goto L93
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r9 = 1
            if (r1 == r9) goto L8c
            r9 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L7e
            goto L91
        L7e:
            if (r11 == r2) goto L84
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
        L84:
            int r11 = r4 + 1
            goto L63
        L87:
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
            goto L84
        L8c:
            if (r11 == r2) goto L84
            if (r11 != r6) goto L91
            goto L84
        L91:
            r9 = r4
            goto L95
        L93:
            r11 = 0
            goto L63
        L95:
            i2.c$c r4 = new i2.c$c
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.AbstractC4323c.g(G1.B):i2.c$c");
    }

    public static int h(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
        if (i12 == 65535) {
            i12 = ((bArr[4] & ForkServer.ERROR) << 16) | ((bArr[5] & ForkServer.ERROR) << 8) | (bArr[6] & ForkServer.ERROR);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    public static void i(G1.B b10, b bVar) throws D1.w {
        int iH = b10.h(5);
        b10.r(2);
        if (b10.g()) {
            b10.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            b10.q();
        }
        if (b10.g()) {
            int iH2 = b10.h(3);
            if (bVar.f36940b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f36940b = iH;
            }
            if (b10.g()) {
                m(b10);
            }
        }
    }

    public static void j(G1.B b10, b bVar) throws D1.w {
        b10.r(2);
        boolean zG = b10.g();
        int iH = b10.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            b10.r(2);
            if (b10.g()) {
                b10.r(5);
            }
            if (zG) {
                b10.r(24);
            } else {
                if (b10.g()) {
                    if (!b10.g()) {
                        b10.r(4);
                    }
                    bVar.f36941c = b10.h(6) + 1;
                }
                b10.r(4);
            }
        }
        if (b10.g()) {
            b10.r(3);
            if (b10.g()) {
                m(b10);
            }
        }
    }

    public static int k(G1.B b10, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + b10.h(i10);
            if (!b10.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    public static boolean l(G1.B b10) {
        if (b10.b() < 66) {
            return false;
        }
        b10.r(66);
        return true;
    }

    public static void m(G1.B b10) throws D1.w {
        int iH = b10.h(6);
        if (iH < 2 || iH > 42) {
            throw D1.w.e(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        b10.r(iH * 8);
    }
}
