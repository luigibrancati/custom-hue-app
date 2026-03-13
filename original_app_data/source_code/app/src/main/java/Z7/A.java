package Z7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20307b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f20308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f20308c = bVar;
        }

        @Override // Z7.A
        public K d(P7.v vVar) {
            return this.f20308c.a(vVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        K a(P7.v vVar);
    }

    public /* synthetic */ A(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static A a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f20306a;
    }

    public Class c() {
        return this.f20307b;
    }

    public abstract K d(P7.v vVar);

    public A(Class cls, Class cls2) {
        this.f20306a = cls;
        this.f20307b = cls2;
    }
}
