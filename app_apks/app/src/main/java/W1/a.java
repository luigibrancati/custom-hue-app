package W1;

import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1083x;
import java.util.HashMap;
import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC1083x f17675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f17676j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashMap f17681e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17682f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f17683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f17684h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f17685i;

        public b(String str, int i10, String str2, int i11) {
            this.f17677a = str;
            this.f17678b = i10;
            this.f17679c = str2;
            this.f17680d = i11;
        }

        public static String k(int i10, String str, int i11, int i12) {
            return M.G("%d %s/%d/%d", Integer.valueOf(i10), str, Integer.valueOf(i11), Integer.valueOf(i12));
        }

        public static String l(int i10) {
            AbstractC0853a.a(i10 < 96);
            if (i10 == 0) {
                return k(0, "PCMU", 8000, 1);
            }
            if (i10 == 8) {
                return k(8, "PCMA", 8000, 1);
            }
            if (i10 == 10) {
                return k(10, "L16", 44100, 2);
            }
            if (i10 == 11) {
                return k(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i10);
        }

        public b i(String str, String str2) {
            this.f17681e.put(str, str2);
            return this;
        }

        public a j() {
            try {
                return new a(this, AbstractC1083x.c(this.f17681e), this.f17681e.containsKey("rtpmap") ? c.a((String) M.i((String) this.f17681e.get("rtpmap"))) : c.a(l(this.f17680d)));
            } catch (D1.w e10) {
                throw new IllegalStateException(e10);
            }
        }

        public b m(int i10) {
            this.f17682f = i10;
            return this;
        }

        public b n(String str) {
            this.f17684h = str;
            return this;
        }

        public b o(String str) {
            this.f17685i = str;
            return this;
        }

        public b p(String str) {
            this.f17683g = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17689d;

        public c(int i10, String str, int i11, int i12) {
            this.f17686a = i10;
            this.f17687b = str;
            this.f17688c = i11;
            this.f17689d = i12;
        }

        public static c a(String str) {
            String[] strArrI1 = M.i1(str, StringUtils.SPACE);
            AbstractC0853a.a(strArrI1.length == 2);
            int iH = androidx.media3.exoplayer.rtsp.h.h(strArrI1[0]);
            String[] strArrH1 = M.h1(strArrI1[1].trim(), "/");
            AbstractC0853a.a(strArrH1.length >= 2);
            return new c(iH, strArrH1[0], androidx.media3.exoplayer.rtsp.h.h(strArrH1[1]), strArrH1.length == 3 ? androidx.media3.exoplayer.rtsp.h.h(strArrH1[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f17686a == cVar.f17686a && this.f17687b.equals(cVar.f17687b) && this.f17688c == cVar.f17688c && this.f17689d == cVar.f17689d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((217 + this.f17686a) * 31) + this.f17687b.hashCode()) * 31) + this.f17688c) * 31) + this.f17689d;
        }
    }

    public AbstractC1083x a() {
        String str = (String) this.f17675i.get("fmtp");
        if (str == null) {
            return AbstractC1083x.j();
        }
        String[] strArrI1 = M.i1(str, StringUtils.SPACE);
        AbstractC0853a.b(strArrI1.length == 2, str);
        String[] strArrSplit = strArrI1[1].split(";\\s?", 0);
        AbstractC1083x.a aVar = new AbstractC1083x.a();
        for (String str2 : strArrSplit) {
            String[] strArrI12 = M.i1(str2, "=");
            aVar.f(strArrI12[0], strArrI12[1]);
        }
        return aVar.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f17667a.equals(aVar.f17667a) && this.f17668b == aVar.f17668b && this.f17669c.equals(aVar.f17669c) && this.f17670d == aVar.f17670d && this.f17671e == aVar.f17671e && this.f17675i.equals(aVar.f17675i) && this.f17676j.equals(aVar.f17676j) && Objects.equals(this.f17672f, aVar.f17672f) && Objects.equals(this.f17673g, aVar.f17673g) && Objects.equals(this.f17674h, aVar.f17674h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.f17667a.hashCode()) * 31) + this.f17668b) * 31) + this.f17669c.hashCode()) * 31) + this.f17670d) * 31) + this.f17671e) * 31) + this.f17675i.hashCode()) * 31) + this.f17676j.hashCode()) * 31;
        String str = this.f17672f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17673g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17674h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public a(b bVar, AbstractC1083x abstractC1083x, c cVar) {
        this.f17667a = bVar.f17677a;
        this.f17668b = bVar.f17678b;
        this.f17669c = bVar.f17679c;
        this.f17670d = bVar.f17680d;
        this.f17672f = bVar.f17683g;
        this.f17673g = bVar.f17684h;
        this.f17671e = bVar.f17682f;
        this.f17674h = bVar.f17685i;
        this.f17675i = abstractC1083x;
        this.f17676j = cVar;
    }
}
