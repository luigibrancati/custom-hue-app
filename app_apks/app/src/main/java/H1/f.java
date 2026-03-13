package H1;

import D1.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5131c;

    public f(long j10, long j11, long j12) {
        this.f5129a = j10;
        this.f5130b = j11;
        this.f5131c = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5129a == fVar.f5129a && this.f5130b == fVar.f5130b && this.f5131c == fVar.f5131c;
    }

    public int hashCode() {
        return ((((527 + N7.i.c(this.f5129a)) * 31) + N7.i.c(this.f5130b)) * 31) + N7.i.c(this.f5131c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f5129a + ", modification time=" + this.f5130b + ", timescale=" + this.f5131c;
    }
}
