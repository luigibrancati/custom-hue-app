package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import d7.C3834a;
import t7.AbstractC5857c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a extends AbstractC5857c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextWatcher f30896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnFocusChangeListener f30897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.f f30898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout.g f30899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimatorSet f30900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f30901j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f30897f);
            a aVar = a.this;
            aVar.f44778c.setOnFocusChangeListener(aVar.f30897f);
            editText.removeTextChangedListener(a.this.f30896e);
            editText.addTextChangedListener(a.this.f30896e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class RunnableC0364a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f30906a;

            public RunnableC0364a(EditText editText) {
                this.f30906a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f30906a.removeTextChangedListener(a.this.f30896e);
                a.this.i(true);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new RunnableC0364a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f30897f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f44778c.getOnFocusChangeListener() == a.this.f30897f) {
                a.this.f44778c.setOnFocusChangeListener(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f44776a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f44776a.U();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f44776a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f44776a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f44778c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f44778c.setScaleX(fFloatValue);
            a.this.f44778c.setScaleY(fFloatValue);
        }
    }

    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f30896e = new C0363a();
        this.f30897f = new b();
        this.f30898g = new c();
        this.f30899h = new d();
    }

    @Override // t7.AbstractC5857c
    public void a() {
        TextInputLayout textInputLayout = this.f44776a;
        int i10 = this.f44779d;
        if (i10 == 0) {
            i10 = c7.d.f25900f;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f44776a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(c7.h.f25964e));
        this.f44776a.setEndIconCheckable(false);
        this.f44776a.setEndIconOnClickListener(new e());
        this.f44776a.g(this.f30898g);
        this.f44776a.h(this.f30899h);
        l();
    }

    @Override // t7.AbstractC5857c
    public void c(boolean z10) {
        if (this.f44776a.getSuffixText() == null) {
            return;
        }
        i(z10);
    }

    public final void i(boolean z10) {
        boolean z11 = this.f44776a.K() == z10;
        if (z10 && !this.f30900i.isRunning()) {
            this.f30901j.cancel();
            this.f30900i.start();
            if (z11) {
                this.f30900i.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f30900i.cancel();
        this.f30901j.start();
        if (z11) {
            this.f30901j.end();
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(C3834a.f33146a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C3834a.f33149d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    public final void l() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30900i = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.f30900i.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.f30901j = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    public final boolean m() {
        EditText editText = this.f44776a.getEditText();
        if (editText != null) {
            return (editText.hasFocus() || this.f44778c.hasFocus()) && editText.getText().length() > 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0363a implements TextWatcher {
        public C0363a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f44776a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
