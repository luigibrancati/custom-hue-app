package K1;

import G1.InterfaceC0860h;
import K1.c1;
import a2.InterfaceC2611D;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface e1 extends c1.b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a();

        void b();
    }

    boolean B();

    default long E(long j10, long j11) {
        if (getState() == 1) {
            return (isReady() || b()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    f1 G();

    long L();

    void M(long j10);

    G0 N();

    void O(D1.D d10);

    void P(int i10, L1.B0 b02, InterfaceC0860h interfaceC0860h);

    boolean b();

    void c();

    int f();

    void g(long j10, long j11);

    String getName();

    int getState();

    a2.c0 h();

    boolean isReady();

    boolean j();

    void n();

    void r(g1 g1Var, D1.o[] oVarArr, a2.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, InterfaceC2611D.b bVar);

    void release();

    void reset();

    void start();

    void stop();

    void t(D1.o[] oVarArr, a2.c0 c0Var, long j10, long j11, InterfaceC2611D.b bVar);

    void y();

    default void m() {
    }

    default void I(float f10, float f11) {
    }
}
