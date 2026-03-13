package od;

import Lc.D;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.K;
import Lc.e0;
import gc.C4179C;
import gc.C4206t;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vd.C6095d;
import vd.InterfaceC6099h;
import vd.InterfaceC6102k;

/* JADX INFO: renamed from: od.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5279a extends AbstractC5293o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5279a f41530a = new C5279a();

    /* JADX INFO: renamed from: od.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0553a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4757a.a(AbstractC5823c.l((InterfaceC1177e) obj).b(), AbstractC5823c.l((InterfaceC1177e) obj2).b());
        }
    }

    public static final void b(InterfaceC1177e interfaceC1177e, LinkedHashSet linkedHashSet, InterfaceC6099h interfaceC6099h, boolean z10) {
        for (InterfaceC1185m interfaceC1185m : InterfaceC6102k.a.a(interfaceC6099h, C6095d.f45991t, null, 2, null)) {
            if (interfaceC1185m instanceof InterfaceC1177e) {
                InterfaceC1177e interfaceC1177eS = (InterfaceC1177e) interfaceC1185m;
                if (interfaceC1177eS.k0()) {
                    kd.f name = interfaceC1177eS.getName();
                    AbstractC4862t.d(name, "descriptor.name");
                    InterfaceC1180h interfaceC1180hE = interfaceC6099h.e(name, Tc.d.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC1177eS = interfaceC1180hE instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hE : interfaceC1180hE instanceof e0 ? ((e0) interfaceC1180hE).s() : null;
                }
                if (interfaceC1177eS != null) {
                    if (AbstractC5283e.z(interfaceC1177eS, interfaceC1177e)) {
                        linkedHashSet.add(interfaceC1177eS);
                    }
                    if (z10) {
                        InterfaceC6099h interfaceC6099hR = interfaceC1177eS.R();
                        AbstractC4862t.d(interfaceC6099hR, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        b(interfaceC1177e, linkedHashSet, interfaceC6099hR, z10);
                    }
                }
            }
        }
    }

    public Collection a(InterfaceC1177e sealedClass, boolean z10) {
        Object next;
        InterfaceC1185m interfaceC1185mB;
        AbstractC4862t.e(sealedClass, "sealedClass");
        if (sealedClass.r() != D.SEALED) {
            return C4206t.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator it = AbstractC5823c.q(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC1185m) next) instanceof K) {
                    break;
                }
            }
            interfaceC1185mB = (InterfaceC1185m) next;
        } else {
            interfaceC1185mB = sealedClass.b();
        }
        if (interfaceC1185mB instanceof K) {
            b(sealedClass, linkedHashSet, ((K) interfaceC1185mB).o(), z10);
        }
        InterfaceC6099h interfaceC6099hR = sealedClass.R();
        AbstractC4862t.d(interfaceC6099hR, "sealedClass.unsubstitutedInnerClassesScope");
        b(sealedClass, linkedHashSet, interfaceC6099hR, true);
        return C4179C.J0(linkedHashSet, new C0553a());
    }
}
