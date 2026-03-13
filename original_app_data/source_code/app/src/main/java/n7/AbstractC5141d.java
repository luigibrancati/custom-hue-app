package n7;

import Y0.Q;
import Y0.T;
import android.R;
import android.content.Context;
import android.view.Window;
import i7.AbstractC4365a;

/* JADX INFO: renamed from: n7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5141d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = AbstractC4365a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        Q.b(window, !z10);
        int iC = c(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        boolean zD = d(iC, AbstractC4365a.f(num.intValue()));
        boolean zD2 = d(iB2, AbstractC4365a.f(num2.intValue()));
        T tA = Q.a(window, window.getDecorView());
        if (tA != null) {
            tA.b(zD);
            tA.a(zD2);
        }
    }

    public static int b(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return AbstractC4365a.b(context, R.attr.navigationBarColor, -16777216);
    }

    public static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return AbstractC4365a.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean d(int i10, boolean z10) {
        if (AbstractC4365a.f(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }
}
