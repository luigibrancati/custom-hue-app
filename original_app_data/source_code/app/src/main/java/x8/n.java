package x8;

import java.util.List;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends F.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.e.d.a.b.c f47835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.a f47836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.e.d.a.b.AbstractC0654d f47837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f47838e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.b.AbstractC0652b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f47839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public F.e.d.a.b.c f47840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public F.a f47841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public F.e.d.a.b.AbstractC0654d f47842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f47843e;

        @Override // x8.F.e.d.a.b.AbstractC0652b
        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.AbstractC0654d abstractC0654d = this.f47842d;
            if (abstractC0654d != null && (list = this.f47843e) != null) {
                return new n(this.f47839a, this.f47840b, this.f47841c, abstractC0654d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47842d == null) {
                sb2.append(" signal");
            }
            if (this.f47843e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.b.AbstractC0652b
        public F.e.d.a.b.AbstractC0652b b(F.a aVar) {
            this.f47841c = aVar;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0652b
        public F.e.d.a.b.AbstractC0652b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f47843e = list;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0652b
        public F.e.d.a.b.AbstractC0652b d(F.e.d.a.b.c cVar) {
            this.f47840b = cVar;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0652b
        public F.e.d.a.b.AbstractC0652b e(F.e.d.a.b.AbstractC0654d abstractC0654d) {
            if (abstractC0654d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f47842d = abstractC0654d;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0652b
        public F.e.d.a.b.AbstractC0652b f(List list) {
            this.f47839a = list;
            return this;
        }
    }

    @Override // x8.F.e.d.a.b
    public F.a b() {
        return this.f47836c;
    }

    @Override // x8.F.e.d.a.b
    public List c() {
        return this.f47838e;
    }

    @Override // x8.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f47835b;
    }

    @Override // x8.F.e.d.a.b
    public F.e.d.a.b.AbstractC0654d e() {
        return this.f47837d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b) {
            F.e.d.a.b bVar = (F.e.d.a.b) obj;
            List list = this.f47834a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                F.e.d.a.b.c cVar = this.f47835b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    F.a aVar = this.f47836c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f47837d.equals(bVar.e()) && this.f47838e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // x8.F.e.d.a.b
    public List f() {
        return this.f47834a;
    }

    public int hashCode() {
        List list = this.f47834a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f47835b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.f47836c;
        return this.f47838e.hashCode() ^ ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f47837d.hashCode()) * 1000003);
    }

    public String toString() {
        return "Execution{threads=" + this.f47834a + ", exception=" + this.f47835b + ", appExitInfo=" + this.f47836c + ", signal=" + this.f47837d + ", binaries=" + this.f47838e + "}";
    }

    public n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0654d abstractC0654d, List list2) {
        this.f47834a = list;
        this.f47835b = cVar;
        this.f47836c = aVar;
        this.f47837d = abstractC0654d;
        this.f47838e = list2;
    }
}
