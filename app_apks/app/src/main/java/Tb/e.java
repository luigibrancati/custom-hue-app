package Tb;

import Eb.v;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.a f16297b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.t, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.a f16299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f16300c;

        public a(Eb.t tVar, Jb.a aVar) {
            this.f16298a = tVar;
            this.f16299b = aVar;
        }

        public void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f16299b.run();
                } catch (Throwable th) {
                    Ib.b.b(th);
                    AbstractC2904a.q(th);
                }
            }
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f16300c, cVar)) {
                this.f16300c = cVar;
                this.f16298a.b(this);
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f16300c.dispose();
            a();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f16300c.j();
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f16298a.onError(th);
            a();
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            this.f16298a.onSuccess(obj);
            a();
        }
    }

    public e(v vVar, Jb.a aVar) {
        this.f16296a = vVar;
        this.f16297b = aVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16296a.c(new a(tVar, this.f16297b));
    }
}
