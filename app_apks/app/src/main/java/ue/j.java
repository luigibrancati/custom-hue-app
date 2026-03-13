package ue;

import fc.C4034q;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final List a(List addresses) {
        AbstractC4862t.e(addresses, "addresses");
        if (addresses.size() < 2) {
            return addresses;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : addresses) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C4034q c4034q = new C4034q(arrayList, arrayList2);
        List list = (List) c4034q.a();
        List list2 = (List) c4034q.b();
        return (list.isEmpty() || list2.isEmpty()) ? addresses : qe.m.x(list, list2);
    }
}
