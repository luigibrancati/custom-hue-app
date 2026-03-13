package d6;

/* JADX INFO: renamed from: d6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3832c implements InterfaceC3831b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3832c f33144b = new C3832c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33145a;

    public C3832c(Object obj) {
        this.f33145a = obj;
    }

    public static InterfaceC3831b a(Object obj) {
        return new C3832c(AbstractC3833d.c(obj, "instance cannot be null"));
    }

    @Override // ec.InterfaceC3978a
    public Object get() {
        return this.f33145a;
    }
}
