package N1;

import D1.o;
import G1.M;
import K1.C0;
import a2.c0;
import t2.C5830c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f9567a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f9569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public O1.f f9571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9573g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5830c f9568b = new C5830c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9574h = -9223372036854775807L;

    public j(O1.f fVar, o oVar, boolean z10) {
        this.f9567a = oVar;
        this.f9571e = fVar;
        this.f9569c = fVar.f10798b;
        d(fVar, z10);
    }

    public String b() {
        return this.f9571e.a();
    }

    public void c(long j10) {
        int iD = M.d(this.f9569c, j10, true, false);
        this.f9573g = iD;
        if (!this.f9570d || iD != this.f9569c.length) {
            j10 = -9223372036854775807L;
        }
        this.f9574h = j10;
    }

    public void d(O1.f fVar, boolean z10) {
        int i10 = this.f9573g;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f9569c[i10 - 1];
        this.f9570d = z10;
        this.f9571e = fVar;
        long[] jArr = fVar.f10798b;
        this.f9569c = jArr;
        long j11 = this.f9574h;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f9573g = M.d(jArr, j10, false, false);
        }
    }

    @Override // a2.c0
    public int f(C0 c02, J1.f fVar, int i10) {
        int i11 = this.f9573g;
        boolean z10 = i11 == this.f9569c.length;
        if (z10 && !this.f9570d) {
            fVar.B(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f9572f) {
            c02.f6835b = this.f9567a;
            this.f9572f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f9573g = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f9568b.a(this.f9571e.f10797a[i11]);
            fVar.D(bArrA.length);
            fVar.f5878d.put(bArrA);
        }
        fVar.f5880f = this.f9569c[i11];
        fVar.B(1);
        return -4;
    }

    @Override // a2.c0
    public boolean isReady() {
        return true;
    }

    @Override // a2.c0
    public int n(long j10) {
        int iMax = Math.max(this.f9573g, M.d(this.f9569c, j10, true, false));
        int i10 = iMax - this.f9573g;
        this.f9573g = iMax;
        return i10;
    }

    @Override // a2.c0
    public void a() {
    }
}
