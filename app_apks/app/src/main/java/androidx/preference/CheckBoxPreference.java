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

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f23894J;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z10))) {
                CheckBoxPreference.this.U(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    @Override // androidx.preference.Preference
    public void M(View view) {
        super.M(view);
        a0(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f23981E);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f23894J);
        }
    }

    public final void a0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            Z(view.findViewById(R.id.checkbox));
            Y(view.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23894J = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16134b, i10, i11);
        X(i.f(typedArrayObtainStyledAttributes, g.f16150h, g.f16137c));
        W(i.f(typedArrayObtainStyledAttributes, g.f16148g, g.f16140d));
        V(i.b(typedArrayObtainStyledAttributes, g.f16146f, g.f16143e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f16066a, R.attr.checkBoxPreferenceStyle));
    }
}
