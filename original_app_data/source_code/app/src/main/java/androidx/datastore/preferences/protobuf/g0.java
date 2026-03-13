package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f22829a = 100;

    public abstract void a(Object obj, int i10, int i11);

    public abstract void b(Object obj, int i10, long j10);

    public abstract void c(Object obj, int i10, Object obj2);

    public abstract void d(Object obj, int i10, AbstractC2700f abstractC2700f);

    public abstract void e(Object obj, int i10, long j10);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, Y y10, int i10) {
        while (y10.z() != Integer.MAX_VALUE && m(obj, y10, i10)) {
        }
    }

    public final boolean m(Object obj, Y y10, int i10) throws C2715v {
        int tag = y10.getTag();
        int iA = l0.a(tag);
        int iB = l0.b(tag);
        if (iB == 0) {
            e(obj, iA, y10.G());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, y10.a());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, y10.n());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C2715v.e();
            }
            a(obj, iA, y10.t());
            return true;
        }
        Object objN = n();
        int iC = l0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f22829a) {
            throw C2715v.i();
        }
        l(objN, y10, i11);
        if (iC != y10.getTag()) {
            throw C2715v.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(Y y10);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, m0 m0Var);

    public abstract void t(Object obj, m0 m0Var);
}
