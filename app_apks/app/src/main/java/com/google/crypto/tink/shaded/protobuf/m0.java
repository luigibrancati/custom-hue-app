package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f31521a = 100;

    public abstract void a(Object obj, int i10, int i11);

    public abstract void b(Object obj, int i10, long j10);

    public abstract void c(Object obj, int i10, Object obj2);

    public abstract void d(Object obj, int i10, AbstractC3661h abstractC3661h);

    public abstract void e(Object obj, int i10, long j10);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, e0 e0Var, int i10) {
        while (e0Var.z() != Integer.MAX_VALUE && m(obj, e0Var, i10)) {
        }
    }

    public final boolean m(Object obj, e0 e0Var, int i10) throws A {
        int tag = e0Var.getTag();
        int iA = r0.a(tag);
        int iB = r0.b(tag);
        if (iB == 0) {
            e(obj, iA, e0Var.G());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, e0Var.a());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, e0Var.n());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw A.b();
            }
            if (iB != 5) {
                throw A.e();
            }
            a(obj, iA, e0Var.t());
            return true;
        }
        Object objN = n();
        int iC = r0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f31521a) {
            throw A.i();
        }
        l(objN, e0Var, i11);
        if (iC != e0Var.getTag()) {
            throw A.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(e0 e0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, s0 s0Var);

    public abstract void t(Object obj, s0 s0Var);
}
