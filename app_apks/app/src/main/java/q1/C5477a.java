package q1;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.tika.metadata.TikaCoreProperties;
import q1.AbstractC5478b;

/* JADX INFO: renamed from: q1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5477a {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final SimpleDateFormat f43007V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final SimpleDateFormat f43008W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final e[] f43012a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final e[] f43013b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final e[] f43014c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final e[] f43015d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final e[] f43016e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final e f43017f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final e[] f43018g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final e[] f43019h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final e[] f43020i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final e[] f43021j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final e[][] f43022k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final e[] f43023l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final HashMap[] f43024m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final HashMap[] f43025n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Set f43026o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final HashMap f43027p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Charset f43028q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f43029r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f43030s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pattern f43031t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f43032u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f43033v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Pattern f43035w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f43040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f43041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap[] f43044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f43045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f43046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f43050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f43052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f43056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f43057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f43058t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f43059u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f43060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f43034w = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f43036x = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f43037y = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f43038z = {8, 8, 8};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f42986A = {4};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f42987B = {8};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f42988C = {-1, -40, -1};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f42989D = {102, 116, 121, 112};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final byte[] f42990E = {109, 105, 102, 49};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final byte[] f42991F = {104, 101, 105, 99};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final byte[] f42992G = {97, 118, 105, 102};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final byte[] f42993H = {97, 118, 105, 115};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final byte[] f42994I = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final byte[] f42995J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final byte[] f42996K = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final byte[] f42997L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final byte[] f42998M = {82, 73, 70, 70};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final byte[] f42999N = {87, 69, 66, 80};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final byte[] f43000O = {69, 88, 73, 70};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final byte[] f43001P = {-99, 1, 42};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final byte[] f43002Q = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final byte[] f43003R = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final byte[] f43004S = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final byte[] f43005T = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final byte[] f43006U = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String[] f43009X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int[] f43010Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final byte[] f43011Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: q1.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataOutputStream f43069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteOrder f43070b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f43069a = new DataOutputStream(outputStream);
            this.f43070b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f43070b = byteOrder;
        }

        public void b(int i10) throws IOException {
            this.f43069a.write(i10);
        }

        public void c(int i10) throws IOException {
            ByteOrder byteOrder = this.f43070b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f43069a.write(i10 & 255);
                this.f43069a.write((i10 >>> 8) & 255);
                this.f43069a.write((i10 >>> 16) & 255);
                this.f43069a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f43069a.write((i10 >>> 24) & 255);
                this.f43069a.write((i10 >>> 16) & 255);
                this.f43069a.write((i10 >>> 8) & 255);
                this.f43069a.write(i10 & 255);
            }
        }

        public void d(short s10) throws IOException {
            ByteOrder byteOrder = this.f43070b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f43069a.write(s10 & 255);
                this.f43069a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f43069a.write((s10 >>> 8) & 255);
                this.f43069a.write(s10 & 255);
            }
        }

        public void f(long j10) throws IOException {
            if (j10 > KeyboardMap.kValueMask) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            c((int) j10);
        }

        public void g(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            d((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f43069a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f43069a.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: renamed from: q1.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f43073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f43074d;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C5477a.f43028q0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5477a.f43010Y[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5477a.f43010Y[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5477a.f43010Y[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f43079a);
                byteBufferWrap.putInt((int) fVar.f43080b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C5477a.f43028q0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5477a.f43010Y[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5477a.f43010Y[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f43079a);
                byteBufferWrap.putInt((int) fVar.f43080b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5477a.f43010Y[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                if (((long[]) objO).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                if (((int[]) objO).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f43079a);
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append(fVarArr[i10].f43080b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:18:0x0031 */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:125:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object o(java.nio.ByteOrder r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return C5477a.f43010Y[this.f43071a] * this.f43072b;
        }

        public String toString() {
            return "(" + C5477a.f43009X[this.f43071a] + ", data length:" + this.f43074d.length + ")";
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f43071a = i10;
            this.f43072b = i11;
            this.f43073c = j10;
            this.f43074d = bArr;
        }
    }

    /* JADX INFO: renamed from: q1.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f43079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f43080b;

        public /* synthetic */ f(long j10, long j11, C0574a c0574a) {
            this(j10, j11);
        }

        public static f b(double d10) {
            long j10;
            long j11;
            long j12 = 1;
            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                return new f(d10 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d10);
            long j13 = 0;
            long j14 = 1;
            double d11 = dAbs;
            long j15 = 0;
            while (true) {
                double d12 = d11 % 1.0d;
                long j16 = (long) (d11 - d12);
                j10 = j15 + (j16 * j12);
                j11 = (j16 * j13) + j14;
                d11 = 1.0d / d12;
                long j17 = j12;
                if (Math.abs(dAbs - (j10 / j11)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j14 = j13;
                j12 = j10;
                j15 = j17;
                j13 = j11;
            }
            if (d10 < 0.0d) {
                j10 = -j10;
            }
            return new f(j10, j11);
        }

        public double a() {
            return this.f43079a / this.f43080b;
        }

        public String toString() {
            return this.f43079a + "/" + this.f43080b;
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f43079a = 0L;
                this.f43080b = 1L;
            } else {
                this.f43079a = j10;
                this.f43080b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f43012a0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f43013b0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f43014c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f43015d0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f43016e0 = eVarArr5;
        f43017f0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f43018g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f43019h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f43020i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f43021j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f43022k0 = eVarArr10;
        f43023l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f43024m0 = new HashMap[eVarArr10.length];
        f43025n0 = new HashMap[eVarArr10.length];
        f43026o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f43027p0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f43028q0 = charsetForName;
        f43029r0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f43030s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f43007V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f43008W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f43022k0;
            if (i10 >= eVarArr11.length) {
                HashMap map = f43027p0;
                e[] eVarArr12 = f43023l0;
                map.put(Integer.valueOf(eVarArr12[0].f43075a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f43075a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f43075a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f43075a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f43075a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f43075a), 8);
                f43031t0 = Pattern.compile(".*[1-9].*");
                f43032u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f43033v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f43035w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f43024m0[i10] = new HashMap();
            f43025n0[i10] = new HashMap();
            for (e eVar : eVarArr11[i10]) {
                f43024m0[i10].put(Integer.valueOf(eVar.f43075a), eVar);
                f43025n0[i10].put(eVar.f43076b, eVar);
            }
            i10++;
        }
    }

    public C5477a(String str) throws Throwable {
        e[][] eVarArr = f43022k0;
        this.f43044f = new HashMap[eVarArr.length];
        this.f43045g = new HashSet(eVarArr.length);
        this.f43046h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        F(str);
    }

    public static int B(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    public static Pair C(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairC = C(strArrSplit[0]);
            if (((Integer) pairC.first).intValue() == 2) {
                return pairC;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair pairC2 = C(strArrSplit[i10]);
                int iIntValue = (((Integer) pairC2.first).equals(pairC.first) || ((Integer) pairC2.second).equals(pairC.first)) ? ((Integer) pairC.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairC.second).intValue() == -1 || !(((Integer) pairC2.first).equals(pairC.second) || ((Integer) pairC2.second).equals(pairC.second))) ? -1 : ((Integer) pairC.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairC = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairC = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairC;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    return (j10 < 0 || j10 > 65535) ? j10 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static boolean I(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f42988C;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean N(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f43034w) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean P(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    public static double f(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = d10 + (d11 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static boolean h0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static void j0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    public final void A(b bVar) throws Throwable {
        if (f43034w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.g(f42998M.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f42999N;
        bVar.g(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f43000O, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f43029r0;
                    if (AbstractC5478b.f(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f43054p = i12;
                    W(bArrCopyOfRange, 0);
                    g0(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.g(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void D(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f43046h);
        int iM2 = dVar2.m(this.f43046h);
        if (this.f43042d == 7) {
            iM += this.f43055q;
        }
        if (iM > 0 && iM2 > 0) {
            this.f43047i = true;
            if (this.f43039a == null && this.f43041c == null && this.f43040b == null) {
                byte[] bArr = new byte[iM2];
                bVar.g(iM);
                bVar.readFully(bArr);
                this.f43052n = bArr;
            }
            this.f43050l = iM;
            this.f43051m = iM2;
        }
        if (f43034w) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iM2);
        }
    }

    public final void E(b bVar, HashMap map) throws IOException {
        int i10;
        d dVar = (d) map.get("StripOffsets");
        d dVar2 = (d) map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrC = AbstractC5478b.c(dVar.o(this.f43046h));
        long[] jArrC2 = AbstractC5478b.c(dVar2.o(this.f43046h));
        if (jArrC == null || jArrC.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrC2) {
            j10 += j11;
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f43049k = true;
        this.f43048j = true;
        this.f43047i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < jArrC.length) {
            int i16 = (int) jArrC[i13];
            int i17 = (int) jArrC2[i13];
            if (i13 < jArrC.length - i12) {
                i10 = i13;
                if (i16 + i17 != jArrC[i10 + 1]) {
                    this.f43049k = false;
                }
            } else {
                i10 = i13;
            }
            int i18 = i16 - i14;
            if (i18 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.g(i18);
                int i19 = i14 + i18;
                byte[] bArr2 = new byte[i17];
                try {
                    bVar.readFully(bArr2);
                    i14 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    i15 += i17;
                    i13 = i10 + 1;
                    i12 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                return;
            }
        }
        this.f43052n = bArr;
        if (this.f43049k) {
            this.f43050l = (int) jArrC[0];
            this.f43051m = i11;
        }
    }

    public final void F(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f43041c = null;
        this.f43039a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (N(fileInputStream2.getFD())) {
                    this.f43040b = fileInputStream2.getFD();
                } else {
                    this.f43040b = null;
                }
                S(fileInputStream2);
                AbstractC5478b.b(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                AbstractC5478b.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean G() {
        int iL = l("Orientation", 1);
        return iL == 2 || iL == 7 || iL == 4 || iL == 5;
    }

    public final int H(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, f42989D)) {
                        bVar2.close();
                        return 0;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j10 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return 0;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j12 != 1) {
                                if (Arrays.equals(bArr3, f42990E)) {
                                    z10 = true;
                                } else if (Arrays.equals(bArr3, f42991F)) {
                                    z11 = true;
                                } else if (Arrays.equals(bArr3, f42992G) || Arrays.equals(bArr3, f42993H)) {
                                    z12 = true;
                                }
                                if (!z10) {
                                    continue;
                                } else {
                                    if (z11) {
                                        bVar2.close();
                                        return 12;
                                    }
                                    if (z12) {
                                        bVar2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return 0;
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f43034w) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return 0;
    }

    public final boolean J(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderV = V(bVar);
            this.f43046h = byteOrderV;
            bVar.f(byteOrderV);
            short s10 = bVar.readShort();
            boolean z10 = s10 == 20306 || s10 == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean K(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f42996K;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean L(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean M(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder byteOrderV = V(bVar);
            this.f43046h = byteOrderV;
            bVar.f(byteOrderV);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean O(HashMap map) {
        d dVar;
        int iM;
        d dVar2 = (d) map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f43046h);
            int[] iArr2 = f43038z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f43042d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((iM = dVar.m(this.f43046h)) == 1 && Arrays.equals(iArr, f42987B)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f43034w) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean Q(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f43046h) <= 512 && dVar2.m(this.f43046h) <= 512;
    }

    public final boolean R(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f42998M;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f42999N;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f42998M.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    public final void S(InputStream inputStream) {
        for (int i10 = 0; i10 < f43022k0.length; i10++) {
            try {
                try {
                    this.f43044f[i10] = new HashMap();
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z10 = f43034w;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    e();
                    if (z10) {
                        U();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                e();
                if (f43034w) {
                    U();
                }
                throw th;
            }
        }
        if (!this.f43043e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f43042d = q(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (h0(this.f43042d)) {
            g gVar = new g(inputStream);
            if (!this.f43043e) {
                int i11 = this.f43042d;
                if (i11 == 12 || i11 == 15) {
                    n(gVar, i11);
                } else if (i11 == 7) {
                    r(gVar);
                } else if (i11 == 10) {
                    w(gVar);
                } else {
                    u(gVar);
                }
            } else if (!x(gVar)) {
                e();
                if (f43034w) {
                    U();
                    return;
                }
                return;
            }
            gVar.h(this.f43054p);
            g0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f43042d;
            if (i12 == 4) {
                o(bVar, 0, 0);
            } else if (i12 == 13) {
                s(bVar);
            } else if (i12 == 9) {
                t(bVar);
            } else if (i12 == 14) {
                A(bVar);
            }
        }
        e();
        if (f43034w) {
            U();
        }
    }

    public final void T(b bVar) throws IOException {
        ByteOrder byteOrderV = V(bVar);
        this.f43046h = byteOrderV;
        bVar.f(byteOrderV);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f43042d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.g(i12);
        }
    }

    public final void U() {
        for (int i10 = 0; i10 < this.f43044f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f43044f[i10].size());
            for (Map.Entry entry : this.f43044f[i10].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f43046h) + "'");
            }
        }
    }

    public final ByteOrder V(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f43034w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f43034w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void W(byte[] bArr, int i10) throws IOException {
        g gVar = new g(bArr);
        T(gVar);
        X(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(q1.C5477a.g r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.X(q1.a$g, int):void");
    }

    public final void Y(String str) {
        for (int i10 = 0; i10 < f43022k0.length; i10++) {
            this.f43044f[i10].remove(str);
        }
    }

    public final void Z(int i10, String str, String str2) {
        if (this.f43044f[i10].isEmpty() || this.f43044f[i10].get(str) == null) {
            return;
        }
        HashMap map = this.f43044f[i10];
        map.put(str2, (d) map.get(str));
        this.f43044f[i10].remove(str);
    }

    public final void a0(g gVar, int i10) throws Throwable {
        d dVar = (d) this.f43044f[i10].get("ImageLength");
        d dVar2 = (d) this.f43044f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f43044f[i10].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f43044f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f43046h);
            int iM2 = dVar3.m(this.f43046h);
            gVar.h(iM);
            byte[] bArr = new byte[iM2];
            gVar.readFully(bArr);
            o(new b(bArr), iM, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fe, TryCatch #18 {Exception -> 0x00fe, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x0110, B:76:0x0101), top: B:127:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101 A[Catch: all -> 0x00fa, Exception -> 0x00fe, TryCatch #18 {Exception -> 0x00fe, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x0110, B:76:0x0101), top: B:127:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.b0():void");
    }

    public final void c0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte b10;
        byte[] bArr;
        if (f43034w) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        cVar.b(-1);
        cVar.b(-31);
        this.f43054p = m0(cVar);
        if (this.f43059u != null) {
            cVar.write(-1);
            cVar.b(-31);
            byte[] bArr2 = f43030s0;
            cVar.g(bArr2.length + 2 + this.f43059u.f43074d.length);
            cVar.write(bArr2);
            cVar.write(this.f43059u.f43074d);
            this.f43060v = true;
        }
        byte[] bArr3 = new byte[RecognitionOptions.AZTEC];
        while (bVar.readByte() == -1) {
            do {
                b10 = bVar.readByte();
            } while (b10 == -1);
            if (b10 == -39 || b10 == -38) {
                cVar.b(-1);
                cVar.b(b10);
                AbstractC5478b.d(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.b(-1);
                cVar.b(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.g(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr3, 0, Math.min(i10, RecognitionOptions.AZTEC));
                    if (i11 >= 0) {
                        cVar.write(bArr3, 0, i11);
                        i10 -= i11;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = f43030s0;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f43029r0;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (AbstractC5478b.f(bArr, f43029r0) || AbstractC5478b.f(bArr, bArr4)) {
                        bVar.g(length - bArr.length);
                    }
                }
                cVar.b(-1);
                cVar.b(b10);
                cVar.g(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i12 = bVar.read(bArr3, 0, Math.min(length, RecognitionOptions.AZTEC));
                    if (i12 >= 0) {
                        cVar.write(bArr3, 0, i12);
                        length -= i12;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.d0(java.io.InputStream, java.io.OutputStream):void");
    }

    public final void e() {
        String strJ = j("DateTimeOriginal");
        if (strJ != null && j("DateTime") == null) {
            this.f43044f[0].put("DateTime", d.e(strJ));
        }
        if (j("ImageWidth") == null) {
            this.f43044f[0].put("ImageWidth", d.f(0L, this.f43046h));
        }
        if (j("ImageLength") == null) {
            this.f43044f[0].put("ImageLength", d.f(0L, this.f43046h));
        }
        if (j("Orientation") == null) {
            this.f43044f[0].put("Orientation", d.f(0L, this.f43046h));
        }
        if (j("LightSource") == null) {
            this.f43044f[1].put("LightSource", d.f(0L, this.f43046h));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0213 A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, all -> 0x007e, blocks: (B:7:0x004f, B:9:0x005b, B:11:0x006f, B:12:0x0071, B:80:0x01f7, B:82:0x0213, B:83:0x021c, B:19:0x0086, B:21:0x0095, B:23:0x009d, B:25:0x00a1, B:28:0x00b1, B:30:0x00bc, B:31:0x00c1, B:32:0x00c3, B:36:0x00d1, B:37:0x00d6, B:38:0x00da, B:39:0x00e6, B:41:0x00ee, B:45:0x00fc, B:47:0x0104, B:50:0x010b, B:52:0x011a, B:54:0x012a, B:69:0x0186, B:71:0x0192, B:72:0x0199, B:74:0x01d3, B:79:0x01f0, B:76:0x01e1, B:78:0x01e9, B:55:0x013e, B:56:0x0145, B:57:0x0146, B:59:0x0150, B:61:0x0156, B:65:0x016f, B:66:0x0177, B:67:0x017e), top: B:97:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(java.io.InputStream r22, java.io.OutputStream r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.e0(java.io.InputStream, java.io.OutputStream):void");
    }

    public void f0(String str, String str2) {
        e eVar;
        int i10;
        String str3;
        int i11;
        int i12;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (f43034w) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i13 = 2;
        String str5 = "/";
        int i14 = 1;
        if (strReplaceAll != null) {
            if (f43026o0.contains(str4) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = f.b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f43032u0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean zFind = f43033v0.matcher(strReplaceAll).find();
                boolean zFind2 = f43035w0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                }
            }
        }
        int i15 = 0;
        if ("Xmp".equals(str4)) {
            boolean z10 = this.f43044f[0].containsKey("Xmp") || this.f43044f[5].containsKey("Xmp");
            int iB = B(this.f43042d);
            if ((iB == 2 && (this.f43059u != null || !z10)) || (iB == 3 && !z10)) {
                this.f43059u = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i16 = 0;
        while (i16 < f43022k0.length) {
            if ((i16 != 4 || this.f43047i) && (eVar = (e) f43025n0[i16].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair pairC = C(strReplaceAll);
                    if (eVar.f43077c == ((Integer) pairC.first).intValue() || eVar.f43077c == ((Integer) pairC.second).intValue()) {
                        i10 = eVar.f43077c;
                    } else {
                        int i17 = eVar.f43078d;
                        if (i17 == -1 || !(i17 == ((Integer) pairC.first).intValue() || eVar.f43078d == ((Integer) pairC.second).intValue())) {
                            int i18 = eVar.f43077c;
                            if (i18 == i14 || i18 == 7 || i18 == i13) {
                                i10 = i18;
                            } else if (f43034w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f43009X;
                                sb2.append(strArr[eVar.f43077c]);
                                sb2.append(eVar.f43078d == -1 ? "" : ", " + strArr[eVar.f43078d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairC.first).intValue()]);
                                sb2.append(((Integer) pairC.second).intValue() != -1 ? ", " + strArr[((Integer) pairC.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i10 = eVar.f43078d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            this.f43044f[i16].put(str4, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            this.f43044f[i16].put(str4, d.e(strReplaceAll));
                            break;
                        case 3:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i19 = i12; i19 < strArrSplit.length; i19++) {
                                iArr[i19] = Integer.parseInt(strArrSplit[i19]);
                            }
                            this.f43044f[i16].put(str4, d.k(iArr, this.f43046h));
                            break;
                        case 4:
                            str3 = str5;
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i20 = i12; i20 < strArrSplit2.length; i20++) {
                                jArr[i20] = Long.parseLong(strArrSplit2[i20]);
                            }
                            this.f43044f[i16].put(str4, d.g(jArr, this.f43046h));
                            break;
                        case 5:
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            int i21 = i12;
                            while (i21 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i21].split(str5, -1);
                                fVarArr[i21] = new f((long) Double.parseDouble(strArrSplit4[i12]), (long) Double.parseDouble(strArrSplit4[i11]), null);
                                i21++;
                                str5 = str5;
                            }
                            str3 = str5;
                            this.f43044f[i16].put(str4, d.i(fVarArr, this.f43046h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f43034w) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                            }
                            break;
                        case 9:
                            i11 = i14;
                            i12 = i15;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i22 = i12; i22 < strArrSplit5.length; i22++) {
                                iArr2[i22] = Integer.parseInt(strArrSplit5[i22]);
                            }
                            this.f43044f[i16].put(str4, d.c(iArr2, this.f43046h));
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i23 = i15;
                            while (i23 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i23].split(str5, -1);
                                int i24 = i14;
                                int i25 = i23;
                                fVarArr2[i25] = new f((long) Double.parseDouble(strArrSplit7[i15]), (long) Double.parseDouble(strArrSplit7[i24]), null);
                                i23 = i25 + 1;
                                i14 = i24;
                                strArrSplit6 = strArrSplit6;
                                i15 = i15;
                            }
                            i11 = i14;
                            i12 = i15;
                            this.f43044f[i16].put(str4, d.d(fVarArr2, this.f43046h));
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i26 = i15; i26 < strArrSplit8.length; i26++) {
                                dArr[i26] = Double.parseDouble(strArrSplit8[i26]);
                            }
                            this.f43044f[i16].put(str4, d.b(dArr, this.f43046h));
                            break;
                    }
                } else {
                    this.f43044f[i16].remove(str4);
                }
                str3 = str5;
                i11 = i14;
                i12 = i15;
            } else {
                str3 = str5;
                i11 = i14;
                i12 = i15;
            }
            i16++;
            i14 = i11;
            i15 = i12;
            str5 = str3;
            i13 = 2;
        }
    }

    public final void g(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            h(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final void g0(b bVar) throws Throwable {
        HashMap map = this.f43044f[4];
        d dVar = (d) map.get("Compression");
        if (dVar == null) {
            this.f43053o = 6;
            D(bVar, map);
            return;
        }
        int iM = dVar.m(this.f43046h);
        this.f43053o = iM;
        if (iM != 1) {
            if (iM == 6) {
                D(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (O(map)) {
            E(bVar, map);
        }
    }

    public final void h(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.c(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        AbstractC5478b.e(bVar, cVar, i10);
    }

    public double i(double d10) {
        double dK = k("GPSAltitude", -1.0d);
        int iL = l("GPSAltitudeRef", -1);
        if (dK < 0.0d || iL < 0) {
            return d10;
        }
        return dK * ((double) (iL != 1 ? 1 : -1));
    }

    public final void i0(int i10, int i11) throws Throwable {
        if (this.f43044f[i10].isEmpty() || this.f43044f[i11].isEmpty()) {
            if (f43034w) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) this.f43044f[i10].get("ImageLength");
        d dVar2 = (d) this.f43044f[i10].get("ImageWidth");
        d dVar3 = (d) this.f43044f[i11].get("ImageLength");
        d dVar4 = (d) this.f43044f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f43034w) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f43034w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM = dVar.m(this.f43046h);
        int iM2 = dVar2.m(this.f43046h);
        int iM3 = dVar3.m(this.f43046h);
        int iM4 = dVar4.m(this.f43046h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap[] mapArr = this.f43044f;
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public String j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarM = m(str);
        if (dVarM == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f43026o0.contains(str)) {
                return dVarM.n(this.f43046h);
            }
            try {
                return Double.toString(dVarM.l(this.f43046h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = dVarM.f43071a;
        if (i10 != 5 && i10 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarM.f43071a);
            return null;
        }
        f[] fVarArr = (f[]) dVarM.o(this.f43046h);
        if (fVarArr == null || fVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (fVar.f43079a / fVar.f43080b));
        f fVar2 = fVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (fVar2.f43079a / fVar2.f43080b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f43079a / fVar3.f43080b)));
    }

    public double k(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarM = m(str);
        if (dVarM != null) {
            try {
                return dVarM.l(this.f43046h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    public final void k0(g gVar, int i10) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = (d) this.f43044f[i10].get("DefaultCropSize");
        d dVar2 = (d) this.f43044f[i10].get("SensorTopBorder");
        d dVar3 = (d) this.f43044f[i10].get("SensorLeftBorder");
        d dVar4 = (d) this.f43044f[i10].get("SensorBottomBorder");
        d dVar5 = (d) this.f43044f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                a0(gVar, i10);
                return;
            }
            int iM = dVar2.m(this.f43046h);
            int iM2 = dVar4.m(this.f43046h);
            int iM3 = dVar5.m(this.f43046h);
            int iM4 = dVar3.m(this.f43046h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.f43046h);
            d dVarJ4 = d.j(iM3 - iM4, this.f43046h);
            this.f43044f[i10].put("ImageLength", dVarJ3);
            this.f43044f[i10].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f43071a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f43046h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarJ = d.h(fVarArr[0], this.f43046h);
            dVarJ2 = d.h(fVarArr[1], this.f43046h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f43046h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarJ = d.j(iArr[0], this.f43046h);
            dVarJ2 = d.j(iArr[1], this.f43046h);
        }
        this.f43044f[i10].put("ImageWidth", dVarJ);
        this.f43044f[i10].put("ImageLength", dVarJ2);
    }

    public int l(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarM = m(str);
        if (dVarM != null) {
            try {
                return dVarM.m(this.f43046h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public final void l0() throws Throwable {
        i0(0, 5);
        i0(0, 4);
        i0(5, 4);
        d dVar = (d) this.f43044f[1].get("PixelXDimension");
        d dVar2 = (d) this.f43044f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f43044f[0].put("ImageWidth", dVar);
            this.f43044f[0].put("ImageLength", dVar2);
        }
        if (this.f43044f[4].isEmpty() && Q(this.f43044f[5])) {
            HashMap[] mapArr = this.f43044f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!Q(this.f43044f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        Z(0, "ThumbnailOrientation", "Orientation");
        Z(0, "ThumbnailImageLength", "ImageLength");
        Z(0, "ThumbnailImageWidth", "ImageWidth");
        Z(5, "ThumbnailOrientation", "Orientation");
        Z(5, "ThumbnailImageLength", "ImageLength");
        Z(5, "ThumbnailImageWidth", "ImageWidth");
        Z(4, "Orientation", "ThumbnailOrientation");
        Z(4, "ImageLength", "ThumbnailImageLength");
        Z(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final d m(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f43034w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && B(this.f43042d) == 2 && (dVar2 = this.f43059u) != null) {
            return dVar2;
        }
        for (int i10 = 0; i10 < f43022k0.length; i10++) {
            d dVar3 = (d) this.f43044f[i10].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f43059u) == null) {
            return null;
        }
        return dVar;
    }

    public final int m0(c cVar) throws IOException {
        char c10;
        char c11;
        long j10;
        e[][] eVarArr = f43022k0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f43023l0) {
            Y(eVar.f43076b);
        }
        if (this.f43047i) {
            if (this.f43048j) {
                Y("StripOffsets");
                Y("StripByteCounts");
            } else {
                Y("JPEGInterchangeFormat");
                Y("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f43022k0.length; i10++) {
            Iterator it = this.f43044f[i10].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
        }
        long j11 = 0;
        if (!this.f43044f[1].isEmpty()) {
            this.f43044f[0].put(f43023l0[1].f43076b, d.f(0L, this.f43046h));
        }
        if (!this.f43044f[2].isEmpty()) {
            this.f43044f[0].put(f43023l0[2].f43076b, d.f(0L, this.f43046h));
        }
        if (this.f43044f[3].isEmpty()) {
            c10 = 2;
        } else {
            c10 = 2;
            this.f43044f[1].put(f43023l0[3].f43076b, d.f(0L, this.f43046h));
        }
        if (!this.f43047i) {
            c11 = 3;
        } else if (this.f43048j) {
            this.f43044f[4].put("StripOffsets", d.j(0, this.f43046h));
            this.f43044f[4].put("StripByteCounts", d.j(this.f43051m, this.f43046h));
            c11 = 3;
        } else {
            this.f43044f[4].put("JPEGInterchangeFormat", d.f(0L, this.f43046h));
            c11 = 3;
            this.f43044f[4].put("JPEGInterchangeFormatLength", d.f(this.f43051m, this.f43046h));
        }
        for (int i11 = 0; i11 < f43022k0.length; i11++) {
            Iterator it2 = this.f43044f[i11].entrySet().iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int iP = ((d) ((Map.Entry) it2.next()).getValue()).p();
                if (iP > 4) {
                    i12 += iP;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < f43022k0.length; i13++) {
            if (!this.f43044f[i13].isEmpty()) {
                iArr[i13] = size;
                size += (this.f43044f[i13].size() * 12) + 6 + iArr2[i13];
            }
        }
        if (this.f43047i) {
            if (this.f43048j) {
                this.f43044f[4].put("StripOffsets", d.j(size, this.f43046h));
            } else {
                this.f43044f[4].put("JPEGInterchangeFormat", d.f(size, this.f43046h));
            }
            this.f43050l = size;
            size += this.f43051m;
        }
        if (this.f43042d == 4) {
            size += 8;
        }
        if (f43034w) {
            for (int i14 = 0; i14 < f43022k0.length; i14++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr[i14]), Integer.valueOf(this.f43044f[i14].size()), Integer.valueOf(iArr2[i14]), Integer.valueOf(size)));
            }
        }
        if (!this.f43044f[1].isEmpty()) {
            this.f43044f[0].put(f43023l0[1].f43076b, d.f(iArr[1], this.f43046h));
        }
        if (!this.f43044f[c10].isEmpty()) {
            this.f43044f[0].put(f43023l0[c10].f43076b, d.f(iArr[c10], this.f43046h));
        }
        if (!this.f43044f[c11].isEmpty()) {
            this.f43044f[1].put(f43023l0[c11].f43076b, d.f(iArr[c11], this.f43046h));
        }
        int i15 = this.f43042d;
        if (i15 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.g(size);
            cVar.write(f43029r0);
        } else if (i15 == 13) {
            cVar.c(size);
            cVar.c(1700284774);
        } else if (i15 == 14) {
            cVar.write(f43000O);
            cVar.c(size);
        }
        int size2 = cVar.f43069a.size();
        cVar.d(this.f43046h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.f43046h);
        cVar.g(42);
        cVar.f(8L);
        int i16 = 0;
        while (i16 < f43022k0.length) {
            if (this.f43044f[i16].isEmpty()) {
                j10 = j11;
            } else {
                cVar.g(this.f43044f[i16].size());
                int size3 = iArr[i16] + 2 + (this.f43044f[i16].size() * 12) + 4;
                for (Map.Entry entry : this.f43044f[i16].entrySet()) {
                    int i17 = ((e) f43025n0[i16].get(entry.getKey())).f43075a;
                    d dVar = (d) entry.getValue();
                    int iP2 = dVar.p();
                    cVar.g(i17);
                    cVar.g(dVar.f43071a);
                    cVar.c(dVar.f43072b);
                    if (iP2 > 4) {
                        cVar.f(size3);
                        size3 += iP2;
                    } else {
                        cVar.write(dVar.f43074d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.b(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i16 != 0 || this.f43044f[4].isEmpty()) {
                    j10 = 0;
                    cVar.f(0L);
                } else {
                    cVar.f(iArr[4]);
                    j10 = 0;
                }
                Iterator it3 = this.f43044f[i16].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it3.next()).getValue()).f43074d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i16++;
            j11 = j10;
        }
        if (this.f43047i) {
            cVar.write(z());
        }
        if (this.f43042d == 14 && size % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    public final void n(g gVar, int i10) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC5478b.a.a(mediaMetadataRetriever, new C0574a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f43044f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.f43046h));
                }
                if (strExtractMetadata2 != null) {
                    this.f43044f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata2), this.f43046h));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    this.f43044f[0].put("Orientation", d.j(i11 != 90 ? i11 != 180 ? i11 != 270 ? 1 : 8 : 3 : 6, this.f43046h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.h(i12);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f43029r0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    gVar.readFully(bArr2);
                    this.f43054p = i14;
                    W(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i16 = Integer.parseInt(strExtractMetadata8);
                    int i17 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i16;
                    gVar.h(j10);
                    byte[] bArr3 = new byte[i17];
                    gVar.readFully(bArr3);
                    this.f43059u = new d(1, i17, j10, bArr3);
                    this.f43060v = true;
                }
                if (f43034w) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } finally {
        }
    }

    public final void n0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f43054p = cVar.f43069a.size() + m0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.c((int) crc32.getValue());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00b1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c A[LOOP:0: B:10:0x0037->B:57:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(q1.C5477a.b r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.o(q1.a$b, int, int):void");
    }

    public final void o0(c cVar) throws IOException {
        cVar.c(this.f43059u.f43074d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.c(1767135348);
        j0(crc32, 1767135348);
        byte[] bArr = f42997L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f43059u.f43074d);
        crc32.update(this.f43059u.f43074d);
        cVar.c((int) crc32.getValue());
        this.f43060v = true;
    }

    public double[] p() {
        String strJ = j("GPSLatitude");
        String strJ2 = j("GPSLatitudeRef");
        String strJ3 = j("GPSLongitude");
        String strJ4 = j("GPSLongitudeRef");
        if (strJ == null || strJ2 == null || strJ3 == null || strJ4 == null) {
            return null;
        }
        try {
            return new double[]{f(strJ, strJ2), f(strJ3, strJ4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strJ, strJ2, strJ3, strJ4));
            return null;
        }
    }

    public final int q(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (I(bArr)) {
            return 4;
        }
        if (L(bArr)) {
            return 9;
        }
        int iH = H(bArr);
        if (iH != 0) {
            return iH;
        }
        if (J(bArr)) {
            return 7;
        }
        if (M(bArr)) {
            return 10;
        }
        if (K(bArr)) {
            return 13;
        }
        return R(bArr) ? 14 : 0;
    }

    public final void r(g gVar) throws Throwable {
        int i10;
        int i11;
        u(gVar);
        d dVar = (d) this.f43044f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f43074d);
            gVar2.f(this.f43046h);
            byte[] bArr = f42994I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.h(0L);
            byte[] bArr3 = f42995J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.h(12L);
            }
            X(gVar2, 6);
            d dVar2 = (d) this.f43044f[7].get("PreviewImageStart");
            d dVar3 = (d) this.f43044f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f43044f[5].put("JPEGInterchangeFormat", dVar2);
                this.f43044f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) this.f43044f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f43046h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarJ = d.j(i14, this.f43046h);
                d dVarJ2 = d.j(i15, this.f43046h);
                this.f43044f[0].put("ImageWidth", dVarJ);
                this.f43044f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r17.f43060v = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(q1.C5477a.b r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.s(q1.a$b):void");
    }

    public final void t(b bVar) throws Throwable {
        boolean z10 = f43034w;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.g(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.g(i10 - bVar.b());
        bVar.readFully(bArr4);
        o(new b(bArr4), i10, 5);
        bVar.g(i12 - bVar.b());
        bVar.f(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f43017f0.f43075a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarJ = d.j(s10, this.f43046h);
                d dVarJ2 = d.j(s11, this.f43046h);
                this.f43044f[0].put("ImageLength", dVarJ);
                this.f43044f[0].put("ImageWidth", dVarJ2);
                if (f43034w) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.g(unsignedShort2);
        }
    }

    public final void u(g gVar) throws Throwable {
        d dVar;
        T(gVar);
        X(gVar, 0);
        k0(gVar, 0);
        k0(gVar, 5);
        k0(gVar, 4);
        l0();
        if (this.f43042d != 8 || (dVar = (d) this.f43044f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f43074d);
        gVar2.f(this.f43046h);
        gVar2.g(6);
        X(gVar2, 9);
        d dVar2 = (d) this.f43044f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f43044f[1].put("ColorSpace", dVar2);
        }
    }

    public int v() {
        switch (l("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void w(g gVar) throws Throwable {
        if (f43034w) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        u(gVar);
        d dVar = (d) this.f43044f[0].get("JpgFromRaw");
        if (dVar != null) {
            o(new b(dVar.f43074d), (int) dVar.f43073c, 5);
        }
        d dVar2 = (d) this.f43044f[0].get("ISO");
        d dVar3 = (d) this.f43044f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f43044f[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean x(g gVar) throws IOException {
        byte[] bArr = f43029r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrC = gVar.c();
        this.f43054p = bArr.length;
        W(bArrC, 0);
        return true;
    }

    public byte[] y() {
        int i10 = this.f43053o;
        if (i10 == 6 || i10 == 7) {
            return z();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] z() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f43047i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.f43052n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f43041c     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            if (r1 == 0) goto L2d
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L24
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L55
        L1c:
            r8 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto L8c
        L21:
            r8 = move-exception
            r3 = r2
            goto L7e
        L24:
            java.lang.String r8 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r8)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            q1.AbstractC5478b.b(r1)
            return r2
        L2d:
            java.lang.String r1 = r8.f43039a     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            if (r1 == 0) goto L40
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            java.lang.String r3 = r8.f43039a     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            goto L1a
        L39:
            r8 = move-exception
            r3 = r2
            goto L8c
        L3c:
            r8 = move-exception
            r1 = r2
            r3 = r1
            goto L7e
        L40:
            java.io.FileDescriptor r1 = r8.f43040b     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r7 = r3
            r3 = r1
            r1 = r7
        L55:
            q1.a$b r4 = new q1.a$b     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            int r5 = r8.f43050l     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            int r6 = r8.f43054p     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            int r5 = r5 + r6
            r4.g(r5)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            int r5 = r8.f43051m     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r8.f43052n = r5     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            q1.AbstractC5478b.b(r1)
            if (r3 == 0) goto L73
            q1.AbstractC5478b.a(r3)
        L73:
            return r5
        L74:
            r8 = move-exception
            goto L1e
        L76:
            r8 = move-exception
            goto L7e
        L78:
            r8 = move-exception
            r3 = r1
            goto L8c
        L7b:
            r8 = move-exception
            r3 = r1
            r1 = r2
        L7e:
            java.lang.String r4 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r4, r8)     // Catch: java.lang.Throwable -> L74
            q1.AbstractC5478b.b(r1)
            if (r3 == 0) goto L8b
            q1.AbstractC5478b.a(r3)
        L8b:
            return r2
        L8c:
            q1.AbstractC5478b.b(r2)
            if (r3 == 0) goto L94
            q1.AbstractC5478b.a(r3)
        L94:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.z():byte[]");
    }

    /* JADX INFO: renamed from: q1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f43064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteOrder f43066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f43067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43068e;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f43068e = bArr.length;
        }

        public int a() {
            return this.f43068e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f43064a.available();
        }

        public int b() {
            return this.f43065b;
        }

        public byte[] c() throws IOException {
            byte[] bArrCopyOf = new byte[RecognitionOptions.UPC_E];
            int i10 = 0;
            while (true) {
                if (i10 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i11 = this.f43064a.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
                if (i11 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i10);
                }
                i10 += i11;
                this.f43065b += i11;
            }
        }

        public long d() {
            return ((long) readInt()) & KeyboardMap.kValueMask;
        }

        public void f(ByteOrder byteOrder) {
            this.f43066c = byteOrder;
        }

        public void g(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f43064a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f43067d == null) {
                        this.f43067d = new byte[8192];
                    }
                    iSkip = this.f43064a.read(this.f43067d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f43065b += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f43065b++;
            return this.f43064a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f43065b++;
            return this.f43064a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f43065b++;
            int i10 = this.f43064a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f43065b += 2;
            return this.f43064a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f43065b += i11;
            this.f43064a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f43065b += 4;
            int i10 = this.f43064a.read();
            int i11 = this.f43064a.read();
            int i12 = this.f43064a.read();
            int i13 = this.f43064a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43066c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f43066c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f43065b += 8;
            int i10 = this.f43064a.read();
            int i11 = this.f43064a.read();
            int i12 = this.f43064a.read();
            int i13 = this.f43064a.read();
            int i14 = this.f43064a.read();
            int i15 = this.f43064a.read();
            int i16 = this.f43064a.read();
            int i17 = this.f43064a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43066c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f43066c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i10;
            this.f43065b += 2;
            int i11 = this.f43064a.read();
            int i12 = this.f43064a.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43066c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                i10 = (i12 << 8) + i11;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    throw new IOException("Invalid byte order: " + this.f43066c);
                }
                i10 = (i11 << 8) + i12;
            }
            return (short) i10;
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f43065b += 2;
            return this.f43064a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f43065b++;
            return this.f43064a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f43065b += 2;
            int i10 = this.f43064a.read();
            int i11 = this.f43064a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43066c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f43066c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f43064a.read(bArr, i10, i11);
            this.f43065b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f43065b += bArr.length;
            this.f43064a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f43064a = dataInputStream;
            dataInputStream.mark(0);
            this.f43065b = 0;
            this.f43066c = byteOrder;
            this.f43068e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    /* JADX INFO: renamed from: q1.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f43064a.mark(Integer.MAX_VALUE);
        }

        public void h(long j10) throws IOException {
            int i10 = this.f43065b;
            if (i10 > j10) {
                this.f43065b = 0;
                this.f43064a.reset();
            } else {
                j10 -= (long) i10;
            }
            g((int) j10);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f43064a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: renamed from: q1.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f43078d;

        public e(String str, int i10, int i11) {
            this.f43076b = str;
            this.f43075a = i10;
            this.f43077c = i11;
            this.f43078d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f43077c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f43078d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public e(String str, int i10, int i11, int i12) {
            this.f43076b = str;
            this.f43075a = i10;
            this.f43077c = i11;
            this.f43078d = i12;
        }
    }

    public C5477a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5477a(java.io.InputStream r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            q1.a$e[][] r0 = q1.C5477a.f43022k0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.f43044f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.f43045g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.f43046h = r0
            if (r3 == 0) goto L57
            r0 = 0
            r2.f43039a = r0
            r1 = 1
            if (r4 != r1) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            r2.f43043e = r1
            if (r1 == 0) goto L29
            r2.f43041c = r0
            r2.f43040b = r0
            goto L53
        L29:
            boolean r4 = r3 instanceof android.content.res.AssetManager.AssetInputStream
            if (r4 == 0) goto L35
            r4 = r3
            android.content.res.AssetManager$AssetInputStream r4 = (android.content.res.AssetManager.AssetInputStream) r4
            r2.f43041c = r4
            r2.f43040b = r0
            goto L53
        L35:
            boolean r4 = r3 instanceof java.io.FileInputStream
            if (r4 == 0) goto L4f
            r4 = r3
            java.io.FileInputStream r4 = (java.io.FileInputStream) r4
            java.io.FileDescriptor r1 = r4.getFD()
            boolean r1 = N(r1)
            if (r1 == 0) goto L4f
            r2.f43041c = r0
            java.io.FileDescriptor r4 = r4.getFD()
            r2.f43040b = r4
            goto L53
        L4f:
            r2.f43041c = r0
            r2.f43040b = r0
        L53:
            r2.S(r3)
            return
        L57:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "inputStream cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5477a.<init>(java.io.InputStream, int):void");
    }

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0574a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f43061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43062b;

        public C0574a(g gVar) {
            this.f43062b = gVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f43061a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f43062b.available())) {
                        return -1;
                    }
                    this.f43062b.h(j10);
                    this.f43061a = j10;
                }
                if (i11 > this.f43062b.available()) {
                    i11 = this.f43062b.available();
                }
                int i12 = this.f43062b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f43061a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f43061a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
