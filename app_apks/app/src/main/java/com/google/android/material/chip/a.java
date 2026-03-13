package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import c7.j;
import d7.C3836c;
import g7.AbstractC4159a;
import i7.AbstractC4365a;
import j.AbstractC4666a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k7.AbstractC4807a;
import n7.C5147j;
import n7.l;
import n7.n;
import p7.AbstractC5402c;
import p7.C5403d;
import q7.AbstractC5503b;
import s7.g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a extends g implements Drawable.Callback, C5147j.b {

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final int[] f30571Z0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final ShapeDrawable f30572a1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f30573A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final RectF f30574A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f30575B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final PointF f30576B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f30577C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final Path f30578C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f30579D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final C5147j f30580D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f30581E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f30582E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ColorStateList f30583F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f30584F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f30585G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f30586G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f30587H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f30588H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Drawable f30589I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f30590I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ColorStateList f30591J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f30592J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f30593K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f30594L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f30595M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ColorFilter f30596N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public PorterDuffColorFilter f30597O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f30598P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ColorStateList f30599P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f30600Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public PorterDuff.Mode f30601Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f30602R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int[] f30603R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Drawable f30604S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f30605S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Drawable f30606T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public ColorStateList f30607T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public WeakReference f30608U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ColorStateList f30609V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public TextUtils.TruncateAt f30610V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f30611W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public boolean f30612W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public CharSequence f30613X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f30614X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f30615Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public boolean f30616Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f30617Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Drawable f30618k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ColorStateList f30619l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public C3836c f30620m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public C3836c f30621n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f30622o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f30623p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f30624q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f30625r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f30626s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f30627t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f30628u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f30629v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Context f30630w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Paint f30631x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Paint f30632y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f30633z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Paint.FontMetrics f30634z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0359a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f30577C = -1.0f;
        this.f30631x0 = new Paint(1);
        this.f30634z0 = new Paint.FontMetrics();
        this.f30574A0 = new RectF();
        this.f30576B0 = new PointF();
        this.f30578C0 = new Path();
        this.f30595M0 = 255;
        this.f30601Q0 = PorterDuff.Mode.SRC_IN;
        this.f30608U0 = new WeakReference(null);
        K(context);
        this.f30630w0 = context;
        C5147j c5147j = new C5147j(this);
        this.f30580D0 = c5147j;
        this.f30585G = "";
        c5147j.e().density = context.getResources().getDisplayMetrics().density;
        this.f30632y0 = null;
        int[] iArr = f30571Z0;
        setState(iArr);
        g2(iArr);
        this.f30612W0 = true;
        if (AbstractC5503b.f43288a) {
            f30572a1.setTint(-1);
        }
    }

    public static boolean i1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean m1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean n1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean o1(C5403d c5403d) {
        return (c5403d == null || c5403d.i() == null || !c5403d.i().isStateful()) ? false : true;
    }

    public static a q0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.p1(attributeSet, i10, i11);
        return aVar;
    }

    public Drawable A0() {
        return this.f30618k0;
    }

    public void A1(ColorStateList colorStateList) {
        if (this.f30573A != colorStateList) {
            this.f30573A = colorStateList;
            onStateChange(getState());
        }
    }

    public void A2(int i10) {
        z2(new C5403d(this.f30630w0, i10));
    }

    public ColorStateList B0() {
        return this.f30619l0;
    }

    public void B1(int i10) {
        A1(AbstractC4666a.a(this.f30630w0, i10));
    }

    public void B2(float f10) {
        if (this.f30626s0 != f10) {
            this.f30626s0 = f10;
            invalidateSelf();
            q1();
        }
    }

    public ColorStateList C0() {
        return this.f30573A;
    }

    public void C1(float f10) {
        if (this.f30577C != f10) {
            this.f30577C = f10;
            setShapeAppearanceModel(B().w(f10));
        }
    }

    public void C2(int i10) {
        B2(this.f30630w0.getResources().getDimension(i10));
    }

    public float D0() {
        return this.f30616Y0 ? D() : this.f30577C;
    }

    public void D1(int i10) {
        C1(this.f30630w0.getResources().getDimension(i10));
    }

    public void D2(float f10) {
        if (this.f30625r0 != f10) {
            this.f30625r0 = f10;
            invalidateSelf();
            q1();
        }
    }

    public float E0() {
        return this.f30629v0;
    }

    public void E1(float f10) {
        if (this.f30629v0 != f10) {
            this.f30629v0 = f10;
            invalidateSelf();
            q1();
        }
    }

    public void E2(int i10) {
        D2(this.f30630w0.getResources().getDimension(i10));
    }

    public Drawable F0() {
        Drawable drawable = this.f30589I;
        if (drawable != null) {
            return P0.a.k(drawable);
        }
        return null;
    }

    public void F1(int i10) {
        E1(this.f30630w0.getResources().getDimension(i10));
    }

    public void F2(boolean z10) {
        if (this.f30605S0 != z10) {
            this.f30605S0 = z10;
            L2();
            onStateChange(getState());
        }
    }

    public float G0() {
        return this.f30598P;
    }

    public void G1(Drawable drawable) {
        Drawable drawableF0 = F0();
        if (drawableF0 != drawable) {
            float fH0 = h0();
            this.f30589I = drawable != null ? P0.a.l(drawable).mutate() : null;
            float fH02 = h0();
            K2(drawableF0);
            if (I2()) {
                f0(this.f30589I);
            }
            invalidateSelf();
            if (fH0 != fH02) {
                q1();
            }
        }
    }

    public boolean G2() {
        return this.f30612W0;
    }

    public ColorStateList H0() {
        return this.f30591J;
    }

    public void H1(int i10) {
        G1(AbstractC4666a.b(this.f30630w0, i10));
    }

    public final boolean H2() {
        return this.f30617Z && this.f30618k0 != null && this.f30593K0;
    }

    public float I0() {
        return this.f30575B;
    }

    public void I1(float f10) {
        if (this.f30598P != f10) {
            float fH0 = h0();
            this.f30598P = f10;
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                q1();
            }
        }
    }

    public final boolean I2() {
        return this.f30587H && this.f30589I != null;
    }

    public float J0() {
        return this.f30622o0;
    }

    public void J1(int i10) {
        I1(this.f30630w0.getResources().getDimension(i10));
    }

    public final boolean J2() {
        return this.f30602R && this.f30604S != null;
    }

    public ColorStateList K0() {
        return this.f30579D;
    }

    public void K1(ColorStateList colorStateList) {
        this.f30600Q = true;
        if (this.f30591J != colorStateList) {
            this.f30591J = colorStateList;
            if (I2()) {
                P0.a.i(this.f30589I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float L0() {
        return this.f30581E;
    }

    public void L1(int i10) {
        K1(AbstractC4666a.a(this.f30630w0, i10));
    }

    public final void L2() {
        this.f30607T0 = this.f30605S0 ? AbstractC5503b.a(this.f30583F) : null;
    }

    public Drawable M0() {
        Drawable drawable = this.f30604S;
        if (drawable != null) {
            return P0.a.k(drawable);
        }
        return null;
    }

    public void M1(int i10) {
        N1(this.f30630w0.getResources().getBoolean(i10));
    }

    public final void M2() {
        this.f30606T = new RippleDrawable(AbstractC5503b.a(a1()), this.f30604S, f30572a1);
    }

    public CharSequence N0() {
        return this.f30613X;
    }

    public void N1(boolean z10) {
        if (this.f30587H != z10) {
            boolean zI2 = I2();
            this.f30587H = z10;
            boolean zI22 = I2();
            if (zI2 != zI22) {
                if (zI22) {
                    f0(this.f30589I);
                } else {
                    K2(this.f30589I);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public float O0() {
        return this.f30628u0;
    }

    public void O1(float f10) {
        if (this.f30575B != f10) {
            this.f30575B = f10;
            invalidateSelf();
            q1();
        }
    }

    public float P0() {
        return this.f30611W;
    }

    public void P1(int i10) {
        O1(this.f30630w0.getResources().getDimension(i10));
    }

    public float Q0() {
        return this.f30627t0;
    }

    public void Q1(float f10) {
        if (this.f30622o0 != f10) {
            this.f30622o0 = f10;
            invalidateSelf();
            q1();
        }
    }

    public int[] R0() {
        return this.f30603R0;
    }

    public void R1(int i10) {
        Q1(this.f30630w0.getResources().getDimension(i10));
    }

    public ColorStateList S0() {
        return this.f30609V;
    }

    public void S1(ColorStateList colorStateList) {
        if (this.f30579D != colorStateList) {
            this.f30579D = colorStateList;
            if (this.f30616Y0) {
                a0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void T0(RectF rectF) {
        k0(getBounds(), rectF);
    }

    public void T1(int i10) {
        S1(AbstractC4666a.a(this.f30630w0, i10));
    }

    public final float U0() {
        Drawable drawable = this.f30593K0 ? this.f30618k0 : this.f30589I;
        float f10 = this.f30598P;
        if (f10 > 0.0f || drawable == null) {
            return f10;
        }
        float fCeil = (float) Math.ceil(n.b(this.f30630w0, 24));
        return ((float) drawable.getIntrinsicHeight()) <= fCeil ? drawable.getIntrinsicHeight() : fCeil;
    }

    public void U1(float f10) {
        if (this.f30581E != f10) {
            this.f30581E = f10;
            this.f30631x0.setStrokeWidth(f10);
            if (this.f30616Y0) {
                super.b0(f10);
            }
            invalidateSelf();
        }
    }

    public final float V0() {
        Drawable drawable = this.f30593K0 ? this.f30618k0 : this.f30589I;
        float f10 = this.f30598P;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public void V1(int i10) {
        U1(this.f30630w0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt W0() {
        return this.f30610V0;
    }

    public final void W1(ColorStateList colorStateList) {
        if (this.f30633z != colorStateList) {
            this.f30633z = colorStateList;
            onStateChange(getState());
        }
    }

    public C3836c X0() {
        return this.f30621n0;
    }

    public void X1(Drawable drawable) {
        Drawable drawableM0 = M0();
        if (drawableM0 != drawable) {
            float fL0 = l0();
            this.f30604S = drawable != null ? P0.a.l(drawable).mutate() : null;
            if (AbstractC5503b.f43288a) {
                M2();
            }
            float fL02 = l0();
            K2(drawableM0);
            if (J2()) {
                f0(this.f30604S);
            }
            invalidateSelf();
            if (fL0 != fL02) {
                q1();
            }
        }
    }

    public float Y0() {
        return this.f30624q0;
    }

    public void Y1(CharSequence charSequence) {
        if (this.f30613X != charSequence) {
            this.f30613X = W0.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Z0() {
        return this.f30623p0;
    }

    public void Z1(float f10) {
        if (this.f30628u0 != f10) {
            this.f30628u0 = f10;
            invalidateSelf();
            if (J2()) {
                q1();
            }
        }
    }

    @Override // n7.C5147j.b
    public void a() {
        q1();
        invalidateSelf();
    }

    public ColorStateList a1() {
        return this.f30583F;
    }

    public void a2(int i10) {
        Z1(this.f30630w0.getResources().getDimension(i10));
    }

    public C3836c b1() {
        return this.f30620m0;
    }

    public void b2(int i10) {
        X1(AbstractC4666a.b(this.f30630w0, i10));
    }

    public CharSequence c1() {
        return this.f30585G;
    }

    public void c2(float f10) {
        if (this.f30611W != f10) {
            this.f30611W = f10;
            invalidateSelf();
            if (J2()) {
                q1();
            }
        }
    }

    public C5403d d1() {
        return this.f30580D0.d();
    }

    public void d2(int i10) {
        c2(this.f30630w0.getResources().getDimension(i10));
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f30595M0;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = AbstractC4159a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        v0(canvas2, bounds);
        s0(canvas2, bounds);
        if (this.f30616Y0) {
            super.draw(canvas2);
        }
        u0(canvas2, bounds);
        x0(canvas2, bounds);
        t0(canvas2, bounds);
        r0(canvas2, bounds);
        if (this.f30612W0) {
            z0(canvas2, bounds);
        }
        w0(canvas2, bounds);
        y0(canvas2, bounds);
        if (this.f30595M0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public float e1() {
        return this.f30626s0;
    }

    public void e2(float f10) {
        if (this.f30627t0 != f10) {
            this.f30627t0 = f10;
            invalidateSelf();
            if (J2()) {
                q1();
            }
        }
    }

    public final void f0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        P0.a.g(drawable, P0.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f30604S) {
            if (drawable.isStateful()) {
                drawable.setState(R0());
            }
            P0.a.i(drawable, this.f30609V);
            return;
        }
        Drawable drawable2 = this.f30589I;
        if (drawable == drawable2 && this.f30600Q) {
            P0.a.i(drawable2, this.f30591J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float f1() {
        return this.f30625r0;
    }

    public void f2(int i10) {
        e2(this.f30630w0.getResources().getDimension(i10));
    }

    public final void g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2() || H2()) {
            float f10 = this.f30622o0 + this.f30623p0;
            float fV0 = V0();
            if (P0.a.b(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fV0;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fV0;
            }
            float fU0 = U0();
            float fExactCenterY = rect.exactCenterY() - (fU0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fU0;
        }
    }

    public final ColorFilter g1() {
        ColorFilter colorFilter = this.f30596N0;
        return colorFilter != null ? colorFilter : this.f30597O0;
    }

    public boolean g2(int[] iArr) {
        if (Arrays.equals(this.f30603R0, iArr)) {
            return false;
        }
        this.f30603R0 = iArr;
        if (J2()) {
            return r1(getState(), iArr);
        }
        return false;
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30595M0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f30596N0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f30575B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f30622o0 + h0() + this.f30625r0 + this.f30580D0.f(c1().toString()) + this.f30626s0 + l0() + this.f30629v0), this.f30614X0);
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f30616Y0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f30577C);
        } else {
            outline.setRoundRect(bounds, this.f30577C);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public float h0() {
        if (I2() || H2()) {
            return this.f30623p0 + V0() + this.f30624q0;
        }
        return 0.0f;
    }

    public boolean h1() {
        return this.f30605S0;
    }

    public void h2(ColorStateList colorStateList) {
        if (this.f30609V != colorStateList) {
            this.f30609V = colorStateList;
            if (J2()) {
                P0.a.i(this.f30604S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void i0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (J2()) {
            float f10 = this.f30629v0 + this.f30628u0 + this.f30611W + this.f30627t0 + this.f30626s0;
            if (P0.a.b(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    public void i2(int i10) {
        h2(AbstractC4666a.a(this.f30630w0, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (m1(this.f30633z) || m1(this.f30573A) || m1(this.f30579D)) {
            return true;
        }
        return (this.f30605S0 && m1(this.f30607T0)) || o1(this.f30580D0.d()) || p0() || n1(this.f30589I) || n1(this.f30618k0) || m1(this.f30599P0);
    }

    public final void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f10 = this.f30629v0 + this.f30628u0;
            if (P0.a.b(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f30611W;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f30611W;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f30611W;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public boolean j1() {
        return this.f30615Y;
    }

    public void j2(boolean z10) {
        if (this.f30602R != z10) {
            boolean zJ2 = J2();
            this.f30602R = z10;
            boolean zJ22 = J2();
            if (zJ2 != zJ22) {
                if (zJ22) {
                    f0(this.f30604S);
                } else {
                    K2(this.f30604S);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public final void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f10 = this.f30629v0 + this.f30628u0 + this.f30611W + this.f30627t0 + this.f30626s0;
            if (P0.a.b(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean k1() {
        return n1(this.f30604S);
    }

    public void k2(InterfaceC0359a interfaceC0359a) {
        this.f30608U0 = new WeakReference(interfaceC0359a);
    }

    public float l0() {
        if (J2()) {
            return this.f30627t0 + this.f30611W + this.f30628u0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.f30602R;
    }

    public void l2(TextUtils.TruncateAt truncateAt) {
        this.f30610V0 = truncateAt;
    }

    public final void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f30585G != null) {
            float fH0 = this.f30622o0 + h0() + this.f30625r0;
            float fL0 = this.f30629v0 + l0() + this.f30626s0;
            if (P0.a.b(this) == 0) {
                rectF.left = rect.left + fH0;
                rectF.right = rect.right - fL0;
            } else {
                rectF.left = rect.left + fL0;
                rectF.right = rect.right - fH0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void m2(C3836c c3836c) {
        this.f30621n0 = c3836c;
    }

    public final float n0() {
        this.f30580D0.e().getFontMetrics(this.f30634z0);
        Paint.FontMetrics fontMetrics = this.f30634z0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void n2(int i10) {
        m2(C3836c.c(this.f30630w0, i10));
    }

    public Paint.Align o0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f30585G != null) {
            float fH0 = this.f30622o0 + h0() + this.f30625r0;
            if (P0.a.b(this) == 0) {
                pointF.x = rect.left + fH0;
            } else {
                pointF.x = rect.right - fH0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - n0();
        }
        return align;
    }

    public void o2(float f10) {
        if (this.f30624q0 != f10) {
            float fH0 = h0();
            this.f30624q0 = f10;
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                q1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (I2()) {
            zOnLayoutDirectionChanged |= P0.a.g(this.f30589I, i10);
        }
        if (H2()) {
            zOnLayoutDirectionChanged |= P0.a.g(this.f30618k0, i10);
        }
        if (J2()) {
            zOnLayoutDirectionChanged |= P0.a.g(this.f30604S, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (I2()) {
            zOnLevelChange |= this.f30589I.setLevel(i10);
        }
        if (H2()) {
            zOnLevelChange |= this.f30618k0.setLevel(i10);
        }
        if (J2()) {
            zOnLevelChange |= this.f30604S.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // s7.g, android.graphics.drawable.Drawable, n7.C5147j.b
    public boolean onStateChange(int[] iArr) {
        if (this.f30616Y0) {
            super.onStateChange(iArr);
        }
        return r1(iArr, R0());
    }

    public final boolean p0() {
        return this.f30617Z && this.f30618k0 != null && this.f30615Y;
    }

    public final void p1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayH = l.h(this.f30630w0, attributeSet, j.f26131U, i10, i11, new int[0]);
        this.f30616Y0 = typedArrayH.hasValue(j.f26027F0);
        W1(AbstractC5402c.a(this.f30630w0, typedArrayH, j.f26315s0));
        A1(AbstractC5402c.a(this.f30630w0, typedArrayH, j.f26214f0));
        O1(typedArrayH.getDimension(j.f26278n0, 0.0f));
        if (typedArrayH.hasValue(j.f26222g0)) {
            C1(typedArrayH.getDimension(j.f26222g0, 0.0f));
        }
        S1(AbstractC5402c.a(this.f30630w0, typedArrayH, j.f26301q0));
        U1(typedArrayH.getDimension(j.f26308r0, 0.0f));
        t2(AbstractC5402c.a(this.f30630w0, typedArrayH, j.f26020E0));
        y2(typedArrayH.getText(j.f26166Z));
        C5403d c5403dF = AbstractC5402c.f(this.f30630w0, typedArrayH, j.f26138V);
        c5403dF.l(typedArrayH.getDimension(j.f26145W, c5403dF.j()));
        z2(c5403dF);
        int i12 = typedArrayH.getInt(j.f26152X, 0);
        if (i12 == 1) {
            l2(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            l2(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            l2(TextUtils.TruncateAt.END);
        }
        N1(typedArrayH.getBoolean(j.f26270m0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            N1(typedArrayH.getBoolean(j.f26246j0, false));
        }
        G1(AbstractC5402c.d(this.f30630w0, typedArrayH, j.f26238i0));
        if (typedArrayH.hasValue(j.f26262l0)) {
            K1(AbstractC5402c.a(this.f30630w0, typedArrayH, j.f26262l0));
        }
        I1(typedArrayH.getDimension(j.f26254k0, -1.0f));
        j2(typedArrayH.getBoolean(j.f26364z0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            j2(typedArrayH.getBoolean(j.f26329u0, false));
        }
        X1(AbstractC5402c.d(this.f30630w0, typedArrayH, j.f26322t0));
        h2(AbstractC5402c.a(this.f30630w0, typedArrayH, j.f26357y0));
        c2(typedArrayH.getDimension(j.f26343w0, 0.0f));
        s1(typedArrayH.getBoolean(j.f26174a0, false));
        z1(typedArrayH.getBoolean(j.f26206e0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            z1(typedArrayH.getBoolean(j.f26190c0, false));
        }
        u1(AbstractC5402c.d(this.f30630w0, typedArrayH, j.f26182b0));
        if (typedArrayH.hasValue(j.f26198d0)) {
            w1(AbstractC5402c.a(this.f30630w0, typedArrayH, j.f26198d0));
        }
        w2(C3836c.b(this.f30630w0, typedArrayH, j.f26034G0));
        m2(C3836c.b(this.f30630w0, typedArrayH, j.f25999B0));
        Q1(typedArrayH.getDimension(j.f26294p0, 0.0f));
        q2(typedArrayH.getDimension(j.f26013D0, 0.0f));
        o2(typedArrayH.getDimension(j.f26006C0, 0.0f));
        D2(typedArrayH.getDimension(j.f26048I0, 0.0f));
        B2(typedArrayH.getDimension(j.f26041H0, 0.0f));
        e2(typedArrayH.getDimension(j.f26350x0, 0.0f));
        Z1(typedArrayH.getDimension(j.f26336v0, 0.0f));
        E1(typedArrayH.getDimension(j.f26230h0, 0.0f));
        s2(typedArrayH.getDimensionPixelSize(j.f26159Y, Integer.MAX_VALUE));
        typedArrayH.recycle();
    }

    public void p2(int i10) {
        o2(this.f30630w0.getResources().getDimension(i10));
    }

    public void q1() {
        InterfaceC0359a interfaceC0359a = (InterfaceC0359a) this.f30608U0.get();
        if (interfaceC0359a != null) {
            interfaceC0359a.a();
        }
    }

    public void q2(float f10) {
        if (this.f30623p0 != f10) {
            float fH0 = h0();
            this.f30623p0 = f10;
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                q1();
            }
        }
    }

    public final void r0(Canvas canvas, Rect rect) {
        if (H2()) {
            g0(rect, this.f30574A0);
            RectF rectF = this.f30574A0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f30618k0.setBounds(0, 0, (int) this.f30574A0.width(), (int) this.f30574A0.height());
            this.f30618k0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public final boolean r1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f30633z;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f30582E0) : 0);
        boolean state = true;
        if (this.f30582E0 != iL) {
            this.f30582E0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f30573A;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f30584F0) : 0);
        if (this.f30584F0 != iL2) {
            this.f30584F0 = iL2;
            zOnStateChange = true;
        }
        int iG = AbstractC4365a.g(iL, iL2);
        if ((this.f30586G0 != iG) | (x() == null)) {
            this.f30586G0 = iG;
            U(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f30579D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f30588H0) : 0;
        if (this.f30588H0 != colorForState) {
            this.f30588H0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f30607T0 == null || !AbstractC5503b.b(iArr)) ? 0 : this.f30607T0.getColorForState(iArr, this.f30590I0);
        if (this.f30590I0 != colorForState2) {
            this.f30590I0 = colorForState2;
            if (this.f30605S0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f30580D0.d() == null || this.f30580D0.d().i() == null) ? 0 : this.f30580D0.d().i().getColorForState(iArr, this.f30592J0);
        if (this.f30592J0 != colorForState3) {
            this.f30592J0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = i1(getState(), R.attr.state_checked) && this.f30615Y;
        if (this.f30593K0 == z11 || this.f30618k0 == null) {
            z10 = false;
        } else {
            float fH0 = h0();
            this.f30593K0 = z11;
            if (fH0 != h0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f30599P0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f30594L0) : 0;
        if (this.f30594L0 != colorForState4) {
            this.f30594L0 = colorForState4;
            this.f30597O0 = AbstractC4807a.a(this, this.f30599P0, this.f30601Q0);
        } else {
            state = zOnStateChange;
        }
        if (n1(this.f30589I)) {
            state |= this.f30589I.setState(iArr);
        }
        if (n1(this.f30618k0)) {
            state |= this.f30618k0.setState(iArr);
        }
        if (n1(this.f30604S)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f30604S.setState(iArr3);
        }
        if (AbstractC5503b.f43288a && n1(this.f30606T)) {
            state |= this.f30606T.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            q1();
        }
        return state;
    }

    public void r2(int i10) {
        q2(this.f30630w0.getResources().getDimension(i10));
    }

    public final void s0(Canvas canvas, Rect rect) {
        if (this.f30616Y0) {
            return;
        }
        this.f30631x0.setColor(this.f30584F0);
        this.f30631x0.setStyle(Paint.Style.FILL);
        this.f30631x0.setColorFilter(g1());
        this.f30574A0.set(rect);
        canvas.drawRoundRect(this.f30574A0, D0(), D0(), this.f30631x0);
    }

    public void s1(boolean z10) {
        if (this.f30615Y != z10) {
            this.f30615Y = z10;
            float fH0 = h0();
            if (!z10 && this.f30593K0) {
                this.f30593K0 = false;
            }
            float fH02 = h0();
            invalidateSelf();
            if (fH0 != fH02) {
                q1();
            }
        }
    }

    public void s2(int i10) {
        this.f30614X0 = i10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f30595M0 != i10) {
            this.f30595M0 = i10;
            invalidateSelf();
        }
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f30596N0 != colorFilter) {
            this.f30596N0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f30599P0 != colorStateList) {
            this.f30599P0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // s7.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f30601Q0 != mode) {
            this.f30601Q0 = mode;
            this.f30597O0 = AbstractC4807a.a(this, this.f30599P0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (I2()) {
            visible |= this.f30589I.setVisible(z10, z11);
        }
        if (H2()) {
            visible |= this.f30618k0.setVisible(z10, z11);
        }
        if (J2()) {
            visible |= this.f30604S.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Canvas canvas, Rect rect) {
        if (I2()) {
            g0(rect, this.f30574A0);
            RectF rectF = this.f30574A0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f30589I.setBounds(0, 0, (int) this.f30574A0.width(), (int) this.f30574A0.height());
            this.f30589I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void t1(int i10) {
        s1(this.f30630w0.getResources().getBoolean(i10));
    }

    public void t2(ColorStateList colorStateList) {
        if (this.f30583F != colorStateList) {
            this.f30583F = colorStateList;
            L2();
            onStateChange(getState());
        }
    }

    public final void u0(Canvas canvas, Rect rect) {
        if (this.f30581E <= 0.0f || this.f30616Y0) {
            return;
        }
        this.f30631x0.setColor(this.f30588H0);
        this.f30631x0.setStyle(Paint.Style.STROKE);
        if (!this.f30616Y0) {
            this.f30631x0.setColorFilter(g1());
        }
        RectF rectF = this.f30574A0;
        float f10 = rect.left;
        float f11 = this.f30581E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f30577C - (this.f30581E / 2.0f);
        canvas.drawRoundRect(this.f30574A0, f12, f12, this.f30631x0);
    }

    public void u1(Drawable drawable) {
        if (this.f30618k0 != drawable) {
            float fH0 = h0();
            this.f30618k0 = drawable;
            float fH02 = h0();
            K2(this.f30618k0);
            f0(this.f30618k0);
            invalidateSelf();
            if (fH0 != fH02) {
                q1();
            }
        }
    }

    public void u2(int i10) {
        t2(AbstractC4666a.a(this.f30630w0, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        if (this.f30616Y0) {
            return;
        }
        this.f30631x0.setColor(this.f30582E0);
        this.f30631x0.setStyle(Paint.Style.FILL);
        this.f30574A0.set(rect);
        canvas.drawRoundRect(this.f30574A0, D0(), D0(), this.f30631x0);
    }

    public void v1(int i10) {
        u1(AbstractC4666a.b(this.f30630w0, i10));
    }

    public void v2(boolean z10) {
        this.f30612W0 = z10;
    }

    public final void w0(Canvas canvas, Rect rect) {
        if (J2()) {
            j0(rect, this.f30574A0);
            RectF rectF = this.f30574A0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f30604S.setBounds(0, 0, (int) this.f30574A0.width(), (int) this.f30574A0.height());
            if (AbstractC5503b.f43288a) {
                this.f30606T.setBounds(this.f30604S.getBounds());
                this.f30606T.jumpToCurrentState();
                this.f30606T.draw(canvas);
            } else {
                this.f30604S.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    public void w1(ColorStateList colorStateList) {
        if (this.f30619l0 != colorStateList) {
            this.f30619l0 = colorStateList;
            if (p0()) {
                P0.a.i(this.f30618k0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void w2(C3836c c3836c) {
        this.f30620m0 = c3836c;
    }

    public final void x0(Canvas canvas, Rect rect) {
        this.f30631x0.setColor(this.f30590I0);
        this.f30631x0.setStyle(Paint.Style.FILL);
        this.f30574A0.set(rect);
        if (!this.f30616Y0) {
            canvas.drawRoundRect(this.f30574A0, D0(), D0(), this.f30631x0);
        } else {
            h(new RectF(rect), this.f30578C0);
            super.p(canvas, this.f30631x0, this.f30578C0, u());
        }
    }

    public void x1(int i10) {
        w1(AbstractC4666a.a(this.f30630w0, i10));
    }

    public void x2(int i10) {
        w2(C3836c.c(this.f30630w0, i10));
    }

    public final void y0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f30632y0;
        if (paint != null) {
            paint.setColor(O0.a.j(-16777216, 127));
            canvas.drawRect(rect, this.f30632y0);
            if (I2() || H2()) {
                g0(rect, this.f30574A0);
                canvas.drawRect(this.f30574A0, this.f30632y0);
            }
            if (this.f30585G != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f30632y0);
            } else {
                canvas2 = canvas;
            }
            if (J2()) {
                j0(rect, this.f30574A0);
                canvas2.drawRect(this.f30574A0, this.f30632y0);
            }
            this.f30632y0.setColor(O0.a.j(-65536, 127));
            i0(rect, this.f30574A0);
            canvas2.drawRect(this.f30574A0, this.f30632y0);
            this.f30632y0.setColor(O0.a.j(-16711936, 127));
            k0(rect, this.f30574A0);
            canvas2.drawRect(this.f30574A0, this.f30632y0);
        }
    }

    public void y1(int i10) {
        z1(this.f30630w0.getResources().getBoolean(i10));
    }

    public void y2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f30585G, charSequence)) {
            return;
        }
        this.f30585G = charSequence;
        this.f30580D0.i(true);
        invalidateSelf();
        q1();
    }

    public final void z0(Canvas canvas, Rect rect) {
        if (this.f30585G != null) {
            Paint.Align alignO0 = o0(rect, this.f30576B0);
            m0(rect, this.f30574A0);
            if (this.f30580D0.d() != null) {
                this.f30580D0.e().drawableState = getState();
                this.f30580D0.j(this.f30630w0);
            }
            this.f30580D0.e().setTextAlign(alignO0);
            int iSave = 0;
            boolean z10 = Math.round(this.f30580D0.f(c1().toString())) > Math.round(this.f30574A0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f30574A0);
            }
            CharSequence charSequenceEllipsize = this.f30585G;
            if (z10 && this.f30610V0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f30580D0.e(), this.f30574A0.width(), this.f30610V0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f30576B0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f30580D0.e());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void z1(boolean z10) {
        if (this.f30617Z != z10) {
            boolean zH2 = H2();
            this.f30617Z = z10;
            boolean zH22 = H2();
            if (zH2 != zH22) {
                if (zH22) {
                    f0(this.f30618k0);
                } else {
                    K2(this.f30618k0);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public void z2(C5403d c5403d) {
        this.f30580D0.h(c5403d, this.f30630w0);
    }
}
