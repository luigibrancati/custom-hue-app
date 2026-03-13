package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24515e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24519i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24511a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24516f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24517g = 0;

    public boolean a(RecyclerView.B b10) {
        int i10 = this.f24513c;
        return i10 >= 0 && i10 < b10.b();
    }

    public View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f24513c);
        this.f24513c += this.f24514d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f24512b + ", mCurrentPosition=" + this.f24513c + ", mItemDirection=" + this.f24514d + ", mLayoutDirection=" + this.f24515e + ", mStartLine=" + this.f24516f + ", mEndLine=" + this.f24517g + '}';
    }
}
