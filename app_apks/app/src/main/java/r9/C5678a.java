package r9;

/* JADX INFO: renamed from: r9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5678a implements InterfaceC5682e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43836c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC5682e f43837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f43838b = f43836c;

    public C5678a(InterfaceC5682e interfaceC5682e) {
        this.f43837a = interfaceC5682e;
    }

    public static InterfaceC5682e a(InterfaceC5682e interfaceC5682e) {
        AbstractC5681d.b(interfaceC5682e);
        return interfaceC5682e instanceof C5678a ? interfaceC5682e : new C5678a(interfaceC5682e);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f43836c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ec.InterfaceC3978a
    public Object get() {
        Object obj;
        Object obj2 = this.f43838b;
        Object obj3 = f43836c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f43838b;
                if (obj == obj3) {
                    obj = this.f43837a.get();
                    this.f43838b = b(this.f43838b, obj);
                    this.f43837a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
