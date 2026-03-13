package W3;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements X3.a, V3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17818c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile X3.a f17819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f17820b = f17818c;

    public b(X3.a aVar) {
        this.f17819a = aVar;
    }

    public static V3.a a(X3.a aVar) {
        return aVar instanceof V3.a ? (V3.a) aVar : new b((X3.a) e.b(aVar));
    }

    public static X3.a b(X3.a aVar) {
        e.b(aVar);
        return aVar instanceof b ? aVar : new b(aVar);
    }

    public static Object c(Object obj, Object obj2) {
        if (obj == f17818c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // X3.a
    public Object get() {
        Object obj;
        Object obj2 = this.f17820b;
        Object obj3 = f17818c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f17820b;
                if (obj == obj3) {
                    obj = this.f17819a.get();
                    this.f17820b = c(this.f17820b, obj);
                    this.f17819a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
