package N6;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: N6.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1501u1 extends AbstractC1527w1 {
    public static E1 a(Object obj) {
        return new C1540x1(obj);
    }

    public static void b(E1 e12, InterfaceC1475s1 interfaceC1475s1, Executor executor) {
        e12.a(new RunnableC1488t1(e12, interfaceC1475s1), executor);
    }

    public static E1 c(C1382kb c1382kb, Executor executor) {
        H1 h12 = new H1(c1382kb);
        h12.run();
        return h12;
    }
}
