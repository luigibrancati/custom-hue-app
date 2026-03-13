package Pb;

import bc.AbstractC2904a;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends Pb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13215e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Xb.c implements Eb.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f13216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f13217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f13218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Ze.c f13219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f13220g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f13221h;

        public a(Ze.b bVar, long j10, Object obj, boolean z10) {
            super(bVar);
            this.f13216c = j10;
            this.f13217d = obj;
            this.f13218e = z10;
        }

        @Override // Ze.b
        public void a() {
            if (this.f13221h) {
                return;
            }
            this.f13221h = true;
            Object obj = this.f13217d;
            if (obj != null) {
                e(obj);
            } else if (this.f13218e) {
                this.f19443a.onError(new NoSuchElementException());
            } else {
                this.f19443a.a();
            }
        }

        @Override // Ze.b
        public void c(Object obj) {
            if (this.f13221h) {
                return;
            }
            long j10 = this.f13220g;
            if (j10 != this.f13216c) {
                this.f13220g = j10 + 1;
                return;
            }
            this.f13221h = true;
            this.f13219f.cancel();
            e(obj);
        }

        @Override // Xb.c, Ze.c
        public void cancel() {
            super.cancel();
            this.f13219f.cancel();
        }

        @Override // Ze.b
        public void d(Ze.c cVar) {
            if (Xb.g.w(this.f13219f, cVar)) {
                this.f13219f = cVar;
                this.f19443a.d(this);
                cVar.p(Long.MAX_VALUE);
            }
        }

        @Override // Ze.b
        public void onError(Throwable th) {
            if (this.f13221h) {
                AbstractC2904a.q(th);
            } else {
                this.f13221h = true;
                this.f19443a.onError(th);
            }
        }
    }

    public b(Eb.f fVar, long j10, Object obj, boolean z10) {
        super(fVar);
        this.f13213c = j10;
        this.f13214d = obj;
        this.f13215e = z10;
    }

    @Override // Eb.f
    public void j(Ze.b bVar) {
        this.f13212b.i(new a(bVar, this.f13213c, this.f13214d, this.f13215e));
    }
}
