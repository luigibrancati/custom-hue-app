package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import ge.M;
import ge.Q;
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
public final class i2 {
    public static final String b() {
        return "Push ID storage already migrated to DataStore";
    }

    public static final String c() {
        return "Migration for push ID map completed successfully";
    }

    public static final String d() {
        return "Failed to migrate push ID storage to DataStore.";
    }

    public final AbstractC4785h a(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.x1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.i2.a();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.PUSH_ID_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.y1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.i2.b();
                }
            }, 6, (Object) null);
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k2.f28476d, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.z1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.i2.a(str, value);
                        }
                    }, 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.A1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.i2.a(linkedHashMap);
                }
            }, 7, (Object) null);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new M(ge.w0.f35762a, Q.f35675a), linkedHashMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            C4781d c4781dD = currentData.d();
            c4781dD.l(AbstractC4788k.g(DataStoreKey.PUSH_ID_MAP.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.B1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.i2.c();
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.C1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.i2.d();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.PUSH_ID_MAP.getKey();
    }

    public static final String a(String str, Object obj) {
        return "Migrating push id: " + str + " with timestamp: " + obj;
    }

    public static final String a(Map map) {
        return "Migrated " + map.size() + " push identifiers to DataStore";
    }
}
