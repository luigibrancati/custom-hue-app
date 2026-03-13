package com.braze.requests.framework.queue;

import com.braze.models.outgoing.k;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.support.BrazeLogger;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.braze.requests.framework.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f28294k = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.braze.dispatch.h dispatchDataProvider) {
        super(n.f28316f, dispatchDataProvider);
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
    }

    public final void a(final long j10, final com.braze.requests.framework.h hVar, List list) {
        com.braze.models.b bVar;
        com.braze.models.b bVar2;
        o oVar = hVar != null ? hVar.f28280a : null;
        com.braze.requests.g gVar = oVar instanceof com.braze.requests.g ? (com.braze.requests.g) oVar : null;
        if (gVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.braze.requests.framework.h hVar2 = (com.braze.requests.framework.h) it.next();
            o oVar2 = hVar2.f28280a;
            final com.braze.requests.g gVar2 = oVar2 instanceof com.braze.requests.g ? (com.braze.requests.g) oVar2 : null;
            if (gVar2 != null && ((gVar.f28300m == null || gVar2.f28300m == null) && (((bVar = gVar.f28301n) == null || bVar.f28035b) && ((bVar2 = gVar2.f28301n) == null || bVar2.f28035b)))) {
                k kVar = gVar2.f28298k;
                Boolean bool = (gVar.f28298k.c() || kVar.c()) ? Boolean.TRUE : null;
                com.braze.models.outgoing.i outboundConfigParams = gVar.f28298k.f28104c;
                if (outboundConfigParams != null) {
                    AbstractC4862t.e(outboundConfigParams, "outboundConfigParams");
                } else {
                    outboundConfigParams = null;
                }
                com.braze.models.outgoing.i outboundConfigParams2 = kVar.f28104c;
                if (outboundConfigParams2 != null) {
                    AbstractC4862t.e(outboundConfigParams2, "outboundConfigParams");
                    outboundConfigParams = outboundConfigParams2;
                }
                String str = gVar.f28298k.f28102a;
                if (str == null) {
                    str = null;
                }
                String str2 = kVar.f28102a;
                if (str2 != null) {
                    str = str2;
                }
                gVar.f28298k = new k(str, bool, outboundConfigParams);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28294k, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: p5.b
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.requests.framework.queue.c.a(hVar2, j10, hVar);
                    }
                }, 14, (Object) null);
                hVar2.a(j10, com.braze.requests.framework.i.f28291d);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: p5.a
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.requests.framework.queue.c.a(gVar2, hVar);
                    }
                }, 7, (Object) null);
            }
        }
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j10) {
        ArrayList arrayList = this.f28253e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((com.braze.requests.framework.h) obj).f28283d.a()) {
                arrayList2.add(obj);
            }
        }
        List listJ0 = C4179C.J0(arrayList2, new b());
        int size = listJ0.size();
        if (size < 2) {
            return;
        }
        a(j10, (com.braze.requests.framework.h) C4179C.h0(listJ0), listJ0.subList(1, size));
    }

    public static final String a(com.braze.requests.framework.h hVar, long j10, com.braze.requests.framework.h hVar2) {
        return "Batched request " + hVar.a(j10) + " and combined into " + hVar2.a(j10);
    }

    public static final String a(com.braze.requests.g gVar, com.braze.requests.framework.h hVar) {
        return "Could not merge other request: " + gVar + " into parent: " + hVar;
    }
}
