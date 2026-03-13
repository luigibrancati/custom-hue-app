package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends g0 {
    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public h0 g(Object obj) {
        return ((AbstractC2713t) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(h0 h0Var) {
        return h0Var.d();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(h0 h0Var) {
        return h0Var.e();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public h0 k(h0 h0Var, h0 h0Var2) {
        return h0.c().equals(h0Var2) ? h0Var : h0.c().equals(h0Var) ? h0.j(h0Var, h0Var2) : h0Var.i(h0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public h0 n() {
        return h0.k();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, h0 h0Var) {
        p(obj, h0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, h0 h0Var) {
        ((AbstractC2713t) obj).unknownFields = h0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public h0 r(h0 h0Var) {
        h0Var.h();
        return h0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(h0 h0Var, m0 m0Var) {
        h0Var.p(m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(h0 h0Var, m0 m0Var) {
        h0Var.r(m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public boolean q(Y y10) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(h0 h0Var, int i10, int i11) {
        h0Var.n(l0.c(i10, 5), Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(h0 h0Var, int i10, long j10) {
        h0Var.n(l0.c(i10, 1), Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(h0 h0Var, int i10, h0 h0Var2) {
        h0Var.n(l0.c(i10, 3), h0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(h0 h0Var, int i10, AbstractC2700f abstractC2700f) {
        h0Var.n(l0.c(i10, 2), abstractC2700f);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(h0 h0Var, int i10, long j10) {
        h0Var.n(l0.c(i10, 0), Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public h0 f(Object obj) {
        h0 h0VarG = g(obj);
        if (h0VarG != h0.c()) {
            return h0VarG;
        }
        h0 h0VarK = h0.k();
        p(obj, h0VarK);
        return h0VarK;
    }
}
