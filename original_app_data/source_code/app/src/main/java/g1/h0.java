package g1;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements InterfaceC4992i.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34937c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f34938d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f34939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4105o f34940b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: g1.h0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0456a implements InterfaceC4992i.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0456a f34941a = new C0456a();
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public h0(h0 h0Var, C4105o instance) {
        AbstractC4862t.e(instance, "instance");
        this.f34939a = h0Var;
        this.f34940b = instance;
    }

    public final void b(InterfaceC4099i candidate) {
        AbstractC4862t.e(candidate, "candidate");
        if (this.f34940b == candidate) {
            throw new IllegalStateException(f34938d.toString());
        }
        h0 h0Var = this.f34939a;
        if (h0Var != null) {
            h0Var.b(candidate);
        }
    }

    @Override // lc.InterfaceC4992i
    public /* bridge */ Object fold(Object obj, vc.p pVar) {
        return InterfaceC4992i.b.a.a(this, obj, pVar);
    }

    @Override // lc.InterfaceC4992i.b, lc.InterfaceC4992i
    public /* bridge */ InterfaceC4992i.b get(InterfaceC4992i.c cVar) {
        return InterfaceC4992i.b.a.b(this, cVar);
    }

    @Override // lc.InterfaceC4992i.b
    public InterfaceC4992i.c getKey() {
        return a.C0456a.f34941a;
    }

    @Override // lc.InterfaceC4992i
    public /* bridge */ InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return InterfaceC4992i.b.a.c(this, cVar);
    }

    @Override // lc.InterfaceC4992i
    public /* bridge */ InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return InterfaceC4992i.b.a.d(this, interfaceC4992i);
    }
}
