package com.google.android.material.textfield;

import Y0.AbstractC2557k;
import Y0.C2547a;
import Y0.E;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.android.material.internal.CheckableImageButton;
import d1.AbstractC3806a;
import d7.C3834a;
import i7.AbstractC4365a;
import j.AbstractC4666a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n7.C5139b;
import n7.C5140c;
import n7.l;
import n7.n;
import p.AbstractC5329H;
import p.C5324C;
import p.C5348j;
import p.W;
import p7.AbstractC5402c;
import s7.k;
import t3.C5834c;
import t3.s;
import t7.AbstractC5857c;
import t7.C5855a;
import t7.C5856b;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final int f30802Y0 = i.f25980e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f30803A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Drawable f30804A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f30805B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public View.OnLongClickListener f30806B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f30807C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public View.OnLongClickListener f30808C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public CharSequence f30809D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final CheckableImageButton f30810D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f30811E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ColorStateList f30812E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public s7.g f30813F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public PorterDuff.Mode f30814F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public s7.g f30815G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public ColorStateList f30816G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public s7.g f30817H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ColorStateList f30818H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public k f30819I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f30820I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f30821J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f30822J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f30823K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public ColorStateList f30824L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f30825M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f30826N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f30827O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f30828P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f30829P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f30830Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f30831Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f30832R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f30833R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f30834S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final C5139b f30835S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f30836T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f30837T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f30838U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f30839V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public ValueAnimator f30840V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f30841W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public boolean f30842W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f30843X0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f30844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.h f30845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f30846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f30847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f30848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f30849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t7.e f30854k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f30855k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f30856l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Rect f30857l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30858m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Rect f30859m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30860n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final RectF f30861n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f30862o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Typeface f30863o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30864p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Drawable f30865p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30866q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f30867q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f30868r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinkedHashSet f30869r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f30870s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f30871s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f30872t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SparseArray f30873t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f30874u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final CheckableImageButton f30875u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30876v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final LinkedHashSet f30877v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C5834c f30878w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ColorStateList f30879w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C5834c f30880x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f30881x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f30882y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Drawable f30883y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f30884z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f30885z0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f30875u0.performClick();
            TextInputLayout.this.f30875u0.jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f30848e.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f30835S0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends C2547a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextInputLayout f30890d;

        public e(TextInputLayout textInputLayout) {
            this.f30890d = textInputLayout;
        }

        @Override // Y0.C2547a
        public void g(View view, Z0.h hVar) {
            super.g(view, hVar);
            EditText editText = this.f30890d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f30890d.getHint();
            CharSequence error = this.f30890d.getError();
            CharSequence placeholderText = this.f30890d.getPlaceholderText();
            int counterMaxLength = this.f30890d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f30890d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zN = this.f30890d.N();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f30890d.f30845b.v(hVar);
            if (!zIsEmpty) {
                hVar.E0(text);
            } else if (!TextUtils.isEmpty(string)) {
                hVar.E0(string);
                if (!zN && placeholderText != null) {
                    hVar.E0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                hVar.E0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                hVar.s0(string);
                hVar.B0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            hVar.u0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                hVar.o0(error);
            }
            View viewS = this.f30890d.f30854k.s();
            if (viewS != null) {
                hVar.t0(viewS);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends AbstractC3806a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f30891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f30892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f30893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f30894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f30895g;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f30891c) + " hint=" + ((Object) this.f30893e) + " helperText=" + ((Object) this.f30894f) + " placeholderText=" + ((Object) this.f30895g) + "}";
        }

        @Override // d1.AbstractC3806a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f30891c, parcel, i10);
            parcel.writeInt(this.f30892d ? 1 : 0);
            TextUtils.writeToParcel(this.f30893e, parcel, i10);
            TextUtils.writeToParcel(this.f30894f, parcel, i10);
            TextUtils.writeToParcel(this.f30895g, parcel, i10);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f30891c = (CharSequence) creator.createFromParcel(parcel);
            this.f30892d = parcel.readInt() == 1;
            this.f30893e = (CharSequence) creator.createFromParcel(parcel);
            this.f30894f = (CharSequence) creator.createFromParcel(parcel);
            this.f30895g = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25846y);
    }

    public static void T(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z10);
            }
        }
    }

    public static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zH = E.H(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = zH || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zH);
        checkableImageButton.setPressable(zH);
        checkableImageButton.setLongClickable(z10);
        E.n0(checkableImageButton, z11 ? 1 : 2);
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private AbstractC5857c getEndIconDelegate() {
        AbstractC5857c abstractC5857c = (AbstractC5857c) this.f30873t0.get(this.f30871s0);
        return abstractC5857c != null ? abstractC5857c : (AbstractC5857c) this.f30873t0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f30810D0.getVisibility() == 0) {
            return this.f30810D0;
        }
        if (I() && K()) {
            return this.f30875u0;
        }
        return null;
    }

    public static void n0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? c7.h.f25962c : c7.h.f25961b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f30848e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f30871s0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f30848e = editText;
        int i10 = this.f30850g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f30852i);
        }
        int i11 = this.f30851h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f30853j);
        }
        Q();
        setTextInputAccessibilityDelegate(new e(this));
        this.f30835S0.j0(this.f30848e.getTypeface());
        this.f30835S0.b0(this.f30848e.getTextSize());
        this.f30835S0.X(this.f30848e.getLetterSpacing());
        int gravity = this.f30848e.getGravity();
        this.f30835S0.S((gravity & (-113)) | 48);
        this.f30835S0.a0(gravity);
        this.f30848e.addTextChangedListener(new a());
        if (this.f30816G0 == null) {
            this.f30816G0 = this.f30848e.getHintTextColors();
        }
        if (this.f30807C) {
            if (TextUtils.isEmpty(this.f30809D)) {
                CharSequence hint = this.f30848e.getHint();
                this.f30849f = hint;
                setHint(hint);
                this.f30848e.setHint((CharSequence) null);
            }
            this.f30811E = true;
        }
        if (this.f30862o != null) {
            m0(this.f30848e.getText().length());
        }
        r0();
        this.f30854k.f();
        this.f30845b.bringToFront();
        this.f30846c.bringToFront();
        this.f30847d.bringToFront();
        this.f30810D0.bringToFront();
        B();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f30809D)) {
            return;
        }
        this.f30809D = charSequence;
        this.f30835S0.h0(charSequence);
        if (this.f30833R0) {
            return;
        }
        R();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f30870s == z10) {
            return;
        }
        if (z10) {
            i();
        } else {
            X();
            this.f30872t = null;
        }
        this.f30870s = z10;
    }

    public final boolean A() {
        return this.f30807C && !TextUtils.isEmpty(this.f30809D) && (this.f30813F instanceof C5856b);
    }

    public final void A0(int i10) {
        if (i10 != 0 || this.f30833R0) {
            J();
        } else {
            h0();
        }
    }

    public final void B() {
        Iterator it = this.f30869r0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    public final void B0(boolean z10, boolean z11) {
        int defaultColor = this.f30824L0.getDefaultColor();
        int colorForState = this.f30824L0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f30824L0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f30841W = colorForState2;
        } else if (z11) {
            this.f30841W = colorForState;
        } else {
            this.f30841W = defaultColor;
        }
    }

    public final void C(int i10) {
        Iterator it = this.f30877v0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i10);
        }
    }

    public final void C0() {
        if (this.f30848e == null) {
            return;
        }
        E.r0(this.f30805B, getContext().getResources().getDimensionPixelSize(c7.c.f25887s), this.f30848e.getPaddingTop(), (K() || L()) ? 0 : E.z(this.f30848e), this.f30848e.getPaddingBottom());
    }

    public final void D(Canvas canvas) {
        s7.g gVar;
        if (this.f30817H == null || (gVar = this.f30815G) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f30848e.isFocused()) {
            Rect bounds = this.f30817H.getBounds();
            Rect bounds2 = this.f30815G.getBounds();
            float fX = this.f30835S0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = C3834a.c(iCenterX, bounds2.left, fX);
            bounds.right = C3834a.c(iCenterX, bounds2.right, fX);
            this.f30817H.draw(canvas);
        }
    }

    public final void D0() {
        int visibility = this.f30805B.getVisibility();
        int i10 = (this.f30803A == null || N()) ? 8 : 0;
        if (visibility != i10) {
            getEndIconDelegate().c(i10 == 0);
        }
        t0();
        this.f30805B.setVisibility(i10);
        q0();
    }

    public final void E(Canvas canvas) {
        if (this.f30807C) {
            this.f30835S0.l(canvas);
        }
    }

    public void E0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f30813F == null || this.f30830Q == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f30848e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f30848e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f30841W = this.f30831Q0;
        } else if (this.f30854k.l()) {
            if (this.f30824L0 != null) {
                B0(z11, z10);
            } else {
                this.f30841W = this.f30854k.p();
            }
        } else if (!this.f30860n || (textView = this.f30862o) == null) {
            if (z11) {
                this.f30841W = this.f30823K0;
            } else if (z10) {
                this.f30841W = this.f30822J0;
            } else {
                this.f30841W = this.f30820I0;
            }
        } else if (this.f30824L0 != null) {
            B0(z11, z10);
        } else {
            this.f30841W = textView.getCurrentTextColor();
        }
        u0();
        V();
        W();
        U();
        if (getEndIconDelegate().d()) {
            i0(this.f30854k.l());
        }
        if (this.f30830Q == 2) {
            int i10 = this.f30834S;
            if (z11 && isEnabled()) {
                this.f30834S = this.f30839V;
            } else {
                this.f30834S = this.f30836T;
            }
            if (this.f30834S != i10) {
                S();
            }
        }
        if (this.f30830Q == 1) {
            if (!isEnabled()) {
                this.f30855k0 = this.f30826N0;
            } else if (z10 && !z11) {
                this.f30855k0 = this.f30829P0;
            } else if (z11) {
                this.f30855k0 = this.f30827O0;
            } else {
                this.f30855k0 = this.f30825M0;
            }
        }
        l();
    }

    public final void F(boolean z10) {
        ValueAnimator valueAnimator = this.f30840V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f30840V0.cancel();
        }
        if (z10 && this.f30838U0) {
            k(0.0f);
        } else {
            this.f30835S0.d0(0.0f);
        }
        if (A() && ((C5856b) this.f30813F).f0()) {
            x();
        }
        this.f30833R0 = true;
        J();
        this.f30845b.i(true);
        D0();
    }

    public final int G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f30848e.getCompoundPaddingLeft();
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f30848e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final boolean I() {
        return this.f30871s0 != 0;
    }

    public final void J() {
        TextView textView = this.f30872t;
        if (textView == null || !this.f30870s) {
            return;
        }
        textView.setText((CharSequence) null);
        s.a(this.f30844a, this.f30880x);
        this.f30872t.setVisibility(4);
    }

    public boolean K() {
        return this.f30847d.getVisibility() == 0 && this.f30875u0.getVisibility() == 0;
    }

    public final boolean L() {
        return this.f30810D0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f30854k.A();
    }

    public final boolean N() {
        return this.f30833R0;
    }

    public boolean O() {
        return this.f30811E;
    }

    public final boolean P() {
        return this.f30830Q == 1 && this.f30848e.getMinLines() <= 1;
    }

    public final void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.f30830Q != 0) {
            v0();
        }
    }

    public final void R() {
        if (A()) {
            RectF rectF = this.f30861n0;
            this.f30835S0.o(rectF, this.f30848e.getWidth(), this.f30848e.getGravity());
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f30834S);
            ((C5856b) this.f30813F).i0(rectF);
        }
    }

    public final void S() {
        if (!A() || this.f30833R0) {
            return;
        }
        x();
        R();
    }

    public void U() {
        t7.d.c(this, this.f30875u0, this.f30879w0);
    }

    public void V() {
        t7.d.c(this, this.f30810D0, this.f30812E0);
    }

    public void W() {
        this.f30845b.j();
    }

    public final void X() {
        TextView textView = this.f30872t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void Y(float f10, float f11, float f12, float f13) {
        boolean zE = n.e(this);
        this.f30821J = zE;
        float f14 = zE ? f11 : f10;
        if (!zE) {
            f10 = f11;
        }
        float f15 = zE ? f13 : f12;
        if (!zE) {
            f12 = f13;
        }
        s7.g gVar = this.f30813F;
        if (gVar != null && gVar.D() == f14 && this.f30813F.E() == f10 && this.f30813F.s() == f15 && this.f30813F.t() == f12) {
            return;
        }
        this.f30819I = this.f30819I.v().A(f14).E(f10).s(f15).w(f12).m();
        l();
    }

    public final void Z() {
        if (g0()) {
            E.j0(this.f30848e, this.f30813F);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f30844a.addView(view, layoutParams2);
        this.f30844a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    public void d0(TextView textView, int i10) {
        try {
            c1.i.n(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1.i.n(textView, i.f25976a);
        textView.setTextColor(L0.a.d(getContext(), c7.b.f25848a));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f30848e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f30849f != null) {
            boolean z10 = this.f30811E;
            this.f30811E = false;
            CharSequence hint = editText.getHint();
            this.f30848e.setHint(this.f30849f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f30848e.setHint(hint);
                this.f30811E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f30844a.getChildCount());
        for (int i11 = 0; i11 < this.f30844a.getChildCount(); i11++) {
            View childAt = this.f30844a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f30848e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f30843X0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f30843X0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f30842W0) {
            return;
        }
        this.f30842W0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C5139b c5139b = this.f30835S0;
        boolean zG0 = c5139b != null ? c5139b.g0(drawableState) : false;
        if (this.f30848e != null) {
            w0(E.L(this) && isEnabled());
        }
        r0();
        E0();
        if (zG0) {
            invalidate();
        }
        this.f30842W0 = false;
    }

    public final boolean e0() {
        return (this.f30810D0.getVisibility() == 0 || ((I() && K()) || this.f30803A != null)) && this.f30846c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f30845b.getMeasuredWidth() > 0;
    }

    public void g(f fVar) {
        this.f30869r0.add(fVar);
        if (this.f30848e != null) {
            fVar.a(this);
        }
    }

    public final boolean g0() {
        EditText editText = this.f30848e;
        return (editText == null || this.f30813F == null || editText.getBackground() != null || this.f30830Q == 0) ? false : true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f30848e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    public s7.g getBoxBackground() {
        int i10 = this.f30830Q;
        if (i10 == 1 || i10 == 2) {
            return this.f30813F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f30855k0;
    }

    public int getBoxBackgroundMode() {
        return this.f30830Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f30832R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return n.e(this) ? this.f30819I.j().a(this.f30861n0) : this.f30819I.l().a(this.f30861n0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return n.e(this) ? this.f30819I.l().a(this.f30861n0) : this.f30819I.j().a(this.f30861n0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return n.e(this) ? this.f30819I.r().a(this.f30861n0) : this.f30819I.t().a(this.f30861n0);
    }

    public float getBoxCornerRadiusTopStart() {
        return n.e(this) ? this.f30819I.t().a(this.f30861n0) : this.f30819I.r().a(this.f30861n0);
    }

    public int getBoxStrokeColor() {
        return this.f30823K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f30824L0;
    }

    public int getBoxStrokeWidth() {
        return this.f30836T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f30839V;
    }

    public int getCounterMaxLength() {
        return this.f30858m;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f30856l && this.f30860n && (textView = this.f30862o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f30882y;
    }

    public ColorStateList getCounterTextColor() {
        return this.f30882y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f30816G0;
    }

    public EditText getEditText() {
        return this.f30848e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f30875u0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f30875u0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f30871s0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f30875u0;
    }

    public CharSequence getError() {
        if (this.f30854k.z()) {
            return this.f30854k.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f30854k.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f30854k.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f30810D0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f30854k.p();
    }

    public CharSequence getHelperText() {
        if (this.f30854k.A()) {
            return this.f30854k.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f30854k.t();
    }

    public CharSequence getHint() {
        if (this.f30807C) {
            return this.f30809D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f30835S0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f30835S0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f30818H0;
    }

    public int getMaxEms() {
        return this.f30851h;
    }

    public int getMaxWidth() {
        return this.f30853j;
    }

    public int getMinEms() {
        return this.f30850g;
    }

    public int getMinWidth() {
        return this.f30852i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f30875u0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f30875u0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f30870s) {
            return this.f30868r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f30876v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f30874u;
    }

    public CharSequence getPrefixText() {
        return this.f30845b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f30845b.b();
    }

    public TextView getPrefixTextView() {
        return this.f30845b.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f30845b.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f30845b.e();
    }

    public CharSequence getSuffixText() {
        return this.f30803A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f30805B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f30805B;
    }

    public Typeface getTypeface() {
        return this.f30863o0;
    }

    public void h(g gVar) {
        this.f30877v0.add(gVar);
    }

    public final void h0() {
        if (this.f30872t == null || !this.f30870s || TextUtils.isEmpty(this.f30868r)) {
            return;
        }
        this.f30872t.setText(this.f30868r);
        s.a(this.f30844a, this.f30878w);
        this.f30872t.setVisibility(0);
        this.f30872t.bringToFront();
        announceForAccessibility(this.f30868r);
    }

    public final void i() {
        TextView textView = this.f30872t;
        if (textView != null) {
            this.f30844a.addView(textView);
            this.f30872t.setVisibility(0);
        }
    }

    public final void i0(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            t7.d.a(this, this.f30875u0, this.f30879w0, this.f30881x0);
            return;
        }
        Drawable drawableMutate = P0.a.l(getEndIconDrawable()).mutate();
        P0.a.h(drawableMutate, this.f30854k.p());
        this.f30875u0.setImageDrawable(drawableMutate);
    }

    public final void j() {
        if (this.f30848e == null || this.f30830Q != 1) {
            return;
        }
        if (AbstractC5402c.h(getContext())) {
            EditText editText = this.f30848e;
            E.r0(editText, E.A(editText), getResources().getDimensionPixelSize(c7.c.f25881m), E.z(this.f30848e), getResources().getDimensionPixelSize(c7.c.f25880l));
        } else if (AbstractC5402c.g(getContext())) {
            EditText editText2 = this.f30848e;
            E.r0(editText2, E.A(editText2), getResources().getDimensionPixelSize(c7.c.f25879k), E.z(this.f30848e), getResources().getDimensionPixelSize(c7.c.f25878j));
        }
    }

    public final void j0() {
        if (this.f30830Q == 1) {
            if (AbstractC5402c.h(getContext())) {
                this.f30832R = getResources().getDimensionPixelSize(c7.c.f25883o);
            } else if (AbstractC5402c.g(getContext())) {
                this.f30832R = getResources().getDimensionPixelSize(c7.c.f25882n);
            }
        }
    }

    public void k(float f10) {
        if (this.f30835S0.x() == f10) {
            return;
        }
        if (this.f30840V0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f30840V0 = valueAnimator;
            valueAnimator.setInterpolator(C3834a.f33147b);
            this.f30840V0.setDuration(167L);
            this.f30840V0.addUpdateListener(new d());
        }
        this.f30840V0.setFloatValues(this.f30835S0.x(), f10);
        this.f30840V0.start();
    }

    public final void k0(Rect rect) {
        s7.g gVar = this.f30815G;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f30836T, rect.right, i10);
        }
        s7.g gVar2 = this.f30817H;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.f30839V, rect.right, i11);
        }
    }

    public final void l() {
        s7.g gVar = this.f30813F;
        if (gVar == null) {
            return;
        }
        k kVarB = gVar.B();
        k kVar = this.f30819I;
        if (kVarB != kVar) {
            this.f30813F.setShapeAppearanceModel(kVar);
            p0();
        }
        if (v()) {
            this.f30813F.Y(this.f30834S, this.f30841W);
        }
        int iP = p();
        this.f30855k0 = iP;
        this.f30813F.U(ColorStateList.valueOf(iP));
        if (this.f30871s0 == 3) {
            this.f30848e.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    public final void l0() {
        if (this.f30862o != null) {
            EditText editText = this.f30848e;
            m0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void m() {
        if (this.f30815G == null || this.f30817H == null) {
            return;
        }
        if (w()) {
            this.f30815G.U(this.f30848e.isFocused() ? ColorStateList.valueOf(this.f30820I0) : ColorStateList.valueOf(this.f30841W));
            this.f30817H.U(ColorStateList.valueOf(this.f30841W));
        }
        invalidate();
    }

    public void m0(int i10) {
        boolean z10 = this.f30860n;
        int i11 = this.f30858m;
        if (i11 == -1) {
            this.f30862o.setText(String.valueOf(i10));
            this.f30862o.setContentDescription(null);
            this.f30860n = false;
        } else {
            this.f30860n = i10 > i11;
            n0(getContext(), this.f30862o, i10, this.f30858m, this.f30860n);
            if (z10 != this.f30860n) {
                o0();
            }
            this.f30862o.setText(W0.a.c().j(getContext().getString(c7.h.f25963d, Integer.valueOf(i10), Integer.valueOf(this.f30858m))));
        }
        if (this.f30848e == null || z10 == this.f30860n) {
            return;
        }
        w0(false);
        E0();
        r0();
    }

    public final void n(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f30828P;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    public final void o() {
        int i10 = this.f30830Q;
        if (i10 == 0) {
            this.f30813F = null;
            this.f30815G = null;
            this.f30817H = null;
            return;
        }
        if (i10 == 1) {
            this.f30813F = new s7.g(this.f30819I);
            this.f30815G = new s7.g();
            this.f30817H = new s7.g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f30830Q + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f30807C || (this.f30813F instanceof C5856b)) {
                this.f30813F = new s7.g(this.f30819I);
            } else {
                this.f30813F = new C5856b(this.f30819I);
            }
            this.f30815G = null;
            this.f30817H = null;
        }
    }

    public final void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f30862o;
        if (textView != null) {
            d0(textView, this.f30860n ? this.f30864p : this.f30866q);
            if (!this.f30860n && (colorStateList2 = this.f30882y) != null) {
                this.f30862o.setTextColor(colorStateList2);
            }
            if (!this.f30860n || (colorStateList = this.f30884z) == null) {
                return;
            }
            this.f30862o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f30835S0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f30848e;
        if (editText != null) {
            Rect rect = this.f30857l0;
            C5140c.a(this, editText, rect);
            k0(rect);
            if (this.f30807C) {
                this.f30835S0.b0(this.f30848e.getTextSize());
                int gravity = this.f30848e.getGravity();
                this.f30835S0.S((gravity & (-113)) | 48);
                this.f30835S0.a0(gravity);
                this.f30835S0.O(q(rect));
                this.f30835S0.W(t(rect));
                this.f30835S0.K();
                if (!A() || this.f30833R0) {
                    return;
                }
                R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean zS0 = s0();
        boolean zQ0 = q0();
        if (zS0 || zQ0) {
            this.f30848e.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f30891c);
        if (hVar.f30892d) {
            this.f30875u0.post(new b());
        }
        setHint(hVar.f30893e);
        setHelperText(hVar.f30894f);
        setPlaceholderText(hVar.f30895g);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.f30821J;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float fA = this.f30819I.r().a(this.f30861n0);
            float fA2 = this.f30819I.t().a(this.f30861n0);
            float fA3 = this.f30819I.j().a(this.f30861n0);
            float fA4 = this.f30819I.l().a(this.f30861n0);
            float f10 = z10 ? fA : fA2;
            if (z10) {
                fA = fA2;
            }
            float f11 = z10 ? fA3 : fA4;
            if (z10) {
                fA3 = fA4;
            }
            Y(f10, fA, f11, fA3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f30854k.l()) {
            hVar.f30891c = getError();
        }
        hVar.f30892d = I() && this.f30875u0.isChecked();
        hVar.f30893e = getHint();
        hVar.f30894f = getHelperText();
        hVar.f30895g = getPlaceholderText();
        return hVar;
    }

    public final int p() {
        return this.f30830Q == 1 ? AbstractC4365a.g(AbstractC4365a.e(this, AbstractC3079a.f25832k, 0), this.f30855k0) : this.f30855k0;
    }

    public final void p0() {
        if (this.f30871s0 == 3 && this.f30830Q == 2) {
            ((com.google.android.material.textfield.b) this.f30873t0.get(3)).O((AutoCompleteTextView) this.f30848e);
        }
    }

    public final Rect q(Rect rect) {
        if (this.f30848e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f30859m0;
        boolean zE = n.e(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f30830Q;
        if (i10 == 1) {
            rect2.left = G(rect.left, zE);
            rect2.top = rect.top + this.f30832R;
            rect2.right = H(rect.right, zE);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = G(rect.left, zE);
            rect2.top = getPaddingTop();
            rect2.right = H(rect.right, zE);
            return rect2;
        }
        rect2.left = rect.left + this.f30848e.getPaddingLeft();
        rect2.top = rect.top - u();
        rect2.right = rect.right - this.f30848e.getPaddingRight();
        return rect2;
    }

    public boolean q0() {
        boolean z10;
        if (this.f30848e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f30845b.getMeasuredWidth() - this.f30848e.getPaddingLeft();
            if (this.f30865p0 == null || this.f30867q0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f30865p0 = colorDrawable;
                this.f30867q0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = c1.i.a(this.f30848e);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f30865p0;
            if (drawable != drawable2) {
                c1.i.h(this.f30848e, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f30865p0 != null) {
                Drawable[] drawableArrA2 = c1.i.a(this.f30848e);
                c1.i.h(this.f30848e, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f30865p0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f30805B.getMeasuredWidth() - this.f30848e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + AbstractC2557k.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = c1.i.a(this.f30848e);
            Drawable drawable3 = this.f30883y0;
            if (drawable3 != null && this.f30885z0 != measuredWidth2) {
                this.f30885z0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                c1.i.h(this.f30848e, drawableArrA3[0], drawableArrA3[1], this.f30883y0, drawableArrA3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f30883y0 = colorDrawable2;
                this.f30885z0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrA3[2];
            Drawable drawable5 = this.f30883y0;
            if (drawable4 != drawable5) {
                this.f30804A0 = drawable4;
                c1.i.h(this.f30848e, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                return true;
            }
        } else if (this.f30883y0 != null) {
            Drawable[] drawableArrA4 = c1.i.a(this.f30848e);
            if (drawableArrA4[2] == this.f30883y0) {
                c1.i.h(this.f30848e, drawableArrA4[0], drawableArrA4[1], this.f30804A0, drawableArrA4[3]);
            } else {
                z11 = z10;
            }
            this.f30883y0 = null;
            return z11;
        }
        return z10;
    }

    public final int r(Rect rect, Rect rect2, float f10) {
        return P() ? (int) (rect2.top + f10) : rect.bottom - this.f30848e.getCompoundPaddingBottom();
    }

    public void r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f30848e;
        if (editText == null || this.f30830Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC5329H.a(background)) {
            background = background.mutate();
        }
        if (this.f30854k.l()) {
            background.setColorFilter(C5348j.e(this.f30854k.p(), PorterDuff.Mode.SRC_IN));
        } else if (this.f30860n && (textView = this.f30862o) != null) {
            background.setColorFilter(C5348j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            P0.a.a(background);
            this.f30848e.refreshDrawableState();
        }
    }

    public final int s(Rect rect, float f10) {
        return P() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f30848e.getCompoundPaddingTop();
    }

    public final boolean s0() {
        int iMax;
        if (this.f30848e == null || this.f30848e.getMeasuredHeight() >= (iMax = Math.max(this.f30846c.getMeasuredHeight(), this.f30845b.getMeasuredHeight()))) {
            return false;
        }
        this.f30848e.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f30855k0 != i10) {
            this.f30855k0 = i10;
            this.f30825M0 = i10;
            this.f30827O0 = i10;
            this.f30829P0 = i10;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(L0.a.d(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f30825M0 = defaultColor;
        this.f30855k0 = defaultColor;
        this.f30826N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f30827O0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f30829P0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f30830Q) {
            return;
        }
        this.f30830Q = i10;
        if (this.f30848e != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f30832R = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f30823K0 != i10) {
            this.f30823K0 = i10;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f30820I0 = colorStateList.getDefaultColor();
            this.f30831Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f30822J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f30823K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f30823K0 != colorStateList.getDefaultColor()) {
            this.f30823K0 = colorStateList.getDefaultColor();
        }
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f30824L0 != colorStateList) {
            this.f30824L0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f30836T = i10;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f30839V = i10;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f30856l != z10) {
            if (z10) {
                C5324C c5324c = new C5324C(getContext());
                this.f30862o = c5324c;
                c5324c.setId(c7.e.f25909H);
                Typeface typeface = this.f30863o0;
                if (typeface != null) {
                    this.f30862o.setTypeface(typeface);
                }
                this.f30862o.setMaxLines(1);
                this.f30854k.e(this.f30862o, 2);
                AbstractC2557k.d((ViewGroup.MarginLayoutParams) this.f30862o.getLayoutParams(), getResources().getDimensionPixelOffset(c7.c.f25868O));
                o0();
                l0();
            } else {
                this.f30854k.B(this.f30862o, 2);
                this.f30862o = null;
            }
            this.f30856l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f30858m != i10) {
            if (i10 > 0) {
                this.f30858m = i10;
            } else {
                this.f30858m = -1;
            }
            if (this.f30856l) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f30864p != i10) {
            this.f30864p = i10;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f30884z != colorStateList) {
            this.f30884z = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f30866q != i10) {
            this.f30866q = i10;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f30882y != colorStateList) {
            this.f30882y = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f30816G0 = colorStateList;
        this.f30818H0 = colorStateList;
        if (this.f30848e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        T(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f30875u0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f30875u0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.f30871s0;
        if (i11 == i10) {
            return;
        }
        this.f30871s0 = i10;
        C(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f30830Q)) {
            getEndIconDelegate().a();
            t7.d.a(this, this.f30875u0, this.f30879w0, this.f30881x0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f30830Q + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f30875u0, onClickListener, this.f30806B0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f30806B0 = onLongClickListener;
        c0(this.f30875u0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f30879w0 != colorStateList) {
            this.f30879w0 = colorStateList;
            t7.d.a(this, this.f30875u0, colorStateList, this.f30881x0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f30881x0 != mode) {
            this.f30881x0 = mode;
            t7.d.a(this, this.f30875u0, this.f30879w0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (K() != z10) {
            this.f30875u0.setVisibility(z10 ? 0 : 8);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f30854k.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f30854k.v();
        } else {
            this.f30854k.O(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f30854k.D(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f30854k.E(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
        V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f30810D0, onClickListener, this.f30808C0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f30808C0 = onLongClickListener;
        c0(this.f30810D0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f30812E0 != colorStateList) {
            this.f30812E0 = colorStateList;
            t7.d.a(this, this.f30810D0, colorStateList, this.f30814F0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f30814F0 != mode) {
            this.f30814F0 = mode;
            t7.d.a(this, this.f30810D0, this.f30812E0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f30854k.F(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f30854k.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f30837T0 != z10) {
            this.f30837T0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f30854k.P(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f30854k.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f30854k.I(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f30854k.H(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f30807C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecognitionOptions.PDF417);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f30838U0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f30807C) {
            this.f30807C = z10;
            if (z10) {
                CharSequence hint = this.f30848e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f30809D)) {
                        setHint(hint);
                    }
                    this.f30848e.setHint((CharSequence) null);
                }
                this.f30811E = true;
            } else {
                this.f30811E = false;
                if (!TextUtils.isEmpty(this.f30809D) && TextUtils.isEmpty(this.f30848e.getHint())) {
                    this.f30848e.setHint(this.f30809D);
                }
                setHintInternal(null);
            }
            if (this.f30848e != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f30835S0.P(i10);
        this.f30818H0 = this.f30835S0.p();
        if (this.f30848e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f30818H0 != colorStateList) {
            if (this.f30816G0 == null) {
                this.f30835S0.R(colorStateList);
            }
            this.f30818H0 = colorStateList;
            if (this.f30848e != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.f30851h = i10;
        EditText editText = this.f30848e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f30853j = i10;
        EditText editText = this.f30848e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f30850g = i10;
        EditText editText = this.f30848e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f30852i = i10;
        EditText editText = this.f30848e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f30871s0 != 1) {
            setEndIconMode(1);
        } else {
            if (z10) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f30879w0 = colorStateList;
        t7.d.a(this, this.f30875u0, colorStateList, this.f30881x0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f30881x0 = mode;
        t7.d.a(this, this.f30875u0, this.f30879w0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f30872t == null) {
            C5324C c5324c = new C5324C(getContext());
            this.f30872t = c5324c;
            c5324c.setId(c7.e.f25912K);
            E.n0(this.f30872t, 2);
            C5834c c5834cZ = z();
            this.f30878w = c5834cZ;
            c5834cZ.s0(67L);
            this.f30880x = z();
            setPlaceholderTextAppearance(this.f30876v);
            setPlaceholderTextColor(this.f30874u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f30870s) {
                setPlaceholderTextEnabled(true);
            }
            this.f30868r = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f30876v = i10;
        TextView textView = this.f30872t;
        if (textView != null) {
            c1.i.n(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f30874u != colorStateList) {
            this.f30874u = colorStateList;
            TextView textView = this.f30872t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f30845b.k(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f30845b.l(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f30845b.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f30845b.n(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f30845b.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f30845b.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f30845b.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f30845b.t(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f30845b.u(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f30803A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f30805B.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i10) {
        c1.i.n(this.f30805B, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f30805B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f30848e;
        if (editText != null) {
            E.f0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f30863o0) {
            this.f30863o0 = typeface;
            this.f30835S0.j0(typeface);
            this.f30854k.L(typeface);
            TextView textView = this.f30862o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final Rect t(Rect rect) {
        if (this.f30848e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f30859m0;
        float fW = this.f30835S0.w();
        rect2.left = rect.left + this.f30848e.getCompoundPaddingLeft();
        rect2.top = s(rect, fW);
        rect2.right = rect.right - this.f30848e.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, fW);
        return rect2;
    }

    public final void t0() {
        this.f30847d.setVisibility((this.f30875u0.getVisibility() != 0 || L()) ? 8 : 0);
        this.f30846c.setVisibility(K() || L() || ((this.f30803A == null || N()) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    public final int u() {
        float fQ;
        if (!this.f30807C) {
            return 0;
        }
        int i10 = this.f30830Q;
        if (i10 == 0) {
            fQ = this.f30835S0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fQ = this.f30835S0.q() / 2.0f;
        }
        return (int) fQ;
    }

    public final void u0() {
        this.f30810D0.setVisibility(getErrorIconDrawable() != null && this.f30854k.z() && this.f30854k.l() ? 0 : 8);
        t0();
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    public final boolean v() {
        return this.f30830Q == 2 && w();
    }

    public final void v0() {
        if (this.f30830Q != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f30844a.getLayoutParams();
            int iU = u();
            if (iU != layoutParams.topMargin) {
                layoutParams.topMargin = iU;
                this.f30844a.requestLayout();
            }
        }
    }

    public final boolean w() {
        return this.f30834S > -1 && this.f30841W != 0;
    }

    public void w0(boolean z10) {
        x0(z10, false);
    }

    public final void x() {
        if (A()) {
            ((C5856b) this.f30813F).g0();
        }
    }

    public final void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f30848e;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f30848e;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        boolean zL = this.f30854k.l();
        ColorStateList colorStateList2 = this.f30816G0;
        if (colorStateList2 != null) {
            this.f30835S0.R(colorStateList2);
            this.f30835S0.Z(this.f30816G0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f30816G0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f30831Q0) : this.f30831Q0;
            this.f30835S0.R(ColorStateList.valueOf(colorForState));
            this.f30835S0.Z(ColorStateList.valueOf(colorForState));
        } else if (zL) {
            this.f30835S0.R(this.f30854k.q());
        } else if (this.f30860n && (textView = this.f30862o) != null) {
            this.f30835S0.R(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f30818H0) != null) {
            this.f30835S0.R(colorStateList);
        }
        if (z13 || !this.f30837T0 || (isEnabled() && z12)) {
            if (z11 || this.f30833R0) {
                y(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f30833R0) {
            F(z10);
        }
    }

    public final void y(boolean z10) {
        ValueAnimator valueAnimator = this.f30840V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f30840V0.cancel();
        }
        if (z10 && this.f30838U0) {
            k(1.0f);
        } else {
            this.f30835S0.d0(1.0f);
        }
        this.f30833R0 = false;
        if (A()) {
            R();
        }
        z0();
        this.f30845b.i(false);
        D0();
    }

    public final void y0() {
        EditText editText;
        if (this.f30872t == null || (editText = this.f30848e) == null) {
            return;
        }
        this.f30872t.setGravity(editText.getGravity());
        this.f30872t.setPadding(this.f30848e.getCompoundPaddingLeft(), this.f30848e.getCompoundPaddingTop(), this.f30848e.getCompoundPaddingRight(), this.f30848e.getCompoundPaddingBottom());
    }

    public final C5834c z() {
        C5834c c5834c = new C5834c();
        c5834c.n0(87L);
        c5834c.p0(C3834a.f33146a);
        return c5834c;
    }

    public final void z0() {
        EditText editText = this.f30848e;
        A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v41 */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        ?? r42;
        boolean z10;
        View view;
        int iN;
        int i12 = f30802Y0;
        super(AbstractC5981a.c(context, attributeSet, i10, i12), attributeSet, i10);
        this.f30850g = -1;
        this.f30851h = -1;
        this.f30852i = -1;
        this.f30853j = -1;
        this.f30854k = new t7.e(this);
        this.f30857l0 = new Rect();
        this.f30859m0 = new Rect();
        this.f30861n0 = new RectF();
        this.f30869r0 = new LinkedHashSet();
        this.f30871s0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f30873t0 = sparseArray;
        this.f30877v0 = new LinkedHashSet();
        C5139b c5139b = new C5139b(this);
        this.f30835S0 = c5139b;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f30844a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f30847d = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f30846c = linearLayout;
        C5324C c5324c = new C5324C(context2);
        this.f30805B = c5324c;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        c5324c.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(c7.g.f25943b, (ViewGroup) linearLayout, false);
        this.f30810D0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(c7.g.f25943b, (ViewGroup) frameLayout2, false);
        this.f30875u0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = C3834a.f33146a;
        c5139b.i0(timeInterpolator);
        c5139b.f0(timeInterpolator);
        c5139b.S(8388659);
        W wI = l.i(context2, attributeSet, j.f26094O4, i10, i12, j.f26267l5, j.f26251j5, j.f26362y5, j.f26018D5, j.f26046H5);
        t7.h hVar = new t7.h(this, wI);
        this.f30845b = hVar;
        this.f30807C = wI.a(j.f26039G5, true);
        setHint(wI.p(j.f26129T4));
        this.f30838U0 = wI.a(j.f26032F5, true);
        this.f30837T0 = wI.a(j.f25997A5, true);
        if (wI.s(j.f26143V4)) {
            i11 = -1;
            setMinEms(wI.k(j.f26143V4, -1));
        } else {
            i11 = -1;
            if (wI.s(j.f26122S4)) {
                setMinWidth(wI.f(j.f26122S4, -1));
            }
        }
        if (wI.s(j.f26136U4)) {
            setMaxEms(wI.k(j.f26136U4, i11));
        } else if (wI.s(j.f26115R4)) {
            setMaxWidth(wI.f(j.f26115R4, i11));
        }
        this.f30819I = k.e(context2, attributeSet, i10, i12).m();
        this.f30828P = context2.getResources().getDimensionPixelOffset(c7.c.f25865L);
        this.f30832R = wI.e(j.f26164Y4, 0);
        this.f30836T = wI.f(j.f26219f5, context2.getResources().getDimensionPixelSize(c7.c.f25866M));
        this.f30839V = wI.f(j.f26227g5, context2.getResources().getDimensionPixelSize(c7.c.f25867N));
        this.f30834S = this.f30836T;
        float fD = wI.d(j.f26195c5, -1.0f);
        float fD2 = wI.d(j.f26187b5, -1.0f);
        float fD3 = wI.d(j.f26171Z4, -1.0f);
        float fD4 = wI.d(j.f26179a5, -1.0f);
        k.b bVarV = this.f30819I.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.f30819I = bVarV.m();
        ColorStateList colorStateListB = AbstractC5402c.b(context2, wI, j.f26150W4);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f30825M0 = defaultColor;
            this.f30855k0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f30826N0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f30827O0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f30829P0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f30827O0 = this.f30825M0;
                ColorStateList colorStateListA = AbstractC4666a.a(context2, c7.b.f25850c);
                this.f30826N0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f30829P0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f30855k0 = 0;
            this.f30825M0 = 0;
            this.f30826N0 = 0;
            this.f30827O0 = 0;
            this.f30829P0 = 0;
        }
        if (wI.s(j.f26108Q4)) {
            ColorStateList colorStateListC = wI.c(j.f26108Q4);
            this.f30818H0 = colorStateListC;
            this.f30816G0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = AbstractC5402c.b(context2, wI, j.f26203d5);
        this.f30823K0 = wI.b(j.f26203d5, 0);
        this.f30820I0 = L0.a.d(context2, c7.b.f25851d);
        this.f30831Q0 = L0.a.d(context2, c7.b.f25852e);
        this.f30822J0 = L0.a.d(context2, c7.b.f25853f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (wI.s(j.f26211e5)) {
            setBoxStrokeErrorColor(AbstractC5402c.b(context2, wI, j.f26211e5));
        }
        if (wI.n(j.f26046H5, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(wI.n(j.f26046H5, 0));
        } else {
            r42 = 0;
        }
        int iN2 = wI.n(j.f26362y5, r42);
        CharSequence charSequenceP = wI.p(j.f26327t5);
        boolean zA = wI.a(j.f26334u5, r42);
        checkableImageButton.setId(c7.e.f25908G);
        if (AbstractC5402c.g(context2)) {
            AbstractC2557k.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r42);
        }
        if (wI.s(j.f26348w5)) {
            this.f30812E0 = AbstractC5402c.b(context2, wI, j.f26348w5);
        }
        if (wI.s(j.f26355x5)) {
            z10 = zA;
            this.f30814F0 = n.f(wI.k(j.f26355x5, -1), null);
        } else {
            z10 = zA;
        }
        if (wI.s(j.f26341v5)) {
            setErrorIconDrawable(wI.g(j.f26341v5));
        }
        checkableImageButton.setContentDescription(getResources().getText(c7.h.f25965f));
        E.n0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN3 = wI.n(j.f26018D5, 0);
        boolean zA2 = wI.a(j.f26011C5, false);
        CharSequence charSequenceP2 = wI.p(j.f26004B5);
        int iN4 = wI.n(j.f26102P5, 0);
        CharSequence charSequenceP3 = wI.p(j.f26095O5);
        int iN5 = wI.n(j.f26180a6, 0);
        CharSequence charSequenceP4 = wI.p(j.f26172Z5);
        boolean zA3 = wI.a(j.f26235h5, false);
        setCounterMaxLength(wI.k(j.f26243i5, -1));
        this.f30866q = wI.n(j.f26267l5, 0);
        this.f30864p = wI.n(j.f26251j5, 0);
        setBoxBackgroundMode(wI.k(j.f26157X4, 0));
        if (AbstractC5402c.g(context2)) {
            AbstractC2557k.d((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iN6 = wI.n(j.f26299p5, 0);
        sparseArray.append(-1, new C5855a(this, iN6));
        sparseArray.append(0, new t7.g(this));
        if (iN6 == 0) {
            view = checkableImageButton2;
            iN = wI.n(j.f26067K5, 0);
        } else {
            view = checkableImageButton2;
            iN = iN6;
        }
        sparseArray.append(1, new com.google.android.material.textfield.c(this, iN));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, iN6));
        sparseArray.append(3, new com.google.android.material.textfield.b(this, iN6));
        if (!wI.s(j.f26074L5)) {
            if (wI.s(j.f26313r5)) {
                this.f30879w0 = AbstractC5402c.b(context2, wI, j.f26313r5);
            }
            if (wI.s(j.f26320s5)) {
                this.f30881x0 = n.f(wI.k(j.f26320s5, -1), null);
            }
        }
        if (wI.s(j.f26306q5)) {
            setEndIconMode(wI.k(j.f26306q5, 0));
            if (wI.s(j.f26291o5)) {
                setEndIconContentDescription(wI.p(j.f26291o5));
            }
            setEndIconCheckable(wI.a(j.f26283n5, true));
        } else if (wI.s(j.f26074L5)) {
            if (wI.s(j.f26081M5)) {
                this.f30879w0 = AbstractC5402c.b(context2, wI, j.f26081M5);
            }
            if (wI.s(j.f26088N5)) {
                this.f30881x0 = n.f(wI.k(j.f26088N5, -1), null);
            }
            setEndIconMode(wI.a(j.f26074L5, false) ? 1 : 0);
            setEndIconContentDescription(wI.p(j.f26060J5));
        }
        c5324c.setId(c7.e.f25914M);
        c5324c.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        E.h0(c5324c, 1);
        setErrorContentDescription(charSequenceP);
        setCounterOverflowTextAppearance(this.f30864p);
        setHelperTextTextAppearance(iN3);
        setErrorTextAppearance(iN2);
        setCounterTextAppearance(this.f30866q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN4);
        setSuffixTextAppearance(iN5);
        if (wI.s(j.f26369z5)) {
            setErrorTextColor(wI.c(j.f26369z5));
        }
        if (wI.s(j.f26025E5)) {
            setHelperTextColor(wI.c(j.f26025E5));
        }
        if (wI.s(j.f26053I5)) {
            setHintTextColor(wI.c(j.f26053I5));
        }
        if (wI.s(j.f26275m5)) {
            setCounterTextColor(wI.c(j.f26275m5));
        }
        if (wI.s(j.f26259k5)) {
            setCounterOverflowTextColor(wI.c(j.f26259k5));
        }
        if (wI.s(j.f26109Q5)) {
            setPlaceholderTextColor(wI.c(j.f26109Q5));
        }
        if (wI.s(j.f26188b6)) {
            setSuffixTextColor(wI.c(j.f26188b6));
        }
        setEnabled(wI.a(j.f26101P4, true));
        wI.x();
        E.n0(this, 2);
        E.p0(this, 1);
        frameLayout2.addView(view);
        linearLayout.addView(c5324c);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(hVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(zA2);
        setErrorEnabled(z10);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
        setSuffixText(charSequenceP4);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f30875u0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f30875u0.setImageDrawable(drawable);
        if (drawable != null) {
            t7.d.a(this, this.f30875u0, this.f30879w0, this.f30881x0);
            U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f30845b.o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f30845b.p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f30810D0.setImageDrawable(drawable);
        u0();
        t7.d.a(this, this.f30810D0, this.f30812E0, this.f30814F0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f30875u0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f30875u0.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.f30843X0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f30856l) {
                textInputLayout.m0(editable.length());
            }
            if (TextInputLayout.this.f30870s) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
