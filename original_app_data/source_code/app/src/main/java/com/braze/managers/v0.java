package com.braze.managers;

import Od.F;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import de.AbstractC3918a;
import fc.C4015H;
import gc.Q;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import org.json.JSONException;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f27999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f28000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f28001c;

    public v0(Context context, String apiKey) {
        Map linkedHashMap;
        Map mapI;
        ce.b bVarI;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f27999a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.f28000b = arrayList;
        h2 h2Var = new h2(context, apiKey);
        this.f28001c = h2Var;
        reentrantLock.lock();
        try {
            arrayList.clear();
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = h2Var.readData(dataStoreKey, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) s0.f27990a, 6, (Object) null);
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
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                this.f28000b.add(new com.braze.models.push.a((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(List list) {
        return "Re-adding PDEs to storage: " + list;
    }

    public final void b(final ArrayList events) {
        AbstractC4862t.e(events, "events");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.r3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.v0.a(events);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = this.f27999a;
        reentrantLock.lock();
        try {
            this.f28000b.addAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(final String pushCampaignId) {
        Map linkedHashMap;
        Map mapI;
        ce.b bVarI;
        String strB;
        AbstractC4862t.e(pushCampaignId, "pushCampaignId");
        ReentrantLock reentrantLock = this.f27999a;
        reentrantLock.lock();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.t3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.v0.b(pushCampaignId);
                }
            }, 7, (Object) null);
            long jNowInSeconds = DateTimeUtils.nowInSeconds();
            h2 h2Var = this.f28001c;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = h2Var.readData(dataStoreKey, "");
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
                                    try {
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) t0.f27994a, 6, (Object) null);
                                        mapI = Q.i();
                                    } catch (Exception e10) {
                                        e = e10;
                                        dataStoreUtils = dataStoreUtils;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                        mapI = Q.i();
                                    }
                                }
                                Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                                AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                mapI = (Map) objA;
                            } catch (Exception e11) {
                                e = e11;
                            }
                        }
                        Map mapW = Q.w(mapI);
                        AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = T.c(mapW);
                    }
                } catch (Exception e12) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            linkedHashMap.put(pushCampaignId, Long.valueOf(jNowInSeconds));
            h2 h2Var2 = this.f28001c;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        strB = aVar.b(new ge.M(ge.w0.f35762a, ge.Q.f35675a), linkedHashMap);
                    } catch (Exception e13) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = "{}";
                    }
                    h2Var2.writeData(dataStoreKey2, strB);
                } catch (Exception e14) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e14, false, (InterfaceC6082a) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
                }
            }
            this.f28000b.add(new com.braze.models.push.a(pushCampaignId, jNowInSeconds));
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b(String str) {
        return "Adding push campaign to storage with uid " + str;
    }

    public final void a(ArrayList events) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map mapI;
        Cc.d dVarB;
        ce.b bVarI;
        String strB;
        AbstractC4862t.e(events, "events");
        ReentrantLock reentrantLock = this.f27999a;
        reentrantLock.lock();
        try {
            h2 h2Var = this.f28001c;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = h2Var.readData(dataStoreKey, "");
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) u0.f27996a, 6, (Object) null);
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
            Map map = linkedHashMap;
            Iterator it = events.iterator();
            while (it.hasNext()) {
                final com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                v0 v0Var = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) v0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.s3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.v0.a(aVar);
                    }
                }, 7, (Object) null);
                map.remove(aVar.f());
                this = v0Var;
            }
            v0 v0Var2 = this;
            h2 h2Var2 = v0Var2.f28001c;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                        aVar2.d();
                        strB = aVar2.b(new ge.M(ge.w0.f35762a, ge.Q.f35675a), map);
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e14, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = "{}";
                        if (map == null && (map instanceof List)) {
                            strB = "[]";
                        }
                    }
                    h2Var2.writeData(dataStoreKey2, strB);
                } catch (Exception e15) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e15, false, (InterfaceC6082a) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
                }
            }
            v0Var2.f28000b.removeAll(events);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(com.braze.models.push.a aVar) throws JSONException {
        return "Clearing PDE from storage with uid " + aVar.f();
    }
}
