package u4;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import fc.C4015H;
import fc.C4034q;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import q4.AbstractC5493i;
import q4.C5487c;
import s4.AbstractC5718d;
import s4.C5715a;
import s4.C5717c;
import vc.l;
import vc.p;

/* JADX INFO: renamed from: u4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC5913a implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f45055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A4.a f45056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5487c f45058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f45059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f45060f;

    public GestureDetectorOnGestureListenerC5913a(Activity activity, p track, A4.a logger, List viewTargetLocators, C5487c autocaptureState, l lVar) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(track, "track");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(viewTargetLocators, "viewTargetLocators");
        AbstractC4862t.e(autocaptureState, "autocaptureState");
        this.f45055a = track;
        this.f45056b = logger;
        this.f45057c = viewTargetLocators;
        this.f45058d = autocaptureState;
        this.f45059e = lVar;
        this.f45060f = new WeakReference(activity);
    }

    public final void a(l callback) {
        AbstractC4862t.e(callback, "callback");
        this.f45059e = callback;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        AbstractC4862t.e(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        AbstractC4862t.e(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        View decorView;
        AbstractC4862t.e(e10, "e");
        Activity activity = (Activity) this.f45060f.get();
        if (activity == null) {
            this.f45056b.d("Activity is null in onSingleTapUp()");
            C4015H c4015h = C4015H.f34254a;
            return false;
        }
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            this.f45056b.d("DecorView is null in onSingleTapUp()");
            C4015H c4015h2 = C4015H.f34254a;
            return false;
        }
        C5717c c5717cB = C5715a.b(decorView, new C4034q(Float.valueOf(e10.getX()), Float.valueOf(e10.getY())), this.f45057c, C5717c.a.Clickable, this.f45056b);
        if (c5717cB == null) {
            this.f45056b.c("Unable to find click target. No event captured.");
            C4015H c4015h3 = C4015H.f34254a;
            return false;
        }
        l lVar = this.f45059e;
        if (lVar != null) {
            lVar.invoke(c5717cB);
        }
        if (this.f45058d.c().contains(AbstractC5493i.b.f43223a)) {
            this.f45055a.invoke("[Amplitude] Element Interacted", AbstractC5718d.a(c5717cB, activity));
        }
        return false;
    }

    public /* synthetic */ GestureDetectorOnGestureListenerC5913a(Activity activity, p pVar, A4.a aVar, List list, C5487c c5487c, l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(activity, pVar, aVar, list, c5487c, (i10 & 32) != 0 ? null : lVar);
    }
}
