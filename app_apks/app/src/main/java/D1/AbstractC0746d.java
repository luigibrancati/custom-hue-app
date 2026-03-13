package D1;

import D1.D;
import K7.AbstractC1081v;
import java.util.List;

/* JADX INFO: renamed from: D1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0746d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.c f1683a = new D.c();

    @Override // D1.z
    public final boolean B0() {
        D dU0 = u0();
        return !dU0.q() && dU0.n(D0(), this.f1683a).f1480h;
    }

    @Override // D1.z
    public final void C0(r rVar) {
        l(AbstractC1081v.A(rVar));
    }

    @Override // D1.z
    public final boolean F0() {
        D dU0 = u0();
        return !dU0.q() && dU0.n(D0(), this.f1683a).f();
    }

    public final long e() {
        D dU0 = u0();
        if (dU0.q()) {
            return -9223372036854775807L;
        }
        return dU0.n(D0(), this.f1683a).d();
    }

    public final int f() {
        D dU0 = u0();
        if (dU0.q()) {
            return -1;
        }
        return dU0.e(D0(), h(), E0());
    }

    public final int g() {
        D dU0 = u0();
        if (dU0.q()) {
            return -1;
        }
        return dU0.l(D0(), h(), E0());
    }

    public final int h() {
        int iE0 = e0();
        if (iE0 == 1) {
            return 0;
        }
        return iE0;
    }

    public abstract void i(int i10, long j10, int i11, boolean z10);

    @Override // D1.z
    public final void i0() {
        k(D0(), 4);
    }

    public final void j(long j10, int i10) {
        i(D0(), j10, i10, false);
    }

    public final void k(int i10, int i11) {
        i(i10, -9223372036854775807L, i11, false);
    }

    public final void l(List list) {
        j0(list, true);
    }

    @Override // D1.z
    public final void pause() {
        n0(false);
    }

    @Override // D1.z
    public final void play() {
        n0(true);
    }

    @Override // D1.z
    public final boolean q0() {
        return f() != -1;
    }

    @Override // D1.z
    public final boolean s0() {
        D dU0 = u0();
        return !dU0.q() && dU0.n(D0(), this.f1683a).f1481i;
    }

    @Override // D1.z
    public final void seekTo(long j10) {
        j(j10, 5);
    }

    @Override // D1.z
    public final boolean y0() {
        return g() != -1;
    }
}
