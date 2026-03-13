package com.braze.managers;

import Od.F;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.storage.z1;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.l;
import de.AbstractC3918a;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import org.json.JSONArray;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f27939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f27940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b3 f27941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f27942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1 f27943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f27944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f27945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f27946h;

    public k0(Context context, String apiKey, String str, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, b3 serverConfigStorageProvider, r brazeManager) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(externalEventPublisher, "externalEventPublisher");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(brazeManager, "brazeManager");
        this.f27939a = internalEventPublisher;
        this.f27940b = externalEventPublisher;
        this.f27941c = serverConfigStorageProvider;
        this.f27942d = brazeManager;
        this.f27943e = new z1(context, str, apiKey);
        this.f27944f = C4206t.k();
        this.f27945g = new AtomicBoolean(false);
        this.f27946h = new AtomicInteger(0);
        c();
        f();
    }

    public static final String b(String str) {
        return "Not logging a Feature Flag impression for Feature Flag with id " + str + ". The Feature Flag was not part of any matching campaign";
    }

    public static final String g() {
        return "Features flags have moved to disabled. Clearing feature flag data.";
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray featureFlagsJson) {
        String strB;
        AbstractC4862t.e(featureFlagsJson, "featureFlagsData");
        AbstractC4862t.e(featureFlagsJson, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        Iterator it = Nd.t.I(Nd.t.y(C4179C.X(Bc.k.p(0, featureFlagsJson.length())), new l(featureFlagsJson)), new com.braze.support.m(featureFlagsJson)).iterator();
        while (it.hasNext()) {
            FeatureFlag featureFlagA = com.braze.support.n.f28643a.a((JSONObject) it.next());
            if (featureFlagA != null) {
                arrayList.add(featureFlagA);
            }
        }
        this.f27944f = arrayList;
        z1 z1Var = this.f27943e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    strB = aVar.b(new C4231e(FeatureFlag.Companion.serializer()), arrayList);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                    strB = arrayList instanceof Map ? "{}" : "[]";
                }
                z1Var.writeData(dataStoreKey, strB);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.G1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.k0.b(this.f25649a);
            }
        }, 7, (Object) null);
        List list = this.f27944f;
        ArrayList arrayList2 = new ArrayList(C4207u.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new FeatureFlagsUpdatedEvent(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public final ArrayList c(String str) {
        ?? arrayList;
        if (str != null) {
            List list = this.f27944f;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (AbstractC4862t.a(((FeatureFlag) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = this.f27944f;
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList2;
    }

    public final void d(final String id2) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map mapI;
        Cc.d dVarB;
        ce.b bVarI;
        String strB;
        AbstractC4862t.e(id2, "id");
        z1 z1Var = this.f27943e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = z1Var.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        mapI = Q.i();
                    } else {
                        try {
                            dVarB = M.b(Boolean.class);
                        } catch (Exception e10) {
                            e = e10;
                            dataStoreUtils = dataStoreUtils2;
                        }
                        try {
                            if (AbstractC4862t.a(dVarB, M.b(String.class))) {
                                S s10 = S.f39781a;
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                            } else if (AbstractC4862t.a(dVarB, M.b(Long.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Boolean.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Integer.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Double.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                            } else if (AbstractC4862t.a(dVarB, M.b(Float.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                            } else {
                                dataStoreUtils = dataStoreUtils2;
                                try {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) i0.f27887a, 6, (Object) null);
                                    mapI = Q.i();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                    mapI = Q.i();
                                }
                            }
                            Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                            AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            mapI = (Map) objA;
                        } catch (Exception e12) {
                            exc = e12;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                            mapI = Q.i();
                        }
                    }
                    Map mapW = Q.w(mapI);
                    AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = T.c(mapW);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        linkedHashMap.put(id2, Boolean.TRUE);
        z1 z1Var2 = this.f27943e;
        DataStoreKey dataStoreKey2 = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    strB = aVar.b(new ge.M(ge.w0.f35762a, C4237h.f35705a), linkedHashMap);
                } catch (Exception e14) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e14, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                    strB = "{}";
                }
                z1Var2.writeData(dataStoreKey2, strB);
            } catch (Exception e15) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e15, false, (InterfaceC6082a) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.E1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.k0.e(id2);
            }
        }, 7, (Object) null);
    }

    public final void e() {
        if (this.f27946h.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.N1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.k0.a(this.f25667a);
                }
            }, 7, (Object) null);
            return;
        }
        final long jNowInSeconds = DateTimeUtils.nowInSeconds();
        Object data = this.f27943e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.Long");
        if (jNowInSeconds - ((Long) data).longValue() >= this.f27941c.m()) {
            this.f27942d.q();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.O1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.k0.a(this.f25672a, jNowInSeconds);
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.f27939a).b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
    }

    public final void f() {
        ((com.braze.events.d) this.f27939a).c(com.braze.events.internal.r.class, new IEventSubscriber() { // from class: c5.A1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.k0.a(this.f25629a, (com.braze.events.internal.r) obj);
            }
        });
        ((com.braze.events.d) this.f27939a).c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: c5.H1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.k0.a(this.f25652a, (com.braze.events.internal.q) obj);
            }
        });
        ((com.braze.events.d) this.f27939a).c(com.braze.events.internal.k.class, new IEventSubscriber() { // from class: c5.I1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.k0.a(this.f25656a, (com.braze.events.internal.k) obj);
            }
        });
        ((com.braze.events.d) this.f27939a).c(com.braze.events.internal.j.class, new IEventSubscriber() { // from class: c5.J1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.k0.a(this.f25659a, (com.braze.events.internal.j) obj);
            }
        });
        ((com.braze.events.d) this.f27939a).c(com.braze.events.internal.d.class, new IEventSubscriber() { // from class: c5.K1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.k0.a(this.f25662a, (com.braze.events.internal.d) obj);
            }
        });
    }

    public final void h() {
        final long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.D1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.k0.a(jNowInSeconds);
            }
        }, 6, (Object) null);
        this.f27943e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(jNowInSeconds));
    }

    public static final String b(k0 k0Var) {
        return "Added new Feature Flags:" + k0Var.f27944f + " to DataStore.";
    }

    public static final String b() {
        return "Clearing Feature Flags.";
    }

    public final void c() {
        final List arrayList;
        List listK;
        z1 z1Var = this.f27943e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = z1Var.readData(dataStoreKey, "");
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
                            listK = (List) aVar.a(new C4231e(FeatureFlag.Companion.serializer()), str);
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.L1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.k0.d();
                }
            }, 6, (Object) null);
            this.f27944f = C4206t.k();
        } else {
            this.f27944f = arrayList;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.M1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.k0.a(arrayList);
                }
            }, 7, (Object) null);
        }
    }

    public static final String e(String str) {
        return "Stored impression logged for Feature Flag with id:" + str + ".";
    }

    public static final void a(k0 k0Var, com.braze.events.internal.d it) {
        AbstractC4862t.e(it, "it");
        if (!it.f27710a.f28171m || it.f27711b.f28171m) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.C1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.k0.g();
            }
        }, 7, (Object) null);
        k0Var.a();
    }

    public static final void a(k0 k0Var, com.braze.events.internal.r it) {
        AbstractC4862t.e(it, "it");
        if (it.f27746a instanceof com.braze.requests.j) {
            k0Var.f27946h.incrementAndGet();
        }
    }

    public static final String d() {
        return "Did not find stored Feature Flags in DataStore.";
    }

    public static final void a(k0 k0Var, com.braze.events.internal.q it) {
        AbstractC4862t.e(it, "it");
        if (it.f27745a instanceof com.braze.requests.j) {
            k0Var.f27946h.decrementAndGet();
        }
    }

    public static final String a(k0 k0Var, long j10) {
        Object data = k0Var.f27943e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.Long");
        return "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. " + ((((Long) data).longValue() - j10) + ((long) k0Var.f27941c.m())) + " seconds remaining until next available flush.";
    }

    public static final void a(k0 k0Var, com.braze.events.internal.k it) {
        AbstractC4862t.e(it, "it");
        k0Var.f27945g.set(true);
        k0Var.h();
    }

    public static final void a(k0 k0Var, com.braze.events.internal.j it) {
        AbstractC4862t.e(it, "it");
        k0Var.f27945g.set(true);
        if (k0Var.f27945g.get()) {
            List list = k0Var.f27944f;
            ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) k0Var.f27940b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }

    public static final String a(k0 k0Var) {
        return "Not refreshing Feature Flags since another " + k0Var.f27946h.get() + " request is currently in-flight.";
    }

    public final void a(final String id2) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map mapI;
        ce.b bVarI;
        AbstractC4862t.e(id2, "id");
        final FeatureFlag featureFlag = (FeatureFlag) C4179C.j0(c(id2));
        if ((featureFlag != null ? featureFlag.getTrackingString() : null) != null) {
            String id3 = featureFlag.getId();
            AbstractC4862t.e(id3, "id");
            z1 z1Var = this.f27943e;
            DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = z1Var.readData(dataStoreKey, "");
                    AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) data;
                    if (F.k0(str)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                            mapI = Q.i();
                        } else {
                            try {
                                Cc.d dVarB = M.b(Boolean.class);
                                try {
                                    if (AbstractC4862t.a(dVarB, M.b(String.class))) {
                                        S s10 = S.f39781a;
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                                    } else if (AbstractC4862t.a(dVarB, M.b(Long.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                                    } else if (AbstractC4862t.a(dVarB, M.b(Boolean.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                                    } else if (AbstractC4862t.a(dVarB, M.b(Integer.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                                    } else if (AbstractC4862t.a(dVarB, M.b(Double.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                                    } else if (AbstractC4862t.a(dVarB, M.b(Float.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                                    } else {
                                        dataStoreUtils = dataStoreUtils2;
                                        try {
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) j0.f27904a, 6, (Object) null);
                                            mapI = Q.i();
                                        } catch (Exception e10) {
                                            e = e10;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                            mapI = Q.i();
                                        }
                                    }
                                    Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                                    AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    mapI = (Map) objA;
                                } catch (Exception e11) {
                                    exc = e11;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                    mapI = Q.i();
                                }
                            } catch (Exception e12) {
                                e = e12;
                                dataStoreUtils = dataStoreUtils2;
                            }
                        }
                        Map mapW = Q.w(mapI);
                        AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = T.c(mapW);
                    }
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            if (!AbstractC4862t.a(linkedHashMap.get(id3), Boolean.TRUE)) {
                com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f28071g.a(featureFlag);
                if (kVarA != null) {
                    this.f27942d.a(kVarA);
                }
                d(featureFlag.getId());
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.P1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.k0.a(featureFlag);
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.B1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.k0.b(id2);
            }
        }, 6, (Object) null);
    }

    public static final String a(FeatureFlag featureFlag) {
        return "Not logging a Feature Flag impression for Feature Flag with id " + featureFlag.getId() + ". The Feature Flag already had an impression logged in the current session";
    }

    public static final String a(long j10) {
        return "Updating last Feature Flags refresh time: " + j10;
    }

    public static final String a(List list) {
        return "Loaded " + list.size() + " Feature Flags from DataStore.";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.F1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.k0.b();
            }
        }, 7, (Object) null);
        this.f27943e.clearData(DataStoreKey.FEATURE_FLAGS);
        this.f27944f = C4206t.k();
        if (this.f27945g.get()) {
            List list = this.f27944f;
            ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) this.f27940b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }
}
