package a6;

import a6.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21053a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f21054a;

        @Override // a6.r.a
        public r a() {
            return new h(this.f21054a);
        }

        @Override // a6.r.a
        public r.a b(Integer num) {
            this.f21054a = num;
            return this;
        }
    }

    @Override // a6.r
    public Integer b() {
        return this.f21053a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        Integer num = this.f21053a;
        return num == null ? rVar.b() == null : num.equals(rVar.b());
    }

    public int hashCode() {
        Integer num = this.f21053a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f21053a + "}";
    }

    public h(Integer num) {
        this.f21053a = num;
    }
}
