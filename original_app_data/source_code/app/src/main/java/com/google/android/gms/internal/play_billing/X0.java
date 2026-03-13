package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X0 extends R0 {
    public /* synthetic */ X0(AbstractC3536g1 abstractC3536g1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final U0 a(AbstractC3512c1 abstractC3512c1, U0 u02) {
        U0 u03;
        synchronized (abstractC3512c1) {
            try {
                u03 = abstractC3512c1.f30139b;
                if (u03 != u02) {
                    abstractC3512c1.f30139b = u02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u03;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final C3506b1 b(AbstractC3512c1 abstractC3512c1, C3506b1 c3506b1) {
        C3506b1 c3506b12;
        synchronized (abstractC3512c1) {
            try {
                c3506b12 = abstractC3512c1.f30140c;
                if (c3506b12 != c3506b1) {
                    abstractC3512c1.f30140c = c3506b1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3506b12;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final void c(C3506b1 c3506b1, C3506b1 c3506b12) {
        c3506b1.f30131b = c3506b12;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final void d(C3506b1 c3506b1, Thread thread) {
        c3506b1.f30130a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean e(AbstractC3512c1 abstractC3512c1, U0 u02, U0 u03) {
        synchronized (abstractC3512c1) {
            try {
                if (abstractC3512c1.f30139b != u02) {
                    return false;
                }
                abstractC3512c1.f30139b = u03;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean f(AbstractC3512c1 abstractC3512c1, Object obj, Object obj2) {
        synchronized (abstractC3512c1) {
            try {
                if (abstractC3512c1.f30138a != obj) {
                    return false;
                }
                abstractC3512c1.f30138a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean g(AbstractC3512c1 abstractC3512c1, C3506b1 c3506b1, C3506b1 c3506b12) {
        synchronized (abstractC3512c1) {
            try {
                if (abstractC3512c1.f30140c != c3506b1) {
                    return false;
                }
                abstractC3512c1.f30140c = c3506b12;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
