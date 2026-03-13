package Td;

import Rd.A0;
import Rd.AbstractC2116a;
import Rd.F0;
import java.util.concurrent.CancellationException;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends AbstractC2116a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f16408d;

    public h(InterfaceC4992i interfaceC4992i, g gVar, boolean z10, boolean z11) {
        super(interfaceC4992i, z10, z11);
        this.f16408d = gVar;
    }

    @Override // Rd.F0
    public void N(Throwable th) {
        CancellationException cancellationExceptionI0 = F0.I0(this, th, null, 1, null);
        this.f16408d.a(cancellationExceptionI0);
        L(cancellationExceptionI0);
    }

    public final g U0() {
        return this.f16408d;
    }

    @Override // Rd.F0, Rd.InterfaceC2166z0
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new A0(Q(), null, this);
        }
        N(cancellationException);
    }

    @Override // Td.x
    public i iterator() {
        return this.f16408d.iterator();
    }

    @Override // Td.y
    public Object n(Object obj) {
        return this.f16408d.n(obj);
    }

    @Override // Td.y
    public Object p(Object obj, InterfaceC4988e interfaceC4988e) {
        return this.f16408d.p(obj, interfaceC4988e);
    }

    @Override // Td.x
    public Object r(InterfaceC4988e interfaceC4988e) {
        return this.f16408d.r(interfaceC4988e);
    }

    @Override // Td.y
    public void s(vc.l lVar) {
        this.f16408d.s(lVar);
    }

    @Override // Td.x
    public Object t() {
        return this.f16408d.t();
    }

    @Override // Td.y
    public boolean w(Throwable th) {
        return this.f16408d.w(th);
    }

    @Override // Td.x
    public Object x(InterfaceC4988e interfaceC4988e) {
        Object objX = this.f16408d.x(interfaceC4988e);
        C5046c.f();
        return objX;
    }

    @Override // Td.y
    public boolean z() {
        return this.f16408d.z();
    }

    public final g T0() {
        return this;
    }
}
