package Fc;

import Fc.F;
import Fc.n;
import Lc.U;
import com.fasterxml.jackson.core.JsonPointer;
import ed.C3979a;
import fc.C4034q;
import fc.C4039v;
import gc.C4206t;
import id.AbstractC4376a;
import java.util.Collection;
import jd.C4764e;
import jd.C4765f;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import md.i;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f3986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F.b f3987e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends n.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ Cc.l[] f3988j = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(a.class), ExternalParsersConfigReaderMetKeys.METADATA_TAG, "getMetadata()Lkotlin/Triple;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final F.a f3989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F.a f3990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final F.b f3991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final F.b f3992g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final F.a f3993h;

        /* JADX INFO: renamed from: Fc.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0063a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t f3995a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0063a(t tVar) {
                super(0);
                this.f3995a = tVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Qc.f invoke() {
                return Qc.f.f14265c.a(this.f3995a.d());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t f3996a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f3997b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, a aVar) {
                super(0);
                this.f3996a = tVar;
                this.f3997b = aVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                return this.f3996a.B(this.f3997b.f(), n.c.DECLARED);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
            public c() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4039v invoke() {
                C3979a c3979aE;
                Qc.f fVarC = a.this.c();
                if (fVarC != null && (c3979aE = fVarC.e()) != null) {
                    String[] strArrA = c3979aE.a();
                    String[] strArrG = c3979aE.g();
                    if (strArrA != null && strArrG != null) {
                        C4034q c4034qM = C4768i.m(strArrA, strArrG);
                        return new C4039v((C4765f) c4034qM.a(), (fd.l) c4034qM.b(), c3979aE.d());
                    }
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f4000b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(t tVar) {
                super(0);
                this.f4000b = tVar;
            }

            @Override // vc.InterfaceC6082a
            public final Class invoke() {
                C3979a c3979aE;
                Qc.f fVarC = a.this.c();
                String strE = (fVarC == null || (c3979aE = fVarC.e()) == null) ? null : c3979aE.e();
                if (strE == null || strE.length() <= 0) {
                    return null;
                }
                return this.f4000b.d().getClassLoader().loadClass(Od.C.K(strE, JsonPointer.SEPARATOR, '.', false, 4, null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends kotlin.jvm.internal.v implements InterfaceC6082a {
            public e() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC6099h invoke() {
                Qc.f fVarC = a.this.c();
                return fVarC != null ? a.this.a().c().a(fVarC) : InterfaceC6099h.b.f46015b;
            }
        }

        public a() {
            super();
            this.f3989d = F.d(new C0063a(t.this));
            this.f3990e = F.d(new e());
            this.f3991f = F.b(new d(t.this));
            this.f3992g = F.b(new c());
            this.f3993h = F.d(new b(t.this, this));
        }

        public final Qc.f c() {
            return (Qc.f) this.f3989d.b(this, f3988j[0]);
        }

        public final C4039v d() {
            return (C4039v) this.f3992g.b(this, f3988j[3]);
        }

        public final Class e() {
            return (Class) this.f3991f.b(this, f3988j[2]);
        }

        public final InterfaceC6099h f() {
            Object objB = this.f3990e.b(this, f3988j[1]);
            AbstractC4862t.d(objB, "<get-scope>(...)");
            return (InterfaceC6099h) objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return t.this.new a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c extends AbstractC4859p implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4003a = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return kotlin.jvm.internal.M.b(yd.w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // vc.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final U invoke(yd.w p02, fd.n p12) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            return p02.l(p12);
        }
    }

    public t(Class jClass) {
        AbstractC4862t.e(jClass, "jClass");
        this.f3986d = jClass;
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Data() }");
        this.f3987e = bVarB;
    }

    @Override // Fc.n
    public U A(int i10) {
        C4039v c4039vD = ((a) this.f3987e.invoke()).d();
        if (c4039vD != null) {
            C4765f c4765f = (C4765f) c4039vD.a();
            fd.l lVar = (fd.l) c4039vD.b();
            C4764e c4764e = (C4764e) c4039vD.c();
            i.f packageLocalVariable = AbstractC4376a.f37391n;
            AbstractC4862t.d(packageLocalVariable, "packageLocalVariable");
            fd.n nVar = (fd.n) hd.e.b(lVar, packageLocalVariable, i10);
            if (nVar != null) {
                Class clsD = d();
                fd.t tVarQ = lVar.Q();
                AbstractC4862t.d(tVarQ, "packageProto.typeTable");
                return (U) L.h(clsD, nVar, c4765f, new hd.g(tVarQ), c4764e, c.f4003a);
            }
        }
        return null;
    }

    @Override // Fc.n
    public Class C() {
        Class clsE = ((a) this.f3987e.invoke()).e();
        return clsE == null ? d() : clsE;
    }

    @Override // Fc.n
    public Collection D(kd.f name) {
        AbstractC4862t.e(name, "name");
        return K().c(name, Tc.d.FROM_REFLECTION);
    }

    public final InterfaceC6099h K() {
        return ((a) this.f3987e.invoke()).f();
    }

    @Override // kotlin.jvm.internal.InterfaceC4851h
    public Class d() {
        return this.f3986d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && AbstractC4862t.a(d(), ((t) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return "file class " + Rc.d.a(d()).b();
    }

    @Override // Fc.n
    public Collection y() {
        return C4206t.k();
    }

    @Override // Fc.n
    public Collection z(kd.f name) {
        AbstractC4862t.e(name, "name");
        return K().a(name, Tc.d.FROM_REFLECTION);
    }
}
