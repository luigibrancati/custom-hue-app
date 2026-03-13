package q7;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: q7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5503b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f43288a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f43289b = {R.attr.state_pressed};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f43290c = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f43291d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f43292e = {R.attr.state_hovered};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f43293f = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f43294g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f43295h = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f43296i = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f43297j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f43298k = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f43299l = AbstractC5503b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
