package Rd;

/* JADX INFO: renamed from: Rd.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2143n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wd.E f15199a = new Wd.E("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Wd.E f15200b = new Wd.E("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
