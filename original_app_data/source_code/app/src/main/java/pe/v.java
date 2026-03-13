package pe;

import Od.H;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import gc.C4206t;
import gc.C4207u;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f42873j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f42879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f42880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f42881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f42882i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f42883a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f42886d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f42889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f42890h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f42884b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f42885c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f42887e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f42888f = C4206t.q("");

        public final int A(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public final void B(List list, StringBuilder sb2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append((String) list.get(i10));
            }
        }

        public final List C(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iH0 = Od.F.h0(str2, '&', i10, false, 4, null);
                if (iH0 == -1) {
                    iH0 = str2.length();
                }
                int iH02 = Od.F.h0(str2, '=', i10, false, 4, null);
                if (iH02 == -1 || iH02 > iH0) {
                    String strSubstring = str2.substring(i10, iH0);
                    AbstractC4862t.d(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iH02);
                    AbstractC4862t.d(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iH02 + 1, iH0);
                    AbstractC4862t.d(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iH0 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final a D(String username) {
            AbstractC4862t.e(username, "username");
            this.f42884b = Ee.a.b(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final v a() {
            ArrayList arrayList;
            String str = this.f42883a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strG = Ee.a.g(this.f42884b, 0, 0, false, 7, null);
            String strG2 = Ee.a.g(this.f42885c, 0, 0, false, 7, null);
            String str2 = this.f42886d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f42888f;
            ArrayList arrayList2 = new ArrayList(C4207u.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Ee.a.g((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f42889g;
            if (list2 != null) {
                arrayList = new ArrayList(C4207u.v(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Ee.a.g(str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f42890h;
            return new v(str, strG, strG2, str2, iB, arrayList2, arrayList, str4 != null ? Ee.a.g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final int b() {
            int i10 = this.f42887e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = v.f42873j;
            String str = this.f42883a;
            AbstractC4862t.b(str);
            return bVar.b(str);
        }

        public final a c(String str) {
            String strB;
            this.f42889g = (str == null || (strB = Ee.a.b(str, 0, 0, " \"'<>#", true, false, true, false, 83, null)) == null) ? null : C(strB);
            return this;
        }

        public final a d(String str) {
            this.f42890h = str != null ? Ee.a.b(str, 0, 0, "", false, false, false, true, 59, null) : null;
            return this;
        }

        public final List e() {
            return this.f42888f;
        }

        public final a f(String host) {
            AbstractC4862t.e(host, "host");
            String strK = qe.f.k(Ee.a.g(host, 0, 0, false, 7, null));
            if (strK != null) {
                this.f42886d = strK;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final boolean g(String str) {
            return AbstractC4862t.a(str, ".") || Od.C.E(str, "%2e", true);
        }

        public final boolean h(String str) {
            return AbstractC4862t.a(str, "..") || Od.C.E(str, "%2e.", true) || Od.C.E(str, ".%2e", true) || Od.C.E(str, "%2e%2e", true);
        }

        public final a i(v vVar, String str) {
            String str2;
            int iK;
            boolean z10;
            int i10;
            int i11;
            char c10;
            String input = str;
            AbstractC4862t.e(input, "input");
            int iT = qe.m.t(input, 0, 0, 3, null);
            int iV = qe.m.v(input, iT, 0, 2, null);
            int iT2 = t(input, iT, iV);
            boolean z11 = true;
            if (iT2 != -1) {
                if (Od.C.M(input, "https:", iT, true)) {
                    this.f42883a = "https";
                    iT += 6;
                } else {
                    if (!Od.C.M(input, "http:", iT, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iT2);
                        AbstractC4862t.d(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f42883a = "http";
                    iT += 5;
                }
            } else {
                if (vVar == null) {
                    if (input.length() > 6) {
                        str2 = H.m1(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f42883a = vVar.q();
            }
            int iA = A(input, iT, iV);
            char c11 = '?';
            char c12 = '#';
            if (iA >= 2 || vVar == null || !AbstractC4862t.a(vVar.q(), this.f42883a)) {
                boolean z12 = false;
                boolean z13 = false;
                int i12 = iT + iA;
                while (true) {
                    iK = qe.m.k(input, "@/\\?#", i12, iV);
                    byte bCharAt = iK != iV ? input.charAt(iK) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c12 || bCharAt == 47 || bCharAt == 92 || bCharAt == c11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z12) {
                            z10 = z11;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f42885c);
                            sb3.append("%40");
                            input = str;
                            i10 = iK;
                            sb3.append(Ee.a.b(input, i12, iK, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.f42885c = sb3.toString();
                        } else {
                            int iJ = qe.m.j(input, ':', i12, iK);
                            z10 = z11;
                            String strB = Ee.a.b(input, i12, iJ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z13) {
                                strB = this.f42884b + "%40" + strB;
                            }
                            this.f42884b = strB;
                            if (iJ != iK) {
                                i11 = iK;
                                this.f42885c = Ee.a.b(str, iJ + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z12 = z10;
                            } else {
                                i11 = iK;
                            }
                            input = str;
                            i10 = i11;
                            z13 = z10;
                        }
                        i12 = i10 + 1;
                        z11 = z10;
                        c12 = '#';
                        c11 = '?';
                    }
                }
                int iN = n(input, i12, iK);
                int i13 = iN + 1;
                if (i13 < iK) {
                    this.f42886d = qe.f.k(Ee.a.g(input, i12, iN, false, 4, null));
                    int iJ2 = j(input, i13, iK);
                    this.f42887e = iJ2;
                    if (iJ2 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i13, iK);
                        AbstractC4862t.d(strSubstring2, "substring(...)");
                        sb4.append(strSubstring2);
                        sb4.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.f42886d = qe.f.k(Ee.a.g(input, i12, iN, false, 4, null));
                    b bVar = v.f42873j;
                    String str3 = this.f42883a;
                    AbstractC4862t.b(str3);
                    this.f42887e = bVar.b(str3);
                }
                if (this.f42886d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i12, iN);
                    AbstractC4862t.d(strSubstring3, "substring(...)");
                    sb5.append(strSubstring3);
                    sb5.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iT = iK;
            } else {
                this.f42884b = vVar.f();
                this.f42885c = vVar.b();
                this.f42886d = vVar.h();
                this.f42887e = vVar.m();
                this.f42888f.clear();
                this.f42888f.addAll(vVar.d());
                if (iT == iV || input.charAt(iT) == '#') {
                    c(vVar.e());
                }
            }
            int iK2 = qe.m.k(input, "?#", iT, iV);
            r(input, iT, iK2);
            if (iK2 >= iV || input.charAt(iK2) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iJ3 = qe.m.j(input, '#', iK2, iV);
                this.f42889g = C(Ee.a.b(input, iK2 + 1, iJ3, " \"'<>#", true, false, true, false, 80, null));
                iK2 = iJ3;
            }
            if (iK2 < iV && input.charAt(iK2) == c10) {
                this.f42890h = Ee.a.b(input, iK2 + 1, iV, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final int j(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(Ee.a.b(str, i10, i11, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > i12 || i12 >= 65536) {
                return -1;
            }
            return i12;
        }

        public final a k(String password) {
            AbstractC4862t.e(password, "password");
            this.f42885c = Ee.a.b(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final void l() {
            if (((String) this.f42888f.remove(r0.size() - 1)).length() != 0 || this.f42888f.isEmpty()) {
                this.f42888f.add("");
            } else {
                this.f42888f.set(r2.size() - 1, "");
            }
        }

        public final a m(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f42887e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final int n(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                } else if (cCharAt == ':') {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public final void o(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = Ee.a.b(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, 112, null);
            if (g(strB)) {
                return;
            }
            if (h(strB)) {
                l();
                return;
            }
            if (((CharSequence) this.f42888f.get(r12.size() - 1)).length() == 0) {
                this.f42888f.set(r12.size() - 1, strB);
            } else {
                this.f42888f.add(strB);
            }
            if (z10) {
                this.f42888f.add("");
            }
        }

        public final a p(String str) {
            String strB;
            this.f42889g = (str == null || (strB = Ee.a.b(str, 0, 0, " \"'<>#", false, false, true, false, 91, null)) == null) ? null : C(strB);
            return this;
        }

        public final a q() {
            String str = this.f42886d;
            this.f42886d = str != null ? new Od.o("[\"<>^`{|}]").j(str, "") : null;
            int size = this.f42888f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f42888f;
                list.set(i10, Ee.a.b((String) list.get(i10), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List list2 = this.f42889g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? Ee.a.b(str2, 0, 0, "\\^`{|}", true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.f42890h;
            this.f42890h = str3 != null ? Ee.a.b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null) : null;
            return this;
        }

        public final void r(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f42888f.clear();
                this.f42888f.add("");
                i10++;
            } else {
                List list = this.f42888f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iK = qe.m.k(str, "/\\", i12, i11);
                boolean z10 = iK < i11;
                a aVar = this;
                String str2 = str;
                aVar.o(str2, i12, iK, z10, true);
                if (z10) {
                    i12 = iK + 1;
                    this = aVar;
                    str = str2;
                } else {
                    this = aVar;
                    str = str2;
                    i12 = iK;
                }
            }
        }

        public final a s(String scheme) {
            AbstractC4862t.e(scheme, "scheme");
            if (Od.C.E(scheme, "http", true)) {
                this.f42883a = "http";
                return this;
            }
            if (Od.C.E(scheme, "https", true)) {
                this.f42883a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final int t(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((AbstractC4862t.f(cCharAt, 97) >= 0 && AbstractC4862t.f(cCharAt, 122) <= 0) || (AbstractC4862t.f(cCharAt, 65) >= 0 && AbstractC4862t.f(cCharAt, 90) <= 0)) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f42883a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f42884b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f42885c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f42884b
                r0.append(r1)
                java.lang.String r1 = r6.f42885c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f42885c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f42886d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.AbstractC4862t.b(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = Od.F.U(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f42886d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f42886d
                r0.append(r1)
            L69:
                int r1 = r6.f42887e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f42883a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.b()
                java.lang.String r3 = r6.f42883a
                if (r3 == 0) goto L85
                pe.v$b r4 = pe.v.f42873j
                kotlin.jvm.internal.AbstractC4862t.b(r3)
                int r3 = r4.b(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                java.util.List r1 = r6.f42888f
                r6.B(r1, r0)
                java.util.List r1 = r6.f42889g
                if (r1 == 0) goto La3
                r1 = 63
                r0.append(r1)
                pe.v$b r1 = pe.v.f42873j
                java.util.List r2 = r6.f42889g
                kotlin.jvm.internal.AbstractC4862t.b(r2)
                pe.v.b.a(r1, r2, r0)
            La3:
                java.lang.String r1 = r6.f42890h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r6 = r6.f42890h
                r0.append(r6)
            Lb1:
                java.lang.String r6 = r0.toString()
                java.lang.String r0 = "toString(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r6, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.v.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.f42890h = str;
        }

        public final void v(String str) {
            AbstractC4862t.e(str, "<set-?>");
            this.f42885c = str;
        }

        public final void w(String str) {
            AbstractC4862t.e(str, "<set-?>");
            this.f42884b = str;
        }

        public final void x(String str) {
            this.f42886d = str;
        }

        public final void y(int i10) {
            this.f42887e = i10;
        }

        public final void z(String str) {
            this.f42883a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int b(String scheme) {
            AbstractC4862t.e(scheme, "scheme");
            if (AbstractC4862t.a(scheme, "http")) {
                return 80;
            }
            return AbstractC4862t.a(scheme, "https") ? 443 : -1;
        }

        public final v c(String str) {
            AbstractC4862t.e(str, "<this>");
            return new a().i(null, str).a();
        }

        public final v d(String str) {
            AbstractC4862t.e(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final void e(List list, StringBuilder sb2) {
            Bc.d dVarN = Bc.k.n(Bc.k.p(0, list.size()), 2);
            int iC = dVarN.c();
            int iD = dVarN.d();
            int iE = dVarN.e();
            if ((iE <= 0 || iC > iD) && (iE >= 0 || iD > iC)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iC);
                String str2 = (String) list.get(iC + 1);
                if (iC > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (iC == iD) {
                    return;
                } else {
                    iC += iE;
                }
            }
        }

        public b() {
        }
    }

    public /* synthetic */ v(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, AbstractC4854k abstractC4854k) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    public static final v g(String str) {
        return f42873j.c(str);
    }

    public static final v l(String str) {
        return f42873j.d(str);
    }

    public final String a() {
        if (this.f42881h == null) {
            return null;
        }
        String strSubstring = this.f42882i.substring(Od.F.h0(this.f42882i, '#', 0, false, 6, null) + 1);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        if (this.f42876c.length() == 0) {
            return "";
        }
        String strSubstring = this.f42882i.substring(Od.F.h0(this.f42882i, ':', this.f42874a.length() + 3, false, 4, null) + 1, Od.F.h0(this.f42882i, '@', 0, false, 6, null));
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String c() {
        int iH0 = Od.F.h0(this.f42882i, JsonPointer.SEPARATOR, this.f42874a.length() + 3, false, 4, null);
        String str = this.f42882i;
        String strSubstring = this.f42882i.substring(iH0, qe.m.k(str, "?#", iH0, str.length()));
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final List d() {
        int iH0 = Od.F.h0(this.f42882i, JsonPointer.SEPARATOR, this.f42874a.length() + 3, false, 4, null);
        String str = this.f42882i;
        int iK = qe.m.k(str, "?#", iH0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iH0 < iK) {
            int i10 = iH0 + 1;
            int iJ = qe.m.j(this.f42882i, JsonPointer.SEPARATOR, i10, iK);
            String strSubstring = this.f42882i.substring(i10, iJ);
            AbstractC4862t.d(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iH0 = iJ;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f42880g == null) {
            return null;
        }
        int iH0 = Od.F.h0(this.f42882i, '?', 0, false, 6, null) + 1;
        String str = this.f42882i;
        String strSubstring = this.f42882i.substring(iH0, qe.m.j(str, '#', iH0, str.length()));
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && AbstractC4862t.a(((v) obj).f42882i, this.f42882i);
    }

    public final String f() {
        if (this.f42875b.length() == 0) {
            return "";
        }
        int length = this.f42874a.length() + 3;
        String str = this.f42882i;
        String strSubstring = this.f42882i.substring(length, qe.m.k(str, ":@", length, str.length()));
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String h() {
        return this.f42877d;
    }

    public int hashCode() {
        return this.f42882i.hashCode();
    }

    public final boolean i() {
        return AbstractC4862t.a(this.f42874a, "https");
    }

    public final a j() {
        a aVar = new a();
        aVar.z(this.f42874a);
        aVar.w(f());
        aVar.v(b());
        aVar.x(this.f42877d);
        aVar.y(this.f42878e != f42873j.b(this.f42874a) ? this.f42878e : -1);
        aVar.e().clear();
        aVar.e().addAll(d());
        aVar.c(e());
        aVar.u(a());
        return aVar;
    }

    public final a k(String link) {
        AbstractC4862t.e(link, "link");
        try {
            return new a().i(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int m() {
        return this.f42878e;
    }

    public final String n() {
        if (this.f42880g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f42873j.e(this.f42880g, sb2);
        return sb2.toString();
    }

    public final String o() {
        a aVarK = k("/...");
        AbstractC4862t.b(aVarK);
        return aVarK.D("").k("").a().toString();
    }

    public final v p(String link) {
        AbstractC4862t.e(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String q() {
        return this.f42874a;
    }

    public final URI r() {
        String string = j().q().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Od.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").j(string, ""));
                AbstractC4862t.b(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL s() {
        try {
            return new URL(this.f42882i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f42882i;
    }

    public v(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6) {
        this.f42874a = str;
        this.f42875b = str2;
        this.f42876c = str3;
        this.f42877d = str4;
        this.f42878e = i10;
        this.f42879f = list;
        this.f42880g = list2;
        this.f42881h = str5;
        this.f42882i = str6;
    }
}
