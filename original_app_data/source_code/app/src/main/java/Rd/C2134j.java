package Rd;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: Rd.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2134j implements InterfaceC2136k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f15179a;

    public C2134j(Future future) {
        this.f15179a = future;
    }

    @Override // Rd.InterfaceC2136k
    public void a(Throwable th) {
        this.f15179a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f15179a + ']';
    }
}
