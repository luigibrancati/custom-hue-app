package G2;

import F2.k;
import G1.AbstractC0853a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4458a;

    public f(List list) {
        this.f4458a = list;
    }

    @Override // F2.k
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // F2.k
    public List b(long j10) {
        return j10 >= 0 ? this.f4458a : Collections.EMPTY_LIST;
    }

    @Override // F2.k
    public long j(int i10) {
        AbstractC0853a.a(i10 == 0);
        return 0L;
    }

    @Override // F2.k
    public int p() {
        return 1;
    }
}
