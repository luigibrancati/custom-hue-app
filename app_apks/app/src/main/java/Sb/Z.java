package Sb;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Z extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.g f15619b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.g f15621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15623d;

        public a(Eb.p pVar, Jb.g gVar) {
            this.f15620a = pVar;
            this.f15621b = gVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15623d) {
                return;
            }
            this.f15623d = true;
            this.f15620a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15622c, cVar)) {
                this.f15622c = cVar;
                this.f15620a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15623d) {
                return;
            }
            this.f15620a.c(obj);
            try {
                if (this.f15621b.test(obj)) {
                    this.f15623d = true;
                    this.f15622c.dispose();
                    this.f15620a.a();
                }
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15622c.dispose();
                onError(th);
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15622c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15622c.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15623d) {
                AbstractC2904a.q(th);
            } else {
                this.f15623d = true;
                this.f15620a.onError(th);
            }
        }
    }

    public Z(Eb.n nVar, Jb.g gVar) {
        super(nVar);
        this.f15619b = gVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15619b));
    }
}
