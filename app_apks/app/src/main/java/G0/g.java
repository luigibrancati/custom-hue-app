package G0;

import G0.f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4207m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f4199e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f4199e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // G0.f
    public void d(int i10) {
        if (this.f4204j) {
            return;
        }
        this.f4204j = true;
        this.f4201g = i10;
        for (d dVar : this.f4205k) {
            dVar.a(dVar);
        }
    }
}
