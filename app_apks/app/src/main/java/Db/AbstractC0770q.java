package Db;

import Db.InterfaceC0769p;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: renamed from: Db.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0770q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f2598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0756c f2601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OffsetDateTime f2602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0760g f2603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public J f2604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H f2605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Double f2607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f2610o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2596a = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f2611p = new ArrayList();

    /* JADX INFO: renamed from: Db.q$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0769p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f2612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC0756c f2615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final OffsetDateTime f2616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InterfaceC0760g f2617f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final J f2618g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final H f2619h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f2620i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Double f2621j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f2622k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f2623l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Long f2624m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f2625n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public volatile transient a f2626o;

        /* JADX INFO: renamed from: Db.q$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f2627a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2628b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f2629c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2630d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f2631e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f2632f;

            public a() {
            }

            public void a(boolean z10) {
                this.f2629c = z10;
                this.f2630d = 1;
            }

            public boolean b() {
                int i10 = this.f2630d;
                if (i10 == -1) {
                    throw new IllegalStateException(e());
                }
                if (i10 == 0) {
                    this.f2630d = -1;
                    this.f2629c = b.this.j();
                    this.f2630d = 1;
                }
                return this.f2629c;
            }

            public void c(boolean z10) {
                this.f2627a = z10;
                this.f2628b = 1;
            }

            public boolean d() {
                int i10 = this.f2628b;
                if (i10 == -1) {
                    throw new IllegalStateException(e());
                }
                if (i10 == 0) {
                    this.f2628b = -1;
                    this.f2627a = b.this.k();
                    this.f2628b = 1;
                }
                return this.f2627a;
            }

            public final String e() {
                ArrayList arrayList = new ArrayList();
                if (this.f2628b == -1) {
                    arrayList.add("discontinuity");
                }
                if (this.f2630d == -1) {
                    arrayList.add("cueIn");
                }
                if (this.f2632f == -1) {
                    arrayList.add("gap");
                }
                return "Cannot build MediaSegment, attribute initializers form cycle" + arrayList;
            }

            public void f(boolean z10) {
                this.f2631e = z10;
                this.f2632f = 1;
            }

            public boolean g() {
                int i10 = this.f2632f;
                if (i10 == -1) {
                    throw new IllegalStateException(e());
                }
                if (i10 == 0) {
                    this.f2632f = -1;
                    this.f2631e = b.this.m();
                    this.f2632f = 1;
                }
                return this.f2631e;
            }
        }

        @Override // Db.InterfaceC0769p
        public String a() {
            return this.f2614c;
        }

        @Override // Db.InterfaceC0769p
        public Optional d() {
            return Optional.ofNullable(this.f2618g);
        }

        @Override // Db.InterfaceC0769p
        public double e() {
            return this.f2612a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && l((b) obj);
        }

        public int hashCode() {
            int iHashCode = Double.hashCode(this.f2612a) + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2613b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + this.f2614c.hashCode();
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2615d);
            int iHashCode5 = iHashCode4 + (iHashCode4 << 5) + Objects.hashCode(this.f2616e);
            int iHashCode6 = iHashCode5 + (iHashCode5 << 5) + Objects.hashCode(this.f2617f);
            int iHashCode7 = iHashCode6 + (iHashCode6 << 5) + Objects.hashCode(this.f2618g);
            int iHashCode8 = iHashCode7 + (iHashCode7 << 5) + Objects.hashCode(this.f2619h);
            int iHashCode9 = iHashCode8 + (iHashCode8 << 5) + Boolean.hashCode(this.f2620i);
            int iHashCode10 = iHashCode9 + (iHashCode9 << 5) + Objects.hashCode(this.f2621j);
            int iHashCode11 = iHashCode10 + (iHashCode10 << 5) + Boolean.hashCode(this.f2622k);
            int iHashCode12 = iHashCode11 + (iHashCode11 << 5) + Boolean.hashCode(this.f2623l);
            int iHashCode13 = iHashCode12 + (iHashCode12 << 5) + Objects.hashCode(this.f2624m);
            return iHashCode13 + (iHashCode13 << 5) + this.f2625n.hashCode();
        }

        public final boolean j() {
            return super.c();
        }

        public final boolean k() {
            return super.f();
        }

        public final boolean l(b bVar) {
            return Double.doubleToLongBits(this.f2612a) == Double.doubleToLongBits(bVar.f2612a) && Objects.equals(this.f2613b, bVar.f2613b) && this.f2614c.equals(bVar.f2614c) && Objects.equals(this.f2615d, bVar.f2615d) && Objects.equals(this.f2616e, bVar.f2616e) && Objects.equals(this.f2617f, bVar.f2617f) && Objects.equals(this.f2618g, bVar.f2618g) && Objects.equals(this.f2619h, bVar.f2619h) && this.f2620i == bVar.f2620i && Objects.equals(this.f2621j, bVar.f2621j) && this.f2622k == bVar.f2622k && this.f2623l == bVar.f2623l && Objects.equals(this.f2624m, bVar.f2624m) && this.f2625n.equals(bVar.f2625n);
        }

        public final boolean m() {
            return super.b();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MediaSegment{");
            sb2.append("duration=");
            sb2.append(this.f2612a);
            if (this.f2613b != null) {
                sb2.append(", ");
                sb2.append("title=");
                sb2.append(this.f2613b);
            }
            sb2.append(", ");
            sb2.append("uri=");
            sb2.append(this.f2614c);
            if (this.f2615d != null) {
                sb2.append(", ");
                sb2.append("byteRange=");
                sb2.append(this.f2615d);
            }
            if (this.f2616e != null) {
                sb2.append(", ");
                sb2.append("programDateTime=");
                sb2.append(this.f2616e);
            }
            if (this.f2617f != null) {
                sb2.append(", ");
                sb2.append("dateRange=");
                sb2.append(this.f2617f);
            }
            if (this.f2618g != null) {
                sb2.append(", ");
                sb2.append("segmentMap=");
                sb2.append(this.f2618g);
            }
            if (this.f2619h != null) {
                sb2.append(", ");
                sb2.append("segmentKey=");
                sb2.append(this.f2619h);
            }
            sb2.append(", ");
            sb2.append("discontinuity=");
            sb2.append(this.f2620i);
            if (this.f2621j != null) {
                sb2.append(", ");
                sb2.append("cueOut=");
                sb2.append(this.f2621j);
            }
            sb2.append(", ");
            sb2.append("cueIn=");
            sb2.append(this.f2622k);
            sb2.append(", ");
            sb2.append("gap=");
            sb2.append(this.f2623l);
            if (this.f2624m != null) {
                sb2.append(", ");
                sb2.append("bitrate=");
                sb2.append(this.f2624m);
            }
            sb2.append(", ");
            sb2.append("partialSegments=");
            sb2.append(this.f2625n);
            sb2.append("}");
            return sb2.toString();
        }

        public b(AbstractC0770q abstractC0770q) {
            this.f2626o = new a();
            this.f2612a = abstractC0770q.f2598c;
            this.f2613b = abstractC0770q.f2599d;
            this.f2614c = abstractC0770q.f2600e;
            this.f2615d = abstractC0770q.f2601f;
            this.f2616e = abstractC0770q.f2602g;
            this.f2617f = abstractC0770q.f2603h;
            this.f2618g = abstractC0770q.f2604i;
            this.f2619h = abstractC0770q.f2605j;
            this.f2621j = abstractC0770q.f2607l;
            this.f2624m = abstractC0770q.f2610o;
            this.f2625n = AbstractC0770q.x(true, abstractC0770q.f2611p);
            if (abstractC0770q.D()) {
                this.f2626o.c(abstractC0770q.f2606k);
            }
            if (abstractC0770q.z()) {
                this.f2626o.a(abstractC0770q.f2608m);
            }
            if (abstractC0770q.H()) {
                this.f2626o.f(abstractC0770q.f2609n);
            }
            this.f2620i = this.f2626o.d();
            this.f2622k = this.f2626o.b();
            this.f2623l = this.f2626o.g();
            this.f2626o = null;
        }
    }

    public AbstractC0770q() {
        if (!(this instanceof InterfaceC0769p.a)) {
            throw new UnsupportedOperationException("Use: new MediaSegment.Builder()");
        }
    }

    public static List x(boolean z10, List list) {
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

    public InterfaceC0769p.a A(double d10) {
        this.f2607l = Double.valueOf(d10);
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a B(InterfaceC0760g interfaceC0760g) {
        Objects.requireNonNull(interfaceC0760g, "dateRange");
        this.f2603h = interfaceC0760g;
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a C(boolean z10) {
        this.f2606k = z10;
        this.f2597b |= 1;
        return (InterfaceC0769p.a) this;
    }

    public final boolean D() {
        return (this.f2597b & 1) != 0;
    }

    public InterfaceC0769p.a E(double d10) {
        this.f2598c = d10;
        this.f2596a &= -2;
        return (InterfaceC0769p.a) this;
    }

    public final String F() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2596a & 1) != 0) {
            arrayList.add("duration");
        }
        if ((this.f2596a & 2) != 0) {
            arrayList.add("uri");
        }
        return "Cannot build MediaSegment, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0769p.a G(boolean z10) {
        this.f2609n = z10;
        this.f2597b |= 4;
        return (InterfaceC0769p.a) this;
    }

    public final boolean H() {
        return (this.f2597b & 4) != 0;
    }

    public InterfaceC0769p.a I(Iterable iterable) {
        this.f2611p.clear();
        return s(iterable);
    }

    public InterfaceC0769p.a J(OffsetDateTime offsetDateTime) {
        Objects.requireNonNull(offsetDateTime, "programDateTime");
        this.f2602g = offsetDateTime;
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a K(H h10) {
        Objects.requireNonNull(h10, "segmentKey");
        this.f2605j = h10;
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a L(J j10) {
        Objects.requireNonNull(j10, "segmentMap");
        this.f2604i = j10;
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a M(String str) {
        Objects.requireNonNull(str, "title");
        this.f2599d = str;
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a N(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2600e = str;
        this.f2596a &= -3;
        return (InterfaceC0769p.a) this;
    }

    public final InterfaceC0769p.a s(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC0771s interfaceC0771s = (InterfaceC0771s) it.next();
            List list = this.f2611p;
            Objects.requireNonNull(interfaceC0771s, "partialSegments element");
            list.add(interfaceC0771s);
        }
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a t(InterfaceC0771s interfaceC0771s) {
        List list = this.f2611p;
        Objects.requireNonNull(interfaceC0771s, "partialSegments element");
        list.add(interfaceC0771s);
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a u(long j10) {
        this.f2610o = Long.valueOf(j10);
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p v() {
        if (this.f2596a == 0) {
            return new b();
        }
        throw new IllegalStateException(F());
    }

    public InterfaceC0769p.a w(InterfaceC0756c interfaceC0756c) {
        Objects.requireNonNull(interfaceC0756c, "byteRange");
        this.f2601f = interfaceC0756c;
        return (InterfaceC0769p.a) this;
    }

    public InterfaceC0769p.a y(boolean z10) {
        this.f2608m = z10;
        this.f2597b |= 2;
        return (InterfaceC0769p.a) this;
    }

    public final boolean z() {
        return (this.f2597b & 2) != 0;
    }
}
