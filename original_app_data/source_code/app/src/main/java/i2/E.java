package i2;

import G1.AbstractC0853a;
import i2.J;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class E implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.u f36854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.u f36855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36856c;

    public E(long[] jArr, long[] jArr2, long j10) {
        AbstractC0853a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f36854a = new G1.u(length);
            this.f36855b = new G1.u(length);
        } else {
            int i10 = length + 1;
            G1.u uVar = new G1.u(i10);
            this.f36854a = uVar;
            G1.u uVar2 = new G1.u(i10);
            this.f36855b = uVar2;
            uVar.a(0L);
            uVar2.a(0L);
        }
        this.f36854a.b(jArr);
        this.f36855b.b(jArr2);
        this.f36856c = j10;
    }

    public void a(long j10, long j11) {
        if (this.f36855b.d() == 0 && j10 > 0) {
            this.f36854a.a(0L);
            this.f36855b.a(0L);
        }
        this.f36854a.a(j11);
        this.f36855b.a(j10);
    }

    public long b(long j10) {
        if (this.f36855b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f36855b.c(G1.M.e(this.f36854a, j10, true, true));
    }

    public boolean c(long j10, long j11) {
        if (this.f36855b.d() == 0) {
            return false;
        }
        G1.u uVar = this.f36855b;
        return j10 - uVar.c(uVar.d() - 1) < j11;
    }

    @Override // i2.J
    public J.a e(long j10) {
        if (this.f36855b.d() == 0) {
            return new J.a(K.f36876c);
        }
        int iE = G1.M.e(this.f36855b, j10, true, true);
        K k10 = new K(this.f36855b.c(iE), this.f36854a.c(iE));
        if (k10.f36877a == j10 || iE == this.f36855b.d() - 1) {
            return new J.a(k10);
        }
        int i10 = iE + 1;
        return new J.a(k10, new K(this.f36855b.c(i10), this.f36854a.c(i10)));
    }

    public void f(long j10) {
        this.f36856c = j10;
    }

    @Override // i2.J
    public boolean h() {
        return this.f36855b.d() > 0;
    }

    @Override // i2.J
    public long m() {
        return this.f36856c;
    }
}
