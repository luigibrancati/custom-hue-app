package n7;

import Y0.AbstractC2554h;
import Y0.E;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import d7.C3834a;
import i7.AbstractC4365a;
import p7.AbstractC5406g;
import p7.C5400a;
import p7.C5403d;

/* JADX INFO: renamed from: n7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5139b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f40623t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Paint f40624u0 = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Typeface f40625A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f40626B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Typeface f40627C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Typeface f40628D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C5400a f40629E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C5400a f40630F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f40631G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f40632H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f40633I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f40635K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Bitmap f40636L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Paint f40637M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f40638N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f40639O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f40640P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f40641Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f40642R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f40643S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int[] f40644T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f40645U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final TextPaint f40646V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final TextPaint f40647W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TimeInterpolator f40648X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TimeInterpolator f40649Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f40650Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f40651a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f40652a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40653b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f40654b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f40655c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f40656c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40657d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f40658d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f40659e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f40660e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f40661f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f40662f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40663g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f40664g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f40665h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f40666h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f40667i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f40668i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f40669j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f40670j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public StaticLayout f40672k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f40674l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f40676m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f40678n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f40679o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public CharSequence f40680o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f40681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f40683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f40685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f40687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f40689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f40690u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f40691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f40692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f40693x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f40694y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Typeface f40695z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40671k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40673l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f40675m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f40677n = 15.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f40634J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f40682p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f40684q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f40686r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f40688s0 = C5146i.f40709n;

    /* JADX INFO: renamed from: n7.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C5400a.InterfaceC0561a {
        public a() {
        }

        @Override // p7.C5400a.InterfaceC0561a
        public void a(Typeface typeface) {
            C5139b.this.T(typeface);
        }
    }

    public C5139b(View view) {
        this.f40651a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f40646V = textPaint;
        this.f40647W = new TextPaint(textPaint);
        this.f40667i = new Rect();
        this.f40665h = new Rect();
        this.f40669j = new RectF();
        this.f40661f = e();
        H(view.getContext().getResources().getConfiguration());
    }

    public static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    public static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C3834a.a(f10, f11, f12);
    }

    public static boolean M(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public final void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f40675m);
        textPaint.setTypeface(this.f40625A);
        textPaint.setLetterSpacing(this.f40668i0);
    }

    public final void B(float f10) {
        if (this.f40657d) {
            this.f40669j.set(f10 < this.f40661f ? this.f40665h : this.f40667i);
            return;
        }
        this.f40669j.left = G(this.f40665h.left, this.f40667i.left, f10, this.f40648X);
        this.f40669j.top = G(this.f40685r, this.f40687s, f10, this.f40648X);
        this.f40669j.right = G(this.f40665h.right, this.f40667i.right, f10, this.f40648X);
        this.f40669j.bottom = G(this.f40665h.bottom, this.f40667i.bottom, f10, this.f40648X);
    }

    public final boolean D() {
        return E.w(this.f40651a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList = this.f40681p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f40679o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? W0.d.f17658d : W0.d.f17657c).isRtl(charSequence, 0, charSequence.length());
    }

    public void H(Configuration configuration) {
        Typeface typeface = this.f40695z;
        if (typeface != null) {
            this.f40694y = AbstractC5406g.b(configuration, typeface);
        }
        Typeface typeface2 = this.f40627C;
        if (typeface2 != null) {
            this.f40626B = AbstractC5406g.b(configuration, typeface2);
        }
        Typeface typeface3 = this.f40694y;
        if (typeface3 == null) {
            typeface3 = this.f40695z;
        }
        this.f40693x = typeface3;
        Typeface typeface4 = this.f40626B;
        if (typeface4 == null) {
            typeface4 = this.f40627C;
        }
        this.f40625A = typeface4;
        L(true);
    }

    public final float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void J() {
        this.f40653b = this.f40667i.width() > 0 && this.f40667i.height() > 0 && this.f40665h.width() > 0 && this.f40665h.height() > 0;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z10) {
        if ((this.f40651a.getHeight() <= 0 || this.f40651a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (M(this.f40667i, i10, i11, i12, i13)) {
            return;
        }
        this.f40667i.set(i10, i11, i12, i13);
        this.f40645U = true;
        J();
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        C5403d c5403d = new C5403d(this.f40651a.getContext(), i10);
        if (c5403d.i() != null) {
            this.f40681p = c5403d.i();
        }
        if (c5403d.j() != 0.0f) {
            this.f40677n = c5403d.j();
        }
        ColorStateList colorStateList = c5403d.f42222c;
        if (colorStateList != null) {
            this.f40656c0 = colorStateList;
        }
        this.f40652a0 = c5403d.f42227h;
        this.f40654b0 = c5403d.f42228i;
        this.f40650Z = c5403d.f42229j;
        this.f40666h0 = c5403d.f42231l;
        C5400a c5400a = this.f40630F;
        if (c5400a != null) {
            c5400a.c();
        }
        this.f40630F = new C5400a(new a(), c5403d.e());
        c5403d.h(this.f40651a.getContext(), this.f40630F);
        K();
    }

    public final void Q(float f10) {
        this.f40676m0 = f10;
        E.W(this.f40651a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.f40681p != colorStateList) {
            this.f40681p = colorStateList;
            K();
        }
    }

    public void S(int i10) {
        if (this.f40673l != i10) {
            this.f40673l = i10;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public final boolean U(Typeface typeface) {
        C5400a c5400a = this.f40630F;
        if (c5400a != null) {
            c5400a.c();
        }
        if (this.f40695z == typeface) {
            return false;
        }
        this.f40695z = typeface;
        Typeface typefaceB = AbstractC5406g.b(this.f40651a.getContext().getResources().getConfiguration(), typeface);
        this.f40694y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f40695z;
        }
        this.f40693x = typefaceB;
        return true;
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (M(this.f40665h, i10, i11, i12, i13)) {
            return;
        }
        this.f40665h.set(i10, i11, i12, i13);
        this.f40645U = true;
        J();
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f40668i0 != f10) {
            this.f40668i0 = f10;
            K();
        }
    }

    public final void Y(float f10) {
        this.f40678n0 = f10;
        E.W(this.f40651a);
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f40679o != colorStateList) {
            this.f40679o = colorStateList;
            K();
        }
    }

    public void a0(int i10) {
        if (this.f40671k != i10) {
            this.f40671k = i10;
            K();
        }
    }

    public final void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f40632H;
        if (charSequence != null && (staticLayout = this.f40672k0) != null) {
            this.f40680o0 = TextUtils.ellipsize(charSequence, this.f40646V, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f40680o0;
        float fI = 0.0f;
        if (charSequence2 != null) {
            this.f40674l0 = I(this.f40646V, charSequence2);
        } else {
            this.f40674l0 = 0.0f;
        }
        int iB = AbstractC2554h.b(this.f40673l, this.f40633I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f40687s = this.f40667i.top;
        } else if (i10 != 80) {
            this.f40687s = this.f40667i.centerY() - ((this.f40646V.descent() - this.f40646V.ascent()) / 2.0f);
        } else {
            this.f40687s = this.f40667i.bottom + this.f40646V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f40690u = this.f40667i.centerX() - (this.f40674l0 / 2.0f);
        } else if (i11 != 5) {
            this.f40690u = this.f40667i.left;
        } else {
            this.f40690u = this.f40667i.right - this.f40674l0;
        }
        i(0.0f, z10);
        float height = this.f40672k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f40672k0;
        if (staticLayout2 == null || this.f40682p0 <= 1) {
            CharSequence charSequence3 = this.f40632H;
            if (charSequence3 != null) {
                fI = I(this.f40646V, charSequence3);
            }
        } else {
            fI = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f40672k0;
        this.f40683q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iB2 = AbstractC2554h.b(this.f40671k, this.f40633I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f40685r = this.f40665h.top;
        } else if (i12 != 80) {
            this.f40685r = this.f40665h.centerY() - (height / 2.0f);
        } else {
            this.f40685r = (this.f40665h.bottom - height) + this.f40646V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f40689t = this.f40665h.centerX() - (fI / 2.0f);
        } else if (i13 != 5) {
            this.f40689t = this.f40665h.left;
        } else {
            this.f40689t = this.f40665h.right - fI;
        }
        j();
        e0(this.f40655c);
    }

    public void b0(float f10) {
        if (this.f40675m != f10) {
            this.f40675m = f10;
            K();
        }
    }

    public final void c() {
        g(this.f40655c);
    }

    public final boolean c0(Typeface typeface) {
        C5400a c5400a = this.f40629E;
        if (c5400a != null) {
            c5400a.c();
        }
        if (this.f40627C == typeface) {
            return false;
        }
        this.f40627C = typeface;
        Typeface typefaceB = AbstractC5406g.b(this.f40651a.getContext().getResources().getConfiguration(), typeface);
        this.f40626B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f40627C;
        }
        this.f40625A = typefaceB;
        return true;
    }

    public final float d(float f10) {
        float f11 = this.f40661f;
        return f10 <= f11 ? C3834a.b(1.0f, 0.0f, this.f40659e, f11, f10) : C3834a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    public void d0(float f10) {
        float fB = S0.a.b(f10, 0.0f, 1.0f);
        if (fB != this.f40655c) {
            this.f40655c = fB;
            c();
        }
    }

    public final float e() {
        float f10 = this.f40659e;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    public final void e0(float f10) {
        h(f10);
        boolean z10 = f40623t0 && this.f40638N != 1.0f;
        this.f40635K = z10;
        if (z10) {
            n();
        }
        E.W(this.f40651a);
    }

    public final boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.f40634J ? F(charSequence, zD) : zD;
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.f40648X = timeInterpolator;
        K();
    }

    public final void g(float f10) {
        float f11;
        B(f10);
        if (!this.f40657d) {
            this.f40691v = G(this.f40689t, this.f40690u, f10, this.f40648X);
            this.f40692w = G(this.f40685r, this.f40687s, f10, this.f40648X);
            e0(f10);
            f11 = f10;
        } else if (f10 < this.f40661f) {
            this.f40691v = this.f40689t;
            this.f40692w = this.f40685r;
            e0(0.0f);
            f11 = 0.0f;
        } else {
            this.f40691v = this.f40690u;
            this.f40692w = this.f40687s - Math.max(0, this.f40663g);
            e0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C3834a.f33147b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f40681p != this.f40679o) {
            this.f40646V.setColor(a(v(), t(), f11));
        } else {
            this.f40646V.setColor(t());
        }
        float f12 = this.f40666h0;
        float f13 = this.f40668i0;
        if (f12 != f13) {
            this.f40646V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.f40646V.setLetterSpacing(f12);
        }
        this.f40640P = G(this.f40658d0, this.f40650Z, f10, null);
        this.f40641Q = G(this.f40660e0, this.f40652a0, f10, null);
        this.f40642R = G(this.f40662f0, this.f40654b0, f10, null);
        int iA = a(u(this.f40664g0), u(this.f40656c0), f10);
        this.f40643S = iA;
        this.f40646V.setShadowLayer(this.f40640P, this.f40641Q, this.f40642R, iA);
        if (this.f40657d) {
            this.f40646V.setAlpha((int) (d(f10) * this.f40646V.getAlpha()));
        }
        E.W(this.f40651a);
    }

    public final boolean g0(int[] iArr) {
        this.f40644T = iArr;
        if (!E()) {
            return false;
        }
        K();
        return true;
    }

    public final void h(float f10) {
        i(f10, false);
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f40631G, charSequence)) {
            this.f40631G = charSequence;
            this.f40632H = null;
            j();
            K();
        }
    }

    public final void i(float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        boolean z12;
        if (this.f40631G == null) {
            return;
        }
        float fWidth = this.f40667i.width();
        float fWidth2 = this.f40665h.width();
        if (C(f10, 1.0f)) {
            f11 = this.f40677n;
            f12 = this.f40666h0;
            this.f40638N = 1.0f;
            Typeface typeface = this.f40628D;
            Typeface typeface2 = this.f40693x;
            if (typeface != typeface2) {
                this.f40628D = typeface2;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            float f13 = this.f40675m;
            float f14 = this.f40668i0;
            Typeface typeface3 = this.f40628D;
            Typeface typeface4 = this.f40625A;
            if (typeface3 != typeface4) {
                this.f40628D = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (C(f10, 0.0f)) {
                this.f40638N = 1.0f;
            } else {
                this.f40638N = G(this.f40675m, this.f40677n, f10, this.f40649Y) / this.f40675m;
            }
            float f15 = this.f40677n / this.f40675m;
            fWidth = (!z10 && fWidth2 * f15 > fWidth) ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            f11 = f13;
            f12 = f14;
            z12 = z11;
        }
        if (fWidth > 0.0f) {
            z12 = ((this.f40639O > f11 ? 1 : (this.f40639O == f11 ? 0 : -1)) != 0) || ((this.f40670j0 > f12 ? 1 : (this.f40670j0 == f12 ? 0 : -1)) != 0) || this.f40645U || z12;
            this.f40639O = f11;
            this.f40670j0 = f12;
            this.f40645U = false;
        }
        if (this.f40632H == null || z12) {
            this.f40646V.setTextSize(this.f40639O);
            this.f40646V.setTypeface(this.f40628D);
            this.f40646V.setLetterSpacing(this.f40670j0);
            this.f40646V.setLinearText(this.f40638N != 1.0f);
            this.f40633I = f(this.f40631G);
            StaticLayout staticLayoutK = k(k0() ? this.f40682p0 : 1, fWidth, this.f40633I);
            this.f40672k0 = staticLayoutK;
            this.f40632H = staticLayoutK.getText();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.f40649Y = timeInterpolator;
        K();
    }

    public final void j() {
        Bitmap bitmap = this.f40636L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f40636L = null;
        }
    }

    public void j0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zC0 = c0(typeface);
        if (zU || zC0) {
            K();
        }
    }

    public final StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) X0.h.g(C5146i.b(this.f40631G, this.f40646V, (int) f10).d(TextUtils.TruncateAt.END).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f40684q0, this.f40686r0).e(this.f40688s0).a());
    }

    public final boolean k0() {
        if (this.f40682p0 > 1) {
            return (!this.f40633I || this.f40657d) && !this.f40635K;
        }
        return false;
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f40632H == null || !this.f40653b) {
            return;
        }
        this.f40646V.setTextSize(this.f40639O);
        float f10 = this.f40691v;
        float f11 = this.f40692w;
        boolean z10 = this.f40635K && this.f40636L != null;
        float f12 = this.f40638N;
        if (f12 != 1.0f && !this.f40657d) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.f40636L, f10, f11, this.f40637M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!k0() || (this.f40657d && this.f40655c <= this.f40661f)) {
            canvas.translate(f10, f11);
            this.f40672k0.draw(canvas);
        } else {
            m(canvas, this.f40691v - this.f40672k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public final void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f40646V.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.f40646V.setAlpha((int) (this.f40678n0 * f12));
        TextPaint textPaint = this.f40646V;
        textPaint.setShadowLayer(this.f40640P, this.f40641Q, this.f40642R, AbstractC4365a.a(this.f40643S, textPaint.getAlpha()));
        this.f40672k0.draw(canvas);
        this.f40646V.setAlpha((int) (this.f40676m0 * f12));
        TextPaint textPaint2 = this.f40646V;
        textPaint2.setShadowLayer(this.f40640P, this.f40641Q, this.f40642R, AbstractC4365a.a(this.f40643S, textPaint2.getAlpha()));
        int lineBaseline = this.f40672k0.getLineBaseline(0);
        CharSequence charSequence = this.f40680o0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.f40646V);
        this.f40646V.setShadowLayer(this.f40640P, this.f40641Q, this.f40642R, this.f40643S);
        if (this.f40657d) {
            return;
        }
        String strTrim = this.f40680o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        this.f40646V.setAlpha(alpha);
        canvas.drawText(strTrim, 0, Math.min(this.f40672k0.getLineEnd(0), strTrim.length()), 0.0f, f13, (Paint) this.f40646V);
    }

    public final void n() {
        if (this.f40636L != null || this.f40665h.isEmpty() || TextUtils.isEmpty(this.f40632H)) {
            return;
        }
        g(0.0f);
        int width = this.f40672k0.getWidth();
        int height = this.f40672k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f40636L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f40672k0.draw(new Canvas(this.f40636L));
        if (this.f40637M == null) {
            this.f40637M = new Paint(3);
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f40633I = f(this.f40631G);
        rectF.left = r(i10, i11);
        rectF.top = this.f40667i.top;
        rectF.right = s(rectF, i10, i11);
        rectF.bottom = this.f40667i.top + q();
    }

    public ColorStateList p() {
        return this.f40681p;
    }

    public float q() {
        z(this.f40647W);
        return -this.f40647W.ascent();
    }

    public final float r(int i10, int i11) {
        float f10;
        float f11;
        int i12;
        if (i11 == 17 || (i11 & 7) == 1) {
            f10 = i10 / 2.0f;
            f11 = this.f40674l0 / 2.0f;
        } else if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            if (this.f40633I) {
                i12 = this.f40667i.left;
                return i12;
            }
            f10 = this.f40667i.right;
            f11 = this.f40674l0;
        } else {
            if (!this.f40633I) {
                i12 = this.f40667i.left;
                return i12;
            }
            f10 = this.f40667i.right;
            f11 = this.f40674l0;
        }
        return f10 - f11;
    }

    public final float s(RectF rectF, int i10, int i11) {
        float f10;
        float f11;
        int i12;
        if (i11 == 17 || (i11 & 7) == 1) {
            f10 = i10 / 2.0f;
            f11 = this.f40674l0 / 2.0f;
        } else if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            if (!this.f40633I) {
                i12 = this.f40667i.right;
                return i12;
            }
            f10 = rectF.left;
            f11 = this.f40674l0;
        } else {
            if (this.f40633I) {
                i12 = this.f40667i.right;
                return i12;
            }
            f10 = rectF.left;
            f11 = this.f40674l0;
        }
        return f10 + f11;
    }

    public int t() {
        return u(this.f40681p);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f40644T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.f40679o);
    }

    public float w() {
        A(this.f40647W);
        return -this.f40647W.ascent();
    }

    public float x() {
        return this.f40655c;
    }

    public final Layout.Alignment y() {
        int iB = AbstractC2554h.b(this.f40671k, this.f40633I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f40633I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f40633I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public final void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f40677n);
        textPaint.setTypeface(this.f40693x);
        textPaint.setLetterSpacing(this.f40666h0);
    }
}
