package Z7;

import Z7.F;
import Z7.InterfaceC2599i;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20323b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f20326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f20327b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f20326a.equals(this.f20326a) && cVar.f20327b.equals(this.f20327b);
        }

        public int hashCode() {
            return Objects.hash(this.f20326a, this.f20327b);
        }

        public String toString() {
            return this.f20326a.getSimpleName() + " with primitive type: " + this.f20327b.getSimpleName();
        }

        public c(Class cls, Class cls2) {
            this.f20326a = cls;
            this.f20327b = cls2;
        }
    }

    public static /* synthetic */ Object a(E e10, F f10, InterfaceC2599i.a aVar) {
        e10.getClass();
        return e10.f(aVar.getKey(), f10.c());
    }

    public static b d() {
        return new b();
    }

    public static b e(E e10) {
        return new b();
    }

    public Object f(P7.g gVar, Class cls) throws GeneralSecurityException {
        c cVar = new c(gVar.getClass(), cls);
        if (this.f20322a.containsKey(cVar)) {
            return ((C) this.f20322a.get(cVar)).a(gVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public Object g(InterfaceC2599i interfaceC2599i, C2603m c2603m, Class cls) throws GeneralSecurityException {
        if (this.f20323b.containsKey(cls)) {
            return h(interfaceC2599i, c2603m, (F) this.f20323b.get(cls));
        }
        throw new GeneralSecurityException("No wrapper found for " + cls);
    }

    public final Object h(InterfaceC2599i interfaceC2599i, C2603m c2603m, final F f10) {
        return f10.b(interfaceC2599i, c2603m, new F.a() { // from class: Z7.D
            @Override // Z7.F.a
            public final Object a(InterfaceC2599i.a aVar) {
                return E.a(this.f20320a, f10, aVar);
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f20324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f20325b;

        public E c() {
            return new E(this);
        }

        public b d(C c10) throws GeneralSecurityException {
            if (c10 == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(c10.c(), c10.d());
            if (!this.f20324a.containsKey(cVar)) {
                this.f20324a.put(cVar, c10);
                return this;
            }
            C c11 = (C) this.f20324a.get(cVar);
            if (c11.equals(c10) && c10.equals(c11)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        public b e(F f10) throws GeneralSecurityException {
            if (f10 == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class clsA = f10.a();
            if (!this.f20325b.containsKey(clsA)) {
                this.f20325b.put(clsA, f10);
                return this;
            }
            F f11 = (F) this.f20325b.get(clsA);
            if (f11.equals(f10) && f10.equals(f11)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsA);
        }

        public b() {
            this.f20324a = new HashMap();
            this.f20325b = new HashMap();
        }

        public b(E e10) {
            this.f20324a = new HashMap(e10.f20322a);
            this.f20325b = new HashMap(e10.f20323b);
        }
    }

    public E(b bVar) {
        this.f20322a = new HashMap(bVar.f20324a);
        this.f20323b = new HashMap(bVar.f20325b);
    }
}
