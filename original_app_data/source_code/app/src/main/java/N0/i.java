package N0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static int a(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static boolean b(TypedArray typedArray, int i10, int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    public static Drawable c(TypedArray typedArray, int i10, int i11) {
        Drawable drawable = typedArray.getDrawable(i10);
        return drawable == null ? typedArray.getDrawable(i11) : drawable;
    }

    public static int d(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getInt(i10, typedArray.getInt(i11, i12));
    }

    public static int e(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getResourceId(i10, typedArray.getResourceId(i11, i12));
    }

    public static String f(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    public static CharSequence g(TypedArray typedArray, int i10, int i11) {
        CharSequence text = typedArray.getText(i10);
        return text == null ? typedArray.getText(i11) : text;
    }

    public static CharSequence[] h(TypedArray typedArray, int i10, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        return textArray == null ? typedArray.getTextArray(i11) : textArray;
    }
}
