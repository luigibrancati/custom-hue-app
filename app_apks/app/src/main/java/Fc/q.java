package Fc;

import Cc.j;
import Fc.F;
import Fc.y;
import Lc.U;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends w implements Cc.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F.b f3980o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends y.d implements j.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final q f3981h;

        public a(q property) {
            AbstractC4862t.e(property, "property");
            this.f3981h = property;
        }

        @Override // Cc.l.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public q i() {
            return this.f3981h;
        }

        public void F(Object obj, Object obj2) throws Dc.a {
            i().K(obj, obj2);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Dc.a {
            F(obj, obj2);
            return C4015H.f34254a;
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
            return new a(q.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Setter(this) }");
        this.f3980o = bVarB;
    }

    @Override // Cc.j, Cc.i
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a h() {
        Object objInvoke = this.f3980o.invoke();
        AbstractC4862t.d(objInvoke, "_setter()");
        return (a) objInvoke;
    }

    public void K(Object obj, Object obj2) throws Dc.a {
        h().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n container, U descriptor) {
        super(container, descriptor);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Setter(this) }");
        this.f3980o = bVarB;
    }
}
