package Rb;

import Eb.k;
import Eb.n;
import Eb.p;
import Eb.t;
import Eb.v;
import Jb.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f15041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15042b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements p, t, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f15043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f15044b;

        public a(p pVar, e eVar) {
            this.f15043a = pVar;
            this.f15044b = eVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15043a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.p(this, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15043a.c(obj);
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
            this.f15043a.onError(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            try {
                ((n) Lb.b.e(this.f15044b.apply(obj), "The mapper returned a null Publisher")).f(this);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15043a.onError(th);
            }
        }
    }

    public d(v vVar, e eVar) {
        this.f15041a = vVar;
        this.f15042b = eVar;
    }

    @Override // Eb.k
    public void v0(p pVar) {
        a aVar = new a(pVar, this.f15042b);
        pVar.b(aVar);
        this.f15041a.c(aVar);
    }
}
