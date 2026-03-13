package Ud;

import Rd.InterfaceC2166z0;
import Vd.q;
import kotlin.jvm.internal.AbstractC4862t;
import lc.C4993j;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {
    public static final InterfaceC2313e a(InterfaceC2313e interfaceC2313e, int i10, Td.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != Td.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = Td.a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        Td.a aVar2 = aVar;
        return interfaceC2313e instanceof Vd.q ? q.a.a((Vd.q) interfaceC2313e, null, i11, aVar2, 1, null) : new Vd.h(interfaceC2313e, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC2313e b(InterfaceC2313e interfaceC2313e, int i10, Td.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = Td.a.SUSPEND;
        }
        return AbstractC2315g.c(interfaceC2313e, i10, aVar);
    }

    public static final void c(InterfaceC4992i interfaceC4992i) {
        if (interfaceC4992i.get(InterfaceC2166z0.f15218M) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC4992i).toString());
    }

    public static final InterfaceC2313e d(InterfaceC2313e interfaceC2313e) {
        return b(interfaceC2313e, -1, null, 2, null);
    }

    public static final InterfaceC2313e e(InterfaceC2313e interfaceC2313e, InterfaceC4992i interfaceC4992i) {
        c(interfaceC4992i);
        return AbstractC4862t.a(interfaceC4992i, C4993j.f40088a) ? interfaceC2313e : interfaceC2313e instanceof Vd.q ? q.a.a((Vd.q) interfaceC2313e, interfaceC4992i, 0, null, 6, null) : new Vd.h(interfaceC2313e, interfaceC4992i, 0, null, 12, null);
    }
}
