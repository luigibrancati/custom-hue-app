package androidx.recyclerview.widget;

import Y0.E;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f extends RecyclerView.o implements RecyclerView.t {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f24405D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f24406E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f24407A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Runnable f24408B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RecyclerView.u f24409C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f24412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f24413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f24416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f24417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f24422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f24425p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f24428s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f24435z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f24426q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24427r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f24429t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24430u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24431v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24432w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f24433x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f24434y = new int[2];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.m(500);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            f.this.x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24438a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24438a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f24438a) {
                this.f24438a = false;
                return;
            }
            if (((Float) f.this.f24435z.getAnimatedValue()).floatValue() == 0.0f) {
                f fVar = f.this;
                fVar.f24407A = 0;
                fVar.u(0);
            } else {
                f fVar2 = f.this;
                fVar2.f24407A = 2;
                fVar2.r();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            f.this.f24412c.setAlpha(iFloatValue);
            f.this.f24413d.setAlpha(iFloatValue);
            f.this.r();
        }
    }

    public f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f24435z = valueAnimatorOfFloat;
        this.f24407A = 0;
        this.f24408B = new a();
        this.f24409C = new b();
        this.f24412c = stateListDrawable;
        this.f24413d = drawable;
        this.f24416g = stateListDrawable2;
        this.f24417h = drawable2;
        this.f24414e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f24415f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f24418i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f24419j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f24410a = i11;
        this.f24411b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        f(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f24431v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zQ = q(motionEvent.getX(), motionEvent.getY());
            boolean zP = p(motionEvent.getX(), motionEvent.getY());
            if (zQ || zP) {
                if (zP) {
                    this.f24432w = 1;
                    this.f24425p = (int) motionEvent.getX();
                } else if (zQ) {
                    this.f24432w = 2;
                    this.f24422m = (int) motionEvent.getY();
                }
                u(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f24431v == 2) {
            this.f24422m = 0.0f;
            this.f24425p = 0.0f;
            u(1);
            this.f24432w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f24431v == 2) {
            w();
            if (this.f24432w == 1) {
                n(motionEvent.getX());
            }
            if (this.f24432w == 2) {
                y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f24431v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zQ = q(motionEvent.getX(), motionEvent.getY());
        boolean zP = p(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zQ && !zP)) {
            return false;
        }
        if (zP) {
            this.f24432w = 1;
            this.f24425p = (int) motionEvent.getX();
        } else if (zQ) {
            this.f24432w = 2;
            this.f24422m = (int) motionEvent.getY();
        }
        u(2);
        return true;
    }

    public void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f24428s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f24428s = recyclerView;
        if (recyclerView != null) {
            v();
        }
    }

    public final void g() {
        this.f24428s.removeCallbacks(this.f24408B);
    }

    public final void h() {
        this.f24428s.Z0(this);
        this.f24428s.b1(this);
        this.f24428s.c1(this.f24409C);
        g();
    }

    public final void i(Canvas canvas) {
        int i10 = this.f24427r;
        int i11 = this.f24418i;
        int i12 = this.f24424o;
        int i13 = this.f24423n;
        this.f24416g.setBounds(0, 0, i13, i11);
        this.f24417h.setBounds(0, 0, this.f24426q, this.f24419j);
        canvas.translate(0.0f, i10 - i11);
        this.f24417h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f24416g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void j(Canvas canvas) {
        int i10 = this.f24426q;
        int i11 = this.f24414e;
        int i12 = i10 - i11;
        int i13 = this.f24421l;
        int i14 = this.f24420k;
        int i15 = i13 - (i14 / 2);
        this.f24412c.setBounds(0, 0, i11, i14);
        this.f24413d.setBounds(0, 0, this.f24415f, this.f24427r);
        if (!o()) {
            canvas.translate(i12, 0.0f);
            this.f24413d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f24412c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f24413d.draw(canvas);
        canvas.translate(this.f24414e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f24412c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f24414e, -i15);
    }

    public final int[] k() {
        int[] iArr = this.f24434y;
        int i10 = this.f24411b;
        iArr[0] = i10;
        iArr[1] = this.f24426q - i10;
        return iArr;
    }

    public final int[] l() {
        int[] iArr = this.f24433x;
        int i10 = this.f24411b;
        iArr[0] = i10;
        iArr[1] = this.f24427r - i10;
        return iArr;
    }

    public void m(int i10) {
        int i11 = this.f24407A;
        if (i11 == 1) {
            this.f24435z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f24407A = 3;
        ValueAnimator valueAnimator = this.f24435z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f24435z.setDuration(i10);
        this.f24435z.start();
    }

    public final void n(float f10) {
        int[] iArrK = k();
        float fMax = Math.max(iArrK[0], Math.min(iArrK[1], f10));
        if (Math.abs(this.f24424o - fMax) < 2.0f) {
            return;
        }
        int iT = t(this.f24425p, fMax, iArrK, this.f24428s.computeHorizontalScrollRange(), this.f24428s.computeHorizontalScrollOffset(), this.f24426q);
        if (iT != 0) {
            this.f24428s.scrollBy(iT, 0);
        }
        this.f24425p = fMax;
    }

    public final boolean o() {
        return E.w(this.f24428s) == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (this.f24426q != this.f24428s.getWidth() || this.f24427r != this.f24428s.getHeight()) {
            this.f24426q = this.f24428s.getWidth();
            this.f24427r = this.f24428s.getHeight();
            u(0);
        } else if (this.f24407A != 0) {
            if (this.f24429t) {
                j(canvas);
            }
            if (this.f24430u) {
                i(canvas);
            }
        }
    }

    public boolean p(float f10, float f11) {
        if (f11 < this.f24427r - this.f24418i) {
            return false;
        }
        int i10 = this.f24424o;
        int i11 = this.f24423n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    public boolean q(float f10, float f11) {
        if (o()) {
            if (f10 > this.f24414e) {
                return false;
            }
        } else if (f10 < this.f24426q - this.f24414e) {
            return false;
        }
        int i10 = this.f24421l;
        int i11 = this.f24420k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    public void r() {
        this.f24428s.invalidate();
    }

    public final void s(int i10) {
        g();
        this.f24428s.postDelayed(this.f24408B, i10);
    }

    public final int t(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void u(int i10) {
        if (i10 == 2 && this.f24431v != 2) {
            this.f24412c.setState(f24405D);
            g();
        }
        if (i10 == 0) {
            r();
        } else {
            w();
        }
        if (this.f24431v == 2 && i10 != 2) {
            this.f24412c.setState(f24406E);
            s(1200);
        } else if (i10 == 1) {
            s(1500);
        }
        this.f24431v = i10;
    }

    public final void v() {
        this.f24428s.h(this);
        this.f24428s.k(this);
        this.f24428s.l(this.f24409C);
    }

    public void w() {
        int i10 = this.f24407A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f24435z.cancel();
            }
        }
        this.f24407A = 1;
        ValueAnimator valueAnimator = this.f24435z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f24435z.setDuration(500L);
        this.f24435z.setStartDelay(0L);
        this.f24435z.start();
    }

    public void x(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f24428s.computeVerticalScrollRange();
        int i12 = this.f24427r;
        this.f24429t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f24410a;
        int iComputeHorizontalScrollRange = this.f24428s.computeHorizontalScrollRange();
        int i13 = this.f24426q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f24410a;
        this.f24430u = z10;
        boolean z11 = this.f24429t;
        if (!z11 && !z10) {
            if (this.f24431v != 0) {
                u(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f24421l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f24420k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f24430u) {
            float f11 = i13;
            this.f24424o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f24423n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f24431v;
        if (i14 == 0 || i14 == 1) {
            u(1);
        }
    }

    public final void y(float f10) {
        int[] iArrL = l();
        float fMax = Math.max(iArrL[0], Math.min(iArrL[1], f10));
        if (Math.abs(this.f24421l - fMax) < 2.0f) {
            return;
        }
        int iT = t(this.f24422m, fMax, iArrL, this.f24428s.computeVerticalScrollRange(), this.f24428s.computeVerticalScrollOffset(), this.f24427r);
        if (iT != 0) {
            this.f24428s.scrollBy(0, iT);
        }
        this.f24422m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z10) {
    }
}
