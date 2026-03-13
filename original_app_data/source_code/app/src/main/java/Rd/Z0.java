package Rd;

import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Z0 extends Wd.A implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15158e;

    public Z0(long j10, InterfaceC4988e interfaceC4988e) {
        super(interfaceC4988e.getContext(), interfaceC4988e);
        this.f15158e = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        L(a1.a(this.f15158e, X.b(getContext()), this));
    }

    @Override // Rd.AbstractC2116a, Rd.F0
    public String u0() {
        return super.u0() + "(timeMillis=" + this.f15158e + ')';
    }
}
