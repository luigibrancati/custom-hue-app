package K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface f1 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(e1 e1Var);
    }

    static int D(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    static int F(int i10) {
        return i10 & 64;
    }

    static int Q(int i10) {
        return i10 & 7;
    }

    static int k(int i10) {
        return i10 & 384;
    }

    static boolean l(int i10, boolean z10) {
        int iQ = Q(i10);
        if (iQ != 4) {
            return z10 && iQ == 3;
        }
        return true;
    }

    static int o(int i10, int i11, int i12, int i13, int i14) {
        return D(i10, i11, i12, i13, i14, 0);
    }

    static int p(int i10, int i11, int i12, int i13) {
        return D(i10, i11, i12, 0, 128, i13);
    }

    static int q(int i10) {
        return i10 & 32;
    }

    static int s(int i10) {
        return i10 & 24;
    }

    static int u(int i10) {
        return p(i10, 0, 0, 0);
    }

    static int z(int i10) {
        return i10 & 3584;
    }

    int K();

    int a(D1.o oVar);

    int f();

    String getName();

    void i();

    void x(a aVar);
}
