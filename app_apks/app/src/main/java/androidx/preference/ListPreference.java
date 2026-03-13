package androidx.preference;

import N0.i;
import T2.c;
import T2.f;
import T2.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence[] f23909P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence[] f23910Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f23911R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f23912S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f23913T;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f23914a;

        public static a b() {
            if (f23914a == null) {
                f23914a = new a();
            }
            return f23914a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.V()) ? listPreference.j().getString(f.f16078a) : listPreference.V();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16182x, i10, i11);
        this.f23909P = i.h(typedArrayObtainStyledAttributes, g.f16079A, g.f16184y);
        this.f23910Q = i.h(typedArrayObtainStyledAttributes, g.f16081B, g.f16186z);
        int i12 = g.f16083C;
        if (i.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            Q(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f16095I, i10, i11);
        this.f23912S = i.f(typedArrayObtainStyledAttributes2, g.f16169q0, g.f16111Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public Object J(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public int T(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f23910Q) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f23910Q[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] U() {
        return this.f23909P;
    }

    public CharSequence V() {
        CharSequence[] charSequenceArr;
        int iY = Y();
        if (iY < 0 || (charSequenceArr = this.f23909P) == null) {
            return null;
        }
        return charSequenceArr[iY];
    }

    public CharSequence[] W() {
        return this.f23910Q;
    }

    public String X() {
        return this.f23911R;
    }

    public final int Y() {
        return T(this.f23911R);
    }

    public void Z(String str) {
        boolean zEquals = TextUtils.equals(this.f23911R, str);
        if (zEquals && this.f23913T) {
            return;
        }
        this.f23911R = str;
        this.f23913T = true;
        P(str);
        if (zEquals) {
            return;
        }
        F();
    }

    @Override // androidx.preference.Preference
    public CharSequence z() {
        if (A() != null) {
            return A().a(this);
        }
        CharSequence charSequenceV = V();
        CharSequence charSequenceZ = super.z();
        String str = this.f23912S;
        if (str != null) {
            if (charSequenceV == null) {
                charSequenceV = "";
            }
            String str2 = String.format(str, charSequenceV);
            if (!TextUtils.equals(str2, charSequenceZ)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceZ;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f16067b, R.attr.dialogPreferenceStyle));
    }
}
