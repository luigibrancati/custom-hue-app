package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import ge.M;
import he.AbstractC4304b;
import i1.C4319d;
import java.util.LinkedHashMap;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public static final String b() {
        return "Failed to migrate event storage to DataStore.";
    }

    public final AbstractC4785h a(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.L1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.l1.a();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.EVENT_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n1.f28503b, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.M1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.l1.a(str);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n1.f28503b, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.N1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.l1.a(value);
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                ge.w0 w0Var = ge.w0.f35762a;
                strB = aVar.b(new M(w0Var, w0Var), linkedHashMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            C4781d c4781dD = currentData.d();
            c4781dD.l(AbstractC4788k.g(DataStoreKey.EVENT_STORAGE_MAP.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.O1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.l1.a(linkedHashMap);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.P1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.l1.b();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.EVENT_STORAGE_MAP.getKey();
    }

    public static final String a(String str) {
        return "Added event from SharedPreferences key: " + str;
    }

    public static final String a(Object obj) {
        return "Event value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    public static final String a(Map map) {
        return "Migration for events completed successfully. Migrated " + map.size() + " events.";
    }
}
