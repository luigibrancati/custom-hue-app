package Fc;

import Cc.i;
import Fc.F;
import Fc.y;
import Lc.U;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends x implements Cc.o, Cc.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F.b f3983o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends y.d implements i.a, vc.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final r f3984h;

        public a(r property) {
            AbstractC4862t.e(property, "property");
            this.f3984h = property;
        }

        @Override // Cc.l.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public r i() {
            return this.f3984h;
        }

        public void F(Object obj, Object obj2, Object obj3) throws Dc.a {
            i().K(obj, obj2, obj3);
        }

        @Override // vc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Dc.a {
            F(obj, obj2, obj3);
            return C4015H.f34254a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n container, U descriptor) {
        super(container, descriptor);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        F.b bVarB = F.b(new s(this));
        AbstractC4862t.d(bVarB, "lazy { Setter(this) }");
        this.f3983o = bVarB;
    }

    @Override // Cc.i
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a h() {
        Object objInvoke = this.f3983o.invoke();
        AbstractC4862t.d(objInvoke, "_setter()");
        return (a) objInvoke;
    }

    public void K(Object obj, Object obj2, Object obj3) throws Dc.a {
        h().call(obj, obj2, obj3);
    }
}
