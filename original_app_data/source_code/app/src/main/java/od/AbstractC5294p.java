package od;

import Lc.AbstractC1191t;
import Lc.InterfaceC1174b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: od.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5294p {
    public static final InterfaceC1174b a(Collection descriptors) {
        Integer numD;
        AbstractC4862t.e(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        InterfaceC1174b interfaceC1174b = null;
        while (it.hasNext()) {
            InterfaceC1174b interfaceC1174b2 = (InterfaceC1174b) it.next();
            if (interfaceC1174b == null || ((numD = AbstractC1191t.d(interfaceC1174b.getVisibility(), interfaceC1174b2.getVisibility())) != null && numD.intValue() < 0)) {
                interfaceC1174b = interfaceC1174b2;
            }
        }
        AbstractC4862t.b(interfaceC1174b);
        return interfaceC1174b;
    }
}
