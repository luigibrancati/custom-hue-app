package i7;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p7.C5401b;

/* JADX INFO: renamed from: i7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4365a {
    public static int a(int i10, int i11) {
        return O0.a.j(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static int b(Context context, int i10, int i11) {
        TypedValue typedValueA = C5401b.a(context, i10);
        return typedValueA != null ? typedValueA.data : i11;
    }

    public static int c(Context context, int i10, String str) {
        return C5401b.c(context, i10, str);
    }

    public static int d(View view, int i10) {
        return C5401b.d(view, i10);
    }

    public static int e(View view, int i10, int i11) {
        return b(view.getContext(), i10, i11);
    }

    public static boolean f(int i10) {
        return i10 != 0 && O0.a.c(i10) > 0.5d;
    }

    public static int g(int i10, int i11) {
        return O0.a.f(i11, i10);
    }

    public static int h(int i10, int i11, float f10) {
        return g(i10, O0.a.j(i11, Math.round(Color.alpha(i11) * f10)));
    }

    public static int i(View view, int i10, int i11, float f10) {
        return h(d(view, i10), d(view, i11), f10);
    }
}
