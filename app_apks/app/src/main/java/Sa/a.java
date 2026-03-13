package Sa;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15429c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f15430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f15431b = f15429c;

    public a(c cVar) {
        this.f15430a = cVar;
    }

    public static c a(c cVar) {
        b.b(cVar);
        return cVar instanceof a ? cVar : new a(cVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f15429c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ec.InterfaceC3978a
    public Object get() {
        Object obj;
        Object obj2 = this.f15431b;
        Object obj3 = f15429c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f15431b;
                if (obj == obj3) {
                    obj = this.f15430a.get();
                    this.f15431b = b(this.f15431b, obj);
                    this.f15430a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
