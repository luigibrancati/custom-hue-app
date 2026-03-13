package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import h.AbstractC4262a;

/* JADX INFO: renamed from: p.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5353o extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5342d f41964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5354p f41965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41966c;

    public C5353o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35817z);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5342d c5342d = this.f41964a;
        if (c5342d != null) {
            c5342d.b();
        }
        C5354p c5354p = this.f41965b;
        if (c5354p != null) {
            c5354p.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41964a;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41964a;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C5354p c5354p = this.f41965b;
        if (c5354p != null) {
            return c5354p.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C5354p c5354p = this.f41965b;
        if (c5354p != null) {
            return c5354p.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f41965b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41964a;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41964a;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C5354p c5354p = this.f41965b;
        if (c5354p != null) {
            c5354p.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C5354p c5354p = this.f41965b;
        if (c5354p != null && drawable != null && !this.f41966c) {
            c5354p.h(drawable);
        }
        super.setImageDrawable(drawable);
        C5354p c5354p2 = this.f41965b;
        if (c5354p2 != null) {
            c5354p2.c();
            if (this.f41966c) {
                return;
            }
            this.f41965b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f41966c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f41965b.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5354p c5354p = this.f41965b;
        if (c5354p != null) {
            c5354p.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41964a;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41964a;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C5354p c5354p = this.f41965b;
        if (c5354p != null) {
            c5354p.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C5354p c5354p = this.f41965b;
        if (c5354p != null) {
            c5354p.k(mode);
        }
    }

    public C5353o(Context context, AttributeSet attributeSet, int i10) {
        super(T.b(context), attributeSet, i10);
        this.f41966c = false;
        S.a(this, getContext());
        C5342d c5342d = new C5342d(this);
        this.f41964a = c5342d;
        c5342d.e(attributeSet, i10);
        C5354p c5354p = new C5354p(this);
        this.f41965b = c5354p;
        c5354p.g(attributeSet, i10);
    }
}
