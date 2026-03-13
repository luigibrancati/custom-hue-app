package x;

import L.C1095e0;
import L.C1128v0;
import w.C6107a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class H1 extends C6205a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H1 f46629c = new H1(new B.j());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.j f46630b;

    public H1(B.j jVar) {
        this.f46630b = jVar;
    }

    @Override // x.C6205a0, L.C1095e0.b
    public void a(L.s1 s1Var, C1095e0.a aVar) {
        super.a(s1Var, aVar);
        if (!(s1Var instanceof C1128v0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C1128v0 c1128v0 = (C1128v0) s1Var;
        C6107a.C0631a c0631a = new C6107a.C0631a();
        if (c1128v0.k0()) {
            this.f46630b.a(c1128v0.e0(), c0631a);
        }
        aVar.e(c0631a.c());
    }
}
