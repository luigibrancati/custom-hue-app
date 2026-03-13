package t7;

import Y0.E;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = P0.a.l(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                P0.a.i(drawable, colorStateList);
            } else {
                P0.a.i(drawable, ColorStateList.valueOf(colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                P0.a.j(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int[] b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = P0.a.l(drawable).mutate();
        P0.a.i(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zH = E.H(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = zH || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zH);
        checkableImageButton.setPressable(zH);
        checkableImageButton.setLongClickable(z10);
        E.n0(checkableImageButton, z11 ? 1 : 2);
    }

    public static void e(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        d(checkableImageButton, onLongClickListener);
    }

    public static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d(checkableImageButton, onLongClickListener);
    }
}
