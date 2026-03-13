package ye;

/* JADX INFO: renamed from: ye.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6480a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f48662c;

    public C6480a(int i10) {
        this.f48660a = i10;
    }

    public static /* synthetic */ void c(C6480a c6480a, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        c6480a.b(j10, j11);
    }

    public final synchronized long a() {
        return this.f48661b - this.f48662c;
    }

    public final synchronized void b(long j10, long j11) {
        try {
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j12 = this.f48661b + j10;
            this.f48661b = j12;
            long j13 = this.f48662c + j11;
            this.f48662c = j13;
            if (j13 > j12) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f48660a + ", total=" + this.f48661b + ", acknowledged=" + this.f48662c + ", unacknowledged=" + a() + ')';
    }
}
