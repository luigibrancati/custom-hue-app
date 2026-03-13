package androidx.media3.exoplayer.rtsp;

import D1.D;
import D1.r;
import D1.s;
import G1.AbstractC0853a;
import G1.M;
import I1.x;
import P1.w;
import W1.u;
import a2.AbstractC2615a;
import a2.AbstractC2636w;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import a2.f0;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.a;
import androidx.media3.exoplayer.rtsp.f;
import java.io.IOException;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class RtspMediaSource extends AbstractC2615a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a.InterfaceC0301a f23694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f23696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SocketFactory f23697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f23698l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23701o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f23703q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23699m = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23702p = true;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements f.d {
        public a() {
        }

        @Override // androidx.media3.exoplayer.rtsp.f.d
        public void a() {
            RtspMediaSource.this.f23700n = false;
            RtspMediaSource.this.M();
        }

        @Override // androidx.media3.exoplayer.rtsp.f.d
        public void b(u uVar) {
            RtspMediaSource.this.f23699m = M.M0(uVar.a());
            RtspMediaSource.this.f23700n = !uVar.c();
            RtspMediaSource.this.f23701o = uVar.c();
            RtspMediaSource.this.f23702p = false;
            RtspMediaSource.this.M();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC2636w {
        public b(D d10) {
            super(d10);
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f1455f = true;
            return bVar;
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.c o(int i10, D.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f1483k = true;
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends IOException {
        public c(String str) {
            super(str);
        }

        public c(Throwable th) {
            super(th);
        }

        public c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends c {
        public d(String str) {
            super(str);
        }
    }

    static {
        s.a("media3.exoplayer.rtsp");
    }

    public RtspMediaSource(r rVar, a.InterfaceC0301a interfaceC0301a, String str, SocketFactory socketFactory, boolean z10) {
        this.f23703q = rVar;
        this.f23694h = interfaceC0301a;
        this.f23695i = str;
        this.f23696j = L(((r.h) AbstractC0853a.e(rVar.f1873b)).f1968a);
        this.f23697k = socketFactory;
        this.f23698l = z10;
    }

    public static Uri L(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !J7.c.a("rtspt", scheme)) {
            return uri;
        }
        return Uri.parse("rtsp" + uri.toString().substring(5));
    }

    @Override // a2.AbstractC2615a
    public void D(x xVar) {
        M();
    }

    public final void M() {
        D f0Var = new f0(this.f23699m, this.f23700n, false, this.f23701o, null, f());
        if (this.f23702p) {
            f0Var = new b(f0Var);
        }
        E(f0Var);
    }

    @Override // a2.InterfaceC2611D
    public synchronized void b(r rVar) {
        this.f23703q = rVar;
    }

    @Override // a2.InterfaceC2611D
    public synchronized r f() {
        return this.f23703q;
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        ((f) interfaceC2610C).W();
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        return new f(bVar2, this.f23694h, this.f23696j, new a(), this.f23695i, this.f23697k, this.f23698l);
    }

    @Override // a2.AbstractC2615a
    public void F() {
    }

    @Override // a2.InterfaceC2611D
    public void n() {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Factory implements a2.M {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f23704h = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f23705c = 8000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f23706d = "AndroidXMedia3/1.8.0";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SocketFactory f23707e = SocketFactory.getDefault();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f23709g;

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource f(r rVar) {
            AbstractC0853a.e(rVar.f1873b);
            return new RtspMediaSource(rVar, j(rVar) ? new k(this.f23705c) : new m(this.f23705c), this.f23706d, this.f23707e, this.f23709g);
        }

        public final boolean j(r rVar) {
            if (this.f23708f) {
                return true;
            }
            String scheme = ((r.h) AbstractC0853a.e(rVar.f1873b)).f1968a.getScheme();
            return scheme != null && J7.c.a("rtspt", scheme);
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory e(e2.k kVar) {
            return this;
        }
    }
}
