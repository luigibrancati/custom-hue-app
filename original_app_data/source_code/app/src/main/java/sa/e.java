package sa;

import Eb.l;
import Eb.m;
import Eb.q;
import ac.AbstractC2684a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import la.C4973e;
import la.C4974f;
import oa.InterfaceC5261m;
import oa.InterfaceC5273z;
import pa.AbstractC5451b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e implements d, InterfaceC5261m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5273z f44407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2684a f44408c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Future f44410e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f44409d = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f44411f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4974f f44412g = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f44413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44414b;

        public a(q qVar, String str) {
            this.f44413a = qVar;
            this.f44414b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (e.this.f44411f) {
                try {
                    g gVarD = e.this.f44409d.d();
                    qa.j jVar = gVarD.f44427b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    AbstractC5451b.s(jVar);
                    AbstractC5451b.q(jVar);
                    j jVar2 = new j();
                    gVarD.b(jVar2, this.f44413a);
                    jVar2.a();
                    AbstractC5451b.n(jVar, jCurrentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e10) {
                    synchronized (e.this) {
                        try {
                            if (!e.this.f44411f) {
                                e.this.d();
                                ma.q.p("Terminated (%s)", AbstractC5451b.d(this.f44414b));
                            }
                            ma.q.e(e10, "Error while processing connection operation queue", new Object[0]);
                        } finally {
                        }
                    }
                }
            }
            e.this.d();
            ma.q.p("Terminated (%s)", AbstractC5451b.d(this.f44414b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qa.j f44416a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f44418a;

            public a(g gVar) {
                this.f44418a = gVar;
            }

            @Override // Jb.c
            public void cancel() {
                if (e.this.f44409d.c(this.f44418a)) {
                    AbstractC5451b.p(b.this.f44416a);
                }
            }
        }

        public b(qa.j jVar) {
            this.f44416a = jVar;
        }

        @Override // Eb.m
        public void a(l lVar) {
            g gVar = new g(this.f44416a, lVar);
            lVar.k(new a(gVar));
            AbstractC5451b.o(this.f44416a);
            e.this.f44409d.a(gVar);
        }
    }

    public e(String str, InterfaceC5273z interfaceC5273z, ExecutorService executorService, q qVar) {
        this.f44406a = str;
        this.f44407b = interfaceC5273z;
        this.f44410e = executorService.submit(new a(qVar, str));
    }

    @Override // sa.InterfaceC5813a
    public synchronized Eb.k a(qa.j jVar) {
        if (this.f44411f) {
            return Eb.k.m(new b(jVar));
        }
        return Eb.k.G(this.f44412g);
    }

    @Override // oa.InterfaceC5261m
    public void b() {
        this.f44408c.dispose();
        this.f44408c = null;
        e(new C4973e(this.f44406a, -1));
    }

    @Override // oa.InterfaceC5261m
    public void c() {
        this.f44408c = (AbstractC2684a) this.f44407b.a().x0(new c());
    }

    public synchronized void d() {
        while (!this.f44409d.b()) {
            this.f44409d.e().f44428c.d(this.f44412g);
        }
    }

    public synchronized void e(C4974f c4974f) {
        if (this.f44412g != null) {
            return;
        }
        ma.q.c(c4974f, "Connection operations queue to be terminated (%s)", AbstractC5451b.d(this.f44406a));
        this.f44411f = false;
        this.f44412g = c4974f;
        this.f44410e.cancel(true);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AbstractC2684a {
        public c() {
        }

        @Override // Eb.p
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(C4974f c4974f) {
            e.this.e(c4974f);
        }

        @Override // Eb.p
        public void a() {
        }

        @Override // Eb.p
        public void onError(Throwable th) {
        }
    }
}
