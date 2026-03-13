package x8;

import java.util.List;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends F.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f47855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.e.d.a.b.c f47856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47857e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.b.c.AbstractC0653a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f47860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public F.e.d.a.b.c f47861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f47863f;

        @Override // x8.F.e.d.a.b.c.AbstractC0653a
        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f47863f == 1 && (str = this.f47858a) != null && (list = this.f47860c) != null) {
                return new p(str, this.f47859b, list, this.f47861d, this.f47862e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47858a == null) {
                sb2.append(" type");
            }
            if (this.f47860c == null) {
                sb2.append(" frames");
            }
            if ((this.f47863f & 1) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.b.c.AbstractC0653a
        public F.e.d.a.b.c.AbstractC0653a b(F.e.d.a.b.c cVar) {
            this.f47861d = cVar;
            return this;
        }

        @Override // x8.F.e.d.a.b.c.AbstractC0653a
        public F.e.d.a.b.c.AbstractC0653a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f47860c = list;
            return this;
        }

        @Override // x8.F.e.d.a.b.c.AbstractC0653a
        public F.e.d.a.b.c.AbstractC0653a d(int i10) {
            this.f47862e = i10;
            this.f47863f = (byte) (this.f47863f | 1);
            return this;
        }

        @Override // x8.F.e.d.a.b.c.AbstractC0653a
        public F.e.d.a.b.c.AbstractC0653a e(String str) {
            this.f47859b = str;
            return this;
        }

        @Override // x8.F.e.d.a.b.c.AbstractC0653a
        public F.e.d.a.b.c.AbstractC0653a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f47858a = str;
            return this;
        }
    }

    @Override // x8.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f47856d;
    }

    @Override // x8.F.e.d.a.b.c
    public List c() {
        return this.f47855c;
    }

    @Override // x8.F.e.d.a.b.c
    public int d() {
        return this.f47857e;
    }

    @Override // x8.F.e.d.a.b.c
    public String e() {
        return this.f47854b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.c) {
            F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
            if (this.f47853a.equals(cVar2.f()) && ((str = this.f47854b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f47855c.equals(cVar2.c()) && ((cVar = this.f47856d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f47857e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.e.d.a.b.c
    public String f() {
        return this.f47853a;
    }

    public int hashCode() {
        int iHashCode = (this.f47853a.hashCode() ^ 1000003) * 1000003;
        String str = this.f47854b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f47855c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f47856d;
        return this.f47857e ^ ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003);
    }

    public String toString() {
        return "Exception{type=" + this.f47853a + ", reason=" + this.f47854b + ", frames=" + this.f47855c + ", causedBy=" + this.f47856d + ", overflowCount=" + this.f47857e + "}";
    }

    public p(String str, String str2, List list, F.e.d.a.b.c cVar, int i10) {
        this.f47853a = str;
        this.f47854b = str2;
        this.f47855c = list;
        this.f47856d = cVar;
        this.f47857e = i10;
    }
}
