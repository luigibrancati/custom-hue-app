package Db;

import Db.InterfaceC0765l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Db.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0766m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2523a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f2529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S f2531i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2524b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2525c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f2526d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2527e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f2528f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f2532j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f2533k = new ArrayList();

    /* JADX INFO: renamed from: Db.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0765l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f2534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f2535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f2536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f2537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f2538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f2539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f2540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final S f2541h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List f2542i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f2543j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && h((b) obj);
        }

        @Override // Db.InterfaceC0765l
        public List f() {
            return this.f2535b;
        }

        public final boolean h(b bVar) {
            return this.f2534a.equals(bVar.f2534a) && this.f2535b.equals(bVar.f2535b) && this.f2536c.equals(bVar.f2536c) && this.f2537d.equals(bVar.f2537d) && this.f2538e.equals(bVar.f2538e) && Objects.equals(this.f2539f, bVar.f2539f) && this.f2540g == bVar.f2540g && Objects.equals(this.f2541h, bVar.f2541h) && this.f2542i.equals(bVar.f2542i) && this.f2543j.equals(bVar.f2543j);
        }

        public int hashCode() {
            int iHashCode = this.f2534a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + this.f2535b.hashCode();
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + this.f2536c.hashCode();
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + this.f2537d.hashCode();
            int iHashCode5 = iHashCode4 + (iHashCode4 << 5) + this.f2538e.hashCode();
            int iHashCode6 = iHashCode5 + (iHashCode5 << 5) + Objects.hashCode(this.f2539f);
            int iHashCode7 = iHashCode6 + (iHashCode6 << 5) + Boolean.hashCode(this.f2540g);
            int iHashCode8 = iHashCode7 + (iHashCode7 << 5) + Objects.hashCode(this.f2541h);
            int iHashCode9 = iHashCode8 + (iHashCode8 << 5) + this.f2542i.hashCode();
            return iHashCode9 + (iHashCode9 << 5) + this.f2543j.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MasterPlaylist{");
            sb2.append("alternativeRenditions=");
            sb2.append(this.f2534a);
            sb2.append(", ");
            sb2.append("variants=");
            sb2.append(this.f2535b);
            sb2.append(", ");
            sb2.append("iFrameVariants=");
            sb2.append(this.f2536c);
            sb2.append(", ");
            sb2.append("sessionData=");
            sb2.append(this.f2537d);
            sb2.append(", ");
            sb2.append("sessionKeys=");
            sb2.append(this.f2538e);
            if (this.f2539f != null) {
                sb2.append(", ");
                sb2.append("version=");
                sb2.append(this.f2539f);
            }
            sb2.append(", ");
            sb2.append("independentSegments=");
            sb2.append(this.f2540g);
            if (this.f2541h != null) {
                sb2.append(", ");
                sb2.append("startTimeOffset=");
                sb2.append(this.f2541h);
            }
            sb2.append(", ");
            sb2.append("variables=");
            sb2.append(this.f2542i);
            sb2.append(", ");
            sb2.append("comments=");
            sb2.append(this.f2543j);
            sb2.append("}");
            return sb2.toString();
        }

        public b(AbstractC0766m abstractC0766m) {
            this.f2534a = AbstractC0766m.u(true, abstractC0766m.f2524b);
            this.f2535b = AbstractC0766m.u(true, abstractC0766m.f2525c);
            this.f2536c = AbstractC0766m.u(true, abstractC0766m.f2526d);
            this.f2537d = AbstractC0766m.u(true, abstractC0766m.f2527e);
            this.f2538e = AbstractC0766m.u(true, abstractC0766m.f2528f);
            this.f2539f = abstractC0766m.f2529g;
            this.f2541h = abstractC0766m.f2531i;
            this.f2542i = AbstractC0766m.u(true, abstractC0766m.f2532j);
            this.f2543j = AbstractC0766m.u(true, abstractC0766m.f2533k);
            this.f2540g = abstractC0766m.w() ? abstractC0766m.f2530h : super.g();
        }
    }

    public AbstractC0766m() {
        if (!(this instanceof InterfaceC0765l.a)) {
            throw new UnsupportedOperationException("Use: new MasterPlaylist.Builder()");
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

    public InterfaceC0765l.a m(InterfaceC0754a interfaceC0754a) {
        List list = this.f2524b;
        Objects.requireNonNull(interfaceC0754a, "alternativeRenditions element");
        list.add(interfaceC0754a);
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l.a n(String str) {
        List list = this.f2533k;
        Objects.requireNonNull(str, "comments element");
        list.add(str);
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l.a o(InterfaceC0762i interfaceC0762i) {
        List list = this.f2526d;
        Objects.requireNonNull(interfaceC0762i, "iFrameVariants element");
        list.add(interfaceC0762i);
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l.a p(N n10) {
        List list = this.f2527e;
        Objects.requireNonNull(n10, "sessionData element");
        list.add(n10);
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l.a q(H h10) {
        List list = this.f2528f;
        Objects.requireNonNull(h10, "sessionKeys element");
        list.add(h10);
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l.a r(y yVar) {
        List list = this.f2532j;
        Objects.requireNonNull(yVar, "variables element");
        list.add(yVar);
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l.a s(U u10) {
        List list = this.f2525c;
        Objects.requireNonNull(u10, "variants element");
        list.add(u10);
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l t() {
        return new b();
    }

    public InterfaceC0765l.a v(boolean z10) {
        this.f2530h = z10;
        this.f2523a |= 1;
        return (InterfaceC0765l.a) this;
    }

    public final boolean w() {
        return (this.f2523a & 1) != 0;
    }

    public InterfaceC0765l.a x(S s10) {
        Objects.requireNonNull(s10, "startTimeOffset");
        this.f2531i = s10;
        return (InterfaceC0765l.a) this;
    }

    public InterfaceC0765l.a y(int i10) {
        this.f2529g = Integer.valueOf(i10);
        return (InterfaceC0765l.a) this;
    }
}
