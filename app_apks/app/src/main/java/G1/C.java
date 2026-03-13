package G1;

import K7.AbstractC1085z;
import com.google.ar.core.ImageMetadata;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f4238d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f4239e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1085z f4240f = AbstractC1085z.E(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f4241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4243c;

    public C() {
        this.f4241a = M.f4267f;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return N7.g.i((byte) 0, N7.j.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), N7.j.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), N7.j.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int h(Charset charset) {
        AbstractC0853a.b(f4240f.contains(charset), "Unsupported charset: " + charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean i(byte b10) {
        return (b10 & 192) == 128;
    }

    public short A() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = bArr[i10] & ForkServer.ERROR;
        this.f4242b = i10 + 2;
        return (short) (((bArr[i11] & ForkServer.ERROR) << 8) | i12);
    }

    public long B() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f4242b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f4242b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f4242b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int C() {
        int iY = y();
        if (iY >= 0) {
            return iY;
        }
        throw new IllegalStateException("Top bit not zero: " + iY);
    }

    public int D() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = bArr[i10] & ForkServer.ERROR;
        this.f4242b = i10 + 2;
        return ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
    }

    public long E() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f4242b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f4242b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f4242b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f4242b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f4242b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f4242b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f4242b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public String F() {
        return s((char) 0);
    }

    public String G(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f4242b;
        int i12 = (i11 + i10) - 1;
        String strI = M.I(this.f4241a, i11, (i12 >= this.f4243c || this.f4241a[i12] != 0) ? i10 : i10 - 1);
        this.f4242b += i10;
        return strI;
    }

    public short H() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 8;
        this.f4242b = i10 + 2;
        return (short) ((bArr[i11] & ForkServer.ERROR) | i12);
    }

    public String I(int i10) {
        return J(i10, StandardCharsets.UTF_8);
    }

    public String J(int i10, Charset charset) {
        String str = new String(this.f4241a, this.f4242b, i10, charset);
        this.f4242b += i10;
        return str;
    }

    public int K() {
        return L() | (L() << 21) | (L() << 14) | (L() << 7);
    }

    public int L() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        this.f4242b = i10 + 1;
        return bArr[i10] & ForkServer.ERROR;
    }

    public int M() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 8;
        this.f4242b = i10 + 2;
        int i13 = (bArr[i11] & ForkServer.ERROR) | i12;
        this.f4242b = i10 + 4;
        return i13;
    }

    public long N() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f4242b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f4242b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f4242b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int O() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 16;
        int i13 = i10 + 2;
        this.f4242b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
        this.f4242b = i10 + 3;
        return (bArr[i13] & ForkServer.ERROR) | i14;
    }

    public int P() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int Q() {
        return N7.g.e(R());
    }

    public long R() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f4242b == this.f4243c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jL = L();
            j10 |= (127 & jL) << (i10 * 7);
            if ((jL & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public long S() {
        long jE = E();
        if (jE >= 0) {
            return jE;
        }
        throw new IllegalStateException("Top bit not zero: " + jE);
    }

    public int T() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 8;
        this.f4242b = i10 + 2;
        return (bArr[i11] & ForkServer.ERROR) | i12;
    }

    public long U() {
        int i10;
        int i11;
        long j10 = this.f4241a[this.f4242b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f4241a[this.f4242b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f4242b += i11;
        return j10;
    }

    public Charset V() {
        if (a() >= 3) {
            byte[] bArr = this.f4241a;
            int i10 = this.f4242b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f4242b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f4241a;
        int i11 = this.f4242b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f4242b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f4242b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void W(int i10) {
        Y(b() < i10 ? new byte[i10] : this.f4241a, i10);
    }

    public void X(byte[] bArr) {
        Y(bArr, bArr.length);
    }

    public void Y(byte[] bArr, int i10) {
        this.f4241a = bArr;
        this.f4243c = i10;
        this.f4242b = 0;
    }

    public void Z(int i10) {
        AbstractC0853a.a(i10 >= 0 && i10 <= this.f4241a.length);
        this.f4243c = i10;
    }

    public int a() {
        return Math.max(this.f4243c - this.f4242b, 0);
    }

    public void a0(int i10) {
        AbstractC0853a.a(i10 >= 0 && i10 <= this.f4243c);
        this.f4242b = i10;
    }

    public int b() {
        return this.f4241a.length;
    }

    public void b0(int i10) {
        a0(this.f4242b + i10);
    }

    public void c0() {
        while ((L() & 128) != 0) {
        }
    }

    public void d(int i10) {
        if (i10 > b()) {
            this.f4241a = Arrays.copyOf(this.f4241a, i10);
        }
    }

    public final void d0(Charset charset) {
        if (r(charset, f4238d) == '\r') {
            r(charset, f4239e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L43
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L41
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported charset: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L41:
            r0 = 2
            goto L44
        L43:
            r0 = 1
        L44:
            int r1 = r4.f4242b
        L46:
            int r2 = r4.f4243c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La5
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5e
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L69
        L5e:
            byte[] r2 = r4.f4241a
            r2 = r2[r1]
            boolean r2 = G1.M.F0(r2)
            if (r2 == 0) goto L69
            goto La2
        L69:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L79
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
        L79:
            byte[] r2 = r4.f4241a
            r3 = r2[r1]
            if (r3 != 0) goto L8a
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = G1.M.F0(r2)
            if (r2 == 0) goto L8a
            goto La2
        L8a:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La3
            byte[] r2 = r4.f4241a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La3
            r2 = r2[r1]
            boolean r2 = G1.M.F0(r2)
            if (r2 == 0) goto La3
        La2:
            return r1
        La3:
            int r1 = r1 + r0
            goto L46
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.C.e(java.nio.charset.Charset):int");
    }

    public byte[] f() {
        return this.f4241a;
    }

    public int g() {
        return this.f4242b;
    }

    public int j() {
        return this.f4243c;
    }

    public final char k(ByteOrder byteOrder, int i10) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f4241a;
            int i11 = this.f4242b;
            return N7.c.c(bArr[i11 + i10], bArr[i11 + i10 + 1]);
        }
        byte[] bArr2 = this.f4241a;
        int i12 = this.f4242b;
        return N7.c.c(bArr2[i12 + i10 + 1], bArr2[i12 + i10]);
    }

    public int l(Charset charset) {
        return m(charset) != 0 ? N7.g.e(r0 >>> 8) : ImageMetadata.STATISTICS_FACE_DETECT_MODE;
    }

    public final int m(Charset charset) {
        int codePoint;
        AbstractC0853a.b(f4240f.contains(charset), "Unsupported charset: " + charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f4242b + ", limit=" + this.f4243c);
        }
        byte b10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b11 = this.f4241a[this.f4242b];
            if ((b11 & 128) != 0) {
                return 0;
            }
            codePoint = N7.j.b(b11);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bO = o();
            if (bO == 1) {
                codePoint = N7.j.b(this.f4241a[this.f4242b]);
            } else if (bO == 2) {
                byte[] bArr = this.f4241a;
                int i10 = this.f4242b;
                codePoint = c(0, 0, bArr[i10], bArr[i10 + 1]);
            } else if (bO == 3) {
                byte[] bArr2 = this.f4241a;
                int i11 = this.f4242b;
                codePoint = c(0, bArr2[i11] & 15, bArr2[i11 + 1], bArr2[i11 + 2]);
            } else {
                if (bO != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f4241a;
                int i12 = this.f4242b;
                codePoint = c(bArr3[i12], bArr3[i12 + 1], bArr3[i12 + 2], bArr3[i12 + 3]);
            }
            b10 = bO;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cK = k(byteOrder, 0);
            if (!Character.isHighSurrogate(cK) || a() < 4) {
                codePoint = cK;
                b10 = 2;
            } else {
                codePoint = Character.toCodePoint(cK, k(byteOrder, 2));
                b10 = 4;
            }
        }
        return (codePoint << 8) | b10;
    }

    public int n() {
        return this.f4241a[this.f4242b] & ForkServer.ERROR;
    }

    public final byte o() {
        byte b10 = this.f4241a[this.f4242b];
        if ((b10 & 128) == 0) {
            return (byte) 1;
        }
        if ((b10 & 224) == 192 && a() >= 2 && i(this.f4241a[this.f4242b + 1])) {
            return (byte) 2;
        }
        if ((this.f4241a[this.f4242b] & 240) == 224 && a() >= 3 && i(this.f4241a[this.f4242b + 1]) && i(this.f4241a[this.f4242b + 2])) {
            return (byte) 3;
        }
        return ((this.f4241a[this.f4242b] & 248) == 240 && a() >= 4 && i(this.f4241a[this.f4242b + 1]) && i(this.f4241a[this.f4242b + 2]) && i(this.f4241a[this.f4242b + 3])) ? (byte) 4 : (byte) 0;
    }

    public void p(B b10, int i10) {
        q(b10.f4234a, 0, i10);
        b10.p(0);
    }

    public void q(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f4241a, this.f4242b, bArr, i10, i11);
        this.f4242b += i11;
    }

    public final char r(Charset charset, char[] cArr) {
        int iM;
        if (a() < h(charset) || (iM = m(charset)) == 0) {
            return (char) 0;
        }
        int iA = N7.k.a(iM >>> 8);
        if (Character.isSupplementaryCodePoint(iA)) {
            return (char) 0;
        }
        char cA = N7.c.a(iA);
        if (!N7.c.b(cArr, cA)) {
            return (char) 0;
        }
        this.f4242b += N7.g.e(iM & 255);
        return cA;
    }

    public String s(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f4242b;
        while (i10 < this.f4243c && this.f4241a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f4241a;
        int i11 = this.f4242b;
        String strI = M.I(bArr, i11, i10 - i11);
        this.f4242b = i10;
        if (i10 < this.f4243c) {
            this.f4242b = i10 + 1;
        }
        return strI;
    }

    public double t() {
        return Double.longBitsToDouble(E());
    }

    public int u() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 24;
        int i13 = i10 + 2;
        this.f4242b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 16) | i12;
        int i15 = i10 + 3;
        this.f4242b = i15;
        int i16 = i14 | ((bArr[i13] & ForkServer.ERROR) << 8);
        this.f4242b = i10 + 4;
        return (bArr[i15] & ForkServer.ERROR) | i16;
    }

    public int v() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = ((bArr[i10] & ForkServer.ERROR) << 24) >> 8;
        int i13 = i10 + 2;
        this.f4242b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
        this.f4242b = i10 + 3;
        return (bArr[i13] & ForkServer.ERROR) | i14;
    }

    public String w() {
        return x(StandardCharsets.UTF_8);
    }

    public String x(Charset charset) {
        AbstractC0853a.b(f4240f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            V();
        }
        String strJ = J(e(charset) - this.f4242b, charset);
        if (this.f4242b == this.f4243c) {
            return strJ;
        }
        d0(charset);
        return strJ;
    }

    public int y() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        int i12 = bArr[i10] & ForkServer.ERROR;
        int i13 = i10 + 2;
        this.f4242b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
        int i15 = i10 + 3;
        this.f4242b = i15;
        int i16 = i14 | ((bArr[i13] & ForkServer.ERROR) << 16);
        this.f4242b = i10 + 4;
        return ((bArr[i15] & ForkServer.ERROR) << 24) | i16;
    }

    public long z() {
        byte[] bArr = this.f4241a;
        int i10 = this.f4242b;
        int i11 = i10 + 1;
        this.f4242b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f4242b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f4242b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f4242b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f4242b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f4242b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f4242b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f4242b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public C(int i10) {
        this.f4241a = new byte[i10];
        this.f4243c = i10;
    }

    public C(byte[] bArr) {
        this.f4241a = bArr;
        this.f4243c = bArr.length;
    }

    public C(byte[] bArr, int i10) {
        this.f4241a = bArr;
        this.f4243c = i10;
    }
}
