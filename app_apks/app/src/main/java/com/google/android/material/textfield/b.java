package com.google.android.material.textfield;

import Y0.E;
import Z0.c;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import c7.AbstractC3079a;
import com.google.android.material.textfield.TextInputLayout;
import d7.C3834a;
import i7.AbstractC4365a;
import n7.C5148k;
import t7.AbstractC5857c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b extends AbstractC5857c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f30913t = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextWatcher f30914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnFocusChangeListener f30915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.e f30916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout.f f30917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextInputLayout.g f30918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f30919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.a f30920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f30921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f30923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public StateListDrawable f30924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s7.g f30925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AccessibilityManager f30926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f30927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ValueAnimator f30928s;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends C5148k {

        /* JADX INFO: renamed from: com.google.android.material.textfield.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class RunnableC0365a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f30930a;

            public RunnableC0365a(AutoCompleteTextView autoCompleteTextView) {
                this.f30930a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f30930a.isPopupShowing();
                b.this.J(zIsPopupShowing);
                b.this.f30921l = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // n7.C5148k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewC = b.C(b.this.f44776a.getEditText());
            if (b.this.f30926q.isTouchExplorationEnabled() && b.H(autoCompleteTextViewC) && !b.this.f44778c.hasFocus()) {
                autoCompleteTextViewC.dismissDropDown();
            }
            autoCompleteTextViewC.post(new RunnableC0365a(autoCompleteTextViewC));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0366b implements AutoCompleteTextView.OnDismissListener {
        public C0366b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            b.this.N();
            b.this.J(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.f44778c.setChecked(bVar.f30922m);
            b.this.f30928s.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f44778c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements View.OnFocusChangeListener {
        public e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            b.this.f44776a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            b.this.J(false);
            b.this.f30921l = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends TextInputLayout.e {
        public f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, Y0.C2547a
        public void g(View view, Z0.h hVar) {
            super.g(view, hVar);
            if (!b.H(b.this.f44776a.getEditText())) {
                hVar.i0(Spinner.class.getName());
            }
            if (hVar.V()) {
                hVar.s0(null);
            }
        }

        @Override // Y0.C2547a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewC = b.C(b.this.f44776a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f30926q.isEnabled() && !b.H(b.this.f44776a.getEditText())) {
                b.this.M(autoCompleteTextViewC);
                b.this.N();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements TextInputLayout.f {
        public g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewC = b.C(textInputLayout.getEditText());
            b.this.K(autoCompleteTextViewC);
            b.this.y(autoCompleteTextViewC);
            b.this.L(autoCompleteTextViewC);
            autoCompleteTextViewC.setThreshold(0);
            autoCompleteTextViewC.removeTextChangedListener(b.this.f30914e);
            autoCompleteTextViewC.addTextChangedListener(b.this.f30914e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!b.H(autoCompleteTextViewC) && b.this.f30926q.isTouchExplorationEnabled()) {
                E.n0(b.this.f44778c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.f30916g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h implements TextInputLayout.g {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f30939a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f30939a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f30939a.removeTextChangedListener(b.this.f30914e);
            }
        }

        public h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f30915f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (b.f30913t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i10 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(b.this.f30919j);
                b.this.I();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i implements View.OnAttachStateChangeListener {
        public i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            b.this.I();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class j implements c.a {
        public j() {
        }

        @Override // Z0.c.a
        public void onTouchExplorationStateChanged(boolean z10) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = b.this.f44776a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || b.H(autoCompleteTextView)) {
                return;
            }
            E.n0(b.this.f44778c, z10 ? 2 : 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.M((AutoCompleteTextView) b.this.f44776a.getEditText());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class l implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AutoCompleteTextView f30944a;

        public l(AutoCompleteTextView autoCompleteTextView) {
            this.f30944a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (b.this.G()) {
                    b.this.f30921l = false;
                }
                b.this.M(this.f30944a);
                b.this.N();
            }
            return false;
        }
    }

    public b(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f30914e = new a();
        this.f30915f = new e();
        this.f30916g = new f(this.f44776a);
        this.f30917h = new g();
        this.f30918i = new h();
        this.f30919j = new i();
        this.f30920k = new j();
        this.f30921l = false;
        this.f30922m = false;
        this.f30923n = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f30928s = D(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(50, 1.0f, 0.0f);
        this.f30927r = valueAnimatorD;
        valueAnimatorD.addListener(new c());
    }

    public static boolean H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public final void A(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, s7.g gVar) {
        LayerDrawable layerDrawable;
        int iD = AbstractC4365a.d(autoCompleteTextView, AbstractC3079a.f25832k);
        s7.g gVar2 = new s7.g(gVar.B());
        int iH = AbstractC4365a.h(i10, iD, 0.1f);
        gVar2.U(new ColorStateList(iArr, new int[]{iH, 0}));
        if (f30913t) {
            gVar2.setTint(iD);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iH, iD});
            s7.g gVar3 = new s7.g(gVar.B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        E.j0(autoCompleteTextView, layerDrawable);
    }

    public final void B() {
        TextInputLayout textInputLayout;
        if (this.f30926q == null || (textInputLayout = this.f44776a) == null || !E.K(textInputLayout)) {
            return;
        }
        Z0.c.a(this.f30926q, this.f30920k);
    }

    public final ValueAnimator D(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(C3834a.f33146a);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new d());
        return valueAnimatorOfFloat;
    }

    public final s7.g E(float f10, float f11, float f12, int i10) {
        s7.k kVarM = s7.k.a().A(f10).E(f10).s(f11).w(f11).m();
        s7.g gVarM = s7.g.m(this.f44777b, f12);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.W(0, i10, 0, i10);
        return gVarM;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f30923n;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void I() {
        AccessibilityManager accessibilityManager = this.f30926q;
        if (accessibilityManager != null) {
            Z0.c.b(accessibilityManager, this.f30920k);
        }
    }

    public final void J(boolean z10) {
        if (this.f30922m != z10) {
            this.f30922m = z10;
            this.f30928s.cancel();
            this.f30927r.start();
        }
    }

    public final void K(AutoCompleteTextView autoCompleteTextView) {
        if (f30913t) {
            int boxBackgroundMode = this.f44776a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f30925p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f30924o);
            }
        }
    }

    public final void L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f30915f);
        if (f30913t) {
            autoCompleteTextView.setOnDismissListener(new C0366b());
        }
    }

    public final void M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.f30921l = false;
        }
        if (this.f30921l) {
            this.f30921l = false;
            return;
        }
        if (f30913t) {
            J(!this.f30922m);
        } else {
            this.f30922m = !this.f30922m;
            this.f44778c.toggle();
        }
        if (!this.f30922m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public final void N() {
        this.f30921l = true;
        this.f30923n = System.currentTimeMillis();
    }

    public void O(AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.f44776a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    @Override // t7.AbstractC5857c
    public void a() {
        float dimensionPixelOffset = this.f44777b.getResources().getDimensionPixelOffset(c7.c.f25863J);
        float dimensionPixelOffset2 = this.f44777b.getResources().getDimensionPixelOffset(c7.c.f25860G);
        int dimensionPixelOffset3 = this.f44777b.getResources().getDimensionPixelOffset(c7.c.f25861H);
        s7.g gVarE = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        s7.g gVarE2 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f30925p = gVarE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f30924o = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarE);
        this.f30924o.addState(new int[0], gVarE2);
        int i10 = this.f44779d;
        if (i10 == 0) {
            i10 = f30913t ? c7.d.f25898d : c7.d.f25899e;
        }
        this.f44776a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f44776a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(c7.h.f25966g));
        this.f44776a.setEndIconOnClickListener(new k());
        this.f44776a.g(this.f30917h);
        this.f44776a.h(this.f30918i);
        F();
        this.f30926q = (AccessibilityManager) this.f44777b.getSystemService("accessibility");
        this.f44776a.addOnAttachStateChangeListener(this.f30919j);
        B();
    }

    @Override // t7.AbstractC5857c
    public boolean b(int i10) {
        return i10 != 0;
    }

    @Override // t7.AbstractC5857c
    public boolean d() {
        return true;
    }

    public final void y(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f44776a.getBoxBackgroundMode();
        s7.g boxBackground = this.f44776a.getBoxBackground();
        int iD = AbstractC4365a.d(autoCompleteTextView, AbstractC3079a.f25828g);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, iD, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, iD, iArr, boxBackground);
        }
    }

    public final void z(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, s7.g gVar) {
        int boxBackgroundColor = this.f44776a.getBoxBackgroundColor();
        int[] iArr2 = {AbstractC4365a.h(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f30913t) {
            E.j0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        s7.g gVar2 = new s7.g(gVar.B());
        gVar2.U(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int iA = E.A(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iZ = E.z(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        E.j0(autoCompleteTextView, layerDrawable);
        E.r0(autoCompleteTextView, iA, paddingTop, iZ, paddingBottom);
    }
}
