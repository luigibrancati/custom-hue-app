package F2;

import G1.AbstractC0853a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends J1.g implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f3683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3684f;

    public void D(long j10, k kVar, long j11) {
        this.f5886b = j10;
        this.f3683e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f3684f = j10;
    }

    @Override // F2.k
    public int a(long j10) {
        return ((k) AbstractC0853a.e(this.f3683e)).a(j10 - this.f3684f);
    }

    @Override // F2.k
    public List b(long j10) {
        return ((k) AbstractC0853a.e(this.f3683e)).b(j10 - this.f3684f);
    }

    @Override // F2.k
    public long j(int i10) {
        return ((k) AbstractC0853a.e(this.f3683e)).j(i10) + this.f3684f;
    }

    @Override // F2.k
    public int p() {
        return ((k) AbstractC0853a.e(this.f3683e)).p();
    }

    @Override // J1.g, J1.a
    public void s() {
        super.s();
        this.f3683e = null;
    }
}
