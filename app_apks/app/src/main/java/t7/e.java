package t7;

import Y0.E;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c1.i;
import com.google.android.material.textfield.TextInputLayout;
import d7.C3834a;
import d7.C3835b;
import java.util.ArrayList;
import java.util.List;
import p.C5324C;
import p7.AbstractC5402c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f44781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f44782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f44784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animator f44785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f44786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f44789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f44791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f44792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f44794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f44795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f44797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f44799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f44800u;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f44801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f44802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f44803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f44804d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f44801a = i10;
            this.f44802b = textView;
            this.f44803c = i11;
            this.f44804d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.f44787h = this.f44801a;
            e.this.f44785f = null;
            TextView textView = this.f44802b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f44803c == 1 && e.this.f44791l != null) {
                    e.this.f44791l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f44804d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f44804d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f44804d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = e.this.f44781b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public e(TextInputLayout textInputLayout) {
        this.f44780a = textInputLayout.getContext();
        this.f44781b = textInputLayout;
        this.f44786g = r0.getResources().getDimensionPixelSize(c7.c.f25873e);
    }

    public boolean A() {
        return this.f44796q;
    }

    public void B(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f44782c == null) {
            return;
        }
        if (!y(i10) || (frameLayout = this.f44784e) == null) {
            this.f44782c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f44783d - 1;
        this.f44783d = i11;
        M(this.f44782c, i11);
    }

    public final void C(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f44787h = i11;
    }

    public void D(CharSequence charSequence) {
        this.f44792m = charSequence;
        TextView textView = this.f44791l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void E(boolean z10) {
        if (this.f44790k == z10) {
            return;
        }
        h();
        if (z10) {
            C5324C c5324c = new C5324C(this.f44780a);
            this.f44791l = c5324c;
            c5324c.setId(c7.e.f25910I);
            this.f44791l.setTextAlignment(5);
            Typeface typeface = this.f44800u;
            if (typeface != null) {
                this.f44791l.setTypeface(typeface);
            }
            F(this.f44793n);
            G(this.f44794o);
            D(this.f44792m);
            this.f44791l.setVisibility(4);
            E.h0(this.f44791l, 1);
            e(this.f44791l, 0);
        } else {
            v();
            B(this.f44791l, 0);
            this.f44791l = null;
            this.f44781b.r0();
            this.f44781b.E0();
        }
        this.f44790k = z10;
    }

    public void F(int i10) {
        this.f44793n = i10;
        TextView textView = this.f44791l;
        if (textView != null) {
            this.f44781b.d0(textView, i10);
        }
    }

    public void G(ColorStateList colorStateList) {
        this.f44794o = colorStateList;
        TextView textView = this.f44791l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void H(int i10) {
        this.f44798s = i10;
        TextView textView = this.f44797r;
        if (textView != null) {
            i.n(textView, i10);
        }
    }

    public void I(boolean z10) {
        if (this.f44796q == z10) {
            return;
        }
        h();
        if (z10) {
            C5324C c5324c = new C5324C(this.f44780a);
            this.f44797r = c5324c;
            c5324c.setId(c7.e.f25911J);
            this.f44797r.setTextAlignment(5);
            Typeface typeface = this.f44800u;
            if (typeface != null) {
                this.f44797r.setTypeface(typeface);
            }
            this.f44797r.setVisibility(4);
            E.h0(this.f44797r, 1);
            H(this.f44798s);
            J(this.f44799t);
            e(this.f44797r, 1);
            this.f44797r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.f44797r, 1);
            this.f44797r = null;
            this.f44781b.r0();
            this.f44781b.E0();
        }
        this.f44796q = z10;
    }

    public void J(ColorStateList colorStateList) {
        this.f44799t = colorStateList;
        TextView textView = this.f44797r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void L(Typeface typeface) {
        if (typeface != this.f44800u) {
            this.f44800u = typeface;
            K(this.f44791l, typeface);
            K(this.f44797r, typeface);
        }
    }

    public final void M(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean N(TextView textView, CharSequence charSequence) {
        if (E.L(this.f44781b) && this.f44781b.isEnabled()) {
            return (this.f44788i == this.f44787h && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void O(CharSequence charSequence) {
        h();
        this.f44789j = charSequence;
        this.f44791l.setText(charSequence);
        int i10 = this.f44787h;
        if (i10 != 1) {
            this.f44788i = 1;
        }
        Q(i10, this.f44788i, N(this.f44791l, charSequence));
    }

    public void P(CharSequence charSequence) {
        h();
        this.f44795p = charSequence;
        this.f44797r.setText(charSequence);
        int i10 = this.f44787h;
        if (i10 != 2) {
            this.f44788i = 2;
        }
        Q(i10, this.f44788i, N(this.f44797r, charSequence));
    }

    public final void Q(int i10, int i11, boolean z10) {
        e eVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f44785f = animatorSet;
            ArrayList arrayList = new ArrayList();
            eVar = this;
            eVar.i(arrayList, this.f44796q, this.f44797r, 2, i10, i11);
            eVar.i(arrayList, eVar.f44790k, eVar.f44791l, 1, i10, i11);
            C3835b.a(animatorSet, arrayList);
            animatorSet.addListener(eVar.new a(i11, eVar.m(i10), i10, eVar.m(i11)));
            animatorSet.start();
        } else {
            eVar = this;
            eVar.C(i10, i11);
        }
        eVar.f44781b.r0();
        eVar.f44781b.w0(z10);
        eVar.f44781b.E0();
    }

    public void e(TextView textView, int i10) {
        if (this.f44782c == null && this.f44784e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f44780a);
            this.f44782c = linearLayout;
            linearLayout.setOrientation(0);
            this.f44781b.addView(this.f44782c, -1, -2);
            this.f44784e = new FrameLayout(this.f44780a);
            this.f44782c.addView(this.f44784e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f44781b.getEditText() != null) {
                f();
            }
        }
        if (y(i10)) {
            this.f44784e.setVisibility(0);
            this.f44784e.addView(textView);
        } else {
            this.f44782c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f44782c.setVisibility(0);
        this.f44783d++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f44781b.getEditText();
            boolean zG = AbstractC5402c.g(this.f44780a);
            E.r0(this.f44782c, u(zG, c7.c.f25885q, E.A(editText)), u(zG, c7.c.f25886r, this.f44780a.getResources().getDimensionPixelSize(c7.c.f25884p)), u(zG, c7.c.f25885q, E.z(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f44782c == null || this.f44781b.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f44785f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(j(textView, i12 == i10));
            if (i12 == i10) {
                list.add(k(textView));
            }
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(C3834a.f33146a);
        return objectAnimatorOfFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f44786g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(C3834a.f33149d);
        return objectAnimatorOfFloat;
    }

    public boolean l() {
        return x(this.f44788i);
    }

    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f44791l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f44797r;
    }

    public CharSequence n() {
        return this.f44792m;
    }

    public CharSequence o() {
        return this.f44789j;
    }

    public int p() {
        TextView textView = this.f44791l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList q() {
        TextView textView = this.f44791l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence r() {
        return this.f44795p;
    }

    public View s() {
        return this.f44797r;
    }

    public int t() {
        TextView textView = this.f44797r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int u(boolean z10, int i10, int i11) {
        return z10 ? this.f44780a.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void v() {
        this.f44789j = null;
        h();
        if (this.f44787h == 1) {
            if (!this.f44796q || TextUtils.isEmpty(this.f44795p)) {
                this.f44788i = 0;
            } else {
                this.f44788i = 2;
            }
        }
        Q(this.f44787h, this.f44788i, N(this.f44791l, ""));
    }

    public void w() {
        h();
        int i10 = this.f44787h;
        if (i10 == 2) {
            this.f44788i = 0;
        }
        Q(i10, this.f44788i, N(this.f44797r, ""));
    }

    public final boolean x(int i10) {
        return (i10 != 1 || this.f44791l == null || TextUtils.isEmpty(this.f44789j)) ? false : true;
    }

    public boolean y(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public boolean z() {
        return this.f44790k;
    }
}
