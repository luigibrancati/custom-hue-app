package Uc;

import Ic.j;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import gc.Q;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Uc.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2305g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2305g f16919a = new C2305g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f16920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f16921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f16922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f16923e;

    static {
        kd.d dVar = j.a.f5817s;
        C4034q c4034qA = AbstractC4040w.a(AbstractC2306h.d(dVar, "name"), kd.f.s("name"));
        C4034q c4034qA2 = AbstractC4040w.a(AbstractC2306h.d(dVar, "ordinal"), kd.f.s("ordinal"));
        C4034q c4034qA3 = AbstractC4040w.a(AbstractC2306h.c(j.a.f5775U, RRWebVideoEvent.JsonKeys.SIZE), kd.f.s(RRWebVideoEvent.JsonKeys.SIZE));
        kd.c cVar = j.a.f5779Y;
        Map mapL = Q.l(c4034qA, c4034qA2, c4034qA3, AbstractC4040w.a(AbstractC2306h.c(cVar, RRWebVideoEvent.JsonKeys.SIZE), kd.f.s(RRWebVideoEvent.JsonKeys.SIZE)), AbstractC4040w.a(AbstractC2306h.d(j.a.f5793g, SentryEnvelopeItemHeader.JsonKeys.LENGTH), kd.f.s(SentryEnvelopeItemHeader.JsonKeys.LENGTH)), AbstractC4040w.a(AbstractC2306h.c(cVar, "keys"), kd.f.s("keySet")), AbstractC4040w.a(AbstractC2306h.c(cVar, "values"), kd.f.s("values")), AbstractC4040w.a(AbstractC2306h.c(cVar, "entries"), kd.f.s("entrySet")));
        f16920b = mapL;
        Set<Map.Entry> setEntrySet = mapL.entrySet();
        ArrayList<C4034q> arrayList = new ArrayList(C4207u.v(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C4034q(((kd.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C4034q c4034q : arrayList) {
            kd.f fVar = (kd.f) c4034q.f();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((kd.f) c4034q.e());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C4179C.a0((Iterable) entry2.getValue()));
        }
        f16921c = linkedHashMap2;
        Set setKeySet = f16920b.keySet();
        f16922d = setKeySet;
        ArrayList arrayList3 = new ArrayList(C4207u.v(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((kd.c) it.next()).g());
        }
        f16923e = C4179C.Z0(arrayList3);
    }

    public final Map a() {
        return f16920b;
    }

    public final List b(kd.f name1) {
        AbstractC4862t.e(name1, "name1");
        List list = (List) f16921c.get(name1);
        return list == null ? C4206t.k() : list;
    }

    public final Set c() {
        return f16922d;
    }

    public final Set d() {
        return f16923e;
    }
}
