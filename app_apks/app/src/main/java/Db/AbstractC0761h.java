package Db;

import Db.InterfaceC0760g;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: Db.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0761h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OffsetDateTime f2473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OffsetDateTime f2474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f2475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f2476h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2481m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2469a = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f2477i = new LinkedHashMap();

    /* JADX INFO: renamed from: Db.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0760g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OffsetDateTime f2484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final OffsetDateTime f2485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f2486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Double f2487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map f2488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f2489h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f2490i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f2491j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f2492k;

        public final boolean b(b bVar) {
            return this.f2482a.equals(bVar.f2482a) && Objects.equals(this.f2483b, bVar.f2483b) && this.f2484c.equals(bVar.f2484c) && Objects.equals(this.f2485d, bVar.f2485d) && Objects.equals(this.f2486e, bVar.f2486e) && Objects.equals(this.f2487f, bVar.f2487f) && this.f2488g.equals(bVar.f2488g) && Objects.equals(this.f2489h, bVar.f2489h) && Objects.equals(this.f2490i, bVar.f2490i) && Objects.equals(this.f2491j, bVar.f2491j) && this.f2492k == bVar.f2492k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && b((b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2482a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2483b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + this.f2484c.hashCode();
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2485d);
            int iHashCode5 = iHashCode4 + (iHashCode4 << 5) + Objects.hashCode(this.f2486e);
            int iHashCode6 = iHashCode5 + (iHashCode5 << 5) + Objects.hashCode(this.f2487f);
            int iHashCode7 = iHashCode6 + (iHashCode6 << 5) + this.f2488g.hashCode();
            int iHashCode8 = iHashCode7 + (iHashCode7 << 5) + Objects.hashCode(this.f2489h);
            int iHashCode9 = iHashCode8 + (iHashCode8 << 5) + Objects.hashCode(this.f2490i);
            int iHashCode10 = iHashCode9 + (iHashCode9 << 5) + Objects.hashCode(this.f2491j);
            return iHashCode10 + (iHashCode10 << 5) + Boolean.hashCode(this.f2492k);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("DateRange{");
            sb2.append("id=");
            sb2.append(this.f2482a);
            if (this.f2483b != null) {
                sb2.append(", ");
                sb2.append("classAttribute=");
                sb2.append(this.f2483b);
            }
            sb2.append(", ");
            sb2.append("startDate=");
            sb2.append(this.f2484c);
            if (this.f2485d != null) {
                sb2.append(", ");
                sb2.append("endDate=");
                sb2.append(this.f2485d);
            }
            if (this.f2486e != null) {
                sb2.append(", ");
                sb2.append("duration=");
                sb2.append(this.f2486e);
            }
            if (this.f2487f != null) {
                sb2.append(", ");
                sb2.append("plannedDuration=");
                sb2.append(this.f2487f);
            }
            sb2.append(", ");
            sb2.append("clientAttributes=");
            sb2.append(this.f2488g);
            if (this.f2489h != null) {
                sb2.append(", ");
                sb2.append("scte35Cmd=");
                sb2.append(this.f2489h);
            }
            if (this.f2490i != null) {
                sb2.append(", ");
                sb2.append("scte35Out=");
                sb2.append(this.f2490i);
            }
            if (this.f2491j != null) {
                sb2.append(", ");
                sb2.append("scte35In=");
                sb2.append(this.f2491j);
            }
            sb2.append(", ");
            sb2.append("endOnNext=");
            sb2.append(this.f2492k);
            sb2.append("}");
            return sb2.toString();
        }

        public b(AbstractC0761h abstractC0761h) {
            this.f2482a = abstractC0761h.f2471c;
            this.f2483b = abstractC0761h.f2472d;
            this.f2484c = abstractC0761h.f2473e;
            this.f2485d = abstractC0761h.f2474f;
            this.f2486e = abstractC0761h.f2475g;
            this.f2487f = abstractC0761h.f2476h;
            this.f2488g = AbstractC0761h.p(false, false, abstractC0761h.f2477i);
            this.f2489h = abstractC0761h.f2478j;
            this.f2490i = abstractC0761h.f2479k;
            this.f2491j = abstractC0761h.f2480l;
            this.f2492k = abstractC0761h.t() ? abstractC0761h.f2481m : super.a();
        }
    }

    public AbstractC0761h() {
        if (!(this instanceof InterfaceC0760g.a)) {
            throw new UnsupportedOperationException("Use: new DateRange.Builder()");
        }
    }

    public static Map p(boolean z10, boolean z11, Map map) {
        int size = map.size();
        if (size == 0) {
            return Collections.EMPTY_MAP;
        }
        if (size == 1) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (z10) {
                Objects.requireNonNull(key, "key");
                Objects.requireNonNull(value, "value");
            }
            return (z11 && (key == null || value == null)) ? Collections.EMPTY_MAP : Collections.singletonMap(key, value);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        if (z11 || z10) {
            for (Map.Entry entry2 : map.entrySet()) {
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (z11) {
                    if (key2 == null || value2 == null) {
                    }
                } else if (z10) {
                    Objects.requireNonNull(key2, "key");
                    Objects.requireNonNull(value2, "value");
                }
                linkedHashMap.put(key2, value2);
            }
        } else {
            linkedHashMap.putAll(map);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public InterfaceC0760g.a A(String str) {
        Objects.requireNonNull(str, "scte35Out");
        this.f2479k = str;
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a B(OffsetDateTime offsetDateTime) {
        Objects.requireNonNull(offsetDateTime, "startDate");
        this.f2473e = offsetDateTime;
        this.f2469a &= -3;
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g n() {
        if (this.f2469a == 0) {
            return new b();
        }
        throw new IllegalStateException(u());
    }

    public InterfaceC0760g.a o(String str) {
        Objects.requireNonNull(str, "classAttribute");
        this.f2472d = str;
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a q(double d10) {
        this.f2475g = Double.valueOf(d10);
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a r(OffsetDateTime offsetDateTime) {
        Objects.requireNonNull(offsetDateTime, "endDate");
        this.f2474f = offsetDateTime;
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a s(boolean z10) {
        this.f2481m = z10;
        this.f2470b |= 1;
        return (InterfaceC0760g.a) this;
    }

    public final boolean t() {
        return (this.f2470b & 1) != 0;
    }

    public final String u() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2469a & 1) != 0) {
            arrayList.add("id");
        }
        if ((this.f2469a & 2) != 0) {
            arrayList.add("startDate");
        }
        return "Cannot build DateRange, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0760g.a v(String str) {
        Objects.requireNonNull(str, "id");
        this.f2471c = str;
        this.f2469a &= -2;
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a w(double d10) {
        this.f2476h = Double.valueOf(d10);
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a x(String str, String str2) {
        Map map = this.f2477i;
        Objects.requireNonNull(str, "clientAttributes key");
        Objects.requireNonNull(str2, "clientAttributes value");
        map.put(str, str2);
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a y(String str) {
        Objects.requireNonNull(str, "scte35Cmd");
        this.f2478j = str;
        return (InterfaceC0760g.a) this;
    }

    public InterfaceC0760g.a z(String str) {
        Objects.requireNonNull(str, "scte35In");
        this.f2480l = str;
        return (InterfaceC0760g.a) this;
    }
}
