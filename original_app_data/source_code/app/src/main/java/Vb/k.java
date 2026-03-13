package Vb;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends a implements Callable {
    public k(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f17371b = Thread.currentThread();
        try {
            this.f17370a.run();
            return null;
        } finally {
            lazySet(a.f17368c);
            this.f17371b = null;
        }
    }
}
