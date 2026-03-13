package M1;

import D1.C0744b;
import D1.C0745c;
import E1.e;
import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import G1.M;
import K1.InterfaceC1032y;
import K7.AbstractC1081v;
import K7.Y;
import L1.B0;
import M1.C1199b;
import M1.E;
import M1.s;
import M1.u;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.AbstractC4322b;
import i2.AbstractC4323c;
import i2.AbstractC4335o;
import i2.AbstractC4338s;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B implements s {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static boolean f8905q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Object f8906r0 = new Object();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static ScheduledExecutorService f8907s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f8908t0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1198a f8909A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1199b f8910B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public l f8911C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0744b f8912D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public k f8913E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public k f8914F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public D1.y f8915G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f8916H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ByteBuffer f8917I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f8918J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f8919K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f8920L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f8921M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f8922N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f8923O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f8924P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f8925Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f8926R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f8927S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ByteBuffer f8928T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f8929U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ByteBuffer f8930V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f8931W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f8932X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f8933Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f8934Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8935a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f8936a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E1.f f8937b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f8938b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8939c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f8940c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f8941d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C0745c f8942d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L f8943e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C1200c f8944e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E1.j f8945f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f8946f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K f8947g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f8948g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1081v f8949h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f8950h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f8951i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f8952i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque f8953j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f8954j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8955k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Looper f8956k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8957l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f8958l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f8959m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f8960m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f8961n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Handler f8962n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f8963o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Context f8964o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f8965p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f8966p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f8967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1032y.a f8968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f8969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B0 f8971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s.d f8972v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f8973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f8974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public E1.d f8975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AudioTrack f8976z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public static long a(AudioTrack audioTrack, h hVar) {
            return hVar.f8992c == 0 ? hVar.d(audioTrack.getBufferSizeInFrames()) : M.d1(audioTrack.getBufferSizeInFrames(), 1000000L, B.Y(hVar.f8996g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, C1200c c1200c) {
            audioTrack.setPreferredDevice(c1200c == null ? null : c1200c.f9105a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public static void a(AudioTrack audioTrack, B0 b02) {
            LogSessionId logSessionIdA = b02.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        C1201d a(D1.o oVar, C0744b c0744b);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f8977a = new E.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f8978a = new F();

        AudioTrack a(s.a aVar, C0744b c0744b, int i10, Context context);

        default int b(int i10) {
            return M.M(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.o f8990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8995f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8996g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8997h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final E1.d f8998i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f8999j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f9000k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f9001l;

        public h(D1.o oVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, E1.d dVar, boolean z10, boolean z11, boolean z12) {
            this.f8990a = oVar;
            this.f8991b = i10;
            this.f8992c = i11;
            this.f8993d = i12;
            this.f8994e = i13;
            this.f8995f = i14;
            this.f8996g = i15;
            this.f8997h = i16;
            this.f8998i = dVar;
            this.f8999j = z10;
            this.f9000k = z11;
            this.f9001l = z12;
        }

        public s.a a() {
            return new s.a(this.f8996g, this.f8994e, this.f8995f, this.f9001l, this.f8992c == 1, this.f8997h);
        }

        public boolean b(h hVar) {
            return hVar.f8992c == this.f8992c && hVar.f8996g == this.f8996g && hVar.f8994e == this.f8994e && hVar.f8995f == this.f8995f && hVar.f8993d == this.f8993d && hVar.f8999j == this.f8999j && hVar.f9000k == this.f9000k;
        }

        public h c(int i10) {
            return new h(this.f8990a, this.f8991b, this.f8992c, this.f8993d, this.f8994e, this.f8995f, this.f8996g, i10, this.f8998i, this.f8999j, this.f9000k, this.f9001l);
        }

        public long d(long j10) {
            return M.Z0(j10, this.f8994e);
        }

        public long e(long j10) {
            return M.Z0(j10, this.f8990a.f1781H);
        }

        public boolean f() {
            return this.f8992c == 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i implements E1.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E1.e[] f9002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J f9003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final E1.i f9004c;

        public i(E1.e... eVarArr) {
            this(eVarArr, new J(), new E1.i());
        }

        @Override // E1.f
        public long a(long j10) {
            return this.f9004c.c() ? this.f9004c.h(j10) : j10;
        }

        @Override // E1.f
        public E1.e[] b() {
            return this.f9002a;
        }

        @Override // E1.f
        public long c() {
            return this.f9003b.u();
        }

        @Override // E1.f
        public boolean d(boolean z10) {
            this.f9003b.D(z10);
            return z10;
        }

        @Override // E1.f
        public D1.y e(D1.y yVar) {
            this.f9004c.j(yVar.f2119a);
            this.f9004c.i(yVar.f2120b);
            return yVar;
        }

        public i(E1.e[] eVarArr, J j10, E1.i iVar) {
            E1.e[] eVarArr2 = new E1.e[eVarArr.length + 2];
            this.f9002a = eVarArr2;
            System.arraycopy(eVarArr, 0, eVarArr2, 0, eVarArr.length);
            this.f9003b = j10;
            this.f9004c = iVar;
            eVarArr2[eVarArr.length] = j10;
            eVarArr2[eVarArr.length + 1] = iVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends RuntimeException {
        public j(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.y f9005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9008d;

        public k(D1.y yVar, long j10, long j11) {
            this.f9005a = yVar;
            this.f9006b = j10;
            this.f9007c = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f9009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1199b f9010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AudioRouting.OnRoutingChangedListener f9011c = new AudioRouting.OnRoutingChangedListener() { // from class: M1.C
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f9021a.b(audioRouting);
            }
        };

        public l(AudioTrack audioTrack, C1199b c1199b) {
            this.f9009a = audioTrack;
            this.f9010b = c1199b;
            audioTrack.addOnRoutingChangedListener(this.f9011c, new Handler(Looper.myLooper()));
        }

        public final void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f9011c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f9010b.j(routedDevice);
        }

        public void c() {
            this.f9009a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) AbstractC0853a.e(this.f9011c));
            this.f9011c = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Exception f9012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9013b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f9014c = -9223372036854775807L;

        public void a() {
            this.f9012a = null;
            this.f9013b = -9223372036854775807L;
            this.f9014c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f9012a == null) {
                return false;
            }
            return B.c0() || SystemClock.elapsedRealtime() < this.f9014c;
        }

        public void c(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f9012a == null) {
                this.f9012a = exc;
            }
            if (this.f9013b == -9223372036854775807L && !B.c0()) {
                this.f9013b = 200 + jElapsedRealtime;
            }
            long j10 = this.f9013b;
            if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
                this.f9014c = jElapsedRealtime + 50;
                return;
            }
            Exception exc2 = this.f9012a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f9012a;
            a();
            throw exc3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class n implements u.a {
        public n() {
        }

        @Override // M1.u.a
        public void a(int i10, long j10) {
            if (B.this.f8972v != null) {
                B.this.f8972v.g(i10, j10, SystemClock.elapsedRealtime() - B.this.f8950h0);
            }
        }

        @Override // M1.u.a
        public void b(long j10) {
            G1.t.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // M1.u.a
        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + B.this.Z() + ", " + B.this.a0();
            if (B.f8905q0) {
                throw new j(str);
            }
            G1.t.h("DefaultAudioSink", str);
        }

        @Override // M1.u.a
        public void d(long j10) {
            if (B.this.f8972v != null) {
                B.this.f8972v.d(j10);
            }
        }

        @Override // M1.u.a
        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + B.this.Z() + ", " + B.this.a0();
            if (B.f8905q0) {
                throw new j(str);
            }
            G1.t.h("DefaultAudioSink", str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9016a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTrack.StreamEventCallback f9017b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends AudioTrack.StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ B f9019a;

            public a(B b10) {
                this.f9019a = b10;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(B.this.f8976z) && B.this.f8972v != null && B.this.f8934Z) {
                    B.this.f8972v.j();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(B.this.f8976z)) {
                    B.this.f8933Y = true;
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(B.this.f8976z) && B.this.f8972v != null && B.this.f8934Z) {
                    B.this.f8972v.j();
                }
            }
        }

        public o() {
            this.f9017b = new a(B.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f9016a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new D(handler), this.f9017b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f9017b);
            this.f9016a.removeCallbacksAndMessages(null);
        }
    }

    public static /* synthetic */ void C(AudioTrack audioTrack, final s.d dVar, Handler handler, final s.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: M1.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(aVar);
                    }
                });
            }
            synchronized (f8906r0) {
                try {
                    int i10 = f8908t0 - 1;
                    f8908t0 = i10;
                    if (i10 == 0) {
                        f8907s0.shutdown();
                        f8907s0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: M1.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(aVar);
                    }
                });
            }
            synchronized (f8906r0) {
                try {
                    int i11 = f8908t0 - 1;
                    f8908t0 = i11;
                    if (i11 == 0) {
                        f8907s0.shutdown();
                        f8907s0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static int U(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        AbstractC0853a.g(minBufferSize != -2);
        return minBufferSize;
    }

    public static int V(Context context) {
        int deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    public static int W(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return i2.H.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = i2.F.m(M.P(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return RecognitionOptions.UPC_E;
                case 11:
                case 12:
                    return RecognitionOptions.PDF417;
                default:
                    switch (i10) {
                        case 14:
                            int iB = AbstractC4322b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return AbstractC4322b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return RecognitionOptions.UPC_E;
                        case 17:
                            return AbstractC4323c.f(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
                    break;
            }
            return AbstractC4322b.e(byteBuffer);
        }
        return AbstractC4335o.f(byteBuffer);
    }

    public static String X(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    public static int Y(int i10) {
        int iB = AbstractC4338s.b(i10);
        AbstractC0853a.g(iB != -2147483647);
        return iB;
    }

    public static boolean c0() {
        boolean z10;
        synchronized (f8906r0) {
            z10 = f8908t0 > 0;
        }
        return z10;
    }

    public static boolean e0(int i10) {
        return i10 == -6 || i10 == -32;
    }

    public static boolean g0(AudioTrack audioTrack) {
        return audioTrack.isOffloadedPlayback();
    }

    public static void p0(final AudioTrack audioTrack, final s.d dVar, final s.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f8906r0) {
            try {
                if (f8907s0 == null) {
                    f8907s0 = M.O0("ExoPlayer:AudioTrackReleaseThread");
                }
                f8908t0++;
                f8907s0.schedule(new Runnable() { // from class: M1.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.C(audioTrack, dVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int z0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    public final int A0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
    }

    public final void M(long j10) {
        D1.y yVarE;
        if (y0()) {
            yVarE = D1.y.f2116d;
        } else {
            yVarE = w0() ? this.f8937b.e(this.f8915G) : D1.y.f2116d;
            this.f8915G = yVarE;
        }
        D1.y yVar = yVarE;
        this.f8916H = w0() ? this.f8937b.d(this.f8916H) : false;
        this.f8953j.add(new k(yVar, Math.max(0L, j10), this.f8974x.d(a0())));
        v0();
        s.d dVar = this.f8972v;
        if (dVar != null) {
            dVar.onSkipSilenceEnabledChanged(this.f8916H);
        }
    }

    public final long N(long j10) {
        while (!this.f8953j.isEmpty() && j10 >= ((k) this.f8953j.getFirst()).f9007c) {
            this.f8914F = (k) this.f8953j.remove();
        }
        k kVar = this.f8914F;
        long j11 = j10 - kVar.f9007c;
        long jG0 = M.g0(j11, kVar.f9005a.f2119a);
        if (!this.f8953j.isEmpty()) {
            k kVar2 = this.f8914F;
            return kVar2.f9006b + jG0 + kVar2.f9008d;
        }
        long jA = this.f8937b.a(j11);
        k kVar3 = this.f8914F;
        long j12 = kVar3.f9006b + jA;
        kVar3.f9008d = jA - jG0;
        return j12;
    }

    public final long O(long j10) {
        long jC = this.f8937b.c();
        long jD = j10 + this.f8974x.d(jC);
        long j11 = this.f8958l0;
        if (jC > j11) {
            long jD2 = this.f8974x.d(jC - j11);
            this.f8958l0 = jC;
            b0(jD2);
        }
        return jD;
    }

    public final AudioTrack P(s.a aVar, C0744b c0744b, int i10, D1.o oVar, Context context) throws s.c {
        try {
            AudioTrack audioTrackA = this.f8969s.a(aVar, c0744b, i10, context);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new s.c(state, aVar.f9147b, aVar.f9148c, aVar.f9146a, aVar.f9151f, oVar, aVar.f9150e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new s.c(0, aVar.f9147b, aVar.f9148c, aVar.f9146a, aVar.f9151f, oVar, aVar.f9150e, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.AudioTrack Q(M1.B.h r9) throws M1.s.c {
        /*
            r8 = this;
            int r0 = r8.f8938b0     // Catch: M1.s.c -> L46
            int r1 = r8.f8970t     // Catch: M1.s.c -> L46
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.f8935a     // Catch: M1.s.c -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: M1.s.c -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.f8964o0     // Catch: M1.s.c -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = r2.createDeviceContext(r1)     // Catch: M1.s.c -> L1c
            r8.f8964o0 = r0     // Catch: M1.s.c -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L49
        L20:
            android.content.Context r0 = r8.f8964o0     // Catch: M1.s.c -> L1c
            r1 = 0
            r7 = r0
            r5 = r1
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            M1.s$a r3 = r9.a()     // Catch: M1.s.c -> L46
            D1.b r4 = r8.f8912D     // Catch: M1.s.c -> L46
            D1.o r6 = r9.f8990a     // Catch: M1.s.c -> L46
            r2 = r8
            android.media.AudioTrack r8 = r2.P(r3, r4, r5, r6, r7)     // Catch: M1.s.c -> L42
            K1.y$a r9 = r2.f8968r     // Catch: M1.s.c -> L42
            if (r9 == 0) goto L45
            boolean r0 = g0(r8)     // Catch: M1.s.c -> L42
            r9.w(r0)     // Catch: M1.s.c -> L42
            return r8
        L42:
            r0 = move-exception
        L43:
            r9 = r0
            goto L49
        L45:
            return r8
        L46:
            r0 = move-exception
            r2 = r8
            goto L43
        L49:
            M1.s$d r8 = r2.f8972v
            if (r8 == 0) goto L50
            r8.a(r9)
        L50:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.B.Q(M1.B$h):android.media.AudioTrack");
    }

    public final AudioTrack R() throws s.c {
        try {
            return Q((h) AbstractC0853a.e(this.f8974x));
        } catch (s.c e10) {
            h hVar = this.f8974x;
            if (hVar.f8997h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackQ = this.Q(hVarC);
                    this.f8974x = hVarC;
                    return audioTrackQ;
                } catch (s.c e11) {
                    e10.addSuppressed(e11);
                    this.h0();
                    throw e10;
                }
            }
            this.h0();
            throw e10;
        }
    }

    public final void S(long j10) throws Exception {
        B b10;
        int iZ0;
        s.d dVar;
        if (this.f8930V == null || this.f8963o.b()) {
            return;
        }
        int iRemaining = this.f8930V.remaining();
        if (this.f8946f0) {
            AbstractC0853a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f8948g0;
            } else {
                this.f8948g0 = j10;
            }
            b10 = this;
            iZ0 = b10.A0(this.f8976z, this.f8930V, iRemaining, j10);
        } else {
            b10 = this;
            iZ0 = z0(b10.f8976z, b10.f8930V, iRemaining);
        }
        b10.f8950h0 = SystemClock.elapsedRealtime();
        if (iZ0 < 0) {
            if (e0(iZ0)) {
                if (b10.a0() > 0) {
                    z = true;
                } else if (g0(b10.f8976z)) {
                    b10.h0();
                    z = true;
                }
            }
            s.f fVar = new s.f(iZ0, b10.f8974x.f8990a, z);
            s.d dVar2 = b10.f8972v;
            if (dVar2 != null) {
                dVar2.a(fVar);
            }
            if (!fVar.f9159b || b10.f8935a == null) {
                b10.f8963o.c(fVar);
                return;
            }
            C1198a c1198a = C1198a.f9081c;
            b10.f8909A = c1198a;
            b10.f8910B.g(c1198a);
            throw fVar;
        }
        b10.f8963o.a();
        if (g0(b10.f8976z)) {
            if (b10.f8922N > 0) {
                b10.f8954j0 = false;
            }
            if (b10.f8934Z && (dVar = b10.f8972v) != null && iZ0 < iRemaining && !b10.f8954j0) {
                dVar.f();
            }
        }
        int i10 = b10.f8974x.f8992c;
        if (i10 == 0) {
            b10.f8921M += (long) iZ0;
        }
        if (iZ0 == iRemaining) {
            if (i10 != 0) {
                AbstractC0853a.g(b10.f8930V == b10.f8928T);
                b10.f8922N += ((long) b10.f8923O) * ((long) b10.f8929U);
            }
            b10.f8930V = null;
        }
    }

    public final boolean T() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f8975y.f()) {
            S(Long.MIN_VALUE);
            return this.f8930V == null;
        }
        this.f8975y.h();
        n0(Long.MIN_VALUE);
        return this.f8975y.e() && ((byteBuffer = this.f8930V) == null || !byteBuffer.hasRemaining());
    }

    public final long Z() {
        h hVar = this.f8974x;
        return hVar.f8992c == 0 ? this.f8919K / ((long) hVar.f8991b) : this.f8920L;
    }

    @Override // M1.s
    public boolean a(D1.o oVar) {
        return i(oVar) != 0;
    }

    public final long a0() {
        return this.f8974x.f8992c == 0 ? M.l(this.f8921M, r0.f8993d) : this.f8922N;
    }

    @Override // M1.s
    public boolean b() {
        if (f0()) {
            return this.f8931W && !f();
        }
        return true;
    }

    public final void b0(long j10) {
        this.f8960m0 += j10;
        if (this.f8962n0 == null) {
            this.f8962n0 = new Handler(Looper.myLooper());
        }
        this.f8962n0.removeCallbacksAndMessages(null);
        this.f8962n0.postDelayed(new Runnable() { // from class: M1.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f9221a.j0();
            }
        }, 100L);
    }

    @Override // M1.s
    public void c(C0745c c0745c) {
        if (this.f8942d0.equals(c0745c)) {
            return;
        }
        int i10 = c0745c.f1681a;
        float f10 = c0745c.f1682b;
        AudioTrack audioTrack = this.f8976z;
        if (audioTrack != null) {
            if (this.f8942d0.f1681a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f8976z.setAuxEffectSendLevel(f10);
            }
        }
        this.f8942d0 = c0745c;
    }

    @Override // M1.s
    public void d(D1.y yVar) {
        this.f8915G = new D1.y(M.n(yVar.f2119a, 0.1f, 8.0f), M.n(yVar.f2120b, 0.1f, 8.0f));
        if (y0()) {
            s0();
        } else {
            r0(yVar);
        }
    }

    public final boolean d0() throws s.c {
        if (this.f8961n.b()) {
            return false;
        }
        AudioTrack audioTrackR = R();
        this.f8976z = audioTrackR;
        if (g0(audioTrackR)) {
            o0(this.f8976z);
            h hVar = this.f8974x;
            if (hVar.f9000k) {
                AudioTrack audioTrack = this.f8976z;
                D1.o oVar = hVar.f8990a;
                audioTrack.setOffloadDelayPadding(oVar.f1783J, oVar.f1784K);
            }
        }
        B0 b02 = this.f8971u;
        if (b02 != null) {
            c.a(this.f8976z, b02);
        }
        u uVar = this.f8951i;
        AudioTrack audioTrack2 = this.f8976z;
        h hVar2 = this.f8974x;
        uVar.u(audioTrack2, hVar2.f8992c == 2, hVar2.f8996g, hVar2.f8993d, hVar2.f8997h, this.f8966p0);
        u0();
        int i10 = this.f8942d0.f1681a;
        if (i10 != 0) {
            this.f8976z.attachAuxEffect(i10);
            this.f8976z.setAuxEffectSendLevel(this.f8942d0.f1682b);
        }
        C1200c c1200c = this.f8944e0;
        if (c1200c != null) {
            b.b(this.f8976z, c1200c);
            C1199b c1199b = this.f8910B;
            if (c1199b != null) {
                c1199b.j(this.f8944e0.f9105a);
            }
        }
        C1199b c1199b2 = this.f8910B;
        if (c1199b2 != null) {
            this.f8911C = new l(this.f8976z, c1199b2);
        }
        this.f8925Q = true;
        int audioSessionId = this.f8976z.getAudioSessionId();
        boolean z10 = audioSessionId != this.f8938b0;
        this.f8938b0 = audioSessionId;
        s.d dVar = this.f8972v;
        if (dVar != null) {
            dVar.b(this.f8974x.a());
            if (z10) {
                this.f8940c0 = true;
                this.f8972v.onAudioSessionIdChanged(this.f8938b0);
            }
        }
        return true;
    }

    @Override // M1.s
    public D1.y e() {
        return this.f8915G;
    }

    @Override // M1.s
    public boolean f() {
        if (f0()) {
            return !(this.f8976z.isOffloadedPlayback() && this.f8933Y) && this.f8951i.j(a0());
        }
        return false;
    }

    public final boolean f0() {
        return this.f8976z != null;
    }

    @Override // M1.s
    public void flush() {
        if (f0()) {
            q0();
            if (this.f8951i.k()) {
                this.f8976z.pause();
            }
            if (g0(this.f8976z)) {
                ((o) AbstractC0853a.e(this.f8959m)).b(this.f8976z);
            }
            s.a aVarA = this.f8974x.a();
            h hVar = this.f8973w;
            if (hVar != null) {
                this.f8974x = hVar;
                this.f8973w = null;
            }
            this.f8951i.s();
            l lVar = this.f8911C;
            if (lVar != null) {
                lVar.c();
                this.f8911C = null;
            }
            p0(this.f8976z, this.f8972v, aVarA);
            this.f8976z = null;
        }
        this.f8963o.a();
        this.f8961n.a();
        this.f8958l0 = 0L;
        this.f8960m0 = 0L;
        Handler handler = this.f8962n0;
        if (handler != null) {
            ((Handler) AbstractC0853a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // M1.s
    public void g(int i10) {
        if (this.f8940c0) {
            if (this.f8938b0 != i10) {
                return;
            } else {
                this.f8940c0 = false;
            }
        }
        if (this.f8938b0 != i10) {
            this.f8938b0 = i10;
            this.f8936a0 = i10 != 0;
            flush();
        }
    }

    @Override // M1.s
    public long h() {
        if (f0()) {
            return b.a(this.f8976z, this.f8974x);
        }
        return -9223372036854775807L;
    }

    public final void h0() {
        if (this.f8974x.f()) {
            this.f8952i0 = true;
        }
    }

    @Override // M1.s
    public int i(D1.o oVar) {
        k0();
        if (!"audio/raw".equals(oVar.f1805o)) {
            return this.f8909A.j(oVar, this.f8912D) ? 2 : 0;
        }
        if (M.D0(oVar.f1782I)) {
            int i10 = oVar.f1782I;
            return (i10 == 2 || (this.f8939c && i10 == 4)) ? 2 : 1;
        }
        G1.t.h("DefaultAudioSink", "Invalid PCM encoding: " + oVar.f1782I);
        return 0;
    }

    public final ByteBuffer i0(ByteBuffer byteBuffer) {
        if (this.f8974x.f8992c == 0) {
            int iE = (int) M.E(M.M0(20L), this.f8974x.f8994e);
            long jA0 = a0();
            if (jA0 < iE) {
                h hVar = this.f8974x;
                return I.a(byteBuffer, hVar.f8996g, hVar.f8993d, (int) jA0, iE);
            }
        }
        return byteBuffer;
    }

    @Override // M1.s
    public void j(int i10) {
        AbstractC0853a.g(true);
        this.f8957l = i10;
    }

    public final void j0() {
        if (this.f8960m0 >= 300000) {
            this.f8972v.e();
            this.f8960m0 = 0L;
        }
    }

    @Override // M1.s
    public void k() {
        if (this.f8946f0) {
            this.f8946f0 = false;
            flush();
        }
    }

    public final void k0() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0853a.h(this.f8910B == null || this.f8956k0 == looperMyLooper, "DefaultAudioSink accessed on multiple threads: " + X(this.f8956k0) + " and " + X(looperMyLooper));
        if (this.f8910B == null && (context = this.f8935a) != null) {
            this.f8956k0 = looperMyLooper;
            C1199b c1199b = new C1199b(context, new C1199b.f() { // from class: M1.y
                @Override // M1.C1199b.f
                public final void a(C1198a c1198a) {
                    this.f9220a.l0(c1198a);
                }
            }, this.f8912D, this.f8944e0);
            this.f8910B = c1199b;
            this.f8909A = c1199b.h();
        }
        AbstractC0853a.e(this.f8909A);
    }

    @Override // M1.s
    public void l(D1.o oVar, int i10, int[] iArr) throws s.b {
        int i11;
        boolean z10;
        E1.d dVar;
        int i12;
        int i13;
        int iL0;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int iA;
        k0();
        if ("audio/raw".equals(oVar.f1805o)) {
            AbstractC0853a.a(M.D0(oVar.f1782I));
            int iL02 = M.l0(oVar.f1782I, oVar.f1780G);
            AbstractC1081v.a aVar = new AbstractC1081v.a();
            aVar.j(this.f8949h);
            if (x0(oVar.f1782I)) {
                aVar.a(this.f8947g);
            } else {
                aVar.a(this.f8945f);
                aVar.i(this.f8937b.b());
            }
            E1.d dVar2 = new E1.d(aVar.k());
            if (dVar2.equals(this.f8975y)) {
                dVar2 = this.f8975y;
            }
            this.f8943e.o(oVar.f1783J, oVar.f1784K);
            this.f8941d.m(iArr);
            try {
                e.a aVarA = dVar2.a(new e.a(oVar));
                int i17 = aVarA.f3196c;
                i11 = aVarA.f3194a;
                int iB = this.f8969s.b(aVarA.f3195b);
                iL0 = M.l0(i17, aVarA.f3195b);
                z10 = this.f8955k;
                dVar = dVar2;
                i12 = iB;
                i13 = 0;
                i14 = i17;
                i15 = iL02;
                z11 = false;
            } catch (e.b e10) {
                throw new s.b(e10, oVar);
            }
        } else {
            E1.d dVar3 = new E1.d(AbstractC1081v.z());
            i11 = oVar.f1781H;
            C1201d c1201dN = this.f8957l != 0 ? n(oVar) : C1201d.f9106d;
            if (this.f8957l == 0 || !c1201dN.f9107a) {
                Pair pairH = this.f8909A.h(oVar, this.f8912D);
                if (pairH == null) {
                    throw new s.b("Unable to configure passthrough for: " + oVar, oVar);
                }
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH.second).intValue();
                z10 = this.f8955k;
                dVar = dVar3;
                i12 = iIntValue2;
                i13 = 2;
                iL0 = -1;
                z11 = false;
                i14 = iIntValue;
            } else {
                int iF = D1.v.f((String) AbstractC0853a.e(oVar.f1805o), oVar.f1801k);
                int iB2 = this.f8969s.b(oVar.f1780G);
                z11 = c1201dN.f9108b;
                dVar = dVar3;
                i12 = iB2;
                z10 = true;
                i13 = 1;
                iL0 = -1;
                i14 = iF;
            }
            i15 = iL0;
        }
        if (i14 == 0) {
            throw new s.b("Invalid output encoding (mode=" + i13 + ") for: " + oVar, oVar);
        }
        if (i12 == 0) {
            throw new s.b("Invalid output channel config (mode=" + i13 + ") for: " + oVar, oVar);
        }
        int i18 = oVar.f1800j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(oVar.f1805o) && i18 == -1) {
            i18 = 768000;
        }
        int i19 = i18;
        if (i10 != 0) {
            i16 = i11;
            iA = i10;
        } else {
            i16 = i11;
            iA = this.f8965p.a(U(i11, i12, i14), i14, i13, iL0 != -1 ? iL0 : 1, i16, i19, z10 ? 8.0d : 1.0d);
        }
        this.f8952i0 = false;
        h hVar = new h(oVar, i15, i13, iL0, i16, i12, i14, iA, dVar, z10, z11, this.f8946f0);
        if (f0()) {
            this.f8973w = hVar;
        } else {
            this.f8974x = hVar;
        }
    }

    public void l0(C1198a c1198a) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0853a.h(this.f8956k0 == looperMyLooper, "Current looper (" + X(looperMyLooper) + ") is not the playback looper (" + X(this.f8956k0) + ")");
        C1198a c1198a2 = this.f8909A;
        if (c1198a2 == null || c1198a.equals(c1198a2)) {
            return;
        }
        this.f8909A = c1198a;
        s.d dVar = this.f8972v;
        if (dVar != null) {
            dVar.h();
        }
    }

    @Override // M1.s
    public void m(B0 b02) {
        this.f8971u = b02;
    }

    public final void m0() {
        if (this.f8932X) {
            return;
        }
        this.f8932X = true;
        this.f8951i.h(a0());
        if (g0(this.f8976z)) {
            this.f8933Y = false;
        }
        this.f8976z.stop();
        this.f8918J = 0;
    }

    @Override // M1.s
    public C1201d n(D1.o oVar) {
        return this.f8952i0 ? C1201d.f9106d : this.f8967q.a(oVar, this.f8912D);
    }

    public final void n0(long j10) throws Exception {
        S(j10);
        if (this.f8930V != null) {
            return;
        }
        if (!this.f8975y.f()) {
            ByteBuffer byteBuffer = this.f8928T;
            if (byteBuffer != null) {
                t0(byteBuffer);
                S(j10);
                return;
            }
            return;
        }
        while (!this.f8975y.e()) {
            do {
                ByteBuffer byteBufferD = this.f8975y.d();
                if (byteBufferD.hasRemaining()) {
                    t0(byteBufferD);
                    S(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.f8928T;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f8975y.i(this.f8928T);
                    }
                }
            } while (this.f8930V == null);
            return;
        }
    }

    @Override // M1.s
    public boolean o(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.f8928T;
        AbstractC0853a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f8973w != null) {
            if (!T()) {
                return false;
            }
            if (this.f8973w.b(this.f8974x)) {
                this.f8974x = this.f8973w;
                this.f8973w = null;
                AudioTrack audioTrack = this.f8976z;
                if (audioTrack != null && g0(audioTrack) && this.f8974x.f9000k) {
                    if (this.f8976z.getPlayState() == 3) {
                        this.f8976z.setOffloadEndOfStream();
                        this.f8951i.a();
                    }
                    AudioTrack audioTrack2 = this.f8976z;
                    D1.o oVar = this.f8974x.f8990a;
                    audioTrack2.setOffloadDelayPadding(oVar.f1783J, oVar.f1784K);
                    this.f8954j0 = true;
                }
            } else {
                m0();
                if (f()) {
                    return false;
                }
                flush();
            }
            M(j10);
        }
        if (!f0()) {
            try {
                if (!d0()) {
                    return false;
                }
            } catch (s.c e10) {
                if (e10.f9154b) {
                    throw e10;
                }
                this.f8961n.c(e10);
                return false;
            }
        }
        this.f8961n.a();
        if (this.f8925Q) {
            this.f8926R = Math.max(0L, j10);
            this.f8924P = false;
            this.f8925Q = false;
            if (y0()) {
                s0();
            }
            M(j10);
            if (this.f8934Z) {
                play();
            }
        }
        if (!this.f8951i.m(a0())) {
            return false;
        }
        if (this.f8928T == null) {
            AbstractC0853a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f8974x;
            if (hVar.f8992c != 0 && this.f8923O == 0) {
                int iW = W(hVar.f8996g, byteBuffer);
                this.f8923O = iW;
                if (iW == 0) {
                    return true;
                }
            }
            if (this.f8913E != null) {
                if (!T()) {
                    return false;
                }
                M(j10);
                this.f8913E = null;
            }
            long jE = this.f8926R + this.f8974x.e(Z() - this.f8943e.m());
            if (!this.f8924P && Math.abs(jE - j10) > 200000) {
                s.d dVar = this.f8972v;
                if (dVar != null) {
                    dVar.a(new s.e(j10, jE));
                }
                this.f8924P = true;
            }
            if (this.f8924P) {
                if (!T()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.f8926R += j11;
                this.f8924P = false;
                M(j10);
                s.d dVar2 = this.f8972v;
                if (dVar2 != null && j11 != 0) {
                    dVar2.i();
                }
            }
            if (this.f8974x.f8992c == 0) {
                this.f8919K += (long) byteBuffer.remaining();
            } else {
                this.f8920L += ((long) this.f8923O) * ((long) i10);
            }
            this.f8928T = byteBuffer;
            this.f8929U = i10;
        }
        n0(j10);
        if (!this.f8928T.hasRemaining()) {
            this.f8928T = null;
            this.f8929U = 0;
            return true;
        }
        if (!this.f8951i.l(a0())) {
            return false;
        }
        G1.t.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    public final void o0(AudioTrack audioTrack) {
        if (this.f8959m == null) {
            this.f8959m = new o();
        }
        this.f8959m.a(audioTrack);
    }

    @Override // M1.s
    public void p() {
        if (!this.f8931W && f0() && T()) {
            m0();
            this.f8931W = true;
        }
    }

    @Override // M1.s
    public void pause() {
        this.f8934Z = false;
        if (f0()) {
            this.f8951i.r();
            if (!this.f8932X || g0(this.f8976z)) {
                this.f8976z.pause();
            }
        }
    }

    @Override // M1.s
    public void play() {
        this.f8934Z = true;
        if (f0()) {
            this.f8951i.x();
            if (!this.f8932X || g0(this.f8976z)) {
                this.f8976z.play();
            }
        }
    }

    @Override // M1.s
    public void q(C0744b c0744b) {
        if (this.f8912D.equals(c0744b)) {
            return;
        }
        this.f8912D = c0744b;
        if (this.f8946f0) {
            return;
        }
        C1199b c1199b = this.f8910B;
        if (c1199b != null) {
            c1199b.i(c0744b);
        }
        flush();
    }

    public final void q0() {
        this.f8919K = 0L;
        this.f8920L = 0L;
        this.f8921M = 0L;
        this.f8922N = 0L;
        this.f8954j0 = false;
        this.f8923O = 0;
        this.f8914F = new k(this.f8915G, 0L, 0L);
        this.f8926R = 0L;
        this.f8913E = null;
        this.f8953j.clear();
        this.f8928T = null;
        this.f8929U = 0;
        this.f8930V = null;
        this.f8932X = false;
        this.f8931W = false;
        this.f8933Y = false;
        this.f8917I = null;
        this.f8918J = 0;
        this.f8943e.n();
        v0();
    }

    @Override // M1.s
    public void r(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f8976z;
        if (audioTrack == null || !g0(audioTrack) || (hVar = this.f8974x) == null || !hVar.f9000k) {
            return;
        }
        this.f8976z.setOffloadDelayPadding(i10, i11);
    }

    public final void r0(D1.y yVar) {
        k kVar = new k(yVar, -9223372036854775807L, -9223372036854775807L);
        if (f0()) {
            this.f8913E = kVar;
        } else {
            this.f8914F = kVar;
        }
    }

    @Override // M1.s
    public void release() {
        C1199b c1199b = this.f8910B;
        if (c1199b != null) {
            c1199b.k();
        }
    }

    @Override // M1.s
    public void reset() {
        flush();
        Y it = this.f8949h.iterator();
        while (it.hasNext()) {
            ((E1.e) it.next()).reset();
        }
        this.f8945f.reset();
        this.f8947g.reset();
        E1.d dVar = this.f8975y;
        if (dVar != null) {
            dVar.j();
        }
        this.f8934Z = false;
        this.f8952i0 = false;
    }

    @Override // M1.s
    public long s(boolean z10) {
        if (!f0() || this.f8925Q) {
            return Long.MIN_VALUE;
        }
        return O(N(Math.min(this.f8951i.c(), this.f8974x.d(a0()))));
    }

    public final void s0() {
        if (f0()) {
            try {
                this.f8976z.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f8915G.f2119a).setPitch(this.f8915G.f2120b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                G1.t.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            D1.y yVar = new D1.y(this.f8976z.getPlaybackParams().getSpeed(), this.f8976z.getPlaybackParams().getPitch());
            this.f8915G = yVar;
            this.f8951i.v(yVar.f2119a);
        }
    }

    @Override // M1.s
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f8944e0 = audioDeviceInfo == null ? null : new C1200c(audioDeviceInfo);
        C1199b c1199b = this.f8910B;
        if (c1199b != null) {
            c1199b.j(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f8976z;
        if (audioTrack != null) {
            b.b(audioTrack, this.f8944e0);
        }
    }

    @Override // M1.s
    public void t(InterfaceC0860h interfaceC0860h) {
        this.f8951i.w(interfaceC0860h);
    }

    public final void t0(ByteBuffer byteBuffer) {
        AbstractC0853a.g(this.f8930V == null);
        if (byteBuffer.hasRemaining()) {
            this.f8930V = i0(byteBuffer);
        }
    }

    public final void u0() {
        if (f0()) {
            this.f8976z.setVolume(this.f8927S);
        }
    }

    @Override // M1.s
    public void v(float f10) {
        if (this.f8927S != f10) {
            this.f8927S = f10;
            u0();
        }
    }

    public final void v0() {
        E1.d dVar = this.f8974x.f8998i;
        this.f8975y = dVar;
        dVar.b();
    }

    @Override // M1.s
    public void w() {
        this.f8924P = true;
    }

    public final boolean w0() {
        if (this.f8946f0) {
            return false;
        }
        h hVar = this.f8974x;
        return hVar.f8992c == 0 && !x0(hVar.f8990a.f1782I);
    }

    @Override // M1.s
    public void x() {
        AbstractC0853a.g(this.f8936a0);
        if (this.f8946f0) {
            return;
        }
        this.f8946f0 = true;
        flush();
    }

    public final boolean x0(int i10) {
        return this.f8939c && M.C0(i10);
    }

    @Override // M1.s
    public void y(s.d dVar) {
        this.f8972v = dVar;
    }

    public final boolean y0() {
        h hVar = this.f8974x;
        return hVar != null && hVar.f8999j;
    }

    @Override // M1.s
    public void z(boolean z10) {
        this.f8916H = z10;
        r0(y0() ? D1.y.f2116d : this.f8915G);
    }

    public B(g gVar) {
        Context applicationContext = gVar.f8979a == null ? null : gVar.f8979a.getApplicationContext();
        this.f8935a = applicationContext;
        this.f8912D = C0744b.f1660h;
        this.f8909A = applicationContext != null ? null : gVar.f8980b;
        this.f8937b = gVar.f8981c;
        this.f8939c = gVar.f8982d;
        int i10 = Build.VERSION.SDK_INT;
        this.f8955k = gVar.f8983e;
        this.f8957l = 0;
        this.f8965p = gVar.f8985g;
        this.f8967q = (d) AbstractC0853a.e(gVar.f8987i);
        this.f8951i = new u(new n());
        v vVar = new v();
        this.f8941d = vVar;
        L l10 = new L();
        this.f8943e = l10;
        this.f8945f = new E1.j();
        this.f8947g = new K();
        this.f8949h = AbstractC1081v.B(l10, vVar);
        this.f8927S = 1.0f;
        this.f8938b0 = 0;
        this.f8942d0 = new C0745c(0, 0.0f);
        D1.y yVar = D1.y.f2116d;
        this.f8914F = new k(yVar, 0L, 0L);
        this.f8915G = yVar;
        this.f8916H = false;
        this.f8953j = new ArrayDeque();
        this.f8961n = new m();
        this.f8963o = new m();
        this.f8968r = gVar.f8989k;
        this.f8969s = gVar.f8986h;
        this.f8970t = (i10 < 34 || gVar.f8979a == null) ? -1 : V(gVar.f8979a);
        this.f8966p0 = gVar.f8988j;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1198a f8980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public E1.f f8981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e f8985g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f f8986h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f8987i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f8988j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public InterfaceC1032y.a f8989k;

        @Deprecated
        public g() {
            this.f8988j = true;
            this.f8979a = null;
            this.f8980b = C1198a.f9081c;
            this.f8985g = e.f8977a;
            this.f8986h = f.f8978a;
        }

        public B k() {
            AbstractC0853a.g(!this.f8984f);
            this.f8984f = true;
            if (this.f8981c == null) {
                this.f8981c = new i(new E1.e[0]);
            }
            if (this.f8987i == null) {
                this.f8987i = new w(this.f8979a);
            }
            return new B(this);
        }

        public g l(boolean z10) {
            this.f8983e = z10;
            return this;
        }

        public g m(boolean z10) {
            this.f8982d = z10;
            return this;
        }

        public g(Context context) {
            this.f8988j = true;
            this.f8979a = context;
            this.f8980b = C1198a.f9081c;
            this.f8985g = e.f8977a;
            this.f8986h = f.f8978a;
        }
    }
}
