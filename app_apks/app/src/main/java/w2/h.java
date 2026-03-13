package w2;

import D1.u;
import D1.v;
import G1.B;
import G1.C;
import G1.M;
import G1.t;
import K7.AbstractC1081v;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46116b = new a() { // from class: w2.g
        @Override // w2.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f46117a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46120c;

        public b(int i10, boolean z10, int i11) {
            this.f46118a = i10;
            this.f46119b = z10;
            this.f46120c = i11;
        }
    }

    public h() {
        this(null);
    }

    public static int A(C c10, int i10) {
        byte[] bArrF = c10.f();
        int iG = c10.g();
        int i11 = iG;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iG + i10) {
                return i10;
            }
            if ((bArrF[i11] & ForkServer.ERROR) == 255 && bArrF[i12] == 0) {
                System.arraycopy(bArrF, i11 + 2, bArrF, i12, (i10 - (i11 - iG)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B(G1.C r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.g()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.u()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.N()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.T()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r1.O()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.O()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.a0(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.a0(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.a0(r2)
            return r6
        L9b:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.a0(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.b0(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.a0(r2)
            return r4
        Lb2:
            r1.a0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.h.B(G1.C, int, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? M.f4267f : Arrays.copyOfRange(bArr, i10, i11);
    }

    public static C6118a f(C c10, int i10, int i11) {
        int iZ;
        String str;
        int iL = c10.L();
        Charset charsetW = w(iL);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c10.q(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + J7.c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = J7.c.e(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iZ + 1] & ForkServer.ERROR;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iL);
        return new C6118a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iL), i12));
    }

    public static w2.b g(C c10, int i10, String str) {
        byte[] bArr = new byte[i10];
        c10.q(bArr, 0, i10);
        return new w2.b(str, bArr);
    }

    public static c h(C c10, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iG = c10.g();
        int iZ = z(c10.f(), iG);
        String str = new String(c10.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c10.a0(iZ + 1);
        int iU = c10.u();
        int iU2 = c10.u();
        long jN = c10.N();
        if (jN == KeyboardMap.kValueMask) {
            jN = -1;
        }
        long jN2 = c10.N();
        long j10 = jN2 == KeyboardMap.kValueMask ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i13 = iG + i10;
        while (c10.g() < i13) {
            i iVarK = k(i11, c10, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iU, iU2, jN, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d i(C c10, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iG = c10.g();
        int iZ = z(c10.f(), iG);
        String str = new String(c10.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c10.a0(iZ + 1);
        int iL = c10.L();
        boolean z11 = (iL & 2) != 0;
        boolean z12 = (iL & 1) != 0;
        int iL2 = c10.L();
        String[] strArr = new String[iL2];
        for (int i13 = 0; i13 < iL2; i13++) {
            int iG2 = c10.g();
            int iZ2 = z(c10.f(), iG2);
            strArr[i13] = new String(c10.f(), iG2, iZ2 - iG2, StandardCharsets.ISO_8859_1);
            c10.a0(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iG + i10;
        while (c10.g() < i14) {
            i iVarK = k(i11, c10, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e j(C c10, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iL = c10.L();
        Charset charsetW = w(iL);
        byte[] bArr = new byte[3];
        c10.q(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c10.q(bArr2, 0, i11);
        int iY = y(bArr2, 0, iL);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iL);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iL), charsetW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0237  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [w2.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [G1.C] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [G1.C] */
    /* JADX WARN: Type inference failed for: r1v9, types: [G1.C] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w2.i k(int r19, G1.C r20, boolean r21, int r22, w2.h.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.h.k(int, G1.C, boolean, int, w2.h$a):w2.i");
    }

    public static f l(C c10, int i10) {
        int iL = c10.L();
        Charset charsetW = w(iL);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c10.q(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strU = v.u(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iL);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iL);
        int iY2 = y(bArr, iV, iL);
        return new f(strU, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iL), i11));
    }

    public static b m(C c10) {
        if (c10.a() < 10) {
            t.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iO = c10.O();
        if (iO != 4801587) {
            t.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iO)));
            return null;
        }
        int iL = c10.L();
        c10.b0(1);
        int iL2 = c10.L();
        int iK = c10.K();
        if (iL == 2) {
            if ((iL2 & 64) != 0) {
                t.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iL == 3) {
            if ((iL2 & 64) != 0) {
                int iU = c10.u();
                c10.b0(iU);
                iK -= iU + 4;
            }
        } else {
            if (iL != 4) {
                t.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iL);
                return null;
            }
            if ((iL2 & 64) != 0) {
                int iK2 = c10.K();
                c10.b0(iK2 - 4);
                iK -= iK2;
            }
            if ((iL2 & 16) != 0) {
                iK -= 10;
            }
        }
        return new b(iL, iL < 4 && (iL2 & 128) != 0, iK);
    }

    public static l n(C c10, int i10) {
        int iT = c10.T();
        int iO = c10.O();
        int iO2 = c10.O();
        int iL = c10.L();
        int iL2 = c10.L();
        B b10 = new B();
        b10.m(c10);
        int i11 = ((i10 - 10) * 8) / (iL + iL2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = b10.h(iL);
            int iH2 = b10.h(iL2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new l(iT, iO, iO2, iArr, iArr2);
    }

    public static m o(C c10, int i10) {
        byte[] bArr = new byte[i10];
        c10.q(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    public static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static n q(C c10, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iL = c10.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c10.q(bArr, 0, i11);
        return new n(str, null, r(bArr, iL, 0));
    }

    public static AbstractC1081v r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC1081v.A("");
        }
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarR.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        AbstractC1081v abstractC1081vK = aVarR.k();
        return abstractC1081vK.isEmpty() ? AbstractC1081v.A("") : abstractC1081vK;
    }

    public static n s(C c10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iL = c10.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c10.q(bArr, 0, i11);
        int iY = y(bArr, 0, iL);
        return new n("TXXX", new String(bArr, 0, iY, w(iL)), r(bArr, iL, iY + v(iL)));
    }

    public static o t(C c10, int i10, String str) {
        byte[] bArr = new byte[i10];
        c10.q(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static o u(C c10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iL = c10.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c10.q(bArr, 0, i11);
        int iY = y(bArr, 0, iL);
        String str = new String(bArr, 0, iY, w(iL));
        int iV = iY + v(iL);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    public static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    public static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // r2.c
    public u b(r2.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public u e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        C c10 = new C(bArr, i10);
        b bVarM = m(c10);
        if (bVarM == null) {
            return null;
        }
        int iG = c10.g();
        int i11 = bVarM.f46118a == 2 ? 6 : 10;
        int iA = bVarM.f46120c;
        if (bVarM.f46119b) {
            iA = A(c10, bVarM.f46120c);
        }
        c10.Z(iG + iA);
        boolean z10 = false;
        if (!B(c10, bVarM.f46118a, i11, false)) {
            if (bVarM.f46118a != 4 || !B(c10, 4, i11, true)) {
                t.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f46118a);
                return null;
            }
            z10 = true;
        }
        while (c10.a() >= i11) {
            i iVarK = k(bVarM.f46118a, c10, z10, i11, this.f46117a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new u(arrayList);
    }

    public h(a aVar) {
        this.f46117a = aVar;
    }
}
