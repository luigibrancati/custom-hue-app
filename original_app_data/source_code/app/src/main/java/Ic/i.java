package Ic;

import Cd.F;
import Cd.T;
import Cd.a0;
import Ic.j;
import Lc.AbstractC1195x;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.J;
import Lc.f0;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4205s;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f5706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4028k f5707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f5709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f5710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f5711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f5712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f5713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f5714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f5715j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f5705l = {M.g(new E(M.b(i.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), M.g(new E(M.b(i.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), M.g(new E(M.b(i.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), M.g(new E(M.b(i.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), M.g(new E(M.b(i.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), M.g(new E(M.b(i.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), M.g(new E(M.b(i.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), M.g(new E(M.b(i.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f5704k = new b(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5716a;

        public a(int i10) {
            this.f5716a = i10;
        }

        public final InterfaceC1177e a(i types, Cc.l property) {
            AbstractC4862t.e(types, "types");
            AbstractC4862t.e(property, "property");
            return types.b(Kd.a.a(property.getName()), this.f5716a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Cd.E a(G module) {
            AbstractC4862t.e(module, "module");
            InterfaceC1177e interfaceC1177eA = AbstractC1195x.a(module, j.a.f5818s0);
            if (interfaceC1177eA == null) {
                return null;
            }
            a0 a0VarH = a0.f1311b.h();
            List parameters = interfaceC1177eA.k().getParameters();
            AbstractC4862t.d(parameters, "kPropertyClass.typeConstructor.parameters");
            Object objF0 = C4179C.F0(parameters);
            AbstractC4862t.d(objF0, "kPropertyClass.typeConstructor.parameters.single()");
            return F.g(a0VarH, interfaceC1177eA, C4205s.d(new T((f0) objF0)));
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f5717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G g10) {
            super(0);
            this.f5717a = g10;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6099h invoke() {
            return this.f5717a.z0(j.f5736r).o();
        }
    }

    public i(G module, J notFoundClasses) {
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        this.f5706a = notFoundClasses;
        this.f5707b = C4029l.a(EnumC4031n.PUBLICATION, new c(module));
        this.f5708c = new a(1);
        this.f5709d = new a(1);
        this.f5710e = new a(1);
        this.f5711f = new a(2);
        this.f5712g = new a(3);
        this.f5713h = new a(1);
        this.f5714i = new a(2);
        this.f5715j = new a(3);
    }

    public final InterfaceC1177e b(String str, int i10) {
        kd.f fVarS = kd.f.s(str);
        AbstractC4862t.d(fVarS, "identifier(className)");
        InterfaceC1180h interfaceC1180hE = d().e(fVarS, Tc.d.FROM_REFLECTION);
        InterfaceC1177e interfaceC1177e = interfaceC1180hE instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hE : null;
        return interfaceC1177e == null ? this.f5706a.d(new kd.b(j.f5736r, fVarS), C4205s.d(Integer.valueOf(i10))) : interfaceC1177e;
    }

    public final InterfaceC1177e c() {
        return this.f5708c.a(this, f5705l[0]);
    }

    public final InterfaceC6099h d() {
        return (InterfaceC6099h) this.f5707b.getValue();
    }
}
