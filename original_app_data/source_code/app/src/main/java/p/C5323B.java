package p;

import N0.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: p.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5323B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f41727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U f41728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U f41729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U f41730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U f41731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U f41732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U f41733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U f41734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5325D f41735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41736j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41737k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f41738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41739m;

    /* JADX INFO: renamed from: p.B$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f41744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f41745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f41746c;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f41744a = textView;
            this.f41745b = typeface;
            this.f41746c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41744a.setTypeface(this.f41745b, this.f41746c);
        }
    }

    /* JADX INFO: renamed from: p.B$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: p.B$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: p.B$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public C5323B(TextView textView) {
        this.f41727a = textView;
        this.f41735i = new C5325D(textView);
    }

    public static U d(Context context, C5348j c5348j, int i10) {
        ColorStateList colorStateListF = c5348j.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        U u10 = new U();
        u10.f41888d = true;
        u10.f41885a = colorStateListF;
        return u10;
    }

    public void A(int i10, float f10) {
        if (c0.f41914a || l()) {
            return;
        }
        B(i10, f10);
    }

    public final void B(int i10, float f10) {
        this.f41735i.t(i10, f10);
    }

    public final void C(Context context, W w10) {
        String strO;
        this.f41736j = w10.k(h.j.f35961E2, this.f41736j);
        int iK = w10.k(h.j.f35973H2, -1);
        this.f41737k = iK;
        if (iK != -1) {
            this.f41736j &= 2;
        }
        if (!w10.s(h.j.f35969G2) && !w10.s(h.j.f35977I2)) {
            if (w10.s(h.j.f35957D2)) {
                this.f41739m = false;
                int iK2 = w10.k(h.j.f35957D2, 1);
                if (iK2 == 1) {
                    this.f41738l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f41738l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f41738l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f41738l = null;
        int i10 = w10.s(h.j.f35977I2) ? h.j.f35977I2 : h.j.f35969G2;
        int i11 = this.f41737k;
        int i12 = this.f41736j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = w10.j(i10, this.f41736j, new a(i11, i12, new WeakReference(this.f41727a)));
                if (typefaceJ != null) {
                    if (this.f41737k != -1) {
                        this.f41738l = e.a(Typeface.create(typefaceJ, 0), this.f41737k, (this.f41736j & 2) != 0);
                    } else {
                        this.f41738l = typefaceJ;
                    }
                }
                this.f41739m = this.f41738l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f41738l != null || (strO = w10.o(i10)) == null) {
            return;
        }
        if (this.f41737k != -1) {
            this.f41738l = e.a(Typeface.create(strO, 0), this.f41737k, (this.f41736j & 2) != 0);
        } else {
            this.f41738l = Typeface.create(strO, this.f41736j);
        }
    }

    public final void a(Drawable drawable, U u10) {
        if (drawable == null || u10 == null) {
            return;
        }
        C5348j.i(drawable, u10, this.f41727a.getDrawableState());
    }

    public void b() {
        if (this.f41728b != null || this.f41729c != null || this.f41730d != null || this.f41731e != null) {
            Drawable[] compoundDrawables = this.f41727a.getCompoundDrawables();
            a(compoundDrawables[0], this.f41728b);
            a(compoundDrawables[1], this.f41729c);
            a(compoundDrawables[2], this.f41730d);
            a(compoundDrawables[3], this.f41731e);
        }
        if (this.f41732f == null && this.f41733g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f41727a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f41732f);
        a(compoundDrawablesRelative[2], this.f41733g);
    }

    public void c() {
        this.f41735i.a();
    }

    public int e() {
        return this.f41735i.f();
    }

    public int f() {
        return this.f41735i.g();
    }

    public int g() {
        return this.f41735i.h();
    }

    public int[] h() {
        return this.f41735i.i();
    }

    public int i() {
        return this.f41735i.j();
    }

    public ColorStateList j() {
        U u10 = this.f41734h;
        if (u10 != null) {
            return u10.f41885a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        U u10 = this.f41734h;
        if (u10 != null) {
            return u10.f41886b;
        }
        return null;
    }

    public boolean l() {
        return this.f41735i.n();
    }

    public void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        int iA;
        float f10;
        Context context = this.f41727a.getContext();
        C5348j c5348jB = C5348j.b();
        W wV = W.v(context, attributeSet, h.j.f36038Y, i10, 0);
        TextView textView = this.f41727a;
        Y0.E.d0(textView, textView.getContext(), h.j.f36038Y, attributeSet, wV.r(), i10, 0);
        int iN = wV.n(h.j.f36042Z, -1);
        if (wV.s(h.j.f36057c0)) {
            this.f41728b = d(context, c5348jB, wV.n(h.j.f36057c0, 0));
        }
        if (wV.s(h.j.f36047a0)) {
            this.f41729c = d(context, c5348jB, wV.n(h.j.f36047a0, 0));
        }
        if (wV.s(h.j.f36062d0)) {
            this.f41730d = d(context, c5348jB, wV.n(h.j.f36062d0, 0));
        }
        if (wV.s(h.j.f36052b0)) {
            this.f41731e = d(context, c5348jB, wV.n(h.j.f36052b0, 0));
        }
        if (wV.s(h.j.f36067e0)) {
            this.f41732f = d(context, c5348jB, wV.n(h.j.f36067e0, 0));
        }
        if (wV.s(h.j.f36072f0)) {
            this.f41733g = d(context, c5348jB, wV.n(h.j.f36072f0, 0));
        }
        wV.x();
        boolean z11 = this.f41727a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z12 = true;
        if (iN != -1) {
            W wT = W.t(context, iN, h.j.f35949B2);
            if (z11 || !wT.s(h.j.f35985K2)) {
                zA = false;
                z10 = false;
            } else {
                zA = wT.a(h.j.f35985K2, false);
                z10 = true;
            }
            C(context, wT);
            strO = wT.s(h.j.f35989L2) ? wT.o(h.j.f35989L2) : null;
            strO2 = wT.s(h.j.f35981J2) ? wT.o(h.j.f35981J2) : null;
            wT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        W wV2 = W.v(context, attributeSet, h.j.f35949B2, i10, 0);
        if (z11 || !wV2.s(h.j.f35985K2)) {
            z12 = z10;
        } else {
            zA = wV2.a(h.j.f35985K2, false);
        }
        if (wV2.s(h.j.f35989L2)) {
            strO = wV2.o(h.j.f35989L2);
        }
        if (wV2.s(h.j.f35981J2)) {
            strO2 = wV2.o(h.j.f35981J2);
        }
        if (wV2.s(h.j.f35953C2) && wV2.f(h.j.f35953C2, -1) == 0) {
            this.f41727a.setTextSize(0, 0.0f);
        }
        C(context, wV2);
        wV2.x();
        if (!z11 && z12) {
            s(zA);
        }
        Typeface typeface = this.f41738l;
        if (typeface != null) {
            if (this.f41737k == -1) {
                this.f41727a.setTypeface(typeface, this.f41736j);
            } else {
                this.f41727a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            d.d(this.f41727a, strO2);
        }
        if (strO != null) {
            c.b(this.f41727a, c.a(strO));
        }
        this.f41735i.o(attributeSet, i10);
        if (c0.f41914a && this.f41735i.j() != 0) {
            int[] iArrI = this.f41735i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f41727a) != -1.0f) {
                    d.b(this.f41727a, this.f41735i.g(), this.f41735i.f(), this.f41735i.h(), 0);
                } else {
                    d.c(this.f41727a, iArrI, 0);
                }
            }
        }
        W wU = W.u(context, attributeSet, h.j.f36077g0);
        int iN2 = wU.n(h.j.f36117o0, -1);
        Drawable drawableC = iN2 != -1 ? c5348jB.c(context, iN2) : null;
        int iN3 = wU.n(h.j.f36142t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c5348jB.c(context, iN3) : null;
        int iN4 = wU.n(h.j.f36122p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c5348jB.c(context, iN4) : null;
        int iN5 = wU.n(h.j.f36107m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c5348jB.c(context, iN5) : null;
        int iN6 = wU.n(h.j.f36127q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c5348jB.c(context, iN6) : null;
        int iN7 = wU.n(h.j.f36112n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c5348jB.c(context, iN7) : null);
        if (wU.s(h.j.f36132r0)) {
            c1.i.f(this.f41727a, wU.c(h.j.f36132r0));
        }
        if (wU.s(h.j.f36137s0)) {
            c1.i.g(this.f41727a, AbstractC5329H.d(wU.k(h.j.f36137s0, -1), null));
        }
        int iF = wU.f(h.j.f36152v0, -1);
        int iF2 = wU.f(h.j.f36157w0, -1);
        if (wU.s(h.j.f36162x0)) {
            TypedValue typedValueW = wU.w(h.j.f36162x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = wU.f(h.j.f36162x0, -1);
                iA = -1;
            } else {
                iA = X0.k.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        wU.x();
        if (iF != -1) {
            c1.i.i(this.f41727a, iF);
        }
        if (iF2 != -1) {
            c1.i.j(this.f41727a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                c1.i.k(this.f41727a, (int) f10);
            } else {
                c1.i.l(this.f41727a, iA, f10);
            }
        }
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f41739m) {
            this.f41738l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f41736j));
                } else {
                    textView.setTypeface(typeface, this.f41736j);
                }
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (c0.f41914a) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String strO;
        W wT = W.t(context, i10, h.j.f35949B2);
        if (wT.s(h.j.f35985K2)) {
            s(wT.a(h.j.f35985K2, false));
        }
        if (wT.s(h.j.f35953C2) && wT.f(h.j.f35953C2, -1) == 0) {
            this.f41727a.setTextSize(0, 0.0f);
        }
        C(context, wT);
        if (wT.s(h.j.f35981J2) && (strO = wT.o(h.j.f35981J2)) != null) {
            d.d(this.f41727a, strO);
        }
        wT.x();
        Typeface typeface = this.f41738l;
        if (typeface != null) {
            this.f41727a.setTypeface(typeface, this.f41736j);
        }
    }

    public void s(boolean z10) {
        this.f41727a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f41735i.p(i10, i11, i12, i13);
    }

    public void u(int[] iArr, int i10) {
        this.f41735i.q(iArr, i10);
    }

    public void v(int i10) {
        this.f41735i.r(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f41734h == null) {
            this.f41734h = new U();
        }
        U u10 = this.f41734h;
        u10.f41885a = colorStateList;
        u10.f41888d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f41734h == null) {
            this.f41734h = new U();
        }
        U u10 = this.f41734h;
        u10.f41886b = mode;
        u10.f41887c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f41727a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f41727a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f41727a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f41727a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f41727a.getCompoundDrawables();
        TextView textView2 = this.f41727a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        U u10 = this.f41734h;
        this.f41728b = u10;
        this.f41729c = u10;
        this.f41730d = u10;
        this.f41731e = u10;
        this.f41732f = u10;
        this.f41733g = u10;
    }

    /* JADX INFO: renamed from: p.B$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f41740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f41741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f41742c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f41740a = i10;
            this.f41741b = i11;
            this.f41742c = weakReference;
        }

        @Override // N0.f.e
        public void g(Typeface typeface) {
            int i10 = this.f41740a;
            if (i10 != -1) {
                typeface = e.a(typeface, i10, (this.f41741b & 2) != 0);
            }
            C5323B.this.n(this.f41742c, typeface);
        }

        @Override // N0.f.e
        public void f(int i10) {
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
    }
}
