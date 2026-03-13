package Rd;

import Wd.AbstractC2333m;
import gc.C4199l;

/* JADX INFO: renamed from: Rd.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2135j0 extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4199l f15182d;

    public static /* synthetic */ void M0(AbstractC2135j0 abstractC2135j0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC2135j0.J0(z10);
    }

    public static /* synthetic */ void e1(AbstractC2135j0 abstractC2135j0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC2135j0.d1(z10);
    }

    @Override // Rd.I
    public final I C0(int i10, String str) {
        AbstractC2333m.a(i10);
        return AbstractC2333m.b(this, str);
    }

    public final void J0(boolean z10) {
        long jQ0 = this.f15180b - Q0(z10);
        this.f15180b = jQ0;
        if (jQ0 <= 0 && this.f15181c) {
            shutdown();
        }
    }

    public final long Q0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void W0(AbstractC2117a0 abstractC2117a0) {
        C4199l c4199l = this.f15182d;
        if (c4199l == null) {
            c4199l = new C4199l();
            this.f15182d = c4199l;
        }
        c4199l.addLast(abstractC2117a0);
    }

    public long c1() {
        C4199l c4199l = this.f15182d;
        return (c4199l == null || c4199l.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void d1(boolean z10) {
        this.f15180b += Q0(z10);
        if (z10) {
            return;
        }
        this.f15181c = true;
    }

    public final boolean f1() {
        return this.f15180b >= Q0(true);
    }

    public final boolean g1() {
        C4199l c4199l = this.f15182d;
        if (c4199l != null) {
            return c4199l.isEmpty();
        }
        return true;
    }

    public long h1() {
        return !i1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean i1() {
        AbstractC2117a0 abstractC2117a0;
        C4199l c4199l = this.f15182d;
        if (c4199l == null || (abstractC2117a0 = (AbstractC2117a0) c4199l.t()) == null) {
            return false;
        }
        abstractC2117a0.run();
        return true;
    }

    public boolean j1() {
        return false;
    }

    public void shutdown() {
    }
}
