package Fc;

import kotlin.jvm.internal.AbstractC4849f;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.InterfaceC4858o;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class G extends N {
    public static n j(AbstractC4849f abstractC4849f) {
        Cc.g owner = abstractC4849f.getOwner();
        return owner instanceof n ? (n) owner : C0831f.f3869d;
    }

    @Override // kotlin.jvm.internal.N
    public Cc.h a(AbstractC4859p abstractC4859p) {
        return new o(j(abstractC4859p), abstractC4859p.getName(), abstractC4859p.getSignature(), abstractC4859p.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.N
    public Cc.d b(Class cls) {
        return AbstractC0828c.a(cls);
    }

    @Override // kotlin.jvm.internal.N
    public Cc.g c(Class cls, String str) {
        return AbstractC0828c.b(cls);
    }

    @Override // kotlin.jvm.internal.N
    public Cc.j d(kotlin.jvm.internal.x xVar) {
        return new q(j(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.N
    public Cc.m e(kotlin.jvm.internal.B b10) {
        return new v(j(b10), b10.getName(), b10.getSignature(), b10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.N
    public Cc.n f(kotlin.jvm.internal.D d10) {
        return new w(j(d10), d10.getName(), d10.getSignature(), d10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.N
    public Cc.o g(kotlin.jvm.internal.F f10) {
        return new x(j(f10), f10.getName(), f10.getSignature());
    }

    @Override // kotlin.jvm.internal.N
    public String h(InterfaceC4858o interfaceC4858o) {
        o oVarC;
        Cc.h hVarA = Ec.d.a(interfaceC4858o);
        return (hVarA == null || (oVarC = L.c(hVarA)) == null) ? super.h(interfaceC4858o) : H.f3843a.e(oVarC.y());
    }

    @Override // kotlin.jvm.internal.N
    public String i(kotlin.jvm.internal.v vVar) {
        return h(vVar);
    }
}
