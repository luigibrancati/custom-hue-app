package Db;

import Db.H;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2350a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC0764k f2351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2355f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC0764k f2356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f2359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f2360e;

        public final boolean a(b bVar) {
            return this.f2356a.equals(bVar.f2356a) && Objects.equals(this.f2357b, bVar.f2357b) && Objects.equals(this.f2358c, bVar.f2358c) && Objects.equals(this.f2359d, bVar.f2359d) && Objects.equals(this.f2360e, bVar.f2360e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2356a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2357b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2358c);
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2359d);
            return iHashCode4 + (iHashCode4 << 5) + Objects.hashCode(this.f2360e);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SegmentKey{");
            sb2.append("method=");
            sb2.append(this.f2356a);
            if (this.f2357b != null) {
                sb2.append(", ");
                sb2.append("uri=");
                sb2.append(this.f2357b);
            }
            if (this.f2358c != null) {
                sb2.append(", ");
                sb2.append("iv=");
                sb2.append(this.f2358c);
            }
            if (this.f2359d != null) {
                sb2.append(", ");
                sb2.append("keyFormat=");
                sb2.append(this.f2359d);
            }
            if (this.f2360e != null) {
                sb2.append(", ");
                sb2.append("keyFormatVersions=");
                sb2.append(this.f2360e);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(I i10) {
            this.f2356a = i10.f2351b;
            this.f2357b = i10.f2352c;
            this.f2358c = i10.f2353d;
            this.f2359d = i10.f2354e;
            this.f2360e = i10.f2355f;
        }
    }

    public I() {
        if (!(this instanceof H.a)) {
            throw new UnsupportedOperationException("Use: new SegmentKey.Builder()");
        }
    }

    public H f() {
        if (this.f2350a == 0) {
            return new b();
        }
        throw new IllegalStateException(g());
    }

    public final String g() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2350a & 1) != 0) {
            arrayList.add("method");
        }
        return "Cannot build SegmentKey, some of required attributes are not set " + arrayList;
    }

    public H.a h(String str) {
        Objects.requireNonNull(str, "iv");
        this.f2353d = str;
        return (H.a) this;
    }

    public H.a i(String str) {
        Objects.requireNonNull(str, "keyFormat");
        this.f2354e = str;
        return (H.a) this;
    }

    public H.a j(String str) {
        Objects.requireNonNull(str, "keyFormatVersions");
        this.f2355f = str;
        return (H.a) this;
    }

    public H.a k(EnumC0764k enumC0764k) {
        Objects.requireNonNull(enumC0764k, "method");
        this.f2351b = enumC0764k;
        this.f2350a &= -2;
        return (H.a) this;
    }

    public H.a l(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2352c = str;
        return (H.a) this;
    }
}
