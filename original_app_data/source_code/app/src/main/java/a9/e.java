package a9;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Sa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2656a f21198a;

    public e(C2656a c2656a) {
        this.f21198a = c2656a;
    }

    public static e a(C2656a c2656a) {
        return new e(c2656a);
    }

    public static O8.b c(C2656a c2656a) {
        return (O8.b) Sa.b.c(c2656a.d());
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public O8.b get() {
        return c(this.f21198a);
    }
}
