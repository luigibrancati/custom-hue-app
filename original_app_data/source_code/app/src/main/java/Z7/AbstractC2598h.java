package Z7;

/* JADX INFO: renamed from: Z7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2598h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20364b;

    /* JADX INFO: renamed from: Z7.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC2598h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f20365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f20365c = bVar;
        }

        @Override // Z7.AbstractC2598h
        public K d(P7.g gVar, P7.x xVar) {
            return this.f20365c.a(gVar, xVar);
        }
    }

    /* JADX INFO: renamed from: Z7.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        K a(P7.g gVar, P7.x xVar);
    }

    public /* synthetic */ AbstractC2598h(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static AbstractC2598h a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f20363a;
    }

    public Class c() {
        return this.f20364b;
    }

    public abstract K d(P7.g gVar, P7.x xVar);

    public AbstractC2598h(Class cls, Class cls2) {
        this.f20363a = cls;
        this.f20364b = cls2;
    }
}
