package com.braze.managers;

import Od.F;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.IEventSubscriber;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.storage.o2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import de.AbstractC3918a;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import ge.M;
import ge.Q;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f28027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2 f28028b;

    public y0(Context context, String apiKey, String str, com.braze.events.d internalEventPublisher, b3 serverConfigStorageProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f28027a = serverConfigStorageProvider;
        this.f28028b = new o2(context, str, apiKey);
        internalEventPublisher.c(com.braze.events.internal.p.class, new IEventSubscriber() { // from class: c5.V3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.y0.a(this.f25686a, (com.braze.events.internal.p) obj);
            }
        });
        c();
    }

    public static final void a(y0 y0Var, com.braze.events.internal.p it) {
        AbstractC4862t.e(it, "it");
        y0Var.f28028b.writeData(DataStoreKey.PUSH_MAX_LAST_UPDATE, Long.valueOf(it.f27744a));
    }

    public static final String b(String str) {
        return "Adding push campaign to storage with uid " + str;
    }

    public final void c() {
        String strB;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - TimeUnit.DAYS.toSeconds(45L);
        final List listA = a();
        final ArrayList<w0> arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((w0) obj).b() >= jNowInSeconds) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != listA.size()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.W3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.y0.a(listA, arrayList);
                }
            }, 7, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(arrayList, 10)), 16));
            for (w0 w0Var : arrayList) {
                C4034q c4034qA = AbstractC4040w.a(w0Var.a(), Long.valueOf(w0Var.b()));
                linkedHashMap.put(c4034qA.e(), c4034qA.f());
            }
            if (linkedHashMap.isEmpty()) {
                this.f28028b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                return;
            }
            o2 o2Var = this.f28028b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
                return;
            }
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    strB = aVar.b(new M(ge.w0.f35762a, Q.f35675a), linkedHashMap);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                    strB = "{}";
                }
                o2Var.writeData(dataStoreKey, strB);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
            }
        }
    }

    public static final String b(String str, long j10) {
        return "Adding push campaign to storage with uid " + str + " and time " + j10;
    }

    public static final String b() {
        return "Error reading push max campaign data from DataStore.";
    }

    public final void a(final String pushCampaign) {
        AbstractC4862t.e(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Y3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.y0.b(pushCampaign);
            }
        }, 7, (Object) null);
        if (F.k0(pushCampaign)) {
            return;
        }
        a(pushCampaign, DateTimeUtils.nowInSeconds());
    }

    public static final String a(List list, List list2) {
        return "Pruning " + (list.size() - list2.size()) + " expired campaigns";
    }

    public final void a(final String pushCampaign, final long j10) {
        String strB;
        AbstractC4862t.e(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Z3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.y0.b(pushCampaign, j10);
            }
        }, 7, (Object) null);
        List<w0> listA = a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(listA, 10)), 16));
        for (w0 w0Var : listA) {
            C4034q c4034qA = AbstractC4040w.a(w0Var.a(), Long.valueOf(w0Var.b()));
            linkedHashMap.put(c4034qA.e(), c4034qA.f());
        }
        Map mapW = gc.Q.w(linkedHashMap);
        mapW.put(pushCampaign, Long.valueOf(j10));
        o2 o2Var = this.f28028b;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new M(ge.w0.f35762a, Q.f35675a), mapW);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            o2Var.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
        }
    }

    public final List a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map mapI;
        ce.b bVarI;
        try {
            o2 o2Var = this.f28028b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = o2Var.readData(dataStoreKey, "");
                    AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) data;
                    if (F.k0(str)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                            mapI = gc.Q.i();
                        } else {
                            try {
                                Cc.d dVarB = kotlin.jvm.internal.M.b(Long.class);
                                try {
                                    if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(String.class))) {
                                        S s10 = S.f39781a;
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                                    } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Long.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));
                                    } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Boolean.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.y(C4847d.f39786a));
                                    } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Integer.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.D(C4861s.f39796a));
                                    } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Double.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.B(C4855l.f39794a));
                                    } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Float.TYPE))) {
                                        bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.C(C4856m.f39795a));
                                    } else {
                                        dataStoreUtils = dataStoreUtils2;
                                        try {
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) x0.f28025a, 6, (Object) null);
                                            mapI = gc.Q.i();
                                        } catch (Exception e10) {
                                            e = e10;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                            mapI = gc.Q.i();
                                        }
                                    }
                                    Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                                    AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    mapI = (Map) objA;
                                } catch (Exception e11) {
                                    exc = e11;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                    mapI = gc.Q.i();
                                }
                            } catch (Exception e12) {
                                e = e12;
                                dataStoreUtils = dataStoreUtils2;
                            }
                        }
                        Map mapW = gc.Q.w(mapI);
                        AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = T.c(mapW);
                    }
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new w0((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            return arrayList;
        } catch (Exception e14) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e14, false, new InterfaceC6082a() { // from class: c5.X3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.y0.b();
                }
            }, 4, (Object) null);
            return C4206t.k();
        }
    }
}
