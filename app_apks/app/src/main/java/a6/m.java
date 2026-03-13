package a6;

import a6.w;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.c f21090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.b f21091b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w.c f21092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w.b f21093b;

        @Override // a6.w.a
        public w a() {
            return new m(this.f21092a, this.f21093b);
        }

        @Override // a6.w.a
        public w.a b(w.b bVar) {
            this.f21093b = bVar;
            return this;
        }

        @Override // a6.w.a
        public w.a c(w.c cVar) {
            this.f21092a = cVar;
            return this;
        }
    }

    @Override // a6.w
    public w.b b() {
        return this.f21091b;
    }

    @Override // a6.w
    public w.c c() {
        return this.f21090a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f21090a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f21091b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f21090a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f21091b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21090a + ", mobileSubtype=" + this.f21091b + "}";
    }

    public m(w.c cVar, w.b bVar) {
        this.f21090a = cVar;
        this.f21091b = bVar;
    }
}
