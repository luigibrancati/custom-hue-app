package G4;

import J4.l;
import fc.C4015H;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f4489b;

    public b(l storage) {
        AbstractC4862t.e(storage, "storage");
        this.f4489b = storage;
    }

    @Override // G4.c
    public Object a(InterfaceC4988e interfaceC4988e) {
        this.f4489b.e();
        return C4015H.f34254a;
    }

    @Override // G4.c
    public Object b(InterfaceC4988e interfaceC4988e) {
        List listA = this.f4489b.a();
        AbstractC4862t.c(listA, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<com.amplitude.core.events.BaseEvent>>");
        if (listA.isEmpty() || ((List) listA.get(0)).isEmpty()) {
            return null;
        }
        List list = (List) listA.get(0);
        E4.a aVar = (E4.a) list.get(0);
        e eVar = e.f4517a;
        Map mapI0 = aVar.I0();
        AbstractC4862t.b(mapI0);
        E4.e eVar2 = E4.e.SET;
        Object obj = mapI0.get(eVar2.b());
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
        Map mapA = eVar.a(T.c(obj));
        mapA.putAll(eVar.b(list.subList(1, list.size())));
        Map mapI02 = aVar.I0();
        AbstractC4862t.b(mapI02);
        mapI02.put(eVar2.b(), mapA);
        return aVar;
    }
}
