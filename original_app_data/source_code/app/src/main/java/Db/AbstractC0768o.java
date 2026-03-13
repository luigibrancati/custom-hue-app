package Db;

import Db.InterfaceC0767n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Db.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0768o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f2550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f2551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2552i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public L f2554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0773u f2555l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public P f2557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A f2558o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f2560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S f2562s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2544a = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f2553j = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f2556m = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f2559p = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f2563t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f2564u = new ArrayList();

    /* JADX INFO: renamed from: Db.o$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0767n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f2567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Boolean f2569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final x f2570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f2571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f2572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final L f2573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final InterfaceC0773u f2574j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List f2575k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final P f2576l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final A f2577m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f2578n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Integer f2579o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f2580p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final S f2581q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final List f2582r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final List f2583s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public volatile transient a f2584t;

        /* JADX INFO: renamed from: Db.o$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f2585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2586b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f2587c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2588d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f2589e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f2590f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public boolean f2591g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f2592h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f2593i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f2594j;

            public a() {
            }

            public long a() {
                int i10 = this.f2588d;
                if (i10 == -1) {
                    throw new IllegalStateException(c());
                }
                if (i10 == 0) {
                    this.f2588d = -1;
                    this.f2587c = b.this.m();
                    this.f2588d = 1;
                }
                return this.f2587c;
            }

            public void b(long j10) {
                this.f2587c = j10;
                this.f2588d = 1;
            }

            public final String c() {
                ArrayList arrayList = new ArrayList();
                if (this.f2586b == -1) {
                    arrayList.add("mediaSequence");
                }
                if (this.f2588d == -1) {
                    arrayList.add("discontinuitySequence");
                }
                if (this.f2590f == -1) {
                    arrayList.add("ongoing");
                }
                if (this.f2592h == -1) {
                    arrayList.add("iFramesOnly");
                }
                if (this.f2594j == -1) {
                    arrayList.add("independentSegments");
                }
                return "Cannot build MediaPlaylist, attribute initializers form cycle" + arrayList;
            }

            public void d(boolean z10) {
                this.f2591g = z10;
                this.f2592h = 1;
            }

            public boolean e() {
                int i10 = this.f2592h;
                if (i10 == -1) {
                    throw new IllegalStateException(c());
                }
                if (i10 == 0) {
                    this.f2592h = -1;
                    this.f2591g = b.this.o();
                    this.f2592h = 1;
                }
                return this.f2591g;
            }

            public void f(boolean z10) {
                this.f2593i = z10;
                this.f2594j = 1;
            }

            public boolean g() {
                int i10 = this.f2594j;
                if (i10 == -1) {
                    throw new IllegalStateException(c());
                }
                if (i10 == 0) {
                    this.f2594j = -1;
                    this.f2593i = b.this.p();
                    this.f2594j = 1;
                }
                return this.f2593i;
            }

            public long h() {
                int i10 = this.f2586b;
                if (i10 == -1) {
                    throw new IllegalStateException(c());
                }
                if (i10 == 0) {
                    this.f2586b = -1;
                    this.f2585a = b.this.q();
                    this.f2586b = 1;
                }
                return this.f2585a;
            }

            public void i(long j10) {
                this.f2585a = j10;
                this.f2586b = 1;
            }

            public void j(boolean z10) {
                this.f2589e = z10;
                this.f2590f = 1;
            }

            public boolean k() {
                int i10 = this.f2590f;
                if (i10 == -1) {
                    throw new IllegalStateException(c());
                }
                if (i10 == 0) {
                    this.f2590f = -1;
                    this.f2589e = b.this.r();
                    this.f2590f = 1;
                }
                return this.f2589e;
            }
        }

        @Override // Db.InterfaceC0767n
        public List e() {
            return this.f2572h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && n((b) obj);
        }

        public int hashCode() {
            int i10 = this.f2565a + 177573;
            int iHashCode = i10 + (i10 << 5) + Long.hashCode(this.f2566b);
            int iHashCode2 = iHashCode + (iHashCode << 5) + Long.hashCode(this.f2567c);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Boolean.hashCode(this.f2568d);
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2569e);
            int iHashCode5 = iHashCode4 + (iHashCode4 << 5) + Objects.hashCode(this.f2570f);
            int iHashCode6 = iHashCode5 + (iHashCode5 << 5) + Boolean.hashCode(this.f2571g);
            int iHashCode7 = iHashCode6 + (iHashCode6 << 5) + this.f2572h.hashCode();
            int iHashCode8 = iHashCode7 + (iHashCode7 << 5) + Objects.hashCode(this.f2573i);
            int iHashCode9 = iHashCode8 + (iHashCode8 << 5) + Objects.hashCode(this.f2574j);
            int iHashCode10 = iHashCode9 + (iHashCode9 << 5) + this.f2575k.hashCode();
            int iHashCode11 = iHashCode10 + (iHashCode10 << 5) + Objects.hashCode(this.f2576l);
            int iHashCode12 = iHashCode11 + (iHashCode11 << 5) + Objects.hashCode(this.f2577m);
            int iHashCode13 = iHashCode12 + (iHashCode12 << 5) + this.f2578n.hashCode();
            int iHashCode14 = iHashCode13 + (iHashCode13 << 5) + Objects.hashCode(this.f2579o);
            int iHashCode15 = iHashCode14 + (iHashCode14 << 5) + Boolean.hashCode(this.f2580p);
            int iHashCode16 = iHashCode15 + (iHashCode15 << 5) + Objects.hashCode(this.f2581q);
            int iHashCode17 = iHashCode16 + (iHashCode16 << 5) + this.f2582r.hashCode();
            return iHashCode17 + (iHashCode17 << 5) + this.f2583s.hashCode();
        }

        public final long m() {
            return super.c();
        }

        public final boolean n(b bVar) {
            return this.f2565a == bVar.f2565a && this.f2566b == bVar.f2566b && this.f2567c == bVar.f2567c && this.f2568d == bVar.f2568d && Objects.equals(this.f2569e, bVar.f2569e) && Objects.equals(this.f2570f, bVar.f2570f) && this.f2571g == bVar.f2571g && this.f2572h.equals(bVar.f2572h) && Objects.equals(this.f2573i, bVar.f2573i) && Objects.equals(this.f2574j, bVar.f2574j) && this.f2575k.equals(bVar.f2575k) && Objects.equals(this.f2576l, bVar.f2576l) && Objects.equals(this.f2577m, bVar.f2577m) && this.f2578n.equals(bVar.f2578n) && Objects.equals(this.f2579o, bVar.f2579o) && this.f2580p == bVar.f2580p && Objects.equals(this.f2581q, bVar.f2581q) && this.f2582r.equals(bVar.f2582r) && this.f2583s.equals(bVar.f2583s);
        }

        public final boolean o() {
            return super.a();
        }

        public final boolean p() {
            return super.g();
        }

        public final long q() {
            return super.b();
        }

        public final boolean r() {
            return super.d();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MediaPlaylist{");
            sb2.append("targetDuration=");
            sb2.append(this.f2565a);
            sb2.append(", ");
            sb2.append("mediaSequence=");
            sb2.append(this.f2566b);
            sb2.append(", ");
            sb2.append("discontinuitySequence=");
            sb2.append(this.f2567c);
            sb2.append(", ");
            sb2.append("ongoing=");
            sb2.append(this.f2568d);
            if (this.f2569e != null) {
                sb2.append(", ");
                sb2.append("allowCache=");
                sb2.append(this.f2569e);
            }
            if (this.f2570f != null) {
                sb2.append(", ");
                sb2.append("playlistType=");
                sb2.append(this.f2570f);
            }
            sb2.append(", ");
            sb2.append("iFramesOnly=");
            sb2.append(this.f2571g);
            sb2.append(", ");
            sb2.append("mediaSegments=");
            sb2.append(this.f2572h);
            if (this.f2573i != null) {
                sb2.append(", ");
                sb2.append("serverControl=");
                sb2.append(this.f2573i);
            }
            if (this.f2574j != null) {
                sb2.append(", ");
                sb2.append("partialSegmentInformation=");
                sb2.append(this.f2574j);
            }
            sb2.append(", ");
            sb2.append("partialSegments=");
            sb2.append(this.f2575k);
            if (this.f2576l != null) {
                sb2.append(", ");
                sb2.append("skip=");
                sb2.append(this.f2576l);
            }
            if (this.f2577m != null) {
                sb2.append(", ");
                sb2.append("preloadHint=");
                sb2.append(this.f2577m);
            }
            sb2.append(", ");
            sb2.append("renditionReports=");
            sb2.append(this.f2578n);
            if (this.f2579o != null) {
                sb2.append(", ");
                sb2.append("version=");
                sb2.append(this.f2579o);
            }
            sb2.append(", ");
            sb2.append("independentSegments=");
            sb2.append(this.f2580p);
            if (this.f2581q != null) {
                sb2.append(", ");
                sb2.append("startTimeOffset=");
                sb2.append(this.f2581q);
            }
            sb2.append(", ");
            sb2.append("variables=");
            sb2.append(this.f2582r);
            sb2.append(", ");
            sb2.append("comments=");
            sb2.append(this.f2583s);
            sb2.append("}");
            return sb2.toString();
        }

        public b(AbstractC0768o abstractC0768o) {
            this.f2584t = new a();
            this.f2565a = abstractC0768o.f2546c;
            this.f2569e = abstractC0768o.f2550g;
            this.f2570f = abstractC0768o.f2551h;
            this.f2572h = AbstractC0768o.F(true, abstractC0768o.f2553j);
            this.f2573i = abstractC0768o.f2554k;
            this.f2574j = abstractC0768o.f2555l;
            this.f2575k = AbstractC0768o.F(true, abstractC0768o.f2556m);
            this.f2576l = abstractC0768o.f2557n;
            this.f2577m = abstractC0768o.f2558o;
            this.f2578n = AbstractC0768o.F(true, abstractC0768o.f2559p);
            this.f2579o = abstractC0768o.f2560q;
            this.f2581q = abstractC0768o.f2562s;
            this.f2582r = AbstractC0768o.F(true, abstractC0768o.f2563t);
            this.f2583s = AbstractC0768o.F(true, abstractC0768o.f2564u);
            if (abstractC0768o.O()) {
                this.f2584t.i(abstractC0768o.f2547d);
            }
            if (abstractC0768o.H()) {
                this.f2584t.b(abstractC0768o.f2548e);
            }
            if (abstractC0768o.Q()) {
                this.f2584t.j(abstractC0768o.f2549f);
            }
            if (abstractC0768o.K()) {
                this.f2584t.d(abstractC0768o.f2552i);
            }
            if (abstractC0768o.M()) {
                this.f2584t.f(abstractC0768o.f2561r);
            }
            this.f2566b = this.f2584t.h();
            this.f2567c = this.f2584t.a();
            this.f2568d = this.f2584t.k();
            this.f2571g = this.f2584t.e();
            this.f2580p = this.f2584t.g();
            this.f2584t = null;
        }
    }

    public AbstractC0768o() {
        if (!(this instanceof InterfaceC0767n.a)) {
            throw new UnsupportedOperationException("Use: new MediaPlaylist.Builder()");
        }
    }

    public static List F(boolean z10, List list) {
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

    public InterfaceC0767n.a A(String str) {
        List list = this.f2564u;
        Objects.requireNonNull(str, "comments element");
        list.add(str);
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a B(InterfaceC0769p interfaceC0769p) {
        List list = this.f2553j;
        Objects.requireNonNull(interfaceC0769p, "mediaSegments element");
        list.add(interfaceC0769p);
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a C(D d10) {
        List list = this.f2559p;
        Objects.requireNonNull(d10, "renditionReports element");
        list.add(d10);
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a D(boolean z10) {
        this.f2550g = Boolean.valueOf(z10);
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n E() {
        if (this.f2544a == 0) {
            return new b();
        }
        throw new IllegalStateException(I());
    }

    public InterfaceC0767n.a G(long j10) {
        this.f2548e = j10;
        this.f2545b |= 2;
        return (InterfaceC0767n.a) this;
    }

    public final boolean H() {
        return (this.f2545b & 2) != 0;
    }

    public final String I() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2544a & 1) != 0) {
            arrayList.add("targetDuration");
        }
        return "Cannot build MediaPlaylist, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0767n.a J(boolean z10) {
        this.f2552i = z10;
        this.f2545b |= 8;
        return (InterfaceC0767n.a) this;
    }

    public final boolean K() {
        return (this.f2545b & 8) != 0;
    }

    public InterfaceC0767n.a L(boolean z10) {
        this.f2561r = z10;
        this.f2545b |= 16;
        return (InterfaceC0767n.a) this;
    }

    public final boolean M() {
        return (this.f2545b & 16) != 0;
    }

    public InterfaceC0767n.a N(long j10) {
        this.f2547d = j10;
        this.f2545b |= 1;
        return (InterfaceC0767n.a) this;
    }

    public final boolean O() {
        return (this.f2545b & 1) != 0;
    }

    public InterfaceC0767n.a P(boolean z10) {
        this.f2549f = z10;
        this.f2545b |= 4;
        return (InterfaceC0767n.a) this;
    }

    public final boolean Q() {
        return (this.f2545b & 4) != 0;
    }

    public InterfaceC0767n.a R(InterfaceC0773u interfaceC0773u) {
        Objects.requireNonNull(interfaceC0773u, "partialSegmentInformation");
        this.f2555l = interfaceC0773u;
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a S(Iterable iterable) {
        this.f2556m.clear();
        return z(iterable);
    }

    public InterfaceC0767n.a T(x xVar) {
        Objects.requireNonNull(xVar, "playlistType");
        this.f2551h = xVar;
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a U(A a10) {
        Objects.requireNonNull(a10, "preloadHint");
        this.f2558o = a10;
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a V(L l10) {
        Objects.requireNonNull(l10, "serverControl");
        this.f2554k = l10;
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a W(P p10) {
        Objects.requireNonNull(p10, "skip");
        this.f2557n = p10;
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a X(S s10) {
        Objects.requireNonNull(s10, "startTimeOffset");
        this.f2562s = s10;
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a Y(int i10) {
        this.f2546c = i10;
        this.f2544a &= -2;
        return (InterfaceC0767n.a) this;
    }

    public InterfaceC0767n.a Z(int i10) {
        this.f2560q = Integer.valueOf(i10);
        return (InterfaceC0767n.a) this;
    }

    public final InterfaceC0767n.a z(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC0771s interfaceC0771s = (InterfaceC0771s) it.next();
            List list = this.f2556m;
            Objects.requireNonNull(interfaceC0771s, "partialSegments element");
            list.add(interfaceC0771s);
        }
        return (InterfaceC0767n.a) this;
    }
}
