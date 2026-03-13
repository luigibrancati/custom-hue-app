package g2;

import D1.D;
import D1.K;
import G1.AbstractC0853a;
import G1.I;
import G1.M;
import K1.C0;
import K1.C1003j;
import K1.C1005k;
import K1.C1030x;
import K1.e1;
import K1.f1;
import K1.j1;
import K7.AbstractC1081v;
import T1.m;
import a2.InterfaceC2611D;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import g2.G;
import g2.H;
import g2.p;
import g2.s;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class k extends T1.r implements s.b {

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public static final int[] f35175S1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public static boolean f35176T1;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public static boolean f35177U1;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public int f35178A1;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public int f35179B1;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public j1 f35180C1;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public boolean f35181D1;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public long f35182E1;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public int f35183F1;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public long f35184G1;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public K f35185H1;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public K f35186I1;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public int f35187J1;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public boolean f35188K1;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public int f35189L1;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public f f35190M1;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public r f35191N1;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public long f35192O1;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public long f35193P1;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public boolean f35194Q1;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public int f35195R1;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public final Context f35196Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final boolean f35197a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final G.a f35198b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final int f35199c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final boolean f35200d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final s f35201e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final s.a f35202f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final C4123a f35203g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final long f35204h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final t f35205i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final PriorityQueue f35206j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final boolean f35207k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public e f35208l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f35209m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f35210n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public H f35211o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f35212p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f35213q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public List f35214r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public Surface f35215s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public l f35216t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public G1.D f35217u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f35218v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f35219w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f35220x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public long f35221y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f35222z1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements H.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T1.m f35224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f35226c;

        public b(T1.m mVar, int i10, long j10) {
            this.f35224a = mVar;
            this.f35225b = i10;
            this.f35226c = j10;
        }

        @Override // g2.H.b
        public void a(long j10) {
            k.this.W2(this.f35224a, this.f35225b, this.f35226c, j10);
        }

        @Override // g2.H.b
        public void b() {
            k.this.j3(this.f35224a, this.f35225b, this.f35226c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f35228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35229b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public m.b f35231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f35232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f35233f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Handler f35234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public G f35235h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f35236i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public H f35238k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f35239l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f35241n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T1.u f35230c = T1.u.f16055a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f35237j = 30.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f35240m = -9223372036854775807L;

        public d(Context context) {
            this.f35228a = context;
            this.f35231d = m.b.a(context);
        }

        public k n() {
            AbstractC0853a.g(!this.f35229b);
            Handler handler = this.f35234g;
            AbstractC0853a.g((handler == null && this.f35235h == null) || !(handler == null || this.f35235h == null));
            this.f35229b = true;
            return new k(this);
        }

        public d o(boolean z10) {
            this.f35241n = z10;
            return this;
        }

        public d p(long j10) {
            this.f35240m = j10;
            return this;
        }

        public d q(boolean z10) {
            this.f35239l = z10;
            return this;
        }

        public d r(long j10) {
            this.f35232e = j10;
            return this;
        }

        public d s(m.b bVar) {
            this.f35231d = bVar;
            return this;
        }

        public d t(boolean z10) {
            this.f35233f = z10;
            return this;
        }

        public d u(Handler handler) {
            this.f35234g = handler;
            return this;
        }

        public d v(G g10) {
            this.f35235h = g10;
            return this;
        }

        public d w(int i10) {
            this.f35236i = i10;
            return this;
        }

        public d x(T1.u uVar) {
            this.f35230c = uVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35244c;

        public e(int i10, int i11, int i12) {
            this.f35242a = i10;
            this.f35243b = i11;
            this.f35244c = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f implements m.d, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f35245a;

        public f(T1.m mVar) {
            Handler handlerA = M.A(this);
            this.f35245a = handlerA;
            mVar.d(this, handlerA);
        }

        @Override // T1.m.d
        public void a(T1.m mVar, long j10, long j11) {
            b(j10);
        }

        public final void b(long j10) {
            k kVar = k.this;
            if (this != kVar.f35190M1 || kVar.N0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                k.this.T2();
                return;
            }
            try {
                k.this.S2(j10);
            } catch (C1030x e10) {
                k.this.Q1(e10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(M.m1(message.arg1, message.arg2));
            return true;
        }
    }

    public k(d dVar) {
        super(2, dVar.f35231d, dVar.f35230c, dVar.f35233f, dVar.f35237j);
        Context applicationContext = dVar.f35228a.getApplicationContext();
        this.f35196Z0 = applicationContext;
        this.f35199c1 = dVar.f35236i;
        this.f35211o1 = dVar.f35238k;
        this.f35198b1 = new G.a(dVar.f35234g, dVar.f35235h);
        this.f35197a1 = this.f35211o1 == null;
        this.f35201e1 = new s(applicationContext, this, dVar.f35232e);
        this.f35202f1 = new s.a();
        this.f35200d1 = s2();
        this.f35217u1 = G1.D.f4244c;
        this.f35219w1 = 1;
        this.f35220x1 = 0;
        this.f35185H1 = K.f1618e;
        this.f35189L1 = 0;
        this.f35186I1 = null;
        this.f35187J1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f35192O1 = -9223372036854775807L;
        this.f35193P1 = -9223372036854775807L;
        this.f35203g1 = dVar.f35239l ? new C4123a() : null;
        this.f35206j1 = new PriorityQueue();
        if (dVar.f35240m != -9223372036854775807L) {
            this.f35204h1 = -dVar.f35240m;
            this.f35205i1 = new t(1.0f);
        } else {
            this.f35204h1 = -9223372036854775807L;
            this.f35205i1 = null;
        }
        this.f35207k1 = dVar.f35241n;
        this.f35180C1 = null;
    }

    public static int A2(T1.p pVar, D1.o oVar) {
        if (oVar.f1806p == -1) {
            return w2(pVar, oVar);
        }
        int size = oVar.f1808r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) oVar.f1808r.get(i10)).length;
        }
        return oVar.f1806p + length;
    }

    public static int B2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    public static void Y2(T1.m mVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mVar.setParameters(bundle);
    }

    public static int k3(Context context, T1.u uVar, D1.o oVar) {
        boolean z10;
        int i10 = 0;
        if (!D1.v.t(oVar.f1805o)) {
            return f1.u(0);
        }
        boolean z11 = oVar.f1809s != null;
        List listZ2 = z2(context, uVar, oVar, z11, false);
        if (z11 && listZ2.isEmpty()) {
            listZ2 = z2(context, uVar, oVar, false, false);
        }
        if (listZ2.isEmpty()) {
            return f1.u(1);
        }
        if (!T1.r.b2(oVar)) {
            return f1.u(2);
        }
        T1.p pVar = (T1.p) listZ2.get(0);
        boolean zP = pVar.p(oVar);
        if (zP) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listZ2.size(); i11++) {
                T1.p pVar2 = (T1.p) listZ2.get(i11);
                if (pVar2.p(oVar)) {
                    z10 = false;
                    zP = true;
                    pVar = pVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = zP ? 4 : 3;
        int i13 = pVar.s(oVar) ? 16 : 8;
        int i14 = pVar.f15966h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if ("video/dolby-vision".equals(oVar.f1805o) && !c.a(context)) {
            i15 = 256;
        }
        if (zP) {
            List listZ22 = z2(context, uVar, oVar, z11, true);
            if (!listZ22.isEmpty()) {
                T1.p pVar3 = (T1.p) T1.z.n(listZ22, oVar).get(0);
                if (pVar3.p(oVar) && pVar3.s(oVar)) {
                    i10 = 32;
                }
            }
        }
        return f1.o(i12, i13, i10, i14, i15);
    }

    private void l3() {
        T1.m mVarN0 = N0();
        if (mVarN0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f35187J1));
            mVarN0.setParameters(bundle);
        }
    }

    public static boolean s2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    public static boolean u2() {
        String str = Build.MODEL;
        str.getClass();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w2(T1.p r10, D1.o r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k.w2(T1.p, D1.o):int");
    }

    public static Point x2(T1.p pVar, D1.o oVar) {
        int i10 = oVar.f1813w;
        int i11 = oVar.f1812v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f35175S1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point pointC = pVar.c(i15, i13);
            float f11 = oVar.f1816z;
            if (pointC != null && pVar.v(pointC.x, pointC.y, f11)) {
                return pointC;
            }
        }
        return null;
    }

    public static List z2(Context context, T1.u uVar, D1.o oVar, boolean z10, boolean z11) {
        String str = oVar.f1805o;
        if (str == null) {
            return AbstractC1081v.z();
        }
        if ("video/dolby-vision".equals(str) && !c.a(context)) {
            List listG = T1.z.g(uVar, oVar, z10, z11);
            if (!listG.isEmpty()) {
                return listG;
            }
        }
        return T1.z.m(uVar, oVar, z10, z11);
    }

    @Override // g2.s.b
    public boolean A(long j10, long j11) {
        return f3(j10, j11);
    }

    @Override // T1.r
    public T1.o A0(Throwable th, T1.p pVar) {
        return new j(th, pVar, this.f35215s1);
    }

    @Override // T1.r
    public boolean B1(long j10, long j11, T1.m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, D1.o oVar) {
        AbstractC0853a.e(mVar);
        long jY0 = j12 - Y0();
        n3(j12);
        H h10 = this.f35211o1;
        if (h10 != null) {
            if (!z10 || z11) {
                return h10.d(j12, new b(mVar, i10, jY0));
            }
            j3(mVar, i10, jY0);
            return true;
        }
        int iC = this.f35201e1.c(j12, j10, j11, Z0(), z10, z11, this.f35202f1);
        t tVar = this.f35205i1;
        if (tVar != null && iC != 5 && iC != 4) {
            tVar.b(j12, this.f35202f1.f());
        }
        if (iC == 0) {
            long jB = T().b();
            Q2(jY0, jB, oVar);
            W2(mVar, i10, jY0, jB);
            p3(this.f35202f1.f());
            return true;
        }
        if (iC == 1) {
            U2((T1.m) AbstractC0853a.i(mVar), i10, jY0, oVar);
            return true;
        }
        if (iC == 2) {
            t2(mVar, i10, jY0);
            p3(this.f35202f1.f());
            return true;
        }
        if (iC == 3) {
            j3(mVar, i10, jY0);
            p3(this.f35202f1.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    @Override // g2.s.b
    public boolean C(long j10, long j11, long j12, boolean z10, boolean z11) {
        if (this.f35211o1 != null && this.f35197a1) {
            j11 -= v2();
        }
        return d3(j10, j12, z10) && H2(j11, z11);
    }

    public MediaFormat C2(D1.o oVar, String str, e eVar, float f10, boolean z10, int i10) {
        Pair pairI;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", oVar.f1812v);
        mediaFormat.setInteger("height", oVar.f1813w);
        G1.w.e(mediaFormat, oVar.f1808r);
        G1.w.c(mediaFormat, "frame-rate", oVar.f1816z);
        G1.w.d(mediaFormat, "rotation-degrees", oVar.f1774A);
        G1.w.b(mediaFormat, oVar.f1778E);
        if ("video/dolby-vision".equals(oVar.f1805o) && (pairI = T1.z.i(oVar)) != null) {
            G1.w.d(mediaFormat, "profile", ((Integer) pairI.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f35242a);
        mediaFormat.setInteger("max-height", eVar.f35243b);
        G1.w.d(mediaFormat, "max-input-size", eVar.f35244c);
        int i11 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f35187J1));
        }
        return mediaFormat;
    }

    public final Surface D2(T1.p pVar) {
        H h10 = this.f35211o1;
        if (h10 != null) {
            return h10.m();
        }
        Surface surface = this.f35215s1;
        if (surface != null) {
            return surface;
        }
        if (h3(pVar)) {
            return null;
        }
        AbstractC0853a.g(i3(pVar));
        l lVar = this.f35216t1;
        if (lVar != null && lVar.f35249a != pVar.f15965g) {
            V2();
        }
        if (this.f35216t1 == null) {
            this.f35216t1 = l.c(this.f35196Z0, pVar.f15965g);
        }
        return this.f35216t1;
    }

    public final boolean E2(T1.p pVar) {
        if (this.f35211o1 != null) {
            return true;
        }
        Surface surface = this.f35215s1;
        return (surface != null && surface.isValid()) || h3(pVar) || i3(pVar);
    }

    public final boolean F2(J1.f fVar) {
        return fVar.f5880f < X();
    }

    @Override // T1.r
    public void G1() {
        H h10 = this.f35211o1;
        if (h10 != null) {
            h10.f();
        }
    }

    public final boolean G2(J1.f fVar) {
        if (j() || fVar.z() || this.f35193P1 == -9223372036854775807L) {
            return true;
        }
        return this.f35193P1 - (fVar.f5880f - Y0()) <= PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;
    }

    public boolean H2(long j10, boolean z10) {
        int iQ0 = q0(j10);
        if (iQ0 == 0) {
            return false;
        }
        if (z10) {
            C1003j c1003j = this.f16004Q0;
            int i10 = c1003j.f7098d + iQ0;
            c1003j.f7098d = i10;
            c1003j.f7100f += this.f35179B1;
            c1003j.f7098d = i10 + this.f35206j1.size();
        } else {
            this.f16004Q0.f7104j++;
            m3(iQ0 + this.f35206j1.size(), this.f35179B1);
        }
        K0();
        H h10 = this.f35211o1;
        if (h10 != null) {
            h10.s(false);
        }
        return true;
    }

    @Override // T1.r, K1.e1
    public void I(float f10, float f11) {
        super.I(f10, f11);
        H h10 = this.f35211o1;
        if (h10 != null) {
            h10.T(f10);
        } else {
            this.f35201e1.p(f10);
        }
        t tVar = this.f35205i1;
        if (tVar != null) {
            tVar.e(f10);
        }
    }

    @Override // T1.r
    public void I1() {
        super.I1();
        this.f35206j1.clear();
        this.f35179B1 = 0;
        this.f35195R1 = 0;
        this.f35181D1 = false;
        C4123a c4123a = this.f35203g1;
        if (c4123a != null) {
            c4123a.c();
        }
    }

    public final void I2() {
        if (this.f35222z1 > 0) {
            long jC = T().c();
            this.f35198b1.n(this.f35222z1, jC - this.f35221y1);
            this.f35222z1 = 0;
            this.f35221y1 = jC;
        }
    }

    @Override // g2.s.b
    public boolean J(long j10, long j11, boolean z10) {
        return e3(j10, j11, z10);
    }

    public final void J2() {
        if (!this.f35201e1.g() || this.f35215s1 == null) {
            return;
        }
        R2();
    }

    public final void K2() {
        int i10 = this.f35183F1;
        if (i10 != 0) {
            this.f35198b1.r(this.f35182E1, i10);
            this.f35182E1 = 0L;
            this.f35183F1 = 0;
        }
    }

    public final void L2(K k10) {
        if (k10.equals(K.f1618e) || k10.equals(this.f35186I1)) {
            return;
        }
        this.f35186I1 = k10;
        this.f35198b1.t(k10);
    }

    public final void M2() {
        Surface surface = this.f35215s1;
        if (surface == null || !this.f35218v1) {
            return;
        }
        this.f35198b1.q(surface);
    }

    public final void N2() {
        K k10 = this.f35186I1;
        if (k10 != null) {
            this.f35198b1.t(k10);
        }
    }

    @Override // T1.r
    public int O0(J1.f fVar) {
        j1 j1Var;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f35207k1 || (((j1Var = this.f35180C1) != null && j1Var.f7199h) || this.f35188K1)) && F2(fVar) && !G2(fVar)) ? 32 : 0;
        }
        return 0;
    }

    public final void O2(MediaFormat mediaFormat) {
        if (this.f35211o1 == null || M.E0(this.f35196Z0)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    public final void P2() {
        if (this.f35188K1) {
            int i10 = Build.VERSION.SDK_INT;
            T1.m mVarN0 = N0();
            if (mVarN0 == null) {
                return;
            }
            this.f35190M1 = new f(mVarN0);
            if (i10 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                mVarN0.setParameters(bundle);
            }
        }
    }

    public final void Q2(long j10, long j11, D1.o oVar) {
        r rVar = this.f35191N1;
        if (rVar != null) {
            rVar.e(j10, j11, oVar, T0());
        }
    }

    @Override // T1.r
    public boolean R0() {
        return false;
    }

    public final void R2() {
        this.f35198b1.q(this.f35215s1);
        this.f35218v1 = true;
    }

    @Override // T1.r
    public float S0(float f10, D1.o oVar, D1.o[] oVarArr) {
        T1.p pVarP0;
        float fMax = -1.0f;
        for (D1.o oVar2 : oVarArr) {
            float f11 = oVar2.f1816z;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f35180C1 == null || (pVarP0 = P0()) == null) {
            return f12;
        }
        float fG = pVarP0.g(oVar.f1812v, oVar.f1813w);
        return f12 != -1.0f ? Math.max(f12, fG) : fG;
    }

    public void S2(long j10) {
        f2(j10);
        L2(this.f35185H1);
        this.f16004Q0.f7099e++;
        J2();
        w1(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    @Override // T1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean T1(J1.f r9) {
        /*
            r8 = this;
            boolean r0 = r8.G2(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.F2(r9)
            g2.t r2 = r8.f35205i1
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.f5880f
            long r4 = r2.c(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.f35204h1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.v()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.A()
            if (r2 == 0) goto L40
            r9.s()
        L3e:
            r1 = r3
            goto La2
        L40:
            g2.a r2 = r8.f35203g1
            if (r2 == 0) goto La2
            T1.p r2 = r8.P0()
            java.lang.Object r2 = G1.AbstractC0853a.e(r2)
            T1.p r2 = (T1.p) r2
            java.lang.String r2 = r2.f15960b
            java.lang.String r4 = "video/av01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r2 = r9.f5878d
            if (r2 == 0) goto La2
            if (r0 != 0) goto L65
            int r4 = r8.f35195R1
            if (r4 > 0) goto L63
            goto L65
        L63:
            r4 = r1
            goto L66
        L65:
            r4 = r3
        L66:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r2.flip()
            g2.a r5 = r8.f35203g1
            int r4 = r5.d(r2, r4)
            if (r4 != 0) goto L79
            r9.s()
            goto L3e
        L79:
            int r5 = r2.limit()
            if (r4 == r5) goto La2
            g2.k$e r5 = r8.f35208l1
            java.lang.Object r5 = G1.AbstractC0853a.e(r5)
            g2.k$e r5 = (g2.k.e) r5
            int r5 = r5.f35244c
            int r5 = r5 + r4
            int r2 = r2.capacity()
            if (r5 >= r2) goto La2
            boolean r2 = r9.F()
            if (r2 != 0) goto La2
            java.nio.ByteBuffer r1 = r9.f5878d
            java.lang.Object r1 = G1.AbstractC0853a.e(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.position(r4)
            goto L3e
        La2:
            if (r1 == 0) goto Lbe
            if (r0 == 0) goto Lae
            K1.j r8 = r8.f16004Q0
            int r9 = r8.f7098d
            int r9 = r9 + r3
            r8.f7098d = r9
            return r1
        Lae:
            java.util.PriorityQueue r0 = r8.f35206j1
            long r4 = r9.f5880f
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r0.add(r9)
            int r9 = r8.f35195R1
            int r9 = r9 + r3
            r8.f35195R1 = r9
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k.T1(J1.f):boolean");
    }

    public final void T2() {
        P1();
    }

    @Override // T1.r
    public List U0(T1.u uVar, D1.o oVar, boolean z10) {
        return T1.z.n(z2(this.f35196Z0, uVar, oVar, z10, this.f35188K1), oVar);
    }

    @Override // T1.r
    public final boolean U1() {
        D1.o oVarQ0 = Q0();
        j1 j1Var = this.f35180C1;
        if (j1Var == null) {
            return super.U1();
        }
        if (!j1Var.f7197f || this.f35181D1 || this.f35188K1) {
            return true;
        }
        return (oVarQ0 != null && oVarQ0.f1807q > 0) || e1() || W0() != -9223372036854775807L;
    }

    public final void U2(T1.m mVar, int i10, long j10, D1.o oVar) {
        k kVar;
        long jG = this.f35202f1.g();
        long jF = this.f35202f1.f();
        if (g3() && jG == this.f35184G1) {
            j3(mVar, i10, j10);
            kVar = this;
        } else {
            kVar = this;
            kVar.Q2(j10, jG, oVar);
            kVar.X2(mVar, i10, j10, jG);
            jG = jG;
        }
        kVar.p3(jF);
        kVar.f35184G1 = jG;
    }

    @Override // T1.r
    public boolean V1(T1.p pVar) {
        return E2(pVar);
    }

    public final void V2() {
        l lVar = this.f35216t1;
        if (lVar != null) {
            lVar.release();
            this.f35216t1 = null;
        }
    }

    public final void W2(T1.m mVar, int i10, long j10, long j11) {
        X2(mVar, i10, j10, j11);
    }

    @Override // T1.r
    public m.a X0(T1.p pVar, D1.o oVar, MediaCrypto mediaCrypto, float f10) {
        String str = pVar.f15961c;
        e eVarY2 = y2(pVar, oVar, Z());
        this.f35208l1 = eVarY2;
        MediaFormat mediaFormatC2 = C2(oVar, str, eVarY2, f10, this.f35200d1, this.f35188K1 ? this.f35189L1 : 0);
        Surface surfaceD2 = D2(pVar);
        O2(mediaFormatC2);
        return m.a.b(pVar, mediaFormatC2, oVar, surfaceD2, mediaCrypto);
    }

    @Override // T1.r
    public final boolean X1() {
        T1.p pVarP0 = P0();
        if (this.f35211o1 == null || pVarP0 == null || !(pVarP0.f15959a.equals("c2.mtk.avc.decoder") || pVarP0.f15959a.equals("c2.mtk.hevc.decoder"))) {
            return super.X1();
        }
        return true;
    }

    public void X2(T1.m mVar, int i10, long j10, long j11) {
        I.a("releaseOutputBuffer");
        mVar.h(i10, j11);
        I.b();
        this.f16004Q0.f7099e++;
        this.f35178A1 = 0;
        if (this.f35211o1 == null) {
            L2(this.f35185H1);
            J2();
        }
    }

    public final void Z2(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f35215s1 == surface) {
            if (surface != null) {
                N2();
                M2();
                return;
            }
            return;
        }
        this.f35215s1 = surface;
        if (this.f35211o1 == null) {
            this.f35201e1.o(surface);
        }
        this.f35218v1 = false;
        int state = getState();
        T1.m mVarN0 = N0();
        if (mVarN0 != null && this.f35211o1 == null) {
            T1.p pVar = (T1.p) AbstractC0853a.e(P0());
            if (!E2(pVar) || this.f35209m1) {
                F1();
                n1();
            } else {
                a3(mVarN0, D2(pVar));
            }
        }
        if (surface != null) {
            N2();
        } else {
            this.f35186I1 = null;
            H h10 = this.f35211o1;
            if (h10 != null) {
                h10.r();
            }
        }
        if (state == 2) {
            H h11 = this.f35211o1;
            if (h11 != null) {
                h11.t(true);
            } else {
                this.f35201e1.e(true);
            }
        }
        P2();
    }

    @Override // T1.r
    public int a2(T1.u uVar, D1.o oVar) {
        return k3(this.f35196Z0, uVar, oVar);
    }

    public final void a3(T1.m mVar, Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (surface != null) {
            b3(mVar, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            r2(mVar);
        }
    }

    @Override // T1.r, K1.e1
    public boolean b() {
        if (!super.b()) {
            return false;
        }
        H h10 = this.f35211o1;
        return h10 == null || h10.b();
    }

    public void b3(T1.m mVar, Surface surface) {
        mVar.f(surface);
    }

    @Override // T1.r
    public void c1(J1.f fVar) {
        if (this.f35210n1) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(fVar.f5881g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        Y2((T1.m) AbstractC0853a.e(N0()), bArr);
                    }
                }
            }
        }
    }

    public void c3(List list) {
        if (list.equals(D1.I.f1617a)) {
            H h10 = this.f35211o1;
            if (h10 == null || !h10.isInitialized()) {
                return;
            }
            this.f35211o1.k();
            return;
        }
        this.f35214r1 = list;
        H h11 = this.f35211o1;
        if (h11 != null) {
            h11.i(list);
        }
    }

    @Override // T1.r, K1.AbstractC1001i
    public void d0() {
        this.f35186I1 = null;
        this.f35193P1 = -9223372036854775807L;
        P2();
        this.f35218v1 = false;
        this.f35190M1 = null;
        this.f35181D1 = true;
        try {
            super.d0();
        } finally {
            this.f35198b1.m(this.f16004Q0);
            this.f35198b1.t(K.f1618e);
        }
    }

    public boolean d3(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    @Override // T1.r, K1.AbstractC1001i
    public void e0(boolean z10, boolean z11) {
        super.e0(z10, z11);
        boolean z12 = U().f7059b;
        AbstractC0853a.g((z12 && this.f35189L1 == 0) ? false : true);
        if (this.f35188K1 != z12) {
            this.f35188K1 = z12;
            F1();
        }
        this.f35198b1.o(this.f16004Q0);
        if (!this.f35212p1) {
            if (this.f35214r1 != null && this.f35211o1 == null) {
                p pVarQ2 = q2(this.f35196Z0, this.f35201e1);
                pVarQ2.Q(1);
                this.f35211o1 = pVarQ2.D(0);
            }
            this.f35212p1 = true;
        }
        if (this.f35211o1 == null) {
            this.f35201e1.m(T());
            this.f35201e1.j(!z11 ? 1 : 0);
        } else {
            p2();
            this.f35213q1 = !z11 ? 1 : 0;
            H0();
        }
    }

    public boolean e3(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    @Override // K1.AbstractC1001i
    public void f0() {
        super.f0();
    }

    public boolean f3(long j10, long j11) {
        return j10 < -30000 && j11 > PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;
    }

    @Override // T1.r, K1.e1
    public void g(long j10, long j11) throws C1030x {
        H h10 = this.f35211o1;
        if (h10 != null) {
            try {
                h10.g(j10, j11);
            } catch (H.c e10) {
                throw R(e10, e10.f35141a, 7001);
            }
        }
        super.g(j10, j11);
    }

    @Override // T1.r, K1.AbstractC1001i
    public void g0(long j10, boolean z10) {
        H h10 = this.f35211o1;
        if (h10 != null && !z10) {
            h10.s(true);
        }
        super.g0(j10, z10);
        if (this.f35211o1 == null) {
            this.f35201e1.k();
        }
        t tVar = this.f35205i1;
        if (tVar != null) {
            tVar.d();
        }
        if (z10) {
            H h11 = this.f35211o1;
            if (h11 != null) {
                h11.t(false);
            } else {
                this.f35201e1.e(false);
            }
        }
        P2();
        this.f35178A1 = 0;
    }

    public boolean g3() {
        return true;
    }

    @Override // K1.e1, K1.f1
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // K1.AbstractC1001i
    public void h0() {
        super.h0();
        H h10 = this.f35211o1;
        if (h10 == null || !this.f35197a1) {
            return;
        }
        h10.release();
    }

    public boolean h3(T1.p pVar) {
        return Build.VERSION.SDK_INT >= 35 && pVar.f15969k;
    }

    public boolean i3(T1.p pVar) {
        if (this.f35188K1 || o2(pVar.f15959a)) {
            return false;
        }
        return !pVar.f15965g || l.b(this.f35196Z0);
    }

    @Override // T1.r, K1.e1
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        H h10 = this.f35211o1;
        if (h10 != null) {
            return h10.j(zIsReady);
        }
        if (zIsReady && (N0() == null || this.f35188K1)) {
            return true;
        }
        return this.f35201e1.d(zIsReady);
    }

    @Override // T1.r, K1.AbstractC1001i
    public void j0() {
        try {
            super.j0();
        } finally {
            this.f35212p1 = false;
            this.f35192O1 = -9223372036854775807L;
            V2();
        }
    }

    public void j3(T1.m mVar, int i10, long j10) {
        I.a("skipVideoBuffer");
        mVar.releaseOutputBuffer(i10, false);
        I.b();
        this.f16004Q0.f7100f++;
    }

    @Override // T1.r, K1.AbstractC1001i
    public void k0() {
        super.k0();
        this.f35222z1 = 0;
        this.f35221y1 = T().c();
        this.f35182E1 = 0L;
        this.f35183F1 = 0;
        H h10 = this.f35211o1;
        if (h10 != null) {
            h10.o();
        } else {
            this.f35201e1.h();
        }
    }

    @Override // T1.r, K1.AbstractC1001i
    public void l0() {
        I2();
        K2();
        H h10 = this.f35211o1;
        if (h10 != null) {
            h10.n();
        } else {
            this.f35201e1.i();
        }
        t tVar = this.f35205i1;
        if (tVar != null) {
            tVar.d();
        }
        super.l0();
    }

    @Override // K1.e1
    public void m() {
        H h10 = this.f35211o1;
        if (h10 == null) {
            this.f35201e1.a();
            return;
        }
        int i10 = this.f35213q1;
        if (i10 == 0 || i10 == 1) {
            this.f35213q1 = 0;
        } else {
            h10.l();
        }
    }

    @Override // T1.r, K1.AbstractC1001i
    public void m0(D1.o[] oVarArr, long j10, long j11, InterfaceC2611D.b bVar) {
        super.m0(oVarArr, j10, j11, bVar);
        o3(bVar);
        t tVar = this.f35205i1;
        if (tVar != null) {
            tVar.d();
        }
    }

    public void m3(int i10, int i11) {
        C1003j c1003j = this.f16004Q0;
        c1003j.f7102h += i10;
        int i12 = i10 + i11;
        c1003j.f7101g += i12;
        this.f35222z1 += i12;
        int i13 = this.f35178A1 + i12;
        this.f35178A1 = i13;
        c1003j.f7103i = Math.max(i13, c1003j.f7103i);
        int i14 = this.f35199c1;
        if (i14 <= 0 || this.f35222z1 < i14) {
            return;
        }
        I2();
    }

    public void n2(H h10, int i10, D1.o oVar, int i11) {
        List listZ = this.f35214r1;
        if (listZ == null) {
            listZ = AbstractC1081v.z();
        }
        h10.a(i10, oVar, Z0(), i11, listZ);
    }

    public final void n3(long j10) {
        int i10 = 0;
        while (true) {
            Long l10 = (Long) this.f35206j1.peek();
            if (l10 == null || l10.longValue() >= j10) {
                break;
            }
            i10++;
            this.f35206j1.poll();
        }
        m3(i10, 0);
    }

    public boolean o2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!f35176T1) {
                    f35177U1 = u2();
                    f35176T1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f35177U1;
    }

    public final void o3(InterfaceC2611D.b bVar) {
        D1.D dB0 = b0();
        if (dB0.q()) {
            this.f35193P1 = -9223372036854775807L;
        } else {
            this.f35193P1 = dB0.h(((InterfaceC2611D.b) AbstractC0853a.e(bVar)).f20522a, new D.b()).j();
        }
    }

    @Override // T1.r
    public boolean p1(D1.o oVar) throws C1030x {
        H h10 = this.f35211o1;
        if (h10 == null || h10.isInitialized()) {
            return true;
        }
        try {
            return this.f35211o1.q(oVar);
        } catch (H.c e10) {
            throw this.R(e10, oVar, 7000);
        }
    }

    public final void p2() {
        this.f35211o1.c(new a(), O7.f.a());
        r rVar = this.f35191N1;
        if (rVar != null) {
            this.f35211o1.u(rVar);
        }
        if (this.f35215s1 != null && !this.f35217u1.equals(G1.D.f4244c)) {
            this.f35211o1.h(this.f35215s1, this.f35217u1);
        }
        this.f35211o1.p(this.f35220x1);
        this.f35211o1.T(a1());
        List list = this.f35214r1;
        if (list != null) {
            this.f35211o1.i(list);
        }
    }

    public void p3(long j10) {
        this.f16004Q0.a(j10);
        this.f35182E1 += j10;
        this.f35183F1++;
    }

    @Override // T1.r
    public void q1(Exception exc) {
        G1.t.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f35198b1.s(exc);
    }

    public p q2(Context context, s sVar) {
        return new p.b(context, sVar).h(true).g(T()).f();
    }

    @Override // T1.r
    public void r1(String str, m.a aVar, long j10, long j11) {
        this.f35198b1.k(str, j10, j11);
        this.f35209m1 = o2(str);
        this.f35210n1 = ((T1.p) AbstractC0853a.e(P0())).q();
        P2();
    }

    public void r2(T1.m mVar) {
        mVar.b();
    }

    @Override // T1.r
    public void s1(String str) {
        this.f35198b1.l(str);
    }

    @Override // T1.r
    public C1005k t1(C0 c02) {
        C1005k c1005kT1 = super.t1(c02);
        this.f35198b1.p((D1.o) AbstractC0853a.e(c02.f6835b), c1005kT1);
        t tVar = this.f35205i1;
        if (tVar != null) {
            tVar.d();
        }
        return c1005kT1;
    }

    public void t2(T1.m mVar, int i10, long j10) {
        I.a("dropVideoBuffer");
        mVar.releaseOutputBuffer(i10, false);
        I.b();
        m3(0, 1);
    }

    @Override // T1.r
    public C1005k u0(T1.p pVar, D1.o oVar, D1.o oVar2) {
        C1005k c1005kE = pVar.e(oVar, oVar2);
        int i10 = c1005kE.f7211e;
        e eVar = (e) AbstractC0853a.e(this.f35208l1);
        if (oVar2.f1812v > eVar.f35242a || oVar2.f1813w > eVar.f35243b) {
            i10 |= 256;
        }
        if (A2(pVar, oVar2) > eVar.f35244c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C1005k(pVar.f15959a, oVar, oVar2, i11 != 0 ? 0 : c1005kE.f7210d, i11);
    }

    @Override // T1.r
    public void u1(D1.o oVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        T1.m mVarN0 = N0();
        if (mVarN0 != null) {
            mVarN0.e(this.f35219w1);
        }
        if (this.f35188K1) {
            i10 = oVar.f1812v;
            integer = oVar.f1813w;
        } else {
            AbstractC0853a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = oVar.f1775B;
        int i11 = oVar.f1774A;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f35185H1 = new K(i10, integer, f10);
        H h10 = this.f35211o1;
        if (h10 == null || !this.f35194Q1) {
            this.f35201e1.n(oVar.f1816z);
        } else {
            n2(h10, 1, oVar.b().F0(i10).h0(integer).u0(f10).P(), this.f35213q1);
            this.f35213q1 = 2;
        }
        this.f35194Q1 = false;
    }

    public long v2() {
        return -this.f35192O1;
    }

    @Override // T1.r, K1.AbstractC1001i, K1.c1.b
    public void w(int i10, Object obj) {
        if (i10 == 1) {
            Z2(obj);
            return;
        }
        if (i10 == 7) {
            r rVar = (r) AbstractC0853a.e(obj);
            this.f35191N1 = rVar;
            H h10 = this.f35211o1;
            if (h10 != null) {
                h10.u(rVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) AbstractC0853a.e(obj)).intValue();
            if (this.f35189L1 != iIntValue) {
                this.f35189L1 = iIntValue;
                if (this.f35188K1) {
                    F1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.f35219w1 = ((Integer) AbstractC0853a.e(obj)).intValue();
            T1.m mVarN0 = N0();
            if (mVarN0 != null) {
                mVarN0.e(this.f35219w1);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue2 = ((Integer) AbstractC0853a.e(obj)).intValue();
            this.f35220x1 = iIntValue2;
            H h11 = this.f35211o1;
            if (h11 != null) {
                h11.p(iIntValue2);
                return;
            } else {
                this.f35201e1.l(iIntValue2);
                return;
            }
        }
        if (i10 == 13) {
            c3((List) AbstractC0853a.e(obj));
            return;
        }
        if (i10 == 14) {
            G1.D d10 = (G1.D) AbstractC0853a.e(obj);
            if (d10.b() == 0 || d10.a() == 0) {
                return;
            }
            this.f35217u1 = d10;
            H h12 = this.f35211o1;
            if (h12 != null) {
                h12.h((Surface) AbstractC0853a.i(this.f35215s1), d10);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                this.f35187J1 = ((Integer) AbstractC0853a.e(obj)).intValue();
                l3();
                break;
            case 17:
                Surface surface = this.f35215s1;
                Z2(null);
                ((k) AbstractC0853a.e(obj)).w(1, surface);
                break;
            case 18:
                j1 j1Var = this.f35180C1;
                boolean z10 = j1Var != null && j1Var.f7195d;
                j1 j1Var2 = (j1) obj;
                this.f35180C1 = j1Var2;
                if (z10 != (j1Var2 != null && j1Var2.f7195d)) {
                    c2();
                }
                break;
            default:
                super.w(i10, obj);
                break;
        }
    }

    @Override // T1.r
    public void w1(long j10) {
        super.w1(j10);
        if (this.f35188K1) {
            return;
        }
        this.f35179B1--;
    }

    @Override // T1.r
    public void x1() {
        super.x1();
        H h10 = this.f35211o1;
        if (h10 != null) {
            h10.f();
            if (this.f35192O1 == -9223372036854775807L) {
                this.f35192O1 = Z0();
            }
            this.f35211o1.e(v2());
        } else {
            this.f35201e1.j(2);
        }
        this.f35194Q1 = true;
        P2();
    }

    @Override // T1.r
    public void y1(J1.f fVar) {
        ByteBuffer byteBuffer;
        if (this.f35203g1 != null && ((T1.p) AbstractC0853a.e(P0())).f15960b.equals("video/av01") && (byteBuffer = fVar.f5878d) != null) {
            this.f35203g1.b(byteBuffer);
        }
        this.f35195R1 = 0;
        int iO0 = O0(fVar);
        if ((Build.VERSION.SDK_INT < 34 || (iO0 & 32) == 0) && !this.f35188K1) {
            this.f35179B1++;
        }
    }

    public e y2(T1.p pVar, D1.o oVar, D1.o[] oVarArr) {
        int iW2;
        int iMax = oVar.f1812v;
        int iMax2 = oVar.f1813w;
        int iA2 = A2(pVar, oVar);
        if (oVarArr.length == 1) {
            if (iA2 != -1 && (iW2 = w2(pVar, oVar)) != -1) {
                iA2 = Math.min((int) (iA2 * 1.5f), iW2);
            }
            return new e(iMax, iMax2, iA2);
        }
        int length = oVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            D1.o oVarP = oVarArr[i10];
            if (oVar.f1778E != null && oVarP.f1778E == null) {
                oVarP = oVarP.b().V(oVar.f1778E).P();
            }
            if (pVar.e(oVar, oVarP).f7210d != 0) {
                int i11 = oVarP.f1812v;
                z10 |= i11 == -1 || oVarP.f1813w == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, oVarP.f1813w);
                iA2 = Math.max(iA2, A2(pVar, oVarP));
            }
        }
        if (z10) {
            G1.t.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointX2 = x2(pVar, oVar);
            if (pointX2 != null) {
                iMax = Math.max(iMax, pointX2.x);
                iMax2 = Math.max(iMax2, pointX2.y);
                iA2 = Math.max(iA2, w2(pVar, oVar.b().F0(iMax).h0(iMax2).P()));
                G1.t.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iA2);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements H.a {
        public a() {
        }

        @Override // g2.H.a
        public void a() {
            if (k.this.f35215s1 != null) {
                k.this.m3(0, 1);
            }
        }

        @Override // g2.H.a
        public void b() {
            e1.a aVarB1 = k.this.b1();
            if (aVarB1 != null) {
                aVarB1.b();
            }
        }

        @Override // g2.H.a
        public void onFirstFrameRendered() {
            if (k.this.f35215s1 != null) {
                k.this.R2();
            }
        }

        @Override // g2.H.a
        public void onVideoSizeChanged(K k10) {
        }
    }
}
