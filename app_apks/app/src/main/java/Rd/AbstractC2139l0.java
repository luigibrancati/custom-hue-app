package Rd;

import Rd.AbstractC2137k0;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Rd.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2139l0 extends AbstractC2135j0 {
    public abstract Thread k1();

    public void l1(long j10, AbstractC2137k0.c cVar) {
        S.f15149h.z1(j10, cVar);
    }

    public final void m1() {
        Thread threadK1 = k1();
        if (Thread.currentThread() != threadK1) {
            AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
            if (abstractC2118b != null) {
                abstractC2118b.f(threadK1);
            } else {
                LockSupport.unpark(threadK1);
            }
        }
    }
}
