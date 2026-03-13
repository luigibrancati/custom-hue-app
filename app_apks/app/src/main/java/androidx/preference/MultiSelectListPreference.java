package androidx.preference;

import N0.i;
import T2.c;
import T2.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence[] f23915P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence[] f23916Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Set f23917R;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23917R = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16085D, i10, i11);
        this.f23915P = i.h(typedArrayObtainStyledAttributes, g.f16091G, g.f16087E);
        this.f23916Q = i.h(typedArrayObtainStyledAttributes, g.f16093H, g.f16089F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object J(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f16067b, R.attr.dialogPreferenceStyle));
    }
}
