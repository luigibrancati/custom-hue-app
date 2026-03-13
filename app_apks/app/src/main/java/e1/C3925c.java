package e1;

import Y0.E;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: renamed from: e1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C3925c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Interpolator f33548x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33550b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f33552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f33553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f33554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f33555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f33556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f33557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f33558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f33560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f33561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f33562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f33564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f33565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OverScroller f33566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0418c f33567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f33568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f33569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f33570v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33551c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f33571w = new b();

    /* JADX INFO: renamed from: e1.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: e1.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3925c.this.E(0);
        }
    }

    public C3925c(Context context, ViewGroup viewGroup, AbstractC0418c abstractC0418c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0418c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f33570v = viewGroup;
        this.f33567s = abstractC0418c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f33564p = i10;
        this.f33563o = i10;
        this.f33550b = viewConfiguration.getScaledTouchSlop();
        this.f33561m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f33562n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f33566r = new OverScroller(context, f33548x);
    }

    public static C3925c l(ViewGroup viewGroup, float f10, AbstractC0418c abstractC0418c) {
        C3925c c3925cM = m(viewGroup, abstractC0418c);
        c3925cM.f33550b = (int) (c3925cM.f33550b * (1.0f / f10));
        return c3925cM;
    }

    public static C3925c m(ViewGroup viewGroup, AbstractC0418c abstractC0418c) {
        return new C3925c(viewGroup.getContext(), viewGroup, abstractC0418c);
    }

    public final void A() {
        this.f33560l.computeCurrentVelocity(1000, this.f33561m);
        n(e(this.f33560l.getXVelocity(this.f33551c), this.f33562n, this.f33561m), e(this.f33560l.getYVelocity(this.f33551c), this.f33562n, this.f33561m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [e1.c$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void B(float f10, float f11, int i10) {
        boolean zC = c(f10, f11, i10, 1);
        ?? r02 = zC;
        if (c(f11, f10, i10, 4)) {
            r02 = (zC ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (c(f10, f11, i10, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (c(f11, f10, i10, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f33557i;
            iArr[i10] = iArr[i10] | r04;
            this.f33567s.f(r04, i10);
        }
    }

    public final void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f33552d;
        this.f33554f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f33553e;
        this.f33555g[i10] = f11;
        fArr2[i10] = f11;
        this.f33556h[i10] = t((int) f10, (int) f11);
        this.f33559k |= 1 << i10;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f33554f[pointerId] = x10;
                this.f33555g[pointerId] = y10;
            }
        }
    }

    public void E(int i10) {
        this.f33570v.removeCallbacks(this.f33571w);
        if (this.f33549a != i10) {
            this.f33549a = i10;
            this.f33567s.j(i10);
            if (this.f33549a == 0) {
                this.f33568t = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f33569u) {
            return s(i10, i11, (int) this.f33560l.getXVelocity(this.f33551c), (int) this.f33560l.getYVelocity(this.f33551c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C3925c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i10, int i11) {
        this.f33568t = view;
        this.f33551c = -1;
        boolean zS = s(i10, i11, 0, 0);
        if (!zS && this.f33549a == 0 && this.f33568t != null) {
            this.f33568t = null;
        }
        return zS;
    }

    public boolean I(View view, int i10) {
        if (view == this.f33568t && this.f33551c == i10) {
            return true;
        }
        if (view == null || !this.f33567s.m(view, i10)) {
            return false;
        }
        this.f33551c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f33551c = -1;
        g();
        VelocityTracker velocityTracker = this.f33560l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33560l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f33570v) {
            this.f33568t = view;
            this.f33551c = i10;
            this.f33567s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f33570v + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f33556h[i10] & i11) == i11 && (this.f33565q & i11) != 0 && (this.f33558j[i10] & i11) != i11 && (this.f33557i[i10] & i11) != i11) {
            int i12 = this.f33550b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f33567s.g(i11)) {
                    int[] iArr = this.f33558j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f33557i[i10] & i11) == 0 && fAbs > this.f33550b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f33567s.d(view) > 0;
        boolean z11 = this.f33567s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f33550b) : z11 && Math.abs(f11) > ((float) this.f33550b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f33550b;
        return f12 > ((float) (i10 * i10));
    }

    public final float e(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        return fAbs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int f(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        return iAbs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void g() {
        float[] fArr = this.f33552d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f33553e, 0.0f);
        Arrays.fill(this.f33554f, 0.0f);
        Arrays.fill(this.f33555g, 0.0f);
        Arrays.fill(this.f33556h, 0);
        Arrays.fill(this.f33557i, 0);
        Arrays.fill(this.f33558j, 0);
        this.f33559k = 0;
    }

    public final void h(int i10) {
        if (this.f33552d == null || !w(i10)) {
            return;
        }
        this.f33552d[i10] = 0.0f;
        this.f33553e[i10] = 0.0f;
        this.f33554f[i10] = 0.0f;
        this.f33555g[i10] = 0.0f;
        this.f33556h[i10] = 0;
        this.f33557i[i10] = 0;
        this.f33558j[i10] = 0;
        this.f33559k = (~(1 << i10)) & this.f33559k;
    }

    public final int i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f33570v.getWidth();
        float f10 = width / 2;
        float fO = f10 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), PipesConfigBase.DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS);
    }

    public final int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iF = f(i12, (int) this.f33562n, (int) this.f33561m);
        int iF2 = f(i13, (int) this.f33562n, (int) this.f33561m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iF != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iF2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((i(i10, iF, this.f33567s.d(view)) * f14) + (i(i11, iF2, this.f33567s.e(view)) * (f12 / f13)));
    }

    public boolean k(boolean z10) {
        if (this.f33549a == 2) {
            boolean zComputeScrollOffset = this.f33566r.computeScrollOffset();
            int currX = this.f33566r.getCurrX();
            int currY = this.f33566r.getCurrY();
            int left = currX - this.f33568t.getLeft();
            int top = currY - this.f33568t.getTop();
            if (left != 0) {
                E.Q(this.f33568t, left);
            }
            if (top != 0) {
                E.R(this.f33568t, top);
            }
            if (left != 0 || top != 0) {
                this.f33567s.k(this.f33568t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f33566r.getFinalX() && currY == this.f33566r.getFinalY()) {
                this.f33566r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f33570v.post(this.f33571w);
                } else {
                    E(0);
                }
            }
        }
        return this.f33549a == 2;
    }

    public final void n(float f10, float f11) {
        this.f33569u = true;
        this.f33567s.l(this.f33568t, f10, f11);
        this.f33569u = false;
        if (this.f33549a == 1) {
            E(0);
        }
    }

    public final float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void p(int i10, int i11, int i12, int i13) {
        int left = this.f33568t.getLeft();
        int top = this.f33568t.getTop();
        if (i12 != 0) {
            i10 = this.f33567s.a(this.f33568t, i10, i12);
            E.Q(this.f33568t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f33567s.b(this.f33568t, i11, i13);
            E.R(this.f33568t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f33567s.k(this.f33568t, i14, i15, i14 - left, i15 - top);
    }

    public final void q(int i10) {
        float[] fArr = this.f33552d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f33553e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f33554f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f33555g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f33556h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f33557i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f33558j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f33552d = fArr2;
            this.f33553e = fArr3;
            this.f33554f = fArr4;
            this.f33555g = fArr5;
            this.f33556h = iArr;
            this.f33557i = iArr2;
            this.f33558j = iArr3;
        }
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f33570v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f33570v.getChildAt(this.f33567s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f33568t.getLeft();
        int top = this.f33568t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f33566r.abortAnimation();
            E(0);
            return false;
        }
        this.f33566r.startScroll(left, top, i14, i15, j(this.f33568t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    public final int t(int i10, int i11) {
        int i12 = i10 < this.f33570v.getLeft() + this.f33563o ? 1 : 0;
        if (i11 < this.f33570v.getTop() + this.f33563o) {
            i12 |= 4;
        }
        if (i10 > this.f33570v.getRight() - this.f33563o) {
            i12 |= 2;
        }
        return i11 > this.f33570v.getBottom() - this.f33563o ? i12 | 8 : i12;
    }

    public int u() {
        return this.f33550b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f33568t, i10, i11);
    }

    public boolean w(int i10) {
        return (this.f33559k & (1 << i10)) != 0;
    }

    public final boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f33560l == null) {
            this.f33560l = VelocityTracker.obtain();
        }
        this.f33560l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(viewR, pointerId);
            int i12 = this.f33556h[pointerId];
            int i13 = this.f33565q;
            if ((i12 & i13) != 0) {
                this.f33567s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f33549a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f33549a == 1) {
                if (x(this.f33551c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f33551c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f33554f;
                    int i14 = this.f33551c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f33555g[i14]);
                    p(this.f33568t.getLeft() + i15, this.f33568t.getTop() + i16, i15, i16);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f33552d[pointerId2];
                    float f11 = y12 - this.f33553e[pointerId2];
                    B(f10, f11, pointerId2);
                    if (this.f33549a != 1) {
                        View viewR2 = r((int) x12, (int) y12);
                        if (d(viewR2, f10, f11) && I(viewR2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f33549a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            C(x13, y13, pointerId3);
            if (this.f33549a != 0) {
                if (v((int) x13, (int) y13)) {
                    I(this.f33568t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x13, (int) y13), pointerId3);
                int i17 = this.f33556h[pointerId3];
                int i18 = this.f33565q;
                if ((i17 & i18) != 0) {
                    this.f33567s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f33549a == 1 && pointerId4 == this.f33551c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f33551c) {
                    View viewR3 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f33568t;
                    if (viewR3 == view && I(view, pointerId5)) {
                        i10 = this.f33551c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                A();
            }
        }
        h(pointerId4);
    }

    /* JADX INFO: renamed from: e1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0418c {
        public int a(View view, int i10, int i11) {
            return 0;
        }

        public int b(View view, int i10, int i11) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void j(int i10) {
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public void l(View view, float f10, float f11) {
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
        }
    }
}
