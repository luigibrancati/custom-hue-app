package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.SessionStorageDataStoreProvider$Companion;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/SessionStorageDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/h;", "currentData", "migrateSealedSessionsMapToJson", "(Li1/d;Lk1/h;)Lk1/h;", "", "SESSION_STORAGE", "Ljava/lang/String;", "SESSION_STORAGE_SHAREDPREFS_NAME", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionStorageDataStoreProvider$Companion {
    public /* synthetic */ SessionStorageDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.SESSION_STORAGE_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$2$lambda$1(String str) {
        return "Migrated sealed session with key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$4$lambda$3(Map map) {
        return "Migration for sealed sessions completed. Migrated " + map.size() + " sessions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$5() {
        return "Failed to migrate sealed sessions map to DataStore.";
    }

    public final AbstractC4785h migrateSealedSessionsMapToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.p0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$0();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.SESSION_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!AbstractC4862t.a(str, DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey()) && (value instanceof String)) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d3.f28412d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.q0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$2$lambda$1(str);
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
            c4781dD.l(AbstractC4788k.g(DataStoreKey.SESSION_STORAGE_MAP.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.r0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$4$lambda$3(linkedHashMap);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.s0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$5();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private SessionStorageDataStoreProvider$Companion() {
    }
}
