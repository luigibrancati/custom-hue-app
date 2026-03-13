package Cd;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gd.p f1318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0724g f1319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0725h f1320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayDeque f1323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set f1324j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {

        /* JADX INFO: renamed from: Cd.d0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0030a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f1325a;

            @Override // Cd.d0.a
            public void a(InterfaceC6082a block) {
                AbstractC4862t.e(block, "block");
                if (this.f1325a) {
                    return;
                }
                this.f1325a = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean b() {
                return this.f1325a;
            }
        }

        void a(InterfaceC6082a interfaceC6082a);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f1326a = new b();

            public b() {
                super(null);
            }

            @Override // Cd.d0.c
            public Gd.k a(d0 state, Gd.i type) {
                AbstractC4862t.e(state, "state");
                AbstractC4862t.e(type, "type");
                return state.j().o(type);
            }
        }

        /* JADX INFO: renamed from: Cd.d0$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0031c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0031c f1327a = new C0031c();

            public C0031c() {
                super(null);
            }

            @Override // Cd.d0.c
            public /* bridge */ /* synthetic */ Gd.k a(d0 d0Var, Gd.i iVar) {
                return (Gd.k) b(d0Var, iVar);
            }

            public Void b(d0 state, Gd.i type) {
                AbstractC4862t.e(state, "state");
                AbstractC4862t.e(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f1328a = new d();

            public d() {
                super(null);
            }

            @Override // Cd.d0.c
            public Gd.k a(d0 state, Gd.i type) {
                AbstractC4862t.e(state, "state");
                AbstractC4862t.e(type, "type");
                return state.j().z(type);
            }
        }

        public /* synthetic */ c(AbstractC4854k abstractC4854k) {
            this();
        }

        public abstract Gd.k a(d0 d0Var, Gd.i iVar);

        public c() {
        }
    }

    public d0(boolean z10, boolean z11, boolean z12, Gd.p typeSystemContext, AbstractC0724g kotlinTypePreparator, AbstractC0725h kotlinTypeRefiner) {
        AbstractC4862t.e(typeSystemContext, "typeSystemContext");
        AbstractC4862t.e(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f1315a = z10;
        this.f1316b = z11;
        this.f1317c = z12;
        this.f1318d = typeSystemContext;
        this.f1319e = kotlinTypePreparator;
        this.f1320f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(d0 d0Var, Gd.i iVar, Gd.i iVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return d0Var.c(iVar, iVar2, z10);
    }

    public Boolean c(Gd.i subType, Gd.i superType, boolean z10) {
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f1323i;
        AbstractC4862t.b(arrayDeque);
        arrayDeque.clear();
        Set set = this.f1324j;
        AbstractC4862t.b(set);
        set.clear();
        this.f1322h = false;
    }

    public boolean f(Gd.i subType, Gd.i superType) {
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superType, "superType");
        return true;
    }

    public b g(Gd.k subType, Gd.d superType) {
        AbstractC4862t.e(subType, "subType");
        AbstractC4862t.e(superType, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque h() {
        return this.f1323i;
    }

    public final Set i() {
        return this.f1324j;
    }

    public final Gd.p j() {
        return this.f1318d;
    }

    public final void k() {
        this.f1322h = true;
        if (this.f1323i == null) {
            this.f1323i = new ArrayDeque(4);
        }
        if (this.f1324j == null) {
            this.f1324j = Md.f.f9471c.a();
        }
    }

    public final boolean l(Gd.i type) {
        AbstractC4862t.e(type, "type");
        return this.f1317c && this.f1318d.A(type);
    }

    public final boolean m() {
        return this.f1315a;
    }

    public final boolean n() {
        return this.f1316b;
    }

    public final Gd.i o(Gd.i type) {
        AbstractC4862t.e(type, "type");
        return this.f1319e.a(type);
    }

    public final Gd.i p(Gd.i type) {
        AbstractC4862t.e(type, "type");
        return this.f1320f.a(type);
    }

    public boolean q(vc.l block) {
        AbstractC4862t.e(block, "block");
        a.C0030a c0030a = new a.C0030a();
        block.invoke(c0030a);
        return c0030a.b();
    }
}
