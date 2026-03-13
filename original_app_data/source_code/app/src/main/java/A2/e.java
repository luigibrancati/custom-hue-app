package A2;

import D1.AbstractC0747e;
import D1.C0748f;
import D1.C0753k;
import D1.w;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import i2.C4327g;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.O;
import i2.P;
import i2.r;
import i2.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC4336p {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final u f17f0 = new u() { // from class: A2.d
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return e.b();
        }
    };

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f18g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f19h0 = M.u0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final byte[] f20i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final byte[] f21j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final UUID f22k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Map f23l0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f24A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f25B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f26C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f27D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f28E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public G1.u f29F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public G1.u f30G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f31H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f32I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f33J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f34K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f35L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f36M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f37N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int[] f38O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f39P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f40Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f41R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f42S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f43T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f44U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f45V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f46W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f47X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f48Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f49Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A2.c f50a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f51a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f52b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f53b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f54c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public byte f55c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f57d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f58e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public r f59e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s.a f60f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f61g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f62h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f63i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C f64j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C f65k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C f66l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C f67m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C f68n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C f69o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C f70p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f71q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f72r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f73s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f74t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f75u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f76v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f77w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f78x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f79y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f80z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements A2.b {
        public b() {
        }

        @Override // A2.b
        public void a(int i10) throws w {
            e.this.q(i10);
        }

        @Override // A2.b
        public void b(int i10, int i11, InterfaceC4337q interfaceC4337q) throws w {
            e.this.n(i10, i11, interfaceC4337q);
        }

        @Override // A2.b
        public void c(int i10, double d10) throws w {
            e.this.t(i10, d10);
        }

        @Override // A2.b
        public void d(int i10, long j10) throws w {
            e.this.z(i10, j10);
        }

        @Override // A2.b
        public int e(int i10) {
            return e.this.w(i10);
        }

        @Override // A2.b
        public boolean f(int i10) {
            return e.this.B(i10);
        }

        @Override // A2.b
        public void g(int i10, String str) throws w {
            e.this.I(i10, str);
        }

        @Override // A2.b
        public void h(int i10, long j10, long j11) throws w {
            e.this.H(i10, j10, j11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public byte[] f97P;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public P f103V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f104W;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public O f107Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f109a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public O.a f119k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f120l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public C0753k f121m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f122n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f123o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f124p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f125q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f126r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f127s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f128t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f129u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f130v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f131w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f132x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f133y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f134z = false;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f82A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f83B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f84C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f85D = 1000;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f86E = 200;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f87F = -1.0f;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f88G = -1.0f;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f89H = -1.0f;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f90I = -1.0f;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f91J = -1.0f;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f92K = -1.0f;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f93L = -1.0f;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public float f94M = -1.0f;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public float f95N = -1.0f;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f96O = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f98Q = 1;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f99R = -1;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f100S = 8000;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public long f101T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public long f102U = 0;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f105X = true;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public String f106Y = "eng";

        public static Pair k(C c10) throws w {
            try {
                c10.b0(16);
                long jB = c10.B();
                if (jB == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jB == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (jB != 826496599) {
                    t.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] bArrF = c10.f();
                for (int iG = c10.g() + 20; iG < bArrF.length - 4; iG++) {
                    if (bArrF[iG] == 0 && bArrF[iG + 1] == 0 && bArrF[iG + 2] == 1 && bArrF[iG + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrF, iG, bArrF.length)));
                    }
                }
                throw w.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw w.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(C c10) throws w {
            try {
                int iD = c10.D();
                if (iD == 1) {
                    return true;
                }
                if (iD == 65534) {
                    c10.a0(24);
                    if (c10.E() == e.f22k0.getMostSignificantBits()) {
                        if (c10.E() == e.f22k0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw w.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List m(byte[] bArr) throws w {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw w.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw w.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw w.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw w.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw w.a("Error parsing vorbis codec private", null);
            }
        }

        public final void f() {
            AbstractC0853a.e(this.f107Z);
        }

        public final byte[] g(String str) throws w {
            byte[] bArr = this.f120l;
            if (bArr != null) {
                return bArr;
            }
            throw w.a("Missing CodecPrivate for codec " + str, null);
        }

        public final byte[] h() {
            if (this.f87F == -1.0f || this.f88G == -1.0f || this.f89H == -1.0f || this.f90I == -1.0f || this.f91J == -1.0f || this.f92K == -1.0f || this.f93L == -1.0f || this.f94M == -1.0f || this.f95N == -1.0f || this.f96O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f87F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f88G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f89H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f90I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f91J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f92K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f93L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f94M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f95N + 0.5f));
            byteBufferOrder.putShort((short) (this.f96O + 0.5f));
            byteBufferOrder.putShort((short) this.f85D);
            byteBufferOrder.putShort((short) this.f86E);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0473  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0480  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0492  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x05bc  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x05d7  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x05da  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(i2.r r19, int r20) throws D1.w {
            /*
                Method dump skipped, instruction units count: 1764
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: A2.e.c.i(i2.r, int):void");
        }

        public void j() {
            P p10 = this.f103V;
            if (p10 != null) {
                p10.a(this.f107Z, this.f119k);
            }
        }

        public void n() {
            P p10 = this.f103V;
            if (p10 != null) {
                p10.b();
            }
        }

        public final boolean o(boolean z10) {
            return "A_OPUS".equals(this.f111c) ? z10 : this.f115g > 0;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f23l0 = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public e() {
        this(new A2.a(), 2, s.a.f3686a);
    }

    public static boolean A(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    public static void G(String str, long j10, byte[] bArr) {
        byte[] bArrU;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                bArrU = u(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrU = u(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrU = u(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrU, 0, bArr, i10, bArrU.length);
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new e(s.a.f3686a, 2)};
    }

    private void m() {
        AbstractC0853a.i(this.f59e0);
    }

    public static int[] r(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static byte[] u(long j10, String str, long j11) {
        AbstractC0853a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return M.u0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    public boolean B(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public final boolean C(I i10, long j10) {
        if (this.f25B) {
            this.f27D = j10;
            i10.f36871a = this.f26C;
            this.f25B = false;
            return true;
        }
        if (this.f79y) {
            long j11 = this.f27D;
            if (j11 != -1) {
                i10.f36871a = j11;
                this.f27D = -1L;
                return true;
            }
        }
        return false;
    }

    public final void D(InterfaceC4337q interfaceC4337q, int i10) {
        if (this.f63i.j() >= i10) {
            return;
        }
        if (this.f63i.b() < i10) {
            C c10 = this.f63i;
            c10.d(Math.max(c10.b() * 2, i10));
        }
        interfaceC4337q.readFully(this.f63i.f(), this.f63i.j(), i10 - this.f63i.j());
        this.f63i.Z(i10);
    }

    public final void E() {
        this.f45V = 0;
        this.f46W = 0;
        this.f47X = 0;
        this.f48Y = false;
        this.f49Z = false;
        this.f51a0 = false;
        this.f53b0 = 0;
        this.f55c0 = (byte) 0;
        this.f57d0 = false;
        this.f66l.W(0);
    }

    public final long F(long j10) throws w {
        long j11 = this.f74t;
        if (j11 != -9223372036854775807L) {
            return M.a1(j10, j11, 1000L);
        }
        throw w.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void H(int i10, long j10, long j11) throws w {
        m();
        if (i10 == 160) {
            this.f43T = false;
            this.f44U = 0L;
            return;
        }
        if (i10 == 174) {
            c cVar = new c();
            this.f78x = cVar;
            cVar.f108a = this.f77w;
            return;
        }
        if (i10 == 187) {
            this.f31H = false;
            return;
        }
        if (i10 == 19899) {
            this.f80z = -1;
            this.f24A = -1L;
            return;
        }
        if (i10 == 20533) {
            v(i10).f117i = true;
            return;
        }
        if (i10 == 21968) {
            v(i10).f134z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f73s;
            if (j12 != -1 && j12 != j10) {
                throw w.a("Multiple Segment elements not supported", null);
            }
            this.f73s = j10;
            this.f72r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f29F = new G1.u();
            this.f30G = new G1.u();
        } else if (i10 == 524531317 && !this.f79y) {
            if (this.f56d && this.f26C != -1) {
                this.f25B = true;
            } else {
                this.f59e0.v(new J.b(this.f76v));
                this.f79y = true;
            }
        }
    }

    public void I(int i10, String str) throws w {
        if (i10 == 134) {
            v(i10).f111c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f110b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                v(i10).f106Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f77w = Objects.equals(str, "webm");
            return;
        }
        throw w.a("DocType " + str + " not supported", null);
    }

    public final int J(InterfaceC4337q interfaceC4337q, c cVar, int i10, boolean z10) throws w {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f111c)) {
            K(interfaceC4337q, f18g0, i10);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f111c) || "S_TEXT/SSA".equals(cVar.f111c)) {
            K(interfaceC4337q, f20i0, i10);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f111c)) {
            K(interfaceC4337q, f21j0, i10);
            return s();
        }
        O o10 = cVar.f107Z;
        if (!this.f48Y) {
            if (cVar.f117i) {
                this.f41R &= -1073741825;
                if (!this.f49Z) {
                    interfaceC4337q.readFully(this.f63i.f(), 0, 1);
                    this.f45V++;
                    if ((this.f63i.f()[0] & 128) == 128) {
                        throw w.a("Extension bit is set in signal byte", null);
                    }
                    this.f55c0 = this.f63i.f()[0];
                    this.f49Z = true;
                }
                byte b10 = this.f55c0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f41R |= 1073741824;
                    if (!this.f57d0) {
                        interfaceC4337q.readFully(this.f68n.f(), 0, 8);
                        this.f45V += 8;
                        this.f57d0 = true;
                        this.f63i.f()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f63i.a0(0);
                        o10.g(this.f63i, 1, 1);
                        this.f46W++;
                        this.f68n.a0(0);
                        o10.g(this.f68n, 8, 1);
                        this.f46W += 8;
                    }
                    if (z11) {
                        if (!this.f51a0) {
                            interfaceC4337q.readFully(this.f63i.f(), 0, 1);
                            this.f45V++;
                            this.f63i.a0(0);
                            this.f53b0 = this.f63i.L();
                            this.f51a0 = true;
                        }
                        int i12 = this.f53b0 * 4;
                        this.f63i.W(i12);
                        interfaceC4337q.readFully(this.f63i.f(), 0, i12);
                        this.f45V += i12;
                        short s10 = (short) ((this.f53b0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f71q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f71q = ByteBuffer.allocate(i13);
                        }
                        this.f71q.position(0);
                        this.f71q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f53b0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iP = this.f63i.P();
                            if (i14 % 2 == 0) {
                                this.f71q.putShort((short) (iP - i15));
                            } else {
                                this.f71q.putInt(iP - i15);
                            }
                            i14++;
                            i15 = iP;
                        }
                        int i16 = (i10 - this.f45V) - i15;
                        if (i11 % 2 == 1) {
                            this.f71q.putInt(i16);
                        } else {
                            this.f71q.putShort((short) i16);
                            this.f71q.putInt(0);
                        }
                        this.f69o.Y(this.f71q.array(), i13);
                        o10.g(this.f69o, i13, 1);
                        this.f46W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f118j;
                if (bArr != null) {
                    this.f66l.Y(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.f41R |= 268435456;
                this.f70p.W(0);
                int iJ = (this.f66l.j() + i10) - this.f45V;
                this.f63i.W(4);
                this.f63i.f()[0] = (byte) ((iJ >> 24) & 255);
                this.f63i.f()[1] = (byte) ((iJ >> 16) & 255);
                this.f63i.f()[2] = (byte) ((iJ >> 8) & 255);
                this.f63i.f()[3] = (byte) (iJ & 255);
                o10.g(this.f63i, 4, 2);
                this.f46W += 4;
            }
            this.f48Y = true;
        }
        int iJ2 = i10 + this.f66l.j();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f111c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f111c)) {
            if (cVar.f103V != null) {
                AbstractC0853a.g(this.f66l.j() == 0);
                cVar.f103V.d(interfaceC4337q);
            }
            while (true) {
                int i17 = this.f45V;
                if (i17 >= iJ2) {
                    break;
                }
                int iL = L(interfaceC4337q, o10, iJ2 - i17);
                this.f45V += iL;
                this.f46W += iL;
            }
        } else {
            byte[] bArrF = this.f62h.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i18 = cVar.f109a0;
            int i19 = 4 - i18;
            while (this.f45V < iJ2) {
                int i20 = this.f47X;
                if (i20 == 0) {
                    M(interfaceC4337q, bArrF, i19, i18);
                    this.f45V += i18;
                    this.f62h.a0(0);
                    this.f47X = this.f62h.P();
                    this.f61g.a0(0);
                    o10.b(this.f61g, 4);
                    this.f46W += 4;
                } else {
                    int iL2 = L(interfaceC4337q, o10, i20);
                    this.f45V += iL2;
                    this.f46W += iL2;
                    this.f47X -= iL2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f111c)) {
            this.f64j.a0(0);
            o10.b(this.f64j, 4);
            this.f46W += 4;
        }
        return s();
    }

    public final void K(InterfaceC4337q interfaceC4337q, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f67m.b() < length) {
            this.f67m.X(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f67m.f(), 0, bArr.length);
        }
        interfaceC4337q.readFully(this.f67m.f(), bArr.length, i10);
        this.f67m.a0(0);
        this.f67m.Z(length);
    }

    public final int L(InterfaceC4337q interfaceC4337q, O o10, int i10) {
        int iA = this.f66l.a();
        if (iA <= 0) {
            return o10.a(interfaceC4337q, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o10.b(this.f66l, iMin);
        return iMin;
    }

    public final void M(InterfaceC4337q interfaceC4337q, byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f66l.a());
        interfaceC4337q.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f66l.q(bArr, i10, iMin);
        }
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f28E = -9223372036854775807L;
        this.f33J = 0;
        this.f50a.reset();
        this.f52b.e();
        E();
        for (int i10 = 0; i10 < this.f54c.size(); i10++) {
            ((c) this.f54c.valueAt(i10)).n();
        }
    }

    @Override // i2.InterfaceC4336p
    public final void c(r rVar) {
        if (this.f58e) {
            rVar = new F2.t(rVar, this.f60f);
        }
        this.f59e0 = rVar;
    }

    public final void h(int i10) throws w {
        if (this.f29F == null || this.f30G == null) {
            throw w.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    @Override // i2.InterfaceC4336p
    public final int i(InterfaceC4337q interfaceC4337q, I i10) {
        this.f32I = false;
        boolean zA = true;
        while (zA && !this.f32I) {
            zA = this.f50a.a(interfaceC4337q);
            if (zA && C(i10, interfaceC4337q.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f54c.size(); i11++) {
            c cVar = (c) this.f54c.valueAt(i11);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    @Override // i2.InterfaceC4336p
    public final boolean j(InterfaceC4337q interfaceC4337q) {
        return new f().b(interfaceC4337q);
    }

    public final void l(int i10) throws w {
        if (this.f78x != null) {
            return;
        }
        throw w.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(int i10, int i11, InterfaceC4337q interfaceC4337q) throws w {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        InterfaceC4337q interfaceC4337q2 = interfaceC4337q;
        int i20 = 0;
        int i21 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.f33J != 2) {
                    return;
                }
                y((c) this.f54c.get(this.f39P), this.f42S, interfaceC4337q2, i11);
                return;
            }
            if (i10 == 16877) {
                x(v(i10), interfaceC4337q2, i11);
                return;
            }
            if (i10 == 16981) {
                l(i10);
                byte[] bArr = new byte[i11];
                this.f78x.f118j = bArr;
                interfaceC4337q2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                interfaceC4337q2.readFully(bArr2, 0, i11);
                v(i10).f119k = new O.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f65k.f(), (byte) 0);
                interfaceC4337q2.readFully(this.f65k.f(), 4 - i11, i11);
                this.f65k.a0(0);
                this.f80z = (int) this.f65k.N();
                return;
            }
            if (i10 == 25506) {
                l(i10);
                byte[] bArr3 = new byte[i11];
                this.f78x.f120l = bArr3;
                interfaceC4337q2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw w.a("Unexpected id: " + i10, null);
            }
            l(i10);
            byte[] bArr4 = new byte[i11];
            this.f78x.f132x = bArr4;
            interfaceC4337q2.readFully(bArr4, 0, i11);
            return;
        }
        int i22 = 8;
        if (this.f33J == 0) {
            this.f39P = (int) this.f52b.d(interfaceC4337q2, false, true, 8);
            this.f40Q = this.f52b.b();
            this.f35L = -9223372036854775807L;
            this.f33J = 1;
            this.f63i.W(0);
        }
        c cVar = (c) this.f54c.get(this.f39P);
        if (cVar == null) {
            interfaceC4337q2.q(i11 - this.f40Q);
            this.f33J = 0;
            return;
        }
        cVar.f();
        if (this.f33J == 1) {
            D(interfaceC4337q2, 3);
            int i23 = (this.f63i.f()[2] & 6) >> 1;
            if (i23 == 0) {
                this.f37N = 1;
                int[] iArrR = r(this.f38O, 1);
                this.f38O = iArrR;
                iArrR[0] = (i11 - this.f40Q) - 3;
            } else {
                D(interfaceC4337q2, 4);
                int i24 = (this.f63i.f()[3] & ForkServer.ERROR) + 1;
                this.f37N = i24;
                int[] iArrR2 = r(this.f38O, i24);
                this.f38O = iArrR2;
                if (i23 == 2) {
                    int i25 = (i11 - this.f40Q) - 4;
                    int i26 = this.f37N;
                    Arrays.fill(iArrR2, 0, i26, i25 / i26);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw w.a("Unexpected lacing value: " + i23, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = this.f37N;
                            i12 = i21;
                            if (i27 >= i30 - 1) {
                                i13 = i20;
                                this.f38O[i30 - 1] = ((i11 - this.f40Q) - i29) - i28;
                                break;
                            }
                            this.f38O[i27] = i20;
                            int i31 = i29 + 1;
                            D(interfaceC4337q2, i31);
                            if (this.f63i.f()[i29] == 0) {
                                throw w.a("No valid varint length mask found", null);
                            }
                            int i32 = i20;
                            while (true) {
                                if (i32 >= i22) {
                                    i14 = i20;
                                    i15 = i22;
                                    i16 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i22;
                                int i33 = i12 << (7 - i32);
                                i14 = i20;
                                if ((this.f63i.f()[i29] & i33) != 0) {
                                    i31 += i32;
                                    D(interfaceC4337q2, i31);
                                    int i34 = i29 + 1;
                                    j10 = this.f63i.f()[i29] & 255 & (~i33);
                                    while (true) {
                                        int i35 = i34;
                                        if (i35 >= i31) {
                                            break;
                                        }
                                        i34 = i35 + 1;
                                        j10 = (j10 << i15) | ((long) (this.f63i.f()[i35] & ForkServer.ERROR));
                                        i27 = i27;
                                    }
                                    i16 = i27;
                                    if (i16 > 0) {
                                        j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i32++;
                                    interfaceC4337q2 = interfaceC4337q;
                                    i20 = i14;
                                    i22 = i15;
                                }
                            }
                            i29 = i31;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i36 = (int) j10;
                            int[] iArr = this.f38O;
                            if (i16 != 0) {
                                i36 += iArr[i16 - 1];
                            }
                            iArr[i16] = i36;
                            i28 += i36;
                            i27 = i16 + 1;
                            interfaceC4337q2 = interfaceC4337q;
                            i21 = i12;
                            i20 = i14;
                            i22 = i15;
                        }
                        throw w.a("EBML lacing sample size out of range.", null);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i17 = this.f37N;
                        if (i37 >= i17 - 1) {
                            break;
                        }
                        this.f38O[i37] = 0;
                        while (true) {
                            i18 = i39 + 1;
                            D(interfaceC4337q2, i18);
                            int i40 = this.f63i.f()[i39] & 255;
                            int[] iArr2 = this.f38O;
                            i19 = iArr2[i37] + i40;
                            iArr2[i37] = i19;
                            if (i40 != 255) {
                                break;
                            } else {
                                i39 = i18;
                            }
                        }
                        i38 += i19;
                        i37++;
                        i39 = i18;
                    }
                    this.f38O[i17 - 1] = ((i11 - this.f40Q) - i39) - i38;
                }
            }
            i13 = 0;
            i12 = 1;
            this.f34K = this.f28E + F((this.f63i.f()[i13] << 8) | (this.f63i.f()[i12] & ForkServer.ERROR));
            this.f41R = (cVar.f113e == 2 || (i10 == 163 && (this.f63i.f()[2] & 128) == 128)) ? i12 : i13;
            this.f33J = 2;
            this.f36M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = this.f36M;
                if (i41 >= this.f37N) {
                    this.f33J = 0;
                    return;
                }
                int iJ = J(interfaceC4337q, cVar, this.f38O[i41], false);
                c cVar2 = cVar;
                p(cVar2, this.f34K + ((long) ((this.f36M * cVar.f114f) / 1000)), this.f41R, iJ, 0);
                this.f36M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i42 = this.f36M;
                if (i42 >= this.f37N) {
                    return;
                }
                int[] iArr3 = this.f38O;
                boolean z10 = i12;
                iArr3[i42] = J(interfaceC4337q, cVar, iArr3[i42], z10);
                this.f36M += z10 ? 1 : 0;
            }
        }
    }

    public final J o(G1.u uVar, G1.u uVar2) {
        int i10;
        if (this.f73s == -1 || this.f76v == -9223372036854775807L || uVar == null || uVar.d() == 0 || uVar2 == null || uVar2.d() != uVar.d()) {
            return new J.b(this.f76v);
        }
        int iD = uVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = uVar.c(i12);
            jArrCopyOf[i12] = this.f73s + uVar2.c(i12);
        }
        while (true) {
            i10 = iD - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArrCopyOf3[i14] > this.f76v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f73s + this.f72r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f76v - jArrCopyOf3[i14];
        if (i14 < i10) {
            t.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new C4327g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(A2.e.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.e.p(A2.e$c, long, int, int, int):void");
    }

    public void q(int i10) throws w {
        m();
        if (i10 == 160) {
            if (this.f33J != 2) {
                return;
            }
            c cVar = (c) this.f54c.get(this.f39P);
            cVar.f();
            if (this.f44U > 0 && "A_OPUS".equals(cVar.f111c)) {
                this.f70p.X(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f44U).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f37N; i12++) {
                i11 += this.f38O[i12];
            }
            int i13 = 0;
            while (i13 < this.f37N) {
                long j10 = this.f34K + ((long) ((cVar.f114f * i13) / 1000));
                int i14 = this.f41R;
                if (i13 == 0 && !this.f43T) {
                    i14 |= 1;
                }
                int i15 = this.f38O[i13];
                int i16 = i11 - i15;
                p(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.f33J = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) AbstractC0853a.i(this.f78x);
            String str = cVar2.f111c;
            if (str == null) {
                throw w.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.f59e0, cVar2.f112d);
                this.f54c.put(cVar2.f112d, cVar2);
            }
            this.f78x = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f80z;
            if (i17 != -1) {
                long j11 = this.f24A;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f26C = j11;
                        return;
                    }
                    return;
                }
            }
            throw w.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            l(i10);
            c cVar3 = this.f78x;
            if (cVar3.f117i) {
                if (cVar3.f119k == null) {
                    throw w.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f121m = new C0753k(new C0753k.b(AbstractC0747e.f1684a, "video/webm", this.f78x.f119k.f36889b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            l(i10);
            c cVar4 = this.f78x;
            if (cVar4.f117i && cVar4.f118j != null) {
                throw w.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f74t == -9223372036854775807L) {
                this.f74t = 1000000L;
            }
            long j12 = this.f75u;
            if (j12 != -9223372036854775807L) {
                this.f76v = F(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f54c.size() == 0) {
                throw w.a("No valid tracks were found", null);
            }
            this.f59e0.n();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f79y) {
                this.f59e0.v(o(this.f29F, this.f30G));
                this.f79y = true;
            }
            this.f29F = null;
            this.f30G = null;
        }
    }

    public final int s() {
        int i10 = this.f46W;
        E();
        return i10;
    }

    public void t(int i10, double d10) throws w {
        if (i10 == 181) {
            v(i10).f100S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f75u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                v(i10).f87F = (float) d10;
                break;
            case 21970:
                v(i10).f88G = (float) d10;
                break;
            case 21971:
                v(i10).f89H = (float) d10;
                break;
            case 21972:
                v(i10).f90I = (float) d10;
                break;
            case 21973:
                v(i10).f91J = (float) d10;
                break;
            case 21974:
                v(i10).f92K = (float) d10;
                break;
            case 21975:
                v(i10).f93L = (float) d10;
                break;
            case 21976:
                v(i10).f94M = (float) d10;
                break;
            case 21977:
                v(i10).f95N = (float) d10;
                break;
            case 21978:
                v(i10).f96O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        v(i10).f129u = (float) d10;
                        break;
                    case 30324:
                        v(i10).f130v = (float) d10;
                        break;
                    case 30325:
                        v(i10).f131w = (float) d10;
                        break;
                }
                break;
        }
    }

    public c v(int i10) throws w {
        l(i10);
        return this.f78x;
    }

    public int w(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void x(c cVar, InterfaceC4337q interfaceC4337q, int i10) {
        if (cVar.f116h != 1685485123 && cVar.f116h != 1685480259) {
            interfaceC4337q.q(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f97P = bArr;
        interfaceC4337q.readFully(bArr, 0, i10);
    }

    public void y(c cVar, int i10, InterfaceC4337q interfaceC4337q, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f111c)) {
            interfaceC4337q.q(i11);
        } else {
            this.f70p.W(i11);
            interfaceC4337q.readFully(this.f70p.f(), 0, i11);
        }
    }

    public void z(int i10, long j10) throws w {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw w.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw w.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                v(i10).f113e = (int) j10;
                return;
            case 136:
                v(i10).f105X = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.f35L = F(j10);
                return;
            case 159:
                v(i10).f98Q = (int) j10;
                return;
            case 176:
                v(i10).f122n = (int) j10;
                return;
            case 179:
                h(i10);
                this.f29F.a(F(j10));
                return;
            case 186:
                v(i10).f123o = (int) j10;
                return;
            case 215:
                v(i10).f112d = (int) j10;
                return;
            case 231:
                this.f28E = F(j10);
                return;
            case 238:
                this.f42S = (int) j10;
                return;
            case 241:
                if (this.f31H) {
                    return;
                }
                h(i10);
                this.f30G.a(j10);
                this.f31H = true;
                return;
            case 251:
                this.f43T = true;
                return;
            case 16871:
                v(i10).f116h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw w.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw w.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw w.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw w.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw w.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f24A = j10 + this.f73s;
                return;
            case 21432:
                int i11 = (int) j10;
                l(i10);
                if (i11 == 0) {
                    this.f78x.f133y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f78x.f133y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f78x.f133y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f78x.f133y = 3;
                    return;
                }
            case 21680:
                v(i10).f125q = (int) j10;
                return;
            case 21682:
                v(i10).f127s = (int) j10;
                return;
            case 21690:
                v(i10).f126r = (int) j10;
                return;
            case 21930:
                v(i10).f104W = j10 == 1;
                return;
            case 21938:
                l(i10);
                c cVar = this.f78x;
                cVar.f134z = true;
                cVar.f124p = (int) j10;
                return;
            case 21998:
                v(i10).f115g = (int) j10;
                return;
            case 22186:
                v(i10).f101T = j10;
                return;
            case 22203:
                v(i10).f102U = j10;
                return;
            case 25188:
                v(i10).f99R = (int) j10;
                return;
            case 30114:
                this.f44U = j10;
                return;
            case 30321:
                l(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f78x.f128t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f78x.f128t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f78x.f128t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f78x.f128t = 3;
                    return;
                }
            case 2352003:
                v(i10).f114f = (int) j10;
                return;
            case 2807729:
                this.f74t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        l(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f78x.f84C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f78x.f84C = 1;
                            return;
                        }
                    case 21946:
                        l(i10);
                        int iK = C0748f.k((int) j10);
                        if (iK != -1) {
                            this.f78x.f83B = iK;
                            return;
                        }
                        return;
                    case 21947:
                        l(i10);
                        this.f78x.f134z = true;
                        int iJ = C0748f.j((int) j10);
                        if (iJ != -1) {
                            this.f78x.f82A = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        v(i10).f85D = (int) j10;
                        return;
                    case 21949:
                        v(i10).f86E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public e(s.a aVar, int i10) {
        this(new A2.a(), i10, aVar);
    }

    public e(A2.c cVar, int i10, s.a aVar) {
        this.f73s = -1L;
        this.f74t = -9223372036854775807L;
        this.f75u = -9223372036854775807L;
        this.f76v = -9223372036854775807L;
        this.f26C = -1L;
        this.f27D = -1L;
        this.f28E = -9223372036854775807L;
        this.f50a = cVar;
        cVar.b(new b());
        this.f60f = aVar;
        this.f56d = (i10 & 1) == 0;
        this.f58e = (i10 & 2) == 0;
        this.f52b = new g();
        this.f54c = new SparseArray();
        this.f63i = new C(4);
        this.f64j = new C(ByteBuffer.allocate(4).putInt(-1).array());
        this.f65k = new C(4);
        this.f61g = new C(H1.g.f5132a);
        this.f62h = new C(4);
        this.f66l = new C();
        this.f67m = new C();
        this.f68n = new C(8);
        this.f69o = new C();
        this.f70p = new C();
        this.f38O = new int[1];
    }

    @Override // i2.InterfaceC4336p
    public final void release() {
    }
}
