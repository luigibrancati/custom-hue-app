package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f32116a = 100;

    public abstract void a(Object obj, int i10, int i11);

    public abstract void b(Object obj, int i10, long j10);

    public abstract void c(Object obj, int i10, Object obj2);

    public abstract void d(Object obj, int i10, AbstractC3722j abstractC3722j);

    public abstract void e(Object obj, int i10, long j10);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, z0 z0Var, int i10) {
        while (z0Var.z() != Integer.MAX_VALUE && m(obj, z0Var, i10)) {
        }
    }

    public final boolean m(Object obj, z0 z0Var, int i10) throws O {
        int tag = z0Var.getTag();
        int iA = Q0.a(tag);
        int iB = Q0.b(tag);
        if (iB == 0) {
            e(obj, iA, z0Var.G());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, z0Var.a());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, z0Var.n());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw O.e();
            }
            a(obj, iA, z0Var.t());
            return true;
        }
        Object objN = n();
        int iC = Q0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f32116a) {
            throw O.i();
        }
        l(objN, z0Var, i11);
        if (iC != z0Var.getTag()) {
            throw O.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(z0 z0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, R0 r02);

    public abstract void t(Object obj, R0 r02);
}
