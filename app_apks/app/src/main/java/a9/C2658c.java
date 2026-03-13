package a9;

import h8.C4288f;

/* JADX INFO: renamed from: a9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2658c implements Sa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2656a f21196a;

    public C2658c(C2656a c2656a) {
        this.f21196a = c2656a;
    }

    public static C2658c a(C2656a c2656a) {
        return new C2658c(c2656a);
    }

    public static C4288f c(C2656a c2656a) {
        return (C4288f) Sa.b.c(c2656a.b());
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4288f get() {
        return c(this.f21196a);
    }
}
