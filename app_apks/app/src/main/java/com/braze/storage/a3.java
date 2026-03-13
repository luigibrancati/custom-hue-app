package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import g1.InterfaceC4099i;
import gc.C4206t;
import gc.U;
import i1.C4317b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends DataStoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ServerConfigDataStoreProvider$Companion f28391b = new ServerConfigDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f28392c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28393a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28393a = apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4206t.n(j1.k.a(getContext(), "com.braze.storage.server_config." + this.f28393a, U.h(DataStoreKey.LAST_ACCESSED_SDK_VERSION.getKey(), DataStoreKey.CONFIG_TIME.getKey(), DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), DataStoreKey.GEOFENCES_ENABLED.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), DataStoreKey.DUST_ENABLED.getKey(), DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), DataStoreKey.PUSH_MAX_ENABLED.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), DataStoreKey.BANNERS_ENABLED.getKey(), DataStoreKey.MAX_BANNER_PLACEMENTS.getKey())), new C4317b(getContext(), "com.braze.storage.server_config." + this.f28393a, null, null, new z2(f28391b), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28392c;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.serverconfig." + this.f28393a;
    }
}
