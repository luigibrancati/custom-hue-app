package r9;

/* JADX INFO: renamed from: r9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5680c implements InterfaceC5679b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5680c f43839b = new C5680c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43840a;

    public C5680c(Object obj) {
        this.f43840a = obj;
    }

    public static InterfaceC5679b a(Object obj) {
        return new C5680c(AbstractC5681d.c(obj, "instance cannot be null"));
    }

    @Override // ec.InterfaceC3978a
    public Object get() {
        return this.f43840a;
    }
}
