package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import g1.InterfaceC4099i;
import gc.C4206t;
import gc.U;
import i1.C4317b;
import i1.C4319d;
import java.util.concurrent.ConcurrentHashMap;
import k1.AbstractC4785h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\tR&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/storage/DataStoreProvider;", "Landroid/content/Context;", "context", "", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getDataStoreFileName", "()Ljava/lang/String;", "Lg1/i;", "Lk1/h;", "getDataStore", "()Lg1/i;", "Ljava/lang/String;", "getApiKey", "Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "dataStoreCache", "Companion", "com/braze/storage/a2", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeofenceDataStoreProvider extends DataStoreProvider {
    public static final a2 Companion = new a2();
    private static final ConcurrentHashMap<String, InterfaceC4099i> geofenceDataStores = new ConcurrentHashMap<>();
    private final String apiKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceDataStoreProvider(Context context, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.apiKey = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateGeofencesListToJson(a2 a2Var, C4319d sharedPrefs, AbstractC4785h currentData, InterfaceC4988e interfaceC4988e) {
        a2Var.getClass();
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        return a2Var.a(sharedPrefs, currentData, DataStoreKey.GEOFENCES.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getDataStore$migrateIndividualReeligibilityMapToJson(a2 a2Var, C4319d c4319d, AbstractC4785h abstractC4785h, InterfaceC4988e interfaceC4988e) {
        return a2Var.a(c4319d, abstractC4785h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateRegisteredGeofencesListToJson(a2 a2Var, C4319d sharedPrefs, AbstractC4785h currentData, InterfaceC4988e interfaceC4988e) {
        a2Var.getClass();
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        return a2Var.a(sharedPrefs, currentData, DataStoreKey.REGISTERED_GEOFENCES.getKey());
    }

    @Override // com.braze.storage.DataStoreProvider
    public InterfaceC4099i getDataStore() {
        C4317b c4317bA = j1.k.a(getContext(), "com.appboy.managers.geofences.eligibility.global." + this.apiKey, U.h(DataStoreKey.GLOBAL_LAST_REPORT.getKey(), DataStoreKey.GLOBAL_LAST_REQUEST.getKey()));
        Context context = getContext();
        String str = "com.appboy.managers.geofences.eligibility.individual." + this.apiKey;
        a2 a2Var = Companion;
        return createOrGetDataStore(C4206t.n(c4317bA, new C4317b(context, str, null, null, new b2(a2Var), 12, null), new C4317b(getContext(), "com.appboy.managers.geofences.storage." + this.apiKey, null, null, new c2(a2Var), 12, null), new C4317b(getContext(), "com.appboy.support.geofences", 0 == true ? 1 : 0, null, new d2(a2Var), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public ConcurrentHashMap<String, InterfaceC4099i> getDataStoreCache() {
        return geofenceDataStores;
    }

    @Override // com.braze.storage.DataStoreProvider
    public String getDataStoreFileName() {
        return "com.braze.geofences." + this.apiKey;
    }
}
