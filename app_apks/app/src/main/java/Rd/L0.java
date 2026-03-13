package Rd;

import java.util.concurrent.CancellationException;
import lc.AbstractC4984a;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class L0 extends AbstractC4984a implements InterfaceC2166z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f15142a = new L0();

    public L0() {
        super(InterfaceC2166z0.f15218M);
    }

    @Override // Rd.InterfaceC2166z0
    public InterfaceC2151s K(InterfaceC2155u interfaceC2155u) {
        return M0.f15143a;
    }

    @Override // Rd.InterfaceC2166z0
    public Object a0(InterfaceC4988e interfaceC4988e) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Rd.InterfaceC2166z0
    public boolean c() {
        return true;
    }

    @Override // Rd.InterfaceC2166z0
    public InterfaceC2127f0 d(boolean z10, boolean z11, vc.l lVar) {
        return M0.f15143a;
    }

    @Override // Rd.InterfaceC2166z0
    public Nd.h g() {
        return Nd.q.i();
    }

    @Override // Rd.InterfaceC2166z0
    public CancellationException h() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Rd.InterfaceC2166z0
    public boolean isCancelled() {
        return false;
    }

    @Override // Rd.InterfaceC2166z0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // Rd.InterfaceC2166z0
    public InterfaceC2127f0 u(vc.l lVar) {
        return M0.f15143a;
    }

    @Override // Rd.InterfaceC2166z0
    public void a(CancellationException cancellationException) {
    }
}
