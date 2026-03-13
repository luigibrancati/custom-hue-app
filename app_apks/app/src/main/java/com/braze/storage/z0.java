package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;
import g1.InterfaceC4099i;
import gc.C4206t;
import i1.C4317b;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends DataStoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f28616b = new x0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f28617c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28618a = apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() throws NoSuchAlgorithmException {
        return createOrGetDataStore(C4206t.n(j1.k.b(getContext(), "com.braze.device_id" + StringUtils.getCacheFileSuffix(getContext(), null, this.f28618a), null, 4, null), new C4317b(getContext(), "com.appboy.device", null, null, new y0(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28617c;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() throws NoSuchAlgorithmException {
        return "com.braze.device_id" + StringUtils.getCacheFileSuffix(getContext(), null, this.f28618a);
    }
}
