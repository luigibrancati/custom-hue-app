package com.braze.storage;

import Od.C;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import fc.AbstractC4040w;
import fc.C4034q;
import ge.M;
import ge.Q;
import he.AbstractC4304b;
import i1.C4319d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static final String b() {
        return "Starting migration for endpoint metadata";
    }

    public static final String c() {
        return "Failed to migrate endpoint metadata to DataStore.";
    }

    public final AbstractC4785h a(C4319d sharedPrefs, AbstractC4785h currentData) {
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.V0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.b1.b();
            }
        }, 7, (Object) null);
        AbstractC4785h.a aVarG = AbstractC4788k.g(DataStoreKey.ENDPOINT_LAST_REQUEST_MAP.getKey());
        AbstractC4785h.a aVarG2 = AbstractC4788k.g(DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP.getKey());
        if (currentData.b(aVarG) && currentData.b(aVarG2)) {
            return currentData;
        }
        try {
            C4034q c4034qA = a(sharedPrefs);
            return a(currentData, aVarG, aVarG2, (Map) c4034qA.a(), (Map) c4034qA.b());
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.W0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b1.c();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b(String str) {
        return "Migrated last request timestamp key: " + str;
    }

    public static C4034q a(C4319d c4319d) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map mapB = c4319d.b();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : mapB.entrySet()) {
            if (entry.getValue() instanceof Long) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            b1 b1Var = j1.f28468b;
            AbstractC4862t.c(value, "null cannot be cast to non-null type kotlin.Long");
            b1Var.a(str, ((Long) value).longValue(), linkedHashMap, linkedHashMap2);
        }
        return AbstractC4040w.a(linkedHashMap, linkedHashMap2);
    }

    public final void a(final String str, long j10, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (C.P(str, "uri-at-", false, 2, null)) {
            linkedHashMap2.put(str, Long.valueOf(j10));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.X0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b1.a(str);
                }
            }, 7, (Object) null);
        } else if (C.P(str, "uri-", false, 2, null)) {
            linkedHashMap.put(str, Long.valueOf(j10));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.Y0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.b1.b(str);
                }
            }, 7, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Migrated attempt count key: " + str;
    }

    public static C4781d a(AbstractC4785h abstractC4785h, AbstractC4785h.a aVar, AbstractC4785h.a aVar2, Map map, Map map2) {
        AbstractC4785h.a aVar3;
        String strB;
        C4781d c4781dD = abstractC4785h.d();
        String strB2 = "[]";
        if (!abstractC4785h.b(aVar)) {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar4 = AbstractC4304b.f36582d;
                aVar4.d();
                strB = aVar4.b(new M(ge.w0.f35762a, Q.f35675a), map);
                aVar3 = aVar;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                if (map == null && (map instanceof List)) {
                    aVar3 = aVar;
                    strB = "[]";
                } else {
                    aVar3 = aVar;
                    strB = "{}";
                }
            }
            c4781dD.l(aVar3, strB);
        }
        if (!abstractC4785h.b(aVar2)) {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar5 = AbstractC4304b.f36582d;
                aVar5.d();
                strB2 = aVar5.b(new M(ge.w0.f35762a, Q.f35675a), map2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                if (map2 != null || !(map2 instanceof List)) {
                    strB2 = "{}";
                }
            }
            c4781dD.l(aVar2, strB2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.Z0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.b1.a();
            }
        }, 7, (Object) null);
        return c4781dD;
    }

    public static final String a() {
        return "Endpoint metadata migration completed successfully";
    }
}
