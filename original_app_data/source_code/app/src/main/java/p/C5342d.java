package p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: p.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5342d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f41915a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U f41918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U f41919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U f41920f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41917c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5348j f41916b = C5348j.b();

    public C5342d(View view) {
        this.f41915a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f41920f == null) {
            this.f41920f = new U();
        }
        U u10 = this.f41920f;
        u10.a();
        ColorStateList colorStateListP = Y0.E.p(this.f41915a);
        if (colorStateListP != null) {
            u10.f41888d = true;
            u10.f41885a = colorStateListP;
        }
        PorterDuff.Mode modeQ = Y0.E.q(this.f41915a);
        if (modeQ != null) {
            u10.f41887c = true;
            u10.f41886b = modeQ;
        }
        if (!u10.f41888d && !u10.f41887c) {
            return false;
        }
        C5348j.i(drawable, u10, this.f41915a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f41915a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            U u10 = this.f41919e;
            if (u10 != null) {
                C5348j.i(background, u10, this.f41915a.getDrawableState());
                return;
            }
            U u11 = this.f41918d;
            if (u11 != null) {
                C5348j.i(background, u11, this.f41915a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        U u10 = this.f41919e;
        if (u10 != null) {
            return u10.f41885a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        U u10 = this.f41919e;
        if (u10 != null) {
            return u10.f41886b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        W wV = W.v(this.f41915a.getContext(), attributeSet, h.j.f36145t3, i10, 0);
        View view = this.f41915a;
        Y0.E.d0(view, view.getContext(), h.j.f36145t3, attributeSet, wV.r(), i10, 0);
        try {
            if (wV.s(h.j.f36150u3)) {
                this.f41917c = wV.n(h.j.f36150u3, -1);
                ColorStateList colorStateListF = this.f41916b.f(this.f41915a.getContext(), this.f41917c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (wV.s(h.j.f36155v3)) {
                Y0.E.k0(this.f41915a, wV.c(h.j.f36155v3));
            }
            if (wV.s(h.j.f36160w3)) {
                Y0.E.l0(this.f41915a, AbstractC5329H.d(wV.k(h.j.f36160w3, -1), null));
            }
            wV.x();
        } catch (Throwable th) {
            wV.x();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f41917c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f41917c = i10;
        C5348j c5348j = this.f41916b;
        h(c5348j != null ? c5348j.f(this.f41915a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f41918d == null) {
                this.f41918d = new U();
            }
            U u10 = this.f41918d;
            u10.f41885a = colorStateList;
            u10.f41888d = true;
        } else {
            this.f41918d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f41919e == null) {
            this.f41919e = new U();
        }
        U u10 = this.f41919e;
        u10.f41885a = colorStateList;
        u10.f41888d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f41919e == null) {
            this.f41919e = new U();
        }
        U u10 = this.f41919e;
        u10.f41886b = mode;
        u10.f41887c = true;
        b();
    }

    public final boolean k() {
        return this.f41918d != null;
    }
}
