package d6;

import ec.InterfaceC3978a;

/* JADX INFO: renamed from: d6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3830a implements InterfaceC3978a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f33141c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC3978a f33142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f33143b = f33141c;

    public C3830a(InterfaceC3978a interfaceC3978a) {
        this.f33142a = interfaceC3978a;
    }

    public static InterfaceC3978a a(InterfaceC3978a interfaceC3978a) {
        AbstractC3833d.b(interfaceC3978a);
        return interfaceC3978a instanceof C3830a ? interfaceC3978a : new C3830a(interfaceC3978a);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f33141c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ec.InterfaceC3978a
    public Object get() {
        Object obj;
        Object obj2 = this.f33143b;
        Object obj3 = f33141c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f33143b;
                if (obj == obj3) {
                    obj = this.f33142a.get();
                    this.f33143b = b(this.f33143b, obj);
                    this.f33142a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
