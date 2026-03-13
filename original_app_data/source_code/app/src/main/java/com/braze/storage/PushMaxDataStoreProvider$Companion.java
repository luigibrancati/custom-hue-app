package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.PushMaxDataStoreProvider$Companion;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"com/braze/storage/PushMaxDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/h;", "currentData", "migratePushMaxStorageToJson", "(Li1/d;Lk1/h;)Lk1/h;", "", "PUSH_MAX_DATA_STORE_STORAGE", "Ljava/lang/String;", "PUSH_MAX_STORAGE_SHARED_PREFS", "PUSH_MAX_METADATA_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushMaxDataStoreProvider$Companion {
    public /* synthetic */ PushMaxDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$3$lambda$1(String str, Object obj) {
        return "Added push max campaign from SharedPreferences key: " + str + " with timestamp: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$3$lambda$2(Object obj) {
        return "Push max campaign value from SharedPreferences: " + obj + " is not a Long and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$5$lambda$4(Map map) {
        return "Migration for push max campaigns completed successfully. Migrated " + map.size() + " campaigns.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$6() {
        return "Failed to migrate push max storage to DataStore.";
    }

    public final AbstractC4785h migratePushMaxStorageToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.Y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$0();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o2.f28513d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.Z
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3$lambda$1(str, value);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o2.f28513d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.a0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3$lambda$2(value);
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
            c4781dD.l(AbstractC4788k.g(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.b0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$5$lambda$4(linkedHashMap);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.c0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$6();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private PushMaxDataStoreProvider$Companion() {
    }
}
