package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import c1.AbstractC2928b;
import j.AbstractC4666a;

/* JADX INFO: renamed from: p.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5346h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckedTextView f41932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f41933b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f41934c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41935d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41936e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41937f;

    public C5346h(CheckedTextView checkedTextView) {
        this.f41932a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = AbstractC2928b.a(this.f41932a);
        if (drawableA != null) {
            if (this.f41935d || this.f41936e) {
                Drawable drawableMutate = P0.a.l(drawableA).mutate();
                if (this.f41935d) {
                    P0.a.i(drawableMutate, this.f41933b);
                }
                if (this.f41936e) {
                    P0.a.j(drawableMutate, this.f41934c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f41932a.getDrawableState());
                }
                this.f41932a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f41933b;
    }

    public PorterDuff.Mode c() {
        return this.f41934c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        W wV = W.v(this.f41932a.getContext(), attributeSet, h.j.f36003P0, i10, 0);
        CheckedTextView checkedTextView = this.f41932a;
        Y0.E.d0(checkedTextView, checkedTextView.getContext(), h.j.f36003P0, attributeSet, wV.r(), i10, 0);
        try {
            if (wV.s(h.j.f36011R0) && (iN2 = wV.n(h.j.f36011R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f41932a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC4666a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (wV.s(h.j.f36007Q0)) {
                        CheckedTextView checkedTextView3 = this.f41932a;
                        checkedTextView3.setCheckMarkDrawable(AbstractC4666a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (wV.s(h.j.f36007Q0) && (iN = wV.n(h.j.f36007Q0, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.f41932a;
                checkedTextView32.setCheckMarkDrawable(AbstractC4666a.b(checkedTextView32.getContext(), iN));
            }
            if (wV.s(h.j.f36015S0)) {
                AbstractC2928b.b(this.f41932a, wV.c(h.j.f36015S0));
            }
            if (wV.s(h.j.f36019T0)) {
                AbstractC2928b.c(this.f41932a, AbstractC5329H.d(wV.k(h.j.f36019T0, -1), null));
            }
            wV.x();
        } catch (Throwable th) {
            wV.x();
            throw th;
        }
    }

    public void e() {
        if (this.f41937f) {
            this.f41937f = false;
        } else {
            this.f41937f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f41933b = colorStateList;
        this.f41935d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f41934c = mode;
        this.f41936e = true;
        a();
    }
}
