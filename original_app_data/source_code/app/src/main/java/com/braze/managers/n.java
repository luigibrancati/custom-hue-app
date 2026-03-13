package com.braze.managers;

import Od.F;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.IEventSubscriber;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import de.AbstractC3918a;
import gc.Q;
import he.AbstractC4304b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f27952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f27954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27958g;

    public n(b3 serverConfigStorageProvider, com.braze.events.e internalIEventMessenger, GeofenceDataStoreProvider dataStoreProvider) {
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(internalIEventMessenger, "internalIEventMessenger");
        AbstractC4862t.e(dataStoreProvider, "dataStoreProvider");
        this.f27952a = dataStoreProvider;
        ((com.braze.events.d) internalIEventMessenger).c(com.braze.events.internal.y.class, new IEventSubscriber() { // from class: c5.f2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.n.a(this.f25724a, (com.braze.events.internal.y) obj);
            }
        });
        this.f27953b = a();
        this.f27954c = new AtomicBoolean(false);
        Object data = dataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REQUEST, 0L);
        AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.Long");
        this.f27955d = ((Long) data).longValue();
        Object data2 = dataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REPORT, 0L);
        AbstractC4862t.c(data2, "null cannot be cast to non-null type kotlin.Long");
        this.f27956e = ((Long) data2).longValue();
        this.f27957f = serverConfigStorageProvider.t();
        this.f27958g = serverConfigStorageProvider.s();
    }

    public static final String b(long j10, n nVar) {
        return "Geofence request suppressed since only " + j10 + " seconds have passed since the last time geofences were requested (minimum interval: " + nVar.f27957f + ").";
    }

    public static final String c(String str) {
        return "Deleting outdated id " + str + " from re-eligibility list.";
    }

    public static final String d(String str) {
        return "Retaining id " + str + " in re-eligibility list.";
    }

    public final void a(com.braze.models.response.m serverConfig) {
        AbstractC4862t.e(serverConfig, "serverConfig");
        final int i10 = serverConfig.f28163e;
        if (i10 >= 0) {
            this.f27957f = i10;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.r2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.a(i10);
                }
            }, 6, (Object) null);
        }
        final int i11 = serverConfig.f28164f;
        if (i11 >= 0) {
            this.f27958g = i11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.g2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.b(i11);
                }
            }, 6, (Object) null);
        }
    }

    public static final String b() {
        return "Geofences have not been requested for the current session yet. Request is eligible.";
    }

    public static final String c() {
        return "Geofences have already been requested for the current session. Geofence request not eligible.";
    }

    public static final String c(long j10) {
        return "Updating the last successful location request time to: " + j10;
    }

    public final void b(final long j10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.h2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.n.c(j10);
            }
        }, 7, (Object) null);
        this.f27955d = j10;
        this.f27952a.writeData(DataStoreKey.GLOBAL_LAST_REQUEST, Long.valueOf(j10));
    }

    public static final String b(String str) {
        return "Exception trying to parse re-eligibility id: " + str;
    }

    public static final void a(n nVar, com.braze.events.internal.y it) {
        AbstractC4862t.e(it, "it");
        nVar.f27954c.set(false);
    }

    public static final String b(int i10) {
        return "Min time since last geofence report reset via server configuration: " + i10 + ".";
    }

    public final void a(List brazeGeofenceList) {
        Map linkedHashMap;
        Map mapI;
        ce.b bVarI;
        String strB;
        AbstractC4862t.e(brazeGeofenceList, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = brazeGeofenceList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.f27953b.keySet());
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f27952a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
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
                            Cc.d dVarB = M.b(Long.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) m.f27951a, 6, (Object) null);
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
        Map map = linkedHashMap;
        Iterator it2 = hashSet.iterator();
        AbstractC4862t.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            final String str2 = (String) it2.next();
            AbstractC4862t.b(str2);
            if (!linkedHashSet.contains(a(str2))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.p2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.n.c(str2);
                    }
                }, 7, (Object) null);
                this.f27953b.remove(str2);
                map.remove(str2);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.q2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.n.d(str2);
                    }
                }, 7, (Object) null);
            }
        }
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.f27952a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new ge.M(ge.w0.f35762a, ge.Q.f35675a), map);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
                if (map == null && (map instanceof List)) {
                    strB = "[]";
                }
            }
            geofenceDataStoreProvider2.writeData(dataStoreKey2, strB);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
        }
    }

    public final boolean a(boolean z10, long j10) {
        final long j11 = j10 - this.f27955d;
        if (!z10 && this.f27957f > j11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.k2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.b(j11, this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.l2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.a(j11);
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.m2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.a(j11, this);
                }
            }, 7, (Object) null);
        }
        if (this.f27954c.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.n2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.b();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.o2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.n.c();
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String a(long j10) {
        return "Ignoring rate limit for this geofence request. Elapsed time since last request:" + j10;
    }

    public static final String a(long j10, n nVar) {
        return j10 + " seconds have passed since the last time geofences were requested (minimum interval: " + nVar.f27957f + ").";
    }

    public final String a(final String reEligibilityId) {
        AbstractC4862t.e(reEligibilityId, "reEligibilityId");
        try {
            return (String) new Od.o("_").m(reEligibilityId, 2).get(1);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.i2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.b(reEligibilityId);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String a(int i10) {
        return "Min time since last geofence request reset via server configuration: " + i10 + ".";
    }

    public final ConcurrentHashMap a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map mapI;
        Cc.d dVarB;
        ce.b bVarI;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f27952a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
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
                            dVarB = M.b(Long.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) k.f27938a, 6, (Object) null);
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
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            final String str2 = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            n nVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) nVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.j2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.n.a(this.f25739a, str2);
                }
            }, 7, (Object) null);
            concurrentHashMap.put(str2, Long.valueOf(jLongValue));
            this = nVar;
        }
        return concurrentHashMap;
    }

    public static final String a(n nVar, String str) {
        return "Retrieving geofence id " + nVar.a(str) + " eligibility information from local storage.";
    }
}
