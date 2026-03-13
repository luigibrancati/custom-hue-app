package Sb;

import bc.AbstractC2904a;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Sb.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2215p extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15787d;

    /* JADX INFO: renamed from: Sb.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f15790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Hb.c f15792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f15793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f15794g;

        public a(Eb.p pVar, long j10, Object obj, boolean z10) {
            this.f15788a = pVar;
            this.f15789b = j10;
            this.f15790c = obj;
            this.f15791d = z10;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15794g) {
                return;
            }
            this.f15794g = true;
            Object obj = this.f15790c;
            if (obj == null && this.f15791d) {
                this.f15788a.onError(new NoSuchElementException());
                return;
            }
            if (obj != null) {
                this.f15788a.c(obj);
            }
            this.f15788a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15792e, cVar)) {
                this.f15792e = cVar;
                this.f15788a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15794g) {
                return;
            }
            long j10 = this.f15793f;
            if (j10 != this.f15789b) {
                this.f15793f = j10 + 1;
                return;
            }
            this.f15794g = true;
            this.f15792e.dispose();
            this.f15788a.c(obj);
            this.f15788a.a();
        }

        @Override // Hb.c
        public void dispose() {
            this.f15792e.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15792e.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15794g) {
                AbstractC2904a.q(th);
            } else {
                this.f15794g = true;
                this.f15788a.onError(th);
            }
        }
    }

    public C2215p(Eb.n nVar, long j10, Object obj, boolean z10) {
        super(nVar);
        this.f15785b = j10;
        this.f15786c = obj;
        this.f15787d = z10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15785b, this.f15786c, this.f15787d));
    }
}
