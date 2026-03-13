package a6;

import a6.s;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21055a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f21056a;

        @Override // a6.s.a
        public s a() {
            return new i(this.f21056a);
        }

        @Override // a6.s.a
        public s.a b(r rVar) {
            this.f21056a = rVar;
            return this;
        }
    }

    @Override // a6.s
    public r b() {
        return this.f21055a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        r rVar = this.f21055a;
        return rVar == null ? sVar.b() == null : rVar.equals(sVar.b());
    }

    public int hashCode() {
        r rVar = this.f21055a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f21055a + "}";
    }

    public i(r rVar) {
        this.f21055a = rVar;
    }
}
