package Z7;

import g8.C4160a;

/* JADX INFO: renamed from: Z7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2597g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4160a f20360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20361b;

    /* JADX INFO: renamed from: Z7.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC2597g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f20362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4160a c4160a, Class cls, b bVar) {
            super(c4160a, cls, null);
            this.f20362c = bVar;
        }

        @Override // Z7.AbstractC2597g
        public P7.g d(K k10, P7.x xVar) {
            return this.f20362c.a(k10, xVar);
        }
    }

    /* JADX INFO: renamed from: Z7.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        P7.g a(K k10, P7.x xVar);
    }

    public /* synthetic */ AbstractC2597g(C4160a c4160a, Class cls, a aVar) {
        this(c4160a, cls);
    }

    public static AbstractC2597g a(b bVar, C4160a c4160a, Class cls) {
        return new a(c4160a, cls, bVar);
    }

    public final C4160a b() {
        return this.f20360a;
    }

    public final Class c() {
        return this.f20361b;
    }

    public abstract P7.g d(K k10, P7.x xVar);

    public AbstractC2597g(C4160a c4160a, Class cls) {
        this.f20360a = c4160a;
        this.f20361b = cls;
    }
}
