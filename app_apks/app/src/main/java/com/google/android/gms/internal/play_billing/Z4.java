package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z4 extends F1 {
    public Z4() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final void a(a5 a5Var, a5 a5Var2) {
        a5Var.f30128b = a5Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final void b(a5 a5Var, Thread thread) {
        a5Var.f30127a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final boolean c(c5 c5Var, C3651z3 c3651z3, C3651z3 c3651z32) {
        synchronized (c5Var) {
            try {
                if (c5Var.f30146b != c3651z3) {
                    return false;
                }
                c5Var.f30146b = c3651z32;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final boolean d(c5 c5Var, Object obj, Object obj2) {
        synchronized (c5Var) {
            try {
                if (c5Var.f30145a != obj) {
                    return false;
                }
                c5Var.f30145a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final boolean e(c5 c5Var, a5 a5Var, a5 a5Var2) {
        synchronized (c5Var) {
            try {
                if (c5Var.f30147c != a5Var) {
                    return false;
                }
                c5Var.f30147c = a5Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
