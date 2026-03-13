package androidx.media3.exoplayer.smoothstreaming;

import D1.r;
import F2.s;
import G1.AbstractC0853a;
import I1.f;
import I1.j;
import I1.x;
import P1.l;
import P1.u;
import P1.w;
import Z1.a;
import a2.AbstractC2615a;
import a2.C2609B;
import a2.C2625k;
import a2.C2638y;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import a2.InterfaceC2624j;
import a2.L;
import a2.M;
import a2.f0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.a;
import androidx.media3.exoplayer.smoothstreaming.b;
import e2.e;
import e2.j;
import e2.k;
import e2.m;
import e2.n;
import e2.o;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSource extends AbstractC2615a implements m.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f23840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.a f23841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b.a f23842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC2624j f23843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f23844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f23845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f23846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final L.a f23847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o.a f23848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f23849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f23850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f23851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f23852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x f23853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f23854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Z1.a f23855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f23856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f23857z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Factory implements M {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f23858j = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b.a f23859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f.a f23860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC2624j f23861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public w f23862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k f23863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f23864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public o.a f23865i;

        public Factory(f.a aVar) {
            this(new a.C0305a(aVar), aVar);
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SsMediaSource f(r rVar) {
            AbstractC0853a.e(rVar.f1873b);
            o.a bVar = this.f23865i;
            if (bVar == null) {
                bVar = new Z1.b();
            }
            List list = rVar.f1873b.f1971d;
            return new SsMediaSource(rVar, null, this.f23860d, !list.isEmpty() ? new V1.b(bVar, list) : bVar, this.f23859c, this.f23861e, null, this.f23862f.a(rVar), this.f23863g, this.f23864h);
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f23859c.b(z10);
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            this.f23862f = (w) AbstractC0853a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory e(k kVar) {
            this.f23863g = (k) AbstractC0853a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f23859c.a((s.a) AbstractC0853a.e(aVar));
            return this;
        }

        public Factory(b.a aVar, f.a aVar2) {
            this.f23859c = (b.a) AbstractC0853a.e(aVar);
            this.f23860d = aVar2;
            this.f23862f = new l();
            this.f23863g = new j();
            this.f23864h = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
            this.f23861e = new C2625k();
            b(true);
        }
    }

    static {
        D1.s.a("media3.exoplayer.smoothstreaming");
    }

    @Override // a2.AbstractC2615a
    public void D(x xVar) {
        this.f23853v = xVar;
        this.f23844m.c(Looper.myLooper(), B());
        this.f23844m.u();
        if (this.f23839h) {
            this.f23852u = new n.a();
            L();
            return;
        }
        this.f23850s = this.f23841j.a();
        m mVar = new m("SsMediaSource");
        this.f23851t = mVar;
        this.f23852u = mVar;
        this.f23856y = G1.M.z();
        N();
    }

    @Override // a2.AbstractC2615a
    public void F() {
        this.f23855x = this.f23839h ? this.f23855x : null;
        this.f23850s = null;
        this.f23854w = 0L;
        m mVar = this.f23851t;
        if (mVar != null) {
            mVar.l();
            this.f23851t = null;
        }
        Handler handler = this.f23856y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23856y = null;
        }
        this.f23844m.release();
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void t(o oVar, long j10, long j11, boolean z10) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        this.f23845n.d(oVar.f33652a);
        this.f23847p.l(c2638y, oVar.f33654c);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void w(o oVar, long j10, long j11) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        this.f23845n.d(oVar.f33652a);
        this.f23847p.o(c2638y, oVar.f33654c);
        this.f23855x = (Z1.a) oVar.d();
        this.f23854w = j10 - j11;
        L();
        M();
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        long jA = this.f23845n.a(new k.c(c2638y, new C2609B(oVar.f33654c), iOException, i10));
        m.c cVarH = jA == -9223372036854775807L ? m.f33635g : m.h(false, jA);
        boolean zC = cVarH.c();
        this.f23847p.s(c2638y, oVar.f33654c, iOException, !zC);
        if (!zC) {
            this.f23845n.d(oVar.f33652a);
        }
        return cVarH;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void s(o oVar, long j10, long j11, int i10) {
        this.f23847p.u(i10 == 0 ? new C2638y(oVar.f33652a, oVar.f33653b, j10) : new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a()), oVar.f33654c, i10);
    }

    public final void L() {
        f0 f0Var;
        for (int i10 = 0; i10 < this.f23849r.size(); i10++) {
            ((c) this.f23849r.get(i10)).x(this.f23855x);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (a.b bVar : this.f23855x.f20150f) {
            if (bVar.f20166k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f20166k - 1) + bVar.c(bVar.f20166k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j10 = this.f23855x.f20148d ? -9223372036854775807L : 0L;
            Z1.a aVar = this.f23855x;
            boolean z10 = aVar.f20148d;
            f0Var = new f0(j10, 0L, 0L, 0L, true, z10, z10, aVar, f());
        } else {
            Z1.a aVar2 = this.f23855x;
            if (aVar2.f20148d) {
                long j11 = aVar2.f20152h;
                if (j11 != -9223372036854775807L && j11 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j11);
                }
                long j12 = jMax2;
                long j13 = jMax - j12;
                long jM0 = j13 - G1.M.M0(this.f23846o);
                if (jM0 < 5000000) {
                    jM0 = Math.min(5000000L, j13 / 2);
                }
                f0Var = new f0(-9223372036854775807L, j13, j12, jM0, true, true, true, this.f23855x, f());
            } else {
                long j14 = aVar2.f20151g;
                if (j14 == -9223372036854775807L) {
                    j14 = jMax - jMax2;
                }
                long j15 = j14;
                f0Var = new f0(jMax2 + j15, j15, jMax2, 0L, true, false, false, this.f23855x, f());
            }
        }
        E(f0Var);
    }

    public final void M() {
        if (this.f23855x.f20148d) {
            this.f23856y.postDelayed(new Runnable() { // from class: Y1.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19675a.N();
                }
            }, Math.max(0L, (this.f23854w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void N() {
        if (this.f23851t.i()) {
            return;
        }
        o oVar = new o(this.f23850s, new j.b().i(this.f23840i).b(1).a(), 4, this.f23848q);
        this.f23851t.n(oVar, this, this.f23845n.b(oVar.f33654c));
    }

    @Override // a2.InterfaceC2611D
    public synchronized void b(r rVar) {
        this.f23857z = rVar;
    }

    @Override // a2.InterfaceC2611D
    public synchronized r f() {
        return this.f23857z;
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        ((c) interfaceC2610C).w();
        this.f23849r.remove(interfaceC2610C);
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        L.a aVarY = y(bVar);
        c cVar = new c(this.f23855x, this.f23842k, this.f23853v, this.f23843l, null, this.f23844m, v(bVar), this.f23845n, aVarY, this.f23852u, bVar2);
        this.f23849r.add(cVar);
        return cVar;
    }

    @Override // a2.InterfaceC2611D
    public void n() {
        this.f23852u.a();
    }

    public SsMediaSource(r rVar, Z1.a aVar, f.a aVar2, o.a aVar3, b.a aVar4, InterfaceC2624j interfaceC2624j, e eVar, u uVar, k kVar, long j10) {
        AbstractC0853a.g(aVar == null || !aVar.f20148d);
        this.f23857z = rVar;
        r.h hVar = (r.h) AbstractC0853a.e(rVar.f1873b);
        this.f23855x = aVar;
        this.f23840i = hVar.f1968a.equals(Uri.EMPTY) ? null : G1.M.F(hVar.f1968a);
        this.f23841j = aVar2;
        this.f23848q = aVar3;
        this.f23842k = aVar4;
        this.f23843l = interfaceC2624j;
        this.f23844m = uVar;
        this.f23845n = kVar;
        this.f23846o = j10;
        this.f23847p = y(null);
        this.f23839h = aVar != null;
        this.f23849r = new ArrayList();
    }
}
