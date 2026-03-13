package x8;

import java.util.List;
import x8.F;

/* JADX INFO: renamed from: x8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6327f extends F.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47741b;

    /* JADX INFO: renamed from: x8.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f47742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47743b;

        @Override // x8.F.d.a
        public F.d a() {
            List list = this.f47742a;
            if (list != null) {
                return new C6327f(list, this.f47743b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // x8.F.d.a
        public F.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f47742a = list;
            return this;
        }

        @Override // x8.F.d.a
        public F.d.a c(String str) {
            this.f47743b = str;
            return this;
        }
    }

    @Override // x8.F.d
    public List b() {
        return this.f47740a;
    }

    @Override // x8.F.d
    public String c() {
        return this.f47741b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d) {
            F.d dVar = (F.d) obj;
            if (this.f47740a.equals(dVar.b()) && ((str = this.f47741b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f47740a.hashCode() ^ 1000003) * 1000003;
        String str = this.f47741b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f47740a + ", orgId=" + this.f47741b + "}";
    }

    public C6327f(List list, String str) {
        this.f47740a = list;
        this.f47741b = str;
    }
}
