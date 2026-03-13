package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.SdkMetadataDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import gc.C4179C;
import gc.U;
import ge.C4231e;
import he.AbstractC4304b;
import i1.C4319d;
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
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/SdkMetadataDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/h;", "currentData", "migrateMetadataToJson", "(Li1/d;Lk1/h;)Lk1/h;", "", "METADATA_DATA_STORE_STORAGE", "Ljava/lang/String;", "METADATA_STORAGE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SdkMetadataDataStoreProvider$Companion {
    public /* synthetic */ SdkMetadataDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.SDK_METADATA.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$1() {
        return "Key: " + DataStoreKey.SDK_METADATA.getKey() + " already exists in DataStore. Not performing migration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$2(Set set) {
        return "Found " + set.size() + " metadata tags to migrate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$4$lambda$3(List list) {
        return "Migration for SDK metadata completed successfully. Migrated " + list.size() + " tags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$5() {
        return "Failed to migrate SDK metadata to DataStore.";
    }

    public final AbstractC4785h migrateMetadataToJson(C4319d sharedPrefs, AbstractC4785h currentData) {
        String strB;
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.d0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$0();
            }
        }, 7, (Object) null);
        if (currentData.b(AbstractC4788k.g(DataStoreKey.SDK_METADATA.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.e0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$1();
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            final Set setE = sharedPrefs.e("tags", U.d());
            if (setE == null) {
                setE = U.d();
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.f0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$2(setE);
                }
            }, 7, (Object) null);
            final List listV0 = C4179C.V0(setE);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(ge.w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            C4781d c4781dD = currentData.d();
            c4781dD.l(AbstractC4788k.g(DataStoreKey.SDK_METADATA.getKey()), strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.g0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$4$lambda$3(listV0);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e11, false, new InterfaceC6082a() { // from class: r5.h0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$5();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private SdkMetadataDataStoreProvider$Companion() {
    }
}
