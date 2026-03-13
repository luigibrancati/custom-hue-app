package vb;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6079c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f45941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Float f45942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MotionEvent f45943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MotionEvent f45944h;

    /* JADX INFO: renamed from: vb.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean a(C6079c c6079c, MotionEvent motionEvent);

        void e(C6079c c6079c, MotionEvent motionEvent);

        boolean f(C6079c c6079c, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: vb.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends a {
        @Override // vb.C6079c.a
        default boolean a(C6079c detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            return true;
        }

        @Override // vb.C6079c.a
        default void e(C6079c detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
        }

        @Override // vb.C6079c.a
        default boolean f(C6079c detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            return false;
        }
    }

    public C6079c(Context context, a listener) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(listener, "listener");
        this.f45937a = context;
        this.f45938b = listener;
    }

    public final boolean a(MotionEvent event) {
        AbstractC4862t.e(event, "event");
        if (event.getPointerCount() > 1) {
            if (!this.f45939c && !this.f45940d) {
                return false;
            }
            this.f45938b.e(this, event);
            b();
            return true;
        }
        if (!this.f45939c && !this.f45940d) {
            if (event.getActionMasked() == 0) {
                c(event);
                this.f45940d = true;
            }
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                c(event);
                if (this.f45940d) {
                    double d10 = 2;
                    if (((float) Math.pow(this.f45941e != null ? r0.floatValue() : 0.0f, d10)) + ((float) Math.pow(this.f45942f != null ? r3.floatValue() : 0.0f, d10)) < 1000.0f) {
                        return false;
                    }
                    this.f45940d = false;
                    this.f45939c = true;
                    this.f45938b.a(this, event);
                }
                this.f45938b.f(this, event);
                return true;
            }
            if (actionMasked != 3 && actionMasked != 5) {
                return false;
            }
        }
        b();
        this.f45938b.e(this, event);
        return true;
    }

    public final void b() {
        Float fValueOf = Float.valueOf(0.0f);
        MotionEvent motionEvent = this.f45944h;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f45944h = null;
        MotionEvent motionEvent2 = this.f45943g;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f45943g = null;
        this.f45941e = fValueOf;
        this.f45942f = fValueOf;
        this.f45939c = false;
        this.f45940d = false;
    }

    public final void c(MotionEvent motionEvent) {
        if (this.f45943g == null) {
            this.f45943g = MotionEvent.obtain(motionEvent);
        }
        MotionEvent motionEvent2 = this.f45944h;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.f45944h = motionEventObtain;
        MotionEvent motionEvent3 = this.f45943g;
        if (motionEvent3 == null || motionEventObtain == null) {
            return;
        }
        this.f45941e = Float.valueOf(motionEventObtain.getX() - motionEvent3.getX());
        this.f45942f = Float.valueOf(motionEventObtain.getY() - motionEvent3.getY());
    }
}
