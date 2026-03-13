package pe;

import com.fasterxml.jackson.core.JsonPointer;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f42831k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f42832l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f42833m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f42834n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f42835o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f42844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f42845j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public final boolean b(String str, String str2) {
            if (AbstractC4862t.a(str, str2)) {
                return true;
            }
            return Od.C.D(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !qe.f.a(str);
        }

        public final n c(v url, String setCookie) {
            AbstractC4862t.e(url, "url");
            AbstractC4862t.e(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final n d(long j10, v url, String setCookie) {
            long j11;
            AbstractC4862t.e(url, "url");
            AbstractC4862t.e(setCookie, "setCookie");
            int iL = qe.m.l(setCookie, ';', 0, 0, 6, null);
            int iL2 = qe.m.l(setCookie, '=', 0, iL, 2, null);
            n nVar = null;
            if (iL2 == iL) {
                return null;
            }
            String strI = qe.m.I(setCookie, 0, iL2, 1, null);
            if (strI.length() == 0 || qe.m.r(strI) != -1) {
                return null;
            }
            String strH = qe.m.H(setCookie, iL2 + 1, iL);
            if (qe.m.r(strH) != -1) {
                return null;
            }
            int i10 = iL + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            String str2 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iJ = qe.m.j(setCookie, ';', i10, length);
                int iJ2 = qe.m.j(setCookie, '=', i10, iJ);
                String strH2 = qe.m.H(setCookie, i10, iJ2);
                String strH3 = iJ2 < iJ ? qe.m.H(setCookie, iJ2 + 1, iJ) : "";
                n nVar2 = nVar;
                if (Od.C.E(strH2, "expires", true)) {
                    try {
                        jG = g(strH3, 0, strH3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (Od.C.E(strH2, "max-age", true)) {
                    jH = h(strH3);
                    z11 = true;
                } else if (Od.C.E(strH2, "domain", true)) {
                    strF = f(strH3);
                    z13 = false;
                } else if (Od.C.E(strH2, "path", true)) {
                    str = strH3;
                } else if (Od.C.E(strH2, "secure", true)) {
                    z12 = true;
                } else if (Od.C.E(strH2, "httponly", true)) {
                    z10 = true;
                } else if (Od.C.E(strH2, "samesite", true)) {
                    str2 = strH3;
                }
                i10 = iJ + 1;
                nVar = nVar2;
            }
            n nVar3 = nVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strH4 = url.h();
            if (strF == null) {
                strF = strH4;
            } else if (!b(strH4, strF)) {
                return nVar3;
            }
            if (strH4.length() != strF.length() && okhttp3.internal.publicsuffix.a.f41569g.c().c(strF) == null) {
                return nVar3;
            }
            String strSubstring = "/";
            if (str == null || !Od.C.P(str, "/", false, 2, nVar3)) {
                String strC = url.c();
                int iN0 = Od.F.n0(strC, JsonPointer.SEPARATOR, 0, false, 6, null);
                if (iN0 != 0) {
                    strSubstring = strC.substring(0, iN0);
                    AbstractC4862t.d(strSubstring, "substring(...)");
                }
                str = strSubstring;
            }
            return new n(strI, strH, j11, strF, str, z12, z10, z11, z13, str2, null);
        }

        public final List e(v url, u headers) {
            AbstractC4862t.e(url, "url");
            AbstractC4862t.e(headers, "headers");
            List listK = headers.k("Set-Cookie");
            int size = listK.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                n nVarC = c(url, (String) listK.get(i10));
                if (nVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(nVarC);
                }
            }
            if (arrayList == null) {
                return C4206t.k();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC4862t.b(listUnmodifiableList);
            return listUnmodifiableList;
        }

        public final String f(String str) {
            if (Od.C.D(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strK = qe.f.k(Od.F.B0(str, "."));
            if (strK != null) {
                return strK;
            }
            throw new IllegalArgumentException();
        }

        public final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = n.f42835o.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iI0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(n.f42835o).matches()) {
                    String strGroup = matcher.group(1);
                    AbstractC4862t.d(strGroup, "group(...)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    AbstractC4862t.d(strGroup2, "group(...)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    AbstractC4862t.d(strGroup3, "group(...)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(n.f42834n).matches()) {
                    String strGroup4 = matcher.group(1);
                    AbstractC4862t.d(strGroup4, "group(...)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iI0 == -1 && matcher.usePattern(n.f42833m).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC4862t.d(strGroup5, "group(...)");
                    Locale US = Locale.US;
                    AbstractC4862t.d(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    AbstractC4862t.d(lowerCase, "toLowerCase(...)");
                    String strPattern = n.f42833m.pattern();
                    AbstractC4862t.d(strPattern, "pattern(...)");
                    iI0 = Od.F.i0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(n.f42832l).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC4862t.d(strGroup6, "group(...)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iI0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(qe.p.f43481d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iI0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Od.o("-?\\d+").i(str)) {
                    return Od.C.P(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, AbstractC4854k abstractC4854k) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }

    public final String e() {
        return this.f42836a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC4862t.a(nVar.f42836a, this.f42836a) && AbstractC4862t.a(nVar.f42837b, this.f42837b) && nVar.f42838c == this.f42838c && AbstractC4862t.a(nVar.f42839d, this.f42839d) && AbstractC4862t.a(nVar.f42840e, this.f42840e) && nVar.f42841f == this.f42841f && nVar.f42842g == this.f42842g && nVar.f42843h == this.f42843h && nVar.f42844i == this.f42844i && AbstractC4862t.a(nVar.f42845j, this.f42845j);
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42836a);
        sb2.append('=');
        sb2.append(this.f42837b);
        if (this.f42843h) {
            if (this.f42838c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(ve.c.b(new Date(this.f42838c)));
            }
        }
        if (!this.f42844i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f42839d);
        }
        sb2.append("; path=");
        sb2.append(this.f42840e);
        if (this.f42841f) {
            sb2.append("; secure");
        }
        if (this.f42842g) {
            sb2.append("; httponly");
        }
        if (this.f42845j != null) {
            sb2.append("; samesite=");
            sb2.append(this.f42845j);
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final String g() {
        return this.f42837b;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.f42836a.hashCode()) * 31) + this.f42837b.hashCode()) * 31) + Long.hashCode(this.f42838c)) * 31) + this.f42839d.hashCode()) * 31) + this.f42840e.hashCode()) * 31) + Boolean.hashCode(this.f42841f)) * 31) + Boolean.hashCode(this.f42842g)) * 31) + Boolean.hashCode(this.f42843h)) * 31) + Boolean.hashCode(this.f42844i)) * 31;
        String str = this.f42845j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return f(false);
    }

    public n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f42836a = str;
        this.f42837b = str2;
        this.f42838c = j10;
        this.f42839d = str3;
        this.f42840e = str4;
        this.f42841f = z10;
        this.f42842g = z11;
        this.f42843h = z12;
        this.f42844i = z13;
        this.f42845j = str5;
    }
}
