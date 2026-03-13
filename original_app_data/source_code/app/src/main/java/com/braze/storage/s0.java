package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import g1.InterfaceC4099i;
import gc.C4205s;
import gc.U;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f28561a = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(j1.k.a(getContext(), "persistent.com.braze.storage.delayed_initialization_cache", U.h(DataStoreKey.DELAYED_INIT_ENABLED.getKey(), DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG.getKey(), DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28561a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.delayed_initialization";
    }
}
