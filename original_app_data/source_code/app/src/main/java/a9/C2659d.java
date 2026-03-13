package a9;

/* JADX INFO: renamed from: a9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2659d implements Sa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2656a f21197a;

    public C2659d(C2656a c2656a) {
        this.f21197a = c2656a;
    }

    public static C2659d a(C2656a c2656a) {
        return new C2659d(c2656a);
    }

    public static P8.h c(C2656a c2656a) {
        return (P8.h) Sa.b.c(c2656a.c());
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public P8.h get() {
        return c(this.f21197a);
    }
}
