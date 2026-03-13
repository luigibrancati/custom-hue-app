package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import c1.AbstractC2929c;
import j.AbstractC4666a;

/* JADX INFO: renamed from: p.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5347i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f41938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f41939b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f41940c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41941d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41942e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41943f;

    public C5347i(CompoundButton compoundButton) {
        this.f41938a = compoundButton;
    }

    public void a() {
        Drawable drawableA = AbstractC2929c.a(this.f41938a);
        if (drawableA != null) {
            if (this.f41941d || this.f41942e) {
                Drawable drawableMutate = P0.a.l(drawableA).mutate();
                if (this.f41941d) {
                    P0.a.i(drawableMutate, this.f41939b);
                }
                if (this.f41942e) {
                    P0.a.j(drawableMutate, this.f41940c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f41938a.getDrawableState());
                }
                this.f41938a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f41939b;
    }

    public PorterDuff.Mode c() {
        return this.f41940c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        W wV = W.v(this.f41938a.getContext(), attributeSet, h.j.f36023U0, i10, 0);
        CompoundButton compoundButton = this.f41938a;
        Y0.E.d0(compoundButton, compoundButton.getContext(), h.j.f36023U0, attributeSet, wV.r(), i10, 0);
        try {
            if (wV.s(h.j.f36031W0) && (iN2 = wV.n(h.j.f36031W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f41938a;
                    compoundButton2.setButtonDrawable(AbstractC4666a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (wV.s(h.j.f36027V0)) {
                        CompoundButton compoundButton3 = this.f41938a;
                        compoundButton3.setButtonDrawable(AbstractC4666a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (wV.s(h.j.f36027V0) && (iN = wV.n(h.j.f36027V0, 0)) != 0) {
                CompoundButton compoundButton32 = this.f41938a;
                compoundButton32.setButtonDrawable(AbstractC4666a.b(compoundButton32.getContext(), iN));
            }
            if (wV.s(h.j.f36035X0)) {
                AbstractC2929c.c(this.f41938a, wV.c(h.j.f36035X0));
            }
            if (wV.s(h.j.f36039Y0)) {
                AbstractC2929c.d(this.f41938a, AbstractC5329H.d(wV.k(h.j.f36039Y0, -1), null));
            }
            wV.x();
        } catch (Throwable th) {
            wV.x();
            throw th;
        }
    }

    public void e() {
        if (this.f41943f) {
            this.f41943f = false;
        } else {
            this.f41943f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f41939b = colorStateList;
        this.f41941d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f41940c = mode;
        this.f41942e = true;
        a();
    }
}
