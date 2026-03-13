package Qb;

import Eb.i;
import Eb.j;
import Eb.r;
import Eb.t;
import Eb.v;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f14252b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements i, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f14253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f14254b;

        /* JADX INFO: renamed from: Qb.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0174a implements t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t f14255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference f14256b;

            public C0174a(t tVar, AtomicReference atomicReference) {
                this.f14255a = tVar;
                this.f14256b = atomicReference;
            }

            @Override // Eb.t
            public void b(Hb.c cVar) {
                Kb.c.u(this.f14256b, cVar);
            }

            @Override // Eb.t
            public void onError(Throwable th) {
                this.f14255a.onError(th);
            }

            @Override // Eb.t
            public void onSuccess(Object obj) {
                this.f14255a.onSuccess(obj);
            }
        }

        public a(t tVar, v vVar) {
            this.f14253a = tVar;
            this.f14254b = vVar;
        }

        @Override // Eb.i
        public void a() {
            Hb.c cVar = (Hb.c) get();
            if (cVar == Kb.c.DISPOSED || !compareAndSet(cVar, null)) {
                return;
            }
            this.f14254b.c(new C0174a(this.f14253a, this));
        }

        @Override // Eb.i
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar)) {
                this.f14253a.b(this);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.i
        public void onError(Throwable th) {
            this.f14253a.onError(th);
        }

        @Override // Eb.i
        public void onSuccess(Object obj) {
            this.f14253a.onSuccess(obj);
        }
    }

    public f(j jVar, v vVar) {
        this.f14251a = jVar;
        this.f14252b = vVar;
    }

    @Override // Eb.r
    public void C(t tVar) {
        this.f14251a.b(new a(tVar, this.f14252b));
    }
}
