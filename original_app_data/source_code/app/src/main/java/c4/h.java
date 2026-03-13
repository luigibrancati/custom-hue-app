package c4;

import Fe.AbstractC0852n;
import Fe.C0843e;
import Fe.J;
import Rd.InterfaceC2138l;
import fc.C4015H;
import fc.C4025h;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0852n implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f25614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread f25615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC2138l continuation, J delegate) {
        int i10;
        super(delegate);
        AbstractC4862t.e(continuation, "continuation");
        AbstractC4862t.e(delegate, "delegate");
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.f25614b = atomicInteger;
        this.f25615c = Thread.currentThread();
        continuation.b(this);
        do {
            i10 = atomicInteger.get();
            if (i10 != 1) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    return;
                }
                c(i10);
                throw new C4025h();
            }
        } while (!this.f25614b.compareAndSet(i10, 1));
    }

    @Override // Fe.AbstractC0852n, Fe.J
    public long V0(C0843e sink, long j10) {
        AbstractC4862t.e(sink, "sink");
        try {
            i(false);
            return super.V0(sink, j10);
        } finally {
            i(true);
        }
    }

    public final void b() {
        AtomicInteger atomicInteger = this.f25614b;
        while (true) {
            int i10 = atomicInteger.get();
            if (i10 == 0 || i10 == 3) {
                if (this.f25614b.compareAndSet(i10, 2)) {
                    return;
                }
            } else if (i10 != 4) {
                if (i10 == 5) {
                    Thread.interrupted();
                    return;
                } else {
                    c(i10);
                    throw new C4025h();
                }
            }
        }
    }

    public final Void c(int i10) {
        throw new IllegalStateException(AbstractC4862t.k("Illegal state: ", Integer.valueOf(i10)).toString());
    }

    public void f(Throwable th) {
        AtomicInteger atomicInteger = this.f25614b;
        while (true) {
            int i10 = atomicInteger.get();
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                        return;
                    }
                    c(i10);
                    throw new C4025h();
                }
                if (this.f25614b.compareAndSet(i10, 3)) {
                    return;
                }
            } else if (this.f25614b.compareAndSet(i10, 4)) {
                this.f25615c.interrupt();
                this.f25614b.set(5);
                return;
            }
        }
    }

    public final void i(boolean z10) {
        AtomicInteger atomicInteger = this.f25614b;
        while (true) {
            int i10 = atomicInteger.get();
            if (i10 == 0 || i10 == 1) {
                if (this.f25614b.compareAndSet(i10, 1 ^ (z10 ? 1 : 0))) {
                    return;
                }
            } else if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 == 5) {
                        Thread.interrupted();
                        return;
                    } else {
                        c(i10);
                        throw new C4025h();
                    }
                }
            } else if (this.f25614b.compareAndSet(i10, 4)) {
                this.f25615c.interrupt();
                this.f25614b.set(5);
                return;
            }
        }
    }

    @Override // vc.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return C4015H.f34254a;
    }
}
