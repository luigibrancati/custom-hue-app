package Rd;

import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f15161b = new b1();

    @Override // Rd.I
    public I C0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        f1 f1Var = (f1) interfaceC4992i.get(f1.f15174b);
        if (f1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f1Var.f15175a = true;
    }

    @Override // Rd.I
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // Rd.I
    public boolean v0(InterfaceC4992i interfaceC4992i) {
        return false;
    }
}
