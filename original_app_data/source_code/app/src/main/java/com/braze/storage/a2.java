package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import ge.C4231e;
import ge.M;
import ge.Q;
import he.AbstractC4304b;
import i1.C4319d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {
    public static final String b() {
        return "Migration for " + DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey() + " completed successfully";
    }

    public static final String c() {
        return "Failed to migrate individual reeligibility map to DataStore.";
    }

    public static final String d(String str) {
        return "Starting migration for key: " + str;
    }

    public static final String e(String str) {
        return "Added geofence from SharedPreferences key: " + str;
    }

    public static final String f(String str) {
        return "Added timestamp for geofence:" + str + " from SharedPreferences";
    }

    public final AbstractC4785h a(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.H0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.a2.a();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.I0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.a2.f(str);
                        }
                    }, 7, (Object) null);
                }
            }
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
            c4781dD.l(AbstractC4788k.g(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.J0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.a2.b();
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.K0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.a2.c();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b(String str) {
        return "Migration for " + str + " completed successfully";
    }

    public static final String c(String str) {
        return "Failed to migrate " + str + " list to DataStore.";
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey();
    }

    public final AbstractC4785h a(C4319d sharedPrefs, AbstractC4785h currentData, final String key) {
        String strB;
        final BrazeGeofence brazeGeofence;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        AbstractC4862t.e(key, "key");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.L0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.a2.d(key);
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(key))) {
            return currentData;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.M0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.a2.e(str);
                        }
                    }, 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (final String str2 : arrayList) {
                try {
                    AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                    aVar.d();
                    brazeGeofence = (BrazeGeofence) aVar.a(BrazeGeofence.Companion.serializer(), str2);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.N0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.a2.a(brazeGeofence);
                        }
                    }, 7, (Object) null);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.O0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.storage.a2.a(str2);
                        }
                    }, 4, (Object) null);
                    brazeGeofence = null;
                }
                if (brazeGeofence != null) {
                    arrayList2.add(brazeGeofence);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                aVar2.d();
                strB = aVar2.b(new C4231e(BrazeGeofence.Companion.serializer()), arrayList2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = arrayList2 instanceof Map ? "{}" : "[]";
            }
            C4781d c4781dD = currentData.d();
            c4781dD.l(AbstractC4788k.g(key), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.P0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.a2.b(key);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e12, false, new InterfaceC6082a() { // from class: r5.Q0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.a2.c(key);
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a(BrazeGeofence brazeGeofence) {
        return "Successfully decoded geofence: " + brazeGeofence.getId();
    }

    public static final String a(String str) {
        return "Failed to decode BrazeGeofence from JSON: " + str;
    }
}
