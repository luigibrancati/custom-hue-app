package a6;

import a6.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f21045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.b f21046b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f21047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p.b f21048b;

        @Override // a6.p.a
        public p a() {
            return new f(this.f21047a, this.f21048b);
        }

        @Override // a6.p.a
        public p.a b(s sVar) {
            this.f21047a = sVar;
            return this;
        }

        @Override // a6.p.a
        public p.a c(p.b bVar) {
            this.f21048b = bVar;
            return this;
        }
    }

    @Override // a6.p
    public s b() {
        return this.f21045a;
    }

    @Override // a6.p
    public p.b c() {
        return this.f21046b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f21045a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f21046b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f21045a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f21046b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f21045a + ", productIdOrigin=" + this.f21046b + "}";
    }

    public f(s sVar, p.b bVar) {
        this.f21045a = sVar;
        this.f21046b = bVar;
    }
}
