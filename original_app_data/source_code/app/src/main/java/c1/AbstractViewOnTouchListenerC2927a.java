package c1;

import Y0.E;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: c1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2927a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f25523r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f25526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f25527d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25531h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25540q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0332a f25524a = new C0332a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f25525b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f25528e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f25529f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f25532i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f25533j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f25534k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0332a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f25543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f25544d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f25550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f25551k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25545e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f25549i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f25546f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25547g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25548h = 0;

        public void a() {
            if (this.f25546f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f25546f;
            this.f25546f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f25547g = (int) (this.f25543c * f10);
            this.f25548h = (int) (f10 * this.f25544d);
        }

        public int b() {
            return this.f25547g;
        }

        public int c() {
            return this.f25548h;
        }

        public int d() {
            float f10 = this.f25543c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            if (j10 < this.f25545e) {
                return 0.0f;
            }
            long j11 = this.f25549i;
            if (j11 < 0 || j10 < j11) {
                return AbstractViewOnTouchListenerC2927a.e((j10 - r0) / this.f25541a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f25550j;
            return (1.0f - f10) + (f10 * AbstractViewOnTouchListenerC2927a.e((j10 - j11) / this.f25551k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f25544d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f25549i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f25549i + ((long) this.f25551k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f25551k = AbstractViewOnTouchListenerC2927a.f((int) (jCurrentAnimationTimeMillis - this.f25545e), 0, this.f25542b);
            this.f25550j = e(jCurrentAnimationTimeMillis);
            this.f25549i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f25542b = i10;
        }

        public void k(int i10) {
            this.f25541a = i10;
        }

        public void l(float f10, float f11) {
            this.f25543c = f10;
            this.f25544d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f25545e = jCurrentAnimationTimeMillis;
            this.f25549i = -1L;
            this.f25546f = jCurrentAnimationTimeMillis;
            this.f25550j = 0.5f;
            this.f25547g = 0;
            this.f25548h = 0;
        }
    }

    /* JADX INFO: renamed from: c1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC2927a abstractViewOnTouchListenerC2927a = AbstractViewOnTouchListenerC2927a.this;
            if (abstractViewOnTouchListenerC2927a.f25538o) {
                if (abstractViewOnTouchListenerC2927a.f25536m) {
                    abstractViewOnTouchListenerC2927a.f25536m = false;
                    abstractViewOnTouchListenerC2927a.f25524a.m();
                }
                C0332a c0332a = AbstractViewOnTouchListenerC2927a.this.f25524a;
                if (c0332a.h() || !AbstractViewOnTouchListenerC2927a.this.u()) {
                    AbstractViewOnTouchListenerC2927a.this.f25538o = false;
                    return;
                }
                AbstractViewOnTouchListenerC2927a abstractViewOnTouchListenerC2927a2 = AbstractViewOnTouchListenerC2927a.this;
                if (abstractViewOnTouchListenerC2927a2.f25537n) {
                    abstractViewOnTouchListenerC2927a2.f25537n = false;
                    abstractViewOnTouchListenerC2927a2.c();
                }
                c0332a.a();
                AbstractViewOnTouchListenerC2927a.this.j(c0332a.b(), c0332a.c());
                E.X(AbstractViewOnTouchListenerC2927a.this.f25526c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC2927a(View view) {
        this.f25526c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f25523r);
        r(500);
        q(500);
    }

    public static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f25526c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f25528e[i10], f11, this.f25529f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f25532i[i10];
        float f14 = this.f25533j[i10];
        float f15 = this.f25534k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f25530g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f25538o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f25525b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f25525b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f25536m) {
            this.f25538o = false;
        } else {
            this.f25524a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public AbstractViewOnTouchListenerC2927a k(int i10) {
        this.f25531h = i10;
        return this;
    }

    public AbstractViewOnTouchListenerC2927a l(int i10) {
        this.f25530g = i10;
        return this;
    }

    public AbstractViewOnTouchListenerC2927a m(boolean z10) {
        if (this.f25539p && !z10) {
            i();
        }
        this.f25539p = z10;
        return this;
    }

    public AbstractViewOnTouchListenerC2927a n(float f10, float f11) {
        float[] fArr = this.f25529f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public AbstractViewOnTouchListenerC2927a o(float f10, float f11) {
        float[] fArr = this.f25534k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f25539p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f25537n = r2
            r5.f25535l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f25526c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f25526c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            c1.a$a r7 = r5.f25524a
            r7.l(r0, r6)
            boolean r6 = r5.f25538o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f25540q
            if (r6 == 0) goto L61
            boolean r5 = r5.f25538o
            if (r5 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.AbstractViewOnTouchListenerC2927a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public AbstractViewOnTouchListenerC2927a p(float f10, float f11) {
        float[] fArr = this.f25533j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public AbstractViewOnTouchListenerC2927a q(int i10) {
        this.f25524a.j(i10);
        return this;
    }

    public AbstractViewOnTouchListenerC2927a r(int i10) {
        this.f25524a.k(i10);
        return this;
    }

    public AbstractViewOnTouchListenerC2927a s(float f10, float f11) {
        float[] fArr = this.f25528e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public AbstractViewOnTouchListenerC2927a t(float f10, float f11) {
        float[] fArr = this.f25532i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0332a c0332a = this.f25524a;
        int iF = c0332a.f();
        int iD = c0332a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void v() {
        int i10;
        if (this.f25527d == null) {
            this.f25527d = new b();
        }
        this.f25538o = true;
        this.f25536m = true;
        if (this.f25535l || (i10 = this.f25531h) <= 0) {
            this.f25527d.run();
        } else {
            E.Y(this.f25526c, this.f25527d, i10);
        }
        this.f25535l = true;
    }
}
