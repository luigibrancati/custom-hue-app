package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import g1.InterfaceC4099i;
import gc.C4205s;
import gc.T;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f28585a = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        Context applicationContext = getContext().getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        return createOrGetDataStore(C4205s.d(j1.k.a(applicationContext, "persistent.com.appboy.storage.sdk_enabled_cache", T.c(DataStoreKey.SDK_ENABLEMENT.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28585a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_enablement";
    }
}
