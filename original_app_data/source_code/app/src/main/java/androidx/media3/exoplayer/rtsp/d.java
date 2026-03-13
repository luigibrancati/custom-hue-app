package androidx.media3.exoplayer.rtsp;

import D1.w;
import G1.AbstractC0853a;
import G1.M;
import K7.A;
import K7.AbstractC1081v;
import K7.AbstractC1083x;
import K7.C1082w;
import W1.n;
import W1.q;
import W1.r;
import W1.s;
import W1.t;
import W1.u;
import W1.v;
import W1.x;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.rtsp.e;
import androidx.media3.exoplayer.rtsp.f;
import androidx.media3.exoplayer.rtsp.g;
import androidx.media3.exoplayer.rtsp.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SocketFactory f23731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23732e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f23736i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h.a f23738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f23739l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f23741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.media3.exoplayer.rtsp.c f23742o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23746s;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f23733f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f23734g = new SparseArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0302d f23735h = new C0302d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f23737j = new g(new c());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23740m = 60000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f23747t = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23743p = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f23748a = M.z();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f23749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23750c;

        public b(long j10) {
            this.f23749b = j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f23750c = false;
            this.f23748a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f23735h.e(d.this.f23736i, d.this.f23739l);
            this.f23748a.postDelayed(this, this.f23749b);
        }

        public void start() {
            if (this.f23750c) {
                return;
            }
            this.f23750c = true;
            this.f23748a.postDelayed(this, this.f23749b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f23752a = M.z();

        public c() {
        }

        @Override // androidx.media3.exoplayer.rtsp.g.d
        public void c(final List list) {
            this.f23752a.post(new Runnable() { // from class: W1.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17737a.e(list);
                }
            });
        }

        public final void e(List list) {
            d.this.e1(list);
            if (h.e(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        public final void f(List list) {
            d.this.f23735h.d(Integer.parseInt((String) AbstractC0853a.e(h.k(list).f17758c.d("CSeq"))));
        }

        public final void g(List list) {
            AbstractC1081v abstractC1081vZ;
            t tVarL = h.l(list);
            int i10 = Integer.parseInt((String) AbstractC0853a.e(tVarL.f17761b.d("CSeq")));
            s sVar = (s) d.this.f23734g.get(i10);
            if (sVar == null) {
                return;
            }
            d.this.f23734g.remove(i10);
            int i11 = sVar.f17757b;
            try {
                int i12 = tVarL.f17760a;
                if (i12 == 200) {
                    switch (i11) {
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            h(new W1.j(tVarL.f17761b, i12, x.b(tVarL.f17762c)));
                            return;
                        case 4:
                            i(new q(i12, h.j(tVarL.f17761b.d("Public"))));
                            return;
                        case 5:
                            j();
                            return;
                        case 6:
                            String strD = tVarL.f17761b.d("Range");
                            u uVarD = strD == null ? u.f17763c : u.d(strD);
                            try {
                                String strD2 = tVarL.f17761b.d("RTP-Info");
                                abstractC1081vZ = strD2 == null ? AbstractC1081v.z() : v.a(strD2, d.this.f23736i);
                            } catch (w unused) {
                                abstractC1081vZ = AbstractC1081v.z();
                            }
                            k(new r(tVarL.f17760a, uVarD, abstractC1081vZ));
                            return;
                        case 10:
                            String strD3 = tVarL.f17761b.d("Session");
                            String strD4 = tVarL.f17761b.d("Transport");
                            if (strD3 == null || strD4 == null) {
                                throw w.c("Missing mandatory session or transport header", null);
                            }
                            l(new i(tVarL.f17760a, h.m(strD3), strD4));
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                }
                if (i12 == 401) {
                    if (d.this.f23738k == null || d.this.f23745r) {
                        d.this.W0(new RtspMediaSource.c(h.t(i11) + StringUtils.SPACE + tVarL.f17760a));
                        return;
                    }
                    AbstractC1081v abstractC1081vE = tVarL.f17761b.e("WWW-Authenticate");
                    if (abstractC1081vE.isEmpty()) {
                        throw w.c("Missing WWW-Authenticate header in a 401 response.", null);
                    }
                    for (int i13 = 0; i13 < abstractC1081vE.size(); i13++) {
                        d.this.f23742o = h.o((String) abstractC1081vE.get(i13));
                        if (d.this.f23742o.f23724a == 2) {
                            break;
                        }
                    }
                    d.this.f23735h.b();
                    d.this.f23745r = true;
                    return;
                }
                if (i12 == 461) {
                    String str = h.t(i11) + StringUtils.SPACE + tVarL.f17760a;
                    d.this.W0((i11 != 10 || ((String) AbstractC0853a.e(sVar.f17758c.d("Transport"))).contains("TCP")) ? new RtspMediaSource.c(str) : new RtspMediaSource.d(str));
                    return;
                }
                if (i12 != 301 && i12 != 302) {
                    d.this.W0(new RtspMediaSource.c(h.t(i11) + StringUtils.SPACE + tVarL.f17760a));
                    return;
                }
                if (d.this.f23743p != -1) {
                    d.this.f23743p = 0;
                }
                String strD5 = tVarL.f17761b.d(HttpHeaders.LOCATION);
                if (strD5 == null) {
                    d.this.f23728a.c("Redirection without new location.", null);
                    return;
                }
                d.this.f23736i = Uri.parse(strD5);
                h.a aVarN = h.n(d.this.f23736i);
                if (aVarN != null) {
                    d.this.f23738k = aVarN;
                }
                d.this.f23735h.c(d.this.f23736i, d.this.f23739l);
            } catch (w | IllegalArgumentException e10) {
                d.this.W0(new RtspMediaSource.c(e10));
            }
        }

        public final void h(W1.j jVar) {
            u uVarD = u.f17763c;
            String str = (String) jVar.f17741c.f17770a.get("range");
            if (str != null) {
                try {
                    uVarD = u.d(str);
                } catch (w e10) {
                    d.this.f23728a.c("SDP format error.", e10);
                    return;
                }
            }
            AbstractC1081v abstractC1081vM0 = d.M0(jVar, d.this.f23736i);
            if (abstractC1081vM0.isEmpty()) {
                d.this.f23728a.c("No playable track.", null);
            } else {
                d.this.f23728a.d(uVarD, abstractC1081vM0);
                d.this.f23744q = true;
            }
        }

        public final void i(q qVar) {
            if (d.this.f23741n != null) {
                return;
            }
            if (d.i1(qVar.f17752b)) {
                d.this.f23735h.c(d.this.f23736i, d.this.f23739l);
            } else {
                d.this.f23728a.c("DESCRIBE not supported.", null);
            }
        }

        public final void j() {
            AbstractC0853a.g(d.this.f23743p == 2);
            d.this.f23743p = 1;
            d.this.f23746s = false;
            if (d.this.f23747t != -9223372036854775807L) {
                d dVar = d.this;
                dVar.l1(M.o1(dVar.f23747t));
            }
        }

        public final void k(r rVar) {
            boolean z10 = true;
            if (d.this.f23743p != 1 && d.this.f23743p != 2) {
                z10 = false;
            }
            AbstractC0853a.g(z10);
            d.this.f23743p = 2;
            if (d.this.f23741n == null) {
                d dVar = d.this;
                dVar.f23741n = dVar.new b(dVar.f23740m / 2);
                d.this.f23741n.start();
            }
            d.this.f23747t = -9223372036854775807L;
            d.this.f23729b.a(M.M0(rVar.f17754b.f17765a), rVar.f17755c);
        }

        public final void l(i iVar) {
            AbstractC0853a.g(d.this.f23743p != -1);
            d.this.f23743p = 1;
            d.this.f23739l = iVar.f23829b.f23826a;
            d.this.f23740m = iVar.f23829b.f23827b;
            d.this.Q0();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0302d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s f23755b;

        public C0302d() {
        }

        public final s a(int i10, String str, Map map, Uri uri) {
            String str2 = d.this.f23730c;
            int i11 = this.f23754a;
            this.f23754a = i11 + 1;
            e.b bVar = new e.b(str2, str, i11);
            if (d.this.f23742o != null) {
                AbstractC0853a.i(d.this.f23738k);
                try {
                    bVar.b("Authorization", d.this.f23742o.a(d.this.f23738k, uri, i10));
                } catch (w e10) {
                    d.this.W0(new RtspMediaSource.c(e10));
                }
            }
            bVar.d(map);
            return new s(uri, i10, bVar.e(), "");
        }

        public void b() {
            AbstractC0853a.i(this.f23755b);
            C1082w c1082wB = this.f23755b.f17758c.b();
            HashMap map = new HashMap();
            for (String str : c1082wB.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, (String) A.d(c1082wB.get(str)));
                }
            }
            h(a(this.f23755b.f17757b, d.this.f23739l, map, this.f23755b.f17756a));
        }

        public void c(Uri uri, String str) {
            h(a(2, str, AbstractC1083x.k("Accept", "application/sdp"), uri));
        }

        public void d(int i10) {
            i(new t(405, new e.b(d.this.f23730c, d.this.f23739l, i10).e()));
            this.f23754a = Math.max(this.f23754a, i10 + 1);
        }

        public void e(Uri uri, String str) {
            h(a(4, str, AbstractC1083x.j(), uri));
        }

        public void f(Uri uri, String str) {
            AbstractC0853a.g(d.this.f23743p == 2);
            h(a(5, str, AbstractC1083x.j(), uri));
            d.this.f23746s = true;
        }

        public void g(Uri uri, long j10, String str) {
            boolean z10 = true;
            if (d.this.f23743p != 1 && d.this.f23743p != 2) {
                z10 = false;
            }
            AbstractC0853a.g(z10);
            h(a(6, str, AbstractC1083x.k("Range", u.b(j10)), uri));
        }

        public final void h(s sVar) {
            int i10 = Integer.parseInt((String) AbstractC0853a.e(sVar.f17758c.d("CSeq")));
            AbstractC0853a.g(d.this.f23734g.get(i10) == null);
            d.this.f23734g.append(i10, sVar);
            AbstractC1081v abstractC1081vQ = h.q(sVar);
            d.this.e1(abstractC1081vQ);
            d.this.f23737j.g(abstractC1081vQ);
            this.f23755b = sVar;
        }

        public final void i(t tVar) {
            AbstractC1081v abstractC1081vR = h.r(tVar);
            d.this.e1(abstractC1081vR);
            d.this.f23737j.g(abstractC1081vR);
        }

        public void j(Uri uri, String str, String str2) {
            d.this.f23743p = 0;
            h(a(10, str2, AbstractC1083x.k("Transport", str), uri));
        }

        public void k(Uri uri, String str) {
            if (d.this.f23743p == -1 || d.this.f23743p == 0) {
                return;
            }
            d.this.f23743p = 0;
            h(a(12, str, AbstractC1083x.j(), uri));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void a(long j10, AbstractC1081v abstractC1081v);

        void b(RtspMediaSource.c cVar);

        void e();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        void c(String str, Throwable th);

        void d(u uVar, AbstractC1081v abstractC1081v);
    }

    public d(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z10) {
        this.f23728a = fVar;
        this.f23729b = eVar;
        this.f23730c = str;
        this.f23731d = socketFactory;
        this.f23732e = z10;
        this.f23736i = h.p(uri);
        this.f23738k = h.n(uri);
    }

    public static AbstractC1081v M0(W1.j jVar, Uri uri) {
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        for (int i10 = 0; i10 < jVar.f17741c.f17771b.size(); i10++) {
            W1.a aVar2 = (W1.a) jVar.f17741c.f17771b.get(i10);
            if (W1.g.c(aVar2)) {
                aVar.a(new n(jVar.f17739a, aVar2, uri));
            }
        }
        return aVar.k();
    }

    public static boolean i1(List list) {
        return list.isEmpty() || list.contains(2);
    }

    public final void Q0() {
        f.e eVar = (f.e) this.f23733f.pollFirst();
        if (eVar == null) {
            this.f23729b.e();
        } else {
            this.f23735h.j(eVar.c(), eVar.d(), this.f23739l);
        }
    }

    public final void W0(Throwable th) {
        RtspMediaSource.c cVar = th instanceof RtspMediaSource.c ? (RtspMediaSource.c) th : new RtspMediaSource.c(th);
        if (this.f23744q) {
            this.f23729b.b(cVar);
        } else {
            this.f23728a.c(J7.s.c(th.getMessage()), th);
        }
    }

    public final Socket c1(Uri uri) {
        AbstractC0853a.a(uri.getHost() != null);
        return this.f23731d.createSocket((String) AbstractC0853a.e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f23741n;
        if (bVar != null) {
            bVar.close();
            this.f23741n = null;
            this.f23735h.k(this.f23736i, (String) AbstractC0853a.e(this.f23739l));
        }
        this.f23737j.close();
    }

    public int d1() {
        return this.f23743p;
    }

    public final void e1(List list) {
        if (this.f23732e) {
            G1.t.b("RtspClient", J7.g.g("\n").d(list));
        }
    }

    public void f1(int i10, g.b bVar) {
        this.f23737j.f(i10, bVar);
    }

    public void g1() {
        try {
            close();
            g gVar = new g(new c());
            this.f23737j = gVar;
            gVar.d(c1(this.f23736i));
            this.f23739l = null;
            this.f23745r = false;
            this.f23742o = null;
        } catch (IOException e10) {
            this.f23729b.b(new RtspMediaSource.c(e10));
        }
    }

    public void h1(long j10) {
        if (this.f23743p == 2 && !this.f23746s) {
            this.f23735h.f(this.f23736i, (String) AbstractC0853a.e(this.f23739l));
        }
        this.f23747t = j10;
    }

    public void j1(List list) {
        this.f23733f.addAll(list);
        Q0();
    }

    public void k1() {
        this.f23743p = 1;
    }

    public void l1(long j10) {
        this.f23735h.g(this.f23736i, j10, (String) AbstractC0853a.e(this.f23739l));
    }

    public void start() throws IOException {
        try {
            this.f23737j.d(c1(this.f23736i));
            this.f23735h.e(this.f23736i, this.f23739l);
        } catch (IOException e10) {
            M.m(this.f23737j);
            throw e10;
        }
    }
}
