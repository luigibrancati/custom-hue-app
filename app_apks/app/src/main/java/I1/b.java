package I1;

import G1.AbstractC0853a;
import G1.M;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5417b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f5419d;

    public b(boolean z10) {
        this.f5416a = z10;
    }

    @Override // I1.f
    public final void h(x xVar) {
        AbstractC0853a.e(xVar);
        if (this.f5417b.contains(xVar)) {
            return;
        }
        this.f5417b.add(xVar);
        this.f5418c++;
    }

    public final void t(int i10) {
        j jVar = (j) M.i(this.f5419d);
        for (int i11 = 0; i11 < this.f5418c; i11++) {
            ((x) this.f5417b.get(i11)).b(this, jVar, this.f5416a, i10);
        }
    }

    public final void u() {
        j jVar = (j) M.i(this.f5419d);
        for (int i10 = 0; i10 < this.f5418c; i10++) {
            ((x) this.f5417b.get(i10)).d(this, jVar, this.f5416a);
        }
        this.f5419d = null;
    }

    public final void v(j jVar) {
        for (int i10 = 0; i10 < this.f5418c; i10++) {
            ((x) this.f5417b.get(i10)).g(this, jVar, this.f5416a);
        }
    }

    public final void w(j jVar) {
        this.f5419d = jVar;
        for (int i10 = 0; i10 < this.f5418c; i10++) {
            ((x) this.f5417b.get(i10)).i(this, jVar, this.f5416a);
        }
    }
}
