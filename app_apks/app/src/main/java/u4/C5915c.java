package u4;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import fc.C4034q;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import q4.C5487c;
import q4.C5492h;
import s4.C5715a;
import s4.C5717c;
import vc.p;

/* JADX INFO: renamed from: u4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5915c extends C5914b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5492h f45069i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5915c(Window.Callback delegate, Activity activity, p track, List viewTargetLocators, A4.a logger, C5487c autocaptureState, C5492h c5492h) {
        super(delegate, activity, track, viewTargetLocators, logger, autocaptureState, null, null, null, 448, null);
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(track, "track");
        AbstractC4862t.e(viewTargetLocators, "viewTargetLocators");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(autocaptureState, "autocaptureState");
        this.f45069i = c5492h;
    }

    @Override // u4.C5914b, u4.AbstractWindowCallbackC5917e, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent != null && this.f45069i != null && motionEvent.getAction() == 1) {
            g(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final void g(MotionEvent motionEvent) {
        Window window = b().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null) {
            d().d("DecorView is null in handleFrustrationInteraction()");
            return;
        }
        C5717c c5717cC = c();
        if (c5717cC != null) {
            f(null);
        } else {
            c5717cC = C5715a.b(decorView, new C4034q(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())), e(), C5717c.a.Clickable, d());
            if (c5717cC == null) {
                d().a("Unable to find click target for frustration interaction");
                return;
            }
        }
        if (c5717cC.i()) {
            d().a("Ignoring all frustration interactions for target: " + c5717cC.c());
            return;
        }
        C5492h.a aVar = new C5492h.a(motionEvent.getX(), motionEvent.getY(), 0L, 4, null);
        C5492h.e eVar = new C5492h.e(c5717cC.c(), c5717cC.e(), c5717cC.g(), c5717cC.h(), c5717cC.f(), c5717cC.d());
        C5492h c5492h = this.f45069i;
        if (c5492h != null) {
            c5492h.n(aVar, eVar, c5717cC, b());
        }
    }
}
