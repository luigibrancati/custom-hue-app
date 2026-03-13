package I3;

import I3.N;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x extends N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f5642e = new b(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final x a(Class workerClass) {
            AbstractC4862t.e(workerClass, "workerClass");
            return (x) new a(workerClass).b();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a builder) {
        super(builder.e(), builder.h(), builder.f());
        AbstractC4862t.e(builder, "builder");
    }

    public static final x e(Class cls) {
        return f5642e.a(cls);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends N.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            AbstractC4862t.e(workerClass, "workerClass");
        }

        @Override // I3.N.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public x c() {
            if (d() && h().f13597j.j()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new x(this);
        }

        @Override // I3.N.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }
}
