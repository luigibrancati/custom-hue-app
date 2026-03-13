package Rd;

import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Y extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f15155a;

    public Y(Throwable th, I i10, InterfaceC4992i interfaceC4992i) {
        super("Coroutine dispatcher " + i10 + " threw an exception, context = " + interfaceC4992i, th);
        this.f15155a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f15155a;
    }
}
