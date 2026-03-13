package vb;

import Ab.f;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import kotlin.jvm.internal.AbstractC4862t;
import rb.h;
import vb.C6079c;
import vb.C6080d;
import vb.C6081e;

/* JADX INFO: renamed from: vb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6078b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f45924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MotionEvent f45925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GestureDetector f45926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6079c f45927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6080d f45928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C6081e f45929f;

    /* JADX INFO: renamed from: vb.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
    }

    /* JADX INFO: renamed from: vb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0628b extends GestureDetector.SimpleOnGestureListener {
        public C0628b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
        public boolean onContextClick(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            boolean zOnContextClick = super.onContextClick(e10);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onContextClick(e10);
            }
            c6078b.a();
            return zOnContextClick;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            boolean zOnDoubleTap = super.onDoubleTap(e10);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onDoubleTap(e10);
            }
            c6078b.a();
            return zOnDoubleTap;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            boolean zOnDoubleTapEvent = super.onDoubleTapEvent(e10);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onDoubleTapEvent(e10);
            }
            c6078b.a();
            return zOnDoubleTapEvent;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            boolean zOnDown = super.onDown(e10);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onDown(e10);
            }
            c6078b.a();
            return zOnDown;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
            AbstractC4862t.e(e22, "e2");
            boolean zOnFling = super.onFling(motionEvent, e22, f10, f11);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onFling(motionEvent, e22, f10, f11);
            }
            c6078b.a();
            return zOnFling;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            super.onLongPress(e10);
            C4015H c4015h = C4015H.f34254a;
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onLongPress(e10);
            }
            c6078b.a();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
            AbstractC4862t.e(e22, "e2");
            boolean zOnScroll = super.onScroll(motionEvent, e22, f10, f11);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onScroll(motionEvent, e22, f10, f11);
            }
            c6078b.a();
            return zOnScroll;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            super.onShowPress(e10);
            C4015H c4015h = C4015H.f34254a;
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onShowPress(e10);
            }
            c6078b.a();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            boolean zOnSingleTapConfirmed = super.onSingleTapConfirmed(e10);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onSingleTapConfirmed(e10);
            }
            c6078b.a();
            return zOnSingleTapConfirmed;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e10) {
            AbstractC4862t.e(e10, "e");
            boolean zOnSingleTapUp = super.onSingleTapUp(e10);
            C6078b c6078b = C6078b.this;
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.onSingleTapUp(e10);
            }
            c6078b.a();
            return zOnSingleTapUp;
        }
    }

    /* JADX INFO: renamed from: vb.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements C6079c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C4034q f45931a;

        public c() {
        }

        @Override // vb.C6079c.b, vb.C6079c.a
        public boolean a(C6079c detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            boolean zA = super.a(detector, e10);
            C6078b c6078b = C6078b.this;
            this.f45931a = AbstractC4040w.a(e10, c6078b.b());
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.a(detector, e10);
            }
            c6078b.a();
            return zA;
        }

        @Override // vb.C6079c.b, vb.C6079c.a
        public void e(C6079c detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            super.e(detector, e10);
            C4015H c4015h = C4015H.f34254a;
            C6078b c6078b = C6078b.this;
            C4034q c4034q = this.f45931a;
            if (c4034q != null) {
                MotionEvent motionEvent = (MotionEvent) c4034q.a();
                f fVar = (f) c4034q.b();
                if (fVar != null) {
                    fVar.e(detector, motionEvent);
                }
                c6078b.a();
            }
            this.f45931a = null;
        }

        @Override // vb.C6079c.b, vb.C6079c.a
        public boolean f(C6079c detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            boolean zF = super.f(detector, e10);
            C6078b c6078b = C6078b.this;
            C4034q c4034q = this.f45931a;
            if (c4034q != null) {
                MotionEvent motionEvent = (MotionEvent) c4034q.a();
                f fVar = (f) c4034q.b();
                if (fVar != null) {
                    fVar.f(detector, motionEvent);
                }
                c6078b.a();
            }
            return zF;
        }
    }

    /* JADX INFO: renamed from: vb.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements C6080d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C4034q f45933a;

        public d() {
        }

        @Override // vb.C6080d.b, vb.C6080d.a
        public boolean b(C6080d detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            boolean zB = super.b(detector, e10);
            C6078b c6078b = C6078b.this;
            C4034q c4034q = this.f45933a;
            if (c4034q != null) {
                MotionEvent motionEvent = (MotionEvent) c4034q.a();
                f fVar = (f) c4034q.b();
                if (fVar != null) {
                    fVar.b(detector, motionEvent);
                }
                c6078b.a();
            }
            return zB;
        }

        @Override // vb.C6080d.b, vb.C6080d.a
        public boolean c(C6080d detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            boolean zC = super.c(detector, e10);
            C6078b c6078b = C6078b.this;
            this.f45933a = AbstractC4040w.a(e10, c6078b.b());
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.c(detector, e10);
            }
            c6078b.a();
            return zC;
        }

        @Override // vb.C6080d.a
        public void l(C6080d detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            C4034q c4034q = this.f45933a;
            if (c4034q != null) {
                C6078b c6078b = C6078b.this;
                MotionEvent motionEvent = (MotionEvent) c4034q.a();
                f fVar = (f) c4034q.b();
                if (fVar != null) {
                    fVar.l(detector, motionEvent);
                }
                c6078b.a();
            }
            this.f45933a = null;
        }
    }

    /* JADX INFO: renamed from: vb.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements C6081e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C4034q f45935a;

        public e() {
        }

        @Override // vb.C6081e.c, vb.C6081e.b
        public boolean d(C6081e detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            boolean zD = super.d(detector, e10);
            C6078b c6078b = C6078b.this;
            C4034q c4034q = this.f45935a;
            if (c4034q != null) {
                MotionEvent motionEvent = (MotionEvent) c4034q.a();
                f fVar = (f) c4034q.b();
                if (fVar != null) {
                    fVar.d(detector, motionEvent);
                }
                c6078b.a();
            }
            return zD;
        }

        @Override // vb.C6081e.c, vb.C6081e.b
        public boolean g(C6081e detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            boolean zG = super.g(detector, e10);
            C6078b c6078b = C6078b.this;
            this.f45935a = AbstractC4040w.a(e10, c6078b.b());
            f fVarB = c6078b.b();
            if (fVarB != null) {
                fVarB.g(detector, e10);
            }
            c6078b.a();
            return zG;
        }

        @Override // vb.C6081e.b
        public void i(C6081e detector, MotionEvent e10) {
            AbstractC4862t.e(detector, "detector");
            AbstractC4862t.e(e10, "e");
            C4034q c4034q = this.f45935a;
            if (c4034q != null) {
                C6078b c6078b = C6078b.this;
                MotionEvent motionEvent = (MotionEvent) c4034q.a();
                f fVar = (f) c4034q.b();
                if (fVar != null) {
                    fVar.i(detector, motionEvent);
                }
                c6078b.a();
            }
            this.f45935a = null;
        }
    }

    public C6078b(Context context, a aVar) {
        AbstractC4862t.e(context, "context");
        this.f45926c = new GestureDetector(context, new C0628b());
        this.f45927d = new C6079c(context, new c());
        this.f45928e = new C6080d(context, new d());
        this.f45929f = new C6081e(context, new e());
    }

    public final a a() {
        return null;
    }

    public final f b() {
        return this.f45924a;
    }

    public final void c(MotionEvent event, h hVar) {
        AbstractC4862t.e(event, "event");
        this.f45925b = event;
        this.f45924a = hVar != null ? hVar.f() : null;
        this.f45926c.onTouchEvent(event);
        this.f45927d.a(event);
        this.f45928e.c(event);
        this.f45929f.onTouchEvent(event);
    }

    public final void d(a aVar) {
    }
}
