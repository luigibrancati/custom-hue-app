package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import gc.C4179C;
import i1.C4319d;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.TikaCoreProperties;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/EventDuplicationValidatorDataStoreProvider$Companion", "", "<init>", "()V", "Li1/d;", "sharedPrefs", "Lk1/h;", "currentData", "migrateEventDuplicationMap", "(Li1/d;Lk1/h;)Lk1/h;", "", "EVENT_DUPLICATION_VALIDATION_STORAGE", "Ljava/lang/String;", "STORAGE_PREFIX", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventDuplicationValidatorDataStoreProvider$Companion {
    public /* synthetic */ EventDuplicationValidatorDataStoreProvider$Companion(AbstractC4854k abstractC4854k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence migrateEventDuplicationMap$lambda$1(Map.Entry entry) {
        AbstractC4862t.e(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        AbstractC4862t.c(value, "null cannot be cast to non-null type kotlin.Long");
        return str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + ((Long) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$3$lambda$2(C4319d c4319d) {
        return "Migration for event duplication map completed. Migrated " + c4319d.b().size() + " events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$4() {
        return "Failed to migrate event duplication map to DataStore.";
    }

    public final AbstractC4785h migrateEventDuplicationMap(final C4319d sharedPrefs, AbstractC4785h currentData) {
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.F
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$0();
            }
        }, 7, (Object) null);
        AbstractC4785h.a aVarG = AbstractC4788k.g(DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey());
        if (currentData.b(aVarG)) {
            return currentData;
        }
        try {
            String strQ0 = C4179C.q0(sharedPrefs.b().entrySet(), ",", null, null, 0, null, new vc.l() { // from class: r5.G
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$1((Map.Entry) obj);
                }
            }, 30, null);
            C4781d c4781dD = currentData.d();
            c4781dD.l(aVarG, strQ0);
            BrazeLogger.brazelog$default(brazeLogger, (Object) c4781dD, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.H
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$3$lambda$2(sharedPrefs);
                }
            }, 7, (Object) null);
            return c4781dD;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.I
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$4();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private EventDuplicationValidatorDataStoreProvider$Companion() {
    }
}
