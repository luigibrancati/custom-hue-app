package androidx.preference;

import N0.i;
import T2.c;
import T2.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f23896E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f23897F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f23898G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f23899H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f23900I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f23901J;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16152i, i10, i11);
        String strF = i.f(typedArrayObtainStyledAttributes, g.f16172s, g.f16154j);
        this.f23896E = strF;
        if (strF == null) {
            this.f23896E = B();
        }
        this.f23897F = i.f(typedArrayObtainStyledAttributes, g.f16170r, g.f16156k);
        this.f23898G = i.c(typedArrayObtainStyledAttributes, g.f16166p, g.f16158l);
        this.f23899H = i.f(typedArrayObtainStyledAttributes, g.f16176u, g.f16160m);
        this.f23900I = i.f(typedArrayObtainStyledAttributes, g.f16174t, g.f16162n);
        this.f23901J = i.e(typedArrayObtainStyledAttributes, g.f16168q, g.f16164o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void H() {
        y();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f16067b, R.attr.dialogPreferenceStyle));
    }
}
