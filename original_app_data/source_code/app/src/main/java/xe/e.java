package xe;

import Fe.C0843e;
import Fe.C0846h;
import Fe.InterfaceC0845g;
import Fe.J;
import Fe.v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import gc.C4179C;
import gc.C4202o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f48132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d[] f48133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f48134c;

    static {
        e eVar = new e();
        f48132a = eVar;
        d dVar = new d(d.f48128j, "");
        C0846h c0846h = d.f48125g;
        d dVar2 = new d(c0846h, "GET");
        d dVar3 = new d(c0846h, "POST");
        C0846h c0846h2 = d.f48126h;
        d dVar4 = new d(c0846h2, "/");
        d dVar5 = new d(c0846h2, "/index.html");
        C0846h c0846h3 = d.f48127i;
        d dVar6 = new d(c0846h3, "http");
        d dVar7 = new d(c0846h3, "https");
        C0846h c0846h4 = d.f48124f;
        f48133b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(c0846h4, "200"), new d(c0846h4, "204"), new d(c0846h4, "206"), new d(c0846h4, "304"), new d(c0846h4, "400"), new d(c0846h4, "404"), new d(c0846h4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f48134c = eVar.d();
    }

    public final C0846h a(C0846h name) throws IOException {
        AbstractC4862t.e(name, "name");
        int size = name.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte bQ = name.q(i10);
            if (65 <= bQ && bQ < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.R());
            }
        }
        return name;
    }

    public final Map b() {
        return f48134c;
    }

    public final d[] c() {
        return f48133b;
    }

    public final Map d() {
        d[] dVarArr = f48133b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(dVarArr.length);
        int length = dVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            d[] dVarArr2 = f48133b;
            if (!linkedHashMap.containsKey(dVarArr2[i10].f48129a)) {
                linkedHashMap.put(dVarArr2[i10].f48129a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC4862t.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f48137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC0845g f48138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d[] f48139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f48140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f48141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f48142h;

        public a(J source, int i10, int i11) {
            AbstractC4862t.e(source, "source");
            this.f48135a = i10;
            this.f48136b = i11;
            this.f48137c = new ArrayList();
            this.f48138d = v.c(source);
            this.f48139e = new d[8];
            this.f48140f = r2.length - 1;
        }

        public final void a() {
            int i10 = this.f48136b;
            int i11 = this.f48142h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        public final void b() {
            C4202o.A(this.f48139e, null, 0, 0, 6, null);
            this.f48140f = this.f48139e.length - 1;
            this.f48141g = 0;
            this.f48142h = 0;
        }

        public final int c(int i10) {
            return this.f48140f + 1 + i10;
        }

        public final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f48139e.length;
                while (true) {
                    length--;
                    i11 = this.f48140f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    d dVar = this.f48139e[length];
                    AbstractC4862t.b(dVar);
                    int i13 = dVar.f48131c;
                    i10 -= i13;
                    this.f48142h -= i13;
                    this.f48141g--;
                    i12++;
                }
                d[] dVarArr = this.f48139e;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f48141g);
                this.f48140f += i12;
            }
            return i12;
        }

        public final List e() {
            List listV0 = C4179C.V0(this.f48137c);
            this.f48137c.clear();
            return listV0;
        }

        public final C0846h f(int i10) throws IOException {
            if (h(i10)) {
                return e.f48132a.c()[i10].f48129a;
            }
            int iC = c(i10 - e.f48132a.c().length);
            if (iC >= 0) {
                d[] dVarArr = this.f48139e;
                if (iC < dVarArr.length) {
                    d dVar = dVarArr[iC];
                    AbstractC4862t.b(dVar);
                    return dVar.f48129a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final void g(int i10, d dVar) {
            this.f48137c.add(dVar);
            int i11 = dVar.f48131c;
            if (i10 != -1) {
                d dVar2 = this.f48139e[c(i10)];
                AbstractC4862t.b(dVar2);
                i11 -= dVar2.f48131c;
            }
            int i12 = this.f48136b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f48142h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f48141g + 1;
                d[] dVarArr = this.f48139e;
                if (i13 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f48140f = this.f48139e.length - 1;
                    this.f48139e = dVarArr2;
                }
                int i14 = this.f48140f;
                this.f48140f = i14 - 1;
                this.f48139e[i14] = dVar;
                this.f48141g++;
            } else {
                this.f48139e[i10 + c(i10) + iD] = dVar;
            }
            this.f48142h += i11;
        }

        public final boolean h(int i10) {
            return i10 >= 0 && i10 <= e.f48132a.c().length - 1;
        }

        public final int i() {
            return qe.m.b(this.f48138d.readByte(), 255);
        }

        public final C0846h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.f48138d.q0(jM);
            }
            C0843e c0843e = new C0843e();
            l.f48293a.b(this.f48138d, jM, c0843e);
            return c0843e.K();
        }

        public final void k() throws IOException {
            while (!this.f48138d.z0()) {
                int iB = qe.m.b(this.f48138d.readByte(), 255);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & 128) == 128) {
                    l(m(iB, 127) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.f48136b = iM;
                    if (iM < 0 || iM > this.f48135a) {
                        throw new IOException("Invalid dynamic table size update " + this.f48136b);
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        public final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f48137c.add(e.f48132a.c()[i10]);
                return;
            }
            int iC = c(i10 - e.f48132a.c().length);
            if (iC >= 0) {
                d[] dVarArr = this.f48139e;
                if (iC < dVarArr.length) {
                    List list = this.f48137c;
                    d dVar = dVarArr[iC];
                    AbstractC4862t.b(dVar);
                    list.add(dVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public final void n(int i10) {
            g(-1, new d(f(i10), j()));
        }

        public final void o() {
            g(-1, new d(e.f48132a.a(j()), j()));
        }

        public final void p(int i10) throws IOException {
            this.f48137c.add(new d(f(i10), j()));
        }

        public final void q() throws IOException {
            this.f48137c.add(new d(e.f48132a.a(j()), j()));
        }

        public /* synthetic */ a(J j10, int i10, int i11, int i12, AbstractC4854k abstractC4854k) {
            this(j10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0843e f48145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f48146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f48147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f48148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d[] f48149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f48150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f48151i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f48152j;

        public b(int i10, boolean z10, C0843e out) {
            AbstractC4862t.e(out, "out");
            this.f48143a = i10;
            this.f48144b = z10;
            this.f48145c = out;
            this.f48146d = Integer.MAX_VALUE;
            this.f48148f = i10;
            this.f48149g = new d[8];
            this.f48150h = r2.length - 1;
        }

        public final void a() {
            int i10 = this.f48148f;
            int i11 = this.f48152j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        public final void b() {
            C4202o.A(this.f48149g, null, 0, 0, 6, null);
            this.f48150h = this.f48149g.length - 1;
            this.f48151i = 0;
            this.f48152j = 0;
        }

        public final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f48149g.length;
                while (true) {
                    length--;
                    i11 = this.f48150h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    d dVar = this.f48149g[length];
                    AbstractC4862t.b(dVar);
                    i10 -= dVar.f48131c;
                    int i13 = this.f48152j;
                    d dVar2 = this.f48149g[length];
                    AbstractC4862t.b(dVar2);
                    this.f48152j = i13 - dVar2.f48131c;
                    this.f48151i--;
                    i12++;
                }
                d[] dVarArr = this.f48149g;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f48151i);
                d[] dVarArr2 = this.f48149g;
                int i14 = this.f48150h;
                Arrays.fill(dVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f48150h += i12;
            }
            return i12;
        }

        public final void d(d dVar) {
            int i10 = dVar.f48131c;
            int i11 = this.f48148f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f48152j + i10) - i11);
            int i12 = this.f48151i + 1;
            d[] dVarArr = this.f48149g;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f48150h = this.f48149g.length - 1;
                this.f48149g = dVarArr2;
            }
            int i13 = this.f48150h;
            this.f48150h = i13 - 1;
            this.f48149g[i13] = dVar;
            this.f48151i++;
            this.f48152j += i10;
        }

        public final void e(int i10) {
            this.f48143a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f48148f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f48146d = Math.min(this.f48146d, iMin);
            }
            this.f48147e = true;
            this.f48148f = iMin;
            a();
        }

        public final void f(C0846h data) {
            AbstractC4862t.e(data, "data");
            if (this.f48144b) {
                l lVar = l.f48293a;
                if (lVar.d(data) < data.size()) {
                    C0843e c0843e = new C0843e();
                    lVar.c(data, c0843e);
                    C0846h c0846hK = c0843e.K();
                    h(c0846hK.size(), 127, 128);
                    this.f48145c.U(c0846hK);
                    return;
                }
            }
            h(data.size(), 127, 0);
            this.f48145c.U(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List r13) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: xe.e.b.g(java.util.List):void");
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f48145c.writeByte(i10 | i12);
                return;
            }
            this.f48145c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f48145c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f48145c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, C0843e c0843e, int i11, AbstractC4854k abstractC4854k) {
            this((i11 & 1) != 0 ? RecognitionOptions.AZTEC : i10, (i11 & 2) != 0 ? true : z10, c0843e);
        }
    }
}
