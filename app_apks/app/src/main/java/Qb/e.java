package Qb;

import Eb.i;
import Eb.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Qb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f14247b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements i, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f14248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f14249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f14250c;

        public a(i iVar, Jb.e eVar) {
            this.f14248a = iVar;
            this.f14249b = eVar;
        }

        @Override // Eb.i
        public void a() {
            this.f14248a.a();
        }

        @Override // Eb.i
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f14250c, cVar)) {
                this.f14250c = cVar;
                this.f14248a.b(this);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Hb.c cVar = this.f14250c;
            this.f14250c = Kb.c.DISPOSED;
            cVar.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f14250c.j();
        }

        @Override // Eb.i
        public void onError(Throwable th) {
            this.f14248a.onError(th);
        }

        @Override // Eb.i
        public void onSuccess(Object obj) {
            try {
                this.f14248a.onSuccess(Lb.b.e(this.f14249b.apply(obj), "The mapper returned a null item"));
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f14248a.onError(th);
            }
        }
    }

    public e(j jVar, Jb.e eVar) {
        super(jVar);
        this.f14247b = eVar;
    }

    @Override // Eb.h
    public void f(i iVar) {
        this.f14235a.b(new a(iVar, this.f14247b));
    }
}
