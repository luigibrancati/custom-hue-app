package Ob;

import Eb.k;
import Eb.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.c f12144a;

    public h(Eb.c cVar) {
        this.f12144a = cVar;
    }

    @Override // Eb.k
    public void v0(p pVar) {
        this.f12144a.b(new a(pVar));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.c implements Eb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f12145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Hb.c f12146b;

        public a(p pVar) {
            this.f12145a = pVar;
        }

        @Override // Eb.b
        public void a() {
            this.f12145a.a();
        }

        @Override // Eb.b
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f12146b, cVar)) {
                this.f12146b = cVar;
                this.f12145a.b(this);
            }
        }

        @Override // Mb.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void poll() {
            return null;
        }

        @Override // Hb.c
        public void dispose() {
            this.f12146b.dispose();
        }

        @Override // Mb.h
        public boolean isEmpty() {
            return true;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f12146b.j();
        }

        @Override // Eb.b
        public void onError(Throwable th) {
            this.f12145a.onError(th);
        }

        @Override // Mb.d
        public int q(int i10) {
            return i10 & 2;
        }

        @Override // Mb.h
        public void clear() {
        }
    }
}
