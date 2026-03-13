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
public final class w0 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f28599a = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(j1.k.a(getContext(), "com.appboy.managers.device_data_provider", U.h(DataStoreKey.GOOGLE_ADVERTISING_ID.getKey(), DataStoreKey.AD_TRACKING_ENABLED.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28599a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_data";
    }
}
