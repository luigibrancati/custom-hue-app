package androidx.preference;

import N0.i;
import T2.c;
import T2.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f23973J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence f23974P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f23975Q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreference.this.a(Boolean.valueOf(z10))) {
                SwitchPreference.this.U(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23973J = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16098J0, i10, i11);
        X(i.f(typedArrayObtainStyledAttributes, g.f16114R0, g.f16100K0));
        W(i.f(typedArrayObtainStyledAttributes, g.f16112Q0, g.f16102L0));
        a0(i.f(typedArrayObtainStyledAttributes, g.f16118T0, g.f16106N0));
        Z(i.f(typedArrayObtainStyledAttributes, g.f16116S0, g.f16108O0));
        V(i.b(typedArrayObtainStyledAttributes, g.f16110P0, g.f16104M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            b0(view.findViewById(R.id.switch_widget));
            Y(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void M(View view) {
        super.M(view);
        c0(view);
    }

    public void Z(CharSequence charSequence) {
        this.f23975Q = charSequence;
        F();
    }

    public void a0(CharSequence charSequence) {
        this.f23974P = charSequence;
        F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f23981E);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f23974P);
            r42.setTextOff(this.f23975Q);
            r42.setOnCheckedChangeListener(this.f23973J);
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f16075j, R.attr.switchPreferenceStyle));
    }
}
