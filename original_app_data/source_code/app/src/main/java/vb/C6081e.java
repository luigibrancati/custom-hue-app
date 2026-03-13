package vb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vb.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6081e extends ScaleGestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionEvent f45966a;

    /* JADX INFO: renamed from: vb.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f45967a;

        public a(b bVar) {
            this.f45967a = bVar;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            AbstractC4862t.e(detector, "detector");
            C6081e c6081e = (C6081e) detector;
            return this.f45967a.d(c6081e, c6081e.a());
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            AbstractC4862t.e(detector, "detector");
            C6081e c6081e = (C6081e) detector;
            return this.f45967a.g(c6081e, c6081e.a());
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            AbstractC4862t.e(detector, "detector");
            C6081e c6081e = (C6081e) detector;
            this.f45967a.i(c6081e, c6081e.a());
        }
    }

    /* JADX INFO: renamed from: vb.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean d(C6081e c6081e, MotionEvent motionEvent);

        boolean g(C6081e c6081e, MotionEvent motionEvent);

        void i(C6081e c6081e, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: vb.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c extends b {
        @Override // vb.C6081e.b
        default boolean d(C6081e detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            return false;
        }

        @Override // vb.C6081e.b
        default boolean g(C6081e detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6081e(Context context, b listener) {
        super(context, new a(listener));
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(listener, "listener");
    }

    public final MotionEvent a() {
        MotionEvent motionEvent = this.f45966a;
        if (motionEvent != null) {
            return motionEvent;
        }
        AbstractC4862t.p("event");
        return null;
    }

    public final void b(MotionEvent motionEvent) {
        AbstractC4862t.e(motionEvent, "<set-?>");
        this.f45966a = motionEvent;
    }

    @Override // android.view.ScaleGestureDetector
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC4862t.e(event, "event");
        b(event);
        return super.onTouchEvent(event);
    }
}
