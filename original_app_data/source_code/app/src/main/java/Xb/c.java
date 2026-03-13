package Xb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ze.b f19443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19444b;

    public c(Ze.b bVar) {
        this.f19443a = bVar;
    }

    public void cancel() {
        set(4);
        this.f19444b = null;
    }

    @Override // Mb.h
    public final void clear() {
        lazySet(32);
        this.f19444b = null;
    }

    public final void e(Object obj) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                Ze.b bVar = this.f19443a;
                bVar.c(obj);
                if (get() != 4) {
                    bVar.a();
                    return;
                }
                return;
            }
            this.f19444b = obj;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f19444b = null;
                return;
            }
        }
        this.f19444b = obj;
        lazySet(16);
        Ze.b bVar2 = this.f19443a;
        bVar2.c(obj);
        if (get() != 4) {
            bVar2.a();
        }
    }

    @Override // Mb.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // Ze.c
    public final void p(long j10) {
        Object obj;
        if (g.v(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f19444b) == null) {
                        return;
                    }
                    this.f19444b = null;
                    Ze.b bVar = this.f19443a;
                    bVar.c(obj);
                    if (get() != 4) {
                        bVar.a();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // Mb.h
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f19444b;
        this.f19444b = null;
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
