package Rd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: Rd.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2148q extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15202c = AtomicIntegerFieldUpdater.newUpdater(C2148q.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C2148q(InterfaceC4988e interfaceC4988e, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC4988e + " was cancelled normally");
        }
        super(th, z10);
    }

    public final boolean e() {
        return f15202c.compareAndSet(this, 0, 1);
    }
}
