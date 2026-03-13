package Ob;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Eb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.c f12139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f12140b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.b, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.b f12141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f12142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12143c;

        public a(Eb.b bVar, Jb.e eVar) {
            this.f12141a = bVar;
            this.f12142b = eVar;
        }

        @Override // Eb.b
        public void a() {
            this.f12141a.a();
        }

        @Override // Eb.b
        public void b(Hb.c cVar) {
            Kb.c.p(this, cVar);
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
            if (this.f12143c) {
                this.f12141a.onError(th);
                return;
            }
            this.f12143c = true;
            try {
                ((Eb.c) Lb.b.e(this.f12142b.apply(th), "The errorMapper returned a null CompletableSource")).b(this);
            } catch (Throwable th2) {
                Ib.b.b(th2);
                this.f12141a.onError(new Ib.a(th, th2));
            }
        }
    }

    public g(Eb.c cVar, Jb.e eVar) {
        this.f12139a = cVar;
        this.f12140b = eVar;
    }

    @Override // Eb.a
    public void m(Eb.b bVar) {
        a aVar = new a(bVar, this.f12140b);
        bVar.b(aVar);
        this.f12139a.b(aVar);
    }
}
