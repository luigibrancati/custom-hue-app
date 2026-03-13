package od;

import Lc.InterfaceC1174b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: od.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5287i extends AbstractC5288j {
    @Override // od.AbstractC5288j
    public void b(InterfaceC1174b first, InterfaceC1174b second) {
        AbstractC4862t.e(first, "first");
        AbstractC4862t.e(second, "second");
        e(first, second);
    }

    @Override // od.AbstractC5288j
    public void c(InterfaceC1174b fromSuper, InterfaceC1174b fromCurrent) {
        AbstractC4862t.e(fromSuper, "fromSuper");
        AbstractC4862t.e(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    public abstract void e(InterfaceC1174b interfaceC1174b, InterfaceC1174b interfaceC1174b2);
}
