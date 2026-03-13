package com.braze.storage;

import Od.F;
import com.braze.enums.DataStoreKey;
import com.braze.storage.ServerConfigDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import ge.C4231e;
import he.AbstractC4304b;
import i1.C4319d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"com/braze/storage/ServerConfigDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/d;", "mutablePrefs", "Lcom/braze/enums/DataStoreKey;", "key", "Lfc/H;", "migrateBlocklistedList", "(Li1/d;Lk1/d;Lcom/braze/enums/DataStoreKey;)V", "Lk1/h;", "currentData", "migrateBlocklistedLists", "(Li1/d;Lk1/h;)Lk1/h;", "", "SERVER_CONFIG_DATA_STORE_STORAGE", "Ljava/lang/String;", "SERVER_CONFIG_SHARED_PREFS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lg1/i;", "serverConfigDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServerConfigDataStoreProvider$Companion {
    public /* synthetic */ ServerConfigDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    private final void migrateBlocklistedList(C4319d sharedPrefs, C4781d mutablePrefs, final DataStoreKey key) {
        String strB;
        try {
            String strD = sharedPrefs.d(key.getKey(), null);
            if (strD != null && !F.k0(strD)) {
                JSONArray jSONArray = new JSONArray(strD);
                final ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    AbstractC4862t.d(string, "getString(...)");
                    arrayList.add(string);
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
                mutablePrefs.l(AbstractC4788k.g(key.getKey()), strB);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.m0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$4(key, arrayList);
                    }
                }, 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.n0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$5(key);
                }
            }, 7, (Object) null);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.o0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$6(key);
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$4(DataStoreKey dataStoreKey, List list) {
        return "Migrated " + dataStoreKey.getKey() + " with " + list.size() + " items.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$5(DataStoreKey dataStoreKey) {
        return "No data found for " + dataStoreKey.getKey() + ", skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$6(DataStoreKey dataStoreKey) {
        return "Failed to migrate " + dataStoreKey.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$0() {
        return "Starting migration for blocklisted lists";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$1() {
        return "Blocklisted lists already migrated, skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$2() {
        return "Migration for blocklisted lists completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$3() {
        return "Failed to migrate blocklisted lists to DataStore";
    }

    public final AbstractC4785h migrateBlocklistedLists(C4319d sharedPrefs, AbstractC4785h currentData) {
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.i0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$0();
            }
        }, 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.BLOCKLISTED_EVENTS;
        if (!currentData.b(AbstractC4788k.g(dataStoreKey.getKey()))) {
            DataStoreKey dataStoreKey2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES;
            if (!currentData.b(AbstractC4788k.g(dataStoreKey2.getKey()))) {
                DataStoreKey dataStoreKey3 = DataStoreKey.BLOCKLISTED_PURCHASES;
                if (!currentData.b(AbstractC4788k.g(dataStoreKey3.getKey()))) {
                    try {
                        C4781d c4781dD = currentData.d();
                        migrateBlocklistedList(sharedPrefs, c4781dD, dataStoreKey);
                        migrateBlocklistedList(sharedPrefs, c4781dD, dataStoreKey2);
                        migrateBlocklistedList(sharedPrefs, c4781dD, dataStoreKey3);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.j0
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$2();
                            }
                        }, 7, (Object) null);
                        return c4781dD;
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.k0
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$3();
                            }
                        }, 4, (Object) null);
                        return currentData;
                    }
                }
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.l0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$1();
            }
        }, 7, (Object) null);
        return currentData;
    }

    private ServerConfigDataStoreProvider$Companion() {
    }
}
