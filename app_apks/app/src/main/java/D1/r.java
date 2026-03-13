package D1;

import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1081v;
import K7.AbstractC1083x;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f1865i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1866j = M.z0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1867k = M.z0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1868l = M.z0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1869m = M.z0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f1870n = M.z0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f1871o = M.z0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f1873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f1874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f1875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f1876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f1877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f1878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f1879h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f1881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d.a f1883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.a f1884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f1885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f1886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC1081v f1887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f1888i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f1889j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public t f1890k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public g.a f1891l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public i f1892m;

        public r a() {
            h hVar;
            AbstractC0853a.g(this.f1884e.f1937b == null || this.f1884e.f1936a != null);
            Uri uri = this.f1881b;
            if (uri != null) {
                hVar = new h(uri, this.f1882c, this.f1884e.f1936a != null ? this.f1884e.i() : null, null, this.f1885f, this.f1886g, this.f1887h, this.f1888i, this.f1889j);
            } else {
                hVar = null;
            }
            String str = this.f1880a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarH = this.f1883d.h();
            g gVarF = this.f1891l.f();
            t tVar = this.f1890k;
            if (tVar == null) {
                tVar = t.f1996I;
            }
            return new r(str2, eVarH, hVar, gVarF, tVar, this.f1892m);
        }

        public c b(g gVar) {
            this.f1891l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f1880a = (String) AbstractC0853a.e(str);
            return this;
        }

        public c d(String str) {
            this.f1882c = str;
            return this;
        }

        public c e(List list) {
            this.f1887h = AbstractC1081v.v(list);
            return this;
        }

        public c f(Object obj) {
            this.f1888i = obj;
            return this;
        }

        public c g(Uri uri) {
            this.f1881b = uri;
            return this;
        }

        public c h(String str) {
            return g(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f1883d = new d.a();
            this.f1884e = new f.a();
            this.f1885f = Collections.EMPTY_LIST;
            this.f1887h = AbstractC1081v.z();
            this.f1891l = new g.a();
            this.f1892m = i.f1977d;
            this.f1889j = -9223372036854775807L;
        }

        public c(r rVar) {
            f.a aVar;
            this();
            this.f1883d = rVar.f1877f.a();
            this.f1880a = rVar.f1872a;
            this.f1890k = rVar.f1876e;
            this.f1891l = rVar.f1875d.a();
            this.f1892m = rVar.f1879h;
            h hVar = rVar.f1873b;
            if (hVar != null) {
                this.f1886g = hVar.f1972e;
                this.f1882c = hVar.f1969b;
                this.f1881b = hVar.f1968a;
                this.f1885f = hVar.f1971d;
                this.f1887h = hVar.f1973f;
                this.f1888i = hVar.f1975h;
                f fVar = hVar.f1970c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f1884e = aVar;
                this.f1889j = hVar.f1976i;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f1893i = new a().g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f1894j = M.z0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f1895k = M.z0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f1896l = M.z0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f1897m = M.z0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f1898n = M.z0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f1899o = M.z0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f1900p = M.z0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f1901q = M.z0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f1904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f1905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f1906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f1907f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f1908g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f1909h;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f1910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f1911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f1912c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f1913d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f1914e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f1915f;

            public d g() {
                return new d(this);
            }

            public e h() {
                return new e(this);
            }

            public a() {
                this.f1911b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f1910a = dVar.f1903b;
                this.f1911b = dVar.f1905d;
                this.f1912c = dVar.f1906e;
                this.f1913d = dVar.f1907f;
                this.f1914e = dVar.f1908g;
                this.f1915f = dVar.f1909h;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1903b == dVar.f1903b && this.f1905d == dVar.f1905d && this.f1906e == dVar.f1906e && this.f1907f == dVar.f1907f && this.f1908g == dVar.f1908g && this.f1909h == dVar.f1909h;
        }

        public int hashCode() {
            long j10 = this.f1903b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f1905d;
            return ((((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f1906e ? 1 : 0)) * 31) + (this.f1907f ? 1 : 0)) * 31) + (this.f1908g ? 1 : 0)) * 31) + (this.f1909h ? 1 : 0);
        }

        public d(a aVar) {
            this.f1902a = M.o1(aVar.f1910a);
            this.f1904c = M.o1(aVar.f1911b);
            this.f1903b = aVar.f1910a;
            this.f1905d = aVar.f1911b;
            this.f1906e = aVar.f1912c;
            this.f1907f = aVar.f1913d;
            this.f1908g = aVar.f1914e;
            this.f1909h = aVar.f1915f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f1916r = new d.a().h();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f1917l = M.z0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f1918m = M.z0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f1919n = M.z0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f1920o = M.z0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f1921p = M.z0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f1922q = M.z0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f1923r = M.z0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f1924s = M.z0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f1925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f1926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f1927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractC1083x f1928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AbstractC1083x f1929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f1930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f1931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f1932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AbstractC1081v f1933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AbstractC1081v f1934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final byte[] f1935k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f1935k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f1925a.equals(fVar.f1925a) && Objects.equals(this.f1927c, fVar.f1927c) && Objects.equals(this.f1929e, fVar.f1929e) && this.f1930f == fVar.f1930f && this.f1932h == fVar.f1932h && this.f1931g == fVar.f1931g && this.f1934j.equals(fVar.f1934j) && Arrays.equals(this.f1935k, fVar.f1935k);
        }

        public int hashCode() {
            int iHashCode = this.f1925a.hashCode() * 31;
            Uri uri = this.f1927c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f1929e.hashCode()) * 31) + (this.f1930f ? 1 : 0)) * 31) + (this.f1932h ? 1 : 0)) * 31) + (this.f1931g ? 1 : 0)) * 31) + this.f1934j.hashCode()) * 31) + Arrays.hashCode(this.f1935k);
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public UUID f1936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Uri f1937b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public AbstractC1083x f1938c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f1939d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f1940e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f1941f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public AbstractC1081v f1942g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public byte[] f1943h;

            public f i() {
                return new f(this);
            }

            public a() {
                this.f1938c = AbstractC1083x.j();
                this.f1940e = true;
                this.f1942g = AbstractC1081v.z();
            }

            public a(f fVar) {
                this.f1936a = fVar.f1925a;
                this.f1937b = fVar.f1927c;
                this.f1938c = fVar.f1929e;
                this.f1939d = fVar.f1930f;
                this.f1940e = fVar.f1931g;
                this.f1941f = fVar.f1932h;
                this.f1942g = fVar.f1934j;
                this.f1943h = fVar.f1935k;
            }
        }

        public f(a aVar) {
            AbstractC0853a.g((aVar.f1941f && aVar.f1937b == null) ? false : true);
            UUID uuid = (UUID) AbstractC0853a.e(aVar.f1936a);
            this.f1925a = uuid;
            this.f1926b = uuid;
            this.f1927c = aVar.f1937b;
            this.f1928d = aVar.f1938c;
            this.f1929e = aVar.f1938c;
            this.f1930f = aVar.f1939d;
            this.f1932h = aVar.f1941f;
            this.f1931g = aVar.f1940e;
            this.f1933i = aVar.f1942g;
            this.f1934j = aVar.f1942g;
            this.f1935k = aVar.f1943h != null ? Arrays.copyOf(aVar.f1943h, aVar.f1943h.length) : null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f1944f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f1945g = M.z0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f1946h = M.z0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f1947i = M.z0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f1948j = M.z0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f1949k = M.z0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f1952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f1953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f1954e;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f1955a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f1956b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f1957c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f1958d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f1959e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f1957c = j10;
                return this;
            }

            public a h(float f10) {
                this.f1959e = f10;
                return this;
            }

            public a i(long j10) {
                this.f1956b = j10;
                return this;
            }

            public a j(float f10) {
                this.f1958d = f10;
                return this;
            }

            public a k(long j10) {
                this.f1955a = j10;
                return this;
            }

            public a() {
                this.f1955a = -9223372036854775807L;
                this.f1956b = -9223372036854775807L;
                this.f1957c = -9223372036854775807L;
                this.f1958d = -3.4028235E38f;
                this.f1959e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f1955a = gVar.f1950a;
                this.f1956b = gVar.f1951b;
                this.f1957c = gVar.f1952c;
                this.f1958d = gVar.f1953d;
                this.f1959e = gVar.f1954e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f1950a == gVar.f1950a && this.f1951b == gVar.f1951b && this.f1952c == gVar.f1952c && this.f1953d == gVar.f1953d && this.f1954e == gVar.f1954e;
        }

        public int hashCode() {
            long j10 = this.f1950a;
            long j11 = this.f1951b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f1952c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f1953d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f1954e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        public g(a aVar) {
            this(aVar.f1955a, aVar.f1956b, aVar.f1957c, aVar.f1958d, aVar.f1959e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f1950a = j10;
            this.f1951b = j11;
            this.f1952c = j12;
            this.f1953d = f10;
            this.f1954e = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f1960j = M.z0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f1961k = M.z0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f1962l = M.z0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f1963m = M.z0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f1964n = M.z0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f1965o = M.z0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f1966p = M.z0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f1967q = M.z0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f1968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f1970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f1971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f1972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AbstractC1081v f1973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f1974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f1975h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f1976i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f1968a.equals(hVar.f1968a) && Objects.equals(this.f1969b, hVar.f1969b) && Objects.equals(this.f1970c, hVar.f1970c) && this.f1971d.equals(hVar.f1971d) && Objects.equals(this.f1972e, hVar.f1972e) && this.f1973f.equals(hVar.f1973f) && Objects.equals(this.f1975h, hVar.f1975h) && this.f1976i == hVar.f1976i;
        }

        public int hashCode() {
            int iHashCode = this.f1968a.hashCode() * 31;
            String str = this.f1969b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f1970c;
            int iHashCode3 = (((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f1971d.hashCode()) * 31;
            String str2 = this.f1972e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f1973f.hashCode()) * 31;
            Object obj = this.f1975h;
            return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f1976i);
        }

        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC1081v abstractC1081v, Object obj, long j10) {
            this.f1968a = uri;
            this.f1969b = v.u(str);
            this.f1970c = fVar;
            this.f1971d = list;
            this.f1972e = str2;
            this.f1973f = abstractC1081v;
            AbstractC1081v.a aVarR = AbstractC1081v.r();
            for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
                aVarR.a(((k) abstractC1081v.get(i10)).a().b());
            }
            this.f1974g = aVarR.k();
            this.f1975h = obj;
            this.f1976i = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f1977d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f1978e = M.z0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f1979f = M.z0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f1980g = M.z0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f1981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f1983c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f1984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f1985b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Bundle f1986c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f1981a, iVar.f1981a) && Objects.equals(this.f1982b, iVar.f1982b)) {
                if ((this.f1983c == null) == (iVar.f1983c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f1981a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f1982b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f1983c != null ? 1 : 0);
        }

        public i(a aVar) {
            this.f1981a = aVar.f1984a;
            this.f1982b = aVar.f1985b;
            this.f1983c = aVar.f1986c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends k {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f1987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f1989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f1992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f1993g;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public abstract j b();
        }

        public abstract a a();
    }

    public static r b(String str) {
        return new c().h(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f1872a, rVar.f1872a) && this.f1877f.equals(rVar.f1877f) && Objects.equals(this.f1873b, rVar.f1873b) && Objects.equals(this.f1875d, rVar.f1875d) && Objects.equals(this.f1876e, rVar.f1876e) && Objects.equals(this.f1879h, rVar.f1879h);
    }

    public int hashCode() {
        int iHashCode = this.f1872a.hashCode() * 31;
        h hVar = this.f1873b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f1875d.hashCode()) * 31) + this.f1877f.hashCode()) * 31) + this.f1876e.hashCode()) * 31) + this.f1879h.hashCode();
    }

    public r(String str, e eVar, h hVar, g gVar, t tVar, i iVar) {
        this.f1872a = str;
        this.f1873b = hVar;
        this.f1874c = hVar;
        this.f1875d = gVar;
        this.f1876e = tVar;
        this.f1877f = eVar;
        this.f1878g = eVar;
        this.f1879h = iVar;
    }
}
