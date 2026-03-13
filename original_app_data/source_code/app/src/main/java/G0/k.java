package G0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f4210h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f4213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f4214d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4217g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4211a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4212b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4215e = new ArrayList();

    public k(m mVar, int i10) {
        this.f4213c = null;
        this.f4214d = null;
        int i11 = f4210h;
        this.f4216f = i11;
        f4210h = i11 + 1;
        this.f4213c = mVar;
        this.f4214d = mVar;
        this.f4217g = i10;
    }

    public void a(m mVar) {
        this.f4215e.add(mVar);
        this.f4214d = mVar;
    }

    public long b(F0.f fVar, int i10) {
        m mVar = this.f4213c;
        if (mVar instanceof c) {
            if (((c) mVar).f4226f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(mVar instanceof j)) {
                return 0L;
            }
        } else if (!(mVar instanceof l)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f3490e : fVar.f3492f).f4228h;
        f fVar3 = (i10 == 0 ? fVar.f3490e : fVar.f3492f).f4229i;
        boolean zContains = mVar.f4228h.f4206l.contains(fVar2);
        boolean zContains2 = this.f4213c.f4229i.f4206l.contains(fVar3);
        long j10 = this.f4213c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(d(this.f4213c.f4228h, r12.f4200f), ((long) this.f4213c.f4228h.f4200f) + j10);
            }
            if (!zContains2) {
                m mVar2 = this.f4213c;
                return (((long) mVar2.f4228h.f4200f) + mVar2.j()) - ((long) this.f4213c.f4229i.f4200f);
            }
            return Math.max(-c(this.f4213c.f4229i, r12.f4200f), ((long) (-this.f4213c.f4229i.f4200f)) + j10);
        }
        long jD = d(this.f4213c.f4228h, 0L);
        long jC = c(this.f4213c.f4229i, 0L);
        long j11 = jD - j10;
        m mVar3 = this.f4213c;
        int i11 = mVar3.f4229i.f4200f;
        if (j11 >= (-i11)) {
            j11 += (long) i11;
        }
        int i12 = mVar3.f4228h.f4200f;
        long j12 = ((-jC) - j10) - ((long) i12);
        if (j12 >= i12) {
            j12 -= (long) i12;
        }
        float fM = mVar3.f4222b.m(i10);
        float f10 = fM > 0.0f ? (long) ((j12 / fM) + (j11 / (1.0f - fM))) : 0L;
        long j13 = ((long) ((f10 * fM) + 0.5f)) + j10 + ((long) ((f10 * (1.0f - fM)) + 0.5f));
        m mVar4 = this.f4213c;
        return (((long) mVar4.f4228h.f4200f) + j13) - ((long) mVar4.f4229i.f4200f);
    }

    public final long c(f fVar, long j10) {
        m mVar = fVar.f4198d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f4205k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f4205k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4198d != mVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f4200f) + j10));
                }
            }
        }
        if (fVar != mVar.f4229i) {
            return jMin;
        }
        long j11 = j10 - mVar.j();
        return Math.min(Math.min(jMin, c(mVar.f4228h, j11)), j11 - ((long) mVar.f4228h.f4200f));
    }

    public final long d(f fVar, long j10) {
        m mVar = fVar.f4198d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f4205k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f4205k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4198d != mVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f4200f) + j10));
                }
            }
        }
        if (fVar != mVar.f4228h) {
            return jMax;
        }
        long j11 = j10 + mVar.j();
        return Math.max(Math.max(jMax, d(mVar.f4229i, j11)), j11 - ((long) mVar.f4229i.f4200f));
    }
}
