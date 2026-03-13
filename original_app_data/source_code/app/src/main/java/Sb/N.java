package Sb;

import dc.C3891b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class N extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15516b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3891b f15517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f15518b;

        public a(C3891b c3891b, AtomicReference atomicReference) {
            this.f15517a = c3891b;
            this.f15518b = atomicReference;
        }

        @Override // Eb.p
        public void a() {
            this.f15517a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15518b, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15517a.c(obj);
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15517a.onError(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicReference implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Hb.c f15520b;

        public b(Eb.p pVar) {
            this.f15519a = pVar;
        }

        @Override // Eb.p
        public void a() {
            Kb.c.a(this);
            this.f15519a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15520b, cVar)) {
                this.f15520b = cVar;
                this.f15519a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15519a.c(obj);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15520b.dispose();
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15520b.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            Kb.c.a(this);
            this.f15519a.onError(th);
        }
    }

    public N(Eb.n nVar, Jb.e eVar) {
        super(nVar);
        this.f15516b = eVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        C3891b c3891bQ0 = C3891b.Q0();
        try {
            Eb.n nVar = (Eb.n) Lb.b.e(this.f15516b.apply(c3891bQ0), "The selector returned a null ObservableSource");
            b bVar = new b(pVar);
            nVar.f(bVar);
            this.f15624a.f(new a(c3891bQ0, bVar));
        } catch (Throwable th) {
            Ib.b.b(th);
            Kb.d.p(th, pVar);
        }
    }
}
