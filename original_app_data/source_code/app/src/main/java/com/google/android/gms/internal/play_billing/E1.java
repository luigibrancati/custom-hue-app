package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E1 extends Z0 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f30017h;

    public E1(Runnable runnable) {
        runnable.getClass();
        this.f30017h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3512c1
    public final String i() {
        return "task=[" + this.f30017h.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30017h.run();
        } catch (Throwable th) {
            q(th);
            throw th;
        }
    }
}
