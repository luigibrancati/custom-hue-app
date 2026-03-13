package x8;

import x8.G;

/* JADX INFO: renamed from: x8.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6319B extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G.a f47517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G.c f47518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G.b f47519c;

    public C6319B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f47517a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f47518b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f47519c = bVar;
    }

    @Override // x8.G
    public G.a a() {
        return this.f47517a;
    }

    @Override // x8.G
    public G.b c() {
        return this.f47519c;
    }

    @Override // x8.G
    public G.c d() {
        return this.f47518b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            G g10 = (G) obj;
            if (this.f47517a.equals(g10.a()) && this.f47518b.equals(g10.d()) && this.f47519c.equals(g10.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f47519c.hashCode() ^ ((((this.f47517a.hashCode() ^ 1000003) * 1000003) ^ this.f47518b.hashCode()) * 1000003);
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f47517a + ", osData=" + this.f47518b + ", deviceData=" + this.f47519c + "}";
    }
}
