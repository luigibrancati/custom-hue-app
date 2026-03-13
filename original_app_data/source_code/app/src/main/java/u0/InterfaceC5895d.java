package u0;

import n0.C5068f;

/* JADX INFO: renamed from: u0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5895d {
    static /* synthetic */ C5068f e(InterfaceC5895d interfaceC5895d, InterfaceC5895d interfaceC5895d2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return interfaceC5895d.j(interfaceC5895d2, z10);
    }

    boolean d();

    long f();

    C5068f j(InterfaceC5895d interfaceC5895d, boolean z10);

    long k(InterfaceC5895d interfaceC5895d, long j10, boolean z10);

    long l(long j10);

    long o(long j10);

    InterfaceC5895d q();
}
