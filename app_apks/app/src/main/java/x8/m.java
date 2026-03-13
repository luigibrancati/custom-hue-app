package x8;

import java.util.List;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends F.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.e.d.a.b f47819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f47820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f47821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f47822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F.e.d.a.c f47823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f47824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47825g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.AbstractC0649a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public F.e.d.a.b f47826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f47827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f47828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f47829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public F.e.d.a.c f47830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f47831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f47832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f47833h;

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f47833h == 1 && (bVar = this.f47826a) != null) {
                return new m(bVar, this.f47827b, this.f47828c, this.f47829d, this.f47830e, this.f47831f, this.f47832g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47826a == null) {
                sb2.append(" execution");
            }
            if ((this.f47833h & 1) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a.AbstractC0649a b(List list) {
            this.f47831f = list;
            return this;
        }

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a.AbstractC0649a c(Boolean bool) {
            this.f47829d = bool;
            return this;
        }

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a.AbstractC0649a d(F.e.d.a.c cVar) {
            this.f47830e = cVar;
            return this;
        }

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a.AbstractC0649a e(List list) {
            this.f47827b = list;
            return this;
        }

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a.AbstractC0649a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f47826a = bVar;
            return this;
        }

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a.AbstractC0649a g(List list) {
            this.f47828c = list;
            return this;
        }

        @Override // x8.F.e.d.a.AbstractC0649a
        public F.e.d.a.AbstractC0649a h(int i10) {
            this.f47832g = i10;
            this.f47833h = (byte) (this.f47833h | 1);
            return this;
        }

        public b() {
        }

        public b(F.e.d.a aVar) {
            this.f47826a = aVar.f();
            this.f47827b = aVar.e();
            this.f47828c = aVar.g();
            this.f47829d = aVar.c();
            this.f47830e = aVar.d();
            this.f47831f = aVar.b();
            this.f47832g = aVar.h();
            this.f47833h = (byte) 1;
        }
    }

    @Override // x8.F.e.d.a
    public List b() {
        return this.f47824f;
    }

    @Override // x8.F.e.d.a
    public Boolean c() {
        return this.f47822d;
    }

    @Override // x8.F.e.d.a
    public F.e.d.a.c d() {
        return this.f47823e;
    }

    @Override // x8.F.e.d.a
    public List e() {
        return this.f47820b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a) {
            F.e.d.a aVar = (F.e.d.a) obj;
            if (this.f47819a.equals(aVar.f()) && ((list = this.f47820b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f47821c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f47822d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f47823e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f47824f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f47825g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.e.d.a
    public F.e.d.a.b f() {
        return this.f47819a;
    }

    @Override // x8.F.e.d.a
    public List g() {
        return this.f47821c;
    }

    @Override // x8.F.e.d.a
    public int h() {
        return this.f47825g;
    }

    public int hashCode() {
        int iHashCode = (this.f47819a.hashCode() ^ 1000003) * 1000003;
        List list = this.f47820b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f47821c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f47822d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.f47823e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f47824f;
        return this.f47825g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    @Override // x8.F.e.d.a
    public F.e.d.a.AbstractC0649a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f47819a + ", customAttributes=" + this.f47820b + ", internalKeys=" + this.f47821c + ", background=" + this.f47822d + ", currentProcessDetails=" + this.f47823e + ", appProcessDetails=" + this.f47824f + ", uiOrientation=" + this.f47825g + "}";
    }

    public m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i10) {
        this.f47819a = bVar;
        this.f47820b = list;
        this.f47821c = list2;
        this.f47822d = bool;
        this.f47823e = cVar;
        this.f47824f = list3;
        this.f47825g = i10;
    }
}
