package Z7;

import g8.C4160a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4160a f20396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20397b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f20398c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4160a c4160a, Class cls, b bVar) {
            super(c4160a, cls, null);
            this.f20398c = bVar;
        }

        @Override // Z7.z
        public P7.v d(K k10) {
            return this.f20398c.a(k10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        P7.v a(K k10);
    }

    public /* synthetic */ z(C4160a c4160a, Class cls, a aVar) {
        this(c4160a, cls);
    }

    public static z a(b bVar, C4160a c4160a, Class cls) {
        return new a(c4160a, cls, bVar);
    }

    public final C4160a b() {
        return this.f20396a;
    }

    public final Class c() {
        return this.f20397b;
    }

    public abstract P7.v d(K k10);

    public z(C4160a c4160a, Class cls) {
        this.f20396a = c4160a;
        this.f20397b = cls;
    }
}
