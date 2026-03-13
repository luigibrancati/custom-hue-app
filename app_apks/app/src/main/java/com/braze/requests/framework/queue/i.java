package com.braze.requests.framework.queue;

import com.braze.requests.framework.queue.i;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.requests.y;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.braze.requests.framework.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.requests.util.b f28297k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.braze.dispatch.h dispatchDataProvider) {
        super(n.f28317g, dispatchDataProvider);
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
        int iK = dispatchDataProvider.f27612a.f27926o.k();
        this.f28297k = new com.braze.requests.util.b((int) TimeUnit.MINUTES.toMillis(1L), com.braze.requests.util.b.f28340g, iK, dispatchDataProvider.f27612a.f27926o.l());
    }

    public static final String b(com.braze.requests.framework.h hVar, long j10) {
        return "Template request will not be retried. Marking as complete. " + hVar.a(j10);
    }

    public static final String c(com.braze.requests.framework.h hVar, long j10) {
        return "Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. " + hVar.a(j10);
    }

    @Override // com.braze.requests.framework.b
    public final com.braze.requests.util.b a() {
        return this.f28297k;
    }

    @Override // com.braze.requests.framework.b
    public final void a(final long j10) {
        ArrayList arrayList = this.f28253e;
        ArrayList<com.braze.requests.framework.h> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((com.braze.requests.framework.h) obj).f28283d == com.braze.requests.framework.i.f28289b) {
                arrayList2.add(obj);
            }
        }
        for (final com.braze.requests.framework.h hVar : arrayList2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: p5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return i.b(hVar, j10);
                }
            }, 7, (Object) null);
            hVar.a(j10, com.braze.requests.framework.i.f28292e);
        }
        ArrayList arrayList3 = this.f28253e;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((com.braze.requests.framework.h) obj2).f28283d == com.braze.requests.framework.i.f28288a) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<com.braze.requests.framework.h> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            com.braze.requests.framework.h hVar2 = (com.braze.requests.framework.h) obj3;
            o oVar = hVar2.f28280a;
            y yVar = oVar instanceof y ? (y) oVar : null;
            if ((yVar != null ? ((com.braze.triggers.events.i) yVar.f28367l).f28719b + yVar.f28370o : -1L) < hVar2.f28281b) {
                arrayList5.add(obj3);
            }
        }
        for (final com.braze.requests.framework.h hVar3 : arrayList5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: p5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return i.c(hVar3, j10);
                }
            }, 7, (Object) null);
            hVar3.a(j10, com.braze.requests.framework.i.f28292e);
        }
    }
}
