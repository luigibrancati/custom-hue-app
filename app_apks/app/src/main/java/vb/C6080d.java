package vb;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6080d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MotionEvent f45947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MotionEvent f45948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f45949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f45950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f45951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f45952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f45953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f45954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f45956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f45957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f45958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f45959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f45960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f45961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f45962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f45963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f45964t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f45965u;

    /* JADX INFO: renamed from: vb.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean b(C6080d c6080d, MotionEvent motionEvent);

        boolean c(C6080d c6080d, MotionEvent motionEvent);

        void l(C6080d c6080d, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: vb.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends a {
        @Override // vb.C6080d.a
        default boolean b(C6080d detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            return false;
        }

        @Override // vb.C6080d.a
        default boolean c(C6080d detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            return true;
        }
    }

    public C6080d(Context context, a listener) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(listener, "listener");
        this.f45945a = context;
        this.f45946b = listener;
        this.f45964t = 2.0f;
    }

    public final float a() {
        return this.f45960p;
    }

    public final float b() {
        return this.f45962r;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.AbstractC4862t.e(r7, r0)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            boolean r1 = r6.f45955k
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L4d
            if (r0 == r4) goto L49
            if (r0 == r3) goto L1b
            if (r0 == r2) goto L49
            goto Lb7
        L1b:
            int r0 = r7.getPointerCount()
            if (r0 == r3) goto L22
            return r5
        L22:
            android.view.MotionEvent r0 = r6.f45947c
            if (r0 != 0) goto L2d
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r7)
            r6.f45947c = r7
            return r5
        L2d:
            r6.f(r7)
            float r0 = r6.f45963s
            float r0 = java.lang.Math.abs(r0)
            float r1 = r6.f45964t
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L48
            vb.d$a r0 = r6.f45946b
            boolean r7 = r0.c(r6, r7)
            if (r7 == 0) goto L48
            r6.f45955k = r4
            goto Lb7
        L48:
            return r5
        L49:
            r6.d()
            goto Lb7
        L4d:
            r1 = 0
            if (r0 == r3) goto L82
            if (r0 == r2) goto L77
            r2 = 6
            if (r0 == r2) goto L56
            goto Lb7
        L56:
            r6.f(r7)
            int r0 = r7.getActionIndex()
            if (r0 != 0) goto L60
            r5 = r4
        L60:
            float r0 = r7.getX(r5)
            r6.f45956l = r0
            float r0 = r7.getY(r5)
            r6.f45957m = r0
            r6.f45962r = r1
            vb.d$a r0 = r6.f45946b
            r0.l(r6, r7)
            r6.d()
            goto Lb7
        L77:
            r6.f45962r = r1
            vb.d$a r0 = r6.f45946b
            r0.l(r6, r7)
            r6.d()
            goto Lb7
        L82:
            int r0 = r7.getPointerCount()
            if (r0 <= r3) goto L93
            r6.f45962r = r1
            vb.d$a r0 = r6.f45946b
            r0.l(r6, r7)
            r6.d()
            return r5
        L93:
            r6.f(r7)
            float r0 = r6.f45954j
            float r1 = r6.f45953i
            float r0 = r0 / r1
            r1 = 1059816735(0x3f2b851f, float:0.67)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb7
            vb.d$a r0 = r6.f45946b
            boolean r0 = r0.b(r6, r7)
            if (r0 == 0) goto Lb7
            android.view.MotionEvent r0 = r6.f45947c
            if (r0 == 0) goto Lb1
            r0.recycle()
        Lb1:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r7)
            r6.f45947c = r7
        Lb7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.C6080d.c(android.view.MotionEvent):boolean");
    }

    public final void d() {
        MotionEvent motionEvent = this.f45947c;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f45947c = null;
        MotionEvent motionEvent2 = this.f45948d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f45948d = null;
        this.f45955k = false;
    }

    public final void e(float f10) {
        this.f45962r = this.f45960p;
        this.f45960p = f10;
    }

    public final void f(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f45947c;
        if (motionEvent2 == null) {
            return;
        }
        MotionEvent motionEvent3 = this.f45948d;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
        }
        this.f45948d = MotionEvent.obtain(motionEvent);
        this.f45949e = motionEvent2.getX(1) - motionEvent2.getX(0);
        this.f45950f = motionEvent2.getY(1) - motionEvent2.getY(0);
        this.f45951g = motionEvent.getX(1) - motionEvent.getX(0);
        this.f45952h = motionEvent.getY(1) - motionEvent.getY(0);
        this.f45956l = motionEvent.getX(0) + (this.f45951g * 0.5f);
        this.f45957m = motionEvent.getY(0) + (0.5f * this.f45952h);
        float f10 = this.f45951g;
        this.f45958n = (float) Math.sqrt((f10 * f10) + (r2 * r2));
        float f11 = this.f45949e;
        float f12 = this.f45952h;
        this.f45959o = (float) Math.sqrt((f11 * f11) + (f12 * f12));
        this.f45961q = (float) Math.atan2(this.f45950f, this.f45951g);
        e((float) Math.atan2(this.f45952h, this.f45951g));
        this.f45963s = (this.f45960p - this.f45961q) * 57.295776f;
        this.f45954j = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f45953i = motionEvent2.getPressure(motionEvent2.getActionIndex());
        this.f45965u = motionEvent.getEventTime() - motionEvent2.getEventTime();
    }
}
