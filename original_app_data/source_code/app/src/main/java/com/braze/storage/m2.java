package com.braze.storage;

import Od.F;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import de.AbstractC3918a;
import gc.Q;
import ge.M;
import he.AbstractC4304b;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
public final class m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f28491b = TimeUnit.DAYS.toSeconds(45);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f28492a;

    public m2(Context context, String str, String str2) {
        AbstractC4862t.e(context, "context");
        this.f28492a = new k2(context, str2, str);
        b();
    }

    public static final String b(String str) {
        return "Push dedupe id " + str + " has already been seen. Returning false.";
    }

    public static final String c() {
        return "Push dedupe id is blank. Returning true.";
    }

    public final boolean a(final String pushId) {
        String strB;
        AbstractC4862t.e(pushId, "pushId");
        if (F.k0(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.S1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.m2.c();
                }
            }, 7, (Object) null);
            return true;
        }
        AbstractC4862t.e(pushId, "pushId");
        if (a().containsKey(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.T1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.m2.b(pushId);
                }
            }, 7, (Object) null);
            return false;
        }
        b();
        AbstractC4862t.e(pushId, "pushId");
        Map mapW = Q.w(a());
        mapW.put(pushId, Long.valueOf(DateTimeUtils.nowInSeconds()));
        k2 k2Var = this.f28492a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    strB = aVar.b(new M(ge.w0.f35762a, ge.Q.f35675a), mapW);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                    strB = "{}";
                }
                k2Var.writeData(dataStoreKey, strB);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new r0(dataStoreKey), 8, (Object) null);
            }
        }
        return true;
    }

    public final void b() {
        String strB;
        final long jNowInSeconds = DateTimeUtils.nowInSeconds() - f28491b;
        Map mapW = Q.w(a());
        Iterator it = mapW.entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).longValue() < jNowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.R1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.m2.a(entry, jNowInSeconds);
                    }
                }, 6, (Object) null);
                it.remove();
            }
        }
        k2 k2Var = this.f28492a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new M(ge.w0.f35762a, ge.Q.f35675a), mapW);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            k2Var.writeData(dataStoreKey, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Map.Entry entry, long j10) {
        return "Evicting push id key " + entry.getKey() + " based on cutoff: " + j10;
    }

    public final Map a() {
        Map mapI;
        ce.b bVarI;
        k2 k2Var = this.f28492a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new k0(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object data = k2Var.readData(dataStoreKey, "");
            AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
            String str = (String) data;
            if (F.k0(str)) {
                return new LinkedHashMap();
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                mapI = Q.i();
            } else {
                try {
                    Cc.d dVarB = kotlin.jvm.internal.M.b(Long.class);
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
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) l2.f28482a, 6, (Object) null);
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
            return T.c(mapW);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new l0(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }
}
