package se;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.C5464A;
import pe.C5468d;
import pe.u;
import qe.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44476c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5464A f44477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f44478b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(pe.C r4, pe.C5464A r5) {
            /*
                r3 = this;
                java.lang.String r3 = "response"
                kotlin.jvm.internal.AbstractC4862t.e(r4, r3)
                java.lang.String r3 = "request"
                kotlin.jvm.internal.AbstractC4862t.e(r5, r3)
                int r3 = r4.g()
                r0 = 200(0xc8, float:2.8E-43)
                r1 = 0
                if (r3 == r0) goto L65
                r0 = 410(0x19a, float:5.75E-43)
                if (r3 == r0) goto L65
                r0 = 414(0x19e, float:5.8E-43)
                if (r3 == r0) goto L65
                r0 = 501(0x1f5, float:7.02E-43)
                if (r3 == r0) goto L65
                r0 = 203(0xcb, float:2.84E-43)
                if (r3 == r0) goto L65
                r0 = 204(0xcc, float:2.86E-43)
                if (r3 == r0) goto L65
                r0 = 307(0x133, float:4.3E-43)
                if (r3 == r0) goto L3b
                r0 = 308(0x134, float:4.32E-43)
                if (r3 == r0) goto L65
                r0 = 404(0x194, float:5.66E-43)
                if (r3 == r0) goto L65
                r0 = 405(0x195, float:5.68E-43)
                if (r3 == r0) goto L65
                switch(r3) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r1
            L3b:
                java.lang.String r3 = "Expires"
                r0 = 2
                r2 = 0
                java.lang.String r3 = pe.C.m(r4, r3, r2, r0, r2)
                if (r3 != 0) goto L65
                pe.d r3 = r4.c()
                int r3 = r3.e()
                r0 = -1
                if (r3 != r0) goto L65
                pe.d r3 = r4.c()
                boolean r3 = r3.d()
                if (r3 != 0) goto L65
                pe.d r3 = r4.c()
                boolean r3 = r3.c()
                if (r3 != 0) goto L65
                return r1
            L65:
                pe.d r3 = r4.c()
                boolean r3 = r3.j()
                if (r3 != 0) goto L7b
                pe.d r3 = r5.b()
                boolean r3 = r3.j()
                if (r3 != 0) goto L7b
                r3 = 1
                return r3
            L7b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: se.d.a.a(pe.C, pe.A):boolean");
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f44479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5464A f44480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C f44481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Date f44482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f44483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Date f44484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f44485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Date f44486h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f44487i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f44488j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f44489k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f44490l;

        public b(long j10, C5464A request, C c10) {
            AbstractC4862t.e(request, "request");
            this.f44479a = j10;
            this.f44480b = request;
            this.f44481c = c10;
            this.f44490l = -1;
            if (c10 != null) {
                this.f44487i = c10.S();
                this.f44488j = c10.H();
                u uVarO = c10.o();
                int size = uVarO.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strE = uVarO.e(i10);
                    String strH = uVarO.h(i10);
                    if (Od.C.E(strE, "Date", true)) {
                        this.f44482d = ve.c.a(strH);
                        this.f44483e = strH;
                    } else if (Od.C.E(strE, "Expires", true)) {
                        this.f44486h = ve.c.a(strH);
                    } else if (Od.C.E(strE, "Last-Modified", true)) {
                        this.f44484f = ve.c.a(strH);
                        this.f44485g = strH;
                    } else if (Od.C.E(strE, "ETag", true)) {
                        this.f44489k = strH;
                    } else if (Od.C.E(strE, "Age", true)) {
                        this.f44490l = m.G(strH, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f44482d;
            long jMax = date != null ? Math.max(0L, this.f44488j - date.getTime()) : 0L;
            int i10 = this.f44490l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + Math.max(0L, this.f44488j - this.f44487i) + Math.max(0L, this.f44479a - this.f44488j);
        }

        public final d b() {
            d dVarC = c();
            return (dVarC.b() == null || !this.f44480b.b().l()) ? dVarC : new d(null, null);
        }

        public final d c() {
            String str;
            if (this.f44481c == null) {
                return new d(this.f44480b, null);
            }
            if (this.f44480b.h() && this.f44481c.j() == null) {
                return new d(this.f44480b, null);
            }
            if (!d.f44476c.a(this.f44481c, this.f44480b)) {
                return new d(this.f44480b, null);
            }
            C5468d c5468dB = this.f44480b.b();
            if (c5468dB.i() || e(this.f44480b)) {
                return new d(this.f44480b, null);
            }
            C5468d c5468dC = this.f44481c.c();
            long jA = a();
            long jD = d();
            if (c5468dB.e() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(c5468dB.e()));
            }
            long millis = 0;
            long millis2 = c5468dB.g() != -1 ? TimeUnit.SECONDS.toMillis(c5468dB.g()) : 0L;
            if (!c5468dC.h() && c5468dB.f() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c5468dB.f());
            }
            if (!c5468dC.i()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    C.a aVarD = this.f44481c.D();
                    if (j10 >= jD) {
                        aVarD.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && f()) {
                        aVarD.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new d(null, aVarD.c());
                }
            }
            String str2 = this.f44489k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f44484f != null) {
                    str2 = this.f44485g;
                } else {
                    if (this.f44482d == null) {
                        return new d(this.f44480b, null);
                    }
                    str2 = this.f44483e;
                }
                str = "If-Modified-Since";
            }
            u.a aVarF = this.f44480b.g().f();
            AbstractC4862t.b(str2);
            aVarF.c(str, str2);
            return new d(this.f44480b.j().m(aVarF.d()).b(), this.f44481c);
        }

        public final long d() {
            C c10 = this.f44481c;
            AbstractC4862t.b(c10);
            if (c10.c().e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.e());
            }
            Date date = this.f44486h;
            if (date != null) {
                Date date2 = this.f44482d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f44488j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f44484f != null && this.f44481c.K().k().n() == null) {
                Date date3 = this.f44482d;
                long time2 = date3 != null ? date3.getTime() : this.f44487i;
                Date date4 = this.f44484f;
                AbstractC4862t.b(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        public final boolean e(C5464A c5464a) {
            return (c5464a.e("If-Modified-Since") == null && c5464a.e("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            C c10 = this.f44481c;
            AbstractC4862t.b(c10);
            return c10.c().e() == -1 && this.f44486h == null;
        }
    }

    public d(C5464A c5464a, C c10) {
        this.f44477a = c5464a;
        this.f44478b = c10;
    }

    public final C a() {
        return this.f44478b;
    }

    public final C5464A b() {
        return this.f44477a;
    }
}
