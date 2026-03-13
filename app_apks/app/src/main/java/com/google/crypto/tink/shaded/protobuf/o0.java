package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class o0 extends m0 {
    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public n0 g(Object obj) {
        return ((AbstractC3676x) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(n0 n0Var) {
        return n0Var.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(n0 n0Var) {
        return n0Var.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public n0 k(n0 n0Var, n0 n0Var2) {
        return n0.c().equals(n0Var2) ? n0Var : n0.c().equals(n0Var) ? n0.j(n0Var, n0Var2) : n0Var.i(n0Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public n0 n() {
        return n0.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, n0 n0Var) {
        p(obj, n0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, n0 n0Var) {
        ((AbstractC3676x) obj).unknownFields = n0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public n0 r(n0 n0Var) {
        n0Var.h();
        return n0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(n0 n0Var, s0 s0Var) {
        n0Var.p(s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(n0 n0Var, s0 s0Var) {
        n0Var.r(s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public boolean q(e0 e0Var) {
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(n0 n0Var, int i10, int i11) {
        n0Var.n(r0.c(i10, 5), Integer.valueOf(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(n0 n0Var, int i10, long j10) {
        n0Var.n(r0.c(i10, 1), Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(n0 n0Var, int i10, n0 n0Var2) {
        n0Var.n(r0.c(i10, 3), n0Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(n0 n0Var, int i10, AbstractC3661h abstractC3661h) {
        n0Var.n(r0.c(i10, 2), abstractC3661h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(n0 n0Var, int i10, long j10) {
        n0Var.n(r0.c(i10, 0), Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public n0 f(Object obj) {
        n0 n0VarG = g(obj);
        if (n0VarG != n0.c()) {
            return n0VarG;
        }
        n0 n0VarK = n0.k();
        p(obj, n0VarK);
        return n0VarK;
    }
}
