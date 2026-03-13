package R8;

import R8.f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f14927c;

    /* JADX INFO: renamed from: R8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0180b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f14930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f14931d;

        @Override // R8.f.a
        public f a() {
            if (this.f14931d == 1) {
                return new b(this.f14928a, this.f14929b, this.f14930c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // R8.f.a
        public f.a b(f.b bVar) {
            this.f14930c = bVar;
            return this;
        }

        @Override // R8.f.a
        public f.a c(String str) {
            this.f14928a = str;
            return this;
        }

        @Override // R8.f.a
        public f.a d(long j10) {
            this.f14929b = j10;
            this.f14931d = (byte) (this.f14931d | 1);
            return this;
        }
    }

    @Override // R8.f
    public f.b b() {
        return this.f14927c;
    }

    @Override // R8.f
    public String c() {
        return this.f14925a;
    }

    @Override // R8.f
    public long d() {
        return this.f14926b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f14925a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f14926b == fVar.d() && ((bVar = this.f14927c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f14925a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f14926b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f14927c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f14925a + ", tokenExpirationTimestamp=" + this.f14926b + ", responseCode=" + this.f14927c + "}";
    }

    public b(String str, long j10, f.b bVar) {
        this.f14925a = str;
        this.f14926b = j10;
        this.f14927c = bVar;
    }
}
