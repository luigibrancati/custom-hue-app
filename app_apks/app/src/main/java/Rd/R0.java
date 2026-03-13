package Rd;

import fc.C4015H;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class R0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f15147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2138l f15148b;

    public R0(I i10, InterfaceC2138l interfaceC2138l) {
        this.f15147a = i10;
        this.f15148b = interfaceC2138l;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15148b.e(this.f15147a, C4015H.f34254a);
    }
}
