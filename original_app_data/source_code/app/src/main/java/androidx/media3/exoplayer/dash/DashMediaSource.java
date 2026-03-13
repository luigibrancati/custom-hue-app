package androidx.media3.exoplayer.dash;

import D1.D;
import D1.r;
import F2.s;
import G1.AbstractC0853a;
import G1.t;
import I1.f;
import I1.j;
import I1.x;
import P1.l;
import P1.u;
import P1.w;
import a2.AbstractC2615a;
import a2.C2609B;
import a2.C2625k;
import a2.C2638y;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import a2.InterfaceC2624j;
import a2.L;
import a2.M;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.d;
import e2.j;
import e2.k;
import e2.m;
import e2.n;
import e2.o;
import f2.AbstractC3987b;
import io.sentry.TransactionOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends AbstractC2615a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public m f23525A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public x f23526B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public IOException f23527C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Handler f23528D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public r.g f23529E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Uri f23530F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Uri f23531G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public O1.c f23532H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f23533I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f23534J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f23535P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f23536Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f23537R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f23538S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f23539T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public r f23540V;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.a f23542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a.InterfaceC0299a f23543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC2624j f23544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f23545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f23546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N1.b f23547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f23548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f23549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final L.a f23550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o.a f23551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f23552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f23553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f23554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f23555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f23556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d.b f23557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n f23558y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public I1.f f23559z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Factory implements M {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f23560k = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a.InterfaceC0299a f23561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f.a f23562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public w f23563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC2624j f23564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k f23565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f23566h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f23567i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public o.a f23568j;

        public Factory(f.a aVar) {
            this(new c.a(aVar), aVar);
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public DashMediaSource f(r rVar) {
            AbstractC0853a.e(rVar.f1873b);
            o.a dVar = this.f23568j;
            if (dVar == null) {
                dVar = new O1.d();
            }
            List list = rVar.f1873b.f1971d;
            return new DashMediaSource(rVar, null, this.f23562d, !list.isEmpty() ? new V1.b(dVar, list) : dVar, this.f23561c, this.f23564f, null, this.f23563e.a(rVar), this.f23565g, this.f23566h, this.f23567i, null);
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f23561c.b(z10);
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(int i10) {
            this.f23561c.c(i10);
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            this.f23563e = (w) AbstractC0853a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory e(k kVar) {
            this.f23565g = (k) AbstractC0853a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f23561c.a((s.a) AbstractC0853a.e(aVar));
            return this;
        }

        public Factory(a.InterfaceC0299a interfaceC0299a, f.a aVar) {
            this.f23561c = (a.InterfaceC0299a) AbstractC0853a.e(interfaceC0299a);
            this.f23562d = aVar;
            this.f23563e = new l();
            this.f23565g = new j();
            this.f23566h = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
            this.f23567i = 5000000L;
            this.f23564f = new C2625k();
            b(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements AbstractC3987b.InterfaceC0439b {
        public a() {
        }

        @Override // f2.AbstractC3987b.InterfaceC0439b
        public void a(IOException iOException) {
            DashMediaSource.this.b0(iOException);
        }

        @Override // f2.AbstractC3987b.InterfaceC0439b
        public void b() {
            DashMediaSource.this.c0(AbstractC3987b.i());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends D {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f23570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f23571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f23572g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f23573h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f23574i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f23575j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f23576k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final O1.c f23577l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final r f23578m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final r.g f23579n;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, O1.c cVar, r rVar, r.g gVar) {
            AbstractC0853a.g(cVar.f10769d == (gVar != null));
            this.f23570e = j10;
            this.f23571f = j11;
            this.f23572g = j12;
            this.f23573h = i10;
            this.f23574i = j13;
            this.f23575j = j14;
            this.f23576k = j15;
            this.f23577l = cVar;
            this.f23578m = rVar;
            this.f23579n = gVar;
        }

        public static boolean t(O1.c cVar) {
            return cVar.f10769d && cVar.f10770e != -9223372036854775807L && cVar.f10767b == -9223372036854775807L;
        }

        @Override // D1.D
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f23573h) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            AbstractC0853a.c(i10, 0, i());
            return bVar.s(z10 ? this.f23577l.d(i10).f10802a : null, z10 ? Integer.valueOf(this.f23573h + i10) : null, 0, this.f23577l.g(i10), G1.M.M0(this.f23577l.d(i10).f10803b - this.f23577l.d(0).f10803b) - this.f23574i);
        }

        @Override // D1.D
        public int i() {
            return this.f23577l.e();
        }

        @Override // D1.D
        public Object m(int i10) {
            AbstractC0853a.c(i10, 0, i());
            return Integer.valueOf(this.f23573h + i10);
        }

        @Override // D1.D
        public D.c o(int i10, D.c cVar, long j10) {
            AbstractC0853a.c(i10, 0, 1);
            long jS = s(j10);
            Object obj = D.c.f1463q;
            r rVar = this.f23578m;
            O1.c cVar2 = this.f23577l;
            return cVar.g(obj, rVar, cVar2, this.f23570e, this.f23571f, this.f23572g, true, t(cVar2), this.f23579n, jS, this.f23575j, 0, i() - 1, this.f23574i);
        }

        @Override // D1.D
        public int p() {
            return 1;
        }

        public final long s(long j10) {
            N1.g gVarL;
            long j11 = this.f23576k;
            if (!t(this.f23577l)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f23575j) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f23574i + j11;
            long jG = this.f23577l.g(0);
            int i10 = 0;
            while (i10 < this.f23577l.e() - 1 && j12 >= jG) {
                j12 -= jG;
                i10++;
                jG = this.f23577l.g(i10);
            }
            O1.g gVarD = this.f23577l.d(i10);
            int iA = gVarD.a(2);
            return (iA == -1 || (gVarL = ((O1.j) ((O1.a) gVarD.f10804c.get(iA)).f10758c.get(0)).l()) == null || gVarL.g(jG) == 0) ? j11 : (j11 + gVarL.b(gVarL.f(j12, jG))) - j12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements d.b {
        public c() {
        }

        @Override // androidx.media3.exoplayer.dash.d.b
        public void a(long j10) {
            DashMediaSource.this.T(j10);
        }

        @Override // androidx.media3.exoplayer.dash.d.b
        public void b() {
            DashMediaSource.this.U();
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f23581a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // e2.o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f23581a.matcher(line);
                if (!matcher.matches()) {
                    throw D1.w.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw D1.w.c(null, e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e implements m.b {
        public e() {
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(o oVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(oVar, j10, j11);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void w(o oVar, long j10, long j11) {
            DashMediaSource.this.W(oVar, j10, j11);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(oVar, j10, j11, iOException, i10);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void s(o oVar, long j10, long j11, int i10) {
            DashMediaSource.this.Y(oVar, j10, j11, i10);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f implements n {
        public f() {
        }

        @Override // e2.n
        public void a() throws IOException {
            DashMediaSource.this.f23525A.a();
            b();
        }

        public final void b() throws IOException {
            if (DashMediaSource.this.f23527C != null) {
                throw DashMediaSource.this.f23527C;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class g implements m.b {
        public g() {
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(o oVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(oVar, j10, j11);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void w(o oVar, long j10, long j11) {
            DashMediaSource.this.Z(oVar, j10, j11);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.a0(oVar, j10, j11, iOException);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h implements o.a {
        public h() {
        }

        @Override // e2.o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(G1.M.U0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        D1.s.a("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(r rVar, O1.c cVar, f.a aVar, o.a aVar2, a.InterfaceC0299a interfaceC0299a, InterfaceC2624j interfaceC2624j, e2.e eVar, u uVar, k kVar, long j10, long j11, a aVar3) {
        this(rVar, cVar, aVar, aVar2, interfaceC0299a, interfaceC2624j, eVar, uVar, kVar, j10, j11);
    }

    public static long M(O1.g gVar, long j10, long j11) {
        long jM0 = G1.M.M0(gVar.f10803b);
        boolean zQ = Q(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f10804c.size(); i10++) {
            O1.a aVar = (O1.a) gVar.f10804c.get(i10);
            List list = aVar.f10758c;
            int i11 = aVar.f10757b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zQ || !z10) && !list.isEmpty()) {
                N1.g gVarL = ((O1.j) list.get(0)).l();
                if (gVarL == null) {
                    return jM0 + j10;
                }
                long j12 = gVarL.j(j10, j11);
                if (j12 == 0) {
                    return jM0;
                }
                long jC = (gVarL.c(j10, j11) + j12) - 1;
                jMin = Math.min(jMin, gVarL.a(jC, j10) + gVarL.b(jC) + jM0);
            }
        }
        return jMin;
    }

    public static long N(O1.g gVar, long j10, long j11) {
        long jM0 = G1.M.M0(gVar.f10803b);
        boolean zQ = Q(gVar);
        long jMax = jM0;
        for (int i10 = 0; i10 < gVar.f10804c.size(); i10++) {
            O1.a aVar = (O1.a) gVar.f10804c.get(i10);
            List list = aVar.f10758c;
            int i11 = aVar.f10757b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zQ || !z10) && !list.isEmpty()) {
                N1.g gVarL = ((O1.j) list.get(0)).l();
                if (gVarL == null || gVarL.j(j10, j11) == 0) {
                    return jM0;
                }
                jMax = Math.max(jMax, gVarL.b(gVarL.c(j10, j11)) + jM0);
            }
        }
        return jMax;
    }

    public static long O(O1.c cVar, long j10) {
        N1.g gVarL;
        int iE = cVar.e() - 1;
        O1.g gVarD = cVar.d(iE);
        long jM0 = G1.M.M0(gVarD.f10803b);
        long jG = cVar.g(iE);
        long jM02 = G1.M.M0(j10);
        long jM03 = G1.M.M0(cVar.f10766a);
        long jM04 = G1.M.M0(cVar.f10770e);
        if (jM04 == -9223372036854775807L || jM04 >= 5000000) {
            jM04 = 5000000;
        }
        for (int i10 = 0; i10 < gVarD.f10804c.size(); i10++) {
            List list = ((O1.a) gVarD.f10804c.get(i10)).f10758c;
            if (!list.isEmpty() && (gVarL = ((O1.j) list.get(0)).l()) != null) {
                long jD = ((jM03 + jM0) + gVarL.d(jG, jM02)) - jM02;
                if (jD > 0 && (jD < jM04 - PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH || (jD > jM04 && jD < jM04 + PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH))) {
                    jM04 = jD;
                }
            }
        }
        return M7.e.b(jM04, 1000L, RoundingMode.CEILING);
    }

    public static boolean Q(O1.g gVar) {
        for (int i10 = 0; i10 < gVar.f10804c.size(); i10++) {
            int i11 = ((O1.a) gVar.f10804c.get(i10)).f10757b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(O1.g gVar) {
        for (int i10 = 0; i10 < gVar.f10804c.size(); i10++) {
            N1.g gVarL = ((O1.j) ((O1.a) gVar.f10804c.get(i10)).f10758c.get(0)).l();
            if (gVarL == null || gVarL.h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        Uri uri;
        this.f23528D.removeCallbacks(this.f23555v);
        if (this.f23525A.i()) {
            return;
        }
        if (this.f23525A.j()) {
            this.f23533I = true;
            return;
        }
        synchronized (this.f23553t) {
            uri = this.f23530F;
        }
        this.f23533I = false;
        i0(new o(this.f23559z, new j.b().i(uri).b(1).a(), 4, this.f23551r), this.f23552s, this.f23546m.b(4));
    }

    @Override // a2.AbstractC2615a
    public void D(x xVar) {
        this.f23526B = xVar;
        this.f23545l.c(Looper.myLooper(), B());
        this.f23545l.u();
        if (this.f23541h) {
            d0(false);
            return;
        }
        this.f23559z = this.f23542i.a();
        this.f23525A = new m("DashMediaSource");
        this.f23528D = G1.M.z();
        j0();
    }

    @Override // a2.AbstractC2615a
    public void F() {
        this.f23533I = false;
        this.f23559z = null;
        m mVar = this.f23525A;
        if (mVar != null) {
            mVar.l();
            this.f23525A = null;
        }
        this.f23534J = 0L;
        this.f23535P = 0L;
        this.f23530F = this.f23531G;
        this.f23527C = null;
        Handler handler = this.f23528D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23528D = null;
        }
        this.f23536Q = -9223372036854775807L;
        this.f23537R = 0;
        this.f23538S = -9223372036854775807L;
        this.f23554u.clear();
        this.f23547n.i();
        this.f23545l.release();
    }

    public final long P() {
        return Math.min((this.f23537R - 1) * 1000, 5000);
    }

    public final void S() {
        AbstractC3987b.l(this.f23525A, new a());
    }

    public void T(long j10) {
        long j11 = this.f23538S;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.f23538S = j10;
        }
    }

    public void U() {
        this.f23528D.removeCallbacks(this.f23556w);
        j0();
    }

    public void V(o oVar, long j10, long j11) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        this.f23546m.d(oVar.f33652a);
        this.f23550q.l(c2638y, oVar.f33654c);
    }

    public void W(o oVar, long j10, long j11) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        this.f23546m.d(oVar.f33652a);
        this.f23550q.o(c2638y, oVar.f33654c);
        O1.c cVar = (O1.c) oVar.d();
        O1.c cVar2 = this.f23532H;
        int iE = cVar2 == null ? 0 : cVar2.e();
        long j12 = cVar.d(0).f10803b;
        int i10 = 0;
        while (i10 < iE && this.f23532H.d(i10).f10803b < j12) {
            i10++;
        }
        if (cVar.f10769d) {
            if (iE - i10 > cVar.e()) {
                t.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.f23538S;
                if (j13 == -9223372036854775807L || cVar.f10773h * 1000 > j13) {
                    this.f23537R = 0;
                } else {
                    t.h("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f10773h + ", " + this.f23538S);
                }
            }
            int i11 = this.f23537R;
            this.f23537R = i11 + 1;
            if (i11 < this.f23546m.b(oVar.f33654c)) {
                h0(P());
                return;
            } else {
                this.f23527C = new N1.c();
                return;
            }
        }
        this.f23532H = cVar;
        this.f23533I = cVar.f10769d & this.f23533I;
        this.f23534J = j10 - j11;
        this.f23535P = j10;
        this.f23539T += i10;
        synchronized (this.f23553t) {
            if (oVar.f33653b.f5437a.equals(this.f23530F)) {
                Uri uriB = this.f23532H.f10776k;
                if (uriB == null) {
                    uriB = e2.f.b(oVar.e());
                }
                this.f23530F = uriB;
            }
        }
        O1.c cVar3 = this.f23532H;
        if (!cVar3.f10769d || this.f23536Q != -9223372036854775807L) {
            d0(true);
            return;
        }
        O1.o oVar2 = cVar3.f10774i;
        if (oVar2 != null) {
            e0(oVar2);
        } else {
            S();
        }
    }

    public m.c X(o oVar, long j10, long j11, IOException iOException, int i10) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        long jA = this.f23546m.a(new k.c(c2638y, new C2609B(oVar.f33654c), iOException, i10));
        m.c cVarH = jA == -9223372036854775807L ? m.f33635g : m.h(false, jA);
        boolean zC = cVarH.c();
        this.f23550q.s(c2638y, oVar.f33654c, iOException, !zC);
        if (!zC) {
            this.f23546m.d(oVar.f33652a);
        }
        return cVarH;
    }

    public void Y(o oVar, long j10, long j11, int i10) {
        this.f23550q.u(i10 == 0 ? new C2638y(oVar.f33652a, oVar.f33653b, j10) : new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a()), oVar.f33654c, i10);
    }

    public void Z(o oVar, long j10, long j11) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        this.f23546m.d(oVar.f33652a);
        this.f23550q.o(c2638y, oVar.f33654c);
        c0(((Long) oVar.d()).longValue() - j10);
    }

    public m.c a0(o oVar, long j10, long j11, IOException iOException) {
        this.f23550q.s(new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a()), oVar.f33654c, iOException, true);
        this.f23546m.d(oVar.f33652a);
        b0(iOException);
        return m.f33634f;
    }

    @Override // a2.InterfaceC2611D
    public synchronized void b(r rVar) {
        this.f23540V = rVar;
    }

    public final void b0(IOException iOException) {
        t.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f23536Q = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        d0(true);
    }

    public final void c0(long j10) {
        this.f23536Q = j10;
        d0(true);
    }

    public final void d0(boolean z10) {
        long j10;
        long j11;
        long j12;
        for (int i10 = 0; i10 < this.f23554u.size(); i10++) {
            int iKeyAt = this.f23554u.keyAt(i10);
            if (iKeyAt >= this.f23539T) {
                ((androidx.media3.exoplayer.dash.b) this.f23554u.valueAt(i10)).P(this.f23532H, iKeyAt - this.f23539T);
            }
        }
        O1.g gVarD = this.f23532H.d(0);
        int iE = this.f23532H.e() - 1;
        O1.g gVarD2 = this.f23532H.d(iE);
        long jG = this.f23532H.g(iE);
        long jM0 = G1.M.M0(G1.M.h0(this.f23536Q));
        long jN = N(gVarD, this.f23532H.g(0), jM0);
        long jM = M(gVarD2, jG, jM0);
        boolean z11 = this.f23532H.f10769d && !R(gVarD2);
        if (z11) {
            long j13 = this.f23532H.f10771f;
            if (j13 != -9223372036854775807L) {
                jN = Math.max(jN, jM - G1.M.M0(j13));
            }
        }
        long j14 = jM - jN;
        O1.c cVar = this.f23532H;
        if (cVar.f10769d) {
            AbstractC0853a.g(cVar.f10766a != -9223372036854775807L);
            long jM02 = (jM0 - G1.M.M0(this.f23532H.f10766a)) - jN;
            k0(jM02, j14);
            long jO1 = this.f23532H.f10766a + G1.M.o1(jN);
            long jM03 = jM02 - G1.M.M0(this.f23529E.f1950a);
            j10 = 0;
            long jMin = Math.min(this.f23549p, j14 / 2);
            j11 = jO1;
            j12 = jM03 < jMin ? jMin : jM03;
        } else {
            j10 = 0;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long jM04 = jN - G1.M.M0(gVarD.f10803b);
        O1.c cVar2 = this.f23532H;
        E(new b(cVar2.f10766a, j11, this.f23536Q, this.f23539T, jM04, j14, j12, cVar2, f(), this.f23532H.f10769d ? this.f23529E : null));
        if (this.f23541h) {
            return;
        }
        this.f23528D.removeCallbacks(this.f23556w);
        if (z11) {
            this.f23528D.postDelayed(this.f23556w, O(this.f23532H, G1.M.h0(this.f23536Q)));
        }
        if (this.f23533I) {
            j0();
            return;
        }
        if (z10) {
            O1.c cVar3 = this.f23532H;
            if (cVar3.f10769d) {
                long j15 = cVar3.f10770e;
                if (j15 != -9223372036854775807L) {
                    if (j15 == j10) {
                        j15 = 5000;
                    }
                    h0(Math.max(j10, (this.f23534J + j15) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void e0(O1.o oVar) {
        String str = oVar.f10856a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            f0(oVar);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            g0(oVar, new d());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            g0(oVar, new h(null));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            S();
        } else {
            b0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // a2.InterfaceC2611D
    public synchronized r f() {
        return this.f23540V;
    }

    public final void f0(O1.o oVar) {
        try {
            c0(G1.M.U0(oVar.f10857b) - this.f23535P);
        } catch (D1.w e10) {
            b0(e10);
        }
    }

    public final void g0(O1.o oVar, o.a aVar) {
        i0(new o(this.f23559z, Uri.parse(oVar.f10857b), 5, aVar), new g(this, null), 1);
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        androidx.media3.exoplayer.dash.b bVar = (androidx.media3.exoplayer.dash.b) interfaceC2610C;
        bVar.L();
        this.f23554u.remove(bVar.f23587a);
    }

    public final void h0(long j10) {
        this.f23528D.postDelayed(this.f23555v, j10);
    }

    public final void i0(o oVar, m.b bVar, int i10) {
        this.f23525A.n(oVar, bVar, i10);
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        int iIntValue = ((Integer) bVar.f20522a).intValue() - this.f23539T;
        L.a aVarY = y(bVar);
        androidx.media3.exoplayer.dash.b bVar3 = new androidx.media3.exoplayer.dash.b(this.f23539T + iIntValue, this.f23532H, this.f23547n, iIntValue, this.f23543j, this.f23526B, null, this.f23545l, v(bVar), this.f23546m, aVarY, this.f23536Q, this.f23558y, bVar2, this.f23544k, this.f23557x, B());
        this.f23554u.put(bVar3.f23587a, bVar3);
        return bVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(long r19, long r21) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.k0(long, long):void");
    }

    @Override // a2.InterfaceC2611D
    public void n() {
        this.f23558y.a();
    }

    public DashMediaSource(r rVar, O1.c cVar, f.a aVar, o.a aVar2, a.InterfaceC0299a interfaceC0299a, InterfaceC2624j interfaceC2624j, e2.e eVar, u uVar, k kVar, long j10, long j11) {
        this.f23540V = rVar;
        this.f23529E = rVar.f1875d;
        this.f23530F = ((r.h) AbstractC0853a.e(rVar.f1873b)).f1968a;
        this.f23531G = rVar.f1873b.f1968a;
        this.f23532H = cVar;
        this.f23542i = aVar;
        this.f23551r = aVar2;
        this.f23543j = interfaceC0299a;
        this.f23545l = uVar;
        this.f23546m = kVar;
        this.f23548o = j10;
        this.f23549p = j11;
        this.f23544k = interfaceC2624j;
        this.f23547n = new N1.b();
        boolean z10 = cVar != null;
        this.f23541h = z10;
        a aVar3 = null;
        this.f23550q = y(null);
        this.f23553t = new Object();
        this.f23554u = new SparseArray();
        this.f23557x = new c(this, aVar3);
        this.f23538S = -9223372036854775807L;
        this.f23536Q = -9223372036854775807L;
        if (!z10) {
            this.f23552s = new e(this, aVar3);
            this.f23558y = new f();
            this.f23555v = new Runnable() { // from class: N1.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9563a.j0();
                }
            };
            this.f23556w = new Runnable() { // from class: N1.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9564a.d0(false);
                }
            };
            return;
        }
        AbstractC0853a.g(true ^ cVar.f10769d);
        this.f23552s = null;
        this.f23555v = null;
        this.f23556w = null;
        this.f23558y = new n.a();
    }
}
