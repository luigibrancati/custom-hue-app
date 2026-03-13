package Db;

import Db.L;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f2367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f2368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f2369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f2370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2371f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f2372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f2373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f2374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f2375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f2376e;

        public final boolean b(b bVar) {
            return Objects.equals(this.f2372a, bVar.f2372a) && Objects.equals(this.f2373b, bVar.f2373b) && Objects.equals(this.f2374c, bVar.f2374c) && Objects.equals(this.f2375d, bVar.f2375d) && this.f2376e == bVar.f2376e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && b((b) obj);
        }

        public int hashCode() {
            int iHashCode = Objects.hashCode(this.f2372a) + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2373b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2374c);
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2375d);
            return iHashCode4 + (iHashCode4 << 5) + Boolean.hashCode(this.f2376e);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ServerControl{");
            if (this.f2372a != null) {
                sb2.append("canSkipUntil=");
                sb2.append(this.f2372a);
            }
            if (this.f2373b != null) {
                if (sb2.length() > 14) {
                    sb2.append(", ");
                }
                sb2.append("canSkipDateRanges=");
                sb2.append(this.f2373b);
            }
            if (this.f2374c != null) {
                if (sb2.length() > 14) {
                    sb2.append(", ");
                }
                sb2.append("holdBack=");
                sb2.append(this.f2374c);
            }
            if (this.f2375d != null) {
                if (sb2.length() > 14) {
                    sb2.append(", ");
                }
                sb2.append("partHoldBack=");
                sb2.append(this.f2375d);
            }
            if (sb2.length() > 14) {
                sb2.append(", ");
            }
            sb2.append("canBlockReload=");
            sb2.append(this.f2376e);
            sb2.append("}");
            return sb2.toString();
        }

        public b(M m10) {
            this.f2372a = m10.f2367b;
            this.f2373b = m10.f2368c;
            this.f2374c = m10.f2369d;
            this.f2375d = m10.f2370e;
            this.f2376e = m10.i() ? m10.f2371f : super.a();
        }
    }

    public M() {
        if (!(this instanceof L.a)) {
            throw new UnsupportedOperationException("Use: new ServerControl.Builder()");
        }
    }

    public L g() {
        return new b();
    }

    public L.a h(boolean z10) {
        this.f2371f = z10;
        this.f2366a |= 1;
        return (L.a) this;
    }

    public final boolean i() {
        return (this.f2366a & 1) != 0;
    }

    public L.a j(boolean z10) {
        this.f2368c = Boolean.valueOf(z10);
        return (L.a) this;
    }

    public L.a k(double d10) {
        this.f2367b = Double.valueOf(d10);
        return (L.a) this;
    }

    public L.a l(double d10) {
        this.f2369d = Double.valueOf(d10);
        return (L.a) this;
    }

    public L.a m(double d10) {
        this.f2370e = Double.valueOf(d10);
        return (L.a) this;
    }
}
