package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3345x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29721a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f29722b = new K();

    public C3345x() {
        a(new C3329v());
        a(new C3353y());
        a(new C3361z());
        a(new D());
        a(new I());
        a(new J());
        a(new L());
    }

    public final void a(AbstractC3337w abstractC3337w) {
        Iterator it = abstractC3337w.f29713a.iterator();
        while (it.hasNext()) {
            this.f29721a.put(((M) it.next()).b().toString(), abstractC3337w);
        }
    }

    public final InterfaceC3277p b(T1 t12, InterfaceC3277p interfaceC3277p) {
        AbstractC3324u2.l(t12);
        if (!(interfaceC3277p instanceof C3286q)) {
            return interfaceC3277p;
        }
        C3286q c3286q = (C3286q) interfaceC3277p;
        ArrayList arrayListF = c3286q.f();
        String strA = c3286q.a();
        Map map = this.f29721a;
        return (map.containsKey(strA) ? (AbstractC3337w) map.get(strA) : this.f29722b).a(strA, t12, arrayListF);
    }
}
