package androidx.preference;

import N0.i;
import T2.c;
import T2.d;
import T2.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f23977J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence f23978P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f23979Q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z10))) {
                SwitchPreferenceCompat.this.U(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23977J = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16120U0, i10, i11);
        X(i.f(typedArrayObtainStyledAttributes, g.f16139c1, g.f16122V0));
        W(i.f(typedArrayObtainStyledAttributes, g.f16136b1, g.f16124W0));
        a0(i.f(typedArrayObtainStyledAttributes, g.f16145e1, g.f16128Y0));
        Z(i.f(typedArrayObtainStyledAttributes, g.f16142d1, g.f16130Z0));
        V(i.b(typedArrayObtainStyledAttributes, g.f16133a1, g.f16126X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b0(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f23981E);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f23978P);
            switchCompat.setTextOff(this.f23979Q);
            switchCompat.setOnCheckedChangeListener(this.f23977J);
        }
    }

    private void c0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            b0(view.findViewById(d.f16076a));
            Y(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void M(View view) {
        super.M(view);
        c0(view);
    }

    public void Z(CharSequence charSequence) {
        this.f23979Q = charSequence;
        F();
    }

    public void a0(CharSequence charSequence) {
        this.f23978P = charSequence;
        F();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f16074i);
    }
}
