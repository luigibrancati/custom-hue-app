package K1;

import D1.AbstractC0746d;
import D1.C0744b;
import D1.C0752j;
import D1.D;
import D1.z;
import G1.AbstractC0853a;
import G1.C0858f;
import G1.C0863k;
import G1.InterfaceC0860h;
import G1.s;
import K1.A0;
import K1.C0993e;
import K1.C1004j0;
import K1.InterfaceC1032y;
import K1.Z0;
import K1.c1;
import K1.s1;
import K1.u1;
import K7.AbstractC1081v;
import L1.InterfaceC1137a;
import L1.InterfaceC1139b;
import M1.s;
import a2.C2608A;
import a2.InterfaceC2611D;
import a2.e0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import c2.InterfaceC2937h;
import h2.InterfaceC4269a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: K1.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1004j0 extends AbstractC0746d implements InterfaceC1032y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final d f7107A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0993e f7108B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final s1 f7109C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final x1 f7110D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final A1 f7111E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f7112F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final u1 f7113G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0858f f7114H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f7115I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f7116J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f7117K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f7118L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f7119M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f7120N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public j1 f7121O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public k1 f7122P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public a2.e0 f7123Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public InterfaceC1032y.c f7124R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f7125S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public z.b f7126T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public D1.t f7127U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public D1.t f7128V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public D1.o f7129W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public D1.o f7130X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f7131Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Surface f7132Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public SurfaceHolder f7133a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.y f7134b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f7135b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z.b f7136c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextureView f7137c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0863k f7138d = new C0863k();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f7139d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f7140e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f7141e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D1.z f7142f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public G1.D f7143f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1[] f7144g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public C1003j f7145g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1[] f7146h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public C1003j f7147h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d2.x f7148i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public C0744b f7149i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final G1.p f7150j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f7151j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A0.f f7152k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f7153k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A0 f7154l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public F1.c f7155l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final G1.s f7156m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f7157m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f7158n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f7159n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D.b f7160o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f7161o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f7162p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public D1.A f7163p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7164q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f7165q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC2611D.a f7166r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f7167r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1137a f7168s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C0752j f7169s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Looper f7170t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public D1.K f7171t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e2.d f7172u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public D1.t f7173u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7174v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public C0986a1 f7175v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f7176w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f7177w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f7178x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f7179x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC0860h f7180y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f7181y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f7182z;

    /* JADX INFO: renamed from: K1.j0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public static /* synthetic */ void a(Context context, boolean z10, C1004j0 c1004j0, L1.B0 b02) {
            L1.z0 z0VarD0 = L1.z0.D0(context);
            if (z0VarD0 == null) {
                G1.t.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z10) {
                c1004j0.U0(z0VarD0);
            }
            b02.b(z0VarD0.K0());
        }

        public static void b(final Context context, final C1004j0 c1004j0, final boolean z10, final L1.B0 b02) {
            c1004j0.g1().e(c1004j0.l1(), null).i(new Runnable() { // from class: K1.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C1004j0.b.a(context, z10, c1004j0, b02);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K1.j0$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements g2.G, M1.r, InterfaceC2937h, U1.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C0993e.b, s1.b, InterfaceC1032y.a {
        public c() {
        }

        @Override // M1.r
        public void a(Exception exc) {
            C1004j0.this.f7168s.a(exc);
        }

        @Override // M1.r
        public void b(s.a aVar) {
            C1004j0.this.f7168s.b(aVar);
        }

        @Override // M1.r
        public void c(s.a aVar) {
            C1004j0.this.f7168s.c(aVar);
        }

        @Override // g2.G
        public void d(D1.o oVar, C1005k c1005k) {
            C1004j0.this.f7129W = oVar;
            C1004j0.this.f7168s.d(oVar, c1005k);
        }

        @Override // g2.G
        public void e(String str) {
            C1004j0.this.f7168s.e(str);
        }

        @Override // g2.G
        public void f(String str, long j10, long j11) {
            C1004j0.this.f7168s.f(str, j10, j11);
        }

        @Override // M1.r
        public void g(D1.o oVar, C1005k c1005k) {
            C1004j0.this.f7130X = oVar;
            C1004j0.this.f7168s.g(oVar, c1005k);
        }

        @Override // M1.r
        public void h(String str) {
            C1004j0.this.f7168s.h(str);
        }

        @Override // M1.r
        public void i(String str, long j10, long j11) {
            C1004j0.this.f7168s.i(str, j10, j11);
        }

        @Override // M1.r
        public void j(long j10) {
            C1004j0.this.f7168s.j(j10);
        }

        @Override // g2.G
        public void k(C1003j c1003j) {
            C1004j0.this.f7168s.k(c1003j);
            C1004j0.this.f7129W = null;
            C1004j0.this.f7145g0 = null;
        }

        @Override // g2.G
        public void l(Exception exc) {
            C1004j0.this.f7168s.l(exc);
        }

        @Override // g2.G
        public void m(int i10, long j10) {
            C1004j0.this.f7168s.m(i10, j10);
        }

        @Override // M1.r
        public void n(C1003j c1003j) {
            C1004j0.this.f7147h0 = c1003j;
            C1004j0.this.f7168s.n(c1003j);
        }

        @Override // g2.G
        public void o(Object obj, long j10) {
            C1004j0.this.f7168s.o(obj, j10);
            if (C1004j0.this.f7131Y == obj) {
                C1004j0.this.f7156m.j(26, new s.a() { // from class: K1.t0
                    @Override // G1.s.a
                    public final void invoke(Object obj2) {
                        ((z.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // M1.r
        public void onAudioSessionIdChanged(final int i10) {
            C1004j0.this.f7114H.h(new J7.f() { // from class: K1.u0
                @Override // J7.f
                public final Object apply(Object obj) {
                    return Integer.valueOf(i10);
                }
            }, new J7.f() { // from class: K1.v0
                @Override // J7.f
                public final Object apply(Object obj) {
                    return Integer.valueOf(i10);
                }
            });
        }

        @Override // c2.InterfaceC2937h
        public void onCues(final List list) {
            C1004j0.this.f7156m.j(27, new s.a() { // from class: K1.p0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onCues(list);
                }
            });
        }

        @Override // U1.b
        public void onMetadata(final D1.u uVar) {
            C1004j0 c1004j0 = C1004j0.this;
            c1004j0.f7173u0 = c1004j0.f7173u0.a().M(uVar).J();
            D1.t tVarX0 = C1004j0.this.X0();
            if (!tVarX0.equals(C1004j0.this.f7127U)) {
                C1004j0.this.f7127U = tVarX0;
                C1004j0.this.f7156m.h(14, new s.a() { // from class: K1.n0
                    @Override // G1.s.a
                    public final void invoke(Object obj) {
                        ((z.d) obj).onMediaMetadataChanged(C1004j0.this.f7127U);
                    }
                });
            }
            C1004j0.this.f7156m.h(28, new s.a() { // from class: K1.o0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onMetadata(uVar);
                }
            });
            C1004j0.this.f7156m.f();
        }

        @Override // M1.r
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (C1004j0.this.f7153k0 == z10) {
                return;
            }
            C1004j0.this.f7153k0 = z10;
            C1004j0.this.f7156m.j(23, new s.a() { // from class: K1.m0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C1004j0.this.G1(surfaceTexture);
            C1004j0.this.v1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1004j0.this.H1(null);
            C1004j0.this.v1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C1004j0.this.v1(i10, i11);
        }

        @Override // g2.G
        public void onVideoSizeChanged(final D1.K k10) {
            C1004j0.this.f7171t0 = k10;
            C1004j0.this.f7156m.j(25, new s.a() { // from class: K1.q0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onVideoSizeChanged(k10);
                }
            });
        }

        @Override // M1.r
        public void p(Exception exc) {
            C1004j0.this.f7168s.p(exc);
        }

        @Override // g2.G
        public void q(C1003j c1003j) {
            C1004j0.this.f7145g0 = c1003j;
            C1004j0.this.f7168s.q(c1003j);
        }

        @Override // M1.r
        public void r(int i10, long j10, long j11) {
            C1004j0.this.f7168s.r(i10, j10, j11);
        }

        @Override // g2.G
        public void s(long j10, int i10) {
            C1004j0.this.f7168s.s(j10, i10);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C1004j0.this.v1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C1004j0.this.f7135b0) {
                C1004j0.this.H1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C1004j0.this.f7135b0) {
                C1004j0.this.H1(null);
            }
            C1004j0.this.v1(0, 0);
        }

        @Override // M1.r
        public void t(C1003j c1003j) {
            C1004j0.this.f7168s.t(c1003j);
            C1004j0.this.f7130X = null;
            C1004j0.this.f7147h0 = null;
        }

        @Override // K1.s1.b
        public void u(int i10) {
            final C0752j c0752jA1 = C1004j0.a1(C1004j0.this.f7109C);
            if (c0752jA1.equals(C1004j0.this.f7169s0)) {
                return;
            }
            C1004j0.this.f7169s0 = c0752jA1;
            C1004j0.this.f7156m.j(29, new s.a() { // from class: K1.r0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onDeviceInfoChanged(c0752jA1);
                }
            });
        }

        @Override // K1.C0993e.b
        public void v() {
            C1004j0.this.L1(false, 3);
        }

        @Override // K1.s1.b
        public void x(final int i10, final boolean z10) {
            C1004j0.this.f7156m.j(30, new s.a() { // from class: K1.s0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }

        @Override // K1.InterfaceC1032y.a
        public void y(boolean z10) {
            C1004j0.this.O1();
        }

        @Override // c2.InterfaceC2937h
        public void onCues(final F1.c cVar) {
            C1004j0.this.f7155l0 = cVar;
            C1004j0.this.f7156m.j(27, new s.a() { // from class: K1.l0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onCues(cVar);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: K1.j0$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements g2.r, InterfaceC4269a, c1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g2.r f7184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC4269a f7185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g2.r f7186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC4269a f7187d;

        public d() {
        }

        @Override // h2.InterfaceC4269a
        public void a(long j10, float[] fArr) {
            InterfaceC4269a interfaceC4269a = this.f7187d;
            if (interfaceC4269a != null) {
                interfaceC4269a.a(j10, fArr);
            }
            InterfaceC4269a interfaceC4269a2 = this.f7185b;
            if (interfaceC4269a2 != null) {
                interfaceC4269a2.a(j10, fArr);
            }
        }

        @Override // h2.InterfaceC4269a
        public void d() {
            InterfaceC4269a interfaceC4269a = this.f7187d;
            if (interfaceC4269a != null) {
                interfaceC4269a.d();
            }
            InterfaceC4269a interfaceC4269a2 = this.f7185b;
            if (interfaceC4269a2 != null) {
                interfaceC4269a2.d();
            }
        }

        @Override // g2.r
        public void e(long j10, long j11, D1.o oVar, MediaFormat mediaFormat) {
            g2.r rVar = this.f7186c;
            if (rVar != null) {
                rVar.e(j10, j11, oVar, mediaFormat);
            }
            g2.r rVar2 = this.f7184a;
            if (rVar2 != null) {
                rVar2.e(j10, j11, oVar, mediaFormat);
            }
        }

        @Override // K1.c1.b
        public void w(int i10, Object obj) {
            if (i10 == 7) {
                this.f7184a = (g2.r) obj;
                return;
            }
            if (i10 == 8) {
                this.f7185b = (InterfaceC4269a) obj;
            } else {
                if (i10 != 10000) {
                    return;
                }
                android.support.v4.media.session.a.a(obj);
                this.f7186c = null;
                this.f7187d = null;
            }
        }
    }

    /* JADX INFO: renamed from: K1.j0$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements L0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2611D f7189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public D1.D f7190c;

        public e(Object obj, C2608A c2608a) {
            this.f7188a = obj;
            this.f7189b = c2608a;
            this.f7190c = c2608a.Z();
        }

        @Override // K1.L0
        public D1.D a() {
            return this.f7190c;
        }

        public void b(D1.D d10) {
            this.f7190c = d10;
        }

        @Override // K1.L0
        public Object getUid() {
            return this.f7188a;
        }
    }

    static {
        D1.s.a("media3.exoplayer");
    }

    public C1004j0(InterfaceC1032y.b bVar, D1.z zVar) {
        Looper looper;
        InterfaceC0860h interfaceC0860h;
        try {
            G1.t.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + G1.M.f4266e + "]");
            this.f7140e = bVar.f7371a.getApplicationContext();
            this.f7168s = (InterfaceC1137a) bVar.f7379i.apply(bVar.f7372b);
            this.f7161o0 = bVar.f7381k;
            this.f7163p0 = bVar.f7382l;
            this.f7149i0 = bVar.f7383m;
            this.f7139d0 = bVar.f7389s;
            this.f7141e0 = bVar.f7390t;
            this.f7153k0 = bVar.f7387q;
            this.f7112F = bVar.f7362C;
            c cVar = new c();
            this.f7182z = cVar;
            this.f7107A = new d();
            Handler handler = new Handler(bVar.f7380j);
            i1 i1Var = (i1) bVar.f7374d.get();
            e1[] e1VarArrB = i1Var.b(handler, cVar, cVar, cVar, cVar);
            this.f7144g = e1VarArrB;
            AbstractC0853a.g(e1VarArrB.length > 0);
            this.f7146h = new e1[e1VarArrB.length];
            int i10 = 0;
            while (true) {
                e1[] e1VarArr = this.f7146h;
                if (i10 >= e1VarArr.length) {
                    break;
                }
                e1 e1Var = this.f7144g[i10];
                c cVar2 = this.f7182z;
                i1 i1Var2 = i1Var;
                e1VarArr[i10] = i1Var2.a(e1Var, handler, cVar2, cVar2, cVar2, cVar2);
                i10++;
                i1Var = i1Var2;
            }
            d2.x xVar = (d2.x) bVar.f7376f.get();
            this.f7148i = xVar;
            this.f7166r = (InterfaceC2611D.a) bVar.f7375e.get();
            e2.d dVar = (e2.d) bVar.f7378h.get();
            this.f7172u = dVar;
            this.f7164q = bVar.f7391u;
            this.f7122P = bVar.f7392v;
            this.f7174v = bVar.f7394x;
            this.f7176w = bVar.f7395y;
            this.f7178x = bVar.f7396z;
            this.f7121O = bVar.f7393w;
            this.f7125S = bVar.f7363D;
            Looper looper2 = bVar.f7380j;
            this.f7170t = looper2;
            InterfaceC0860h interfaceC0860h2 = bVar.f7372b;
            this.f7180y = interfaceC0860h2;
            D1.z zVar2 = zVar == null ? this : zVar;
            this.f7142f = zVar2;
            this.f7156m = new G1.s(looper2, interfaceC0860h2, new s.b() { // from class: K1.Q
                @Override // G1.s.b
                public final void a(Object obj, D1.m mVar) {
                    ((z.d) obj).onEvents(this.f6920a.f7142f, new z.c(mVar));
                }
            });
            this.f7158n = new CopyOnWriteArraySet();
            this.f7162p = new ArrayList();
            this.f7123Q = new e0.a(0);
            this.f7124R = InterfaceC1032y.c.f7397b;
            e1[] e1VarArr2 = this.f7144g;
            d2.y yVar = new d2.y(new g1[e1VarArr2.length], new d2.r[e1VarArr2.length], D1.G.f1604b, null);
            this.f7134b = yVar;
            this.f7160o = new D.b();
            z.b bVarE = new z.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, xVar.g()).d(23, bVar.f7388r).d(25, bVar.f7388r).d(33, bVar.f7388r).d(26, bVar.f7388r).d(34, bVar.f7388r).e();
            this.f7136c = bVarE;
            this.f7126T = new z.b.a().b(bVarE).a(4).a(10).e();
            this.f7150j = interfaceC0860h2.e(looper2, null);
            A0.f fVar = new A0.f() { // from class: K1.S
                @Override // K1.A0.f
                public final void a(A0.e eVar) {
                    C1004j0 c1004j0 = this.f6928a;
                    c1004j0.f7150j.i(new Runnable() { // from class: K1.Y
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1004j0.q1(eVar);
                        }
                    });
                }
            };
            this.f7152k = fVar;
            this.f7175v0 = C0986a1.k(yVar);
            this.f7168s.C(zVar2, looper2);
            L1.B0 b02 = new L1.B0(bVar.f7368I);
            A0 a02 = new A0(this.f7140e, this.f7144g, this.f7146h, xVar, yVar, (E0) bVar.f7377g.get(), dVar, this.f7115I, this.f7116J, this.f7168s, this.f7122P, bVar.f7360A, bVar.f7361B, this.f7125S, bVar.f7369J, looper2, interfaceC0860h2, fVar, b02, bVar.f7365F, this.f7124R, this.f7107A);
            this.f7154l = a02;
            Looper looperO = a02.O();
            this.f7151j0 = 1.0f;
            this.f7115I = 0;
            D1.t tVar = D1.t.f1996I;
            this.f7127U = tVar;
            this.f7128V = tVar;
            this.f7173u0 = tVar;
            this.f7177w0 = -1;
            this.f7155l0 = F1.c.f3637d;
            this.f7157m0 = true;
            l0(this.f7168s);
            dVar.h(new Handler(looper2), this.f7168s);
            V0(this.f7182z);
            long j10 = bVar.f7373c;
            if (j10 > 0) {
                a02.H(j10);
            }
            b.b(this.f7140e, this, bVar.f7364E, b02);
            C0858f c0858f = new C0858f(0, looperO, looper2, interfaceC0860h2, new C0858f.a() { // from class: K1.U
                @Override // G1.C0858f.a
                public final void a(Object obj, Object obj2) {
                    this.f6935a.x1(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.f7114H = c0858f;
            c0858f.e(new Runnable() { // from class: K1.V
                @Override // java.lang.Runnable
                public final void run() {
                    C1004j0 c1004j0 = this.f6940a;
                    c1004j0.f7114H.g(Integer.valueOf(G1.M.J(c1004j0.f7140e)));
                }
            });
            C0993e c0993e = new C0993e(bVar.f7371a, looperO, bVar.f7380j, this.f7182z, interfaceC0860h2);
            InterfaceC0860h interfaceC0860h3 = interfaceC0860h2;
            this.f7108B = c0993e;
            c0993e.d(bVar.f7386p);
            if (bVar.f7367H) {
                u1 u1Var = bVar.f7370K;
                this.f7113G = u1Var;
                u1Var.a(new u1.a() { // from class: K1.W
                    @Override // K1.u1.a
                    public final void a(boolean z10) {
                        this.f6944a.y1(z10);
                    }
                }, this.f7140e, looper2, looperO, interfaceC0860h3);
                interfaceC0860h3 = interfaceC0860h3;
            } else {
                this.f7113G = null;
            }
            if (bVar.f7388r) {
                InterfaceC0860h interfaceC0860h4 = interfaceC0860h3;
                s1 s1Var = new s1(bVar.f7371a, this.f7182z, this.f7149i0.b(), looperO, looper2, interfaceC0860h4);
                looper = looperO;
                interfaceC0860h = interfaceC0860h4;
                this.f7109C = s1Var;
            } else {
                looper = looperO;
                interfaceC0860h = interfaceC0860h3;
                this.f7109C = null;
            }
            x1 x1Var = new x1(bVar.f7371a, looper, interfaceC0860h);
            this.f7110D = x1Var;
            x1Var.c(bVar.f7385o != 0);
            A1 a12 = new A1(bVar.f7371a, looper, interfaceC0860h);
            this.f7111E = a12;
            a12.c(bVar.f7385o == 2);
            this.f7169s0 = C0752j.f1711e;
            this.f7171t0 = D1.K.f1618e;
            this.f7143f0 = G1.D.f4244c;
            a02.x1(this.f7121O);
            a02.h1(this.f7149i0, bVar.f7384n);
            C1(1, 3, this.f7149i0);
            C1(2, 4, Integer.valueOf(this.f7139d0));
            C1(2, 5, Integer.valueOf(this.f7141e0));
            C1(1, 9, Boolean.valueOf(this.f7153k0));
            C1(6, 8, this.f7107A);
            D1(16, Integer.valueOf(this.f7161o0));
            this.f7138d.f();
        } catch (Throwable th) {
            this.f7138d.f();
            throw th;
        }
    }

    public static /* synthetic */ void I(int i10, z.e eVar, z.e eVar2, z.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.onPositionDiscontinuity(eVar, eVar2, i10);
    }

    public static C0752j a1(s1 s1Var) {
        return new C0752j.b(0).g(s1Var != null ? s1Var.l() : 0).f(s1Var != null ? s1Var.k() : 0).e();
    }

    public static /* synthetic */ void n(C0986a1 c0986a1, z.d dVar) {
        dVar.onLoadingChanged(c0986a1.f6995g);
        dVar.onIsLoadingChanged(c0986a1.f6995g);
    }

    public static long p1(C0986a1 c0986a1) {
        D.c cVar = new D.c();
        D.b bVar = new D.b();
        c0986a1.f6989a.h(c0986a1.f6990b.f20522a, bVar);
        return c0986a1.f6991c == -9223372036854775807L ? c0986a1.f6989a.n(bVar.f1452c, cVar).c() : bVar.n() + c0986a1.f6991c;
    }

    public static C0986a1 s1(C0986a1 c0986a1, int i10) {
        C0986a1 c0986a1H = c0986a1.h(i10);
        return (i10 == 1 || i10 == 4) ? c0986a1H.b(false) : c0986a1H;
    }

    @Override // D1.z
    public long A0() {
        P1();
        return i1(this.f7175v0);
    }

    public final void A1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f7162p.remove(i12);
        }
        this.f7123Q = this.f7123Q.a(i10, i11);
    }

    public final void B1() {
        TextureView textureView = this.f7137c0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f7182z) {
                G1.t.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7137c0.setSurfaceTextureListener(null);
            }
            this.f7137c0 = null;
        }
        SurfaceHolder surfaceHolder = this.f7133a0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f7182z);
            this.f7133a0 = null;
        }
    }

    public final void C1(int i10, int i11, Object obj) {
        for (e1 e1Var : this.f7144g) {
            if (i10 == -1 || e1Var.f() == i10) {
                d1(e1Var).m(i11).l(obj).k();
            }
        }
        for (e1 e1Var2 : this.f7146h) {
            if (e1Var2 != null && (i10 == -1 || e1Var2.f() == i10)) {
                d1(e1Var2).m(i11).l(obj).k();
            }
        }
    }

    @Override // D1.z
    public int D0() {
        P1();
        int iK1 = k1(this.f7175v0);
        if (iK1 == -1) {
            return 0;
        }
        return iK1;
    }

    public final void D1(int i10, Object obj) {
        C1(-1, i10, obj);
    }

    @Override // D1.z
    public boolean E0() {
        P1();
        return this.f7116J;
    }

    public void E1(List list, boolean z10) {
        P1();
        F1(list, -1, -9223372036854775807L, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F1(java.util.List r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r1 = r16
            K1.a1 r2 = r14.f7175v0
            int r2 = r14.k1(r2)
            long r3 = r14.getCurrentPosition()
            int r5 = r14.f7117K
            r6 = 1
            int r5 = r5 + r6
            r14.f7117K = r5
            java.util.List r5 = r14.f7162p
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L24
            java.util.List r5 = r14.f7162p
            int r5 = r5.size()
            r14.A1(r7, r5)
        L24:
            java.util.List r9 = r14.W0(r7, r15)
            D1.D r5 = r14.b1()
            boolean r8 = r5.q()
            if (r8 != 0) goto L38
            int r8 = r5.p()
            if (r1 >= r8) goto L3b
        L38:
            r10 = r17
            goto L43
        L3b:
            D1.p r0 = new D1.p
            r10 = r17
            r0.<init>(r5, r1, r10)
            throw r0
        L43:
            r8 = -1
            if (r19 == 0) goto L53
            boolean r1 = r14.f7116J
            int r1 = r5.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L51:
            r10 = r1
            goto L5a
        L53:
            if (r1 != r8) goto L58
            r10 = r2
            r2 = r3
            goto L5a
        L58:
            r2 = r10
            goto L51
        L5a:
            K1.a1 r1 = r14.f7175v0
            android.util.Pair r4 = r14.u1(r5, r10, r2)
            K1.a1 r1 = r14.t1(r1, r5, r4)
            int r4 = r1.f6993e
            if (r10 == r8) goto L7a
            if (r4 == r6) goto L7a
            boolean r4 = r5.q()
            if (r4 != 0) goto L79
            int r4 = r5.p()
            if (r10 < r4) goto L77
            goto L79
        L77:
            r4 = 2
            goto L7a
        L79:
            r4 = 4
        L7a:
            K1.a1 r1 = s1(r1, r4)
            K1.A0 r8 = r14.f7154l
            long r11 = G1.M.M0(r2)
            a2.e0 r13 = r14.f7123Q
            r8.m1(r9, r10, r11, r13)
            K1.a1 r2 = r14.f7175v0
            a2.D$b r2 = r2.f6990b
            java.lang.Object r2 = r2.f20522a
            a2.D$b r3 = r1.f6990b
            java.lang.Object r3 = r3.f20522a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La5
            K1.a1 r2 = r14.f7175v0
            D1.D r2 = r2.f6989a
            boolean r2 = r2.q()
            if (r2 != 0) goto La5
            r3 = r6
            goto La6
        La5:
            r3 = r7
        La6:
            long r5 = r14.j1(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r14
            r0.M1(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.C1004j0.F1(java.util.List, int, long, boolean):void");
    }

    public final void G1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        H1(surface);
        this.f7132Z = surface;
    }

    public final void H1(Object obj) {
        Object obj2 = this.f7131Y;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zF1 = this.f7154l.F1(obj, z10 ? this.f7112F : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.f7131Y;
            Surface surface = this.f7132Z;
            if (obj3 == surface) {
                surface.release();
                this.f7132Z = null;
            }
        }
        this.f7131Y = obj;
        if (zF1) {
            return;
        }
        J1(C1030x.d(new B0(3), 1003));
    }

    public void I1(SurfaceHolder surfaceHolder) {
        P1();
        if (surfaceHolder == null) {
            Y0();
            return;
        }
        B1();
        this.f7135b0 = true;
        this.f7133a0 = surfaceHolder;
        surfaceHolder.addCallback(this.f7182z);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            H1(null);
            v1(0, 0);
        } else {
            H1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            v1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void J1(C1030x c1030x) {
        C0986a1 c0986a1 = this.f7175v0;
        C0986a1 c0986a1C = c0986a1.c(c0986a1.f6990b);
        c0986a1C.f7005q = c0986a1C.f7007s;
        c0986a1C.f7006r = 0L;
        C0986a1 c0986a1S1 = s1(c0986a1C, 1);
        if (c1030x != null) {
            c0986a1S1 = c0986a1S1.f(c1030x);
        }
        this.f7117K++;
        this.f7154l.P1();
        M1(c0986a1S1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void K1() {
        z.b bVar = this.f7126T;
        z.b bVarO = G1.M.O(this.f7142f, this.f7136c);
        this.f7126T = bVarO;
        if (bVarO.equals(bVar)) {
            return;
        }
        this.f7156m.h(13, new s.a() { // from class: K1.Z
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((z.d) obj).onAvailableCommandsChanged(this.f6961a.f7126T);
            }
        });
    }

    public final void L1(boolean z10, int i10) {
        int iZ0 = Z0(z10);
        C0986a1 c0986a1A = this.f7175v0;
        if (c0986a1A.f7000l == z10 && c0986a1A.f7002n == iZ0 && c0986a1A.f7001m == i10) {
            return;
        }
        this.f7117K++;
        if (c0986a1A.f7004p) {
            c0986a1A = c0986a1A.a();
        }
        C0986a1 c0986a1E = c0986a1A.e(z10, i10, iZ0);
        this.f7154l.p1(z10, i10, iZ0);
        M1(c0986a1E, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void M1(final C0986a1 c0986a1, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        C0986a1 c0986a12 = this.f7175v0;
        this.f7175v0 = c0986a1;
        boolean zEquals = c0986a12.f6989a.equals(c0986a1.f6989a);
        Pair pairE1 = e1(c0986a1, c0986a12, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairE1.first).booleanValue();
        final int iIntValue = ((Integer) pairE1.second).intValue();
        if (zBooleanValue) {
            rVar = c0986a1.f6989a.q() ? null : c0986a1.f6989a.n(c0986a1.f6989a.h(c0986a1.f6990b.f20522a, this.f7160o).f1452c, this.f1683a).f1475c;
            this.f7173u0 = D1.t.f1996I;
        }
        if (zBooleanValue || !c0986a12.f6998j.equals(c0986a1.f6998j)) {
            this.f7173u0 = this.f7173u0.a().N(c0986a1.f6998j).J();
        }
        D1.t tVarX0 = X0();
        boolean zEquals2 = tVarX0.equals(this.f7127U);
        this.f7127U = tVarX0;
        boolean z12 = c0986a12.f7000l != c0986a1.f7000l;
        boolean z13 = c0986a12.f6993e != c0986a1.f6993e;
        if (z13 || z12) {
            O1();
        }
        boolean z14 = c0986a12.f6995g;
        boolean z15 = c0986a1.f6995g;
        boolean z16 = z14 != z15;
        if (z16) {
            N1(z15);
        }
        if (!zEquals) {
            this.f7156m.h(0, new s.a() { // from class: K1.H
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    z.d dVar = (z.d) obj;
                    dVar.onTimelineChanged(c0986a1.f6989a, i10);
                }
            });
        }
        if (z10) {
            final z.e eVarO1 = o1(i11, c0986a12, i12);
            final z.e eVarN1 = n1(j10);
            this.f7156m.h(11, new s.a() { // from class: K1.e0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    C1004j0.I(i11, eVarO1, eVarN1, (z.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f7156m.h(1, new s.a() { // from class: K1.f0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onMediaItemTransition(rVar, iIntValue);
                }
            });
        }
        if (c0986a12.f6994f != c0986a1.f6994f) {
            this.f7156m.h(10, new s.a() { // from class: K1.g0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onPlayerErrorChanged(c0986a1.f6994f);
                }
            });
            if (c0986a1.f6994f != null) {
                this.f7156m.h(10, new s.a() { // from class: K1.h0
                    @Override // G1.s.a
                    public final void invoke(Object obj) {
                        ((z.d) obj).onPlayerError(c0986a1.f6994f);
                    }
                });
            }
        }
        d2.y yVar = c0986a12.f6997i;
        d2.y yVar2 = c0986a1.f6997i;
        if (yVar != yVar2) {
            this.f7148i.h(yVar2.f32983e);
            this.f7156m.h(2, new s.a() { // from class: K1.i0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onTracksChanged(c0986a1.f6997i.f32982d);
                }
            });
        }
        if (!zEquals2) {
            final D1.t tVar = this.f7127U;
            this.f7156m.h(14, new s.a() { // from class: K1.I
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onMediaMetadataChanged(tVar);
                }
            });
        }
        if (z16) {
            this.f7156m.h(3, new s.a() { // from class: K1.J
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    C1004j0.n(c0986a1, (z.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f7156m.h(-1, new s.a() { // from class: K1.K
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    C0986a1 c0986a13 = c0986a1;
                    ((z.d) obj).onPlayerStateChanged(c0986a13.f7000l, c0986a13.f6993e);
                }
            });
        }
        if (z13) {
            this.f7156m.h(4, new s.a() { // from class: K1.L
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onPlaybackStateChanged(c0986a1.f6993e);
                }
            });
        }
        if (z12 || c0986a12.f7001m != c0986a1.f7001m) {
            this.f7156m.h(5, new s.a() { // from class: K1.T
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    C0986a1 c0986a13 = c0986a1;
                    ((z.d) obj).onPlayWhenReadyChanged(c0986a13.f7000l, c0986a13.f7001m);
                }
            });
        }
        if (c0986a12.f7002n != c0986a1.f7002n) {
            this.f7156m.h(6, new s.a() { // from class: K1.b0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onPlaybackSuppressionReasonChanged(c0986a1.f7002n);
                }
            });
        }
        if (c0986a12.n() != c0986a1.n()) {
            this.f7156m.h(7, new s.a() { // from class: K1.c0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onIsPlayingChanged(c0986a1.n());
                }
            });
        }
        if (!c0986a12.f7003o.equals(c0986a1.f7003o)) {
            this.f7156m.h(12, new s.a() { // from class: K1.d0
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onPlaybackParametersChanged(c0986a1.f7003o);
                }
            });
        }
        K1();
        this.f7156m.f();
        if (c0986a12.f7004p != c0986a1.f7004p) {
            Iterator it = this.f7158n.iterator();
            while (it.hasNext()) {
                ((InterfaceC1032y.a) it.next()).y(c0986a1.f7004p);
            }
        }
    }

    public final void N1(boolean z10) {
        D1.A a10 = this.f7163p0;
        if (a10 != null) {
            if (z10 && !this.f7165q0) {
                a10.a(this.f7161o0);
                this.f7165q0 = true;
            } else {
                if (z10 || !this.f7165q0) {
                    return;
                }
                a10.b(this.f7161o0);
                this.f7165q0 = false;
            }
        }
    }

    public final void O1() {
        int iW = W();
        boolean z10 = false;
        if (iW != 1) {
            if (iW == 2 || iW == 3) {
                boolean zR1 = r1();
                x1 x1Var = this.f7110D;
                if (v0() && !zR1) {
                    z10 = true;
                }
                x1Var.d(z10);
                this.f7111E.d(v0());
                return;
            }
            if (iW != 4) {
                throw new IllegalStateException();
            }
        }
        this.f7110D.d(false);
        this.f7111E.d(false);
    }

    public final void P1() {
        this.f7138d.b();
        if (Thread.currentThread() != f1().getThread()) {
            String strG = G1.M.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), f1().getThread().getName());
            if (this.f7157m0) {
                throw new IllegalStateException(strG);
            }
            G1.t.i("ExoPlayerImpl", strG, this.f7159n0 ? null : new IllegalStateException());
            this.f7159n0 = true;
        }
    }

    public void U0(InterfaceC1139b interfaceC1139b) {
        this.f7168s.w((InterfaceC1139b) AbstractC0853a.e(interfaceC1139b));
    }

    public void V0(InterfaceC1032y.a aVar) {
        this.f7158n.add(aVar);
    }

    @Override // D1.z
    public int W() {
        P1();
        return this.f7175v0.f6993e;
    }

    public final List W0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Z0.c cVar = new Z0.c((InterfaceC2611D) list.get(i11), this.f7164q);
            arrayList.add(cVar);
            this.f7162p.add(i11 + i10, new e(cVar.f6980b, cVar.f6979a));
        }
        this.f7123Q = this.f7123Q.g(i10, arrayList.size());
        return arrayList;
    }

    public final D1.t X0() {
        D1.D dU0 = u0();
        if (dU0.q()) {
            return this.f7173u0;
        }
        return this.f7173u0.a().L(dU0.n(D0(), this.f1683a).f1475c.f1876e).J();
    }

    public void Y0() {
        P1();
        B1();
        H1(null);
        v1(0, 0);
    }

    public final int Z0(boolean z10) {
        if (this.f7120N) {
            return 4;
        }
        u1 u1Var = this.f7113G;
        if (u1Var == null || u1Var.b()) {
            return (this.f7175v0.f7002n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    @Override // K1.InterfaceC1032y
    public D1.o a() {
        P1();
        return this.f7129W;
    }

    @Override // K1.InterfaceC1032y
    public k1 b() {
        P1();
        return this.f7122P;
    }

    public final D1.D b1() {
        return new d1(this.f7162p, this.f7123Q);
    }

    @Override // K1.InterfaceC1032y
    public void c(k1 k1Var) {
        P1();
        if (k1Var == null) {
            k1Var = k1.f7220g;
        }
        if (this.f7122P.equals(k1Var)) {
            return;
        }
        this.f7122P = k1Var;
        this.f7154l.z1(k1Var);
    }

    public final List c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f7166r.f((D1.r) list.get(i10)));
        }
        return arrayList;
    }

    @Override // D1.z
    public void d(D1.y yVar) {
        P1();
        if (yVar == null) {
            yVar = D1.y.f2116d;
        }
        if (this.f7175v0.f7003o.equals(yVar)) {
            return;
        }
        C0986a1 c0986a1G = this.f7175v0.g(yVar);
        this.f7117K++;
        this.f7154l.r1(yVar);
        M1(c0986a1G, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // D1.z
    public void d0(final int i10) {
        P1();
        if (this.f7115I != i10) {
            this.f7115I = i10;
            this.f7154l.u1(i10);
            this.f7156m.h(8, new s.a() { // from class: K1.P
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onRepeatModeChanged(i10);
                }
            });
            K1();
            this.f7156m.f();
        }
    }

    public final c1 d1(c1.b bVar) {
        int iK1 = k1(this.f7175v0);
        A0 a02 = this.f7154l;
        D1.D d10 = this.f7175v0.f6989a;
        if (iK1 == -1) {
            iK1 = 0;
        }
        return new c1(a02, bVar, d10, iK1, this.f7180y, a02.O());
    }

    @Override // D1.z
    public int e0() {
        P1();
        return this.f7115I;
    }

    public final Pair e1(C0986a1 c0986a1, C0986a1 c0986a12, boolean z10, int i10, boolean z11, boolean z12) {
        D1.D d10 = c0986a12.f6989a;
        D1.D d11 = c0986a1.f6989a;
        if (d11.q() && d10.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (d11.q() != d10.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (d10.n(d10.h(c0986a12.f6990b.f20522a, this.f7160o).f1452c, this.f1683a).f1473a.equals(d11.n(d11.h(c0986a1.f6990b.f20522a, this.f7160o).f1452c, this.f1683a).f1473a)) {
            return (z10 && i10 == 0 && c0986a12.f6990b.f20525d < c0986a1.f6990b.f20525d) ? new Pair(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i11));
    }

    @Override // D1.z
    public void f0(Surface surface) {
        P1();
        B1();
        H1(surface);
        int i10 = surface == null ? 0 : -1;
        v1(i10, i10);
    }

    public Looper f1() {
        return this.f7170t;
    }

    @Override // D1.z
    public boolean g0() {
        P1();
        return this.f7175v0.f6990b.b();
    }

    public InterfaceC0860h g1() {
        return this.f7180y;
    }

    @Override // D1.z
    public long getBufferedPosition() {
        P1();
        if (!g0()) {
            return h1();
        }
        C0986a1 c0986a1 = this.f7175v0;
        return c0986a1.f6999k.equals(c0986a1.f6990b) ? G1.M.o1(this.f7175v0.f7005q) : getDuration();
    }

    @Override // D1.z
    public long getCurrentPosition() {
        P1();
        return G1.M.o1(j1(this.f7175v0));
    }

    @Override // D1.z
    public long getDuration() {
        P1();
        if (!g0()) {
            return e();
        }
        C0986a1 c0986a1 = this.f7175v0;
        InterfaceC2611D.b bVar = c0986a1.f6990b;
        c0986a1.f6989a.h(bVar.f20522a, this.f7160o);
        return G1.M.o1(this.f7160o.b(bVar.f20523b, bVar.f20524c));
    }

    @Override // D1.z
    public long h0() {
        P1();
        return G1.M.o1(this.f7175v0.f7006r);
    }

    public long h1() {
        P1();
        if (this.f7175v0.f6989a.q()) {
            return this.f7181y0;
        }
        C0986a1 c0986a1 = this.f7175v0;
        if (c0986a1.f6999k.f20525d != c0986a1.f6990b.f20525d) {
            return c0986a1.f6989a.n(D0(), this.f1683a).d();
        }
        long j10 = c0986a1.f7005q;
        if (this.f7175v0.f6999k.b()) {
            C0986a1 c0986a12 = this.f7175v0;
            D.b bVarH = c0986a12.f6989a.h(c0986a12.f6999k.f20522a, this.f7160o);
            long jF = bVarH.f(this.f7175v0.f6999k.f20523b);
            j10 = jF == Long.MIN_VALUE ? bVarH.f1453d : jF;
        }
        C0986a1 c0986a13 = this.f7175v0;
        return G1.M.o1(z1(c0986a13.f6989a, c0986a13.f6999k, j10));
    }

    @Override // D1.AbstractC0746d
    public void i(int i10, long j10, int i11, boolean z10) {
        P1();
        if (i10 == -1) {
            return;
        }
        AbstractC0853a.a(i10 >= 0);
        D1.D d10 = this.f7175v0.f6989a;
        if (d10.q() || i10 < d10.p()) {
            this.f7168s.y();
            this.f7117K++;
            if (g0()) {
                G1.t.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                A0.e eVar = new A0.e(this.f7175v0);
                eVar.b(1);
                this.f7152k.a(eVar);
                return;
            }
            C0986a1 c0986a1S1 = this.f7175v0;
            int i12 = c0986a1S1.f6993e;
            if (i12 == 3 || (i12 == 4 && !d10.q())) {
                c0986a1S1 = s1(this.f7175v0, 2);
            }
            int iD0 = D0();
            C0986a1 c0986a1T1 = t1(c0986a1S1, d10, u1(d10, i10, j10));
            this.f7154l.Y0(d10, i10, G1.M.M0(j10));
            M1(c0986a1T1, 0, true, 1, j1(c0986a1T1), iD0, z10);
        }
    }

    public final long i1(C0986a1 c0986a1) {
        if (!c0986a1.f6990b.b()) {
            return G1.M.o1(j1(c0986a1));
        }
        c0986a1.f6989a.h(c0986a1.f6990b.f20522a, this.f7160o);
        return c0986a1.f6991c == -9223372036854775807L ? c0986a1.f6989a.n(k1(c0986a1), this.f1683a).b() : this.f7160o.m() + G1.M.o1(c0986a1.f6991c);
    }

    @Override // D1.z
    public void j0(List list, boolean z10) {
        P1();
        E1(c1(list), z10);
    }

    public final long j1(C0986a1 c0986a1) {
        if (c0986a1.f6989a.q()) {
            return G1.M.M0(this.f7181y0);
        }
        long jM = c0986a1.f7004p ? c0986a1.m() : c0986a1.f7007s;
        return c0986a1.f6990b.b() ? jM : z1(c0986a1.f6989a, c0986a1.f6990b, jM);
    }

    @Override // D1.z
    public void k0(SurfaceView surfaceView) {
        P1();
        I1(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final int k1(C0986a1 c0986a1) {
        return c0986a1.f6989a.q() ? this.f7177w0 : c0986a1.f6989a.h(c0986a1.f6990b.f20522a, this.f7160o).f1452c;
    }

    @Override // D1.z
    public void l0(z.d dVar) {
        this.f7156m.c((z.d) AbstractC0853a.e(dVar));
    }

    public Looper l1() {
        return this.f7154l.O();
    }

    @Override // D1.z
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C1030x m0() {
        P1();
        return this.f7175v0.f6994f;
    }

    @Override // D1.z
    public void n0(boolean z10) {
        P1();
        L1(z10, 1);
    }

    public final z.e n1(long j10) {
        Object obj;
        int iB;
        D1.r rVar;
        Object obj2;
        int iD0 = D0();
        if (this.f7175v0.f6989a.q()) {
            obj = null;
            iB = -1;
            rVar = null;
            obj2 = null;
        } else {
            C0986a1 c0986a1 = this.f7175v0;
            Object obj3 = c0986a1.f6990b.f20522a;
            c0986a1.f6989a.h(obj3, this.f7160o);
            iB = this.f7175v0.f6989a.b(obj3);
            obj2 = obj3;
            obj = this.f7175v0.f6989a.n(iD0, this.f1683a).f1473a;
            rVar = this.f1683a.f1475c;
        }
        int i10 = iB;
        long jO1 = G1.M.o1(j10);
        long jO12 = this.f7175v0.f6990b.b() ? G1.M.o1(p1(this.f7175v0)) : jO1;
        InterfaceC2611D.b bVar = this.f7175v0.f6990b;
        return new z.e(obj, iD0, rVar, obj2, i10, jO1, jO12, bVar.f20523b, bVar.f20524c);
    }

    @Override // D1.z
    public void o0(final C0744b c0744b, boolean z10) {
        P1();
        if (this.f7167r0) {
            return;
        }
        if (!Objects.equals(this.f7149i0, c0744b)) {
            this.f7149i0 = c0744b;
            C1(1, 3, c0744b);
            s1 s1Var = this.f7109C;
            if (s1Var != null) {
                s1Var.o(c0744b.b());
            }
            this.f7156m.h(20, new s.a() { // from class: K1.X
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onAudioAttributesChanged(c0744b);
                }
            });
        }
        this.f7154l.h1(this.f7149i0, z10);
        this.f7156m.f();
    }

    public final z.e o1(int i10, C0986a1 c0986a1, int i11) {
        int i12;
        Object obj;
        D1.r rVar;
        Object obj2;
        int i13;
        long jP1;
        long jP12;
        D.b bVar = new D.b();
        if (c0986a1.f6989a.q()) {
            i12 = i11;
            obj = null;
            rVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = c0986a1.f6990b.f20522a;
            c0986a1.f6989a.h(obj3, bVar);
            int i14 = bVar.f1452c;
            int iB = c0986a1.f6989a.b(obj3);
            Object obj4 = c0986a1.f6989a.n(i14, this.f1683a).f1473a;
            rVar = this.f1683a.f1475c;
            obj2 = obj3;
            i13 = iB;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (c0986a1.f6990b.b()) {
                InterfaceC2611D.b bVar2 = c0986a1.f6990b;
                jP1 = bVar.b(bVar2.f20523b, bVar2.f20524c);
                jP12 = p1(c0986a1);
            } else {
                jP1 = c0986a1.f6990b.f20526e != -1 ? p1(this.f7175v0) : bVar.f1454e + bVar.f1453d;
                jP12 = jP1;
            }
        } else if (c0986a1.f6990b.b()) {
            jP1 = c0986a1.f7007s;
            jP12 = p1(c0986a1);
        } else {
            jP1 = bVar.f1454e + c0986a1.f7007s;
            jP12 = jP1;
        }
        long jO1 = G1.M.o1(jP1);
        long jO12 = G1.M.o1(jP12);
        InterfaceC2611D.b bVar3 = c0986a1.f6990b;
        return new z.e(obj, i12, rVar, obj2, i13, jO1, jO12, bVar3.f20523b, bVar3.f20524c);
    }

    @Override // D1.z
    public D1.G p0() {
        P1();
        return this.f7175v0.f6997i.f32982d;
    }

    public final void q1(A0.e eVar) {
        boolean z10;
        long jZ1;
        int i10 = this.f7117K - eVar.f6813c;
        this.f7117K = i10;
        boolean z11 = true;
        if (eVar.f6814d) {
            this.f7118L = eVar.f6815e;
            this.f7119M = true;
        }
        if (i10 == 0) {
            D1.D d10 = eVar.f6812b.f6989a;
            if (!this.f7175v0.f6989a.q() && d10.q()) {
                this.f7177w0 = -1;
                this.f7181y0 = 0L;
                this.f7179x0 = 0;
            }
            if (!d10.q()) {
                List listF = ((d1) d10).F();
                AbstractC0853a.g(listF.size() == this.f7162p.size());
                for (int i11 = 0; i11 < listF.size(); i11++) {
                    ((e) this.f7162p.get(i11)).b((D1.D) listF.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f7119M) {
                if (eVar.f6812b.f6990b.equals(this.f7175v0.f6990b) && eVar.f6812b.f6992d == this.f7175v0.f7007s) {
                    z11 = false;
                }
                if (z11) {
                    if (d10.q() || eVar.f6812b.f6990b.b()) {
                        jZ1 = eVar.f6812b.f6992d;
                    } else {
                        C0986a1 c0986a1 = eVar.f6812b;
                        jZ1 = z1(d10, c0986a1.f6990b, c0986a1.f6992d);
                    }
                    j10 = jZ1;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.f7119M = false;
            M1(eVar.f6812b, 1, z10, this.f7118L, j10, -1, false);
        }
    }

    @Override // D1.z
    public int r0() {
        P1();
        if (g0()) {
            return this.f7175v0.f6990b.f20523b;
        }
        return -1;
    }

    public boolean r1() {
        P1();
        return this.f7175v0.f7004p;
    }

    @Override // K1.InterfaceC1032y
    public void release() {
        G1.t.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + G1.M.f4266e + "] [" + D1.s.b() + "]");
        P1();
        this.f7108B.d(false);
        s1 s1Var = this.f7109C;
        if (s1Var != null) {
            s1Var.n();
        }
        this.f7110D.d(false);
        this.f7111E.d(false);
        u1 u1Var = this.f7113G;
        if (u1Var != null) {
            u1Var.c();
        }
        if (!this.f7154l.I0()) {
            this.f7156m.j(10, new s.a() { // from class: K1.O
                @Override // G1.s.a
                public final void invoke(Object obj) {
                    ((z.d) obj).onPlayerError(C1030x.d(new B0(1), 1003));
                }
            });
        }
        this.f7156m.i();
        this.f7150j.f(null);
        this.f7172u.c(this.f7168s);
        C0986a1 c0986a1 = this.f7175v0;
        if (c0986a1.f7004p) {
            this.f7175v0 = c0986a1.a();
        }
        C0986a1 c0986a1S1 = s1(this.f7175v0, 1);
        this.f7175v0 = c0986a1S1;
        C0986a1 c0986a1C = c0986a1S1.c(c0986a1S1.f6990b);
        this.f7175v0 = c0986a1C;
        c0986a1C.f7005q = c0986a1C.f7007s;
        this.f7175v0.f7006r = 0L;
        this.f7168s.release();
        B1();
        Surface surface = this.f7132Z;
        if (surface != null) {
            surface.release();
            this.f7132Z = null;
        }
        if (this.f7165q0) {
            ((D1.A) AbstractC0853a.e(this.f7163p0)).b(this.f7161o0);
            this.f7165q0 = false;
        }
        this.f7155l0 = F1.c.f3637d;
        this.f7167r0 = true;
    }

    @Override // D1.z
    public int t0() {
        P1();
        return this.f7175v0.f7002n;
    }

    public final C0986a1 t1(C0986a1 c0986a1, D1.D d10, Pair pair) {
        AbstractC0853a.a(d10.q() || pair != null);
        D1.D d11 = c0986a1.f6989a;
        long jI1 = i1(c0986a1);
        C0986a1 c0986a1J = c0986a1.j(d10);
        if (d10.q()) {
            InterfaceC2611D.b bVarL = C0986a1.l();
            long jM0 = G1.M.M0(this.f7181y0);
            C0986a1 c0986a1C = c0986a1J.d(bVarL, jM0, jM0, jM0, 0L, a2.n0.f20861d, this.f7134b, AbstractC1081v.z()).c(bVarL);
            c0986a1C.f7005q = c0986a1C.f7007s;
            return c0986a1C;
        }
        Object obj = c0986a1J.f6990b.f20522a;
        boolean zEquals = obj.equals(((Pair) G1.M.i(pair)).first);
        InterfaceC2611D.b bVar = !zEquals ? new InterfaceC2611D.b(pair.first) : c0986a1J.f6990b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM02 = G1.M.M0(jI1);
        if (!d11.q()) {
            jM02 -= d11.h(obj, this.f7160o).n();
        }
        if (!zEquals || jLongValue < jM02) {
            InterfaceC2611D.b bVar2 = bVar;
            AbstractC0853a.g(!bVar2.b());
            C0986a1 c0986a1C2 = c0986a1J.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? a2.n0.f20861d : c0986a1J.f6996h, !zEquals ? this.f7134b : c0986a1J.f6997i, !zEquals ? AbstractC1081v.z() : c0986a1J.f6998j).c(bVar2);
            c0986a1C2.f7005q = jLongValue;
            return c0986a1C2;
        }
        if (jLongValue != jM02) {
            InterfaceC2611D.b bVar3 = bVar;
            AbstractC0853a.g(!bVar3.b());
            long jMax = Math.max(0L, c0986a1J.f7006r - (jLongValue - jM02));
            long j10 = c0986a1J.f7005q;
            if (c0986a1J.f6999k.equals(c0986a1J.f6990b)) {
                j10 = jLongValue + jMax;
            }
            C0986a1 c0986a1D = c0986a1J.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, c0986a1J.f6996h, c0986a1J.f6997i, c0986a1J.f6998j);
            c0986a1D.f7005q = j10;
            return c0986a1D;
        }
        int iB = d10.b(c0986a1J.f6999k.f20522a);
        if (iB != -1 && d10.f(iB, this.f7160o).f1452c == d10.h(bVar.f20522a, this.f7160o).f1452c) {
            return c0986a1J;
        }
        d10.h(bVar.f20522a, this.f7160o);
        long jB = bVar.b() ? this.f7160o.b(bVar.f20523b, bVar.f20524c) : this.f7160o.f1453d;
        InterfaceC2611D.b bVar4 = bVar;
        C0986a1 c0986a1C3 = c0986a1J.d(bVar4, c0986a1J.f7007s, c0986a1J.f7007s, c0986a1J.f6992d, jB - c0986a1J.f7007s, c0986a1J.f6996h, c0986a1J.f6997i, c0986a1J.f6998j).c(bVar4);
        c0986a1C3.f7005q = jB;
        return c0986a1C3;
    }

    @Override // D1.z
    public void u() {
        P1();
        C0986a1 c0986a1 = this.f7175v0;
        if (c0986a1.f6993e != 1) {
            return;
        }
        C0986a1 c0986a1F = c0986a1.f(null);
        C0986a1 c0986a1S1 = s1(c0986a1F, c0986a1F.f6989a.q() ? 4 : 2);
        this.f7117K++;
        this.f7154l.G0();
        M1(c0986a1S1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // D1.z
    public D1.D u0() {
        P1();
        return this.f7175v0.f6989a;
    }

    public final Pair u1(D1.D d10, int i10, long j10) {
        if (d10.q()) {
            this.f7177w0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f7181y0 = j10;
            this.f7179x0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= d10.p()) {
            i10 = d10.a(this.f7116J);
            j10 = d10.n(i10, this.f1683a).b();
        }
        return d10.j(this.f1683a, this.f7160o, i10, G1.M.M0(j10));
    }

    @Override // D1.z
    public void v(float f10) {
        P1();
        final float fN = G1.M.n(f10, 0.0f, 1.0f);
        if (this.f7151j0 == fN) {
            return;
        }
        this.f7151j0 = fN;
        this.f7154l.H1(fN);
        this.f7156m.j(22, new s.a() { // from class: K1.M
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((z.d) obj).onVolumeChanged(fN);
            }
        });
    }

    @Override // D1.z
    public boolean v0() {
        P1();
        return this.f7175v0.f7000l;
    }

    public final void v1(final int i10, final int i11) {
        if (i10 == this.f7143f0.b() && i11 == this.f7143f0.a()) {
            return;
        }
        this.f7143f0 = new G1.D(i10, i11);
        this.f7156m.j(24, new s.a() { // from class: K1.N
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((z.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        C1(2, 14, new G1.D(i10, i11));
    }

    @Override // D1.z
    public int w0() {
        P1();
        if (this.f7175v0.f6989a.q()) {
            return this.f7179x0;
        }
        C0986a1 c0986a1 = this.f7175v0;
        return c0986a1.f6989a.b(c0986a1.f6990b.f20522a);
    }

    public final void w1() {
        C0986a1 c0986a1 = this.f7175v0;
        L1(c0986a1.f7000l, c0986a1.f7001m);
    }

    @Override // D1.z
    public D1.K x0() {
        P1();
        return this.f7171t0;
    }

    public final void x1(int i10, final int i11) {
        P1();
        C1(1, 10, Integer.valueOf(i11));
        C1(2, 10, Integer.valueOf(i11));
        this.f7156m.j(21, new s.a() { // from class: K1.a0
            @Override // G1.s.a
            public final void invoke(Object obj) {
                ((z.d) obj).onAudioSessionIdChanged(i11);
            }
        });
    }

    public final void y1(boolean z10) {
        if (this.f7167r0) {
            return;
        }
        if (!z10) {
            w1();
        } else if (this.f7175v0.f7002n == 3) {
            w1();
        }
    }

    @Override // D1.z
    public int z0() {
        P1();
        if (g0()) {
            return this.f7175v0.f6990b.f20524c;
        }
        return -1;
    }

    public final long z1(D1.D d10, InterfaceC2611D.b bVar, long j10) {
        d10.h(bVar.f20522a, this.f7160o);
        return j10 + this.f7160o.n();
    }
}
