package com.braze.storage;

import android.content.Context;
import g1.InterfaceC4099i;
import gc.C4205s;
import i1.C4317b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f28555a = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f28556b = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(new C4317b(getContext(), "com.appboy.override.configuration.cache", null, null, new q2(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28556b;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.override.runtime_config";
    }
}
