package Db;

import Db.N;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2377a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2381e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f2385d;

        public final boolean a(b bVar) {
            return this.f2382a.equals(bVar.f2382a) && Objects.equals(this.f2383b, bVar.f2383b) && Objects.equals(this.f2384c, bVar.f2384c) && Objects.equals(this.f2385d, bVar.f2385d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2382a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2383b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2384c);
            return iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2385d);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SessionData{");
            sb2.append("dataId=");
            sb2.append(this.f2382a);
            if (this.f2383b != null) {
                sb2.append(", ");
                sb2.append("value=");
                sb2.append(this.f2383b);
            }
            if (this.f2384c != null) {
                sb2.append(", ");
                sb2.append("uri=");
                sb2.append(this.f2384c);
            }
            if (this.f2385d != null) {
                sb2.append(", ");
                sb2.append("language=");
                sb2.append(this.f2385d);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(O o10) {
            this.f2382a = o10.f2378b;
            this.f2383b = o10.f2379c;
            this.f2384c = o10.f2380d;
            this.f2385d = o10.f2381e;
        }
    }

    public O() {
        if (!(this instanceof N.a)) {
            throw new UnsupportedOperationException("Use: new SessionData.Builder()");
        }
    }

    public N e() {
        if (this.f2377a == 0) {
            return new b();
        }
        throw new IllegalStateException(g());
    }

    public N.a f(String str) {
        Objects.requireNonNull(str, "dataId");
        this.f2378b = str;
        this.f2377a &= -2;
        return (N.a) this;
    }

    public final String g() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2377a & 1) != 0) {
            arrayList.add("dataId");
        }
        return "Cannot build SessionData, some of required attributes are not set " + arrayList;
    }

    public N.a h(String str) {
        Objects.requireNonNull(str, "language");
        this.f2381e = str;
        return (N.a) this;
    }

    public N.a i(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2380d = str;
        return (N.a) this;
    }

    public N.a j(String str) {
        Objects.requireNonNull(str, "value");
        this.f2379c = str;
        return (N.a) this;
    }
}
