package com.braze.storage;

import Od.C;
import Rd.AbstractC2128g;
import Rd.AbstractC2132i;
import Rd.D0;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.N;
import Rd.U0;
import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import fc.C4015H;
import fc.C4032o;
import g1.C4094d;
import g1.InterfaceC4097g;
import g1.InterfaceC4099i;
import h1.C4268b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k1.AbstractC4785h;
import k1.AbstractC4786i;
import k1.AbstractC4788k;
import k1.C4784g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 T2\u00020\u0001:\u0001TB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0004\u0012\u00020\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J1\u0010+\u001a\u00020\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)H\u0016¢\u0006\u0004\b+\u0010,J+\u00100\u001a\u00020\n\"\u0004\b\u0000\u0010-2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b.\u0010/J3\u00104\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010-*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!2\b\u00101\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\u0015\"\b\b\u0000\u0010-*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0001¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0004\u0012\u00020\u00010 H\u0001¢\u0006\u0004\b9\u0010#J#\u0010=\u001a\u00020\n\"\u0004\b\u0000\u0010-2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0001¢\u0006\u0004\b;\u0010<J\u000f\u0010?\u001a\u00020\nH\u0001¢\u0006\u0004\b>\u0010'J1\u0010A\u001a\u00020\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060)H\u0001¢\u0006\u0004\b@\u0010,J+\u0010G\u001a\b\u0012\u0004\u0012\u00020D0F2\u0014\b\u0002\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0BH\u0004¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010KR&\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0F0L8$X¤\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/braze/storage/DataStoreProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "message", "", "throwable", "Lfc/H;", "publishException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/braze/enums/DataStoreKey;", "key", "value", "writeData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)V", "default", "readData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)Ljava/lang/Object;", "", "readBoolean", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "readString", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/String;)Ljava/lang/String;", "", "readInt", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "readLong", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Long;)Ljava/lang/Long;", "", "Lk1/h$a;", "readAllData", "()Ljava/util/Map;", "clearData", "(Lcom/braze/enums/DataStoreKey;)V", "clearAllData", "()V", "updates", "", "removals", "batchUpdate", "(Ljava/util/Map;Ljava/util/Set;)V", "T", "write$android_sdk_base_release", "(Lk1/h$a;Ljava/lang/Object;)V", "write", "defaultValue", "read$android_sdk_base_release", "(Lk1/h$a;Ljava/lang/Object;)Ljava/lang/Object;", "read", "contains$android_sdk_base_release", "(Lk1/h$a;)Z", "contains", "(Lcom/braze/enums/DataStoreKey;)Z", "readAll$android_sdk_base_release", "readAll", "clear$android_sdk_base_release", "(Lk1/h$a;)V", "clear", "clearAll$android_sdk_base_release", "clearAll", "batchUpdates$android_sdk_base_release", "batchUpdates", "", "Lg1/g;", "Lk1/h;", "migrations", "Lg1/i;", "createOrGetDataStore", "(Ljava/util/List;)Lg1/i;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "dataStoreCache", "LRd/M;", "getDataStoreScope$android_sdk_base_release", "()LRd/M;", "dataStoreScope", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DataStoreProvider {
    private static com.braze.events.e eventPublisher;
    private final Context context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DataStoreProvider.class);
    private static final List<ConcurrentHashMap<String, InterfaceC4099i>> allCaches = new ArrayList();
    private static final Object scopeCreationLock = new Object();
    private static final ConcurrentHashMap<String, M> dataStoreScopeMap = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001d\u001a\u00020\u00062\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010+\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010 R\u0014\u0010,\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010 R\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100R,\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/braze/storage/DataStoreProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lfc/H;", "deleteDataStoreFiles", "(Landroid/content/Context;)V", "Ljava/io/File;", Constants.FILE, "", "maxRetries", "", "delayMs", "deleteFileWithRetry", "(Ljava/io/File;IJ)V", "", "key", "LRd/M;", "getOrCreateScopeForKey$android_sdk_base_release", "(Ljava/lang/String;)LRd/M;", "getOrCreateScopeForKey", "Ljava/util/concurrent/ConcurrentHashMap;", "Lg1/i;", "Lk1/h;", "cache", "registerCache$android_sdk_base_release", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "registerCache", "shutdownAllDataStores", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/braze/events/e;", "eventPublisher", "Lcom/braze/events/e;", "getEventPublisher$android_sdk_base_release", "()Lcom/braze/events/e;", "setEventPublisher$android_sdk_base_release", "(Lcom/braze/events/e;)V", "PERSISTENT_DATASTORE_PREFIX", "BRAZE_DATASTORE_PREFIX", "RUNTIME_CONFIG_PREFIX", "FILE_DELETE_MAX_RETRIES", "I", "FILE_DELETE_RETRY_DELAY_MS", "J", "", "allCaches", "Ljava/util/List;", "scopeCreationLock", "Ljava/lang/Object;", "dataStoreScopeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        private final void deleteDataStoreFiles(Context context) {
            File[] fileArrListFiles;
            try {
                File file = new File(context.getFilesDir(), "datastore");
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        String name = file2.getName();
                        AbstractC4862t.d(name, "getName(...)");
                        if (C.P(name, "com.braze", false, 2, null)) {
                            String name2 = file2.getName();
                            AbstractC4862t.d(name2, "getName(...)");
                            if (!C.P(name2, "com.braze.override.runtime_config", false, 2, null)) {
                                String name3 = file2.getName();
                                AbstractC4862t.d(name3, "getName(...)");
                                if (!C.P(name3, "persistent", false, 2, null)) {
                                    Companion companion = DataStoreProvider.INSTANCE;
                                    AbstractC4862t.b(file2);
                                    deleteFileWithRetry$default(companion, file2, 0, 0L, 6, null);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.C
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return DataStoreProvider.Companion.deleteDataStoreFiles$lambda$9();
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteDataStoreFiles$lambda$9() {
            return "Failed to delete DataStore files";
        }

        private final void deleteFileWithRetry(final File file, final int maxRetries, long delayMs) throws InterruptedException {
            for (final int i10 = 0; i10 < maxRetries; i10++) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.D
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return DataStoreProvider.Companion.deleteFileWithRetry$lambda$11$lambda$10(file, i10);
                    }
                }, 6, (Object) null);
                if (file.delete() || !file.exists()) {
                    return;
                }
                if (i10 < maxRetries - 1) {
                    Thread.sleep(delayMs);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.E
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.Companion.deleteFileWithRetry$lambda$12(maxRetries, file);
                }
            }, 6, (Object) null);
        }

        public static /* synthetic */ void deleteFileWithRetry$default(Companion companion, File file, int i10, long j10, int i11, Object obj) throws InterruptedException {
            if ((i11 & 2) != 0) {
                i10 = 3;
            }
            if ((i11 & 4) != 0) {
                j10 = 50;
            }
            companion.deleteFileWithRetry(file, i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$11$lambda$10(File file, int i10) {
            return "Deleting DataStore file: " + file.getName() + " (attempt " + (i10 + 1) + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$12(int i10, File file) {
            return "Failed to delete DataStore file after " + i10 + " attempts: " + file.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getOrCreateScopeForKey$lambda$3$lambda$2(String str, M m10) {
            return "Creating new CoroutineScope for DataStore for key: " + str + " scope: " + m10;
        }

        public final M getOrCreateScopeForKey$android_sdk_base_release(final String key) {
            final M mA;
            AbstractC4862t.e(key, "key");
            M m10 = (M) DataStoreProvider.dataStoreScopeMap.get(key);
            if (m10 != null && N.f(m10)) {
                return m10;
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                try {
                    mA = (M) DataStoreProvider.dataStoreScopeMap.get(key);
                    if (mA == null || !N.f(mA)) {
                        mA = N.a(BrazeCoroutineScope.INSTANCE.getCoroutineContext().plus(U0.b(null, 1, null)));
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.B
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return DataStoreProvider.Companion.getOrCreateScopeForKey$lambda$3$lambda$2(key, mA);
                            }
                        }, 6, (Object) null);
                        DataStoreProvider.dataStoreScopeMap.put(key, mA);
                    }
                } finally {
                }
            }
            return mA;
        }

        public final String getTAG() {
            return DataStoreProvider.TAG;
        }

        public final void registerCache$android_sdk_base_release(ConcurrentHashMap<String, InterfaceC4099i> cache) {
            AbstractC4862t.e(cache, "cache");
            if (DataStoreProvider.allCaches.contains(cache)) {
                return;
            }
            DataStoreProvider.allCaches.add(cache);
        }

        public final void setEventPublisher$android_sdk_base_release(com.braze.events.e eVar) {
            DataStoreProvider.eventPublisher = eVar;
        }

        public final void shutdownAllDataStores(Context context) {
            Collection<M> collectionValues = DataStoreProvider.dataStoreScopeMap.values();
            AbstractC4862t.d(collectionValues, "<get-values>(...)");
            for (M m10 : collectionValues) {
                InterfaceC4992i coroutineContext = m10.getCoroutineContext();
                InterfaceC2166z0.b bVar = InterfaceC2166z0.f15218M;
                InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) coroutineContext.get(bVar);
                if (interfaceC2166z0 != null) {
                    D0.g(interfaceC2166z0, null, 1, null);
                }
                InterfaceC2166z0 interfaceC2166z02 = (InterfaceC2166z0) m10.getCoroutineContext().get(bVar);
                if (interfaceC2166z02 != null) {
                    InterfaceC2166z0.a.a(interfaceC2166z02, null, 1, null);
                }
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                DataStoreProvider.dataStoreScopeMap.clear();
                C4015H c4015h = C4015H.f34254a;
            }
            Iterator it = DataStoreProvider.allCaches.iterator();
            while (it.hasNext()) {
                ((ConcurrentHashMap) it.next()).clear();
            }
            if (context != null) {
                DataStoreProvider.INSTANCE.deleteDataStoreFiles(context);
            }
        }

        private Companion() {
        }
    }

    public DataStoreProvider(Context context) {
        AbstractC4862t.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        INSTANCE.registerCache$android_sdk_base_release(getDataStoreCache());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createOrGetDataStore$lambda$9$lambda$6(DataStoreProvider dataStoreProvider, String str) {
        File filesDir = dataStoreProvider.context.getFilesDir();
        AbstractC4862t.d(filesDir, "getFilesDir(...)");
        return sc.l.r(filesDir, "datastore/" + str + ".preferences_pb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4785h createOrGetDataStore$lambda$9$lambda$8(String str, DataStoreProvider dataStoreProvider, C4094d exception) {
        AbstractC4862t.e(exception, "exception");
        final String str2 = "DataStore file corrupted for " + str + ", resetting to empty preferences";
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) exception, false, new InterfaceC6082a() { // from class: r5.z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DataStoreProvider.createOrGetDataStore$lambda$9$lambda$8$lambda$7(str2);
            }
        }, 8, (Object) null);
        dataStoreProvider.publishException(str2, exception);
        return AbstractC4786i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishException(String message, Throwable throwable) {
        com.braze.events.e eVar = eventPublisher;
        if (eVar == null) {
            return;
        }
        try {
            AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new b0(eVar, message, throwable, null), 3, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.w
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.publishException$lambda$10();
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishException$lambda$10() {
        return "Failed to publish exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readBoolean$lambda$2(DataStoreKey dataStoreKey, Boolean bool) {
        return "Not reading data with with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected boolean. Returning default value:'" + bool + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readInt$lambda$4(DataStoreKey dataStoreKey, Integer num) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected int. Returning default value:'" + num + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readLong$lambda$5(DataStoreKey dataStoreKey, Long l10) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected long. Returning default value:'" + l10 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readString$lambda$3(DataStoreKey dataStoreKey, String str) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected string. Returning default value:'" + str + "'";
    }

    public void batchUpdate(Map<String, ? extends Object> updates, Set<String> removals) {
        AbstractC4862t.e(updates, "updates");
        AbstractC4862t.e(removals, "removals");
        batchUpdates$android_sdk_base_release(updates, removals);
    }

    public final void batchUpdates$android_sdk_base_release(Map<String, ? extends Object> updates, Set<String> removals) {
        AbstractC4862t.e(updates, "updates");
        AbstractC4862t.e(removals, "removals");
        AbstractC2128g.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new s(this, updates, removals, null));
    }

    public final <T> void clear$android_sdk_base_release(AbstractC4785h.a key) {
        AbstractC4862t.e(key, "key");
        AbstractC2128g.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new u(this, key, null));
    }

    public final void clearAll$android_sdk_base_release() {
        AbstractC2128g.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new w(this, null));
    }

    public void clearAllData() {
        clearAll$android_sdk_base_release();
    }

    public void clearData(DataStoreKey key) {
        AbstractC4862t.e(key, "key");
        switch (q.f28542a[key.getType().ordinal()]) {
            case 1:
                clear$android_sdk_base_release(AbstractC4788k.e(key.getKey()));
                return;
            case 2:
                clear$android_sdk_base_release(AbstractC4788k.c(key.getKey()));
                return;
            case 3:
                clear$android_sdk_base_release(AbstractC4788k.g(key.getKey()));
                return;
            case 4:
                clear$android_sdk_base_release(AbstractC4788k.a(key.getKey()));
                return;
            case 5:
                clear$android_sdk_base_release(AbstractC4788k.d(key.getKey()));
                return;
            case 6:
                clear$android_sdk_base_release(AbstractC4788k.f(key.getKey()));
                return;
            case 7:
                clear$android_sdk_base_release(AbstractC4788k.g(key.getKey()));
                return;
            case 8:
                clear$android_sdk_base_release(AbstractC4788k.g(key.getKey()));
                return;
            default:
                throw new C4032o();
        }
    }

    public boolean contains(DataStoreKey key) {
        AbstractC4862t.e(key, "key");
        switch (q.f28542a[key.getType().ordinal()]) {
            case 1:
                return contains$android_sdk_base_release(AbstractC4788k.e(key.getKey()));
            case 2:
                return contains$android_sdk_base_release(AbstractC4788k.c(key.getKey()));
            case 3:
                return contains$android_sdk_base_release(AbstractC4788k.g(key.getKey()));
            case 4:
                return contains$android_sdk_base_release(AbstractC4788k.a(key.getKey()));
            case 5:
                return contains$android_sdk_base_release(AbstractC4788k.d(key.getKey()));
            case 6:
                return contains$android_sdk_base_release(AbstractC4788k.f(key.getKey()));
            case 7:
                return contains$android_sdk_base_release(AbstractC4788k.g(key.getKey()));
            case 8:
                return contains$android_sdk_base_release(AbstractC4788k.g(key.getKey()));
            default:
                throw new C4032o();
        }
    }

    public final <T> boolean contains$android_sdk_base_release(AbstractC4785h.a key) {
        AbstractC4862t.e(key, "key");
        return ((Boolean) AbstractC2128g.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new a0(this, key, null))).booleanValue();
    }

    public final InterfaceC4099i createOrGetDataStore(List<? extends InterfaceC4097g> migrations) {
        AbstractC4862t.e(migrations, "migrations");
        final String dataStoreFileName = getDataStoreFileName();
        ConcurrentHashMap<String, InterfaceC4099i> dataStoreCache = getDataStoreCache();
        InterfaceC4099i interfaceC4099iC = dataStoreCache.get(dataStoreFileName);
        if (interfaceC4099iC == null) {
            interfaceC4099iC = C4784g.f39197a.c(new C4268b(new vc.l() { // from class: r5.v
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return DataStoreProvider.createOrGetDataStore$lambda$9$lambda$8(dataStoreFileName, this, (C4094d) obj);
                }
            }), migrations, getDataStoreScope$android_sdk_base_release(), new InterfaceC6082a() { // from class: r5.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.createOrGetDataStore$lambda$9$lambda$6(this.f43719a, dataStoreFileName);
                }
            });
            InterfaceC4099i interfaceC4099iPutIfAbsent = dataStoreCache.putIfAbsent(dataStoreFileName, interfaceC4099iC);
            if (interfaceC4099iPutIfAbsent != null) {
                interfaceC4099iC = interfaceC4099iPutIfAbsent;
            }
        }
        AbstractC4862t.d(interfaceC4099iC, "getOrPut(...)");
        return interfaceC4099iC;
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract /* synthetic */ InterfaceC4099i getDataStore();

    public abstract ConcurrentHashMap<String, InterfaceC4099i> getDataStoreCache();

    public abstract /* synthetic */ String getDataStoreFileName();

    public final M getDataStoreScope$android_sdk_base_release() {
        return INSTANCE.getOrCreateScopeForKey$android_sdk_base_release(getDataStoreFileName());
    }

    public final <T> T read$android_sdk_base_release(AbstractC4785h.a key, T defaultValue) {
        AbstractC4862t.e(key, "key");
        return (T) AbstractC2128g.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new f0(this, key, defaultValue, null));
    }

    public final Map<AbstractC4785h.a, Object> readAll$android_sdk_base_release() {
        return (Map) AbstractC2128g.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new g0(this, null));
    }

    public Map<AbstractC4785h.a, Object> readAllData() {
        return readAll$android_sdk_base_release();
    }

    public Boolean readBoolean(final DataStoreKey key, final Boolean bool) {
        AbstractC4862t.e(key, "key");
        try {
            return (Boolean) read$android_sdk_base_release(AbstractC4788k.a(key.getKey()), bool);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.s
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.readBoolean$lambda$2(key, bool);
                }
            }, 8, (Object) null);
            return bool;
        }
    }

    public Object readData(DataStoreKey key, Object obj) {
        AbstractC4862t.e(key, "key");
        try {
            switch (q.f28542a[key.getType().ordinal()]) {
                case 1:
                    AbstractC4785h.a aVarE = AbstractC4788k.e(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
                    return read$android_sdk_base_release(aVarE, (Integer) obj);
                case 2:
                    AbstractC4785h.a aVarC = AbstractC4788k.c(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Double");
                    return read$android_sdk_base_release(aVarC, (Double) obj);
                case 3:
                    AbstractC4785h.a aVarG = AbstractC4788k.g(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(aVarG, (String) obj);
                case 4:
                    AbstractC4785h.a aVarA = AbstractC4788k.a(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return read$android_sdk_base_release(aVarA, (Boolean) obj);
                case 5:
                    AbstractC4785h.a aVarD = AbstractC4788k.d(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Float");
                    return read$android_sdk_base_release(aVarD, (Float) obj);
                case 6:
                    AbstractC4785h.a aVarF = AbstractC4788k.f(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Long");
                    return read$android_sdk_base_release(aVarF, (Long) obj);
                case 7:
                    AbstractC4785h.a aVarG2 = AbstractC4788k.g(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(aVarG2, (String) obj);
                case 8:
                    AbstractC4785h.a aVarG3 = AbstractC4788k.g(key.getKey());
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(aVarG3, (String) obj);
                default:
                    throw new C4032o();
            }
        } catch (Exception e10) {
            final String str = "Not reading data with key:'" + key + "' type:'" + key.getType() + "' due to mismatched data type. Returning default value:'" + obj + "'";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.y
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.readData$lambda$1(str);
                }
            }, 8, (Object) null);
            publishException(str, e10);
            return obj;
        }
    }

    public Integer readInt(final DataStoreKey key, final Integer num) {
        AbstractC4862t.e(key, "key");
        try {
            return (Integer) read$android_sdk_base_release(AbstractC4788k.e(key.getKey()), num);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.x
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.readInt$lambda$4(key, num);
                }
            }, 8, (Object) null);
            return num;
        }
    }

    public Long readLong(final DataStoreKey key, final Long l10) {
        AbstractC4862t.e(key, "key");
        try {
            return (Long) read$android_sdk_base_release(AbstractC4788k.f(key.getKey()), l10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.readLong$lambda$5(key, l10);
                }
            }, 4, (Object) null);
            return l10;
        }
    }

    public String readString(final DataStoreKey key, final String str) {
        AbstractC4862t.e(key, "key");
        try {
            return (String) read$android_sdk_base_release(AbstractC4788k.g(key.getKey()), str);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.t
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.readString$lambda$3(key, str);
                }
            }, 8, (Object) null);
            return str;
        }
    }

    public final <T> void write$android_sdk_base_release(AbstractC4785h.a key, T value) {
        AbstractC4862t.e(key, "key");
        AbstractC2128g.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new n0(this, value, key, null));
    }

    public void writeData(DataStoreKey key, Object value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        try {
            switch (q.f28542a[key.getType().ordinal()]) {
                case 1:
                    write$android_sdk_base_release(AbstractC4788k.e(key.getKey()), (Integer) value);
                    return;
                case 2:
                    write$android_sdk_base_release(AbstractC4788k.c(key.getKey()), (Double) value);
                    return;
                case 3:
                    write$android_sdk_base_release(AbstractC4788k.g(key.getKey()), (String) value);
                    return;
                case 4:
                    write$android_sdk_base_release(AbstractC4788k.a(key.getKey()), (Boolean) value);
                    return;
                case 5:
                    write$android_sdk_base_release(AbstractC4788k.d(key.getKey()), (Float) value);
                    return;
                case 6:
                    write$android_sdk_base_release(AbstractC4788k.f(key.getKey()), (Long) value);
                    return;
                case 7:
                    write$android_sdk_base_release(AbstractC4788k.g(key.getKey()), (String) value);
                    return;
                case 8:
                    write$android_sdk_base_release(AbstractC4788k.g(key.getKey()), (String) value);
                    return;
                default:
                    throw new C4032o();
            }
        } catch (Exception e10) {
            final String str = "Not storing data with key:'" + key + "' value:'" + value + "' type:'" + key.getType() + "' due to mismatched data type.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DataStoreProvider.writeData$lambda$0(str);
                }
            }, 8, (Object) null);
            publishException(str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createOrGetDataStore$lambda$9$lambda$8$lambda$7(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readData$lambda$1(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeData$lambda$0(String str) {
        return str;
    }
}
