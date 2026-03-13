package Cd;

import Lc.InterfaceC1180h;
import fc.C4015H;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Cd.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0723f extends AbstractC0729l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bd.i f1341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1342c;

    /* JADX INFO: renamed from: Cd.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Dd.g f1343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC4028k f1344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC0723f f1345c;

        /* JADX INFO: renamed from: Cd.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0032a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC0723f f1347b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0032a(AbstractC0723f abstractC0723f) {
                super(0);
                this.f1347b = abstractC0723f;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return Dd.h.b(a.this.f1343a, this.f1347b.o());
            }
        }

        public a(AbstractC0723f abstractC0723f, Dd.g kotlinTypeRefiner) {
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f1345c = abstractC0723f;
            this.f1343a = kotlinTypeRefiner;
            this.f1344b = C4029l.a(EnumC4031n.PUBLICATION, new C0032a(abstractC0723f));
        }

        public final List b() {
            return (List) this.f1344b.getValue();
        }

        @Override // Cd.e0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List o() {
            return b();
        }

        public boolean equals(Object obj) {
            return this.f1345c.equals(obj);
        }

        @Override // Cd.e0
        public List getParameters() {
            List parameters = this.f1345c.getParameters();
            AbstractC4862t.d(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f1345c.hashCode();
        }

        @Override // Cd.e0
        public Ic.g n() {
            Ic.g gVarN = this.f1345c.n();
            AbstractC4862t.d(gVarN, "this@AbstractTypeConstructor.builtIns");
            return gVarN;
        }

        @Override // Cd.e0
        public e0 p(Dd.g kotlinTypeRefiner) {
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f1345c.p(kotlinTypeRefiner);
        }

        @Override // Cd.e0
        public InterfaceC1180h q() {
            return this.f1345c.q();
        }

        @Override // Cd.e0
        public boolean r() {
            return this.f1345c.r();
        }

        public String toString() {
            return this.f1345c.toString();
        }
    }

    /* JADX INFO: renamed from: Cd.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection f1348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f1349b;

        public b(Collection allSupertypes) {
            AbstractC4862t.e(allSupertypes, "allSupertypes");
            this.f1348a = allSupertypes;
            this.f1349b = C4205s.d(Ed.k.f3414a.l());
        }

        public final Collection a() {
            return this.f1348a;
        }

        public final List b() {
            return this.f1349b;
        }

        public final void c(List list) {
            AbstractC4862t.e(list, "<set-?>");
            this.f1349b = list;
        }
    }

    /* JADX INFO: renamed from: Cd.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(AbstractC0723f.this.f());
        }
    }

    /* JADX INFO: renamed from: Cd.f$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f1351a = new d();

        public d() {
            super(1);
        }

        public final b a(boolean z10) {
            return new b(C4205s.d(Ed.k.f3414a.l()));
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: Cd.f$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: Cd.f$e$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC0723f f1353a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC0723f abstractC0723f) {
                super(1);
                this.f1353a = abstractC0723f;
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable invoke(e0 it) {
                AbstractC4862t.e(it, "it");
                return this.f1353a.e(it, true);
            }
        }

        /* JADX INFO: renamed from: Cd.f$e$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends kotlin.jvm.internal.v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC0723f f1354a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC0723f abstractC0723f) {
                super(1);
                this.f1354a = abstractC0723f;
            }

            public final void a(E it) {
                AbstractC4862t.e(it, "it");
                this.f1354a.m(it);
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((E) obj);
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: renamed from: Cd.f$e$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends kotlin.jvm.internal.v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC0723f f1355a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC0723f abstractC0723f) {
                super(1);
                this.f1355a = abstractC0723f;
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable invoke(e0 it) {
                AbstractC4862t.e(it, "it");
                return this.f1355a.e(it, false);
            }
        }

        /* JADX INFO: renamed from: Cd.f$e$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends kotlin.jvm.internal.v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC0723f f1356a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AbstractC0723f abstractC0723f) {
                super(1);
                this.f1356a = abstractC0723f;
            }

            public final void a(E it) {
                AbstractC4862t.e(it, "it");
                this.f1356a.s(it);
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((E) obj);
                return C4015H.f34254a;
            }
        }

        public e() {
            super(1);
        }

        public final void a(b supertypes) {
            AbstractC4862t.e(supertypes, "supertypes");
            Collection collectionA = AbstractC0723f.this.j().a(AbstractC0723f.this, supertypes.a(), new c(AbstractC0723f.this), new d(AbstractC0723f.this));
            if (collectionA.isEmpty()) {
                E eG = AbstractC0723f.this.g();
                collectionA = eG != null ? C4205s.d(eG) : null;
                if (collectionA == null) {
                    collectionA = C4206t.k();
                }
            }
            if (AbstractC0723f.this.i()) {
                Lc.d0 d0VarJ = AbstractC0723f.this.j();
                AbstractC0723f abstractC0723f = AbstractC0723f.this;
                d0VarJ.a(abstractC0723f, collectionA, new a(abstractC0723f), new b(AbstractC0723f.this));
            }
            AbstractC0723f abstractC0723f2 = AbstractC0723f.this;
            List listV0 = collectionA instanceof List ? (List) collectionA : null;
            if (listV0 == null) {
                listV0 = C4179C.V0(collectionA);
            }
            supertypes.c(abstractC0723f2.l(listV0));
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b) obj);
            return C4015H.f34254a;
        }
    }

    public AbstractC0723f(Bd.n storageManager) {
        AbstractC4862t.e(storageManager, "storageManager");
        this.f1341b = storageManager.i(new c(), d.f1351a, new e());
    }

    public final Collection e(e0 e0Var, boolean z10) {
        List listC0;
        AbstractC0723f abstractC0723f = e0Var instanceof AbstractC0723f ? (AbstractC0723f) e0Var : null;
        if (abstractC0723f != null && (listC0 = C4179C.C0(((b) abstractC0723f.f1341b.invoke()).a(), abstractC0723f.h(z10))) != null) {
            return listC0;
        }
        Collection supertypes = e0Var.o();
        AbstractC4862t.d(supertypes, "supertypes");
        return supertypes;
    }

    public abstract Collection f();

    public abstract E g();

    public Collection h(boolean z10) {
        return C4206t.k();
    }

    public boolean i() {
        return this.f1342c;
    }

    public abstract Lc.d0 j();

    @Override // Cd.e0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public List o() {
        return ((b) this.f1341b.invoke()).b();
    }

    public List l(List supertypes) {
        AbstractC4862t.e(supertypes, "supertypes");
        return supertypes;
    }

    public void m(E type) {
        AbstractC4862t.e(type, "type");
    }

    @Override // Cd.e0
    public e0 p(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    public void s(E type) {
        AbstractC4862t.e(type, "type");
    }
}
