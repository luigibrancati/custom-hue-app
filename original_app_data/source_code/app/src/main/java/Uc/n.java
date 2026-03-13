package Uc;

import Lc.InterfaceC1173a;
import Lc.InterfaceC1177e;
import Lc.U;
import kotlin.jvm.internal.AbstractC4862t;
import od.InterfaceC5284f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements InterfaceC5284f {
    @Override // od.InterfaceC5284f
    public InterfaceC5284f.b a(InterfaceC1173a superDescriptor, InterfaceC1173a subDescriptor, InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(superDescriptor, "superDescriptor");
        AbstractC4862t.e(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof U) || !(superDescriptor instanceof U)) {
            return InterfaceC5284f.b.UNKNOWN;
        }
        U u10 = (U) subDescriptor;
        U u11 = (U) superDescriptor;
        return !AbstractC4862t.a(u10.getName(), u11.getName()) ? InterfaceC5284f.b.UNKNOWN : (Yc.c.a(u10) && Yc.c.a(u11)) ? InterfaceC5284f.b.OVERRIDABLE : (Yc.c.a(u10) || Yc.c.a(u11)) ? InterfaceC5284f.b.INCOMPATIBLE : InterfaceC5284f.b.UNKNOWN;
    }

    @Override // od.InterfaceC5284f
    public InterfaceC5284f.a b() {
        return InterfaceC5284f.a.BOTH;
    }
}
