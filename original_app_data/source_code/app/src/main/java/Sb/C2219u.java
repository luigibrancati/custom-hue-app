package Sb;

/* JADX INFO: renamed from: Sb.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2219u extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.g f15813b;

    /* JADX INFO: renamed from: Sb.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Jb.g f15814f;

        public a(Eb.p pVar, Jb.g gVar) {
            super(pVar);
            this.f15814f = gVar;
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f10609e != 0) {
                this.f10605a.c(null);
                return;
            }
            try {
                if (this.f15814f.test(obj)) {
                    this.f10605a.c(obj);
                }
            } catch (Throwable th) {
                f(th);
            }
        }

        @Override // Mb.h
        public Object poll() {
            Object objPoll;
            do {
                objPoll = this.f10607c.poll();
                if (objPoll == null) {
                    break;
                }
            } while (!this.f15814f.test(objPoll));
            return objPoll;
        }

        @Override // Mb.d
        public int q(int i10) {
            return g(i10);
        }
    }

    public C2219u(Eb.n nVar, Jb.g gVar) {
        super(nVar);
        this.f15813b = gVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15813b));
    }
}
