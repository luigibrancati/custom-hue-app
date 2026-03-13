package K7;

import K7.AbstractC1081v;
import K7.AbstractC1083x;
import K7.AbstractC1084y;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: K7.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C1082w extends AbstractC1084y implements C {

    /* JADX INFO: renamed from: K7.w$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC1084y.c {
        public C1082w e() {
            return (C1082w) super.a();
        }

        public a f(Object obj, Object obj2) {
            super.d(obj, obj2);
            return this;
        }
    }

    public C1082w(AbstractC1083x abstractC1083x, int i10) {
        super(abstractC1083x, i10);
    }

    public static C1082w s(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return u();
        }
        AbstractC1083x.a aVar = new AbstractC1083x.a(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC1081v.a aVar2 = (AbstractC1081v.a) entry.getValue();
            AbstractC1081v abstractC1081vK = comparator == null ? aVar2.k() : aVar2.l(comparator);
            aVar.f(key, abstractC1081vK);
            size += abstractC1081vK.size();
        }
        return new C1082w(aVar.c(), size);
    }

    public static C1082w u() {
        return C1076p.f7708g;
    }

    @Override // K7.G
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC1081v get(Object obj) {
        AbstractC1081v abstractC1081v = (AbstractC1081v) this.f7732e.get(obj);
        return abstractC1081v == null ? AbstractC1081v.z() : abstractC1081v;
    }
}
