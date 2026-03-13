package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import gc.C4179C;
import gc.U;
import ge.C4231e;
import he.AbstractC4304b;
import i1.C4319d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/ContentCardsDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/h;", "currentData", "migrateContentCardsStorageToJson", "(Li1/d;Lk1/h;)Lk1/h;", "migrateContentCardsMetadataToJson", "", "CONTENT_CARDS_DATA_STORE_STORAGE", "Ljava/lang/String;", "CARD_CACHE_SHARED_PREFS", "METADATA_CACHE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentCardsDataStoreProvider$Companion {
    public /* synthetic */ ContentCardsDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$7() {
        return "Starting migration for Content Cards metadata keys.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$8() {
        return "Metadata migration completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$9() {
        return "Failed to migrate content cards metadata to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.CONTENT_CARDS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3$lambda$1(String str) {
        return "Added content card from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3$lambda$2(Object obj) {
        return "Content card value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$5$lambda$4(List list) {
        return "Migration for content cards completed successfully. Migrated " + list.size() + " cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$6() {
        return "Failed to migrate content cards storage to DataStore.";
    }

    public final AbstractC4785h migrateContentCardsMetadataToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        String strB2;
        String str = "41.0.0";
        String strB3 = "[]";
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.o
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$7();
            }
        }, 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (currentData.b(AbstractC4788k.g(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            C4781d c4781dD = currentData.d();
            Set setE = sharedPrefs.e(dataStoreKey.getKey(), U.d());
            if (setE == null) {
                setE = U.d();
            }
            List listV0 = C4179C.V0(setE);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            c4781dD.l(AbstractC4788k.g(DataStoreKey.DISMISSED_CARDS.getKey()), strB);
            Set setE2 = sharedPrefs.e(DataStoreKey.EXPIRED_CARDS.getKey(), U.d());
            if (setE2 == null) {
                setE2 = U.d();
            }
            List listV02 = C4179C.V0(setE2);
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                aVar2.d();
                strB2 = aVar2.b(new C4231e(ge.w0.f35762a), listV02);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB2 = ((listV02 instanceof Map) || listV02 == null) ? "{}" : "[]";
            }
            c4781dD.l(AbstractC4788k.g(DataStoreKey.EXPIRED_CARDS.getKey()), strB2);
            Set setE3 = sharedPrefs.e(DataStoreKey.TEST_CARDS.getKey(), U.d());
            if (setE3 == null) {
                setE3 = U.d();
            }
            List listV03 = C4179C.V0(setE3);
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar3 = AbstractC4304b.f36582d;
                aVar3.d();
                strB3 = aVar3.b(new C4231e(ge.w0.f35762a), listV03);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                if ((listV03 instanceof Map) || listV03 == null) {
                    strB3 = "{}";
                }
            }
            c4781dD.l(AbstractC4788k.g(DataStoreKey.TEST_CARDS.getKey()), strB3);
            DataStoreKey dataStoreKey2 = DataStoreKey.LAST_CARD_UPDATED_AT;
            c4781dD.l(AbstractC4788k.f(dataStoreKey2.getKey()), Long.valueOf(sharedPrefs.c(dataStoreKey2.getKey(), 0L)));
            DataStoreKey dataStoreKey3 = DataStoreKey.LAST_FULL_CARD_SYNC_AT;
            c4781dD.l(AbstractC4788k.f(dataStoreKey3.getKey()), Long.valueOf(sharedPrefs.c(dataStoreKey3.getKey(), 0L)));
            DataStoreKey dataStoreKey4 = DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
            c4781dD.l(AbstractC4788k.f(dataStoreKey4.getKey()), Long.valueOf(sharedPrefs.c(dataStoreKey4.getKey(), 0L)));
            DataStoreKey dataStoreKey5 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
            String strD = sharedPrefs.d(dataStoreKey5.getKey(), "41.0.0");
            if (strD != null) {
                str = strD;
            }
            c4781dD.l(AbstractC4788k.g(dataStoreKey5.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$8();
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e13, false, new InterfaceC6082a() { // from class: r5.q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$9();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final AbstractC4785h migrateContentCardsStorageToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$0();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.CONTENT_CARDS.getKey()))) {
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m.f28483d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.k
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3$lambda$1(str);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m.f28483d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.l
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3$lambda$2(value);
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
            c4781dD.l(AbstractC4788k.g(DataStoreKey.CONTENT_CARDS.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$5$lambda$4(arrayList);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$6();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private ContentCardsDataStoreProvider$Companion() {
    }
}
