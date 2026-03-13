package yd;

import Lc.G;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends Oc.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bd.n f48602g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kd.c fqName, Bd.n storageManager, G module) {
        super(module, fqName);
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(module, "module");
        this.f48602g = storageManager;
    }

    public abstract InterfaceC6475h G0();

    public boolean K0(kd.f name) {
        AbstractC4862t.e(name, "name");
        InterfaceC6099h interfaceC6099hO = o();
        return (interfaceC6099hO instanceof Ad.h) && ((Ad.h) interfaceC6099hO).q().contains(name);
    }

    public abstract void L0(C6478k c6478k);
}
