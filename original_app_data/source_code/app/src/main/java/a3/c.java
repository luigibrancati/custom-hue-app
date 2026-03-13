package a3;

import Y0.E;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20937a = new c();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float fS = E.s(childAt);
                if (fS > f10) {
                    f10 = fS;
                }
            }
        }
        return f10;
    }

    @Override // a3.b
    public void a(View view) {
        Object tag = view.getTag(Z2.c.f20211a);
        if (tag instanceof Float) {
            E.m0(view, ((Float) tag).floatValue());
        }
        view.setTag(Z2.c.f20211a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // a3.b
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10 && view.getTag(Z2.c.f20211a) == null) {
            Float fValueOf = Float.valueOf(E.s(view));
            E.m0(view, e(recyclerView, view) + 1.0f);
            view.setTag(Z2.c.f20211a, fValueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // a3.b
    public void b(View view) {
    }

    @Override // a3.b
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }
}
