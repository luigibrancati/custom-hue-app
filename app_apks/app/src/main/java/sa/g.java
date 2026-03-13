package sa;

import Eb.l;
import Eb.p;
import Eb.q;
import java.util.concurrent.atomic.AtomicLong;
import pa.AbstractC5451b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLong f44425d = new AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44426a = f44425d.getAndIncrement();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qa.j f44427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f44428c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f44429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f44430b;

        /* JADX INFO: renamed from: sa.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0597a implements p {
            public C0597a() {
            }

            @Override // Eb.p
            public void a() {
                g.this.f44428c.a();
            }

            @Override // Eb.p
            public void b(Hb.c cVar) {
                g.this.f44428c.b(cVar);
            }

            @Override // Eb.p
            public void c(Object obj) {
                g.this.f44428c.c(obj);
            }

            @Override // Eb.p
            public void onError(Throwable th) {
                g.this.f44428c.d(th);
            }
        }

        public a(j jVar, q qVar) {
            this.f44429a = jVar;
            this.f44430b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f44427b.l(this.f44429a).K0(this.f44430b).f(new C0597a());
        }
    }

    public g(qa.j jVar, l lVar) {
        this.f44427b = jVar;
        this.f44428c = lVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        int iCompareTo = this.f44427b.compareTo(gVar.f44427b);
        return (iCompareTo != 0 || gVar.f44427b == this.f44427b) ? iCompareTo : this.f44426a < gVar.f44426a ? -1 : 1;
    }

    public void b(j jVar, q qVar) {
        if (!this.f44428c.j()) {
            qVar.c(new a(jVar, qVar));
        } else {
            AbstractC5451b.r(this.f44427b);
            jVar.release();
        }
    }
}
