package J3;

import Q3.C1877w;
import gc.C4179C;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC0917z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5944b = new LinkedHashMap();

    @Override // J3.InterfaceC0917z
    public C0916y a(C1877w id2) {
        AbstractC4862t.e(id2, "id");
        return (C0916y) this.f5944b.remove(id2);
    }

    @Override // J3.InterfaceC0917z
    public boolean c(C1877w id2) {
        AbstractC4862t.e(id2, "id");
        return this.f5944b.containsKey(id2);
    }

    @Override // J3.InterfaceC0917z
    public C0916y d(C1877w id2) {
        AbstractC4862t.e(id2, "id");
        Map map = this.f5944b;
        Object c0916y = map.get(id2);
        if (c0916y == null) {
            c0916y = new C0916y(id2);
            map.put(id2, c0916y);
        }
        return (C0916y) c0916y;
    }

    @Override // J3.InterfaceC0917z
    public List remove(String workSpecId) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        Map map = this.f5944b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (AbstractC4862t.a(((C1877w) entry.getKey()).b(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.f5944b.remove((C1877w) it.next());
        }
        return C4179C.V0(linkedHashMap.values());
    }
}
