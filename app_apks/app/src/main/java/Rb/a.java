package Rb;

import Eb.k;
import Eb.n;
import Eb.p;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.c f15023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15024b;

    /* JADX INFO: renamed from: Rb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0182a extends AtomicReference implements p, Eb.b, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f15025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f15026b;

        public C0182a(p pVar, n nVar) {
            this.f15026b = nVar;
            this.f15025a = pVar;
        }

        @Override // Eb.p
        public void a() {
            n nVar = this.f15026b;
            if (nVar == null) {
                this.f15025a.a();
            } else {
                this.f15026b = null;
                nVar.f(this);
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.p(this, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15025a.c(obj);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15025a.onError(th);
        }
    }

    public a(Eb.c cVar, n nVar) {
        this.f15023a = cVar;
        this.f15024b = nVar;
    }

    @Override // Eb.k
    public void v0(p pVar) {
        C0182a c0182a = new C0182a(pVar, this.f15024b);
        pVar.b(c0182a);
        this.f15023a.b(c0182a);
    }
}
