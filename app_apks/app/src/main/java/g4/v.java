package g4;

import Rd.InterfaceC2166z0;
import androidx.lifecycle.InterfaceC2757m;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3.d f35515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.i f35516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f35517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2166z0 f35518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Y3.d imageLoader, i4.i request, u targetDelegate, InterfaceC2166z0 job) {
        super(null);
        AbstractC4862t.e(imageLoader, "imageLoader");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(targetDelegate, "targetDelegate");
        AbstractC4862t.e(job, "job");
        this.f35515a = imageLoader;
        this.f35516b = request;
        this.f35517c = targetDelegate;
        this.f35518d = job;
    }

    @Override // g4.r
    public void b() {
        InterfaceC2166z0.a.a(this.f35518d, null, 1, null);
        this.f35517c.a();
        n4.e.p(this.f35517c, null);
        if (this.f35516b.I() instanceof InterfaceC2757m) {
            this.f35516b.w().c((InterfaceC2757m) this.f35516b.I());
        }
        this.f35516b.w().c(this);
    }

    public final void c() {
        this.f35515a.a(this.f35516b);
    }
}
