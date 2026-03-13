package u4;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import fc.C4015H;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import q4.C5487c;
import s4.C5717c;
import vc.l;
import vc.p;

/* JADX INFO: renamed from: u4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5914b extends AbstractWindowCallbackC5917e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f45061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A4.a f45063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f45064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC5913a f45065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GestureDetector f45066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5717c f45067h;

    /* JADX INFO: renamed from: u4.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements c {
    }

    /* JADX INFO: renamed from: u4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0617b extends v implements l {
        public C0617b() {
            super(1);
        }

        public final void a(C5717c it) {
            AbstractC4862t.e(it, "it");
            C5914b.this.f(it);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5717c) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: u4.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        default MotionEvent obtain(MotionEvent origin) {
            AbstractC4862t.e(origin, "origin");
            MotionEvent motionEventObtain = MotionEvent.obtain(origin);
            AbstractC4862t.d(motionEventObtain, "obtain(...)");
            return motionEventObtain;
        }
    }

    public /* synthetic */ C5914b(Window.Callback callback, Activity activity, p pVar, List list, A4.a aVar, C5487c c5487c, c cVar, GestureDetectorOnGestureListenerC5913a gestureDetectorOnGestureListenerC5913a, GestureDetector gestureDetector, int i10, AbstractC4854k abstractC4854k) {
        Activity activity2;
        GestureDetector gestureDetector2;
        c aVar2 = (i10 & 64) != 0 ? new a() : cVar;
        GestureDetectorOnGestureListenerC5913a gestureDetectorOnGestureListenerC5913a2 = (i10 & 128) != 0 ? new GestureDetectorOnGestureListenerC5913a(activity, pVar, aVar, list, c5487c, null, 32, null) : gestureDetectorOnGestureListenerC5913a;
        if ((i10 & 256) != 0) {
            activity2 = activity;
            gestureDetector2 = new GestureDetector(activity2, gestureDetectorOnGestureListenerC5913a2);
        } else {
            activity2 = activity;
            gestureDetector2 = gestureDetector;
        }
        this(callback, activity2, pVar, list, aVar, c5487c, aVar2, gestureDetectorOnGestureListenerC5913a2, gestureDetector2);
    }

    public final Activity b() {
        return this.f45061b;
    }

    public final C5717c c() {
        return this.f45067h;
    }

    public final A4.a d() {
        return this.f45063d;
    }

    @Override // u4.AbstractWindowCallbackC5917e, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventObtain = this.f45064e.obtain(motionEvent);
            try {
                try {
                    this.f45066g.onTouchEvent(motionEventObtain);
                } catch (Exception e10) {
                    this.f45063d.d("Error handling touch event: " + e10);
                    C4015H c4015h = C4015H.f34254a;
                }
            } finally {
                motionEventObtain.recycle();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final List e() {
        return this.f45062c;
    }

    public final void f(C5717c c5717c) {
        this.f45067h = c5717c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5914b(Window.Callback delegate, Activity activity, p track, List viewTargetLocators, A4.a logger, C5487c autocaptureState, c motionEventObtainer, GestureDetectorOnGestureListenerC5913a gestureListener, GestureDetector gestureDetector) {
        super(delegate);
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(track, "track");
        AbstractC4862t.e(viewTargetLocators, "viewTargetLocators");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(autocaptureState, "autocaptureState");
        AbstractC4862t.e(motionEventObtainer, "motionEventObtainer");
        AbstractC4862t.e(gestureListener, "gestureListener");
        AbstractC4862t.e(gestureDetector, "gestureDetector");
        this.f45061b = activity;
        this.f45062c = viewTargetLocators;
        this.f45063d = logger;
        this.f45064e = motionEventObtainer;
        this.f45065f = gestureListener;
        this.f45066g = gestureDetector;
        gestureListener.a(new C0617b());
    }
}
