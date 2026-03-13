package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import g1.InterfaceC4099i;
import gc.C4205s;
import gc.U;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f27838a = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(j1.k.a(getContext(), "com.braze.push_registration", U.h(DataStoreKey.PUSH_REGISTRATION_VERSION_CODE.getKey(), DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID.getKey(), DataStoreKey.PUSH_REGISTRATION_ID_KEY.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f27838a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_storage";
    }
}
