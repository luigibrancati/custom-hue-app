package Sb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class F extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15467b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Jb.e f15468f;

        public a(Eb.p pVar, Jb.e eVar) {
            super(pVar);
            this.f15468f = eVar;
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f10608d) {
                return;
            }
            if (this.f10609e != 0) {
                this.f10605a.c(null);
                return;
            }
            try {
                this.f10605a.c(Lb.b.e(this.f15468f.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                f(th);
            }
        }

        @Override // Mb.h
        public Object poll() {
            Object objPoll = this.f10607c.poll();
            if (objPoll != null) {
                return Lb.b.e(this.f15468f.apply(objPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // Mb.d
        public int q(int i10) {
            return g(i10);
        }
    }

    public F(Eb.n nVar, Jb.e eVar) {
        super(nVar);
        this.f15467b = eVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15467b));
    }
}
