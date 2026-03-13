package Qb;

import Eb.i;
import Eb.j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Qb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f14242b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements i, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f14243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f14244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f14245c;

        /* JADX INFO: renamed from: Qb.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0173a implements i {
            public C0173a() {
            }

            @Override // Eb.i
            public void a() {
                a.this.f14243a.a();
            }

            @Override // Eb.i
            public void b(Hb.c cVar) {
                Kb.c.u(a.this, cVar);
            }

            @Override // Eb.i
            public void onError(Throwable th) {
                a.this.f14243a.onError(th);
            }

            @Override // Eb.i
            public void onSuccess(Object obj) {
                a.this.f14243a.onSuccess(obj);
            }
        }

        public a(i iVar, Jb.e eVar) {
            this.f14243a = iVar;
            this.f14244b = eVar;
        }

        @Override // Eb.i
        public void a() {
            this.f14243a.a();
        }

        @Override // Eb.i
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f14245c, cVar)) {
                this.f14245c = cVar;
                this.f14243a.b(this);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
            this.f14245c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.i
        public void onError(Throwable th) {
            this.f14243a.onError(th);
        }

        @Override // Eb.i
        public void onSuccess(Object obj) {
            try {
                j jVar = (j) Lb.b.e(this.f14244b.apply(obj), "The mapper returned a null MaybeSource");
                if (j()) {
                    return;
                }
                jVar.b(new C0173a());
            } catch (Exception e10) {
                Ib.b.b(e10);
                this.f14243a.onError(e10);
            }
        }
    }

    public d(j jVar, Jb.e eVar) {
        super(jVar);
        this.f14242b = eVar;
    }

    @Override // Eb.h
    public void f(i iVar) {
        this.f14235a.b(new a(iVar, this.f14242b));
    }
}
