package com.braze.triggers.managers;

import Od.F;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.k0;
import com.braze.storage.l0;
import com.braze.storage.m3;
import com.braze.storage.q0;
import com.braze.storage.r0;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.i;
import de.AbstractC3918a;
import gc.C4207u;
import ge.M;
import ge.Q;
import ge.w0;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4847d;
import kotlin.jvm.internal.C4855l;
import kotlin.jvm.internal.C4856m;
import kotlin.jvm.internal.C4861s;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.w;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3 f28754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f28755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f28756c;

    public h(m3 triggerDataStoreProvider) {
        AbstractC4862t.e(triggerDataStoreProvider, "triggerDataStoreProvider");
        this.f28754a = triggerDataStoreProvider;
        this.f28755b = a();
        this.f28756c = new LinkedHashMap();
    }

    public static final String b(String str) {
        return "Deleting outdated triggered action id " + str + " from stored re-eligibility list.";
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return "Triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " no longer eligible due to having been triggered in the past and is only eligible once.";
    }

    public final boolean a(final com.braze.triggers.actions.g triggeredAction) {
        AbstractC4862t.e(triggeredAction, "triggeredAction");
        final com.braze.triggers.config.b bVar = triggeredAction.f28670b.f28699f;
        if (bVar.f28693a == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.u0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.h.a(triggeredAction);
                }
            }, 7, (Object) null);
            return true;
        }
        if (!this.f28755b.containsKey(triggeredAction.f28669a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.v0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.h.b(triggeredAction);
                }
            }, 7, (Object) null);
            return true;
        }
        if (bVar.e()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.k0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.h.c(triggeredAction);
                }
            }, 7, (Object) null);
            return false;
        }
        Long l10 = (Long) this.f28755b.get(triggeredAction.f28669a);
        final long jLongValue = l10 != null ? l10.longValue() : 0L;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() + ((long) triggeredAction.f28670b.f28697d);
        Integer numD = bVar.d();
        if (jNowInSeconds >= ((long) (numD != null ? numD.intValue() : 0)) + jLongValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.l0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.h.b(jLongValue, bVar);
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.m0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.h.a(jLongValue, bVar);
            }
        }, 7, (Object) null);
        return false;
    }

    public final void d(com.braze.triggers.actions.a triggeredAction) {
        String strB;
        AbstractC4862t.e(triggeredAction, "triggeredAction");
        final com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) triggeredAction;
        if (gVar.d().e().e()) {
            this.f28755b.remove(gVar.c());
        } else {
            Long l10 = (Long) this.f28756c.get(gVar.c());
            final long jLongValue = l10 != null ? l10.longValue() : 0L;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.p0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.h.b(gVar, jLongValue);
                }
            }, 7, (Object) null);
            this.f28755b.put(gVar.c(), Long.valueOf(jLongValue));
        }
        m3 m3Var = this.f28754a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.f28755b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new M(w0.f35762a, Q.f35675a), map);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) i.f28638a, 4, (Object) null);
                strB = "{}";
                if (map == null && (map instanceof List)) {
                    strB = "[]";
                }
            }
            m3Var.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String b(com.braze.triggers.actions.a aVar) {
        return "Triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " always eligible via never having been triggered. Returning true for eligibility status";
    }

    public static final String c(String str) {
        return "Retrieving triggered action id " + str + " eligibility information from DataStore.";
    }

    public static final String b(long j10, com.braze.triggers.config.a aVar) {
        return "Trigger action is re-eligible for display since " + (DateTimeUtils.nowInSeconds() - j10) + " seconds have passed since the last time it was triggered (minimum interval: " + ((com.braze.triggers.config.b) aVar).d() + ").";
    }

    public static final String b(com.braze.triggers.actions.a aVar, long j10) {
        return "Resetting re-eligibility for action Id " + ((com.braze.triggers.actions.g) aVar).c() + " to " + j10;
    }

    public static final String b(Map map) {
        return "Retrieved " + map.size() + " trigger re-eligibility entries from DataStore";
    }

    public static final String b() {
        return "No trigger re-eligibility information found in DataStore";
    }

    public static final String a(String str) {
        return "Retaining triggered action " + str + " in re-eligibility list.";
    }

    public static final String a(Map map) {
        return "Successfully updated re-eligibility map in DataStore with " + map.size() + " entries";
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " always eligible via configuration. Returning true for eligibility status";
    }

    public static final String a(long j10, com.braze.triggers.config.a aVar) {
        return "Trigger action is not re-eligible for display since only " + (DateTimeUtils.nowInSeconds() - j10) + " seconds have passed since the last time it was triggered (minimum interval: " + ((com.braze.triggers.config.b) aVar).d() + ").";
    }

    public final void a(final com.braze.triggers.actions.h triggeredAction, final long j10) {
        String strB;
        AbstractC4862t.e(triggeredAction, "triggeredAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.q0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.h.a(triggeredAction, j10);
            }
        }, 7, (Object) null);
        LinkedHashMap linkedHashMap = this.f28756c;
        String strC = triggeredAction.c();
        Long l10 = (Long) this.f28755b.get(triggeredAction.c());
        linkedHashMap.put(strC, Long.valueOf(l10 != null ? l10.longValue() : 0L));
        this.f28755b.put(triggeredAction.c(), Long.valueOf(j10));
        m3 m3Var = this.f28754a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.f28755b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new M(w0.f35762a, Q.f35675a), map);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) i.f28638a, 4, (Object) null);
                strB = "{}";
                if (map == null && (map instanceof List)) {
                    strB = "[]";
                }
            }
            m3Var.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j10) {
        return "Updating re-eligibility for action Id " + ((com.braze.triggers.actions.g) aVar).c() + " to time " + j10 + ".";
    }

    public final Map a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map mapI;
        Cc.d dVarB;
        ce.b bVarI;
        m3 m3Var = this.f28754a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = m3Var.readData(dataStoreKey, "");
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
                            dVarB = kotlin.jvm.internal.M.b(Long.class);
                        } catch (Exception e10) {
                            e = e10;
                            dataStoreUtils = dataStoreUtils2;
                        }
                        try {
                            if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(String.class))) {
                                S s10 = S.f39781a;
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(s10), AbstractC3918a.G(s10));
                            } else if (AbstractC4862t.a(dVarB, kotlin.jvm.internal.M.b(Long.TYPE))) {
                                bVarI = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), AbstractC3918a.E(w.f39797a));
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) g.f28753a, 6, (Object) null);
                                    mapI = gc.Q.i();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                                    mapI = gc.Q.i();
                                }
                            }
                            Object objA = AbstractC4304b.f36582d.a(bVarI, str);
                            AbstractC4862t.c(objA, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            mapI = (Map) objA;
                        } catch (Exception e12) {
                            exc = e12;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) exc, false, (InterfaceC6082a) new com.braze.support.f(str), 4, (Object) null);
                            mapI = gc.Q.i();
                        }
                    }
                    Map mapW = gc.Q.w(mapI);
                    AbstractC4862t.c(mapW, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = T.c(mapW);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        final Map map = linkedHashMap;
        if (!map.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.j0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.h.b(map);
                }
            }, 7, (Object) null);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                final String str2 = (String) ((Map.Entry) it.next()).getKey();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.n0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.h.c(str2);
                    }
                }, 7, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.o0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.h.b();
                }
            }, 7, (Object) null);
        }
        return map;
    }

    public final void a(List triggeredActions) {
        String strB;
        h hVar = this;
        AbstractC4862t.e(triggeredActions, "triggeredActions");
        ArrayList arrayList = new ArrayList(C4207u.v(triggeredActions, 10));
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next())).c());
        }
        Map map = hVar.f28755b;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            final String str = (String) entry.getKey();
            boolean zContains = arrayList.contains(str);
            if (zContains) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.r0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.h.a(str);
                    }
                }, 7, (Object) null);
                hVar = this;
            } else {
                hVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.s0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.h.b(str);
                    }
                }, 7, (Object) null);
            }
            if (zContains) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m3 m3Var = hVar.f28754a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    strB = aVar.b(new M(w0.f35762a, Q.f35675a), linkedHashMap);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) i.f28638a, 4, (Object) null);
                    strB = "{}";
                }
                m3Var.writeData(dataStoreKey, strB);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new r0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.t0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.h.a(linkedHashMap);
            }
        }, 7, (Object) null);
    }
}
