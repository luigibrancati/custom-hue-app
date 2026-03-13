package androidx.recyclerview.widget;

import Y0.E;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h extends RecyclerView.o implements RecyclerView.r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public f f24456A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Rect f24458C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f24459D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f24469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f24470k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f24472m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24474o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f24476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f24477r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f24479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f24480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f24481v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public GestureDetectorCompat f24485z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24460a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f24461b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.E f24462c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24471l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24473n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f24475p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f24478s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RecyclerView.k f24482w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f24483x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24484y = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RecyclerView.t f24457B = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if (hVar.f24462c == null || !hVar.y()) {
                return;
            }
            h hVar2 = h.this;
            RecyclerView.E e10 = hVar2.f24462c;
            if (e10 != null) {
                hVar2.t(e10);
            }
            h hVar3 = h.this;
            hVar3.f24477r.removeCallbacks(hVar3.f24478s);
            E.X(h.this.f24477r, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            h.this.f24485z.a(motionEvent);
            VelocityTracker velocityTracker = h.this.f24479t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (h.this.f24471l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(h.this.f24471l);
            if (iFindPointerIndex >= 0) {
                h.this.i(actionMasked, motionEvent, iFindPointerIndex);
            }
            h hVar = h.this;
            RecyclerView.E e10 = hVar.f24462c;
            if (e10 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        hVar.E(motionEvent, hVar.f24474o, iFindPointerIndex);
                        h.this.t(e10);
                        h hVar2 = h.this;
                        hVar2.f24477r.removeCallbacks(hVar2.f24478s);
                        h.this.f24478s.run();
                        h.this.f24477r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    h hVar3 = h.this;
                    if (pointerId == hVar3.f24471l) {
                        hVar3.f24471l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        h hVar4 = h.this;
                        hVar4.E(motionEvent, hVar4.f24474o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = hVar.f24479t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            h.this.z(null, 0);
            h.this.f24471l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarM;
            h.this.f24485z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                h.this.f24471l = motionEvent.getPointerId(0);
                h.this.f24463d = motionEvent.getX();
                h.this.f24464e = motionEvent.getY();
                h.this.u();
                h hVar = h.this;
                if (hVar.f24462c == null && (gVarM = hVar.m(motionEvent)) != null) {
                    h hVar2 = h.this;
                    hVar2.f24463d -= gVarM.f24505j;
                    hVar2.f24464e -= gVarM.f24506k;
                    hVar2.l(gVarM.f24500e, true);
                    if (h.this.f24460a.remove(gVarM.f24500e.itemView)) {
                        h hVar3 = h.this;
                        hVar3.f24472m.clearView(hVar3.f24477r, gVarM.f24500e);
                    }
                    h.this.z(gVarM.f24500e, gVarM.f24501f);
                    h hVar4 = h.this;
                    hVar4.E(motionEvent, hVar4.f24474o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                h hVar5 = h.this;
                hVar5.f24471l = -1;
                hVar5.z(null, 0);
            } else {
                int i10 = h.this.f24471l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    h.this.i(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = h.this.f24479t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return h.this.f24462c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z10) {
            if (z10) {
                h.this.z(null, 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends g {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f24488o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.E f24489p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.E e10, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.E e11) {
            super(e10, i10, i11, f10, f11, f12, f13);
            this.f24488o = i12;
            this.f24489p = e11;
        }

        @Override // androidx.recyclerview.widget.h.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f24507l) {
                return;
            }
            if (this.f24488o <= 0) {
                h hVar = h.this;
                hVar.f24472m.clearView(hVar.f24477r, this.f24489p);
            } else {
                h.this.f24460a.add(this.f24489p.itemView);
                this.f24504i = true;
                int i10 = this.f24488o;
                if (i10 > 0) {
                    h.this.v(this, i10);
                }
            }
            h hVar2 = h.this;
            View view = hVar2.f24483x;
            View view2 = this.f24489p.itemView;
            if (view == view2) {
                hVar2.x(view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f24491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f24492b;

        public d(g gVar, int i10) {
            this.f24491a = gVar;
            this.f24492b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = h.this.f24477r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f24491a;
            if (gVar.f24507l || gVar.f24500e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = h.this.f24477r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !h.this.r()) {
                h.this.f24472m.onSwiped(this.f24491a.f24500e, this.f24492b);
            } else {
                h.this.f24477r.post(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24494a = true;

        public f() {
        }

        public void a() {
            this.f24494a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewN;
            RecyclerView.E eH0;
            if (!this.f24494a || (viewN = h.this.n(motionEvent)) == null || (eH0 = h.this.f24477r.h0(viewN)) == null) {
                return;
            }
            h hVar = h.this;
            if (hVar.f24472m.hasDragFlag(hVar.f24477r, eH0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = h.this.f24471l;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    h hVar2 = h.this;
                    hVar2.f24463d = x10;
                    hVar2.f24464e = y10;
                    hVar2.f24468i = 0.0f;
                    hVar2.f24467h = 0.0f;
                    if (hVar2.f24472m.isLongPressDragEnabled()) {
                        h.this.z(eH0, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0312h {
        void b(View view, View view2, int i10, int i11);
    }

    public h(e eVar) {
        this.f24472m = eVar;
    }

    private void A() {
        this.f24476q = ViewConfiguration.get(this.f24477r.getContext()).getScaledTouchSlop();
        this.f24477r.h(this);
        this.f24477r.k(this.f24457B);
        this.f24477r.j(this);
        B();
    }

    private void k() {
        this.f24477r.Z0(this);
        this.f24477r.b1(this.f24457B);
        this.f24477r.a1(this);
        for (int size = this.f24475p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f24475p.get(0);
            gVar.a();
            this.f24472m.clearView(this.f24477r, gVar.f24500e);
        }
        this.f24475p.clear();
        this.f24483x = null;
        this.f24484y = -1;
        w();
        C();
    }

    public static boolean s(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    public final void B() {
        this.f24456A = new f();
        this.f24485z = new GestureDetectorCompat(this.f24477r.getContext(), this.f24456A);
    }

    public final void C() {
        f fVar = this.f24456A;
        if (fVar != null) {
            fVar.a();
            this.f24456A = null;
        }
        if (this.f24485z != null) {
            this.f24485z = null;
        }
    }

    public final int D(RecyclerView.E e10) {
        if (this.f24473n == 2) {
            return 0;
        }
        int movementFlags = this.f24472m.getMovementFlags(this.f24477r, e10);
        int iConvertToAbsoluteDirection = (this.f24472m.convertToAbsoluteDirection(movementFlags, E.w(this.f24477r)) & 65280) >> 8;
        if (iConvertToAbsoluteDirection == 0) {
            return 0;
        }
        int i10 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f24467h) > Math.abs(this.f24468i)) {
            int iH = h(e10, iConvertToAbsoluteDirection);
            if (iH > 0) {
                return (i10 & iH) == 0 ? e.convertToRelativeDirection(iH, E.w(this.f24477r)) : iH;
            }
            int iJ = j(e10, iConvertToAbsoluteDirection);
            if (iJ > 0) {
                return iJ;
            }
        } else {
            int iJ2 = j(e10, iConvertToAbsoluteDirection);
            if (iJ2 > 0) {
                return iJ2;
            }
            int iH2 = h(e10, iConvertToAbsoluteDirection);
            if (iH2 > 0) {
                return (i10 & iH2) == 0 ? e.convertToRelativeDirection(iH2, E.w(this.f24477r)) : iH2;
            }
        }
        return 0;
    }

    public void E(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f24463d;
        this.f24467h = f10;
        this.f24468i = y10 - this.f24464e;
        if ((i10 & 4) == 0) {
            this.f24467h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f24467h = Math.min(0.0f, this.f24467h);
        }
        if ((i10 & 1) == 0) {
            this.f24468i = Math.max(0.0f, this.f24468i);
        }
        if ((i10 & 2) == 0) {
            this.f24468i = Math.min(0.0f, this.f24468i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
        x(view);
        RecyclerView.E eH0 = this.f24477r.h0(view);
        if (eH0 == null) {
            return;
        }
        RecyclerView.E e10 = this.f24462c;
        if (e10 != null && eH0 == e10) {
            z(null, 0);
            return;
        }
        l(eH0, false);
        if (this.f24460a.remove(eH0.itemView)) {
            this.f24472m.clearView(this.f24477r, eH0);
        }
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f24477r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.f24477r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f24465f = resources.getDimension(Z2.b.f20210f);
            this.f24466g = resources.getDimension(Z2.b.f20209e);
            A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        rect.setEmpty();
    }

    public final int h(RecyclerView.E e10, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f24467h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f24479t;
        if (velocityTracker != null && this.f24471l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f24472m.getSwipeVelocityThreshold(this.f24466g));
            float xVelocity = this.f24479t.getXVelocity(this.f24471l);
            float yVelocity = this.f24479t.getYVelocity(this.f24471l);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= this.f24472m.getSwipeEscapeVelocity(this.f24465f) && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float width = this.f24477r.getWidth() * this.f24472m.getSwipeThreshold(e10);
        if ((i10 & i11) == 0 || Math.abs(this.f24467h) <= width) {
            return 0;
        }
        return i11;
    }

    public void i(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.E eP;
        int absoluteMovementFlags;
        if (this.f24462c != null || i10 != 2 || this.f24473n == 2 || !this.f24472m.isItemViewSwipeEnabled() || this.f24477r.getScrollState() == 1 || (eP = p(motionEvent)) == null || (absoluteMovementFlags = (this.f24472m.getAbsoluteMovementFlags(this.f24477r, eP) & 65280) >> 8) == 0) {
            return;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f24463d;
        float f11 = y10 - this.f24464e;
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        int i12 = this.f24476q;
        if (fAbs >= i12 || fAbs2 >= i12) {
            if (fAbs > fAbs2) {
                if (f10 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f10 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f11 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f11 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.f24468i = 0.0f;
            this.f24467h = 0.0f;
            this.f24471l = motionEvent.getPointerId(0);
            z(eP, 1);
        }
    }

    public final int j(RecyclerView.E e10, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f24468i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f24479t;
        if (velocityTracker != null && this.f24471l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f24472m.getSwipeVelocityThreshold(this.f24466g));
            float xVelocity = this.f24479t.getXVelocity(this.f24471l);
            float yVelocity = this.f24479t.getYVelocity(this.f24471l);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= this.f24472m.getSwipeEscapeVelocity(this.f24465f) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.f24477r.getHeight() * this.f24472m.getSwipeThreshold(e10);
        if ((i10 & i11) == 0 || Math.abs(this.f24468i) <= height) {
            return 0;
        }
        return i11;
    }

    public void l(RecyclerView.E e10, boolean z10) {
        for (int size = this.f24475p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f24475p.get(size);
            if (gVar.f24500e == e10) {
                gVar.f24507l |= z10;
                if (!gVar.f24508m) {
                    gVar.a();
                }
                this.f24475p.remove(size);
                return;
            }
        }
    }

    public g m(MotionEvent motionEvent) {
        if (this.f24475p.isEmpty()) {
            return null;
        }
        View viewN = n(motionEvent);
        for (int size = this.f24475p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f24475p.get(size);
            if (gVar.f24500e.itemView == viewN) {
                return gVar;
            }
        }
        return null;
    }

    public View n(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.E e10 = this.f24462c;
        if (e10 != null) {
            View view = e10.itemView;
            if (s(view, x10, y10, this.f24469j + this.f24467h, this.f24470k + this.f24468i)) {
                return view;
            }
        }
        for (int size = this.f24475p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f24475p.get(size);
            View view2 = gVar.f24500e.itemView;
            if (s(view2, x10, y10, gVar.f24505j, gVar.f24506k)) {
                return view2;
            }
        }
        return this.f24477r.S(x10, y10);
    }

    public final List o(RecyclerView.E e10) {
        RecyclerView.E e11 = e10;
        List list = this.f24480u;
        if (list == null) {
            this.f24480u = new ArrayList();
            this.f24481v = new ArrayList();
        } else {
            list.clear();
            this.f24481v.clear();
        }
        int boundingBoxMargin = this.f24472m.getBoundingBoxMargin();
        int iRound = Math.round(this.f24469j + this.f24467h) - boundingBoxMargin;
        int iRound2 = Math.round(this.f24470k + this.f24468i) - boundingBoxMargin;
        int i10 = boundingBoxMargin * 2;
        int width = e11.itemView.getWidth() + iRound + i10;
        int height = e11.itemView.getHeight() + iRound2 + i10;
        int i11 = (iRound + width) / 2;
        int i12 = (iRound2 + height) / 2;
        RecyclerView.p layoutManager = this.f24477r.getLayoutManager();
        int iK = layoutManager.K();
        int i13 = 0;
        while (i13 < iK) {
            View viewJ = layoutManager.J(i13);
            if (viewJ != e11.itemView && viewJ.getBottom() >= iRound2 && viewJ.getTop() <= height && viewJ.getRight() >= iRound && viewJ.getLeft() <= width) {
                RecyclerView.E eH0 = this.f24477r.h0(viewJ);
                if (this.f24472m.canDropOver(this.f24477r, this.f24462c, eH0)) {
                    int iAbs = Math.abs(i11 - ((viewJ.getLeft() + viewJ.getRight()) / 2));
                    int iAbs2 = Math.abs(i12 - ((viewJ.getTop() + viewJ.getBottom()) / 2));
                    int i14 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f24480u.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > ((Integer) this.f24481v.get(i16)).intValue(); i16++) {
                        i15++;
                    }
                    this.f24480u.add(i15, eH0);
                    this.f24481v.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            e11 = e10;
        }
        return this.f24480u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        this.f24484y = -1;
        if (this.f24462c != null) {
            q(this.f24461b);
            float[] fArr = this.f24461b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f24472m.onDraw(canvas, recyclerView, this.f24462c, this.f24475p, this.f24473n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        if (this.f24462c != null) {
            q(this.f24461b);
            float[] fArr = this.f24461b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f24472m.onDrawOver(canvas, recyclerView, this.f24462c, this.f24475p, this.f24473n, f10, f11);
    }

    public final RecyclerView.E p(MotionEvent motionEvent) {
        View viewN;
        RecyclerView.p layoutManager = this.f24477r.getLayoutManager();
        int i10 = this.f24471l;
        if (i10 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(iFindPointerIndex) - this.f24463d;
        float y10 = motionEvent.getY(iFindPointerIndex) - this.f24464e;
        float fAbs = Math.abs(x10);
        float fAbs2 = Math.abs(y10);
        int i11 = this.f24476q;
        if (fAbs < i11 && fAbs2 < i11) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.l()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.m()) && (viewN = n(motionEvent)) != null) {
            return this.f24477r.h0(viewN);
        }
        return null;
    }

    public final void q(float[] fArr) {
        if ((this.f24474o & 12) != 0) {
            fArr[0] = (this.f24469j + this.f24467h) - this.f24462c.itemView.getLeft();
        } else {
            fArr[0] = this.f24462c.itemView.getTranslationX();
        }
        if ((this.f24474o & 3) != 0) {
            fArr[1] = (this.f24470k + this.f24468i) - this.f24462c.itemView.getTop();
        } else {
            fArr[1] = this.f24462c.itemView.getTranslationY();
        }
    }

    public boolean r() {
        int size = this.f24475p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((g) this.f24475p.get(i10)).f24508m) {
                return true;
            }
        }
        return false;
    }

    public void t(RecyclerView.E e10) {
        if (!this.f24477r.isLayoutRequested() && this.f24473n == 2) {
            float moveThreshold = this.f24472m.getMoveThreshold(e10);
            int i10 = (int) (this.f24469j + this.f24467h);
            int i11 = (int) (this.f24470k + this.f24468i);
            if (Math.abs(i11 - e10.itemView.getTop()) >= e10.itemView.getHeight() * moveThreshold || Math.abs(i10 - e10.itemView.getLeft()) >= e10.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.E> listO = o(e10);
                if (listO.size() == 0) {
                    return;
                }
                RecyclerView.E eChooseDropTarget = this.f24472m.chooseDropTarget(e10, listO, i10, i11);
                if (eChooseDropTarget == null) {
                    this.f24480u.clear();
                    this.f24481v.clear();
                    return;
                }
                int absoluteAdapterPosition = eChooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = e10.getAbsoluteAdapterPosition();
                if (this.f24472m.onMove(this.f24477r, e10, eChooseDropTarget)) {
                    this.f24472m.onMoved(this.f24477r, e10, absoluteAdapterPosition2, eChooseDropTarget, absoluteAdapterPosition, i10, i11);
                }
            }
        }
    }

    public void u() {
        VelocityTracker velocityTracker = this.f24479t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f24479t = VelocityTracker.obtain();
    }

    public void v(g gVar, int i10) {
        this.f24477r.post(new d(gVar, i10));
    }

    public final void w() {
        VelocityTracker velocityTracker = this.f24479t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24479t = null;
        }
    }

    public void x(View view) {
        if (view == this.f24483x) {
            this.f24483x = null;
            if (this.f24482w != null) {
                this.f24477r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean y() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.y():boolean");
    }

    public void z(RecyclerView.E e10, int i10) {
        boolean z10;
        float fSignum;
        float fSignum2;
        if (e10 == this.f24462c && i10 == this.f24473n) {
            return;
        }
        this.f24459D = Long.MIN_VALUE;
        int i11 = this.f24473n;
        l(e10, true);
        this.f24473n = i10;
        if (i10 == 2) {
            if (e10 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f24483x = e10.itemView;
            f();
        }
        int i12 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.E e11 = this.f24462c;
        boolean z11 = false;
        if (e11 != null) {
            if (e11.itemView.getParent() != null) {
                int iD = i11 == 2 ? 0 : D(e11);
                w();
                int i13 = 4;
                if (iD == 1 || iD == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f24468i) * this.f24477r.getHeight();
                } else if (iD == 4 || iD == 8 || iD == 16 || iD == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f24467h) * this.f24477r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i11 == 2) {
                    i13 = 8;
                } else if (iD > 0) {
                    i13 = 2;
                }
                q(this.f24461b);
                float[] fArr = this.f24461b;
                float f10 = fArr[0];
                float f11 = fArr[1];
                z10 = false;
                c cVar = new c(e11, i13, i11, f10, f11, fSignum, fSignum2, iD, e11);
                cVar.b(this.f24472m.getAnimationDuration(this.f24477r, i13, fSignum - f10, fSignum2 - f11));
                this.f24475p.add(cVar);
                cVar.d();
                z11 = true;
            } else {
                z10 = false;
                x(e11.itemView);
                this.f24472m.clearView(this.f24477r, e11);
                z11 = false;
            }
            this.f24462c = null;
        } else {
            z10 = false;
        }
        if (e10 != null) {
            this.f24474o = (this.f24472m.getAbsoluteMovementFlags(this.f24477r, e10) & i12) >> (this.f24473n * 8);
            this.f24469j = e10.itemView.getLeft();
            this.f24470k = e10.itemView.getTop();
            this.f24462c = e10;
            if (i10 == 2) {
                e10.itemView.performHapticFeedback(z10 ? 1 : 0);
            }
        }
        ViewParent parent = this.f24477r.getParent();
        if (parent != null) {
            if (this.f24462c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.f24477r.getLayoutManager().v1();
        }
        this.f24472m.onSelectedChanged(this.f24462c, this.f24473n);
        this.f24477r.invalidate();
    }

    public final void f() {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e {
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        public static int makeFlag(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int makeMovementFlags(int i10, int i11) {
            return makeFlag(2, i10) | makeFlag(1, i11) | makeFlag(0, i11 | i10);
        }

        public final int a(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(Z2.b.f20208d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.E e10, RecyclerView.E e11) {
            return true;
        }

        public RecyclerView.E chooseDropTarget(RecyclerView.E e10, List<RecyclerView.E> list, int i10, int i11) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = e10.itemView.getWidth() + i10;
            int height = e10.itemView.getHeight() + i11;
            int left2 = i10 - e10.itemView.getLeft();
            int top2 = i11 - e10.itemView.getTop();
            int size = list.size();
            RecyclerView.E e11 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.E e12 = list.get(i13);
                if (left2 > 0 && (right = e12.itemView.getRight() - width) < 0 && e12.itemView.getRight() > e10.itemView.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    e11 = e12;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = e12.itemView.getLeft() - i10) > 0 && e12.itemView.getLeft() < e10.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    e11 = e12;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = e12.itemView.getTop() - i11) > 0 && e12.itemView.getTop() < e10.itemView.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    e11 = e12;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = e12.itemView.getBottom() - height) < 0 && e12.itemView.getBottom() > e10.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    e11 = e12;
                    i12 = iAbs;
                }
            }
            return e11;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.E e10) {
            a3.c.f20937a.a(e10.itemView);
        }

        public int convertToAbsoluteDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (3158064 & i15) >> 2;
            }
            return i12 | i14;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.E e10) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, e10), E.w(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i10 == 8 ? 200L : 250L : i10 == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.E e10) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.E e10);

        public float getSwipeThreshold(RecyclerView.E e10) {
            return 0.5f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.E e10) {
            return (getAbsoluteMovementFlags(recyclerView, e10) & 16711680) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int iSignum = (int) (((int) (((int) Math.signum(i11)) * a(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)))) * sDragScrollInterpolator.getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f));
            return iSignum == 0 ? i11 > 0 ? 1 : -1 : iSignum;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.E e10, float f10, float f11, int i10, boolean z10) {
            a3.c.f20937a.c(canvas, recyclerView, e10.itemView, f10, f11, i10, z10);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.E e10, float f10, float f11, int i10, boolean z10) {
            a3.c.f20937a.d(canvas, recyclerView, e10.itemView, f10, f11, i10, z10);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.E e10, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                gVar.e();
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, gVar.f24500e, gVar.f24505j, gVar.f24506k, gVar.f24501f, false);
                canvas.restoreToCount(iSave);
            }
            if (e10 != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, e10, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.E e10, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, gVar.f24500e, gVar.f24505j, gVar.f24506k, gVar.f24501f, false);
                canvas.restoreToCount(iSave);
            }
            if (e10 != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, e10, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = list.get(i12);
                boolean z11 = gVar2.f24508m;
                if (z11 && !gVar2.f24504i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.E e10, RecyclerView.E e11);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.E e10, int i10, RecyclerView.E e11, int i11, int i12, int i13) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof InterfaceC0312h) {
                ((InterfaceC0312h) layoutManager).b(e10.itemView, e11.itemView, i12, i13);
                return;
            }
            if (layoutManager.l()) {
                if (layoutManager.R(e11.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.l1(i11);
                }
                if (layoutManager.U(e11.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.l1(i11);
                }
            }
            if (layoutManager.m()) {
                if (layoutManager.V(e11.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.l1(i11);
                }
                if (layoutManager.P(e11.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.l1(i11);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.E e10, int i10) {
            if (e10 != null) {
                a3.c.f20937a.b(e10.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.E e10, int i10);

        public float getSwipeEscapeVelocity(float f10) {
            return f10;
        }

        public float getSwipeVelocityThreshold(float f10) {
            return f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f24496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f24497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f24498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f24499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final RecyclerView.E f24500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f24501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ValueAnimator f24502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f24503h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f24504i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f24505j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f24506k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f24507l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f24508m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f24509n;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.E e10, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f24501f = i11;
            this.f24503h = i10;
            this.f24500e = e10;
            this.f24496a = f10;
            this.f24497b = f11;
            this.f24498c = f12;
            this.f24499d = f13;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f24502g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(e10.itemView);
            valueAnimatorOfFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f24502g.cancel();
        }

        public void b(long j10) {
            this.f24502g.setDuration(j10);
        }

        public void c(float f10) {
            this.f24509n = f10;
        }

        public void d() {
            this.f24500e.setIsRecyclable(false);
            this.f24502g.start();
        }

        public void e() {
            float f10 = this.f24496a;
            float f11 = this.f24498c;
            if (f10 == f11) {
                this.f24505j = this.f24500e.itemView.getTranslationX();
            } else {
                this.f24505j = f10 + (this.f24509n * (f11 - f10));
            }
            float f12 = this.f24497b;
            float f13 = this.f24499d;
            if (f12 == f13) {
                this.f24506k = this.f24500e.itemView.getTranslationY();
            } else {
                this.f24506k = f12 + (this.f24509n * (f13 - f12));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f24508m) {
                this.f24500e.setIsRecyclable(true);
            }
            this.f24508m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }
}
