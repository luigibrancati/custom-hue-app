package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class L0 extends J0 {
    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public K0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(K0 k02) {
        return k02.d();
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(K0 k02) {
        return k02.e();
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public K0 k(K0 k02, K0 k03) {
        return K0.c().equals(k03) ? k02 : K0.c().equals(k02) ? K0.n(k02, k03) : k02.k(k03);
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public K0 n() {
        return K0.o();
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, K0 k02) {
        p(obj, k02);
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, K0 k02) {
        ((GeneratedMessageLite) obj).unknownFields = k02;
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public K0 r(K0 k02) {
        k02.h();
        return k02;
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(K0 k02, R0 r02) {
        k02.t(r02);
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(K0 k02, R0 r02) {
        k02.v(r02);
    }

    @Override // com.google.protobuf.J0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.protobuf.J0
    public boolean q(z0 z0Var) {
        return false;
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(K0 k02, int i10, int i11) {
        k02.r(Q0.c(i10, 5), Integer.valueOf(i11));
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(K0 k02, int i10, long j10) {
        k02.r(Q0.c(i10, 1), Long.valueOf(j10));
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(K0 k02, int i10, K0 k03) {
        k02.r(Q0.c(i10, 3), k03);
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(K0 k02, int i10, AbstractC3722j abstractC3722j) {
        k02.r(Q0.c(i10, 2), abstractC3722j);
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(K0 k02, int i10, long j10) {
        k02.r(Q0.c(i10, 0), Long.valueOf(j10));
    }

    @Override // com.google.protobuf.J0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public K0 f(Object obj) {
        K0 k0G = g(obj);
        if (k0G != K0.c()) {
            return k0G;
        }
        K0 k0O = K0.o();
        p(obj, k0O);
        return k0O;
    }
}
