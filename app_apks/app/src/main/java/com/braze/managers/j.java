package com.braze.managers;

import Od.F;
import Rd.InterfaceC2166z0;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.Banner;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import de.AbstractC3918a;
import fc.C4015H;
import fc.C4034q;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import ge.C4231e;
import ge.C4237h;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static InterfaceC2166z0 f27892j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f27898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b3 f27899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f27900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.storage.e f27901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f27902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f27903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f27890h = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f27891i = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ReentrantLock f27893k = new ReentrantLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayList f27894l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ReentrantLock f27895m = new ReentrantLock();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ArrayList f27896n = new ArrayList();

    public j(Context context, String apiKey, String str, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, b3 serverConfigStorageProvider, r brazeManager) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(externalEventPublisher, "externalEventPublisher");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(brazeManager, "brazeManager");
        this.f27897a = str;
        this.f27898b = externalEventPublisher;
        this.f27899c = serverConfigStorageProvider;
        this.f27900d = brazeManager;
        this.f27901e = new com.braze.storage.e(context, str, apiKey);
        this.f27902f = C4206t.k();
        this.f27903g = new AtomicInteger(0);
        e();
        com.braze.events.d dVar = (com.braze.events.d) internalEventPublisher;
        dVar.c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: c5.q1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.j.a(this.f25766a, (com.braze.events.internal.q) obj);
            }
        });
        dVar.c(com.braze.events.internal.c.class, new IEventSubscriber() { // from class: c5.t1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.j.a(this.f25778a, (com.braze.events.internal.c) obj);
            }
        });
        dVar.c(com.braze.events.internal.b.class, new IEventSubscriber() { // from class: c5.u1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.j.a(this.f25782a, (com.braze.events.internal.b) obj);
            }
        });
        dVar.d(BrazeUserChangeEvent.class, new IEventSubscriber() { // from class: c5.v1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.j.a(this.f25786a, (BrazeUserChangeEvent) obj);
            }
        });
        dVar.c(com.braze.events.internal.d.class, new IEventSubscriber() { // from class: c5.w1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.j.a(this.f25789a, (com.braze.events.internal.d) obj);
            }
        });
    }

    public static final void a(j jVar, com.braze.events.internal.d it) {
        AbstractC4862t.e(it, "it");
        if (!it.f27710a.f28157G || it.f27711b.f28157G) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.i1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.d();
            }
        }, 7, (Object) null);
        jVar.getClass();
        jVar.f27902f = C4206t.k();
        jVar.f27901e.clearData(DataStoreKey.BANNERS);
        jVar.j();
    }

    public static final String b(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "Done updating banners because of user change to " + brazeUserChangeEvent.getCurrentUserId() + ".";
    }

    public static final String c() {
        return "Refreshing Banners on forced internal refresh.";
    }

    public static final String d() {
        return "Banners have moved to disabled. Clearing banners data.";
    }

    public static final String e(String str) {
        return "Not logging a Banner click for Banner with placement id " + str + ". The Banner was not present in cache.";
    }

    public static final String g(String str) {
        return "Not logging a Banner impression for Banner with placement id " + str + ". The Banner was not present in cache.";
    }

    public static final String h(String str) {
        return "Logging impression for Banner with placement id " + str + ".";
    }

    public static final String i() {
        return "Resetting BannersManager for new session.";
    }

    public static final String k() {
        return "View is not an IBannerView. Cannot update banner data.";
    }

    public final boolean f(final String id2) {
        Map linkedHashMap;
        Map mapI;
        ce.b bVarI;
        Map linkedHashMap2;
        Map mapI2;
        ce.b bVarI2;
        String strB;
        Object next;
        AbstractC4862t.e(id2, "id");
        Banner banner = (Banner) f27891i.get(id2);
        if (banner == null) {
            Iterator it = this.f27902f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC4862t.a(id2, ((Banner) next).getPlacementId())) {
                    break;
                }
            }
            banner = (Banner) next;
        }
        final Banner banner2 = banner;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.z1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.g(id2);
                }
            }, 6, (Object) null);
            return false;
        }
        String id3 = banner2.getTrackingId();
        AbstractC4862t.e(id3, "id");
        com.braze.storage.e eVar = this.f27901e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_IMPRESSION_MAP;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = eVar.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        mapI = Q.i();
                    } else {
                        try {
                            Cc.d dVarB = M.b(Boolean.class);
                            if (AbstractC4862t.a(dVarB, M.b(String.class))) {
                                S s10 = S.f39781a;
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls5))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls4))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls3))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls2))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                            } else if (AbstractC4862t.a(dVarB, M.b(cls))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) i.f27886a, 6, (Object) null);
                                mapI = Q.i();
                            }
                            Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                            AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            mapI = (Map) objA;
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                            mapI = Q.i();
                        }
                    }
                    Map mapW = Q.w(mapI);
                    AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = T.c(mapW);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        if (AbstractC4862t.a(linkedHashMap.get(id3), Boolean.TRUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.W0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.b(banner2);
                }
            }, 6, (Object) null);
            return true;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.V0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.h(id2);
            }
        }, 7, (Object) null);
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f28071g.a(banner2.getTrackingId());
        if (kVarA != null) {
            this.f27900d.a(kVarA);
        }
        AbstractC4862t.e(id3, "id");
        com.braze.storage.e eVar2 = this.f27901e;
        DataStoreKey dataStoreKey2 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey2), 12, (Object) null);
            linkedHashMap2 = new LinkedHashMap();
        } else {
            try {
                Object data2 = eVar2.readData(dataStoreKey2, "");
                AbstractC4862t.c(data2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) data2;
                if (F.k0(str2)) {
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (F.k0(str2) || AbstractC4862t.a(F.e1(str2).toString(), "null")) {
                        mapI2 = Q.i();
                    } else {
                        try {
                            Cc.d dVarB2 = M.b(Boolean.class);
                            if (AbstractC4862t.a(dVarB2, M.b(String.class))) {
                                S s11 = S.f39781a;
                                bVarI2 = AbstractC3918a.i(AbstractC3918a.G(s11), AbstractC3918a.G(s11));
                            } else if (AbstractC4862t.a(dVarB2, M.b(cls5))) {
                                bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                            } else if (AbstractC4862t.a(dVarB2, M.b(cls4))) {
                                bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                            } else if (AbstractC4862t.a(dVarB2, M.b(cls3))) {
                                bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                            } else if (AbstractC4862t.a(dVarB2, M.b(cls2))) {
                                bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                            } else if (AbstractC4862t.a(dVarB2, M.b(cls))) {
                                bVarI2 = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                            } else {
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) h.f27872a, 6, (Object) null);
                                mapI2 = Q.i();
                            }
                            Object objA2 = AbstractC4304b.f36582d.a(bVarI2, str2);
                            AbstractC4862t.c(objA2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            mapI2 = (Map) objA2;
                        } catch (Exception e12) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) new com.braze.support.f(str2), 4, (Object) null);
                            mapI2 = Q.i();
                        }
                    }
                    Map mapW2 = Q.w(mapI2);
                    AbstractC4862t.c(mapW2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap2 = T.c(mapW2);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new com.braze.storage.l0(dataStoreKey2), 8, (Object) null);
                linkedHashMap2 = new LinkedHashMap();
            }
        }
        linkedHashMap2.put(id3, Boolean.TRUE);
        com.braze.storage.e eVar3 = this.f27901e;
        DataStoreKey dataStoreKey3 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.q0(dataStoreKey3), 12, (Object) null);
            return true;
        }
        try {
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new ge.M(ge.w0.f35762a, C4237h.f35705a), linkedHashMap2);
            } catch (Exception e14) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e14, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            eVar3.writeData(dataStoreKey3, strB);
            return true;
        } catch (Exception e15) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e15, false, (InterfaceC6082a) new com.braze.storage.r0(dataStoreKey3), 8, (Object) null);
            return true;
        }
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = f27893k;
        reentrantLock.lock();
        try {
            List<d> listV0 = C4179C.V0(f27894l);
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            for (final d dVar : listV0) {
                try {
                    KeyEvent.Callback callback = (View) dVar.f27848b.get();
                    if (callback == null) {
                        arrayList.add(dVar);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.o1
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.braze.managers.j.a(dVar);
                            }
                        }, 7, (Object) null);
                    } else if (callback instanceof IBannerView) {
                        ((IBannerView) callback).initBanner(dVar.f27847a);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.p1
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.braze.managers.j.k();
                            }
                        }, 6, (Object) null);
                        arrayList.add(dVar);
                    }
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.r1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.j.b(dVar);
                        }
                    }, 4, (Object) null);
                    arrayList.add(dVar);
                }
            }
            f27893k.lock();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f27894l.remove((d) it.next());
                }
                C4015H c4015h2 = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l() {
        final long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.j1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.a(jNowInSeconds);
            }
        }, 6, (Object) null);
        this.f27901e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(jNowInSeconds));
    }

    public static final String b() {
        return "Cached Banners placement IDs are empty. Not refreshing Banners on forced internal call.";
    }

    public static final String c(String str) {
        return "Banner with placement id " + str + " not found in cache. Returning null for this Banner.";
    }

    public static final String d(String str) {
        return "Encountered unexpected exception while parsing stored banner: " + str;
    }

    public static final String g() {
        return "Received blank serialized Banner string from DataStore. Not parsing.";
    }

    public final void e() {
        List<String> arrayList;
        List listK;
        com.braze.storage.e eVar = this.f27901e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = eVar.readData(dataStoreKey, "");
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
                            listK = (List) aVar.a(new C4231e(ge.w0.f35762a), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                            listK = C4206t.k();
                        }
                    }
                    arrayList = C4179C.X0(listK);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new com.braze.storage.i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.d1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.f();
                }
            }, 7, (Object) null);
            this.f27902f = C4206t.k();
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (final String str2 : arrayList) {
            try {
                if (F.k0(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.e1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.j.g();
                        }
                    }, 6, (Object) null);
                } else {
                    Banner bannerA = Banner.Companion.a(new JSONObject(str2));
                    if (bannerA != null) {
                        arrayList2.add(bannerA);
                    }
                }
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e12, false, new InterfaceC6082a() { // from class: c5.g1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.j.d(str2);
                    }
                }, 4, (Object) null);
            }
        }
        this.f27902f = arrayList2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.h1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.a(arrayList2);
            }
        }, 7, (Object) null);
    }

    public final void h() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.s1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.i();
            }
        }, 6, (Object) null);
        this.f27901e.clearData(DataStoreKey.BANNERS_IMPRESSION_MAP);
        g.b();
    }

    public static final String c(Banner banner) {
        return "Error converting Banner to JSON: " + banner;
    }

    public final boolean b(final List ids) {
        String trackingId;
        Object next;
        AbstractC4862t.e(ids, "ids");
        if (this.f27903g.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.x1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.a(this.f25792a);
                }
            }, 7, (Object) null);
            return false;
        }
        if (ids.size() > this.f27899c.p()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.y1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.a(this.f25793a, ids);
                }
            }, 7, (Object) null);
        }
        this.f27903g.incrementAndGet();
        List<String> ids2 = C4179C.M0(ids, this.f27899c.p());
        AbstractC4862t.e(ids2, "ids");
        ArrayList arrayList = new ArrayList();
        for (String str : ids2) {
            Iterator it = this.f27902f.iterator();
            while (true) {
                trackingId = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC4862t.a(((Banner) next).getPlacementId(), str)) {
                    break;
                }
            }
            Banner banner = (Banner) next;
            if (banner != null) {
                trackingId = banner.getTrackingId();
            }
            arrayList.add(new C4034q(str, trackingId));
        }
        this.f27900d.a(arrayList);
        return true;
    }

    public static final String c(List list) {
        return "Added " + list.size() + " new Banners to DataStore.";
    }

    public static final void a(j jVar, com.braze.events.internal.q it) {
        AbstractC4862t.e(it, "it");
        if (it.f27745a instanceof com.braze.requests.a) {
            jVar.f27903g.decrementAndGet();
        }
    }

    public static final void a(j jVar, com.braze.events.internal.c it) {
        AbstractC4862t.e(it, "it");
        jVar.l();
    }

    public static final void a(j jVar, com.braze.events.internal.b it) {
        AbstractC4862t.e(it, "it");
        ((com.braze.events.d) jVar.f27898b).b(it, com.braze.events.internal.b.class);
    }

    public static final void a(j jVar, final BrazeUserChangeEvent it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.b1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.a(it);
            }
        }, 7, (Object) null);
        jVar.j();
        BrazeLogger.brazelog$default(brazeLogger, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.c1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.b(it);
            }
        }, 7, (Object) null);
    }

    public static final String b(String str) {
        return "Returning test Banner with placement id " + str + ".";
    }

    public static final String a(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "Updating banners because of user change to " + brazeUserChangeEvent.getCurrentUserId() + ".";
    }

    public static final String b(Banner banner) {
        return "Not logging a Banner impression for Banner " + banner + ". The Banner already had an impression logged in the current session";
    }

    public static final String b(String str, String str2) {
        return "Logging click for Banner with placement id " + str + " with buttonID of " + str2 + ".";
    }

    public final void a() {
        ReentrantLock reentrantLock = f27895m;
        reentrantLock.lock();
        try {
            List listX0 = C4179C.X0(f27896n);
            reentrantLock.unlock();
            if (listX0.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.k1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.j.b();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.l1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.j.c();
                    }
                }, 7, (Object) null);
                b(listX0);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(d dVar) {
        return "Error checking banner visibility for " + dVar.a() + ".Removing banner from visibility monitoring.";
    }

    public static final String a(j jVar) {
        return "Not refreshing Banners since another " + jVar.f27903g.get() + " request is currently in-flight.";
    }

    public static final String a(j jVar, List list) {
        return "The number of Banner placements requested exceeds the maximum allowed by the server. The server allows a maximum of " + jVar.f27899c.p() + " placements, but " + list.size() + " were requested. Truncating request to fit.\nPlacements that will be requested: " + C4179C.M0(list, jVar.f27899c.p()) + "\nTruncated placements not requested: " + list.subList(jVar.f27899c.p(), list.size());
    }

    public final Banner a(final String id2) {
        Object next;
        AbstractC4862t.e(id2, "id");
        final Banner banner = (Banner) f27891i.get(id2);
        if (banner != null) {
            if (banner.isExpired()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.X0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.j.a(banner);
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Y0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.j.b(id2);
                    }
                }, 6, (Object) null);
                banner.setUserId(this.f27897a);
                return banner;
            }
        }
        Iterator it = this.f27902f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4862t.a(((Banner) next).getPlacementId(), id2)) {
                break;
            }
        }
        final Banner banner2 = (Banner) next;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Z0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.c(id2);
                }
            }, 6, (Object) null);
            return null;
        }
        if (banner2.isExpired()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.a1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.a(id2, banner2);
                }
            }, 6, (Object) null);
            return null;
        }
        banner2.setUserId(this.f27897a);
        return banner2;
    }

    public static final String a(Banner banner) {
        return "Found test banner, but it is expired. Attempting to find non-test banner. " + banner;
    }

    public static final String a(String str, Banner banner) {
        return "Banner with placement id " + str + " has expired. Returning null for this Banner " + banner;
    }

    public final void a(final String id2, final String str) {
        Object next;
        AbstractC4862t.e(id2, "id");
        Banner banner = (Banner) f27891i.get(id2);
        if (banner == null) {
            Iterator it = this.f27902f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (AbstractC4862t.a(id2, ((Banner) next).getPlacementId())) {
                        break;
                    }
                }
            }
            banner = (Banner) next;
        }
        if (banner == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.U0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.j.e(id2);
                }
            }, 6, (Object) null);
            return;
        }
        String trackingId = banner.getTrackingId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.f1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.b(id2, str);
            }
        }, 7, (Object) null);
        com.braze.models.k kVarC = com.braze.models.outgoing.event.b.f28071g.c(trackingId, str);
        if (kVarC != null) {
            this.f27900d.a(kVarC);
        }
    }

    public final BannersUpdatedEvent a(JSONObject bannersJson) {
        String strB;
        String string;
        AbstractC4862t.e(bannersJson, "bannerData");
        Banner.Companion.getClass();
        AbstractC4862t.e(bannersJson, "bannersJson");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = bannersJson.keys();
        AbstractC4862t.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            Banner bannerA = Banner.Companion.a(bannersJson.optJSONObject(itKeys.next()));
            if (bannerA != null) {
                arrayList.add(bannerA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Banner) obj).getIsTestSend()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        C4034q c4034q = new C4034q(arrayList2, arrayList3);
        List<Banner> list = (List) c4034q.a();
        List list2 = (List) c4034q.b();
        for (Banner banner : list) {
            f27891i.put(banner.getPlacementId(), banner);
        }
        this.f27902f = list2;
        ArrayList<Banner> arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((Banner) obj2).isExpired()) {
                arrayList4.add(obj2);
            }
        }
        final ArrayList arrayList5 = new ArrayList();
        for (final Banner banner2 : arrayList4) {
            try {
                string = banner2.getKey().toString();
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.m1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.j.c(banner2);
                    }
                }, 4, (Object) null);
                string = null;
            }
            if (string != null) {
                arrayList5.add(string);
            }
        }
        com.braze.storage.e eVar = this.f27901e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    strB = aVar.b(new C4231e(ge.w0.f35762a), arrayList5);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                    strB = arrayList5 instanceof Map ? "{}" : "[]";
                }
                eVar.writeData(dataStoreKey, strB);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.n1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.j.c(arrayList5);
            }
        }, 7, (Object) null);
        j();
        List list3 = this.f27902f;
        ArrayList arrayList6 = new ArrayList(C4207u.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList6.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
        }
        return new BannersUpdatedEvent(arrayList6);
    }

    public static final String f() {
        return "Did not find stored Banners in DataStore.";
    }

    public static final String a(long j10) {
        return "Updating last Banners refresh time: " + j10;
    }

    public static final String a(List list) {
        return "Loaded " + list.size() + " banners from DataStore.";
    }

    public static final String a(d dVar) {
        return "Banner " + dVar.a() + " removed because view is null";
    }
}
