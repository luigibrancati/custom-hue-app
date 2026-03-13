package x8;

import java.util.List;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends F.e.d.a.b.AbstractC0656e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f47873c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.b.AbstractC0656e.AbstractC0657a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f47876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f47877d;

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0657a
        public F.e.d.a.b.AbstractC0656e a() {
            String str;
            List list;
            if (this.f47877d == 1 && (str = this.f47874a) != null && (list = this.f47876c) != null) {
                return new r(str, this.f47875b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47874a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f47877d) == 0) {
                sb2.append(" importance");
            }
            if (this.f47876c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0657a
        public F.e.d.a.b.AbstractC0656e.AbstractC0657a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f47876c = list;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0657a
        public F.e.d.a.b.AbstractC0656e.AbstractC0657a c(int i10) {
            this.f47875b = i10;
            this.f47877d = (byte) (this.f47877d | 1);
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0657a
        public F.e.d.a.b.AbstractC0656e.AbstractC0657a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f47874a = str;
            return this;
        }
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e
    public List b() {
        return this.f47873c;
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e
    public int c() {
        return this.f47872b;
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e
    public String d() {
        return this.f47871a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0656e) {
            F.e.d.a.b.AbstractC0656e abstractC0656e = (F.e.d.a.b.AbstractC0656e) obj;
            if (this.f47871a.equals(abstractC0656e.d()) && this.f47872b == abstractC0656e.c() && this.f47873c.equals(abstractC0656e.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f47873c.hashCode() ^ ((((this.f47871a.hashCode() ^ 1000003) * 1000003) ^ this.f47872b) * 1000003);
    }

    public String toString() {
        return "Thread{name=" + this.f47871a + ", importance=" + this.f47872b + ", frames=" + this.f47873c + "}";
    }

    public r(String str, int i10, List list) {
        this.f47871a = str;
        this.f47872b = i10;
        this.f47873c = list;
    }
}
