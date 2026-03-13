package Db;

import Db.U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f2399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f2400d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f2402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f2403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2404h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f2411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f2413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W f2414r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2397a = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2401e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f2405i = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f2416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f2417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f2418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F f2419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Double f2420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f2421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f2422h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f2423i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f2424j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f2425k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f2426l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f2427m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Boolean f2428n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f2429o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f2430p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final W f2431q;

        @Override // Db.U
        public String a() {
            return this.f2429o;
        }

        public final boolean b(b bVar) {
            return this.f2415a == bVar.f2415a && Objects.equals(this.f2416b, bVar.f2416b) && Objects.equals(this.f2417c, bVar.f2417c) && this.f2418d.equals(bVar.f2418d) && Objects.equals(this.f2419e, bVar.f2419e) && Objects.equals(this.f2420f, bVar.f2420f) && Objects.equals(this.f2421g, bVar.f2421g) && this.f2422h.equals(bVar.f2422h) && Objects.equals(this.f2423i, bVar.f2423i) && Objects.equals(this.f2424j, bVar.f2424j) && Objects.equals(this.f2425k, bVar.f2425k) && Objects.equals(this.f2426l, bVar.f2426l) && Objects.equals(this.f2427m, bVar.f2427m) && Objects.equals(this.f2428n, bVar.f2428n) && this.f2429o.equals(bVar.f2429o) && Objects.equals(this.f2430p, bVar.f2430p) && Objects.equals(this.f2431q, bVar.f2431q);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && b((b) obj);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f2415a) + 177573;
            int iHashCode2 = iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2416b);
            int iHashCode3 = iHashCode2 + (iHashCode2 << 5) + Objects.hashCode(this.f2417c);
            int iHashCode4 = iHashCode3 + (iHashCode3 << 5) + this.f2418d.hashCode();
            int iHashCode5 = iHashCode4 + (iHashCode4 << 5) + Objects.hashCode(this.f2419e);
            int iHashCode6 = iHashCode5 + (iHashCode5 << 5) + Objects.hashCode(this.f2420f);
            int iHashCode7 = iHashCode6 + (iHashCode6 << 5) + Objects.hashCode(this.f2421g);
            int iHashCode8 = iHashCode7 + (iHashCode7 << 5) + this.f2422h.hashCode();
            int iHashCode9 = iHashCode8 + (iHashCode8 << 5) + Objects.hashCode(this.f2423i);
            int iHashCode10 = iHashCode9 + (iHashCode9 << 5) + Objects.hashCode(this.f2424j);
            int iHashCode11 = iHashCode10 + (iHashCode10 << 5) + Objects.hashCode(this.f2425k);
            int iHashCode12 = iHashCode11 + (iHashCode11 << 5) + Objects.hashCode(this.f2426l);
            int iHashCode13 = iHashCode12 + (iHashCode12 << 5) + Objects.hashCode(this.f2427m);
            int iHashCode14 = iHashCode13 + (iHashCode13 << 5) + Objects.hashCode(this.f2428n);
            int iHashCode15 = iHashCode14 + (iHashCode14 << 5) + this.f2429o.hashCode();
            int iHashCode16 = iHashCode15 + (iHashCode15 << 5) + Objects.hashCode(this.f2430p);
            return iHashCode16 + (iHashCode16 << 5) + Objects.hashCode(this.f2431q);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Variant{");
            sb2.append("bandwidth=");
            sb2.append(this.f2415a);
            if (this.f2416b != null) {
                sb2.append(", ");
                sb2.append("averageBandwidth=");
                sb2.append(this.f2416b);
            }
            if (this.f2417c != null) {
                sb2.append(", ");
                sb2.append("score=");
                sb2.append(this.f2417c);
            }
            sb2.append(", ");
            sb2.append("codecs=");
            sb2.append(this.f2418d);
            if (this.f2419e != null) {
                sb2.append(", ");
                sb2.append("resolution=");
                sb2.append(this.f2419e);
            }
            if (this.f2420f != null) {
                sb2.append(", ");
                sb2.append("frameRate=");
                sb2.append(this.f2420f);
            }
            if (this.f2421g != null) {
                sb2.append(", ");
                sb2.append("hdcpLevel=");
                sb2.append(this.f2421g);
            }
            sb2.append(", ");
            sb2.append("allowedCpc=");
            sb2.append(this.f2422h);
            if (this.f2423i != null) {
                sb2.append(", ");
                sb2.append("stableVariantId=");
                sb2.append(this.f2423i);
            }
            if (this.f2424j != null) {
                sb2.append(", ");
                sb2.append("audio=");
                sb2.append(this.f2424j);
            }
            if (this.f2425k != null) {
                sb2.append(", ");
                sb2.append("video=");
                sb2.append(this.f2425k);
            }
            if (this.f2426l != null) {
                sb2.append(", ");
                sb2.append("subtitles=");
                sb2.append(this.f2426l);
            }
            if (this.f2427m != null) {
                sb2.append(", ");
                sb2.append("closedCaptions=");
                sb2.append(this.f2427m);
            }
            if (this.f2428n != null) {
                sb2.append(", ");
                sb2.append("closedCaptionsNone=");
                sb2.append(this.f2428n);
            }
            sb2.append(", ");
            sb2.append("uri=");
            sb2.append(this.f2429o);
            if (this.f2430p != null) {
                sb2.append(", ");
                sb2.append("programId=");
                sb2.append(this.f2430p);
            }
            if (this.f2431q != null) {
                sb2.append(", ");
                sb2.append("videoRange=");
                sb2.append(this.f2431q);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(V v10) {
            this.f2415a = v10.f2398b;
            this.f2416b = v10.f2399c;
            this.f2417c = v10.f2400d;
            this.f2418d = V.C(true, v10.f2401e);
            this.f2419e = v10.f2402f;
            this.f2420f = v10.f2403g;
            this.f2421g = v10.f2404h;
            this.f2422h = V.C(true, v10.f2405i);
            this.f2423i = v10.f2406j;
            this.f2424j = v10.f2407k;
            this.f2425k = v10.f2408l;
            this.f2426l = v10.f2409m;
            this.f2427m = v10.f2410n;
            this.f2428n = v10.f2411o;
            this.f2429o = v10.f2412p;
            this.f2430p = v10.f2413q;
            this.f2431q = v10.f2414r;
        }
    }

    public V() {
        if (!(this instanceof U.a)) {
            throw new UnsupportedOperationException("Use: new Variant.Builder()");
        }
    }

    public static List C(boolean z10, List list) {
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

    public U.a A(boolean z10) {
        this.f2411o = Boolean.valueOf(z10);
        return (U.a) this;
    }

    public U.a B(Iterable iterable) {
        this.f2401e.clear();
        return t(iterable);
    }

    public final String D() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2397a & 1) != 0) {
            arrayList.add("bandwidth");
        }
        if ((this.f2397a & 2) != 0) {
            arrayList.add("uri");
        }
        return "Cannot build Variant, some of required attributes are not set " + arrayList;
    }

    public U.a E(double d10) {
        this.f2403g = Double.valueOf(d10);
        return (U.a) this;
    }

    public U.a F(String str) {
        Objects.requireNonNull(str, "hdcpLevel");
        this.f2404h = str;
        return (U.a) this;
    }

    public U.a G(int i10) {
        this.f2413q = Integer.valueOf(i10);
        return (U.a) this;
    }

    public U.a H(F f10) {
        Objects.requireNonNull(f10, "resolution");
        this.f2402f = f10;
        return (U.a) this;
    }

    public U.a I(double d10) {
        this.f2400d = Double.valueOf(d10);
        return (U.a) this;
    }

    public U.a J(String str) {
        Objects.requireNonNull(str, "stableVariantId");
        this.f2406j = str;
        return (U.a) this;
    }

    public U.a K(String str) {
        Objects.requireNonNull(str, "subtitles");
        this.f2409m = str;
        return (U.a) this;
    }

    public U.a L(String str) {
        Objects.requireNonNull(str, "uri");
        this.f2412p = str;
        this.f2397a &= -3;
        return (U.a) this;
    }

    public U.a M(String str) {
        Objects.requireNonNull(str, "video");
        this.f2408l = str;
        return (U.a) this;
    }

    public final U.a N(W w10) {
        Objects.requireNonNull(w10, "videoRange");
        this.f2414r = w10;
        return (U.a) this;
    }

    public final U.a s(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = this.f2405i;
            Objects.requireNonNull(str, "allowedCpc element");
            list.add(str);
        }
        return (U.a) this;
    }

    public final U.a t(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = this.f2401e;
            Objects.requireNonNull(str, "codecs element");
            list.add(str);
        }
        return (U.a) this;
    }

    public U.a u(Iterable iterable) {
        this.f2405i.clear();
        return s(iterable);
    }

    public U.a v(String str) {
        Objects.requireNonNull(str, MediaStreamTrack.AUDIO_TRACK_KIND);
        this.f2407k = str;
        return (U.a) this;
    }

    public U.a w(long j10) {
        this.f2399c = Long.valueOf(j10);
        return (U.a) this;
    }

    public U.a x(long j10) {
        this.f2398b = j10;
        this.f2397a &= -2;
        return (U.a) this;
    }

    public U y() {
        if (this.f2397a == 0) {
            return new b();
        }
        throw new IllegalStateException(D());
    }

    public U.a z(String str) {
        Objects.requireNonNull(str, "closedCaptions");
        this.f2410n = str;
        return (U.a) this;
    }
}
