package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f23981E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f23982F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f23983G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f23984H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f23985I;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public void H() {
        super.H();
        boolean z10 = !T();
        if (a(Boolean.valueOf(z10))) {
            U(z10);
        }
    }

    @Override // androidx.preference.Preference
    public Object J(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public boolean R() {
        return (this.f23985I ? this.f23981E : !this.f23981E) || super.R();
    }

    public boolean T() {
        return this.f23981E;
    }

    public void U(boolean z10) {
        boolean z11 = this.f23981E != z10;
        if (z11 || !this.f23984H) {
            this.f23981E = z10;
            this.f23984H = true;
            N(z10);
            if (z11) {
                G(R());
                F();
            }
        }
    }

    public void V(boolean z10) {
        this.f23985I = z10;
    }

    public void W(CharSequence charSequence) {
        this.f23983G = charSequence;
        if (T()) {
            return;
        }
        F();
    }

    public void X(CharSequence charSequence) {
        this.f23982F = charSequence;
        if (T()) {
            F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Y(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.f23981E
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r3.f23982F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r3.f23982F
            r4.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r3.f23981E
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.f23983G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.f23983G
            r4.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.z()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3e
            r4.setText(r3)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L4c
            r4.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.Y(android.view.View):void");
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
