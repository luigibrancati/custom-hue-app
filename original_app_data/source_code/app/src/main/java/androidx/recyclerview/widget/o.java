package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static int a(RecyclerView.B b10, l lVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.K() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.i0(view) - pVar.i0(view2)) + 1;
        }
        return Math.min(lVar.n(), lVar.d(view2) - lVar.g(view));
    }

    public static int b(RecyclerView.B b10, l lVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        if (pVar.K() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (b10.b() - Math.max(pVar.i0(view), pVar.i0(view2))) - 1) : Math.max(0, Math.min(pVar.i0(view), pVar.i0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(lVar.d(view2) - lVar.g(view)) / (Math.abs(pVar.i0(view) - pVar.i0(view2)) + 1))) + (lVar.m() - lVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.B b10, l lVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.K() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b10.b();
        }
        return (int) (((lVar.d(view2) - lVar.g(view)) / (Math.abs(pVar.i0(view) - pVar.i0(view2)) + 1)) * b10.b());
    }
}
