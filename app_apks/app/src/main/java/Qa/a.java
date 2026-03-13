package Qa;

import Oa.c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14234a;

    public a(List order) {
        AbstractC4862t.e(order, "order");
        this.f14234a = order;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c cVar, c cVar2) {
        Object next;
        if (cVar == null && cVar2 == null) {
            return 0;
        }
        if (cVar == null) {
            return -1;
        }
        if (cVar2 == null) {
            return 1;
        }
        Class<?> cls = cVar.getClass();
        Class<?> cls2 = cVar2.getClass();
        if (AbstractC4862t.a(cls, cls2)) {
            return 0;
        }
        Iterator it = this.f14234a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Class cls3 = (Class) next;
            if (AbstractC4862t.a(cls3, cls) || AbstractC4862t.a(cls3, cls2)) {
                break;
            }
        }
        return AbstractC4862t.a((Class) next, cls) ? -1 : 1;
    }
}
