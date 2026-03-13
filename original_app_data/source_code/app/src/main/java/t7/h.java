package t7;

import Y0.AbstractC2557k;
import Y0.E;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c1.i;
import c7.j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import n7.n;
import p.C5324C;
import p.W;
import p7.AbstractC5402c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f44812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f44814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f44815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f44816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f44817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f44818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44819h;

    public h(TextInputLayout textInputLayout, W w10) {
        super(textInputLayout.getContext());
        this.f44812a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(c7.g.f25944c, (ViewGroup) this, false);
        this.f44815d = checkableImageButton;
        C5324C c5324c = new C5324C(getContext());
        this.f44813b = c5324c;
        g(w10);
        f(w10);
        addView(checkableImageButton);
        addView(c5324c);
    }

    public CharSequence a() {
        return this.f44814c;
    }

    public ColorStateList b() {
        return this.f44813b.getTextColors();
    }

    public TextView c() {
        return this.f44813b;
    }

    public CharSequence d() {
        return this.f44815d.getContentDescription();
    }

    public Drawable e() {
        return this.f44815d.getDrawable();
    }

    public final void f(W w10) {
        this.f44813b.setVisibility(8);
        this.f44813b.setId(c7.e.f25913L);
        this.f44813b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        E.h0(this.f44813b, 1);
        l(w10.n(j.f26123S5, 0));
        if (w10.s(j.f26130T5)) {
            m(w10.c(j.f26130T5));
        }
        k(w10.p(j.f26116R5));
    }

    public final void g(W w10) {
        if (AbstractC5402c.g(getContext())) {
            AbstractC2557k.c((ViewGroup.MarginLayoutParams) this.f44815d.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        if (w10.s(j.f26158X5)) {
            this.f44816e = AbstractC5402c.b(getContext(), w10, j.f26158X5);
        }
        if (w10.s(j.f26165Y5)) {
            this.f44817f = n.f(w10.k(j.f26165Y5, -1), null);
        }
        if (w10.s(j.f26151W5)) {
            p(w10.g(j.f26151W5));
            if (w10.s(j.f26144V5)) {
                o(w10.p(j.f26144V5));
            }
            n(w10.a(j.f26137U5, true));
        }
    }

    public boolean h() {
        return this.f44815d.getVisibility() == 0;
    }

    public void i(boolean z10) {
        this.f44819h = z10;
        x();
    }

    public void j() {
        d.c(this.f44812a, this.f44815d, this.f44816e);
    }

    public void k(CharSequence charSequence) {
        this.f44814c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f44813b.setText(charSequence);
        x();
    }

    public void l(int i10) {
        i.n(this.f44813b, i10);
    }

    public void m(ColorStateList colorStateList) {
        this.f44813b.setTextColor(colorStateList);
    }

    public void n(boolean z10) {
        this.f44815d.setCheckable(z10);
    }

    public void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f44815d.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        w();
    }

    public void p(Drawable drawable) {
        this.f44815d.setImageDrawable(drawable);
        if (drawable != null) {
            d.a(this.f44812a, this.f44815d, this.f44816e, this.f44817f);
            u(true);
            j();
        } else {
            u(false);
            q(null);
            r(null);
            o(null);
        }
    }

    public void q(View.OnClickListener onClickListener) {
        d.e(this.f44815d, onClickListener, this.f44818g);
    }

    public void r(View.OnLongClickListener onLongClickListener) {
        this.f44818g = onLongClickListener;
        d.f(this.f44815d, onLongClickListener);
    }

    public void s(ColorStateList colorStateList) {
        if (this.f44816e != colorStateList) {
            this.f44816e = colorStateList;
            d.a(this.f44812a, this.f44815d, colorStateList, this.f44817f);
        }
    }

    public void t(PorterDuff.Mode mode) {
        if (this.f44817f != mode) {
            this.f44817f = mode;
            d.a(this.f44812a, this.f44815d, this.f44816e, mode);
        }
    }

    public void u(boolean z10) {
        if (h() != z10) {
            this.f44815d.setVisibility(z10 ? 0 : 8);
            w();
            x();
        }
    }

    public void v(Z0.h hVar) {
        if (this.f44813b.getVisibility() != 0) {
            hVar.F0(this.f44815d);
        } else {
            hVar.t0(this.f44813b);
            hVar.F0(this.f44813b);
        }
    }

    public void w() {
        EditText editText = this.f44812a.f30848e;
        if (editText == null) {
            return;
        }
        E.r0(this.f44813b, h() ? 0 : E.A(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(c7.c.f25887s), editText.getCompoundPaddingBottom());
    }

    public final void x() {
        int i10 = (this.f44814c == null || this.f44819h) ? 8 : 0;
        setVisibility((this.f44815d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f44813b.setVisibility(i10);
        this.f44812a.q0();
    }
}
