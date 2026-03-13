package Rd;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: Rd.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2125e0 implements InterfaceC2127f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f15172a;

    public C2125e0(Future future) {
        this.f15172a = future;
    }

    @Override // Rd.InterfaceC2127f0
    public void dispose() {
        this.f15172a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f15172a + ']';
    }
}
