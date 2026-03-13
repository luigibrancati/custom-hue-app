package c6;

import c6.g;

/* JADX INFO: renamed from: c6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3077b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a f25802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25803b;

    public C3077b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f25802a = aVar;
        this.f25803b = j10;
    }

    @Override // c6.g
    public long b() {
        return this.f25803b;
    }

    @Override // c6.g
    public g.a c() {
        return this.f25802a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f25802a.equals(gVar.c()) && this.f25803b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f25802a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f25803b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f25802a + ", nextRequestWaitMillis=" + this.f25803b + "}";
    }
}
