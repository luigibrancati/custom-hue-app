package Oc;

import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.a0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z extends AbstractC1817k implements Lc.K {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kd.c f12386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Lc.G module, kd.c fqName) {
        super(module, Mc.g.f9435K.b(), fqName.h(), a0.f8746a);
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(fqName, "fqName");
        this.f12386e = fqName;
        this.f12387f = "package " + fqName + " of " + module;
    }

    @Override // Lc.K
    public final kd.c e() {
        return this.f12386e;
    }

    @Override // Oc.AbstractC1817k, Lc.InterfaceC1188p
    public a0 j() {
        a0 NO_SOURCE = a0.f8746a;
        AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o visitor, Object obj) {
        AbstractC4862t.e(visitor, "visitor");
        return visitor.m(this, obj);
    }

    @Override // Oc.AbstractC1816j
    public String toString() {
        return this.f12387f;
    }

    @Override // Oc.AbstractC1817k, Lc.InterfaceC1185m
    public Lc.G b() {
        InterfaceC1185m interfaceC1185mB = super.b();
        AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (Lc.G) interfaceC1185mB;
    }
}
