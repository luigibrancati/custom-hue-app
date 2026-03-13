package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class m extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f24532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f24533e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends j {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.A
        public void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
            m mVar = m.this;
            int[] iArrC = mVar.c(mVar.f24540a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iW = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iW > 0) {
                aVar.d(i10, i11, iW, this.f24521j);
            }
        }

        @Override // androidx.recyclerview.widget.j
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.j
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    @Override // androidx.recyclerview.widget.q
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.l()) {
            iArr[0] = l(view, n(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.m()) {
            iArr[1] = l(view, p(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.q
    public RecyclerView.A d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new a(this.f24540a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.q
    public View g(RecyclerView.p pVar) {
        if (pVar.m()) {
            return m(pVar, p(pVar));
        }
        if (pVar.l()) {
            return m(pVar, n(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.q
    public int h(RecyclerView.p pVar, int i10, int i11) {
        l lVarO;
        int iZ = pVar.Z();
        if (iZ == 0 || (lVarO = o(pVar)) == null) {
            return -1;
        }
        int iK = pVar.K();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < iK; i14++) {
            View viewJ = pVar.J(i14);
            if (viewJ != null) {
                int iL = l(viewJ, lVarO);
                if (iL <= 0 && iL > i13) {
                    view2 = viewJ;
                    i13 = iL;
                }
                if (iL >= 0 && iL < i12) {
                    view = viewJ;
                    i12 = iL;
                }
            }
        }
        boolean zQ = q(pVar, i10, i11);
        if (zQ && view != null) {
            return pVar.i0(view);
        }
        if (!zQ && view2 != null) {
            return pVar.i0(view2);
        }
        if (zQ) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iI0 = pVar.i0(view) + (r(pVar) == zQ ? -1 : 1);
        if (iI0 < 0 || iI0 >= iZ) {
            return -1;
        }
        return iI0;
    }

    public final int l(View view, l lVar) {
        return (lVar.g(view) + (lVar.e(view) / 2)) - (lVar.m() + (lVar.n() / 2));
    }

    public final View m(RecyclerView.p pVar, l lVar) {
        int iK = pVar.K();
        View view = null;
        if (iK == 0) {
            return null;
        }
        int iM = lVar.m() + (lVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iK; i11++) {
            View viewJ = pVar.J(i11);
            int iAbs = Math.abs((lVar.g(viewJ) + (lVar.e(viewJ) / 2)) - iM);
            if (iAbs < i10) {
                view = viewJ;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final l n(RecyclerView.p pVar) {
        l lVar = this.f24533e;
        if (lVar == null || lVar.f24529a != pVar) {
            this.f24533e = l.a(pVar);
        }
        return this.f24533e;
    }

    public final l o(RecyclerView.p pVar) {
        if (pVar.m()) {
            return p(pVar);
        }
        if (pVar.l()) {
            return n(pVar);
        }
        return null;
    }

    public final l p(RecyclerView.p pVar) {
        l lVar = this.f24532d;
        if (lVar == null || lVar.f24529a != pVar) {
            this.f24532d = l.c(pVar);
        }
        return this.f24532d;
    }

    public final boolean q(RecyclerView.p pVar, int i10, int i11) {
        return pVar.l() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(RecyclerView.p pVar) {
        PointF pointFA;
        int iZ = pVar.Z();
        if (!(pVar instanceof RecyclerView.A.b) || (pointFA = ((RecyclerView.A.b) pVar).a(iZ - 1)) == null) {
            return false;
        }
        return pointFA.x < 0.0f || pointFA.y < 0.0f;
    }
}
