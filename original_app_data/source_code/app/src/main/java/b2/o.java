package b2;

import i2.C4330j;
import i2.O;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC2791a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f25050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final D1.o f25051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f25052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25053r;

    public o(I1.f fVar, I1.j jVar, D1.o oVar, int i10, Object obj, long j10, long j11, long j12, int i11, D1.o oVar2) {
        super(fVar, jVar, oVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f25050o = i11;
        this.f25051p = oVar2;
    }

    @Override // b2.m
    public boolean g() {
        return this.f25053r;
    }

    @Override // e2.m.e
    public void load() {
        C2793c c2793cI = i();
        c2793cI.b(0L);
        O oF = c2793cI.f(0, this.f25050o);
        oF.e(this.f25051p);
        try {
            long jF = this.f25002i.f(this.f24995b.e(this.f25052q));
            if (jF != -1) {
                jF += this.f25052q;
            }
            C4330j c4330j = new C4330j(this.f25002i, this.f25052q, jF);
            for (int iA = 0; iA != -1; iA = oF.a(c4330j, Integer.MAX_VALUE, true)) {
                this.f25052q += (long) iA;
            }
            oF.d(this.f25000g, 1, (int) this.f25052q, 0, null);
            I1.i.a(this.f25002i);
            this.f25053r = true;
        } catch (Throwable th) {
            I1.i.a(this.f25002i);
            throw th;
        }
    }

    @Override // e2.m.e
    public void b() {
    }
}
