package x7;

import b7.C2878l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2878l f47488a;

    public g() {
        this.f47488a = null;
    }

    public abstract void a();

    public final C2878l b() {
        return this.f47488a;
    }

    public final void c(Exception exc) {
        C2878l c2878l = this.f47488a;
        if (c2878l != null) {
            c2878l.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public g(C2878l c2878l) {
        this.f47488a = c2878l;
    }
}
