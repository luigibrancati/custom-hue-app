package a2;

import D1.D;
import D1.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends AbstractC2636w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D1.r f20856f;

    public l0(D1.D d10, D1.r rVar) {
        super(d10);
        this.f20856f = rVar;
    }

    @Override // a2.AbstractC2636w, D1.D
    public D.c o(int i10, D.c cVar, long j10) {
        super.o(i10, cVar, j10);
        D1.r rVar = this.f20856f;
        cVar.f1475c = rVar;
        r.h hVar = rVar.f1873b;
        cVar.f1474b = hVar != null ? hVar.f1975h : null;
        return cVar;
    }
}
