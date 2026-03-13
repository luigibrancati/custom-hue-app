package x7;

import b7.C2878l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2878l f47492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f47493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f47494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, C2878l c2878l, C2878l c2878l2, g gVar) {
        super(c2878l);
        this.f47492b = c2878l2;
        this.f47493c = gVar;
        this.f47494d = qVar;
    }

    @Override // x7.g
    public final void a() {
        synchronized (this.f47494d.f47506f) {
            try {
                q.n(this.f47494d, this.f47492b);
                if (this.f47494d.f47511k.getAndIncrement() > 0) {
                    this.f47494d.f47502b.c("Already connected to the service.", new Object[0]);
                }
                q.p(this.f47494d, this.f47493c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
