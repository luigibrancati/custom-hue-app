package sa;

import Eb.l;
import Eb.m;
import Eb.q;
import pa.AbstractC5451b;

/* JADX INFO: renamed from: sa.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5814b implements InterfaceC5813a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f44398a = new h();

    /* JADX INFO: renamed from: sa.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f44399a;

        public a(q qVar) {
            this.f44399a = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    g gVarD = C5814b.this.f44398a.d();
                    qa.j jVar = gVarD.f44427b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    AbstractC5451b.s(jVar);
                    AbstractC5451b.q(jVar);
                    j jVar2 = new j();
                    gVarD.b(jVar2, this.f44399a);
                    jVar2.a();
                    AbstractC5451b.n(jVar, jCurrentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e10) {
                    ma.q.e(e10, "Error while processing client operation queue", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: sa.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0596b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qa.j f44401a;

        /* JADX INFO: renamed from: sa.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f44403a;

            public a(g gVar) {
                this.f44403a = gVar;
            }

            @Override // Jb.a
            public void run() {
                if (C5814b.this.f44398a.c(this.f44403a)) {
                    AbstractC5451b.p(C0596b.this.f44401a);
                }
            }
        }

        public C0596b(qa.j jVar) {
            this.f44401a = jVar;
        }

        @Override // Eb.m
        public void a(l lVar) {
            g gVar = new g(this.f44401a, lVar);
            lVar.b(Hb.d.c(new a(gVar)));
            AbstractC5451b.o(this.f44401a);
            C5814b.this.f44398a.a(gVar);
        }
    }

    public C5814b(q qVar) {
        new Thread(new a(qVar)).start();
    }

    @Override // sa.InterfaceC5813a
    public Eb.k a(qa.j jVar) {
        return Eb.k.m(new C0596b(jVar));
    }
}
