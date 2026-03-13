package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Sb.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2206g extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.m f15705a;

    /* JADX INFO: renamed from: Sb.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.l, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15706a;

        public a(Eb.p pVar) {
            this.f15706a = pVar;
        }

        @Override // Eb.e
        public void a() {
            if (j()) {
                return;
            }
            try {
                this.f15706a.a();
            } finally {
                dispose();
            }
        }

        @Override // Eb.l
        public void b(Hb.c cVar) {
            Kb.c.s(this, cVar);
        }

        @Override // Eb.e
        public void c(Object obj) {
            if (obj == null) {
                e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (j()) {
                    return;
                }
                this.f15706a.c(obj);
            }
        }

        @Override // Eb.l
        public boolean d(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (j()) {
                return false;
            }
            try {
                this.f15706a.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        public void e(Throwable th) {
            if (d(th)) {
                return;
            }
            AbstractC2904a.q(th);
        }

        @Override // Eb.l, Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.l
        public void k(Jb.c cVar) {
            b(new Kb.a(cVar));
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public C2206g(Eb.m mVar) {
        this.f15705a = mVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar = new a(pVar);
        pVar.b(aVar);
        try {
            this.f15705a.a(aVar);
        } catch (Throwable th) {
            Ib.b.b(th);
            aVar.e(th);
        }
    }
}
