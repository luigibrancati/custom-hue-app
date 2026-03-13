package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f41871a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f41872b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f41873c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f41874d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f41875e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f41876f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f41877g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f41878h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f41879i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f41880j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.j.f36167y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(h.j.f35955D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f41872b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f41880j;
        iArr[0] = i10;
        W wU = W.u(context, null, iArr);
        try {
            return wU.b(0, 0);
        } finally {
            wU.x();
        }
    }

    public static int d(Context context, int i10, float f10) {
        return O0.a.j(c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f41880j;
        iArr[0] = i10;
        W wU = W.u(context, null, iArr);
        try {
            return wU.c(0);
        } finally {
            wU.x();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f41871a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
