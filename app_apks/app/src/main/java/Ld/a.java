package Ld;

import Md.e;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final Collection a(Collection collection, Collection collection2) {
        AbstractC4862t.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final e b(Iterable scopes) {
        AbstractC4862t.e(scopes, "scopes");
        e eVar = new e();
        for (Object obj : scopes) {
            InterfaceC6099h interfaceC6099h = (InterfaceC6099h) obj;
            if (interfaceC6099h != null && interfaceC6099h != InterfaceC6099h.b.f46015b) {
                eVar.add(obj);
            }
        }
        return eVar;
    }
}
