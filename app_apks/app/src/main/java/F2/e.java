package F2;

import K7.AbstractC1081v;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1081v f3659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3662d;

    public e(List list, long j10, long j11) {
        this.f3659a = AbstractC1081v.v(list);
        this.f3660b = j10;
        this.f3661c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f3662d = j12;
    }
}
