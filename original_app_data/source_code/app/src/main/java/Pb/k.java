package Pb;

import bc.AbstractC2904a;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends Pb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13279d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Xb.c implements Eb.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f13280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f13281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Ze.c f13282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13283f;

        public a(Ze.b bVar, Object obj, boolean z10) {
            super(bVar);
            this.f13280c = obj;
            this.f13281d = z10;
        }

        @Override // Ze.b
        public void a() {
            if (this.f13283f) {
                return;
            }
            this.f13283f = true;
            Object obj = this.f19444b;
            this.f19444b = null;
            if (obj == null) {
                obj = this.f13280c;
            }
            if (obj != null) {
                e(obj);
            } else if (this.f13281d) {
                this.f19443a.onError(new NoSuchElementException());
            } else {
                this.f19443a.a();
            }
        }

        @Override // Ze.b
        public void c(Object obj) {
            if (this.f13283f) {
                return;
            }
            if (this.f19444b == null) {
                this.f19444b = obj;
                return;
            }
            this.f13283f = true;
            this.f13282e.cancel();
            this.f19443a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // Xb.c, Ze.c
        public void cancel() {
            super.cancel();
            this.f13282e.cancel();
        }

        @Override // Ze.b
        public void d(Ze.c cVar) {
            if (Xb.g.w(this.f13282e, cVar)) {
                this.f13282e = cVar;
                this.f19443a.d(this);
                cVar.p(Long.MAX_VALUE);
            }
        }

        @Override // Ze.b
        public void onError(Throwable th) {
            if (this.f13283f) {
                AbstractC2904a.q(th);
            } else {
                this.f13283f = true;
                this.f19443a.onError(th);
            }
        }
    }

    public k(Eb.f fVar, Object obj, boolean z10) {
        super(fVar);
        this.f13278c = obj;
        this.f13279d = z10;
    }

    @Override // Eb.f
    public void j(Ze.b bVar) {
        this.f13212b.i(new a(bVar, this.f13278c, this.f13279d));
    }
}
