package Ud;

import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class D extends Vd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16990a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC4988e f16991b;

    @Override // Vd.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(B b10) {
        if (this.f16990a >= 0) {
            return false;
        }
        this.f16990a = b10.U();
        return true;
    }

    @Override // Vd.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC4988e[] b(B b10) {
        long j10 = this.f16990a;
        this.f16990a = -1L;
        this.f16991b = null;
        return b10.T(j10);
    }
}
