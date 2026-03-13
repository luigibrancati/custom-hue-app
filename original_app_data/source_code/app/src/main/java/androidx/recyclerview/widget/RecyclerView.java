package androidx.recyclerview.widget;

import Y0.C2547a;
import Y0.C2564s;
import Y0.H;
import Z0.h;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d1.AbstractC3806a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final int[] f24069R0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final boolean f24070S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final boolean f24071T0 = true;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final boolean f24072U0 = true;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final boolean f24073V0 = true;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final boolean f24074W0 = false;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final boolean f24075X0 = false;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final Class[] f24076Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final Interpolator f24077Z0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f24078A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f24079A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f24080B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f24081B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f24082C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public m.b f24083C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f24084D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f24085D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f24086E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public androidx.recyclerview.widget.n f24087E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f24088F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public k f24089F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f24090G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final int[] f24091G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public l f24092H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public C2564s f24093H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public EdgeEffect f24094I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final int[] f24095I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public EdgeEffect f24096J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final int[] f24097J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final int[] f24098K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final List f24099L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public Runnable f24100M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f24101N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f24102O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public EdgeEffect f24103P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f24104P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public EdgeEffect f24105Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final s.b f24106Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public m f24107R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f24108S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f24109T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public VelocityTracker f24110V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f24111W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f24112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f24113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f24114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f24115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f24116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.s f24117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f24119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f24120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f24121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f24122k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f24123k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f24124l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f24125l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p f24126m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f24127m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f24128n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f24129n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f24130o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public s f24131o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f24132p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f24133p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f24134q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f24135q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24136r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f24137r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24138s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f24139s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f24140t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f24141t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24142u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final D f24143u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24144v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public androidx.recyclerview.widget.g f24145v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24146w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public g.b f24147w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24148x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final B f24149x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f24150y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public u f24151y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f24152z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public List f24153z0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f24155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f24156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f24159f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f24161h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24154a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f24160g = new a(0, 0);

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24163b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f24164c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f24165d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f24166e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f24167f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f24168g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.f24165d >= 0;
            }

            public void b(int i10) {
                this.f24165d = i10;
            }

            public void c(RecyclerView recyclerView) {
                int i10 = this.f24165d;
                if (i10 >= 0) {
                    this.f24165d = -1;
                    recyclerView.y0(i10);
                    this.f24167f = false;
                } else {
                    if (!this.f24167f) {
                        this.f24168g = 0;
                        return;
                    }
                    e();
                    recyclerView.f24143u0.e(this.f24162a, this.f24163b, this.f24164c, this.f24166e);
                    int i11 = this.f24168g + 1;
                    this.f24168g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f24167f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f24162a = i10;
                this.f24163b = i11;
                this.f24164c = i12;
                this.f24166e = interpolator;
                this.f24167f = true;
            }

            public final void e() {
                if (this.f24166e != null && this.f24164c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f24164c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f24165d = -1;
                this.f24167f = false;
                this.f24168g = 0;
                this.f24162a = i10;
                this.f24163b = i11;
                this.f24164c = i12;
                this.f24166e = interpolator;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f24155b.f24126m.D(i10);
        }

        public int c() {
            return this.f24155b.f24126m.K();
        }

        public int d(View view) {
            return this.f24155b.g0(view);
        }

        public p e() {
            return this.f24156c;
        }

        public int f() {
            return this.f24154a;
        }

        public boolean g() {
            return this.f24157d;
        }

        public boolean h() {
            return this.f24158e;
        }

        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f24155b;
            if (this.f24154a == -1 || recyclerView == null) {
                r();
            }
            if (this.f24157d && this.f24159f == null && this.f24156c != null && (pointFA = a(this.f24154a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.k1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f24157d = false;
            View view = this.f24159f;
            if (view != null) {
                if (d(view) == this.f24154a) {
                    o(this.f24159f, recyclerView.f24149x0, this.f24160g);
                    this.f24160g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f24159f = null;
                }
            }
            if (this.f24158e) {
                l(i10, i11, recyclerView.f24149x0, this.f24160g);
                boolean zA = this.f24160g.a();
                this.f24160g.c(recyclerView);
                if (zA && this.f24158e) {
                    this.f24157d = true;
                    recyclerView.f24143u0.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f24159f = view;
            }
        }

        public abstract void l(int i10, int i11, B b10, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, B b10, a aVar);

        public void p(int i10) {
            this.f24154a = i10;
        }

        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f24143u0.f();
            if (this.f24161h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f24155b = recyclerView;
            this.f24156c = pVar;
            int i10 = this.f24154a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f24149x0.f24169a = i10;
            this.f24158e = true;
            this.f24157d = true;
            this.f24159f = b(f());
            m();
            this.f24155b.f24143u0.d();
            this.f24161h = true;
        }

        public final void r() {
            if (this.f24158e) {
                this.f24158e = false;
                n();
                this.f24155b.f24149x0.f24169a = -1;
                this.f24159f = null;
                this.f24154a = -1;
                this.f24157d = false;
                this.f24156c.g1(this);
                this.f24156c = null;
                this.f24155b = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray f24170b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f24181m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f24182n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f24183o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f24184p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f24185q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24169a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24171c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24172d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24173e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24174f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f24175g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f24176h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f24177i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f24178j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f24179k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f24180l = false;

        public void a(int i10) {
            if ((this.f24173e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f24173e));
        }

        public int b() {
            return this.f24176h ? this.f24171c - this.f24172d : this.f24174f;
        }

        public int c() {
            return this.f24169a;
        }

        public boolean d() {
            return this.f24169a != -1;
        }

        public boolean e() {
            return this.f24176h;
        }

        public void f(h hVar) {
            this.f24173e = 1;
            this.f24174f = hVar.getItemCount();
            this.f24176h = false;
            this.f24177i = false;
            this.f24178j = false;
        }

        public boolean g() {
            return this.f24180l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f24169a + ", mData=" + this.f24170b + ", mItemCount=" + this.f24174f + ", mIsMeasuring=" + this.f24178j + ", mPreviousLayoutItemCount=" + this.f24171c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f24172d + ", mStructureChanged=" + this.f24175g + ", mInPreLayout=" + this.f24176h + ", mRunSimpleAnimations=" + this.f24179k + ", mRunPredictiveAnimations=" + this.f24180l + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class C {
        public abstract View a(w wVar, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class D implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public OverScroller f24188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Interpolator f24189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f24191f;

        public D() {
            Interpolator interpolator = RecyclerView.f24077Z0;
            this.f24189d = interpolator;
            this.f24190e = false;
            this.f24191f = false;
            this.f24188c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f24187b = 0;
            this.f24186a = 0;
            Interpolator interpolator = this.f24189d;
            Interpolator interpolator2 = RecyclerView.f24077Z0;
            if (interpolator != interpolator2) {
                this.f24189d = interpolator2;
                this.f24188c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f24188c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            Y0.E.X(RecyclerView.this, this);
        }

        public void d() {
            if (this.f24190e) {
                this.f24191f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f24077Z0;
            }
            if (this.f24189d != interpolator) {
                this.f24189d = interpolator;
                this.f24188c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f24187b = 0;
            this.f24186a = 0;
            RecyclerView.this.setScrollState(2);
            this.f24188c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f24188c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f24126m == null) {
                f();
                return;
            }
            this.f24191f = false;
            this.f24190e = true;
            recyclerView.v();
            OverScroller overScroller = this.f24188c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f24186a;
                int i13 = currY - this.f24187b;
                this.f24186a = currX;
                this.f24187b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f24098K0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f24098K0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f24124l != null) {
                    int[] iArr3 = recyclerView3.f24098K0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.k1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f24098K0;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    i12 -= i14;
                    i13 -= i15;
                    A a10 = recyclerView4.f24126m.f24216g;
                    if (a10 != null && !a10.g() && a10.h()) {
                        int iB = RecyclerView.this.f24149x0.b();
                        if (iB == 0) {
                            a10.r();
                        } else if (a10.f() >= iB) {
                            a10.p(iB - 1);
                            a10.j(i14, i15);
                        } else {
                            a10.j(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = i12;
                int i17 = i13;
                if (!RecyclerView.this.f24130o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f24098K0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f24098K0;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.J(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                A a11 = RecyclerView.this.f24126m.f24216g;
                if ((a11 == null || !a11.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i20, currVelocity);
                    }
                    if (RecyclerView.f24073V0) {
                        RecyclerView.this.f24147w0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.g gVar = recyclerView7.f24145v0;
                    if (gVar != null) {
                        gVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            A a12 = RecyclerView.this.f24126m.f24216g;
            if (a12 != null && a12.g()) {
                a12.j(0, 0);
            }
            this.f24190e = false;
            if (this.f24191f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.x1(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class E {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        public final View itemView;
        h mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        E mShadowedHolder = null;
        E mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public E(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public final void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(RecognitionOptions.UPC_E);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && Y0.E.I(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.d0(this);
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int iD0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iD0 = this.mOwnerRecyclerView.d0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iD0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & RecognitionOptions.UPC_E) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (this.mFlags & i10) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !Y0.E.I(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f24236c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = Y0.E.u(this.itemView);
            }
            recyclerView.n1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.n1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.s(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(w wVar, boolean z10) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.J(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class RunnableC2764a implements Runnable {
        public RunnableC2764a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f24142u || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f24136r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f24148x) {
                recyclerView2.f24146w = true;
            } else {
                recyclerView2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class RunnableC2765b implements Runnable {
        public RunnableC2765b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f24107R;
            if (mVar != null) {
                mVar.v();
            }
            RecyclerView.this.f24085D0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class InterpolatorC2766c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C2767d implements s.b {
        public C2767d() {
        }

        @Override // androidx.recyclerview.widget.s.b
        public void a(E e10, m.c cVar, m.c cVar2) {
            RecyclerView.this.m(e10, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.s.b
        public void b(E e10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f24126m.n1(e10.itemView, recyclerView.f24113b);
        }

        @Override // androidx.recyclerview.widget.s.b
        public void c(E e10, m.c cVar, m.c cVar2) {
            RecyclerView.this.f24113b.J(e10);
            RecyclerView.this.o(e10, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.s.b
        public void d(E e10, m.c cVar, m.c cVar2) {
            e10.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f24084D) {
                if (recyclerView.f24107R.b(e10, e10, cVar, cVar2)) {
                    RecyclerView.this.P0();
                }
            } else if (recyclerView.f24107R.d(e10, cVar, cVar2)) {
                RecyclerView.this.P0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C2768e implements c.b {
        public C2768e() {
        }

        @Override // androidx.recyclerview.widget.c.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void b(View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 != null) {
                eI0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.c.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.c.b
        public E d(View view) {
            return RecyclerView.i0(view);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void e(int i10) {
            E eI0;
            View viewA = a(i10);
            if (viewA != null && (eI0 = RecyclerView.i0(viewA)) != null) {
                if (eI0.isTmpDetached() && !eI0.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + eI0 + RecyclerView.this.Q());
                }
                eI0.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.z(view);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void g() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.A(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.c.b
        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void i(View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 != null) {
                eI0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.c.b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 != null) {
                if (!eI0.isTmpDetached() && !eI0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + eI0 + RecyclerView.this.Q());
                }
                eI0.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements a.InterfaceC0309a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public void a(int i10, int i11) {
            RecyclerView.this.F0(i10, i11);
            RecyclerView.this.f24079A0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public void d(int i10, int i11) {
            RecyclerView.this.G0(i10, i11, false);
            RecyclerView.this.f24079A0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.A1(i10, i11, obj);
            RecyclerView.this.f24081B0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public E f(int i10) {
            E eB0 = RecyclerView.this.b0(i10, true);
            if (eB0 == null || RecyclerView.this.f24116e.n(eB0.itemView)) {
                return null;
            }
            return eB0;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public void g(int i10, int i11) {
            RecyclerView.this.E0(i10, i11);
            RecyclerView.this.f24079A0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0309a
        public void h(int i10, int i11) {
            RecyclerView.this.G0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f24079A0 = true;
            recyclerView.f24149x0.f24172d += i11;
        }

        public void i(a.b bVar) {
            int i10 = bVar.f24319a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f24126m.S0(recyclerView, bVar.f24320b, bVar.f24322d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f24126m.V0(recyclerView2, bVar.f24320b, bVar.f24322d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f24126m.X0(recyclerView3, bVar.f24320b, bVar.f24322d, bVar.f24321c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f24126m.U0(recyclerView4, bVar.f24320b, bVar.f24322d, 1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24198a;

        static {
            int[] iArr = new int[h.a.values().length];
            f24198a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24198a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class h {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(E e10, int i10) {
            boolean z10 = e10.mBindingAdapter == null;
            if (z10) {
                e10.mPosition = i10;
                if (hasStableIds()) {
                    e10.mItemId = getItemId(i10);
                }
                e10.setFlags(1, 519);
                U0.m.a("RV OnBindView");
            }
            e10.mBindingAdapter = this;
            onBindViewHolder(e10, i10, e10.getUnmodifiedPayloads());
            if (z10) {
                e10.clearPayload();
                ViewGroup.LayoutParams layoutParams = e10.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f24236c = true;
                }
                U0.m.b();
            }
        }

        public boolean canRestoreState() {
            int i10 = g.f24198a[this.mStateRestorationPolicy.ordinal()];
            return i10 != 1 && (i10 != 2 || getItemCount() > 0);
        }

        public final E createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                U0.m.a("RV CreateView");
                E eOnCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (eOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                eOnCreateViewHolder.mItemViewType = i10;
                return eOnCreateViewHolder;
            } finally {
                U0.m.b();
            }
        }

        public int findRelativeAdapterPositionIn(h hVar, E e10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.c(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.b(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.e(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.f(i10, 1);
        }

        public abstract void onBindViewHolder(E e10, int i10);

        public void onBindViewHolder(E e10, int i10, List<Object> list) {
            onBindViewHolder(e10, i10);
        }

        public abstract E onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(E e10) {
            return false;
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.d(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(E e10) {
        }

        public void onViewDetachedFromWindow(E e10) {
        }

        public void onViewRecycled(E e10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11, 1);
            }
        }

        public void c(int i10, int i11) {
            d(i10, i11, null);
        }

        public void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
            }
        }

        public void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface k {
        int a(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l {
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class n implements m.b {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(E e10) {
            e10.setIsRecyclable(true);
            if (e10.mShadowedHolder != null && e10.mShadowingHolder == null) {
                e10.mShadowedHolder = null;
            }
            e10.mShadowingHolder = null;
            if (e10.shouldBeKeptAsChild() || RecyclerView.this.Y0(e10.itemView) || !e10.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e10.itemView, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, B b10) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface r {
        void b(View view);

        void d(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray f24238a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24239b = 0;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f24240a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24241b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f24242c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f24243d = 0;
        }

        public void a() {
            this.f24239b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f24238a.size(); i10++) {
                ((a) this.f24238a.valueAt(i10)).f24240a.clear();
            }
        }

        public void c() {
            this.f24239b--;
        }

        public void d(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f24243d = j(aVarG.f24243d, j10);
        }

        public void e(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f24242c = j(aVarG.f24242c, j10);
        }

        public E f(int i10) {
            a aVar = (a) this.f24238a.get(i10);
            if (aVar == null || aVar.f24240a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f24240a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((E) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (E) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i10) {
            a aVar = (a) this.f24238a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f24238a.put(i10, aVar2);
            return aVar2;
        }

        public void h(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                c();
            }
            if (!z10 && this.f24239b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(E e10) {
            int itemViewType = e10.getItemViewType();
            ArrayList arrayList = g(itemViewType).f24240a;
            if (((a) this.f24238a.get(itemViewType)).f24241b <= arrayList.size()) {
                return;
            }
            e10.resetInternal();
            arrayList.add(e10);
        }

        public long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f24243d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f24242c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f24244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f24245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f24246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f24247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public v f24250g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C f24251h;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f24244a = arrayList;
            this.f24245b = null;
            this.f24246c = new ArrayList();
            this.f24247d = Collections.unmodifiableList(arrayList);
            this.f24248e = 2;
            this.f24249f = 2;
        }

        public void A(int i10) {
            a((E) this.f24246c.get(i10), true);
            this.f24246c.remove(i10);
        }

        public void B(View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (eI0.isScrap()) {
                eI0.unScrap();
            } else if (eI0.wasReturnedFromScrap()) {
                eI0.clearReturnedFromScrapFlag();
            }
            C(eI0);
            if (RecyclerView.this.f24107R == null || eI0.isRecyclable()) {
                return;
            }
            RecyclerView.this.f24107R.j(eI0);
        }

        public void C(E e10) {
            boolean z10;
            boolean z11 = true;
            if (e10.isScrap() || e10.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(e10.isScrap());
                sb2.append(" isAttached:");
                sb2.append(e10.itemView.getParent() != null);
                sb2.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (e10.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e10 + RecyclerView.this.Q());
            }
            if (e10.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            }
            boolean zDoesTransientStatePreventRecycling = e10.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f24124l;
            if ((hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(e10)) || e10.isRecyclable()) {
                if (this.f24249f <= 0 || e10.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f24246c.size();
                    if (size >= this.f24249f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f24073V0 && size > 0 && !RecyclerView.this.f24147w0.d(e10.mPosition)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f24147w0.d(((E) this.f24246c.get(i10)).mPosition)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f24246c.add(size, e10);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(e10, true);
                }
                z = z10;
            } else {
                z11 = false;
            }
            RecyclerView.this.f24117f.q(e10);
            if (z || z11 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            e10.mBindingAdapter = null;
            e10.mOwnerRecyclerView = null;
        }

        public void D(View view) {
            E eI0 = RecyclerView.i0(view);
            if (!eI0.hasAnyOfTheFlags(12) && eI0.isUpdated() && !RecyclerView.this.q(eI0)) {
                if (this.f24245b == null) {
                    this.f24245b = new ArrayList();
                }
                eI0.setScrapContainer(this, true);
                this.f24245b.add(eI0);
                return;
            }
            if (!eI0.isInvalid() || eI0.isRemoved() || RecyclerView.this.f24124l.hasStableIds()) {
                eI0.setScrapContainer(this, false);
                this.f24244a.add(eI0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
            }
        }

        public void E(v vVar) {
            v vVar2 = this.f24250g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f24250g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f24250g.a();
        }

        public void F(C c10) {
            this.f24251h = c10;
        }

        public void G(int i10) {
            this.f24248e = i10;
            K();
        }

        public final boolean H(E e10, int i10, int i11, long j10) {
            e10.mBindingAdapter = null;
            e10.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = e10.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f24250g.k(itemViewType, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f24124l.bindViewHolder(e10, i10);
            this.f24250g.d(e10.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e10);
            if (!RecyclerView.this.f24149x0.e()) {
                return true;
            }
            e10.mPreLayoutPosition = i11;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0221 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.E I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 608
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$E");
        }

        public void J(E e10) {
            if (e10.mInChangeScrap) {
                this.f24245b.remove(e10);
            } else {
                this.f24244a.remove(e10);
            }
            e10.mScrapContainer = null;
            e10.mInChangeScrap = false;
            e10.clearReturnedFromScrapFlag();
        }

        public void K() {
            p pVar = RecyclerView.this.f24126m;
            this.f24249f = this.f24248e + (pVar != null ? pVar.f24222m : 0);
            for (int size = this.f24246c.size() - 1; size >= 0 && this.f24246c.size() > this.f24249f; size--) {
                A(size);
            }
        }

        public boolean L(E e10) {
            if (e10.isRemoved()) {
                return RecyclerView.this.f24149x0.e();
            }
            int i10 = e10.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.f24124l.getItemCount()) {
                if (RecyclerView.this.f24149x0.e() || RecyclerView.this.f24124l.getItemViewType(e10.mPosition) == e10.getItemViewType()) {
                    return !RecyclerView.this.f24124l.hasStableIds() || e10.getItemId() == RecyclerView.this.f24124l.getItemId(e10.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e10 + RecyclerView.this.Q());
        }

        public void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f24246c.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f24246c.get(size);
                if (e10 != null && (i12 = e10.mPosition) >= i10 && i12 < i13) {
                    e10.addFlags(2);
                    A(size);
                }
            }
        }

        public void a(E e10, boolean z10) {
            RecyclerView.s(e10);
            View view = e10.itemView;
            androidx.recyclerview.widget.n nVar = RecyclerView.this.f24087E0;
            if (nVar != null) {
                C2547a c2547aN = nVar.n();
                Y0.E.f0(view, c2547aN instanceof n.a ? ((n.a) c2547aN).n(view) : null);
            }
            if (z10) {
                g(e10);
            }
            e10.mBindingAdapter = null;
            e10.mOwnerRecyclerView = null;
            i().i(e10);
        }

        public final void b(E e10) {
            if (RecyclerView.this.v0()) {
                View view = e10.itemView;
                if (Y0.E.u(view) == 0) {
                    Y0.E.n0(view, 1);
                }
                androidx.recyclerview.widget.n nVar = RecyclerView.this.f24087E0;
                if (nVar == null) {
                    return;
                }
                C2547a c2547aN = nVar.n();
                if (c2547aN instanceof n.a) {
                    ((n.a) c2547aN).o(view);
                }
                Y0.E.f0(view, c2547aN);
            }
        }

        public void c() {
            this.f24244a.clear();
            z();
        }

        public void d() {
            int size = this.f24246c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((E) this.f24246c.get(i10)).clearOldPosition();
            }
            int size2 = this.f24244a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((E) this.f24244a.get(i11)).clearOldPosition();
            }
            ArrayList arrayList = this.f24245b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((E) this.f24245b.get(i12)).clearOldPosition();
                }
            }
        }

        public void e() {
            this.f24244a.clear();
            ArrayList arrayList = this.f24245b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f24149x0.b()) {
                return !RecyclerView.this.f24149x0.e() ? i10 : RecyclerView.this.f24115d.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f24149x0.b() + RecyclerView.this.Q());
        }

        public void g(E e10) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f24128n.size() > 0) {
                android.support.v4.media.session.a.a(RecyclerView.this.f24128n.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f24124l;
            if (hVar != null) {
                hVar.onViewRecycled(e10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f24149x0 != null) {
                recyclerView.f24117f.q(e10);
            }
        }

        public E h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f24245b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    E e10 = (E) this.f24245b.get(i11);
                    if (!e10.wasReturnedFromScrap() && e10.getLayoutPosition() == i10) {
                        e10.addFlags(32);
                        return e10;
                    }
                }
                if (RecyclerView.this.f24124l.hasStableIds() && (iM = RecyclerView.this.f24115d.m(i10)) > 0 && iM < RecyclerView.this.f24124l.getItemCount()) {
                    long itemId = RecyclerView.this.f24124l.getItemId(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        E e11 = (E) this.f24245b.get(i12);
                        if (!e11.wasReturnedFromScrap() && e11.getItemId() == itemId) {
                            e11.addFlags(32);
                            return e11;
                        }
                    }
                }
            }
            return null;
        }

        public v i() {
            if (this.f24250g == null) {
                this.f24250g = new v();
            }
            return this.f24250g;
        }

        public int j() {
            return this.f24244a.size();
        }

        public List k() {
            return this.f24247d;
        }

        public E l(long j10, int i10, boolean z10) {
            for (int size = this.f24244a.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f24244a.get(size);
                if (e10.getItemId() == j10 && !e10.wasReturnedFromScrap()) {
                    if (i10 == e10.getItemViewType()) {
                        e10.addFlags(32);
                        if (e10.isRemoved() && !RecyclerView.this.f24149x0.e()) {
                            e10.setFlags(2, 14);
                        }
                        return e10;
                    }
                    if (!z10) {
                        this.f24244a.remove(size);
                        RecyclerView.this.removeDetachedView(e10.itemView, false);
                        y(e10.itemView);
                    }
                }
            }
            int size2 = this.f24246c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                E e11 = (E) this.f24246c.get(size2);
                if (e11.getItemId() == j10 && !e11.isAttachedToTransitionOverlay()) {
                    if (i10 == e11.getItemViewType()) {
                        if (!z10) {
                            this.f24246c.remove(size2);
                        }
                        return e11;
                    }
                    if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public E m(int i10, boolean z10) {
            View viewE;
            int size = this.f24244a.size();
            for (int i11 = 0; i11 < size; i11++) {
                E e10 = (E) this.f24244a.get(i11);
                if (!e10.wasReturnedFromScrap() && e10.getLayoutPosition() == i10 && !e10.isInvalid() && (RecyclerView.this.f24149x0.f24176h || !e10.isRemoved())) {
                    e10.addFlags(32);
                    return e10;
                }
            }
            if (z10 || (viewE = RecyclerView.this.f24116e.e(i10)) == null) {
                int size2 = this.f24246c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    E e11 = (E) this.f24246c.get(i12);
                    if (!e11.isInvalid() && e11.getLayoutPosition() == i10 && !e11.isAttachedToTransitionOverlay()) {
                        if (!z10) {
                            this.f24246c.remove(i12);
                        }
                        return e11;
                    }
                }
                return null;
            }
            E eI0 = RecyclerView.i0(viewE);
            RecyclerView.this.f24116e.s(viewE);
            int iM = RecyclerView.this.f24116e.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f24116e.d(iM);
                D(viewE);
                eI0.addFlags(8224);
                return eI0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + eI0 + RecyclerView.this.Q());
        }

        public View n(int i10) {
            return ((E) this.f24244a.get(i10)).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        public View p(int i10, boolean z10) {
            return I(i10, z10, Long.MAX_VALUE).itemView;
        }

        public final void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(E e10) {
            View view = e10.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f24246c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((E) this.f24246c.get(i10)).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f24236c = true;
                }
            }
        }

        public void t() {
            int size = this.f24246c.size();
            for (int i10 = 0; i10 < size; i10++) {
                E e10 = (E) this.f24246c.get(i10);
                if (e10 != null) {
                    e10.addFlags(6);
                    e10.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f24124l;
            if (hVar == null || !hVar.hasStableIds()) {
                z();
            }
        }

        public void u(int i10, int i11) {
            int size = this.f24246c.size();
            for (int i12 = 0; i12 < size; i12++) {
                E e10 = (E) this.f24246c.get(i12);
                if (e10 != null && e10.mPosition >= i10) {
                    e10.offsetPosition(i11, false);
                }
            }
        }

        public void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f24246c.size();
            for (int i16 = 0; i16 < size; i16++) {
                E e10 = (E) this.f24246c.get(i16);
                if (e10 != null && (i15 = e10.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        e10.offsetPosition(i11 - i10, false);
                    } else {
                        e10.offsetPosition(i12, false);
                    }
                }
            }
        }

        public void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f24246c.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f24246c.get(size);
                if (e10 != null) {
                    int i13 = e10.mPosition;
                    if (i13 >= i12) {
                        e10.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        e10.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        public void x(h hVar, h hVar2, boolean z10) {
            c();
            i().h(hVar, hVar2, z10);
        }

        public void y(View view) {
            E eI0 = RecyclerView.i0(view);
            eI0.mScrapContainer = null;
            eI0.mInChangeScrap = false;
            eI0.clearReturnedFromScrapFlag();
            C(eI0);
        }

        public void z() {
            for (int size = this.f24246c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f24246c.clear();
            if (RecyclerView.f24073V0) {
                RecyclerView.this.f24147w0.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface x {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class y extends j {
        public y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f24115d.r(i10, i11, obj)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f24115d.s(i10, i11)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11, int i12) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f24115d.t(i10, i11, i12)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f24115d.u(i10, i11)) {
                f();
            }
        }

        public void f() {
            if (RecyclerView.f24072U0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f24138s && recyclerView.f24136r) {
                    Y0.E.X(recyclerView, recyclerView.f24119h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f24078A = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f24076Y0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f24077Z0 = new InterpolatorC2766c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Z2.a.f20204a);
    }

    public static RecyclerView X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewX = X(viewGroup.getChildAt(i10));
            if (recyclerViewX != null) {
                return recyclerViewX;
            }
        }
        return null;
    }

    private C2564s getScrollingChildHelper() {
        if (this.f24093H0 == null) {
            this.f24093H0 = new C2564s(this);
        }
        return this.f24093H0;
    }

    public static E i0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f24234a;
    }

    public static void j0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f24235b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    public static void s(E e10) {
        WeakReference<RecyclerView> weakReference = e10.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == e10.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            e10.mNestedRecyclerView = null;
        }
    }

    public void A(View view) {
        E eI0 = i0(view);
        I0(view);
        h hVar = this.f24124l;
        if (hVar != null && eI0 != null) {
            hVar.onViewDetachedFromWindow(eI0);
        }
        List list = this.f24082C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f24082C.get(size)).b(view);
            }
        }
    }

    public void A0() {
        int iJ = this.f24116e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eI0 = i0(this.f24116e.i(i10));
            if (eI0 != null && !eI0.shouldIgnore()) {
                eI0.addFlags(6);
            }
        }
        z0();
        this.f24113b.t();
    }

    public void A1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f24116e.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f24116e.i(i14);
            E eI0 = i0(viewI);
            if (eI0 != null && !eI0.shouldIgnore() && (i12 = eI0.mPosition) >= i10 && i12 < i13) {
                eI0.addFlags(2);
                eI0.addChangePayload(obj);
                ((q) viewI.getLayoutParams()).f24236c = true;
            }
        }
        this.f24113b.M(i10, i11);
    }

    public final void B() {
        int i10 = this.f24152z;
        this.f24152z = 0;
        if (i10 == 0 || !v0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(RecognitionOptions.PDF417);
        Z0.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public final void B0(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.f24126m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f24148x) {
            return;
        }
        int[] iArr = this.f24098K0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zL = pVar.l();
        boolean zM = this.f24126m.m();
        v1(zM ? (zL ? 1 : 0) | 2 : zL ? 1 : 0, i12);
        if (G(zL ? i10 : 0, zM ? i11 : 0, this.f24098K0, this.f24095I0, i12)) {
            int[] iArr2 = this.f24098K0;
            i10 -= iArr2[0];
            i11 -= iArr2[1];
        }
        j1(zL ? i10 : 0, zM ? i11 : 0, motionEvent, i12);
        androidx.recyclerview.widget.g gVar = this.f24145v0;
        if (gVar != null && (i10 != 0 || i11 != 0)) {
            gVar.f(this, i10, i11);
        }
        x1(i12);
    }

    public void C() {
        if (this.f24124l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f24126m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f24149x0.f24178j = false;
        boolean z10 = this.f24101N0 && !(this.f24102O0 == getWidth() && this.f24104P0 == getHeight());
        this.f24102O0 = 0;
        this.f24104P0 = 0;
        this.f24101N0 = false;
        if (this.f24149x0.f24173e == 1) {
            D();
            this.f24126m.A1(this);
            E();
        } else if (this.f24115d.q() || z10 || this.f24126m.p0() != getWidth() || this.f24126m.X() != getHeight()) {
            this.f24126m.A1(this);
            E();
        } else {
            this.f24126m.A1(this);
        }
        F();
    }

    public void C0(int i10) {
        int iG = this.f24116e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f24116e.f(i11).offsetLeftAndRight(i10);
        }
    }

    public final void D() {
        this.f24149x0.a(1);
        R(this.f24149x0);
        this.f24149x0.f24178j = false;
        u1();
        this.f24117f.f();
        J0();
        R0();
        h1();
        B b10 = this.f24149x0;
        b10.f24177i = b10.f24179k && this.f24081B0;
        this.f24081B0 = false;
        this.f24079A0 = false;
        b10.f24176h = b10.f24180l;
        b10.f24174f = this.f24124l.getItemCount();
        W(this.f24091G0);
        if (this.f24149x0.f24179k) {
            int iG = this.f24116e.g();
            for (int i10 = 0; i10 < iG; i10++) {
                E eI0 = i0(this.f24116e.f(i10));
                if (!eI0.shouldIgnore() && (!eI0.isInvalid() || this.f24124l.hasStableIds())) {
                    this.f24117f.e(eI0, this.f24107R.u(this.f24149x0, eI0, m.e(eI0), eI0.getUnmodifiedPayloads()));
                    if (this.f24149x0.f24177i && eI0.isUpdated() && !eI0.isRemoved() && !eI0.shouldIgnore() && !eI0.isInvalid()) {
                        this.f24117f.c(e0(eI0), eI0);
                    }
                }
            }
        }
        if (this.f24149x0.f24180l) {
            i1();
            B b11 = this.f24149x0;
            boolean z10 = b11.f24175g;
            b11.f24175g = false;
            this.f24126m.Y0(this.f24113b, b11);
            this.f24149x0.f24175g = z10;
            for (int i11 = 0; i11 < this.f24116e.g(); i11++) {
                E eI02 = i0(this.f24116e.f(i11));
                if (!eI02.shouldIgnore() && !this.f24117f.i(eI02)) {
                    int iE = m.e(eI02);
                    boolean zHasAnyOfTheFlags = eI02.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iE |= RecognitionOptions.AZTEC;
                    }
                    m.c cVarU = this.f24107R.u(this.f24149x0, eI02, iE, eI02.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        U0(eI02, cVarU);
                    } else {
                        this.f24117f.a(eI02, cVarU);
                    }
                }
            }
            t();
        } else {
            t();
        }
        K0();
        w1(false);
        this.f24149x0.f24173e = 2;
    }

    public void D0(int i10) {
        int iG = this.f24116e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f24116e.f(i11).offsetTopAndBottom(i10);
        }
    }

    public final void E() {
        u1();
        J0();
        this.f24149x0.a(6);
        this.f24115d.j();
        this.f24149x0.f24174f = this.f24124l.getItemCount();
        this.f24149x0.f24172d = 0;
        if (this.f24114c != null && this.f24124l.canRestoreState()) {
            Parcelable parcelable = this.f24114c.f24254c;
            if (parcelable != null) {
                this.f24126m.d1(parcelable);
            }
            this.f24114c = null;
        }
        B b10 = this.f24149x0;
        b10.f24176h = false;
        this.f24126m.Y0(this.f24113b, b10);
        B b11 = this.f24149x0;
        b11.f24175g = false;
        b11.f24179k = b11.f24179k && this.f24107R != null;
        b11.f24173e = 4;
        K0();
        w1(false);
    }

    public void E0(int i10, int i11) {
        int iJ = this.f24116e.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            E eI0 = i0(this.f24116e.i(i12));
            if (eI0 != null && !eI0.shouldIgnore() && eI0.mPosition >= i10) {
                eI0.offsetPosition(i11, false);
                this.f24149x0.f24175g = true;
            }
        }
        this.f24113b.u(i10, i11);
        requestLayout();
    }

    public final void F() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.f24149x0.a(4);
        u1();
        J0();
        B b10 = this.f24149x0;
        b10.f24173e = 1;
        if (b10.f24179k) {
            int iG = this.f24116e.g() - 1;
            while (iG >= 0) {
                E eI0 = i0(this.f24116e.f(iG));
                if (eI0.shouldIgnore()) {
                    recyclerView2 = this;
                } else {
                    long jE0 = this.e0(eI0);
                    m.c cVarT = this.f24107R.t(this.f24149x0, eI0);
                    E eG = this.f24117f.g(jE0);
                    if (eG == null || eG.shouldIgnore()) {
                        recyclerView2 = this;
                        recyclerView2.f24117f.d(eI0, cVarT);
                    } else {
                        boolean zH = this.f24117f.h(eG);
                        boolean zH2 = this.f24117f.h(eI0);
                        if (zH && eG == eI0) {
                            this.f24117f.d(eI0, cVarT);
                        } else {
                            m.c cVarN = this.f24117f.n(eG);
                            this.f24117f.d(eI0, cVarT);
                            m.c cVarM = this.f24117f.m(eI0);
                            if (cVarN == null) {
                                this.n0(jE0, eI0, eG);
                            } else {
                                recyclerView2 = this;
                                recyclerView2.n(eG, eI0, cVarN, cVarM, zH, zH2);
                            }
                        }
                        recyclerView2 = this;
                    }
                }
                iG--;
                this = recyclerView2;
            }
            recyclerView = this;
            recyclerView.f24117f.o(recyclerView.f24106Q0);
        } else {
            recyclerView = this;
        }
        recyclerView.f24126m.m1(recyclerView.f24113b);
        B b11 = recyclerView.f24149x0;
        b11.f24171c = b11.f24174f;
        recyclerView.f24084D = false;
        recyclerView.f24086E = false;
        b11.f24179k = false;
        b11.f24180l = false;
        recyclerView.f24126m.f24217h = false;
        ArrayList arrayList = recyclerView.f24113b.f24245b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.f24126m;
        if (pVar.f24223n) {
            pVar.f24222m = 0;
            pVar.f24223n = false;
            recyclerView.f24113b.K();
        }
        recyclerView.f24126m.Z0(recyclerView.f24149x0);
        recyclerView.K0();
        recyclerView.w1(false);
        recyclerView.f24117f.f();
        int[] iArr = recyclerView.f24091G0;
        if (recyclerView.y(iArr[0], iArr[1])) {
            recyclerView.J(0, 0);
        }
        recyclerView.V0();
        recyclerView.f1();
    }

    public void F0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f24116e.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            E eI0 = i0(this.f24116e.i(i16));
            if (eI0 != null && (i15 = eI0.mPosition) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    eI0.offsetPosition(i11 - i10, false);
                } else {
                    eI0.offsetPosition(i14, false);
                }
                this.f24149x0.f24175g = true;
            }
        }
        this.f24113b.v(i10, i11);
        requestLayout();
    }

    public boolean G(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void G0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f24116e.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            E eI0 = i0(this.f24116e.i(i13));
            if (eI0 != null && !eI0.shouldIgnore()) {
                int i14 = eI0.mPosition;
                if (i14 >= i12) {
                    eI0.offsetPosition(-i11, z10);
                    this.f24149x0.f24175g = true;
                } else if (i14 >= i10) {
                    eI0.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.f24149x0.f24175g = true;
                }
            }
        }
        this.f24113b.w(i10, i11, z10);
        requestLayout();
    }

    public final void H(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void I(int i10) {
        p pVar = this.f24126m;
        if (pVar != null) {
            pVar.f1(i10);
        }
        N0(i10);
        u uVar = this.f24151y0;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List list = this.f24153z0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f24153z0.get(size)).a(this, i10);
            }
        }
    }

    public void J(int i10, int i11) {
        this.f24090G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        O0(i10, i11);
        u uVar = this.f24151y0;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List list = this.f24153z0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f24153z0.get(size)).b(this, i10, i11);
            }
        }
        this.f24090G--;
    }

    public void J0() {
        this.f24088F++;
    }

    public void K() {
        int i10;
        for (int size = this.f24099L0.size() - 1; size >= 0; size--) {
            E e10 = (E) this.f24099L0.get(size);
            if (e10.itemView.getParent() == this && !e10.shouldIgnore() && (i10 = e10.mPendingAccessibilityState) != -1) {
                Y0.E.n0(e10.itemView, i10);
                e10.mPendingAccessibilityState = -1;
            }
        }
        this.f24099L0.clear();
    }

    public void K0() {
        L0(true);
    }

    public final boolean L(MotionEvent motionEvent) {
        t tVar = this.f24134q;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return V(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f24134q = null;
        }
        return true;
    }

    public void L0(boolean z10) {
        int i10 = this.f24088F - 1;
        this.f24088F = i10;
        if (i10 < 1) {
            this.f24088F = 0;
            if (z10) {
                B();
                K();
            }
        }
    }

    public void M() {
        if (this.f24105Q != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24092H.a(this, 3);
        this.f24105Q = edgeEffectA;
        if (this.f24118g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void M0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f24109T) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f24109T = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f24125l0 = x10;
            this.f24111W = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f24127m0 = y10;
            this.f24123k0 = y10;
        }
    }

    public void N() {
        if (this.f24094I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24092H.a(this, 0);
        this.f24094I = edgeEffectA;
        if (this.f24118g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void O() {
        if (this.f24103P != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24092H.a(this, 2);
        this.f24103P = edgeEffectA;
        if (this.f24118g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void P() {
        if (this.f24096J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f24092H.a(this, 1);
        this.f24096J = edgeEffectA;
        if (this.f24118g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void P0() {
        if (this.f24085D0 || !this.f24136r) {
            return;
        }
        Y0.E.X(this, this.f24100M0);
        this.f24085D0 = true;
    }

    public String Q() {
        return StringUtils.SPACE + super.toString() + ", adapter:" + this.f24124l + ", layout:" + this.f24126m + ", context:" + getContext();
    }

    public final boolean Q0() {
        return this.f24107R != null && this.f24126m.M1();
    }

    public final void R(B b10) {
        if (getScrollState() != 2) {
            b10.f24184p = 0;
            b10.f24185q = 0;
        } else {
            OverScroller overScroller = this.f24143u0.f24188c;
            b10.f24184p = overScroller.getFinalX() - overScroller.getCurrX();
            b10.f24185q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public final void R0() {
        boolean z10;
        if (this.f24084D) {
            this.f24115d.y();
            if (this.f24086E) {
                this.f24126m.T0(this);
            }
        }
        if (Q0()) {
            this.f24115d.w();
        } else {
            this.f24115d.j();
        }
        boolean z11 = this.f24079A0 || this.f24081B0;
        this.f24149x0.f24179k = this.f24142u && this.f24107R != null && ((z10 = this.f24084D) || z11 || this.f24126m.f24217h) && (!z10 || this.f24124l.hasStableIds());
        B b10 = this.f24149x0;
        b10.f24180l = b10.f24179k && z11 && !this.f24084D && Q0();
    }

    public View S(float f10, float f11) {
        for (int iG = this.f24116e.g() - 1; iG >= 0; iG--) {
            View viewF = this.f24116e.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f10 >= viewF.getLeft() + translationX && f10 <= viewF.getRight() + translationX && f11 >= viewF.getTop() + translationY && f11 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    public void S0(boolean z10) {
        this.f24086E = z10 | this.f24086E;
        this.f24084D = true;
        A0();
    }

    public View T(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.N()
            android.widget.EdgeEffect r1 = r6.f24094I
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            c1.d.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.O()
            android.widget.EdgeEffect r1 = r6.f24103P
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            c1.d.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.P()
            android.widget.EdgeEffect r9 = r6.f24096J
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            c1.d.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.M()
            android.widget.EdgeEffect r9 = r6.f24105Q
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            c1.d.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            Y0.E.W(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.T0(float, float, float, float):void");
    }

    public E U(View view) {
        View viewT = T(view);
        if (viewT == null) {
            return null;
        }
        return h0(viewT);
    }

    public void U0(E e10, m.c cVar) {
        e10.setFlags(0, 8192);
        if (this.f24149x0.f24177i && e10.isUpdated() && !e10.isRemoved() && !e10.shouldIgnore()) {
            this.f24117f.c(e0(e10), e10);
        }
        this.f24117f.e(e10, cVar);
    }

    public final boolean V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f24132p.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) this.f24132p.get(i10);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.f24134q = tVar;
                return true;
            }
        }
        return false;
    }

    public final void V0() {
        View viewFindViewById;
        if (!this.f24141t0 || this.f24124l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f24075X0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f24116e.n(focusedChild)) {
                    return;
                }
            } else if (this.f24116e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewY = null;
        E eA0 = (this.f24149x0.f24182n == -1 || !this.f24124l.hasStableIds()) ? null : a0(this.f24149x0.f24182n);
        if (eA0 != null && !this.f24116e.n(eA0.itemView) && eA0.itemView.hasFocusable()) {
            viewY = eA0.itemView;
        } else if (this.f24116e.g() > 0) {
            viewY = Y();
        }
        if (viewY != null) {
            int i10 = this.f24149x0.f24183o;
            if (i10 != -1 && (viewFindViewById = viewY.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewY = viewFindViewById;
            }
            viewY.requestFocus();
        }
    }

    public final void W(int[] iArr) {
        int iG = this.f24116e.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            E eI0 = i0(this.f24116e.f(i12));
            if (!eI0.shouldIgnore()) {
                int layoutPosition = eI0.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final void W0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f24094I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f24094I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f24096J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f24096J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f24103P;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f24103P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f24105Q;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f24105Q.isFinished();
        }
        if (zIsFinished) {
            Y0.E.W(this);
        }
    }

    public void X0() {
        m mVar = this.f24107R;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f24126m;
        if (pVar != null) {
            pVar.l1(this.f24113b);
            this.f24126m.m1(this.f24113b);
        }
        this.f24113b.c();
    }

    public final View Y() {
        E eZ;
        B b10 = this.f24149x0;
        int i10 = b10.f24181m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = b10.b();
        for (int i11 = i10; i11 < iB; i11++) {
            E eZ2 = Z(i11);
            if (eZ2 == null) {
                break;
            }
            if (eZ2.itemView.hasFocusable()) {
                return eZ2.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (eZ = Z(iMin)) == null) {
                return null;
            }
        } while (!eZ.itemView.hasFocusable());
        return eZ.itemView;
    }

    public boolean Y0(View view) {
        u1();
        boolean zR = this.f24116e.r(view);
        if (zR) {
            E eI0 = i0(view);
            this.f24113b.J(eI0);
            this.f24113b.C(eI0);
        }
        w1(!zR);
        return zR;
    }

    public E Z(int i10) {
        E e10 = null;
        if (this.f24084D) {
            return null;
        }
        int iJ = this.f24116e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            E eI0 = i0(this.f24116e.i(i11));
            if (eI0 != null && !eI0.isRemoved() && d0(eI0) == i10) {
                if (!this.f24116e.n(eI0.itemView)) {
                    return eI0;
                }
                e10 = eI0;
            }
        }
        return e10;
    }

    public void Z0(o oVar) {
        p pVar = this.f24126m;
        if (pVar != null) {
            pVar.h("Cannot remove item decoration during a scroll  or layout");
        }
        this.f24130o.remove(oVar);
        if (this.f24130o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        z0();
        requestLayout();
    }

    public E a0(long j10) {
        h hVar = this.f24124l;
        E e10 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.f24116e.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                E eI0 = i0(this.f24116e.i(i10));
                if (eI0 != null && !eI0.isRemoved() && eI0.getItemId() == j10) {
                    if (!this.f24116e.n(eI0.itemView)) {
                        return eI0;
                    }
                    e10 = eI0;
                }
            }
        }
        return e10;
    }

    public void a1(r rVar) {
        List list = this.f24082C;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        p pVar = this.f24126m;
        if (pVar == null || !pVar.G0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            N();
            if (this.f24094I.isFinished()) {
                this.f24094I.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            O();
            if (this.f24103P.isFinished()) {
                this.f24103P.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            P();
            if (this.f24096J.isFinished()) {
                this.f24096J.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            M();
            if (this.f24105Q.isFinished()) {
                this.f24105Q.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        Y0.E.W(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.E b0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.c r0 = r5.f24116e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.c r3 = r5.f24116e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$E r3 = i0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.c r1 = r5.f24116e
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b0(int, boolean):androidx.recyclerview.widget.RecyclerView$E");
    }

    public void b1(t tVar) {
        this.f24132p.remove(tVar);
        if (this.f24134q == tVar) {
            this.f24134q = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public boolean c0(int i10, int i11) {
        p pVar = this.f24126m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f24148x) {
            return false;
        }
        int iL = pVar.l();
        boolean zM = this.f24126m.m();
        if (iL == 0 || Math.abs(i10) < this.f24133p0) {
            i10 = 0;
        }
        if (!zM || Math.abs(i11) < this.f24133p0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = iL != 0 || zM;
            dispatchNestedFling(f10, f11, z10);
            s sVar = this.f24131o0;
            if (sVar != null && sVar.a(i10, i11)) {
                return true;
            }
            if (z10) {
                if (zM) {
                    iL = (iL == true ? 1 : 0) | 2;
                }
                v1(iL, 1);
                int i12 = this.f24135q0;
                int iMax = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.f24135q0;
                this.f24143u0.b(iMax, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    public void c1(u uVar) {
        List list = this.f24153z0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f24126m.n((q) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        p pVar = this.f24126m;
        if (pVar != null && pVar.l()) {
            return this.f24126m.r(this.f24149x0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        p pVar = this.f24126m;
        if (pVar != null && pVar.l()) {
            return this.f24126m.s(this.f24149x0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        p pVar = this.f24126m;
        if (pVar != null && pVar.l()) {
            return this.f24126m.t(this.f24149x0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        p pVar = this.f24126m;
        if (pVar != null && pVar.m()) {
            return this.f24126m.u(this.f24149x0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        p pVar = this.f24126m;
        if (pVar != null && pVar.m()) {
            return this.f24126m.v(this.f24149x0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        p pVar = this.f24126m;
        if (pVar != null && pVar.m()) {
            return this.f24126m.w(this.f24149x0);
        }
        return 0;
    }

    public int d0(E e10) {
        if (e10.hasAnyOfTheFlags(524) || !e10.isBound()) {
            return -1;
        }
        return this.f24115d.e(e10.mPosition);
    }

    public void d1() {
        E e10;
        int iG = this.f24116e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f24116e.f(i10);
            E eH0 = h0(viewF);
            if (eH0 != null && (e10 = eH0.mShadowingHolder) != null) {
                View view = e10.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f24130o.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f24130o.get(i10)).onDrawOver(canvas, this, this.f24149x0);
        }
        EdgeEffect edgeEffect = this.f24094I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f24118g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f24094I;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f24096J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f24118g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f24096J;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f24103P;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f24118g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f24103P;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f24105Q;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f24118g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f24105Q;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f24107R == null || this.f24130o.size() <= 0 || !this.f24107R.p()) ? z10 : true) {
            Y0.E.W(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public long e0(E e10) {
        return this.f24124l.hasStableIds() ? e10.getItemId() : e10.mPosition;
    }

    public final void e1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f24120i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f24236c) {
                Rect rect = qVar.f24235b;
                Rect rect2 = this.f24120i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f24120i);
            offsetRectIntoDescendantCoords(view, this.f24120i);
        }
        this.f24126m.t1(this, view, this.f24120i, !this.f24142u, view2 == null);
    }

    public int f0(View view) {
        E eI0 = i0(view);
        if (eI0 != null) {
            return eI0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public final void f1() {
        B b10 = this.f24149x0;
        b10.f24182n = -1L;
        b10.f24181m = -1;
        b10.f24183o = -1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewK0;
        boolean z10;
        View viewR0 = this.f24126m.R0(view, i10);
        if (viewR0 != null) {
            return viewR0;
        }
        boolean z11 = (this.f24124l == null || this.f24126m == null || w0() || this.f24148x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f24126m.m()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f24074W0) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f24126m.l()) {
                int i12 = (this.f24126m.a0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f24074W0) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                v();
                if (T(view) == null) {
                    return null;
                }
                u1();
                this.f24126m.K0(view, i10, this.f24113b, this.f24149x0);
                w1(false);
            }
            viewK0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                v();
                if (T(view) == null) {
                    return null;
                }
                u1();
                viewK0 = this.f24126m.K0(view, i10, this.f24113b, this.f24149x0);
                w1(false);
            } else {
                viewK0 = viewFindNextFocus;
            }
        }
        if (viewK0 == null || viewK0.hasFocusable()) {
            return x0(view, viewK0, i10) ? viewK0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        e1(viewK0, null);
        return view;
    }

    public final void g(E e10) {
        View view = e10.itemView;
        boolean z10 = view.getParent() == this;
        this.f24113b.J(h0(view));
        if (e10.isTmpDetached()) {
            this.f24116e.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f24116e.k(view);
        } else {
            this.f24116e.b(view, true);
        }
    }

    public int g0(View view) {
        E eI0 = i0(view);
        if (eI0 != null) {
            return eI0.getLayoutPosition();
        }
        return -1;
    }

    public final void g1() {
        VelocityTracker velocityTracker = this.f24110V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        x1(0);
        W0();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f24126m;
        if (pVar != null) {
            return pVar.E();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f24126m;
        if (pVar != null) {
            return pVar.F(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f24124l;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f24126m;
        return pVar != null ? pVar.H() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        k kVar = this.f24089F0;
        return kVar == null ? super.getChildDrawingOrder(i10, i11) : kVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f24118g;
    }

    public androidx.recyclerview.widget.n getCompatAccessibilityDelegate() {
        return this.f24087E0;
    }

    public l getEdgeEffectFactory() {
        return this.f24092H;
    }

    public m getItemAnimator() {
        return this.f24107R;
    }

    public int getItemDecorationCount() {
        return this.f24130o.size();
    }

    public p getLayoutManager() {
        return this.f24126m;
    }

    public int getMaxFlingVelocity() {
        return this.f24135q0;
    }

    public int getMinFlingVelocity() {
        return this.f24133p0;
    }

    public long getNanoTime() {
        if (f24073V0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f24131o0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f24141t0;
    }

    public v getRecycledViewPool() {
        return this.f24113b.i();
    }

    public int getScrollState() {
        return this.f24108S;
    }

    public void h(o oVar) {
        i(oVar, -1);
    }

    public E h0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return i0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void h1() {
        View focusedChild = (this.f24141t0 && hasFocus() && this.f24124l != null) ? getFocusedChild() : null;
        E eU = focusedChild != null ? U(focusedChild) : null;
        if (eU == null) {
            f1();
            return;
        }
        this.f24149x0.f24182n = this.f24124l.hasStableIds() ? eU.getItemId() : -1L;
        this.f24149x0.f24181m = this.f24084D ? -1 : eU.isRemoved() ? eU.mOldPosition : eU.getAbsoluteAdapterPosition();
        this.f24149x0.f24183o = k0(eU.itemView);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(o oVar, int i10) {
        p pVar = this.f24126m;
        if (pVar != null) {
            pVar.h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f24130o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f24130o.add(oVar);
        } else {
            this.f24130o.add(i10, oVar);
        }
        z0();
        requestLayout();
    }

    public void i1() {
        int iJ = this.f24116e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eI0 = i0(this.f24116e.i(i10));
            if (!eI0.shouldIgnore()) {
                eI0.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f24136r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f24148x;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(r rVar) {
        if (this.f24082C == null) {
            this.f24082C = new ArrayList();
        }
        this.f24082C.add(rVar);
    }

    public boolean j1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        v();
        if (this.f24124l != null) {
            int[] iArr = this.f24098K0;
            iArr[0] = 0;
            iArr[1] = 0;
            k1(i10, i11, iArr);
            int[] iArr2 = this.f24098K0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f24130o.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f24098K0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i13, i14, i15, i16, this.f24095I0, i12, iArr3);
        int[] iArr4 = this.f24098K0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f24125l0;
        int[] iArr5 = this.f24095I0;
        int i24 = iArr5[0];
        this.f24125l0 = i23 - i24;
        int i25 = this.f24127m0;
        int i26 = iArr5[1];
        this.f24127m0 = i25 - i26;
        int[] iArr6 = this.f24097J0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !Y0.r.a(motionEvent, 8194)) {
                T0(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            u(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            J(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    public void k(t tVar) {
        this.f24132p.add(tVar);
    }

    public final int k0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    public void k1(int i10, int i11, int[] iArr) {
        u1();
        J0();
        U0.m.a("RV Scroll");
        R(this.f24149x0);
        int iX1 = i10 != 0 ? this.f24126m.x1(i10, this.f24113b, this.f24149x0) : 0;
        int iZ1 = i11 != 0 ? this.f24126m.z1(i11, this.f24113b, this.f24149x0) : 0;
        U0.m.b();
        d1();
        K0();
        w1(false);
        if (iArr != null) {
            iArr[0] = iX1;
            iArr[1] = iZ1;
        }
    }

    public void l(u uVar) {
        if (this.f24153z0 == null) {
            this.f24153z0 = new ArrayList();
        }
        this.f24153z0.add(uVar);
    }

    public final String l0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public void l1(int i10) {
        if (this.f24148x) {
            return;
        }
        y1();
        p pVar = this.f24126m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.y1(i10);
            awakenScrollBars();
        }
    }

    public void m(E e10, m.c cVar, m.c cVar2) {
        e10.setIsRecyclable(false);
        if (this.f24107R.a(e10, cVar, cVar2)) {
            P0();
        }
    }

    public Rect m0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f24236c) {
            return qVar.f24235b;
        }
        if (this.f24149x0.e() && (qVar.b() || qVar.d())) {
            return qVar.f24235b;
        }
        Rect rect = qVar.f24235b;
        rect.set(0, 0, 0, 0);
        int size = this.f24130o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24120i.set(0, 0, 0, 0);
            ((o) this.f24130o.get(i10)).getItemOffsets(this.f24120i, view, this, this.f24149x0);
            int i11 = rect.left;
            Rect rect2 = this.f24120i;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f24236c = false;
        return rect;
    }

    public final void m1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f24124l;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f24112a);
            this.f24124l.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            X0();
        }
        this.f24115d.y();
        h hVar3 = this.f24124l;
        this.f24124l = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f24112a);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.f24126m;
        if (pVar != null) {
            pVar.F0(hVar3, this.f24124l);
        }
        this.f24113b.x(hVar3, this.f24124l, z10);
        this.f24149x0.f24175g = true;
    }

    public final void n(E e10, E e11, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        e10.setIsRecyclable(false);
        if (z10) {
            g(e10);
        }
        if (e10 != e11) {
            if (z11) {
                g(e11);
            }
            e10.mShadowedHolder = e11;
            g(e10);
            this.f24113b.J(e10);
            e11.setIsRecyclable(false);
            e11.mShadowingHolder = e10;
        }
        if (this.f24107R.b(e10, e11, cVar, cVar2)) {
            P0();
        }
    }

    public final void n0(long j10, E e10, E e11) {
        int iG = this.f24116e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            E eI0 = i0(this.f24116e.f(i10));
            if (eI0 != e10 && e0(eI0) == j10) {
                h hVar = this.f24124l;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + eI0 + " \n View Holder 2:" + e10 + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + eI0 + " \n View Holder 2:" + e10 + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e11 + " cannot be found but it is necessary for " + e10 + Q());
    }

    public boolean n1(E e10, int i10) {
        if (!w0()) {
            Y0.E.n0(e10.itemView, i10);
            return true;
        }
        e10.mPendingAccessibilityState = i10;
        this.f24099L0.add(e10);
        return false;
    }

    public void o(E e10, m.c cVar, m.c cVar2) {
        g(e10);
        e10.setIsRecyclable(false);
        if (this.f24107R.c(e10, cVar, cVar2)) {
            P0();
        }
    }

    public boolean o0() {
        return !this.f24142u || this.f24084D || this.f24115d.p();
    }

    public boolean o1(AccessibilityEvent accessibilityEvent) {
        if (!w0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? Z0.b.a(accessibilityEvent) : 0;
        this.f24152z |= iA != 0 ? iA : 0;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f24088F = r0
            r1 = 1
            r5.f24136r = r1
            boolean r2 = r5.f24142u
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f24142u = r1
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f24126m
            if (r1 == 0) goto L1e
            r1.A(r5)
        L1e:
            r5.f24085D0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f24073V0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.g.f24441e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.g r1 = (androidx.recyclerview.widget.g) r1
            r5.f24145v0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.g r1 = new androidx.recyclerview.widget.g
            r1.<init>()
            r5.f24145v0 = r1
            android.view.Display r1 = Y0.E.r(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.g r2 = r5.f24145v0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f24445c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.g r0 = r5.f24145v0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.g gVar;
        super.onDetachedFromWindow();
        m mVar = this.f24107R;
        if (mVar != null) {
            mVar.k();
        }
        y1();
        this.f24136r = false;
        p pVar = this.f24126m;
        if (pVar != null) {
            pVar.B(this, this.f24113b);
        }
        this.f24099L0.clear();
        removeCallbacks(this.f24100M0);
        this.f24117f.j();
        if (!f24073V0 || (gVar = this.f24145v0) == null) {
            return;
        }
        gVar.j(this);
        this.f24145v0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f24130o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f24130o.get(i10)).onDraw(canvas, this, this.f24149x0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f24126m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f24148x
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f24126m
            boolean r0 = r0.m()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f24126m
            boolean r3 = r3.l()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f24126m
            boolean r3 = r3.m()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f24126m
            boolean r3 = r3.l()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f24137r0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f24139s0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.B0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f24148x) {
            return false;
        }
        this.f24134q = null;
        if (V(motionEvent)) {
            r();
            return true;
        }
        p pVar = this.f24126m;
        if (pVar == null) {
            return false;
        }
        boolean zL = pVar.l();
        boolean zM = this.f24126m.m();
        if (this.f24110V == null) {
            this.f24110V = VelocityTracker.obtain();
        }
        this.f24110V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f24150y) {
                this.f24150y = false;
            }
            this.f24109T = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f24125l0 = x10;
            this.f24111W = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f24127m0 = y10;
            this.f24123k0 = y10;
            if (this.f24108S == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                x1(1);
            }
            int[] iArr = this.f24097J0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zL;
            if (zM) {
                i10 = (zL ? 1 : 0) | 2;
            }
            v1(i10, 0);
        } else if (actionMasked == 1) {
            this.f24110V.clear();
            x1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f24109T);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f24109T + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f24108S != 1) {
                int i11 = x11 - this.f24111W;
                int i12 = y11 - this.f24123k0;
                if (!zL || Math.abs(i11) <= this.f24129n0) {
                    z10 = false;
                } else {
                    this.f24125l0 = x11;
                    z10 = true;
                }
                if (zM && Math.abs(i12) > this.f24129n0) {
                    this.f24127m0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.f24109T = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f24125l0 = x12;
            this.f24111W = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f24127m0 = y12;
            this.f24123k0 = y12;
        } else if (actionMasked == 6) {
            M0(motionEvent);
        }
        return this.f24108S == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        U0.m.a("RV OnLayout");
        C();
        U0.m.b();
        this.f24142u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        p pVar = this.f24126m;
        if (pVar == null) {
            x(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.t0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f24126m.a1(this.f24113b, this.f24149x0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f24101N0 = z10;
            if (z10 || this.f24124l == null) {
                return;
            }
            if (this.f24149x0.f24173e == 1) {
                D();
            }
            this.f24126m.B1(i10, i11);
            this.f24149x0.f24178j = true;
            E();
            this.f24126m.E1(i10, i11);
            if (this.f24126m.H1()) {
                this.f24126m.B1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f24149x0.f24178j = true;
                E();
                this.f24126m.E1(i10, i11);
            }
            this.f24102O0 = getMeasuredWidth();
            this.f24104P0 = getMeasuredHeight();
            return;
        }
        if (this.f24138s) {
            this.f24126m.a1(this.f24113b, this.f24149x0, i10, i11);
            return;
        }
        if (this.f24078A) {
            u1();
            J0();
            R0();
            K0();
            B b10 = this.f24149x0;
            if (b10.f24180l) {
                b10.f24176h = true;
            } else {
                this.f24115d.j();
                this.f24149x0.f24176h = false;
            }
            this.f24078A = false;
            w1(false);
        } else if (this.f24149x0.f24180l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f24124l;
        if (hVar != null) {
            this.f24149x0.f24174f = hVar.getItemCount();
        } else {
            this.f24149x0.f24174f = 0;
        }
        u1();
        this.f24126m.a1(this.f24113b, this.f24149x0, i10, i11);
        w1(false);
        this.f24149x0.f24176h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (w0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f24114c = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f24114c;
        if (zVar2 != null) {
            zVar.b(zVar2);
            return zVar;
        }
        p pVar = this.f24126m;
        if (pVar != null) {
            zVar.f24254c = pVar.e1();
            return zVar;
        }
        zVar.f24254c = null;
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v44 int) = (r1v25 int), (r1v48 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(String str) {
        if (w0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
        }
        if (this.f24090G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + Q()));
        }
    }

    public final boolean p0() {
        int iG = this.f24116e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            E eI0 = i0(this.f24116e.f(i10));
            if (eI0 != null && !eI0.shouldIgnore() && eI0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public void p1(int i10, int i11) {
        q1(i10, i11, null);
    }

    public boolean q(E e10) {
        m mVar = this.f24107R;
        return mVar == null || mVar.g(e10, e10.getUnmodifiedPayloads());
    }

    public void q0() {
        this.f24115d = new a(new f());
    }

    public void q1(int i10, int i11, Interpolator interpolator) {
        r1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public final void r() {
        g1();
        setScrollState(0);
    }

    public final void r0() {
        if (Y0.E.v(this) == 0) {
            Y0.E.p0(this, 8);
        }
    }

    public void r1(int i10, int i11, Interpolator interpolator, int i12) {
        s1(i10, i11, interpolator, i12, false);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        E eI0 = i0(view);
        if (eI0 != null) {
            if (eI0.isTmpDetached()) {
                eI0.clearTmpDetachFlag();
            } else if (!eI0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + eI0 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f24126m.c1(this, this.f24149x0, view, view2) && view2 != null) {
            e1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f24126m.s1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f24132p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f24132p.get(i10)).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f24144v != 0 || this.f24148x) {
            this.f24146w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s0() {
        this.f24116e = new c(new C2768e());
    }

    public void s1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.f24126m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f24148x) {
            return;
        }
        if (!pVar.l()) {
            i10 = 0;
        }
        if (!this.f24126m.m()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            v1(i13, 1);
        }
        this.f24143u0.e(i10, i11, i12, interpolator);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.f24126m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f24148x) {
            return;
        }
        boolean zL = pVar.l();
        boolean zM = this.f24126m.m();
        if (zL || zM) {
            if (!zL) {
                i10 = 0;
            }
            if (!zM) {
                i11 = 0;
            }
            j1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (o1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.n nVar) {
        this.f24087E0 = nVar;
        Y0.E.f0(this, nVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        m1(hVar, false, true);
        S0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.f24089F0) {
            return;
        }
        this.f24089F0 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f24118g) {
            u0();
        }
        this.f24118g = z10;
        super.setClipToPadding(z10);
        if (this.f24142u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        X0.h.g(lVar);
        this.f24092H = lVar;
        u0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f24138s = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f24107R;
        if (mVar2 != null) {
            mVar2.k();
            this.f24107R.w(null);
        }
        this.f24107R = mVar;
        if (mVar != null) {
            mVar.w(this.f24083C0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f24113b.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f24126m) {
            return;
        }
        y1();
        if (this.f24126m != null) {
            m mVar = this.f24107R;
            if (mVar != null) {
                mVar.k();
            }
            this.f24126m.l1(this.f24113b);
            this.f24126m.m1(this.f24113b);
            this.f24113b.c();
            if (this.f24136r) {
                this.f24126m.B(this, this.f24113b);
            }
            this.f24126m.F1(null);
            this.f24126m = null;
        } else {
            this.f24113b.c();
        }
        this.f24116e.o();
        this.f24126m = pVar;
        if (pVar != null) {
            if (pVar.f24211b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f24211b.Q());
            }
            pVar.F1(this);
            if (this.f24136r) {
                this.f24126m.A(this);
            }
        }
        this.f24113b.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.f24131o0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f24151y0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f24141t0 = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.f24113b.E(vVar);
    }

    public void setScrollState(int i10) {
        if (i10 == this.f24108S) {
            return;
        }
        this.f24108S = i10;
        if (i10 != 2) {
            z1();
        }
        I(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f24129n0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f24129n0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C c10) {
        this.f24113b.F(c10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f24148x) {
            p("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f24148x = true;
                this.f24150y = true;
                y1();
                return;
            }
            this.f24148x = false;
            if (this.f24146w && this.f24126m != null && this.f24124l != null) {
                requestLayout();
            }
            this.f24146w = false;
        }
    }

    public void t() {
        int iJ = this.f24116e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eI0 = i0(this.f24116e.i(i10));
            if (!eI0.shouldIgnore()) {
                eI0.clearOldPosition();
            }
        }
        this.f24113b.d();
    }

    public void t0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(Z2.b.f20205a), resources.getDimensionPixelSize(Z2.b.f20207c), resources.getDimensionPixelOffset(Z2.b.f20206b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
        }
    }

    public void t1(int i10) {
        if (this.f24148x) {
            return;
        }
        p pVar = this.f24126m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.J1(this, this.f24149x0, i10);
        }
    }

    public void u(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f24094I;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f24094I.onRelease();
            zIsFinished = this.f24094I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f24103P;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f24103P.onRelease();
            zIsFinished |= this.f24103P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f24096J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f24096J.onRelease();
            zIsFinished |= this.f24096J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f24105Q;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f24105Q.onRelease();
            zIsFinished |= this.f24105Q.isFinished();
        }
        if (zIsFinished) {
            Y0.E.W(this);
        }
    }

    public void u0() {
        this.f24105Q = null;
        this.f24096J = null;
        this.f24103P = null;
        this.f24094I = null;
    }

    public void u1() {
        int i10 = this.f24144v + 1;
        this.f24144v = i10;
        if (i10 != 1 || this.f24148x) {
            return;
        }
        this.f24146w = false;
    }

    public void v() {
        if (!this.f24142u || this.f24084D) {
            U0.m.a("RV FullInvalidate");
            C();
            U0.m.b();
            return;
        }
        if (this.f24115d.p()) {
            if (!this.f24115d.o(4) || this.f24115d.o(11)) {
                if (this.f24115d.p()) {
                    U0.m.a("RV FullInvalidate");
                    C();
                    U0.m.b();
                    return;
                }
                return;
            }
            U0.m.a("RV PartialInvalidate");
            u1();
            J0();
            this.f24115d.w();
            if (!this.f24146w) {
                if (p0()) {
                    C();
                } else {
                    this.f24115d.i();
                }
            }
            w1(true);
            K0();
            U0.m.b();
        }
    }

    public boolean v0() {
        AccessibilityManager accessibilityManager = this.f24080B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean v1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    public final void w(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strL0 = l0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strL0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f24076Y0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strL0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strL0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strL0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strL0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strL0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strL0, e16);
            }
        }
    }

    public boolean w0() {
        return this.f24088F > 0;
    }

    public void w1(boolean z10) {
        if (this.f24144v < 1) {
            this.f24144v = 1;
        }
        if (!z10 && !this.f24148x) {
            this.f24146w = false;
        }
        if (this.f24144v == 1) {
            if (z10 && this.f24146w && !this.f24148x && this.f24126m != null && this.f24124l != null) {
                C();
            }
            if (!this.f24148x) {
                this.f24146w = false;
            }
        }
        this.f24144v--;
    }

    public void x(int i10, int i11) {
        setMeasuredDimension(p.o(i10, getPaddingLeft() + getPaddingRight(), Y0.E.y(this)), p.o(i11, getPaddingTop() + getPaddingBottom(), Y0.E.x(this)));
    }

    public final boolean x0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || T(view2) == null) {
            return false;
        }
        if (view == null || T(view) == null) {
            return true;
        }
        this.f24120i.set(0, 0, view.getWidth(), view.getHeight());
        this.f24121j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f24120i);
        offsetDescendantRectToMyCoords(view2, this.f24121j);
        byte b10 = -1;
        int i12 = this.f24126m.a0() == 1 ? -1 : 1;
        Rect rect = this.f24120i;
        int i13 = rect.left;
        Rect rect2 = this.f24121j;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + Q());
    }

    public void x1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public final boolean y(int i10, int i11) {
        W(this.f24091G0);
        int[] iArr = this.f24091G0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    public void y0(int i10) {
        if (this.f24126m == null) {
            return;
        }
        setScrollState(2);
        this.f24126m.y1(i10);
        awakenScrollBars();
    }

    public void y1() {
        setScrollState(0);
        z1();
    }

    public void z(View view) {
        E eI0 = i0(view);
        H0(view);
        h hVar = this.f24124l;
        if (hVar != null && eI0 != null) {
            hVar.onViewAttachedToWindow(eI0);
        }
        List list = this.f24082C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f24082C.get(size)).d(view);
            }
        }
    }

    public void z0() {
        int iJ = this.f24116e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((q) this.f24116e.i(i10).getLayoutParams()).f24236c = true;
        }
        this.f24113b.s();
    }

    public final void z1() {
        this.f24143u0.f();
        p pVar = this.f24126m;
        if (pVar != null) {
            pVar.L1();
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24112a = new y();
        this.f24113b = new w();
        this.f24117f = new androidx.recyclerview.widget.s();
        this.f24119h = new RunnableC2764a();
        this.f24120i = new Rect();
        this.f24121j = new Rect();
        this.f24122k = new RectF();
        this.f24128n = new ArrayList();
        this.f24130o = new ArrayList();
        this.f24132p = new ArrayList();
        this.f24144v = 0;
        this.f24084D = false;
        this.f24086E = false;
        this.f24088F = 0;
        this.f24090G = 0;
        this.f24092H = new l();
        this.f24107R = new d();
        this.f24108S = 0;
        this.f24109T = -1;
        this.f24137r0 = Float.MIN_VALUE;
        this.f24139s0 = Float.MIN_VALUE;
        this.f24141t0 = true;
        this.f24143u0 = new D();
        this.f24147w0 = f24073V0 ? new g.b() : null;
        this.f24149x0 = new B();
        this.f24079A0 = false;
        this.f24081B0 = false;
        this.f24083C0 = new n();
        this.f24085D0 = false;
        this.f24091G0 = new int[2];
        this.f24095I0 = new int[2];
        this.f24097J0 = new int[2];
        this.f24098K0 = new int[2];
        this.f24099L0 = new ArrayList();
        this.f24100M0 = new RunnableC2765b();
        this.f24102O0 = 0;
        this.f24104P0 = 0;
        this.f24106Q0 = new C2767d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f24129n0 = viewConfiguration.getScaledTouchSlop();
        this.f24137r0 = H.e(viewConfiguration, context);
        this.f24139s0 = H.h(viewConfiguration, context);
        this.f24133p0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f24135q0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f24107R.w(this.f24083C0);
        q0();
        s0();
        r0();
        if (Y0.E.u(this) == 0) {
            Y0.E.n0(this, 1);
        }
        this.f24080B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.n(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Z2.d.f20217f, i10, 0);
        Y0.E.d0(this, context, Z2.d.f20217f, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(Z2.d.f20226o);
        if (typedArrayObtainStyledAttributes.getInt(Z2.d.f20220i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f24118g = typedArrayObtainStyledAttributes.getBoolean(Z2.d.f20219h, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(Z2.d.f20221j, false);
        this.f24140t = z10;
        if (z10) {
            t0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(Z2.d.f20224m), typedArrayObtainStyledAttributes.getDrawable(Z2.d.f20225n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(Z2.d.f20222k), typedArrayObtainStyledAttributes.getDrawable(Z2.d.f20223l));
        }
        typedArrayObtainStyledAttributes.recycle();
        w(context, string, attributeSet, i10, 0);
        int[] iArr = f24069R0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        Y0.E.d0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class z extends AbstractC3806a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f24254c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24254c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public void b(z zVar) {
            this.f24254c = zVar.f24254c;
        }

        @Override // d1.AbstractC3806a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f24254c, 0);
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public E f24234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f24235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24237d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24235b = new Rect();
            this.f24236c = true;
            this.f24237d = false;
        }

        public int a() {
            return this.f24234a.getLayoutPosition();
        }

        public boolean b() {
            return this.f24234a.isUpdated();
        }

        public boolean c() {
            return this.f24234a.isRemoved();
        }

        public boolean d() {
            return this.f24234a.isInvalid();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f24235b = new Rect();
            this.f24236c = true;
            this.f24237d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f24235b = new Rect();
            this.f24236c = true;
            this.f24237d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24235b = new Rect();
            this.f24236c = true;
            this.f24237d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f24235b = new Rect();
            this.f24236c = true;
            this.f24237d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f24126m;
        if (pVar != null) {
            return pVar.G(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f24199a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f24200b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f24201c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f24202d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f24203e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f24204f = 250;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface a {
            void a();
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface b {
            void a(E e10);
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24205a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24206b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f24207c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f24208d;

            public c a(E e10) {
                return b(e10, 0);
            }

            public c b(E e10, int i10) {
                View view = e10.itemView;
                this.f24205a = view.getLeft();
                this.f24206b = view.getTop();
                this.f24207c = view.getRight();
                this.f24208d = view.getBottom();
                return this;
            }
        }

        public static int e(E e10) {
            int i10 = e10.mFlags;
            int i11 = i10 & 14;
            if (e10.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = e10.getOldPosition();
                int absoluteAdapterPosition = e10.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | RecognitionOptions.PDF417;
                }
            }
            return i11;
        }

        public abstract boolean a(E e10, c cVar, c cVar2);

        public abstract boolean b(E e10, E e11, c cVar, c cVar2);

        public abstract boolean c(E e10, c cVar, c cVar2);

        public abstract boolean d(E e10, c cVar, c cVar2);

        public boolean f(E e10) {
            return true;
        }

        public boolean g(E e10, List list) {
            return f(e10);
        }

        public final void h(E e10) {
            s(e10);
            b bVar = this.f24199a;
            if (bVar != null) {
                bVar.a(e10);
            }
        }

        public final void i() {
            if (this.f24200b.size() <= 0) {
                this.f24200b.clear();
            } else {
                android.support.v4.media.session.a.a(this.f24200b.get(0));
                throw null;
            }
        }

        public abstract void j(E e10);

        public abstract void k();

        public long l() {
            return this.f24201c;
        }

        public long m() {
            return this.f24204f;
        }

        public long n() {
            return this.f24203e;
        }

        public long o() {
            return this.f24202d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean zP = p();
            if (aVar != null) {
                if (!zP) {
                    aVar.a();
                    return zP;
                }
                this.f24200b.add(aVar);
            }
            return zP;
        }

        public c r() {
            return new c();
        }

        public c t(B b10, E e10) {
            return r().a(e10);
        }

        public c u(B b10, E e10, int i10, List list) {
            return r().a(e10);
        }

        public abstract void v();

        public void w(b bVar) {
            this.f24199a = bVar;
        }

        public void s(E e10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.c f24210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f24211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r.b f24212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r.b f24213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.r f24214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.r f24215f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public A f24216g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f24217h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f24218i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f24219j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f24220k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f24221l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f24222m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f24223n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f24224o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f24225p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f24226q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f24227r;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements r.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.r.b
            public View a(int i10) {
                return p.this.J(i10);
            }

            @Override // androidx.recyclerview.widget.r.b
            public int b(View view) {
                return p.this.R(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.r.b
            public int c() {
                return p.this.f0();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int d() {
                return p.this.p0() - p.this.g0();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int e(View view) {
                return p.this.U(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements r.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.r.b
            public View a(int i10) {
                return p.this.J(i10);
            }

            @Override // androidx.recyclerview.widget.r.b
            public int b(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.r.b
            public int c() {
                return p.this.h0();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int d() {
                return p.this.X() - p.this.e0();
            }

            @Override // androidx.recyclerview.widget.r.b
            public int e(View view) {
                return p.this.P(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface c {
            void a(int i10, int i11);
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24230a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24231b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f24232c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f24233d;
        }

        public p() {
            a aVar = new a();
            this.f24212c = aVar;
            b bVar = new b();
            this.f24213d = bVar;
            this.f24214e = new androidx.recyclerview.widget.r(aVar);
            this.f24215f = new androidx.recyclerview.widget.r(bVar);
            this.f24217h = false;
            this.f24218i = false;
            this.f24219j = false;
            this.f24220k = true;
            this.f24221l = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int L(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.L(int, int, int, int, boolean):int");
        }

        public static d j0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Z2.d.f20217f, i10, i11);
            dVar.f24230a = typedArrayObtainStyledAttributes.getInt(Z2.d.f20218g, 1);
            dVar.f24231b = typedArrayObtainStyledAttributes.getInt(Z2.d.f20228q, 1);
            dVar.f24232c = typedArrayObtainStyledAttributes.getBoolean(Z2.d.f20227p, false);
            dVar.f24233d = typedArrayObtainStyledAttributes.getBoolean(Z2.d.f20229r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int o(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        public static boolean x0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public void A(RecyclerView recyclerView) {
            this.f24218i = true;
            H0(recyclerView);
        }

        public void A0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f24235b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void A1(RecyclerView recyclerView) {
            B1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void B(RecyclerView recyclerView, w wVar) {
            this.f24218i = false;
            J0(recyclerView, wVar);
        }

        public void B0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rectM0 = this.f24211b.m0(view);
            int i12 = i10 + rectM0.left + rectM0.right;
            int i13 = i11 + rectM0.top + rectM0.bottom;
            int iL = L(p0(), q0(), f0() + g0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, l());
            int iL2 = L(X(), Y(), h0() + e0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, m());
            if (G1(view, iL, iL2, qVar)) {
                view.measure(iL, iL2);
            }
        }

        public void B1(int i10, int i11) {
            this.f24226q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f24224o = mode;
            if (mode == 0 && !RecyclerView.f24071T0) {
                this.f24226q = 0;
            }
            this.f24227r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f24225p = mode2;
            if (mode2 != 0 || RecyclerView.f24071T0) {
                return;
            }
            this.f24227r = 0;
        }

        public View C(View view) {
            View viewT;
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView == null || (viewT = recyclerView.T(view)) == null || this.f24210a.n(viewT)) {
                return null;
            }
            return viewT;
        }

        public void C0(int i10, int i11) {
            View viewJ = J(i10);
            if (viewJ != null) {
                y(i10);
                i(viewJ, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f24211b.toString());
            }
        }

        public void C1(int i10, int i11) {
            this.f24211b.setMeasuredDimension(i10, i11);
        }

        public View D(int i10) {
            int iK = K();
            for (int i11 = 0; i11 < iK; i11++) {
                View viewJ = J(i11);
                E eI0 = RecyclerView.i0(viewJ);
                if (eI0 != null && eI0.getLayoutPosition() == i10 && !eI0.shouldIgnore() && (this.f24211b.f24149x0.e() || !eI0.isRemoved())) {
                    return viewJ;
                }
            }
            return null;
        }

        public void D0(int i10) {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                recyclerView.C0(i10);
            }
        }

        public void D1(Rect rect, int i10, int i11) {
            C1(o(i10, rect.width() + f0() + g0(), d0()), o(i11, rect.height() + h0() + e0(), c0()));
        }

        public abstract q E();

        public void E0(int i10) {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                recyclerView.D0(i10);
            }
        }

        public void E1(int i10, int i11) {
            int iK = K();
            if (iK == 0) {
                this.f24211b.x(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iK; i16++) {
                View viewJ = J(i16);
                Rect rect = this.f24211b.f24120i;
                Q(viewJ, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f24211b.f24120i.set(i15, i13, i12, i14);
            D1(this.f24211b.f24120i, i10, i11);
        }

        public q F(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void F1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f24211b = null;
                this.f24210a = null;
                this.f24226q = 0;
                this.f24227r = 0;
            } else {
                this.f24211b = recyclerView;
                this.f24210a = recyclerView.f24116e;
                this.f24226q = recyclerView.getWidth();
                this.f24227r = recyclerView.getHeight();
            }
            this.f24224o = 1073741824;
            this.f24225p = 1073741824;
        }

        public q G(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public boolean G0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        public boolean G1(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.f24220k && x0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && x0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int H() {
            return -1;
        }

        public boolean H1() {
            return false;
        }

        public int I(View view) {
            return ((q) view.getLayoutParams()).f24235b.bottom;
        }

        public boolean I1(View view, int i10, int i11, q qVar) {
            return (this.f24220k && x0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && x0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public View J(int i10) {
            androidx.recyclerview.widget.c cVar = this.f24210a;
            if (cVar != null) {
                return cVar.f(i10);
            }
            return null;
        }

        public void J0(RecyclerView recyclerView, w wVar) {
            I0(recyclerView);
        }

        public void J1(RecyclerView recyclerView, B b10, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int K() {
            androidx.recyclerview.widget.c cVar = this.f24210a;
            if (cVar != null) {
                return cVar.g();
            }
            return 0;
        }

        public View K0(View view, int i10, w wVar, B b10) {
            return null;
        }

        public void K1(A a10) {
            A a11 = this.f24216g;
            if (a11 != null && a10 != a11 && a11.h()) {
                this.f24216g.r();
            }
            this.f24216g = a10;
            a10.q(this.f24211b, this);
        }

        public void L0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f24211b;
            M0(recyclerView.f24113b, recyclerView.f24149x0, accessibilityEvent);
        }

        public void L1() {
            A a10 = this.f24216g;
            if (a10 != null) {
                a10.r();
            }
        }

        public final int[] M(View view, Rect rect) {
            int iF0 = f0();
            int iH0 = h0();
            int iP0 = p0() - g0();
            int iX = X() - e0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iF0;
            int iMin = Math.min(0, i10);
            int i11 = top - iH0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iP0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iX);
            if (a0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public void M0(w wVar, B b10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f24211b.canScrollVertically(-1) && !this.f24211b.canScrollHorizontally(-1) && !this.f24211b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f24211b.f24124l;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public boolean M1() {
            return false;
        }

        public boolean N() {
            RecyclerView recyclerView = this.f24211b;
            return recyclerView != null && recyclerView.f24118g;
        }

        public void N0(Z0.h hVar) {
            RecyclerView recyclerView = this.f24211b;
            O0(recyclerView.f24113b, recyclerView.f24149x0, hVar);
        }

        public int O(w wVar, B b10) {
            return -1;
        }

        public void O0(w wVar, B b10, Z0.h hVar) {
            if (this.f24211b.canScrollVertically(-1) || this.f24211b.canScrollHorizontally(-1)) {
                hVar.a(8192);
                hVar.A0(true);
            }
            if (this.f24211b.canScrollVertically(1) || this.f24211b.canScrollHorizontally(1)) {
                hVar.a(RecognitionOptions.AZTEC);
                hVar.A0(true);
            }
            hVar.k0(h.f.a(l0(wVar, b10), O(wVar, b10), w0(wVar, b10), m0(wVar, b10)));
        }

        public int P(View view) {
            return view.getBottom() + I(view);
        }

        public void P0(View view, Z0.h hVar) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 == null || eI0.isRemoved() || this.f24210a.n(eI0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f24211b;
            Q0(recyclerView.f24113b, recyclerView.f24149x0, view, hVar);
        }

        public void Q(View view, Rect rect) {
            RecyclerView.j0(view, rect);
        }

        public int R(View view) {
            return view.getLeft() - b0(view);
        }

        public View R0(View view, int i10) {
            return null;
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).f24235b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int T(View view) {
            Rect rect = ((q) view.getLayoutParams()).f24235b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int U(View view) {
            return view.getRight() + k0(view);
        }

        public int V(View view) {
            return view.getTop() - n0(view);
        }

        public View W() {
            View focusedChild;
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f24210a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int X() {
            return this.f24227r;
        }

        public void X0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            W0(recyclerView, i10, i11);
        }

        public int Y() {
            return this.f24225p;
        }

        public void Y0(w wVar, B b10) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int Z() {
            RecyclerView recyclerView = this.f24211b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int a0() {
            return Y0.E.w(this.f24211b);
        }

        public void a1(w wVar, B b10, int i10, int i11) {
            this.f24211b.x(i10, i11);
        }

        public int b0(View view) {
            return ((q) view.getLayoutParams()).f24235b.left;
        }

        public boolean b1(RecyclerView recyclerView, View view, View view2) {
            return y0() || recyclerView.w0();
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            return Y0.E.x(this.f24211b);
        }

        public boolean c1(RecyclerView recyclerView, B b10, View view, View view2) {
            return b1(recyclerView, view, view2);
        }

        public void d(View view, int i10) {
            g(view, i10, true);
        }

        public int d0() {
            return Y0.E.y(this.f24211b);
        }

        public void e(View view) {
            f(view, -1);
        }

        public int e0() {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable e1() {
            return null;
        }

        public void f(View view, int i10) {
            g(view, i10, false);
        }

        public int f0() {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final void g(View view, int i10, boolean z10) {
            E eI0 = RecyclerView.i0(view);
            if (z10 || eI0.isRemoved()) {
                this.f24211b.f24117f.b(eI0);
            } else {
                this.f24211b.f24117f.p(eI0);
            }
            q qVar = (q) view.getLayoutParams();
            if (eI0.wasReturnedFromScrap() || eI0.isScrap()) {
                if (eI0.isScrap()) {
                    eI0.unScrap();
                } else {
                    eI0.clearReturnedFromScrapFlag();
                }
                this.f24210a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f24211b) {
                int iM = this.f24210a.m(view);
                if (i10 == -1) {
                    i10 = this.f24210a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f24211b.indexOfChild(view) + this.f24211b.Q());
                }
                if (iM != i10) {
                    this.f24211b.f24126m.C0(iM, i10);
                }
            } else {
                this.f24210a.a(view, i10, false);
                qVar.f24236c = true;
                A a10 = this.f24216g;
                if (a10 != null && a10.h()) {
                    this.f24216g.k(view);
                }
            }
            if (qVar.f24237d) {
                eI0.itemView.invalidate();
                qVar.f24237d = false;
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void g1(A a10) {
            if (this.f24216g == a10) {
                this.f24216g = null;
            }
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int h0() {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean h1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f24211b;
            return i1(recyclerView.f24113b, recyclerView.f24149x0, i10, bundle);
        }

        public void i(View view, int i10) {
            j(view, i10, (q) view.getLayoutParams());
        }

        public int i0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean i1(w wVar, B b10, int i10, Bundle bundle) {
            int iX;
            int iP0;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                iX = recyclerView.canScrollVertically(1) ? (X() - h0()) - e0() : 0;
                if (this.f24211b.canScrollHorizontally(1)) {
                    iP0 = (p0() - f0()) - g0();
                    i11 = iX;
                    i12 = iP0;
                }
                i11 = iX;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iX = recyclerView.canScrollVertically(-1) ? -((X() - h0()) - e0()) : 0;
                if (this.f24211b.canScrollHorizontally(-1)) {
                    iP0 = -((p0() - f0()) - g0());
                    i11 = iX;
                    i12 = iP0;
                }
                i11 = iX;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f24211b.s1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void j(View view, int i10, q qVar) {
            E eI0 = RecyclerView.i0(view);
            if (eI0.isRemoved()) {
                this.f24211b.f24117f.b(eI0);
            } else {
                this.f24211b.f24117f.p(eI0);
            }
            this.f24210a.c(view, i10, qVar, eI0.isRemoved());
        }

        public boolean j1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f24211b;
            return k1(recyclerView.f24113b, recyclerView.f24149x0, view, i10, bundle);
        }

        public void k(View view, Rect rect) {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m0(view));
            }
        }

        public int k0(View view) {
            return ((q) view.getLayoutParams()).f24235b.right;
        }

        public boolean k1(w wVar, B b10, View view, int i10, Bundle bundle) {
            return false;
        }

        public boolean l() {
            return false;
        }

        public int l0(w wVar, B b10) {
            return -1;
        }

        public void l1(w wVar) {
            for (int iK = K() - 1; iK >= 0; iK--) {
                if (!RecyclerView.i0(J(iK)).shouldIgnore()) {
                    o1(iK, wVar);
                }
            }
        }

        public boolean m() {
            return false;
        }

        public int m0(w wVar, B b10) {
            return 0;
        }

        public void m1(w wVar) {
            int iJ = wVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = wVar.n(i10);
                E eI0 = RecyclerView.i0(viewN);
                if (!eI0.shouldIgnore()) {
                    eI0.setIsRecyclable(false);
                    if (eI0.isTmpDetached()) {
                        this.f24211b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f24211b.f24107R;
                    if (mVar != null) {
                        mVar.j(eI0);
                    }
                    eI0.setIsRecyclable(true);
                    wVar.y(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f24211b.invalidate();
            }
        }

        public boolean n(q qVar) {
            return qVar != null;
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).f24235b.top;
        }

        public void n1(View view, w wVar) {
            q1(view);
            wVar.B(view);
        }

        public void o0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f24235b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f24211b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f24211b.f24122k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void o1(int i10, w wVar) {
            View viewJ = J(i10);
            r1(i10);
            wVar.B(viewJ);
        }

        public int p0() {
            return this.f24226q;
        }

        public boolean p1(Runnable runnable) {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int q0() {
            return this.f24224o;
        }

        public void q1(View view) {
            this.f24210a.p(view);
        }

        public int r(B b10) {
            return 0;
        }

        public boolean r0() {
            int iK = K();
            for (int i10 = 0; i10 < iK; i10++) {
                ViewGroup.LayoutParams layoutParams = J(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void r1(int i10) {
            if (J(i10) != null) {
                this.f24210a.q(i10);
            }
        }

        public int s(B b10) {
            return 0;
        }

        public boolean s0() {
            return this.f24218i;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return t1(recyclerView, view, rect, z10, false);
        }

        public int t(B b10) {
            return 0;
        }

        public boolean t0() {
            return this.f24219j;
        }

        public boolean t1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrM = M(view, rect);
            int i10 = iArrM[0];
            int i11 = iArrM[1];
            if ((z11 && !u0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.p1(i10, i11);
            }
            return true;
        }

        public int u(B b10) {
            return 0;
        }

        public final boolean u0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iF0 = f0();
            int iH0 = h0();
            int iP0 = p0() - g0();
            int iX = X() - e0();
            Rect rect = this.f24211b.f24120i;
            Q(focusedChild, rect);
            return rect.left - i10 < iP0 && rect.right - i10 > iF0 && rect.top - i11 < iX && rect.bottom - i11 > iH0;
        }

        public void u1() {
            RecyclerView recyclerView = this.f24211b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int v(B b10) {
            return 0;
        }

        public final boolean v0() {
            return this.f24221l;
        }

        public void v1() {
            this.f24217h = true;
        }

        public int w(B b10) {
            return 0;
        }

        public boolean w0(w wVar, B b10) {
            return false;
        }

        public final void w1(w wVar, int i10, View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0.shouldIgnore()) {
                return;
            }
            if (eI0.isInvalid() && !eI0.isRemoved() && !this.f24211b.f24124l.hasStableIds()) {
                r1(i10);
                wVar.C(eI0);
            } else {
                y(i10);
                wVar.D(view);
                this.f24211b.f24117f.k(eI0);
            }
        }

        public void x(w wVar) {
            for (int iK = K() - 1; iK >= 0; iK--) {
                w1(wVar, iK, J(iK));
            }
        }

        public int x1(int i10, w wVar, B b10) {
            return 0;
        }

        public void y(int i10) {
            z(i10, J(i10));
        }

        public boolean y0() {
            A a10 = this.f24216g;
            return a10 != null && a10.h();
        }

        public final void z(int i10, View view) {
            this.f24210a.d(i10);
        }

        public boolean z0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f24214e.b(view, 24579) && this.f24215f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public int z1(int i10, w wVar, B b10) {
            return 0;
        }

        public void H0(RecyclerView recyclerView) {
        }

        public void I0(RecyclerView recyclerView) {
        }

        public void T0(RecyclerView recyclerView) {
        }

        public void Z0(B b10) {
        }

        public void d1(Parcelable parcelable) {
        }

        public void f1(int i10) {
        }

        public void y1(int i10) {
        }

        public void F0(h hVar, h hVar2) {
        }

        public void q(int i10, c cVar) {
        }

        public void S0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void W0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Q0(w wVar, B b10, View view, Z0.h hVar) {
        }

        public void U0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void p(int i10, int i11, B b10, c cVar) {
        }
    }

    public void H0(View view) {
    }

    public void I0(View view) {
    }

    public void N0(int i10) {
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class j {
        public void b(int i10, int i11, Object obj) {
            a(i10, i11);
        }

        public void a(int i10, int i11) {
        }

        public void c(int i10, int i11) {
        }

        public void e(int i10, int i11) {
        }

        public void d(int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public void O0(int i10, int i11) {
    }
}
