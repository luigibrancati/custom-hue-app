package Qb;

import Eb.h;
import Eb.i;
import Eb.t;
import Eb.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f14237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.g f14238b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements t, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f14239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.g f14240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f14241c;

        public a(i iVar, Jb.g gVar) {
            this.f14239a = iVar;
            this.f14240b = gVar;
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f14241c, cVar)) {
                this.f14241c = cVar;
                this.f14239a.b(this);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Hb.c cVar = this.f14241c;
            this.f14241c = Kb.c.DISPOSED;
            cVar.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f14241c.j();
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f14239a.onError(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            try {
                if (this.f14240b.test(obj)) {
                    this.f14239a.onSuccess(obj);
                } else {
                    this.f14239a.a();
                }
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f14239a.onError(th);
            }
        }
    }

    public c(v vVar, Jb.g gVar) {
        this.f14237a = vVar;
        this.f14238b = gVar;
    }

    @Override // Eb.h
    public void f(i iVar) {
        this.f14237a.c(new a(iVar, this.f14238b));
    }
}
