package Fc;

import Cc.i;
import Fc.F;
import Fc.y;
import Lc.U;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends v implements Cc.m, Cc.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F.b f3977o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends y.d implements i.a, vc.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final p f3978h;

        public a(p property) {
            AbstractC4862t.e(property, "property");
            this.f3978h = property;
        }

        @Override // Cc.l.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public p i() {
            return this.f3978h;
        }

        public void F(Object obj) throws Dc.a {
            i().K(obj);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Dc.a {
            F(obj);
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
            return new a(p.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n container, U descriptor) {
        super(container, descriptor);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Setter(this) }");
        this.f3977o = bVarB;
    }

    @Override // Cc.i
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a h() {
        Object objInvoke = this.f3977o.invoke();
        AbstractC4862t.d(objInvoke, "_setter()");
        return (a) objInvoke;
    }

    public void K(Object obj) throws Dc.a {
        h().call(obj);
    }
}
