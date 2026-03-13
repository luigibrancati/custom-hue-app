package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.BannersDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import ge.C4231e;
import ge.C4237h;
import ge.M;
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
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"com/braze/storage/BannersDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/h;", "currentData", "migrateBannerStorageToJson", "(Li1/d;Lk1/h;)Lk1/h;", "migrateBannerImpressionMapToJson", "", "BANNERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "BANNERS_STORAGE_SHARED_PREFS", "BANNERS_ELIGIBILITY_SHARED_PREFS", "BANNERS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannersDataStoreProvider$Companion {
    public /* synthetic */ BannersDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$11$lambda$10() {
        return "Migration for Banners impression map completed successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$12() {
        return "Failed to migrate banner impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$7() {
        return "Starting migration for key: " + DataStoreKey.BANNERS_IMPRESSION_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$9$lambda$8(Object obj, String str) {
        return "Added impression:" + obj + " for banner:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.BANNERS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3$lambda$1(String str) {
        return "Added banner from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3$lambda$2(Object obj) {
        return "Banner value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$5$lambda$4(List list) {
        return "Migration for banners completed successfully. Migrated " + list.size() + " banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$6() {
        return "Failed to migrate banner storage to DataStore.";
    }

    public final AbstractC4785h migrateBannerImpressionMapToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$7();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.f28417d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.g
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$9$lambda$8(value, str);
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new M(ge.w0.f35762a, C4237h.f35705a), linkedHashMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = "{}";
            }
            C4781d c4781dD = currentData.d();
            c4781dD.l(AbstractC4788k.g(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$11$lambda$10();
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$12();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final AbstractC4785h migrateBannerStorageToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$0();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.BANNERS.getKey()))) {
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.f28417d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.b
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3$lambda$1(str);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.f28417d, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.c
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3$lambda$2(value);
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
            c4781dD.l(AbstractC4788k.g(DataStoreKey.BANNERS.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$5$lambda$4(arrayList);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$6();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private BannersDataStoreProvider$Companion() {
    }
}
