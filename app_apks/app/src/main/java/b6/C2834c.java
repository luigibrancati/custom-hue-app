package b6;

import b6.AbstractC2846o;

/* JADX INFO: renamed from: b6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2834c extends AbstractC2846o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2847p f25328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y5.d f25330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y5.h f25331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y5.c f25332e;

    /* JADX INFO: renamed from: b6.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC2846o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC2847p f25333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f25334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Y5.d f25335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Y5.h f25336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Y5.c f25337e;

        @Override // b6.AbstractC2846o.a
        public AbstractC2846o a() {
            String str = "";
            if (this.f25333a == null) {
                str = " transportContext";
            }
            if (this.f25334b == null) {
                str = str + " transportName";
            }
            if (this.f25335c == null) {
                str = str + " event";
            }
            if (this.f25336d == null) {
                str = str + " transformer";
            }
            if (this.f25337e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2834c(this.f25333a, this.f25334b, this.f25335c, this.f25336d, this.f25337e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b6.AbstractC2846o.a
        public AbstractC2846o.a b(Y5.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f25337e = cVar;
            return this;
        }

        @Override // b6.AbstractC2846o.a
        public AbstractC2846o.a c(Y5.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f25335c = dVar;
            return this;
        }

        @Override // b6.AbstractC2846o.a
        public AbstractC2846o.a d(Y5.h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f25336d = hVar;
            return this;
        }

        @Override // b6.AbstractC2846o.a
        public AbstractC2846o.a e(AbstractC2847p abstractC2847p) {
            if (abstractC2847p == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f25333a = abstractC2847p;
            return this;
        }

        @Override // b6.AbstractC2846o.a
        public AbstractC2846o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f25334b = str;
            return this;
        }
    }

    @Override // b6.AbstractC2846o
    public Y5.c b() {
        return this.f25332e;
    }

    @Override // b6.AbstractC2846o
    public Y5.d c() {
        return this.f25330c;
    }

    @Override // b6.AbstractC2846o
    public Y5.h e() {
        return this.f25331d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2846o) {
            AbstractC2846o abstractC2846o = (AbstractC2846o) obj;
            if (this.f25328a.equals(abstractC2846o.f()) && this.f25329b.equals(abstractC2846o.g()) && this.f25330c.equals(abstractC2846o.c()) && this.f25331d.equals(abstractC2846o.e()) && this.f25332e.equals(abstractC2846o.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // b6.AbstractC2846o
    public AbstractC2847p f() {
        return this.f25328a;
    }

    @Override // b6.AbstractC2846o
    public String g() {
        return this.f25329b;
    }

    public int hashCode() {
        return this.f25332e.hashCode() ^ ((((((((this.f25328a.hashCode() ^ 1000003) * 1000003) ^ this.f25329b.hashCode()) * 1000003) ^ this.f25330c.hashCode()) * 1000003) ^ this.f25331d.hashCode()) * 1000003);
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f25328a + ", transportName=" + this.f25329b + ", event=" + this.f25330c + ", transformer=" + this.f25331d + ", encoding=" + this.f25332e + "}";
    }

    public C2834c(AbstractC2847p abstractC2847p, String str, Y5.d dVar, Y5.h hVar, Y5.c cVar) {
        this.f25328a = abstractC2847p;
        this.f25329b = str;
        this.f25330c = dVar;
        this.f25331d = hVar;
        this.f25332e = cVar;
    }
}
