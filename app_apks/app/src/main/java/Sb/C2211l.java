package Sb;

/* JADX INFO: renamed from: Sb.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2211l extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.b f15761c;

    /* JADX INFO: renamed from: Sb.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Jb.e f15762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Jb.b f15763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f15764h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f15765i;

        public a(Eb.p pVar, Jb.e eVar, Jb.b bVar) {
            super(pVar);
            this.f15762f = eVar;
            this.f15763g = bVar;
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f10608d) {
                return;
            }
            if (this.f10609e != 0) {
                this.f10605a.c(obj);
                return;
            }
            try {
                Object objApply = this.f15762f.apply(obj);
                if (this.f15765i) {
                    boolean zTest = this.f15763g.test(this.f15764h, objApply);
                    this.f15764h = objApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f15765i = true;
                    this.f15764h = objApply;
                }
                this.f10605a.c(obj);
            } catch (Throwable th) {
                f(th);
            }
        }

        @Override // Mb.h
        public Object poll() {
            while (true) {
                Object objPoll = this.f10607c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f15762f.apply(objPoll);
                if (!this.f15765i) {
                    this.f15765i = true;
                    this.f15764h = objApply;
                    return objPoll;
                }
                if (!this.f15763g.test(this.f15764h, objApply)) {
                    this.f15764h = objApply;
                    return objPoll;
                }
                this.f15764h = objApply;
            }
        }

        @Override // Mb.d
        public int q(int i10) {
            return g(i10);
        }
    }

    public C2211l(Eb.n nVar, Jb.e eVar, Jb.b bVar) {
        super(nVar);
        this.f15760b = eVar;
        this.f15761c = bVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15760b, this.f15761c));
    }
}
