package Vd;

import Rd.InterfaceC2166z0;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y {
    public static final void b(final v vVar, InterfaceC4992i interfaceC4992i) {
        if (((Number) interfaceC4992i.fold(0, new vc.p() { // from class: Vd.x
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(y.c(vVar, ((Integer) obj).intValue(), (InterfaceC4992i.b) obj2));
            }
        })).intValue() == vVar.f17588l) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.f17587k + ",\n\t\tbut emission happened in " + interfaceC4992i + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final int c(v vVar, int i10, InterfaceC4992i.b bVar) {
        InterfaceC4992i.c key = bVar.getKey();
        InterfaceC4992i.b bVar2 = vVar.f17587k.get(key);
        if (key != InterfaceC2166z0.f15218M) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) bVar2;
        AbstractC4862t.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC2166z0 interfaceC2166z0D = d((InterfaceC2166z0) bVar, interfaceC2166z0);
        if (interfaceC2166z0D == interfaceC2166z0) {
            return interfaceC2166z0 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC2166z0D + ", expected child of " + interfaceC2166z0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final InterfaceC2166z0 d(InterfaceC2166z0 interfaceC2166z0, InterfaceC2166z0 interfaceC2166z02) {
        while (interfaceC2166z0 != null) {
            if (interfaceC2166z0 == interfaceC2166z02 || !(interfaceC2166z0 instanceof Wd.A)) {
                return interfaceC2166z0;
            }
            interfaceC2166z0 = ((Wd.A) interfaceC2166z0).e0();
        }
        return null;
    }
}
