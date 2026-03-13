package Db;

import Db.J;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2361a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0756c f2363c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0756c f2365b;

        @Override // Db.J
        public String a() {
            return this.f2364a;
        }

        public final boolean b(b bVar) {
            return this.f2364a.equals(bVar.f2364a) && Objects.equals(this.f2365b, bVar.f2365b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && b((b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2364a.hashCode() + 177573;
            return iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2365b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SegmentMap{");
            sb2.append("uri=");
            sb2.append(this.f2364a);
            if (this.f2365b != null) {
                sb2.append(", ");
                sb2.append("byteRange=");
                sb2.append(this.f2365b);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(K k10) {
            this.f2364a = k10.f2362b;
            this.f2365b = k10.f2363c;
        }
    }

    public K() {
        if (!(this instanceof J.a)) {
            throw new UnsupportedOperationException("Use: new SegmentMap.Builder()");
        }
    }

    public J c() {
        if (this.f2361a == 0) {
            return new b();
        }
        throw new IllegalStateException(e());
    }

    public J.a d(InterfaceC0756c interfaceC0756c) {
        Objects.requireNonNull(interfaceC0756c, "byteRange");
        this.f2363c = interfaceC0756c;
        return (J.a) this;
    }

    public final String e() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2361a & 1) != 0) {
            arrayList.add("uri");
        }
        return "Cannot build SegmentMap, some of required attributes are not set " + arrayList;
    }

    public J.a f(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2362b = str;
        this.f2361a &= -2;
        return (J.a) this;
    }
}
