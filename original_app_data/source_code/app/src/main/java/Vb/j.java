package Vb;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends a implements Runnable {
    public j(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f17371b = Thread.currentThread();
        try {
            this.f17370a.run();
            this.f17371b = null;
        } catch (Throwable th) {
            this.f17371b = null;
            lazySet(a.f17368c);
            AbstractC2904a.q(th);
        }
    }
}
