package a6;

import a6.o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.b f21041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2643a f21042b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.b f21043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC2643a f21044b;

        @Override // a6.o.a
        public o a() {
            return new e(this.f21043a, this.f21044b);
        }

        @Override // a6.o.a
        public o.a b(AbstractC2643a abstractC2643a) {
            this.f21044b = abstractC2643a;
            return this;
        }

        @Override // a6.o.a
        public o.a c(o.b bVar) {
            this.f21043a = bVar;
            return this;
        }
    }

    @Override // a6.o
    public AbstractC2643a b() {
        return this.f21042b;
    }

    @Override // a6.o
    public o.b c() {
        return this.f21041a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f21041a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                AbstractC2643a abstractC2643a = this.f21042b;
                if (abstractC2643a != null ? abstractC2643a.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f21041a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2643a abstractC2643a = this.f21042b;
        return iHashCode ^ (abstractC2643a != null ? abstractC2643a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f21041a + ", androidClientInfo=" + this.f21042b + "}";
    }

    public e(o.b bVar, AbstractC2643a abstractC2643a) {
        this.f21041a = bVar;
        this.f21042b = abstractC2643a;
    }
}
