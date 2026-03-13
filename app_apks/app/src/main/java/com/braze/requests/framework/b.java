package com.braze.requests.framework;

import Od.v;
import com.braze.models.response.j;
import com.braze.models.response.m;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f28248j = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f28249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.dispatch.h f28250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f28254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f28255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.braze.requests.util.b f28256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.braze.requests.util.f f28257i;

    public b(n destination, com.braze.dispatch.h dispatchDataProvider) {
        AbstractC4862t.e(destination, "destination");
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
        this.f28249a = destination;
        this.f28250b = dispatchDataProvider;
        this.f28253e = new ArrayList();
        int iOrdinal = destination.ordinal();
        this.f28255g = iOrdinal != 0 ? iOrdinal != 2 ? 0L : 75L : 25L;
        this.f28256h = new com.braze.requests.util.b(dispatchDataProvider.f27612a.f27926o.j(), com.braze.requests.util.b.f28340g, dispatchDataProvider.f27612a.f27926o.k(), dispatchDataProvider.f27612a.f27926o.l());
    }

    public static final String d(b bVar, long j10) {
        return "New state after request success\n" + bVar.d(j10);
    }

    public abstract void a(long j10);

    public final void a(final long j10, o request) {
        AbstractC4862t.e(request, "request");
        request.a(this.f28250b.f27612a.f27925n);
        this.f28253e.add(new h(request, j10 + this.f28255g, j10));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new InterfaceC6082a() { // from class: o5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.b.a(this.f41182a, j10);
            }
        }, 3, (Object) null);
    }

    public final com.braze.requests.util.f b() {
        Map mapW;
        b3 b3Var = this.f28250b.f27612a.f27926o;
        ReentrantLock reentrantLock = b3Var.f28402c;
        reentrantLock.lock();
        try {
            m mVar = b3Var.f28404e;
            if (mVar == null || (mapW = mVar.f28156F) == null) {
                mapW = b3Var.w();
            }
            reentrantLock.unlock();
            j jVar = (j) mapW.get(this.f28249a);
            if (jVar == null) {
                this.f28257i = null;
                return null;
            }
            com.braze.requests.util.f fVar = this.f28257i;
            int i10 = jVar.f28148b;
            int i11 = jVar.f28147a;
            if (fVar == null) {
                fVar = new com.braze.requests.util.f(i11, i10, com.braze.requests.util.e.a(this.f28250b, "com.braze.endpointqueue.tokenbucket", String.valueOf(this.f28249a.f28327a.hashCode())));
            } else {
                fVar.a(i11, i10);
            }
            this.f28257i = fVar;
            return fVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean c() {
        return false;
    }

    public final void c(long j10) {
        ArrayList arrayList = this.f28253e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((h) obj).f28283d.a()) {
                arrayList2.add(obj);
            }
        }
        List listJ0 = C4179C.J0(arrayList2, new a());
        if (listJ0.size() >= 2) {
            int size = listJ0.size();
            for (int i10 = 1; i10 < size; i10++) {
                final h hVar = (h) listJ0.get(i10);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28248j, (BrazeLogger.Priority) null, (Throwable) null, c(), new InterfaceC6082a() { // from class: o5.e
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.requests.framework.b.a(hVar);
                    }
                }, 6, (Object) null);
                hVar.a(j10, i.f28291d);
            }
        }
    }

    public final String d(final long j10) {
        String string;
        String strQ0 = C4179C.q0(this.f28253e, "\n\n", null, null, 0, null, new l() { // from class: o5.d
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.braze.requests.framework.b.b(j10, (com.braze.requests.framework.h) obj);
            }
        }, 30, null);
        n nVar = this.f28249a;
        long j11 = this.f28251c - j10;
        long j12 = this.f28252d - j10;
        long j13 = this.f28254f - j10;
        long j14 = this.f28255g;
        com.braze.requests.util.f fVar = this.f28257i;
        if (fVar == null || (string = fVar.toString()) == null) {
            string = "unset";
        }
        return v.p("\n            |EndpointQueue: " + nVar + "\n            |   lastFailureAt = " + j11 + "\n            |   lastSuccessAt = " + j12 + "\n            |   failureBackoffUntil = " + j13 + "\n            |   pendingWaitDuration = " + j14 + "\n            |   endpointRateLimiter = " + string + "\n            |   requestInfoQueue: \n            |" + strQ0 + "\n        ", null, 1, null);
    }

    public com.braze.requests.util.b a() {
        return this.f28256h;
    }

    public static final String a(b bVar, long j10) {
        return "Added request now to queue " + bVar.d(j10);
    }

    public static final String a(h hVar, long j10, int i10) {
        return "Set retry count for " + hVar.a(j10) + " to " + i10;
    }

    public static final String a(h hVar, long j10) {
        return "Marking request as framework complete \n" + hVar.a(j10);
    }

    public final void a(final long j10, final h requestInfo) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        final com.braze.requests.util.f fVarB = b();
        if (fVarB == null) {
            return;
        }
        fVarB.a();
        com.braze.requests.util.f fVarB2 = b();
        if (fVarB2 != null && fVarB2.a(j10) < 1.0d) {
            final long jB = fVarB.b();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new InterfaceC6082a() { // from class: o5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.b.a(requestInfo, j10, jB, fVarB);
                }
            }, 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.b.b(this.f41195a, j10);
            }
        }, 7, (Object) null);
    }

    public static final String c(b bVar, long j10) {
        return "New state after request error " + bVar.d(j10);
    }

    public static final String a(h hVar, long j10, long j11, com.braze.requests.util.f fVar) {
        return "Delaying next request after '" + hVar.a(j10) + "' until next token is available in " + j11 + "ms - '" + DateTimeUtils.formatDateFromMillis$default(j10 + j11, null, null, 3, null) + "'\n" + fVar;
    }

    public static final String a(h hVar) {
        return "About to batch request " + hVar;
    }

    public void a(final long j10, h requestInfo, com.braze.models.response.a apiResponse) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        AbstractC4862t.e(apiResponse, "apiResponse");
        com.braze.models.response.g gVar = apiResponse instanceof com.braze.models.response.g ? (com.braze.models.response.g) apiResponse : null;
        com.braze.models.response.d dVar = gVar != null ? gVar.f28126d : null;
        Long l10 = apiResponse.f28114b;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        this.f28251c = j10;
        if (!(dVar instanceof com.braze.models.response.h)) {
            com.braze.requests.util.b bVarA = a();
            this.f28254f = jLongValue + j10 + ((long) bVarA.a(bVarA.f28342b));
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28248j, (BrazeLogger.Priority) null, (Throwable) null, c(), new InterfaceC6082a() { // from class: o5.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.b.c(this.f41199a, j10);
            }
        }, 6, (Object) null);
    }

    public final void b(final long j10) {
        a(j10);
        ArrayList arrayList = this.f28253e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((h) obj).f28283d == i.f28291d) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                final int i10 = ((h) it.next()).f28287h;
                while (it.hasNext()) {
                    int i11 = ((h) it.next()).f28287h;
                    if (i10 < i11) {
                        i10 = i11;
                    }
                }
                ArrayList arrayList3 = this.f28253e;
                ArrayList<h> arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (((h) obj2).f28283d.a()) {
                        arrayList4.add(obj2);
                    }
                }
                for (final h hVar : arrayList4) {
                    hVar.f28287h = i10;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new InterfaceC6082a() { // from class: o5.b
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.requests.framework.b.a(hVar, j10, i10);
                        }
                    }, 3, (Object) null);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        ArrayList<h> arrayList5 = new ArrayList();
        ArrayList arrayList6 = this.f28253e;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList6) {
            i iVar = ((h) obj3).f28283d;
            if (iVar == i.f28291d || iVar == i.f28292e) {
                arrayList7.add(obj3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = this.f28253e;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj4 : arrayList8) {
            h hVar2 = (h) obj4;
            if (hVar2.f28287h >= 15 && hVar2.f28283d.a()) {
                arrayList9.add(obj4);
            }
        }
        arrayList5.addAll(arrayList9);
        for (final h hVar3 : arrayList5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28248j, (BrazeLogger.Priority) null, (Throwable) null, c(), new InterfaceC6082a() { // from class: o5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.framework.b.a(hVar3, j10);
                }
            }, 6, (Object) null);
            hVar3.f28280a.a((com.braze.events.e) this.f28250b.f27612a.f27925n);
        }
        this.f28253e.removeAll(arrayList5);
    }

    public void a(final long j10, h requestInfo, com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        AbstractC4862t.e(apiResponse, "apiResponse");
        a().f28346f = 0;
        this.f28252d = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28248j, (BrazeLogger.Priority) null, (Throwable) null, c(), new InterfaceC6082a() { // from class: o5.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.b.d(this.f41197a, j10);
            }
        }, 6, (Object) null);
    }

    public static final String b(b bVar, long j10) {
        return bVar.d(j10);
    }

    public static final CharSequence b(long j10, h it) {
        AbstractC4862t.e(it, "it");
        return it.a(j10);
    }
}
