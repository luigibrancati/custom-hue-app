package h8;

/* JADX INFO: renamed from: h8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4283a extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36288c;

    public C4283a(long j10, long j11, long j12) {
        this.f36286a = j10;
        this.f36287b = j11;
        this.f36288c = j12;
    }

    @Override // h8.o
    public long b() {
        return this.f36287b;
    }

    @Override // h8.o
    public long c() {
        return this.f36286a;
    }

    @Override // h8.o
    public long d() {
        return this.f36288c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f36286a == oVar.c() && this.f36287b == oVar.b() && this.f36288c == oVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f36286a;
        long j11 = this.f36287b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f36288c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ i10;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f36286a + ", elapsedRealtime=" + this.f36287b + ", uptimeMillis=" + this.f36288c + "}";
    }
}
