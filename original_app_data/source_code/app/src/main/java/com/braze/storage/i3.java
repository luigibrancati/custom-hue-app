package com.braze.storage;

import android.content.Context;
import g1.InterfaceC4099i;
import gc.C4205s;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends DataStoreProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f28466a;

    static {
        new StringUtilsDataStoreProvider$Companion(null);
        f28466a = new ConcurrentHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Context context) {
        super(context);
        AbstractC4862t.e(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(j1.k.b(getContext(), "com.appboy.support.stringutils.cachefilesuffix", null, 4, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28466a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.appboy.support.stringutils.cachefilesuffix";
    }
}
