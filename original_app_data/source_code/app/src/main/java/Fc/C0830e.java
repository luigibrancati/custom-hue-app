package Fc;

import Lc.InterfaceC1196y;
import Lc.U;
import Oc.C1818l;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fc.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C0830e extends C1818l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3868a;

    public C0830e(n container) {
        AbstractC4862t.e(container, "container");
        this.f3868a = container;
    }

    @Override // Oc.C1818l, Lc.InterfaceC1187o
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC0835j j(InterfaceC1196y descriptor, C4015H data) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(data, "data");
        return new o(this.f3868a, descriptor);
    }

    @Override // Oc.C1818l, Lc.InterfaceC1187o
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC0835j c(U descriptor, C4015H data) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(data, "data");
        int i10 = (descriptor.J() != null ? 1 : 0) + (descriptor.M() != null ? 1 : 0);
        if (descriptor.L()) {
            if (i10 == 0) {
                return new p(this.f3868a, descriptor);
            }
            if (i10 == 1) {
                return new q(this.f3868a, descriptor);
            }
            if (i10 == 2) {
                return new r(this.f3868a, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new v(this.f3868a, descriptor);
            }
            if (i10 == 1) {
                return new w(this.f3868a, descriptor);
            }
            if (i10 == 2) {
                return new x(this.f3868a, descriptor);
            }
        }
        throw new D("Unsupported property: " + descriptor);
    }
}
