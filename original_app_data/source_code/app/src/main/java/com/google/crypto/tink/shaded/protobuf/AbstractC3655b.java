package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3655b implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3669p f31425a = C3669p.b();

    public final Q c(Q q10) throws A {
        if (q10 == null || q10.isInitialized()) {
            return q10;
        }
        throw d(q10).a().k(q10);
    }

    public final l0 d(Q q10) {
        return q10 instanceof AbstractC3654a ? ((AbstractC3654a) q10).e() : new l0(q10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Z
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Q b(AbstractC3661h abstractC3661h, C3669p c3669p) {
        return c(f(abstractC3661h, c3669p));
    }

    public Q f(AbstractC3661h abstractC3661h, C3669p c3669p) throws A {
        AbstractC3662i abstractC3662iT = abstractC3661h.t();
        Q q10 = (Q) a(abstractC3662iT, c3669p);
        try {
            abstractC3662iT.a(0);
            return q10;
        } catch (A e10) {
            throw e10.k(q10);
        }
    }
}
