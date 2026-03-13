package Ob;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends Eb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.c f12121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.c f12122b;

    /* JADX INFO: renamed from: Ob.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0159a implements Eb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f12123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Eb.b f12124b;

        public C0159a(AtomicReference atomicReference, Eb.b bVar) {
            this.f12123a = atomicReference;
            this.f12124b = bVar;
        }

        @Override // Eb.b
        public void a() {
            this.f12124b.a();
        }

        @Override // Eb.b
        public void b(Hb.c cVar) {
            Kb.c.p(this.f12123a, cVar);
        }

        @Override // Eb.b
        public void onError(Throwable th) {
            this.f12124b.onError(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicReference implements Eb.b, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.b f12125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Eb.c f12126b;

        public b(Eb.b bVar, Eb.c cVar) {
            this.f12125a = bVar;
            this.f12126b = cVar;
        }

        @Override // Eb.b
        public void a() {
            this.f12126b.b(new C0159a(this, this.f12125a));
        }

        @Override // Eb.b
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar)) {
                this.f12125a.b(this);
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

        @Override // Eb.b
        public void onError(Throwable th) {
            this.f12125a.onError(th);
        }
    }

    public a(Eb.c cVar, Eb.c cVar2) {
        this.f12121a = cVar;
        this.f12122b = cVar2;
    }

    @Override // Eb.a
    public void m(Eb.b bVar) {
        this.f12121a.b(new b(bVar, this.f12122b));
    }
}
