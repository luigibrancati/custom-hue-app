package Y0;

import android.view.ViewGroup;

/* JADX INFO: renamed from: Y0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2557k {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginEnd(i10);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginStart(i10);
    }
}
