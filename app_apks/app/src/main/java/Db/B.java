package Db;

import Db.A;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2329a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f2330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f2332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f2333e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C f2334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f2336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f2337d;

        public final boolean a(b bVar) {
            return this.f2334a.equals(bVar.f2334a) && this.f2335b.equals(bVar.f2335b) && Objects.equals(this.f2336c, bVar.f2336c) && Objects.equals(this.f2337d, bVar.f2337d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2334a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + this.f2335b.hashCode();
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2336c);
            return iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2337d);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PreloadHint{");
            sb2.append("type=");
            sb2.append(this.f2334a);
            sb2.append(", ");
            sb2.append("uri=");
            sb2.append(this.f2335b);
            if (this.f2336c != null) {
                sb2.append(", ");
                sb2.append("byteRangeStart=");
                sb2.append(this.f2336c);
            }
            if (this.f2337d != null) {
                sb2.append(", ");
                sb2.append("byteRangeLength=");
                sb2.append(this.f2337d);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(B b10) {
            this.f2334a = b10.f2330b;
            this.f2335b = b10.f2331c;
            this.f2336c = b10.f2332d;
            this.f2337d = b10.f2333e;
        }
    }

    public B() {
        if (!(this instanceof A.a)) {
            throw new UnsupportedOperationException("Use: new PreloadHint.Builder()");
        }
    }

    public A e() {
        if (this.f2329a == 0) {
            return new b();
        }
        throw new IllegalStateException(h());
    }

    public A.a f(long j10) {
        this.f2333e = Long.valueOf(j10);
        return (A.a) this;
    }

    public A.a g(long j10) {
        this.f2332d = Long.valueOf(j10);
        return (A.a) this;
    }

    public final String h() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2329a & 1) != 0) {
            arrayList.add("type");
        }
        if ((this.f2329a & 2) != 0) {
            arrayList.add("uri");
        }
        return "Cannot build PreloadHint, some of required attributes are not set " + arrayList;
    }

    public A.a i(C c10) {
        Objects.requireNonNull(c10, "type");
        this.f2330b = c10;
        this.f2329a &= -2;
        return (A.a) this;
    }

    public A.a j(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2331c = str;
        this.f2329a &= -3;
        return (A.a) this;
    }
}
