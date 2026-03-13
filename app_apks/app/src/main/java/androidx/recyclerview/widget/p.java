package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24539g = true;

    public abstract boolean A(RecyclerView.E e10);

    public final void B(RecyclerView.E e10) {
        J(e10);
        h(e10);
    }

    public final void C(RecyclerView.E e10) {
        K(e10);
    }

    public final void D(RecyclerView.E e10, boolean z10) {
        L(e10, z10);
        h(e10);
    }

    public final void E(RecyclerView.E e10, boolean z10) {
        M(e10, z10);
    }

    public final void F(RecyclerView.E e10) {
        N(e10);
        h(e10);
    }

    public final void G(RecyclerView.E e10) {
        O(e10);
    }

    public final void H(RecyclerView.E e10) {
        P(e10);
        h(e10);
    }

    public final void I(RecyclerView.E e10) {
        Q(e10);
    }

    public void R(boolean z10) {
        this.f24539g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.E e10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f24205a) == (i11 = cVar2.f24205a) && cVar.f24206b == cVar2.f24206b)) ? x(e10) : z(e10, i10, cVar.f24206b, i11, cVar2.f24206b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.E e10, RecyclerView.E e11, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f24205a;
        int i13 = cVar.f24206b;
        if (e11.shouldIgnore()) {
            int i14 = cVar.f24205a;
            i11 = cVar.f24206b;
            i10 = i14;
        } else {
            i10 = cVar2.f24205a;
            i11 = cVar2.f24206b;
        }
        return y(e10, e11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.E e10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f24205a;
        int i11 = cVar.f24206b;
        View view = e10.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f24205a;
        int top = cVar2 == null ? view.getTop() : cVar2.f24206b;
        if (e10.isRemoved() || (i10 == left && i11 == top)) {
            return A(e10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(e10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.E e10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f24205a;
        int i11 = cVar2.f24205a;
        if (i10 != i11 || cVar.f24206b != cVar2.f24206b) {
            return z(e10, i10, cVar.f24206b, i11, cVar2.f24206b);
        }
        F(e10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.E e10) {
        return !this.f24539g || e10.isInvalid();
    }

    public abstract boolean x(RecyclerView.E e10);

    public abstract boolean y(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.E e10, int i10, int i11, int i12, int i13);

    public void J(RecyclerView.E e10) {
    }

    public void K(RecyclerView.E e10) {
    }

    public void N(RecyclerView.E e10) {
    }

    public void O(RecyclerView.E e10) {
    }

    public void P(RecyclerView.E e10) {
    }

    public void Q(RecyclerView.E e10) {
    }

    public void L(RecyclerView.E e10, boolean z10) {
    }

    public void M(RecyclerView.E e10, boolean z10) {
    }
}
