package com.braze.dispatch;

import Od.F;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.enums.d;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.dispatchmanager.c;
import com.braze.managers.j1;
import com.braze.managers.n0;
import com.braze.managers.r0;
import com.braze.managers.x;
import com.braze.managers.y;
import com.braze.models.k;
import com.braze.models.outgoing.l;
import com.braze.models.q;
import com.braze.requests.o;
import com.braze.requests.r;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.n3;
import com.braze.storage.p;
import com.braze.storage.v0;
import com.braze.storage.w2;
import com.braze.storage.y2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import gc.C4179C;
import gc.C4206t;
import ge.C4231e;
import ge.w0;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f27611d = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f27612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f27614c;

    public h(j1 udm) {
        AbstractC4862t.e(udm, "udm");
        this.f27612a = udm;
        this.f27613b = new ConcurrentHashMap();
        this.f27614c = new ConcurrentHashMap();
        udm.f27925n.c(c.class, new IEventSubscriber() { // from class: X4.r
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.dispatch.h.a(this.f18115a, (com.braze.events.internal.dispatchmanager.c) obj);
            }
        });
    }

    public static final void a(h hVar, c cVar) {
        AbstractC4862t.e(cVar, "<destruct>");
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f27719a;
        List<k> events = cVar.f27720b;
        q qVar = cVar.f27721c;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            hVar.getClass();
            AbstractC4862t.e(events, "events");
            for (k kVar : events) {
                hVar.f27614c.putIfAbsent(((com.braze.models.outgoing.event.b) kVar).f28076d, kVar);
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            hVar.a(qVar);
        } else {
            hVar.getClass();
            AbstractC4862t.e(events, "events");
            for (k kVar2 : events) {
                hVar.f27613b.putIfAbsent(((com.braze.models.outgoing.event.b) kVar2).f28076d, kVar2);
            }
        }
    }

    public static final String b() {
        return "Push permissions were granted, but blocking automatic opt-in";
    }

    public static final String c() {
        return "Push permissions were granted, setting user push notifications to opt-in";
    }

    public static final String d() {
        return "Flushing pending events to dispatcher map";
    }

    public final synchronized com.braze.models.b e() throws Throwable {
        h hVar;
        try {
            try {
                Collection collectionValues = this.f27613b.values();
                AbstractC4862t.d(collectionValues, "<get-values>(...)");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hVar = this;
                        break;
                    }
                    Object next = it.next();
                    AbstractC4862t.d(next, "next(...)");
                    final k kVar = (k) next;
                    linkedHashSet.add(kVar);
                    collectionValues.remove(kVar);
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    hVar = this;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.v
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.dispatch.h.a(kVar);
                        }
                    }, 7, (Object) null);
                    if (linkedHashSet.size() >= 32) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) hVar, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.w
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.braze.dispatch.h.a();
                            }
                        }, 6, (Object) null);
                        break;
                    }
                    this = hVar;
                }
                com.braze.models.b bVar = new com.braze.models.b(linkedHashSet);
                return bVar;
            } catch (Throwable th) {
                th = th;
                h hVar2 = this;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            throw th22;
        }
    }

    public final r0 f() {
        return this.f27612a;
    }

    public final void a(com.braze.requests.g dataSyncRequest) throws Throwable {
        Iterable arrayList;
        List listK;
        String jsonObject;
        AbstractC4862t.e(dataSyncRequest, "dataSyncRequest");
        j1 j1Var = this.f27612a;
        dataSyncRequest.f28303p = ((x) j1Var.f27916e).f28022c;
        dataSyncRequest.f28299l = j1Var.f27913b.getSdkFlavor();
        dataSyncRequest.f28304q = ((x) this.f27612a.f27916e).c();
        j1 j1Var2 = this.f27612a;
        n0 n0Var = j1Var2.f27916e;
        v0 deviceCache = j1Var2.f27924m;
        if (deviceCache == null) {
            AbstractC4862t.p("deviceCache");
            deviceCache = null;
        }
        x xVar = (x) n0Var;
        xVar.getClass();
        AbstractC4862t.e(deviceCache, "deviceCache");
        deviceCache.f28591e = xVar.b();
        com.braze.models.outgoing.h hVar = (com.braze.models.outgoing.h) deviceCache.a();
        dataSyncRequest.f28225i = hVar;
        if (hVar != null && hVar.f28095l) {
            if (this.f27612a.f27913b.getShouldOptInWhenPushAuthorized()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.t
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.dispatch.h.c();
                    }
                }, 6, (Object) null);
                n3 n3VarD = this.f27612a.d();
                NotificationSubscriptionType notificationSubscriptionType = NotificationSubscriptionType.OPTED_IN;
                synchronized (n3VarD) {
                    if (notificationSubscriptionType != null) {
                        try {
                            jsonObject = notificationSubscriptionType.getKey();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        jsonObject = null;
                    }
                    n3VarD.c("push_subscribe", jsonObject);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.u
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.dispatch.h.b();
                    }
                }, 6, (Object) null);
            }
        }
        if (hVar != null && hVar.getKey().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
            this.f27612a.d().j();
        }
        dataSyncRequest.f28300m = (l) this.f27612a.d().a();
        com.braze.models.b bVarE = e();
        dataSyncRequest.f28301n = bVarE;
        LinkedHashSet linkedHashSet = bVarE.f28034a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((com.braze.models.outgoing.event.b) ((k) it.next())).f28073a == d.f27651y) {
                j1 j1Var3 = this.f27612a;
                w2 w2Var = j1Var3.f27935x;
                EnumSet<BrazeSdkMetadata> newSdkMetadata = j1Var3.f27913b.getSdkMetadata();
                w2Var.getClass();
                AbstractC4862t.e(newSdkMetadata, "newSdkMetadata");
                y2 y2Var = w2Var.f28603a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKey), 12, (Object) null);
                    arrayList = new ArrayList();
                } else {
                    try {
                        Object data = y2Var.readData(dataStoreKey, "");
                        AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) data;
                        if (F.k0(str)) {
                            arrayList = new ArrayList();
                        } else {
                            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                            if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                                listK = C4206t.k();
                            } else {
                                try {
                                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                                    aVar.d();
                                    listK = (List) aVar.a(new C4231e(w0.f35762a), str);
                                } catch (Exception e10) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                                    listK = C4206t.k();
                                }
                            }
                            arrayList = C4179C.X0(listK);
                        }
                    } catch (Exception e11) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new i0(dataStoreKey), 8, (Object) null);
                        arrayList = new ArrayList();
                    }
                }
                dataSyncRequest.f28302o = AbstractC4862t.a(com.braze.support.k.a(newSdkMetadata), C4179C.Z0(arrayList)) ? null : newSdkMetadata;
                return;
            }
        }
    }

    public static final String a(k kVar) {
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) kVar;
        return "Event dispatched: " + bVar.getKey() + " with uid: " + bVar.e();
    }

    public static final String a() {
        return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
    }

    public final void a(q qVar) {
        if (qVar == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f27614c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.s
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.dispatch.h.d();
            }
        }, 7, (Object) null);
        Collection collectionValues = concurrentHashMap.values();
        AbstractC4862t.d(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((com.braze.models.outgoing.event.b) ((k) it.next())).a(qVar);
        }
        this.f27613b.putAll(concurrentHashMap);
        Set setKeySet = concurrentHashMap.keySet();
        AbstractC4862t.d(setKeySet, "<get-keys>(...)");
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            this.f27614c.remove((String) it2.next());
        }
    }

    public final o a(o brazeRequest) throws Throwable {
        AbstractC4862t.e(brazeRequest, "brazeRequest");
        g gVar = f27611d;
        j1 j1Var = this.f27612a;
        gVar.a(j1Var.f27913b, j1Var.f27933v, brazeRequest, ((y) j1Var.f27914c).a());
        if (brazeRequest instanceof com.braze.requests.g) {
            a((com.braze.requests.g) brazeRequest);
            return brazeRequest;
        }
        if (brazeRequest instanceof r) {
            ((r) brazeRequest).f28225i = ((x) this.f27612a.f27916e).b();
            return brazeRequest;
        }
        if (brazeRequest instanceof com.braze.requests.f) {
            p pVar = this.f27612a.f27908D;
            com.braze.requests.f fVar = (com.braze.requests.f) brazeRequest;
            fVar.f28244k = pVar.f28526d;
            fVar.f28245l = pVar.f28527e;
        }
        return brazeRequest;
    }
}
