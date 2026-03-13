package e7;

import Y0.E;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: e7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3946a extends C3948c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f33779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OverScroller f33780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VelocityTracker f33785j;

    /* JADX INFO: renamed from: e7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class RunnableC0424a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f33786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f33787b;

        public RunnableC0424a(CoordinatorLayout coordinatorLayout, View view) {
            this.f33786a = coordinatorLayout;
            this.f33787b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f33787b == null || (overScroller = AbstractC3946a.this.f33780e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC3946a.this.N(this.f33786a, this.f33787b);
                return;
            }
            AbstractC3946a abstractC3946a = AbstractC3946a.this;
            abstractC3946a.P(this.f33786a, this.f33787b, abstractC3946a.f33780e.getCurrY());
            E.X(this.f33787b, this);
        }
    }

    public AbstractC3946a() {
        this.f33782g = -1;
        this.f33784i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r8
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f33782g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f33783h = r1
            goto L4b
        L2d:
            int r1 = r9.f33782g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f33783h
            int r3 = r3 - r1
            r9.f33783h = r1
            int r4 = r9.K(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.O(r1, r2, r3, r4, r5)
        L4b:
            r1 = r7
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f33785j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f33785j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f33785j
            int r3 = r9.f33782g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.L(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.J(r1, r2, r3, r4, r5)
            r1 = r8
            goto L72
        L71:
            r1 = r7
        L72:
            r9.f33781f = r7
            r9.f33782g = r6
            android.view.VelocityTracker r2 = r9.f33785j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f33785j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f33785j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r0 = r9.f33781f
            if (r0 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.AbstractC3946a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean H(View view) {
        return false;
    }

    public final void I() {
        if (this.f33785j == null) {
            this.f33785j = VelocityTracker.obtain();
        }
    }

    public final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f33779d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f33779d = null;
        }
        if (this.f33780e == null) {
            this.f33780e = new OverScroller(view.getContext());
        }
        this.f33780e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f33780e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        RunnableC0424a runnableC0424a = new RunnableC0424a(coordinatorLayout, view);
        this.f33779d = runnableC0424a;
        E.X(view, runnableC0424a);
        return true;
    }

    public int K(View view) {
        return -view.getHeight();
    }

    public int L(View view) {
        return view.getHeight();
    }

    public int M() {
        return E();
    }

    public final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    public int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int iC;
        int iE = E();
        if (i11 == 0 || iE < i11 || iE > i12 || iE == (iC = S0.a.c(i10, i11, i12))) {
            return 0;
        }
        G(iC);
        return iE - iC;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f33784i < 0) {
            this.f33784i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f33781f) {
            int i10 = this.f33782g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f33783h) > this.f33784i) {
                this.f33783h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f33782g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(view) && coordinatorLayout.z(view, x10, y11);
            this.f33781f = z10;
            if (z10) {
                this.f33783h = y11;
                this.f33782g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f33780e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f33780e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f33785j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC3946a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33782g = -1;
        this.f33784i = -1;
    }

    public void N(CoordinatorLayout coordinatorLayout, View view) {
    }
}
