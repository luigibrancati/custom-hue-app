package Z7;

import g8.C4160a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f20341d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f20346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C4160a f20347b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f20346a.equals(this.f20346a) && cVar.f20347b.equals(this.f20347b);
        }

        public int hashCode() {
            return Objects.hash(this.f20346a, this.f20347b);
        }

        public String toString() {
            return this.f20346a.getSimpleName() + ", object identifier: " + this.f20347b;
        }

        public c(Class cls, C4160a c4160a) {
            this.f20346a = cls;
            this.f20347b = c4160a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f20348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f20349b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f20348a.equals(this.f20348a) && dVar.f20349b.equals(this.f20349b);
        }

        public int hashCode() {
            return Objects.hash(this.f20348a, this.f20349b);
        }

        public String toString() {
            return this.f20348a.getSimpleName() + " with serialization type: " + this.f20349b.getSimpleName();
        }

        public d(Class cls, Class cls2) {
            this.f20348a = cls;
            this.f20349b = cls2;
        }
    }

    public boolean e(K k10) {
        return this.f20339b.containsKey(new c(k10.getClass(), k10.a()));
    }

    public boolean f(K k10) {
        return this.f20341d.containsKey(new c(k10.getClass(), k10.a()));
    }

    public P7.g g(K k10, P7.x xVar) throws GeneralSecurityException {
        c cVar = new c(k10.getClass(), k10.a());
        if (this.f20339b.containsKey(cVar)) {
            return ((AbstractC2597g) this.f20339b.get(cVar)).d(k10, xVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public P7.v h(K k10) throws GeneralSecurityException {
        c cVar = new c(k10.getClass(), k10.a());
        if (this.f20341d.containsKey(cVar)) {
            return ((z) this.f20341d.get(cVar)).d(k10);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    public K i(P7.g gVar, Class cls, P7.x xVar) throws GeneralSecurityException {
        d dVar = new d(gVar.getClass(), cls);
        if (this.f20338a.containsKey(dVar)) {
            return ((AbstractC2598h) this.f20338a.get(dVar)).d(gVar, xVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    public K j(P7.v vVar, Class cls) throws GeneralSecurityException {
        d dVar = new d(vVar.getClass(), cls);
        if (this.f20340c.containsKey(dVar)) {
            return ((A) this.f20340c.get(dVar)).d(vVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }

    public L(b bVar) {
        this.f20338a = new HashMap(bVar.f20342a);
        this.f20339b = new HashMap(bVar.f20343b);
        this.f20340c = new HashMap(bVar.f20344c);
        this.f20341d = new HashMap(bVar.f20345d);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f20342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f20343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f20344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f20345d;

        public b() {
            this.f20342a = new HashMap();
            this.f20343b = new HashMap();
            this.f20344c = new HashMap();
            this.f20345d = new HashMap();
        }

        public L e() {
            return new L(this);
        }

        public b f(AbstractC2597g abstractC2597g) throws GeneralSecurityException {
            c cVar = new c(abstractC2597g.c(), abstractC2597g.b());
            if (!this.f20343b.containsKey(cVar)) {
                this.f20343b.put(cVar, abstractC2597g);
                return this;
            }
            AbstractC2597g abstractC2597g2 = (AbstractC2597g) this.f20343b.get(cVar);
            if (abstractC2597g2.equals(abstractC2597g) && abstractC2597g.equals(abstractC2597g2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public b g(AbstractC2598h abstractC2598h) throws GeneralSecurityException {
            d dVar = new d(abstractC2598h.b(), abstractC2598h.c());
            if (!this.f20342a.containsKey(dVar)) {
                this.f20342a.put(dVar, abstractC2598h);
                return this;
            }
            AbstractC2598h abstractC2598h2 = (AbstractC2598h) this.f20342a.get(dVar);
            if (abstractC2598h2.equals(abstractC2598h) && abstractC2598h.equals(abstractC2598h2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b h(z zVar) throws GeneralSecurityException {
            c cVar = new c(zVar.c(), zVar.b());
            if (!this.f20345d.containsKey(cVar)) {
                this.f20345d.put(cVar, zVar);
                return this;
            }
            z zVar2 = (z) this.f20345d.get(cVar);
            if (zVar2.equals(zVar) && zVar.equals(zVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public b i(A a10) throws GeneralSecurityException {
            d dVar = new d(a10.b(), a10.c());
            if (!this.f20344c.containsKey(dVar)) {
                this.f20344c.put(dVar, a10);
                return this;
            }
            A a11 = (A) this.f20344c.get(dVar);
            if (a11.equals(a10) && a10.equals(a11)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(L l10) {
            this.f20342a = new HashMap(l10.f20338a);
            this.f20343b = new HashMap(l10.f20339b);
            this.f20344c = new HashMap(l10.f20340c);
            this.f20345d = new HashMap(l10.f20341d);
        }
    }
}
