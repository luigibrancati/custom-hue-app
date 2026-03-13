package p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import j.AbstractC4666a;

/* JADX INFO: renamed from: p.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5354p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f41967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U f41968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U f41969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U f41970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41971e = 0;

    public C5354p(ImageView imageView) {
        this.f41967a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f41970d == null) {
            this.f41970d = new U();
        }
        U u10 = this.f41970d;
        u10.a();
        ColorStateList colorStateListA = c1.e.a(this.f41967a);
        if (colorStateListA != null) {
            u10.f41888d = true;
            u10.f41885a = colorStateListA;
        }
        PorterDuff.Mode modeB = c1.e.b(this.f41967a);
        if (modeB != null) {
            u10.f41887c = true;
            u10.f41886b = modeB;
        }
        if (!u10.f41888d && !u10.f41887c) {
            return false;
        }
        C5348j.i(drawable, u10, this.f41967a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f41967a.getDrawable() != null) {
            this.f41967a.getDrawable().setLevel(this.f41971e);
        }
    }

    public void c() {
        Drawable drawable = this.f41967a.getDrawable();
        if (drawable != null) {
            AbstractC5329H.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            U u10 = this.f41969c;
            if (u10 != null) {
                C5348j.i(drawable, u10, this.f41967a.getDrawableState());
                return;
            }
            U u11 = this.f41968b;
            if (u11 != null) {
                C5348j.i(drawable, u11, this.f41967a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        U u10 = this.f41969c;
        if (u10 != null) {
            return u10.f41885a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        U u10 = this.f41969c;
        if (u10 != null) {
            return u10.f41886b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f41967a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        W wV = W.v(this.f41967a.getContext(), attributeSet, h.j.f36002P, i10, 0);
        ImageView imageView = this.f41967a;
        Y0.E.d0(imageView, imageView.getContext(), h.j.f36002P, attributeSet, wV.r(), i10, 0);
        try {
            Drawable drawable = this.f41967a.getDrawable();
            if (drawable == null && (iN = wV.n(h.j.f36006Q, -1)) != -1 && (drawable = AbstractC4666a.b(this.f41967a.getContext(), iN)) != null) {
                this.f41967a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC5329H.b(drawable);
            }
            if (wV.s(h.j.f36010R)) {
                c1.e.c(this.f41967a, wV.c(h.j.f36010R));
            }
            if (wV.s(h.j.f36014S)) {
                c1.e.d(this.f41967a, AbstractC5329H.d(wV.k(h.j.f36014S, -1), null));
            }
            wV.x();
        } catch (Throwable th) {
            wV.x();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.f41971e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = AbstractC4666a.b(this.f41967a.getContext(), i10);
            if (drawableB != null) {
                AbstractC5329H.b(drawableB);
            }
            this.f41967a.setImageDrawable(drawableB);
        } else {
            this.f41967a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f41969c == null) {
            this.f41969c = new U();
        }
        U u10 = this.f41969c;
        u10.f41885a = colorStateList;
        u10.f41888d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f41969c == null) {
            this.f41969c = new U();
        }
        U u10 = this.f41969c;
        u10.f41886b = mode;
        u10.f41887c = true;
        c();
    }

    public final boolean l() {
        return this.f41968b != null;
    }
}
