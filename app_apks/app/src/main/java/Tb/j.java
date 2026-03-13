package Tb;

import Eb.v;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f16316b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.t, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f16318b;

        /* JADX INFO: renamed from: Tb.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0200a implements Eb.t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AtomicReference f16319a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Eb.t f16320b;

            public C0200a(AtomicReference atomicReference, Eb.t tVar) {
                this.f16319a = atomicReference;
                this.f16320b = tVar;
            }

            @Override // Eb.t
            public void b(Hb.c cVar) {
                Kb.c.p(this.f16319a, cVar);
            }

            @Override // Eb.t
            public void onError(Throwable th) {
                this.f16320b.onError(th);
            }

            @Override // Eb.t
            public void onSuccess(Object obj) {
                this.f16320b.onSuccess(obj);
            }
        }

        public a(Eb.t tVar, Jb.e eVar) {
            this.f16317a = tVar;
            this.f16318b = eVar;
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar)) {
                this.f16317a.b(this);
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

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f16317a.onError(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            try {
                v vVar = (v) Lb.b.e(this.f16318b.apply(obj), "The single returned by the mapper is null");
                if (j()) {
                    return;
                }
                vVar.c(new C0200a(this, this.f16317a));
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f16317a.onError(th);
            }
        }
    }

    public j(v vVar, Jb.e eVar) {
        this.f16316b = eVar;
        this.f16315a = vVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16315a.c(new a(tVar, this.f16316b));
    }
}
