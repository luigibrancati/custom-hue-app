package com.google.android.material.datepicker;

import Y0.E;
import Y0.S;
import Y0.w;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o;
import c7.AbstractC3079a;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import j.AbstractC4666a;
import j7.ViewOnTouchListenerC4746a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n7.AbstractC5141d;
import p7.C5401b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i<S> extends DialogInterfaceOnCancelListenerC2734o {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Object f30700Q = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Object f30701R = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Object f30702S = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f30703A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f30704B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f30705C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public CharSequence f30706D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f30707E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f30708F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f30709G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CheckableImageButton f30710H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public s7.g f30711I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Button f30712J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f30713P;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashSet f30714q = new LinkedHashSet();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f30715r = new LinkedHashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f30716s = new LinkedHashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f30717t = new LinkedHashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f30718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f30719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.google.android.material.datepicker.a f30720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f30721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f30722y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f30723z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f30725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30726c;

        public a(int i10, View view, int i11) {
            this.f30724a = i10;
            this.f30725b = view;
            this.f30726c = i11;
        }

        @Override // Y0.w
        public S a(View view, S s10) {
            int i10 = s10.f(S.o.h()).f10747b;
            if (this.f30724a >= 0) {
                this.f30725b.getLayoutParams().height = this.f30724a + i10;
                View view2 = this.f30725b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f30725b;
            view3.setPadding(view3.getPaddingLeft(), this.f30726c + i10, this.f30725b.getPaddingRight(), this.f30725b.getPaddingBottom());
            return s10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends n {
        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button unused = i.this.f30712J;
            i.z(i.this);
            throw null;
        }
    }

    public static Drawable B(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC4666a.b(context, c7.d.f25896b));
        stateListDrawable.addState(new int[0], AbstractC4666a.b(context, c7.d.f25897c));
        return stateListDrawable;
    }

    private d D() {
        android.support.v4.media.session.a.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    public static int F(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(c7.c.f25891w);
        int i10 = k.q().f30736d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(c7.c.f25893y) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(c7.c.f25855B));
    }

    public static boolean I(Context context) {
        return K(context, R.attr.windowFullscreen);
    }

    public static boolean J(Context context) {
        return K(context, AbstractC3079a.f25843v);
    }

    public static boolean K(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C5401b.c(context, AbstractC3079a.f25840s, h.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public static /* synthetic */ d z(i iVar) {
        iVar.D();
        return null;
    }

    public final void C(Window window) {
        if (this.f30713P) {
            return;
        }
        View viewFindViewById = requireView().findViewById(c7.e.f25920f);
        AbstractC5141d.a(window, true, n7.n.c(viewFindViewById), null);
        E.q0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f30713P = true;
    }

    public String E() {
        D();
        getContext();
        throw null;
    }

    public final int G(Context context) {
        int i10 = this.f30718u;
        if (i10 != 0) {
            return i10;
        }
        D();
        throw null;
    }

    public final void H(Context context) {
        this.f30710H.setTag(f30702S);
        this.f30710H.setImageDrawable(B(context));
        this.f30710H.setChecked(this.f30704B != 0);
        E.f0(this.f30710H, null);
        N(this.f30710H);
        this.f30710H.setOnClickListener(new c());
    }

    public final void L() {
        o oVarN;
        int iG = G(requireContext());
        D();
        this.f30721x = h.B(null, iG, this.f30720w);
        if (this.f30710H.isChecked()) {
            D();
            oVarN = j.n(null, iG, this.f30720w);
        } else {
            oVarN = this.f30721x;
        }
        this.f30719v = oVarN;
        M();
        androidx.fragment.app.S sP = getChildFragmentManager().p();
        sP.m(c7.e.f25936v, this.f30719v);
        sP.h();
        this.f30719v.l(new b());
    }

    public final void M() {
        String strE = E();
        this.f30709G.setContentDescription(String.format(getString(c7.h.f25968i), strE));
        this.f30709G.setText(strE);
    }

    public final void N(CheckableImageButton checkableImageButton) {
        this.f30710H.setContentDescription(this.f30710H.isChecked() ? checkableImageButton.getContext().getString(c7.h.f25971l) : checkableImageButton.getContext().getString(c7.h.f25973n));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f30716s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o, androidx.fragment.app.ComponentCallbacksC2736q
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f30718u = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.a.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f30720w = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f30722y = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f30723z = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f30704B = bundle.getInt("INPUT_MODE_KEY");
        this.f30705C = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f30706D = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f30707E = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f30708F = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f30703A ? c7.g.f25959r : c7.g.f25958q, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f30703A) {
            viewInflate.findViewById(c7.e.f25936v).setLayoutParams(new LinearLayout.LayoutParams(F(context), -2));
        } else {
            viewInflate.findViewById(c7.e.f25937w).setLayoutParams(new LinearLayout.LayoutParams(F(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(c7.e.f25940z);
        this.f30709G = textView;
        E.h0(textView, 1);
        this.f30710H = (CheckableImageButton) viewInflate.findViewById(c7.e.f25902A);
        TextView textView2 = (TextView) viewInflate.findViewById(c7.e.f25903B);
        CharSequence charSequence = this.f30723z;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f30722y);
        }
        H(context);
        this.f30712J = (Button) viewInflate.findViewById(c7.e.f25917c);
        D();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f30717t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o, androidx.fragment.app.ComponentCallbacksC2736q
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f30718u);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f30720w);
        if (this.f30721x.w() != null) {
            bVar.b(this.f30721x.w().f30738f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f30722y);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f30723z);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f30705C);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f30706D);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f30707E);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f30708F);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o, androidx.fragment.app.ComponentCallbacksC2736q
    public void onStart() {
        super.onStart();
        Window window = v().getWindow();
        if (this.f30703A) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f30711I);
            C(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(c7.c.f25854A);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f30711I, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC4746a(v(), rect));
        }
        L();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o, androidx.fragment.app.ComponentCallbacksC2736q
    public void onStop() {
        this.f30719v.m();
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2734o
    public final Dialog r(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), G(requireContext()));
        Context context = dialog.getContext();
        this.f30703A = I(context);
        int iC = C5401b.c(context, AbstractC3079a.f25832k, i.class.getCanonicalName());
        s7.g gVar = new s7.g(context, null, AbstractC3079a.f25840s, c7.i.f25988m);
        this.f30711I = gVar;
        gVar.K(context);
        this.f30711I.U(ColorStateList.valueOf(iC));
        this.f30711I.T(E.s(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
