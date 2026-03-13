package a9;

/* JADX INFO: renamed from: a9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2657b implements Sa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2656a f21195a;

    public C2657b(C2656a c2656a) {
        this.f21195a = c2656a;
    }

    public static C2657b a(C2656a c2656a) {
        return new C2657b(c2656a);
    }

    public static Y8.a c(C2656a c2656a) {
        return (Y8.a) Sa.b.c(c2656a.a());
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Y8.a get() {
        return c(this.f21195a);
    }
}
