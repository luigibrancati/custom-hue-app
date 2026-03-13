package Tb;

import Eb.u;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f16288a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.s, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16289a;

        public a(Eb.t tVar) {
            this.f16289a = tVar;
        }

        public void a(Throwable th) {
            if (d(th)) {
                return;
            }
            AbstractC2904a.q(th);
        }

        @Override // Eb.s
        public void b(Hb.c cVar) {
            Kb.c.s(this, cVar);
        }

        @Override // Eb.s
        public boolean d(Throwable th) {
            Hb.c cVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            Kb.c cVar2 = Kb.c.DISPOSED;
            if (obj == cVar2 || (cVar = (Hb.c) getAndSet(cVar2)) == cVar2) {
                return false;
            }
            try {
                this.f16289a.onError(th);
            } finally {
                if (cVar != null) {
                    cVar.dispose();
                }
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

        @Override // Eb.s
        public void onSuccess(Object obj) {
            Hb.c cVar;
            Object obj2 = get();
            Kb.c cVar2 = Kb.c.DISPOSED;
            if (obj2 == cVar2 || (cVar = (Hb.c) getAndSet(cVar2)) == cVar2) {
                return;
            }
            try {
                if (obj == null) {
                    this.f16289a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f16289a.onSuccess(obj);
                }
                if (cVar != null) {
                    cVar.dispose();
                }
            } catch (Throwable th) {
                if (cVar != null) {
                    cVar.dispose();
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public b(u uVar) {
        this.f16288a = uVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        a aVar = new a(tVar);
        tVar.b(aVar);
        try {
            this.f16288a.a(aVar);
        } catch (Throwable th) {
            Ib.b.b(th);
            aVar.a(th);
        }
    }
}
