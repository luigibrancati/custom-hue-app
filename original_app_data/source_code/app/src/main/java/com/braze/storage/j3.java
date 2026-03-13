package com.braze.storage;

import android.content.Context;
import g1.InterfaceC4099i;
import gc.C4205s;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends DataStoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f28471b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28472a;

    static {
        new TriggerAssetDataStoreProvider$Companion(null);
        f28471b = new ConcurrentHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(Context context, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28472a = apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(j1.k.b(getContext(), "com.appboy.storage.triggers.local_assets." + this.f28472a, null, 4, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28471b;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.triggers.assets." + this.f28472a;
    }
}
