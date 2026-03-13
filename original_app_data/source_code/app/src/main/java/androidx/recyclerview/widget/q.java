package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends RecyclerView.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f24540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scroller f24541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.u f24542c = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24543a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f24543a) {
                this.f24543a = false;
                q.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f24543a = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends j {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.A
        public void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
            q qVar = q.this;
            RecyclerView recyclerView = qVar.f24540a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrC = qVar.c(recyclerView.getLayoutManager(), view);
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
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f24540a.getLayoutManager();
        if (layoutManager == null || this.f24540a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f24540a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && j(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f24540a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f24540a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f24541b = new Scroller(this.f24540a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    public RecyclerView.A d(RecyclerView.p pVar) {
        return e(pVar);
    }

    public j e(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new b(this.f24540a.getContext());
        }
        return null;
    }

    public final void f() {
        this.f24540a.c1(this.f24542c);
        this.f24540a.setOnFlingListener(null);
    }

    public abstract View g(RecyclerView.p pVar);

    public abstract int h(RecyclerView.p pVar, int i10, int i11);

    public final void i() {
        if (this.f24540a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f24540a.l(this.f24542c);
        this.f24540a.setOnFlingListener(this);
    }

    public final boolean j(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.A aD;
        int iH;
        if (!(pVar instanceof RecyclerView.A.b) || (aD = d(pVar)) == null || (iH = h(pVar, i10, i11)) == -1) {
            return false;
        }
        aD.p(iH);
        pVar.K1(aD);
        return true;
    }

    public void k() {
        RecyclerView.p layoutManager;
        View viewG;
        RecyclerView recyclerView = this.f24540a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewG);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f24540a.p1(i10, iArrC[1]);
    }
}
