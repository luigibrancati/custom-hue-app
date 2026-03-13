package p;

import N0.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import j.AbstractC4666a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f41891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f41892c;

    public W(Context context, TypedArray typedArray) {
        this.f41890a = context;
        this.f41891b = typedArray;
    }

    public static W t(Context context, int i10, int[] iArr) {
        return new W(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static W u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new W(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static W v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new W(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f41891b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f41891b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f41891b.hasValue(i10) || (resourceId = this.f41891b.getResourceId(i10, 0)) == 0 || (colorStateListA = AbstractC4666a.a(this.f41890a, resourceId)) == null) ? this.f41891b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f41891b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f41891b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f41891b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f41891b.hasValue(i10) || (resourceId = this.f41891b.getResourceId(i10, 0)) == 0) ? this.f41891b.getDrawable(i10) : AbstractC4666a.b(this.f41890a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f41891b.hasValue(i10) || (resourceId = this.f41891b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C5348j.b().d(this.f41890a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f41891b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, f.e eVar) {
        int resourceId = this.f41891b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f41892c == null) {
            this.f41892c = new TypedValue();
        }
        return N0.f.h(this.f41890a, resourceId, this.f41892c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f41891b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f41891b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f41891b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f41891b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f41891b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f41891b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f41891b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f41891b;
    }

    public boolean s(int i10) {
        return this.f41891b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f41891b.peekValue(i10);
    }

    public void x() {
        this.f41891b.recycle();
    }
}
