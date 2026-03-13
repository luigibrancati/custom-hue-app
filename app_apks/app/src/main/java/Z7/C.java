package Z7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20318b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends C {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f20319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f20319c = bVar;
        }

        @Override // Z7.C
        public Object a(P7.g gVar) {
            return this.f20319c.a(gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        Object a(P7.g gVar);
    }

    public /* synthetic */ C(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static C b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(P7.g gVar);

    public Class c() {
        return this.f20317a;
    }

    public Class d() {
        return this.f20318b;
    }

    public C(Class cls, Class cls2) {
        this.f20317a = cls;
        this.f20318b = cls2;
    }
}
