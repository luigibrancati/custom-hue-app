package com.braze.requests.framework;

import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.O;
import Rd.U;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.o;
import com.braze.managers.j1;
import com.braze.models.outgoing.k;
import com.braze.requests.n;
import com.braze.requests.q;
import com.braze.requests.v;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import fc.C4015H;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f28264n = BrazeLogger.getBrazeLogTag((Class<?>) g.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f28265o = TimeUnit.HOURS.toMillis(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f28266p = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.dispatch.h f28267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f28268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f28271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U f28272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f28273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f28275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f28276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f28277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.braze.requests.util.f f28278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.braze.enums.e f28279m;

    public g(com.braze.dispatch.h dispatchDataProvider, v requestExecutor, boolean z10, boolean z11) {
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
        AbstractC4862t.e(requestExecutor, "requestExecutor");
        this.f28267a = dispatchDataProvider;
        this.f28268b = requestExecutor;
        this.f28269c = z10;
        this.f28270d = z11;
        this.f28271e = new LinkedHashMap();
        this.f28273g = new ReentrantLock();
        this.f28275i = -1L;
        this.f28276j = -1L;
        this.f28277k = new AtomicInteger(0);
        this.f28278l = new com.braze.requests.util.f(dispatchDataProvider.f27612a.f27926o.n(), dispatchDataProvider.f27612a.f27926o.o(), com.braze.requests.util.e.a(dispatchDataProvider, "com.braze.requestframework.tokenbucket", ""));
        this.f28279m = com.braze.enums.e.f27656c;
        dispatchDataProvider.f27612a.f27925n.c(com.braze.events.internal.dispatchmanager.c.class, new IEventSubscriber() { // from class: o5.s
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.requests.framework.g.a(this.f41212a, (com.braze.events.internal.dispatchmanager.c) obj);
            }
        });
        dispatchDataProvider.f27612a.f27925n.c(o.class, new IEventSubscriber() { // from class: o5.x
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.requests.framework.g.a(this.f41219a, (com.braze.events.internal.o) obj);
            }
        });
    }

    public static final void a(g gVar, com.braze.events.internal.dispatchmanager.c cVar) {
        AbstractC4862t.e(cVar, "<destruct>");
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f27719a;
        com.braze.requests.o oVar = cVar.f27722d;
        ReentrantLock reentrantLock = gVar.f28273g;
        reentrantLock.lock();
        try {
            if (bVar == com.braze.events.internal.dispatchmanager.b.f27716d && oVar != null) {
                gVar.a(oVar);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b() {
        return "Starting request sweeper job.";
    }

    public static final String e() {
        return "Skipping request sending due to lacking a global request rate limiting token.";
    }

    public static final String f() {
        return "Skipping request sending due to lacking an endpoint request rate limiting token.";
    }

    public static final String h() {
        return "Got call to shutdown request framework";
    }

    public static final String j() {
        return "Kicking off request framework.";
    }

    public final AtomicInteger c() {
        return this.f28277k;
    }

    public final String d() {
        return this.f28274h;
    }

    public final void g() throws Throwable {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28264n, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.h();
            }
        }, 14, (Object) null);
        U u10 = this.f28272f;
        if (u10 != null) {
            InterfaceC2166z0.a.a(u10, null, 1, null);
        }
        j1 j1Var = this.f28267a.f27612a;
        com.braze.requests.g gVar = new com.braze.requests.g(j1Var.f27926o, j1Var.f27913b.getBaseUrlForRequests(), new k(null, null, null));
        this.f28267a.a((com.braze.requests.o) gVar);
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        a(jNowInMillisecondsSystemClock, gVar, new h(gVar, jNowInMillisecondsSystemClock, jNowInMillisecondsSystemClock), new f(), false);
    }

    public final void i() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.j();
            }
        }, 7, (Object) null);
        a();
    }

    public static final String b(long j10, h hVar) {
        return "Running at " + j10 + " for request " + hVar.a(j10);
    }

    public static final String b(g gVar, long j10) {
        return gVar.b(j10);
    }

    public final String b(final long j10) {
        LinkedHashMap linkedHashMap = this.f28271e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((b) ((Map.Entry) it.next()).getValue());
        }
        String strQ0 = C4179C.q0(arrayList, "\n\n", null, null, 0, null, new l() { // from class: o5.D
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.braze.requests.framework.g.b(j10, (com.braze.requests.framework.b) obj);
            }
        }, 30, null);
        return Od.v.p("RequestFramework->\n            |mockAllNetworkRequests=" + this.f28269c + "\n            |lastSdkAuthFailedToken=" + this.f28274h + "\n            |lastSdkAuthFailureAt=" + (this.f28275i - j10) + "\n            |sdkAuthFailureBackoffUntil=" + (this.f28276j - j10) + "\n            |invalidApiKeyErrorCounter=" + this.f28277k.get() + "\n            |globalRequestRateLimiter=" + this.f28278l + "\n            |lastNetworkLevel=" + this.f28279m + "\n            |currentSdkAuthToken=" + this.f28267a.f27612a.f27933v.a() + "\n            |endpointQueues=\n            | \n            |" + strQ0 + "\n            |  \n            |\n        ", null, 1, null);
    }

    public final void a(long j10, b queue) throws Throwable {
        AbstractC4862t.e(queue, "queue");
        if (j10 <= queue.f28254f) {
            return;
        }
        queue.b(j10);
        ArrayList arrayList = queue.f28253e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            h hVar = (h) obj;
            if (hVar.f28283d.a() && j10 >= hVar.f28281b) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a(j10, queue, (h) it.next());
        }
    }

    public static final void a(g gVar, final o it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28264n, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.C
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.a(it);
            }
        }, 14, (Object) null);
        gVar.f28279m = it.f27743b;
    }

    public static final String a(o oVar) {
        return "Got network change event: " + oVar;
    }

    public static final CharSequence b(long j10, b it) {
        AbstractC4862t.e(it, "it");
        return it.d(j10);
    }

    public static void a(g gVar) {
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        ReentrantLock reentrantLock = gVar.f28273g;
        reentrantLock.lock();
        try {
            if ((!gVar.f28270d || gVar.f28279m != com.braze.enums.e.f27654a) && ((gVar.f28274h == null || jNowInMillisecondsSystemClock >= gVar.f28276j || !AbstractC4862t.a(gVar.f28267a.f27612a.f27933v.a(), gVar.f28274h)) && gVar.a(jNowInMillisecondsSystemClock))) {
                Iterator it = gVar.f28271e.entrySet().iterator();
                while (it.hasNext()) {
                    gVar.a(jNowInMillisecondsSystemClock, (b) ((Map.Entry) it.next()).getValue());
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a() {
        U u10 = this.f28272f;
        if (u10 == null || !u10.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.B
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.g.b();
                }
            }, 6, (Object) null);
            U uB = AbstractC2132i.b(BrazeCoroutineScope.INSTANCE, null, O.LAZY, new d(this, null), 1, null);
            this.f28272f = uB;
            if (uB != null) {
                uB.start();
            }
        }
    }

    public final void a(final long j10, b queue, final h requestInfo) throws Throwable {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, queue.c(), new InterfaceC6082a() { // from class: o5.F
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.b(j10, requestInfo);
            }
        }, 3, (Object) null);
        if (!a(j10)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.t
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.g.e();
                }
            }, 7, (Object) null);
            return;
        }
        com.braze.requests.util.f fVarB = queue.b();
        if (fVarB == null || fVarB.a(j10) >= 1.0d) {
            com.braze.requests.o oVarA = this.f28267a.a(requestInfo.f28280a);
            AbstractC4862t.e(queue, "queue");
            AbstractC4862t.e(requestInfo, "requestInfo");
            e eVar = new e(this, requestInfo, queue);
            requestInfo.a(j10, i.f28290c);
            com.braze.requests.util.f fVarB2 = queue.b();
            requestInfo.f28285f = (fVarB2 == null ? null : Integer.valueOf((int) fVarB2.a(j10))) != null ? Integer.valueOf(Bc.k.e(r0.intValue() - 1, 0)) : null;
            requestInfo.f28284e = Bc.k.e(((int) this.f28278l.a(j10)) - 1, 0);
            if (a(j10, oVarA, requestInfo, eVar, false)) {
                return;
            }
            a(j10, requestInfo);
            queue.a(j10, requestInfo);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.u
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.f();
            }
        }, 7, (Object) null);
        com.braze.requests.util.f fVarB3 = queue.b();
        requestInfo.f28281b = (fVarB3 != null ? fVarB3.b() : 0L) + j10;
    }

    public final boolean a(final long j10, com.braze.requests.o oVar, final h hVar, c cVar, boolean z10) {
        q qVar;
        final boolean z11 = oVar.a() || this.f28269c;
        if (z11) {
            qVar = this.f28267a.f27612a.f27909E;
        } else {
            qVar = this.f28268b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new InterfaceC6082a() { // from class: o5.E
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.a(z11, hVar, j10);
            }
        }, 3, (Object) null);
        qVar.a(hVar, cVar, z10);
        return z11;
    }

    public static final String a(boolean z10, h hVar, long j10) {
        return "Running on " + (z10 ? "no-op" : "network") + " executor for " + hVar.a(j10);
    }

    public final void a(com.braze.requests.o request) {
        b aVar;
        AbstractC4862t.e(request, "request");
        n nVarC = request.c();
        if (!this.f28271e.containsKey(nVarC)) {
            int iOrdinal = nVarC.ordinal();
            if (iOrdinal == 0) {
                aVar = new com.braze.requests.framework.queue.a(this.f28267a);
            } else if (iOrdinal == 1) {
                aVar = new com.braze.requests.framework.queue.f(this.f28267a);
            } else if (iOrdinal == 2) {
                aVar = new com.braze.requests.framework.queue.c(this.f28267a);
            } else if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        aVar = new com.braze.requests.framework.queue.g(this.f28267a);
                        break;
                    case 10:
                        aVar = new com.braze.requests.framework.queue.h(this.f28267a);
                        break;
                    case 11:
                        aVar = new com.braze.requests.framework.queue.e(this.f28267a);
                        break;
                    default:
                        aVar = new com.braze.requests.framework.queue.d(nVarC, this.f28267a);
                        break;
                }
            } else {
                aVar = new com.braze.requests.framework.queue.i(this.f28267a);
            }
            this.f28271e.put(nVarC, aVar);
        } else {
            aVar = (b) this.f28271e.get(nVarC);
        }
        if (aVar == null) {
            return;
        }
        final long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        aVar.a(jNowInMillisecondsSystemClock, request);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new InterfaceC6082a() { // from class: o5.A
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.a(this.f41168a, jNowInMillisecondsSystemClock);
            }
        }, 3, (Object) null);
        a();
    }

    public static final String a(g gVar, long j10) {
        return gVar.b(j10);
    }

    public final void a(final long j10, final h requestInfo) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        this.f28278l.a();
        if (!a(j10)) {
            final long jB = this.f28278l.b();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.v
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.g.a(requestInfo, j10, jB, this);
                }
            }, 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new InterfaceC6082a() { // from class: o5.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.g.b(this.f41217a, j10);
            }
        }, 3, (Object) null);
    }

    public static final String a(h hVar, long j10, long j11, g gVar) {
        return "Delaying next request after " + hVar.a(j10) + " until next token is available in " + j11 + "ms - '" + DateTimeUtils.formatDateFromMillis$default(j10 + j11, null, null, 3, null) + "'\n" + gVar.f28278l;
    }

    public final boolean a(long j10) {
        return !this.f28267a.f27612a.f27926o.K() || this.f28278l.a(j10) >= 1.0d;
    }
}
