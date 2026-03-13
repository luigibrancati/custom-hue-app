package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3512c1 f30108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC3649z1 f30109b;

    public W0(AbstractC3512c1 abstractC3512c1, InterfaceFutureC3649z1 interfaceFutureC3649z1) {
        this.f30108a = abstractC3512c1;
        this.f30109b = interfaceFutureC3649z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30108a.f30138a != this) {
            return;
        }
        InterfaceFutureC3649z1 interfaceFutureC3649z1 = this.f30109b;
        if (AbstractC3512c1.f30136f.f(this.f30108a, this, AbstractC3512c1.t(interfaceFutureC3649z1))) {
            AbstractC3512c1.y(this.f30108a, false);
        }
    }
}
