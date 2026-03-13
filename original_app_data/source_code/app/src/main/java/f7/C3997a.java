package f7;

import Y0.E;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import c7.AbstractC3079a;
import c7.j;
import com.google.android.material.button.MaterialButton;
import i7.AbstractC4365a;
import p7.AbstractC5402c;
import q7.AbstractC5503b;
import q7.C5502a;
import s7.g;
import s7.k;
import s7.n;

/* JADX INFO: renamed from: f7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3997a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f34137t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f34138u = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f34139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f34140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f34147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f34148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f34149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f34150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f34151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34152n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34153o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f34154p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f34155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LayerDrawable f34156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f34157s;

    public C3997a(MaterialButton materialButton, k kVar) {
        this.f34139a = materialButton;
        this.f34140b = kVar;
    }

    public void A(ColorStateList colorStateList) {
        if (this.f34149k != colorStateList) {
            this.f34149k = colorStateList;
            H();
        }
    }

    public void B(int i10) {
        if (this.f34146h != i10) {
            this.f34146h = i10;
            H();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.f34148j != colorStateList) {
            this.f34148j = colorStateList;
            if (f() != null) {
                P0.a.i(f(), this.f34148j);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.f34147i != mode) {
            this.f34147i = mode;
            if (f() == null || this.f34147i == null) {
                return;
            }
            P0.a.j(f(), this.f34147i);
        }
    }

    public final void E(int i10, int i11) {
        int iA = E.A(this.f34139a);
        int paddingTop = this.f34139a.getPaddingTop();
        int iZ = E.z(this.f34139a);
        int paddingBottom = this.f34139a.getPaddingBottom();
        int i12 = this.f34143e;
        int i13 = this.f34144f;
        this.f34144f = i11;
        this.f34143e = i10;
        if (!this.f34153o) {
            F();
        }
        E.r0(this.f34139a, iA, (paddingTop + i10) - i12, iZ, (paddingBottom + i11) - i13);
    }

    public final void F() {
        this.f34139a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.T(this.f34157s);
        }
    }

    public final void G(k kVar) {
        if (f34138u && !this.f34153o) {
            int iA = E.A(this.f34139a);
            int paddingTop = this.f34139a.getPaddingTop();
            int iZ = E.z(this.f34139a);
            int paddingBottom = this.f34139a.getPaddingBottom();
            F();
            E.r0(this.f34139a, iA, paddingTop, iZ, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public final void H() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.Z(this.f34146h, this.f34149k);
            if (gVarN != null) {
                gVarN.Y(this.f34146h, this.f34152n ? AbstractC4365a.d(this.f34139a, AbstractC3079a.f25832k) : 0);
            }
        }
    }

    public final InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f34141c, this.f34143e, this.f34142d, this.f34144f);
    }

    public final Drawable a() {
        g gVar = new g(this.f34140b);
        gVar.K(this.f34139a.getContext());
        P0.a.i(gVar, this.f34148j);
        PorterDuff.Mode mode = this.f34147i;
        if (mode != null) {
            P0.a.j(gVar, mode);
        }
        gVar.Z(this.f34146h, this.f34149k);
        g gVar2 = new g(this.f34140b);
        gVar2.setTint(0);
        gVar2.Y(this.f34146h, this.f34152n ? AbstractC4365a.d(this.f34139a, AbstractC3079a.f25832k) : 0);
        if (f34137t) {
            g gVar3 = new g(this.f34140b);
            this.f34151m = gVar3;
            P0.a.h(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC5503b.a(this.f34150l), I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f34151m);
            this.f34156r = rippleDrawable;
            return rippleDrawable;
        }
        C5502a c5502a = new C5502a(this.f34140b);
        this.f34151m = c5502a;
        P0.a.i(c5502a, AbstractC5503b.a(this.f34150l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f34151m});
        this.f34156r = layerDrawable;
        return I(layerDrawable);
    }

    public int b() {
        return this.f34145g;
    }

    public int c() {
        return this.f34144f;
    }

    public int d() {
        return this.f34143e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f34156r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f34156r.getNumberOfLayers() > 2 ? (n) this.f34156r.getDrawable(2) : (n) this.f34156r.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z10) {
        LayerDrawable layerDrawable = this.f34156r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f34137t ? (g) ((LayerDrawable) ((InsetDrawable) this.f34156r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f34156r.getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f34150l;
    }

    public k i() {
        return this.f34140b;
    }

    public ColorStateList j() {
        return this.f34149k;
    }

    public int k() {
        return this.f34146h;
    }

    public ColorStateList l() {
        return this.f34148j;
    }

    public PorterDuff.Mode m() {
        return this.f34147i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f34153o;
    }

    public boolean p() {
        return this.f34155q;
    }

    public void q(TypedArray typedArray) {
        this.f34141c = typedArray.getDimensionPixelOffset(j.f26176a2, 0);
        this.f34142d = typedArray.getDimensionPixelOffset(j.f26184b2, 0);
        this.f34143e = typedArray.getDimensionPixelOffset(j.f26192c2, 0);
        this.f34144f = typedArray.getDimensionPixelOffset(j.f26200d2, 0);
        if (typedArray.hasValue(j.f26232h2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(j.f26232h2, -1);
            this.f34145g = dimensionPixelSize;
            y(this.f34140b.w(dimensionPixelSize));
            this.f34154p = true;
        }
        this.f34146h = typedArray.getDimensionPixelSize(j.f26310r2, 0);
        this.f34147i = n7.n.f(typedArray.getInt(j.f26224g2, -1), PorterDuff.Mode.SRC_IN);
        this.f34148j = AbstractC5402c.a(this.f34139a.getContext(), typedArray, j.f26216f2);
        this.f34149k = AbstractC5402c.a(this.f34139a.getContext(), typedArray, j.f26303q2);
        this.f34150l = AbstractC5402c.a(this.f34139a.getContext(), typedArray, j.f26296p2);
        this.f34155q = typedArray.getBoolean(j.f26208e2, false);
        this.f34157s = typedArray.getDimensionPixelSize(j.f26240i2, 0);
        int iA = E.A(this.f34139a);
        int paddingTop = this.f34139a.getPaddingTop();
        int iZ = E.z(this.f34139a);
        int paddingBottom = this.f34139a.getPaddingBottom();
        if (typedArray.hasValue(j.f26168Z1)) {
            s();
        } else {
            F();
        }
        E.r0(this.f34139a, iA + this.f34141c, paddingTop + this.f34143e, iZ + this.f34142d, paddingBottom + this.f34144f);
    }

    public void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void s() {
        this.f34153o = true;
        this.f34139a.setSupportBackgroundTintList(this.f34148j);
        this.f34139a.setSupportBackgroundTintMode(this.f34147i);
    }

    public void t(boolean z10) {
        this.f34155q = z10;
    }

    public void u(int i10) {
        if (this.f34154p && this.f34145g == i10) {
            return;
        }
        this.f34145g = i10;
        this.f34154p = true;
        y(this.f34140b.w(i10));
    }

    public void v(int i10) {
        E(this.f34143e, i10);
    }

    public void w(int i10) {
        E(i10, this.f34144f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f34150l != colorStateList) {
            this.f34150l = colorStateList;
            boolean z10 = f34137t;
            if (z10 && (this.f34139a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f34139a.getBackground()).setColor(AbstractC5503b.a(colorStateList));
            } else {
                if (z10 || !(this.f34139a.getBackground() instanceof C5502a)) {
                    return;
                }
                ((C5502a) this.f34139a.getBackground()).setTintList(AbstractC5503b.a(colorStateList));
            }
        }
    }

    public void y(k kVar) {
        this.f34140b = kVar;
        G(kVar);
    }

    public void z(boolean z10) {
        this.f34152n = z10;
        H();
    }
}
