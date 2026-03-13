package Nb;

import Eb.p;
import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10615b;

    public f(p pVar) {
        this.f10614a = pVar;
    }

    @Override // Mb.h
    public final void clear() {
        lazySet(32);
        this.f10615b = null;
    }

    public final void d() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f10614a.a();
    }

    @Override // Hb.c
    public void dispose() {
        set(4);
        this.f10615b = null;
    }

    public final void e(Object obj) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        p pVar = this.f10614a;
        if (i10 == 8) {
            this.f10615b = obj;
            lazySet(16);
            pVar.c(null);
        } else {
            lazySet(2);
            pVar.c(obj);
        }
        if (get() != 4) {
            pVar.a();
        }
    }

    public final void f(Throwable th) {
        if ((get() & 54) != 0) {
            AbstractC2904a.q(th);
        } else {
            lazySet(2);
            this.f10614a.onError(th);
        }
    }

    @Override // Mb.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // Hb.c
    public final boolean j() {
        return get() == 4;
    }

    @Override // Mb.h
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f10615b;
        this.f10615b = null;
        lazySet(32);
        return obj;
    }

    @Override // Mb.d
    public final int q(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
