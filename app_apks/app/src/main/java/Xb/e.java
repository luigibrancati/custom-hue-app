package Xb;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicInteger implements Mb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ze.b f19446b;

    public e(Ze.b bVar, Object obj) {
        this.f19446b = bVar;
        this.f19445a = obj;
    }

    @Override // Ze.c
    public void cancel() {
        lazySet(2);
    }

    @Override // Mb.h
    public void clear() {
        lazySet(1);
    }

    @Override // Mb.h
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // Mb.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Ze.c
    public void p(long j10) {
        if (g.v(j10) && compareAndSet(0, 1)) {
            Ze.b bVar = this.f19446b;
            bVar.c(this.f19445a);
            if (get() != 2) {
                bVar.a();
            }
        }
    }

    @Override // Mb.h
    public Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f19445a;
    }

    @Override // Mb.d
    public int q(int i10) {
        return i10 & 1;
    }
}
