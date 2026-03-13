package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.h f24323a;

    public b(RecyclerView.h hVar) {
        this.f24323a = hVar;
    }

    @Override // a3.d
    public void a(int i10, int i11) {
        this.f24323a.notifyItemRangeInserted(i10, i11);
    }

    @Override // a3.d
    public void b(int i10, int i11) {
        this.f24323a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // a3.d
    public void c(int i10, int i11, Object obj) {
        this.f24323a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // a3.d
    public void d(int i10, int i11) {
        this.f24323a.notifyItemMoved(i10, i11);
    }
}
