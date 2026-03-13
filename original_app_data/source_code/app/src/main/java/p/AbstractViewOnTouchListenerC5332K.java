package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import o.InterfaceC5183f;

/* JADX INFO: renamed from: p.K, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5332K implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f41800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f41801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f41802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f41805i = new int[2];

    /* JADX INFO: renamed from: p.K$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC5332K.this.f41800d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: p.K$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC5332K.this.e();
        }
    }

    public AbstractViewOnTouchListenerC5332K(View view) {
        this.f41800d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f41797a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f41798b = tapTimeout;
        this.f41799c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    public final void a() {
        Runnable runnable = this.f41802f;
        if (runnable != null) {
            this.f41800d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f41801e;
        if (runnable2 != null) {
            this.f41800d.removeCallbacks(runnable2);
        }
    }

    public abstract InterfaceC5183f b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC5183f interfaceC5183fB = b();
        if (interfaceC5183fB == null || !interfaceC5183fB.a()) {
            return true;
        }
        interfaceC5183fB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f41800d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f41803g = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        C5330I c5330i;
        View view = this.f41800d;
        InterfaceC5183f interfaceC5183fB = b();
        if (interfaceC5183fB != null && interfaceC5183fB.a() && (c5330i = (C5330I) interfaceC5183fB.n()) != null && c5330i.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(c5330i, motionEventObtainNoHistory);
            boolean zE = c5330i.e(motionEventObtainNoHistory, this.f41804h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f41800d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f41804h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f41797a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r5 = r0.getParent()
            r5.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f41804h = r6
            java.lang.Runnable r6 = r5.f41801e
            if (r6 != 0) goto L52
            p.K$a r6 = new p.K$a
            r6.<init>()
            r5.f41801e = r6
        L52:
            java.lang.Runnable r6 = r5.f41801e
            int r1 = r5.f41798b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f41802f
            if (r6 != 0) goto L65
            p.K$b r6 = new p.K$b
            r6.<init>()
            r5.f41802f = r6
        L65:
            java.lang.Runnable r6 = r5.f41802f
            int r5 = r5.f41799c
            long r3 = (long) r5
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractViewOnTouchListenerC5332K.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f41805i);
        motionEvent.offsetLocation(r1[0], r1[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f41805i);
        motionEvent.offsetLocation(-r1[0], -r1[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f41803g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f41800d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f41803g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f41803g = false;
        this.f41804h = -1;
        Runnable runnable = this.f41801e;
        if (runnable != null) {
            this.f41800d.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
