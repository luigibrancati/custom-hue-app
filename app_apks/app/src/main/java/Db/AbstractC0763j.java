package Db;

import Db.InterfaceC0762i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Db.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0763j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f2496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f2497e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F f2499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2500h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f2504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public W f2505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2507o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2493a = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f2498f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f2501i = new ArrayList();

    /* JADX INFO: renamed from: Db.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0762i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f2510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f2511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f2512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final F f2513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f2514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f2515h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f2516i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f2517j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Integer f2518k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final W f2519l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f2520m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f2521n;

        public final boolean a(b bVar) {
            return this.f2508a.equals(bVar.f2508a) && this.f2509b == bVar.f2509b && Objects.equals(this.f2510c, bVar.f2510c) && Objects.equals(this.f2511d, bVar.f2511d) && this.f2512e.equals(bVar.f2512e) && Objects.equals(this.f2513f, bVar.f2513f) && Objects.equals(this.f2514g, bVar.f2514g) && this.f2515h.equals(bVar.f2515h) && Objects.equals(this.f2516i, bVar.f2516i) && Objects.equals(this.f2517j, bVar.f2517j) && Objects.equals(this.f2518k, bVar.f2518k) && Objects.equals(this.f2519l, bVar.f2519l) && Objects.equals(this.f2520m, bVar.f2520m) && Objects.equals(this.f2521n, bVar.f2521n);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = this.f2508a.hashCode() + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Long.hashCode(this.f2509b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2510c);
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + Objects.hashCode(this.f2511d);
            int iHashCode5 = iHashCode4 + (iHashCode4 << 5) + this.f2512e.hashCode();
            int iHashCode6 = iHashCode5 + (iHashCode5 << 5) + Objects.hashCode(this.f2513f);
            int iHashCode7 = iHashCode6 + (iHashCode6 << 5) + Objects.hashCode(this.f2514g);
            int iHashCode8 = iHashCode7 + (iHashCode7 << 5) + this.f2515h.hashCode();
            int iHashCode9 = iHashCode8 + (iHashCode8 << 5) + Objects.hashCode(this.f2516i);
            int iHashCode10 = iHashCode9 + (iHashCode9 << 5) + Objects.hashCode(this.f2517j);
            int iHashCode11 = iHashCode10 + (iHashCode10 << 5) + Objects.hashCode(this.f2518k);
            int iHashCode12 = iHashCode11 + (iHashCode11 << 5) + Objects.hashCode(this.f2519l);
            int iHashCode13 = iHashCode12 + (iHashCode12 << 5) + Objects.hashCode(this.f2520m);
            return iHashCode13 + (iHashCode13 << 5) + Objects.hashCode(this.f2521n);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("IFrameVariant{");
            sb2.append("uri=");
            sb2.append(this.f2508a);
            sb2.append(", ");
            sb2.append("bandwidth=");
            sb2.append(this.f2509b);
            if (this.f2510c != null) {
                sb2.append(", ");
                sb2.append("averageBandwidth=");
                sb2.append(this.f2510c);
            }
            if (this.f2511d != null) {
                sb2.append(", ");
                sb2.append("score=");
                sb2.append(this.f2511d);
            }
            sb2.append(", ");
            sb2.append("codecs=");
            sb2.append(this.f2512e);
            if (this.f2513f != null) {
                sb2.append(", ");
                sb2.append("resolution=");
                sb2.append(this.f2513f);
            }
            if (this.f2514g != null) {
                sb2.append(", ");
                sb2.append("hdcpLevel=");
                sb2.append(this.f2514g);
            }
            sb2.append(", ");
            sb2.append("allowedCpc=");
            sb2.append(this.f2515h);
            if (this.f2516i != null) {
                sb2.append(", ");
                sb2.append("stableVariantId=");
                sb2.append(this.f2516i);
            }
            if (this.f2517j != null) {
                sb2.append(", ");
                sb2.append("video=");
                sb2.append(this.f2517j);
            }
            if (this.f2518k != null) {
                sb2.append(", ");
                sb2.append("programId=");
                sb2.append(this.f2518k);
            }
            if (this.f2519l != null) {
                sb2.append(", ");
                sb2.append("videoRange=");
                sb2.append(this.f2519l);
            }
            if (this.f2520m != null) {
                sb2.append(", ");
                sb2.append("name=");
                sb2.append(this.f2520m);
            }
            if (this.f2521n != null) {
                sb2.append(", ");
                sb2.append("language=");
                sb2.append(this.f2521n);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(AbstractC0763j abstractC0763j) {
            this.f2508a = abstractC0763j.f2494b;
            this.f2509b = abstractC0763j.f2495c;
            this.f2510c = abstractC0763j.f2496d;
            this.f2511d = abstractC0763j.f2497e;
            this.f2512e = AbstractC0763j.w(true, abstractC0763j.f2498f);
            this.f2513f = abstractC0763j.f2499g;
            this.f2514g = abstractC0763j.f2500h;
            this.f2515h = AbstractC0763j.w(true, abstractC0763j.f2501i);
            this.f2516i = abstractC0763j.f2502j;
            this.f2517j = abstractC0763j.f2503k;
            this.f2518k = abstractC0763j.f2504l;
            this.f2519l = abstractC0763j.f2505m;
            this.f2520m = abstractC0763j.f2506n;
            this.f2521n = abstractC0763j.f2507o;
        }
    }

    public AbstractC0763j() {
        if (!(this instanceof InterfaceC0762i.a)) {
            throw new UnsupportedOperationException("Use: new IFrameVariant.Builder()");
        }
    }

    public static List w(boolean z10, List list) {
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

    public InterfaceC0762i.a A(String str) {
        Objects.requireNonNull(str, "name");
        this.f2506n = str;
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a B(int i10) {
        this.f2504l = Integer.valueOf(i10);
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a C(F f10) {
        Objects.requireNonNull(f10, "resolution");
        this.f2499g = f10;
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a D(double d10) {
        this.f2497e = Double.valueOf(d10);
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a E(String str) {
        Objects.requireNonNull(str, "stableVariantId");
        this.f2502j = str;
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a F(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2494b = str;
        this.f2493a &= -2;
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a G(String str) {
        Objects.requireNonNull(str, "video");
        this.f2503k = str;
        return (InterfaceC0762i.a) this;
    }

    public final InterfaceC0762i.a H(W w10) {
        Objects.requireNonNull(w10, "videoRange");
        this.f2505m = w10;
        return (InterfaceC0762i.a) this;
    }

    public final InterfaceC0762i.a p(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = this.f2501i;
            Objects.requireNonNull(str, "allowedCpc element");
            list.add(str);
        }
        return (InterfaceC0762i.a) this;
    }

    public final InterfaceC0762i.a q(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = this.f2498f;
            Objects.requireNonNull(str, "codecs element");
            list.add(str);
        }
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a r(Iterable iterable) {
        this.f2501i.clear();
        return p(iterable);
    }

    public InterfaceC0762i.a s(long j10) {
        this.f2496d = Long.valueOf(j10);
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a t(long j10) {
        this.f2495c = j10;
        this.f2493a &= -3;
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i u() {
        if (this.f2493a == 0) {
            return new b();
        }
        throw new IllegalStateException(x());
    }

    public InterfaceC0762i.a v(Iterable iterable) {
        this.f2498f.clear();
        return q(iterable);
    }

    public final String x() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2493a & 1) != 0) {
            arrayList.add("uri");
        }
        if ((this.f2493a & 2) != 0) {
            arrayList.add("bandwidth");
        }
        return "Cannot build IFrameVariant, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0762i.a y(String str) {
        Objects.requireNonNull(str, "hdcpLevel");
        this.f2500h = str;
        return (InterfaceC0762i.a) this;
    }

    public InterfaceC0762i.a z(String str) {
        Objects.requireNonNull(str, "language");
        this.f2507o = str;
        return (InterfaceC0762i.a) this;
    }
}
