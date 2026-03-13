package Db;

import Db.InterfaceC0754a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Db.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0755b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f2433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f2440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f2441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f2442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2443l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC0758e f2445n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2432a = 7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f2444m = new ArrayList();

    /* JADX INFO: renamed from: Db.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0040b implements InterfaceC0754a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f2446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f2449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f2450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f2451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f2452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Boolean f2453h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Boolean f2454i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Boolean f2455j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f2456k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f2457l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final InterfaceC0758e f2458m;

        public final boolean a(C0040b c0040b) {
            return this.f2446a.equals(c0040b.f2446a) && Objects.equals(this.f2447b, c0040b.f2447b) && this.f2448c.equals(c0040b.f2448c) && Objects.equals(this.f2449d, c0040b.f2449d) && Objects.equals(this.f2450e, c0040b.f2450e) && this.f2451f.equals(c0040b.f2451f) && Objects.equals(this.f2452g, c0040b.f2452g) && Objects.equals(this.f2453h, c0040b.f2453h) && Objects.equals(this.f2454i, c0040b.f2454i) && Objects.equals(this.f2455j, c0040b.f2455j) && Objects.equals(this.f2456k, c0040b.f2456k) && this.f2457l.equals(c0040b.f2457l) && Objects.equals(this.f2458m, c0040b.f2458m);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0040b) && a((C0040b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2446a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2447b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + this.f2448c.hashCode();
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2449d);
            int iHashCode5 = iHashCode4 + (iHashCode4 << 5) + Objects.hashCode(this.f2450e);
            int iHashCode6 = iHashCode5 + (iHashCode5 << 5) + this.f2451f.hashCode();
            int iHashCode7 = iHashCode6 + (iHashCode6 << 5) + Objects.hashCode(this.f2452g);
            int iHashCode8 = iHashCode7 + (iHashCode7 << 5) + Objects.hashCode(this.f2453h);
            int iHashCode9 = iHashCode8 + (iHashCode8 << 5) + Objects.hashCode(this.f2454i);
            int iHashCode10 = iHashCode9 + (iHashCode9 << 5) + Objects.hashCode(this.f2455j);
            int iHashCode11 = iHashCode10 + (iHashCode10 << 5) + Objects.hashCode(this.f2456k);
            int iHashCode12 = iHashCode11 + (iHashCode11 << 5) + this.f2457l.hashCode();
            return iHashCode12 + (iHashCode12 << 5) + Objects.hashCode(this.f2458m);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AlternativeRendition{");
            sb2.append("type=");
            sb2.append(this.f2446a);
            if (this.f2447b != null) {
                sb2.append(", ");
                sb2.append("uri=");
                sb2.append(this.f2447b);
            }
            sb2.append(", ");
            sb2.append("groupId=");
            sb2.append(this.f2448c);
            if (this.f2449d != null) {
                sb2.append(", ");
                sb2.append("language=");
                sb2.append(this.f2449d);
            }
            if (this.f2450e != null) {
                sb2.append(", ");
                sb2.append("assocLanguage=");
                sb2.append(this.f2450e);
            }
            sb2.append(", ");
            sb2.append("name=");
            sb2.append(this.f2451f);
            if (this.f2452g != null) {
                sb2.append(", ");
                sb2.append("stableRenditionId=");
                sb2.append(this.f2452g);
            }
            if (this.f2453h != null) {
                sb2.append(", ");
                sb2.append("defaultRendition=");
                sb2.append(this.f2453h);
            }
            if (this.f2454i != null) {
                sb2.append(", ");
                sb2.append("autoSelect=");
                sb2.append(this.f2454i);
            }
            if (this.f2455j != null) {
                sb2.append(", ");
                sb2.append("forced=");
                sb2.append(this.f2455j);
            }
            if (this.f2456k != null) {
                sb2.append(", ");
                sb2.append("inStreamId=");
                sb2.append(this.f2456k);
            }
            sb2.append(", ");
            sb2.append("characteristics=");
            sb2.append(this.f2457l);
            if (this.f2458m != null) {
                sb2.append(", ");
                sb2.append("channels=");
                sb2.append(this.f2458m);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public C0040b(AbstractC0755b abstractC0755b) {
            this.f2446a = abstractC0755b.f2433b;
            this.f2447b = abstractC0755b.f2434c;
            this.f2448c = abstractC0755b.f2435d;
            this.f2449d = abstractC0755b.f2436e;
            this.f2450e = abstractC0755b.f2437f;
            this.f2451f = abstractC0755b.f2438g;
            this.f2452g = abstractC0755b.f2439h;
            this.f2453h = abstractC0755b.f2440i;
            this.f2454i = abstractC0755b.f2441j;
            this.f2455j = abstractC0755b.f2442k;
            this.f2456k = abstractC0755b.f2443l;
            this.f2457l = AbstractC0755b.u(true, abstractC0755b.f2444m);
            this.f2458m = abstractC0755b.f2445n;
        }
    }

    public AbstractC0755b() {
        if (!(this instanceof InterfaceC0754a.C0039a)) {
            throw new UnsupportedOperationException("Use: new AlternativeRendition.Builder()");
        }
    }

    public static List u(boolean z10, List list) {
        int size = list.size();
        if (size == 0) {
            return Collections.EMPTY_LIST;
        }
        if (size == 1) {
            return Collections.singletonList(list.get(0));
        }
        if (z10) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
    }

    public InterfaceC0754a.C0039a A(String str) {
        Objects.requireNonNull(str, "language");
        this.f2436e = str;
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a B(String str) {
        Objects.requireNonNull(str, "name");
        this.f2438g = str;
        this.f2432a &= -5;
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a C(String str) {
        Objects.requireNonNull(str, "stableRenditionId");
        this.f2439h = str;
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a D(r rVar) {
        Objects.requireNonNull(rVar, "type");
        this.f2433b = rVar;
        this.f2432a &= -2;
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a E(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2434c = str;
        return (InterfaceC0754a.C0039a) this;
    }

    public final InterfaceC0754a.C0039a o(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = this.f2444m;
            Objects.requireNonNull(str, "characteristics element");
            list.add(str);
        }
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a p(String str) {
        Objects.requireNonNull(str, "assocLanguage");
        this.f2437f = str;
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a q(boolean z10) {
        this.f2441j = Boolean.valueOf(z10);
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a r() {
        if (this.f2432a == 0) {
            return new C0040b();
        }
        throw new IllegalStateException(x());
    }

    public InterfaceC0754a.C0039a s(InterfaceC0758e interfaceC0758e) {
        Objects.requireNonNull(interfaceC0758e, "channels");
        this.f2445n = interfaceC0758e;
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a t(Iterable iterable) {
        this.f2444m.clear();
        return o(iterable);
    }

    public InterfaceC0754a.C0039a v(boolean z10) {
        this.f2440i = Boolean.valueOf(z10);
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a w(boolean z10) {
        this.f2442k = Boolean.valueOf(z10);
        return (InterfaceC0754a.C0039a) this;
    }

    public final String x() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2432a & 1) != 0) {
            arrayList.add("type");
        }
        if ((this.f2432a & 2) != 0) {
            arrayList.add("groupId");
        }
        if ((this.f2432a & 4) != 0) {
            arrayList.add("name");
        }
        return "Cannot build AlternativeRendition, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0754a.C0039a y(String str) {
        Objects.requireNonNull(str, "groupId");
        this.f2435d = str;
        this.f2432a &= -3;
        return (InterfaceC0754a.C0039a) this;
    }

    public InterfaceC0754a.C0039a z(String str) {
        Objects.requireNonNull(str, "inStreamId");
        this.f2443l = str;
        return (InterfaceC0754a.C0039a) this;
    }
}
