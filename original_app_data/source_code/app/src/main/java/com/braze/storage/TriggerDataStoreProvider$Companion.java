package com.braze.storage;

import Od.F;
import com.braze.enums.DataStoreKey;
import com.braze.storage.TriggerDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import ge.C4231e;
import ge.M;
import ge.Q;
import he.AbstractC4304b;
import i1.C4319d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/TriggerDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/h;", "currentData", "migrateTriggersStorageToJson", "(Li1/d;Lk1/h;)Lk1/h;", "migrateTriggersReeligibilityToJson", "", "TRIGGERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "TRIGGERS_STORAGE_SHARED_PREFS", "TRIGGERS_REELIGIBILITY_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriggerDataStoreProvider$Companion {
    public /* synthetic */ TriggerDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$11$lambda$10(String str) {
        return "Added timestamp for trigger:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$13$lambda$12() {
        return "Migration for " + DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey() + " completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$14() {
        return "Failed to migrate triggers reeligibility map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$8() {
        return "Starting migration for key: " + DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$9() {
        return "Migration already completed for triggered actions impression maps. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.TRIGGERED_ACTIONS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$1() {
        return "Migration already completed for triggered actions. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4$lambda$2(String str) {
        return "Added triggered action from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4$lambda$3(String str, Object obj) {
        return "Triggered action with key:" + str + " and value:" + obj + " from SharedPreferences has an invalid value and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$6$lambda$5(List list) {
        return "Migration for triggered actions completed successfully. Migrated " + list.size() + " actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$7() {
        return "Failed to migrate triggered actions to DataStore.";
    }

    public final AbstractC4785h migrateTriggersReeligibilityToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.t0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$8();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.v0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$9();
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m3.f28493d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.w0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$11$lambda$10(str);
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
            c4781dD.l(AbstractC4788k.g(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.x0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$13$lambda$12();
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.y0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$14();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final AbstractC4785h migrateTriggersStorageToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.z0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$0();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.TRIGGERED_ACTIONS.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.A0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$1();
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (!(value instanceof String) || F.k0((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m3.f28493d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.C0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4$lambda$3(str, value);
                        }
                    }, 7, (Object) null);
                } else {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m3.f28493d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.B0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4$lambda$2(str);
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), arrayList);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = arrayList instanceof Map ? "{}" : "[]";
            }
            C4781d c4781dD = currentData.d();
            c4781dD.l(AbstractC4788k.g(DataStoreKey.TRIGGERED_ACTIONS.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.D0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$6$lambda$5(arrayList);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.u0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$7();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private TriggerDataStoreProvider$Companion() {
    }
}
