package Db;

import Db.D;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2338a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f2340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f2341d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f2343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f2344c;

        public final boolean a(b bVar) {
            return this.f2342a.equals(bVar.f2342a) && Objects.equals(this.f2343b, bVar.f2343b) && Objects.equals(this.f2344c, bVar.f2344c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2342a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2343b);
            return iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2344c);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RenditionReport{");
            sb2.append("uri=");
            sb2.append(this.f2342a);
            if (this.f2343b != null) {
                sb2.append(", ");
                sb2.append("lastMediaSequenceNumber=");
                sb2.append(this.f2343b);
            }
            if (this.f2344c != null) {
                sb2.append(", ");
                sb2.append("lastPartialSegmentIndex=");
                sb2.append(this.f2344c);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(E e10) {
            this.f2342a = e10.f2339b;
            this.f2343b = e10.f2340c;
            this.f2344c = e10.f2341d;
        }
    }

    public E() {
        if (!(this instanceof D.a)) {
            throw new UnsupportedOperationException("Use: new RenditionReport.Builder()");
        }
    }

    public D d() {
        if (this.f2338a == 0) {
            return new b();
        }
        throw new IllegalStateException(e());
    }

    public final String e() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2338a & 1) != 0) {
            arrayList.add("uri");
        }
        return "Cannot build RenditionReport, some of required attributes are not set " + arrayList;
    }

    public D.a f(long j10) {
        this.f2340c = Long.valueOf(j10);
        return (D.a) this;
    }

    public D.a g(long j10) {
        this.f2341d = Long.valueOf(j10);
        return (D.a) this;
    }

    public D.a h(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2339b = str;
        this.f2338a &= -2;
        return (D.a) this;
    }
}
