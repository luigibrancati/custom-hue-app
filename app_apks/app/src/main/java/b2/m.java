package b2;

import G1.AbstractC0853a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends AbstractC2795e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25048j;

    public m(I1.f fVar, I1.j jVar, D1.o oVar, int i10, Object obj, long j10, long j11, long j12) {
        super(fVar, jVar, 1, oVar, i10, obj, j10, j11);
        AbstractC0853a.e(oVar);
        this.f25048j = j12;
    }

    public long f() {
        long j10 = this.f25048j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean g();
}
