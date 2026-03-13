package vd;

import gc.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vd.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6101j {
    public static final Set a(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setG = ((InterfaceC6099h) it.next()).g();
            if (setG == null) {
                return null;
            }
            y.C(hashSet, setG);
        }
        return hashSet;
    }
}
