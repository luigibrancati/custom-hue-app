package K1;

import G1.AbstractC0853a;
import K1.E0;
import a2.InterfaceC2611D;
import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import java.util.Iterator;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: renamed from: K1.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1009m implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2.g f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f7264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7265k;

    /* JADX INFO: renamed from: K1.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7267b;

        public b() {
        }
    }

    public C1009m() {
        this(new e2.g(true, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    public static void k(int i10, int i11, String str, String str2) {
        AbstractC0853a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    public static int n(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // K1.E0
    public void a(L1.B0 b02) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f7265k;
        AbstractC0853a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f7265k = id2;
        if (!this.f7264j.containsKey(b02)) {
            this.f7264j.put(b02, new b());
        }
        p(b02);
    }

    @Override // K1.E0
    public boolean b(D1.D d10, InterfaceC2611D.b bVar, long j10) {
        Iterator it = this.f7264j.values().iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f7266a) {
                return false;
            }
        }
        return true;
    }

    @Override // K1.E0
    public boolean c(L1.B0 b02) {
        return this.f7263i;
    }

    @Override // K1.E0
    public boolean d(E0.a aVar) {
        b bVar = (b) AbstractC0853a.e((b) this.f7264j.get(aVar.f6837a));
        boolean z10 = true;
        boolean z11 = this.f7255a.f() >= m();
        long jMin = this.f7256b;
        float f10 = aVar.f6842f;
        if (f10 > 1.0f) {
            jMin = Math.min(G1.M.g0(jMin, f10), this.f7257c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f6841e;
        if (j10 < jMax) {
            if (!this.f7261g && z11) {
                z10 = false;
            }
            bVar.f7266a = z10;
            if (!z10 && j10 < 500000) {
                G1.t.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f7257c || z11) {
            bVar.f7266a = false;
        }
        return bVar.f7266a;
    }

    @Override // K1.E0
    public void e(L1.B0 b02) {
        o(b02);
    }

    @Override // K1.E0
    public e2.b f() {
        return this.f7255a;
    }

    @Override // K1.E0
    public long g(L1.B0 b02) {
        return this.f7262h;
    }

    @Override // K1.E0
    public void h(E0.a aVar, a2.n0 n0Var, d2.r[] rVarArr) {
        b bVar = (b) AbstractC0853a.e((b) this.f7264j.get(aVar.f6837a));
        int iL = this.f7260f;
        if (iL == -1) {
            iL = l(rVarArr);
        }
        bVar.f7267b = iL;
        q();
    }

    @Override // K1.E0
    public boolean i(E0.a aVar) {
        long jM0 = G1.M.m0(aVar.f6841e, aVar.f6842f);
        long jMin = aVar.f6844h ? this.f7259e : this.f7258d;
        long j10 = aVar.f6845i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jM0 >= jMin) {
            return true;
        }
        return !this.f7261g && this.f7255a.f() >= m();
    }

    @Override // K1.E0
    public void j(L1.B0 b02) {
        o(b02);
        if (this.f7264j.isEmpty()) {
            this.f7265k = -1L;
        }
    }

    public int l(d2.r[] rVarArr) {
        int iN = 0;
        for (d2.r rVar : rVarArr) {
            if (rVar != null) {
                iN += n(rVar.n().f1493c);
            }
        }
        return Math.max(13107200, iN);
    }

    public int m() {
        Iterator it = this.f7264j.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((b) it.next()).f7267b;
        }
        return i10;
    }

    public final void o(L1.B0 b02) {
        if (this.f7264j.remove(b02) != null) {
            q();
        }
    }

    public final void p(L1.B0 b02) {
        b bVar = (b) AbstractC0853a.e((b) this.f7264j.get(b02));
        int i10 = this.f7260f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f7267b = i10;
        bVar.f7266a = false;
    }

    public final void q() {
        if (this.f7264j.isEmpty()) {
            this.f7255a.g();
        } else {
            this.f7255a.h(m());
        }
    }

    public C1009m(e2.g gVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        k(i12, 0, "bufferForPlaybackMs", WebrtcBuildVersion.maint_version);
        k(i13, 0, "bufferForPlaybackAfterRebufferMs", WebrtcBuildVersion.maint_version);
        k(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        k(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i11, i10, "maxBufferMs", "minBufferMs");
        k(i15, 0, "backBufferDurationMs", WebrtcBuildVersion.maint_version);
        this.f7255a = gVar;
        this.f7256b = G1.M.M0(i10);
        this.f7257c = G1.M.M0(i11);
        this.f7258d = G1.M.M0(i12);
        this.f7259e = G1.M.M0(i13);
        this.f7260f = i14;
        this.f7261g = z10;
        this.f7262h = G1.M.M0(i15);
        this.f7263i = z11;
        this.f7264j = new HashMap();
        this.f7265k = -1L;
    }
}
