package g2;

import G1.AbstractC0853a;
import G1.M;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f35333a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f35334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f35335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f35337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f35344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f35345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f35346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f35347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f35348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f35349q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                G1.t.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f35352f = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f35353a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f35354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HandlerThread f35355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Choreographer f35356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35357e;

        public c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f35355c = handlerThread;
            handlerThread.start();
            Handler handlerY = M.y(handlerThread.getLooper(), this);
            this.f35354b = handlerY;
            handlerY.sendEmptyMessage(1);
        }

        public static c d() {
            return f35352f;
        }

        public void a() {
            this.f35354b.sendEmptyMessage(2);
        }

        public final void b() {
            Choreographer choreographer = this.f35356d;
            if (choreographer != null) {
                int i10 = this.f35357e + 1;
                this.f35357e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.f35356d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                G1.t.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f35353a = j10;
            ((Choreographer) AbstractC0853a.e(this.f35356d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f35354b.sendEmptyMessage(3);
        }

        public final void f() {
            Choreographer choreographer = this.f35356d;
            if (choreographer != null) {
                int i10 = this.f35357e - 1;
                this.f35357e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f35353a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public u(Context context) {
        b bVarF = f(context);
        this.f35334b = bVarF;
        this.f35335c = bVarF != null ? c.d() : null;
        this.f35343k = -9223372036854775807L;
        this.f35344l = -9223372036854775807L;
        this.f35338f = -1.0f;
        this.f35341i = 1.0f;
        this.f35342j = 0;
    }

    public static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    public long b(long j10) {
        long j11;
        if (this.f35348p == -1 || !this.f35333a.e()) {
            j11 = j10;
        } else {
            long jA = this.f35349q + ((long) ((this.f35333a.a() * (this.f35345m - this.f35348p)) / this.f35341i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f35346n = this.f35345m;
        this.f35347o = j11;
        c cVar = this.f35335c;
        if (cVar != null && this.f35343k != -9223372036854775807L) {
            long j12 = cVar.f35353a;
            if (j12 != -9223372036854775807L) {
                return e(j11, j12, this.f35343k) - this.f35344l;
            }
        }
        return j11;
    }

    public final void d() {
        Surface surface = this.f35337e;
        if (surface == null || this.f35342j == Integer.MIN_VALUE || this.f35340h == 0.0f) {
            return;
        }
        this.f35340h = 0.0f;
        a.a(surface, 0.0f);
    }

    public final b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    public void g(float f10) {
        this.f35338f = f10;
        this.f35333a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f35346n;
        if (j11 != -1) {
            this.f35348p = j11;
            this.f35349q = this.f35347o;
        }
        this.f35345m++;
        this.f35333a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f35341i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f35336d = true;
        n();
        if (this.f35334b != null) {
            ((c) AbstractC0853a.e(this.f35335c)).a();
            this.f35334b.b();
        }
        r(false);
    }

    public void l() {
        this.f35336d = false;
        b bVar = this.f35334b;
        if (bVar != null) {
            bVar.c();
            ((c) AbstractC0853a.e(this.f35335c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f35337e == surface) {
            return;
        }
        d();
        this.f35337e = surface;
        r(true);
    }

    public final void n() {
        this.f35345m = 0L;
        this.f35348p = -1L;
        this.f35346n = -1L;
    }

    public void o(int i10) {
        if (this.f35342j == i10) {
            return;
        }
        this.f35342j = i10;
        r(true);
    }

    public final void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f35343k = refreshRate;
            this.f35344l = (refreshRate * 80) / 100;
        } else {
            G1.t.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f35343k = -9223372036854775807L;
            this.f35344l = -9223372036854775807L;
        }
    }

    public final void q() {
        if (this.f35337e == null) {
            return;
        }
        float fB = this.f35333a.e() ? this.f35333a.b() : this.f35338f;
        float f10 = this.f35339g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f35339g) < ((!this.f35333a.e() || this.f35333a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f35333a.c() < 30) {
            return;
        }
        this.f35339g = fB;
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(boolean r4) {
        /*
            r3 = this;
            android.view.Surface r0 = r3.f35337e
            if (r0 == 0) goto L2a
            int r1 = r3.f35342j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto Lb
            goto L2a
        Lb:
            boolean r1 = r3.f35336d
            if (r1 == 0) goto L1b
            float r1 = r3.f35339g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L1b
            float r2 = r3.f35341i
            float r1 = r1 * r2
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r4 != 0) goto L25
            float r4 = r3.f35340h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            r3.f35340h = r1
            g2.u.a.a(r0, r1)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.u.r(boolean):void");
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayManager f35350a;

        public b(DisplayManager displayManager) {
            this.f35350a = displayManager;
        }

        public final Display a() {
            return this.f35350a.getDisplay(0);
        }

        public void b() {
            this.f35350a.registerDisplayListener(this, M.z());
            u.this.p(a());
        }

        public void c() {
            this.f35350a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                u.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
