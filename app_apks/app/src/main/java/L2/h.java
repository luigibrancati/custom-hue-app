package L2;

import F2.k;
import G1.M;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f8544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f8546e;

    public h(c cVar, Map map, Map map2, Map map3) {
        this.f8542a = cVar;
        this.f8545d = map2;
        this.f8546e = map3;
        this.f8544c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f8543b = cVar.j();
    }

    @Override // F2.k
    public int a(long j10) {
        int iD = M.d(this.f8543b, j10, false, false);
        if (iD < this.f8543b.length) {
            return iD;
        }
        return -1;
    }

    @Override // F2.k
    public List b(long j10) {
        return this.f8542a.h(j10, this.f8544c, this.f8545d, this.f8546e);
    }

    @Override // F2.k
    public long j(int i10) {
        return this.f8543b[i10];
    }

    @Override // F2.k
    public int p() {
        return this.f8543b.length;
    }
}
