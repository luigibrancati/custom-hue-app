package Yd;

import Rd.AbstractC2149q0;
import Rd.I;
import Wd.F;
import Wd.H;
import java.util.concurrent.Executor;
import lc.C4993j;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2149q0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20052c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f20053d = I.G0(k.f20070b, H.e("kotlinx.coroutines.io.parallelism", Bc.k.e(64, F.a()), 0, 0, 12, null), null, 2, null);

    @Override // Rd.I
    public I C0(int i10, String str) {
        return k.f20070b.C0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k0(C4993j.f40088a, runnable);
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        f20053d.k0(interfaceC4992i, runnable);
    }

    @Override // Rd.I
    public void p0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        f20053d.p0(interfaceC4992i, runnable);
    }

    @Override // Rd.I
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // Rd.AbstractC2149q0
    public Executor J0() {
        return this;
    }
}
