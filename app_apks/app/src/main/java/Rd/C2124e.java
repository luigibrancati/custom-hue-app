package Rd;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2124e extends AbstractC2116a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f15170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2135j0 f15171e;

    public C2124e(InterfaceC4992i interfaceC4992i, Thread thread, AbstractC2135j0 abstractC2135j0) {
        super(interfaceC4992i, true, true);
        this.f15170d = thread;
        this.f15171e = abstractC2135j0;
    }

    @Override // Rd.F0
    public void H(Object obj) {
        if (AbstractC4862t.a(Thread.currentThread(), this.f15170d)) {
            return;
        }
        Thread thread = this.f15170d;
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        if (abstractC2118b != null) {
            abstractC2118b.f(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    public final Object T0() throws Throwable {
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        if (abstractC2118b != null) {
            abstractC2118b.c();
        }
        try {
            AbstractC2135j0 abstractC2135j0 = this.f15171e;
            if (abstractC2135j0 != null) {
                AbstractC2135j0.e1(abstractC2135j0, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC2135j0 abstractC2135j02 = this.f15171e;
                    long jH1 = abstractC2135j02 != null ? abstractC2135j02.h1() : Long.MAX_VALUE;
                    if (F()) {
                        break;
                    }
                    AbstractC2118b abstractC2118b2 = AbstractC2120c.f15162a;
                    if (abstractC2118b2 != null) {
                        abstractC2118b2.b(this, jH1);
                    } else {
                        LockSupport.parkNanos(this, jH1);
                    }
                    if (Thread.interrupted()) {
                        L(new InterruptedException());
                    }
                } catch (Throwable th) {
                    AbstractC2135j0 abstractC2135j03 = this.f15171e;
                    if (abstractC2135j03 != null) {
                        AbstractC2135j0.M0(abstractC2135j03, false, 1, null);
                    }
                    throw th;
                }
            }
            AbstractC2135j0 abstractC2135j04 = this.f15171e;
            if (abstractC2135j04 != null) {
                AbstractC2135j0.M0(abstractC2135j04, false, 1, null);
            }
            Object objH = G0.h(h0());
            A a10 = objH instanceof A ? (A) objH : null;
            if (a10 == null) {
                return objH;
            }
            throw a10.f15106a;
        } finally {
            AbstractC2118b abstractC2118b3 = AbstractC2120c.f15162a;
            if (abstractC2118b3 != null) {
                abstractC2118b3.g();
            }
        }
    }

    @Override // Rd.F0
    public boolean o0() {
        return true;
    }
}
