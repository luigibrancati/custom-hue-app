package t3;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class G extends F {
    @Override // t3.C
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // t3.C
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // t3.C
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // t3.C
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // t3.C
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // t3.C
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
