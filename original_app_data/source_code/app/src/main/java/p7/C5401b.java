package p7;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: p7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5401b {
    public static TypedValue a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i10, boolean z10) {
        TypedValue typedValueA = a(context, i10);
        return (typedValueA == null || typedValueA.type != 18) ? z10 : typedValueA.data != 0;
    }

    public static int c(Context context, int i10, String str) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null) {
            return typedValueA.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static int d(View view, int i10) {
        return c(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
