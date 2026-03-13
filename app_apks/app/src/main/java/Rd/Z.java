package Rd;

import Wd.AbstractC2330j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Z extends Wd.A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15157e = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Z(InterfaceC4992i interfaceC4992i, InterfaceC4988e interfaceC4988e) {
        super(interfaceC4992i, interfaceC4988e);
    }

    private final boolean W0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15157e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f15157e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean X0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15157e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f15157e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Wd.A, Rd.F0
    public void H(Object obj) {
        P0(obj);
    }

    @Override // Wd.A, Rd.AbstractC2116a
    public void P0(Object obj) {
        if (W0()) {
            return;
        }
        AbstractC2330j.b(C5045b.c(this.f17895d), C.a(obj, this.f17895d));
    }

    public final Object U0() {
        if (X0()) {
            return C5046c.f();
        }
        Object objH = G0.h(h0());
        if (objH instanceof A) {
            throw ((A) objH).f15106a;
        }
        return objH;
    }
}
