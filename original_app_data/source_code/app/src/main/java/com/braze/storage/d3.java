package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import g1.InterfaceC4099i;
import gc.C4206t;
import gc.T;
import i1.C4317b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SessionStorageDataStoreProvider$Companion f28412d = new SessionStorageDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28413e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28414a = str;
        this.f28415b = apiKey;
        this.f28416c = C4029l.b(new InterfaceC6082a() { // from class: r5.n1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.d3.a(context, this);
            }
        });
    }

    public static final String a(Context context, d3 d3Var) {
        return StringUtils.getCacheFileSuffix(context, d3Var.f28414a, d3Var.f28415b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4206t.n(j1.k.a(getContext(), "com.appboy.storage.session_storage" + ((String) this.f28416c.getValue()), T.c(DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey())), new C4317b(getContext(), "com.appboy.storage.session_storage" + ((String) this.f28416c.getValue()), null, null, new c3(f28412d), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28413e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.session_storage" + ((String) this.f28416c.getValue());
    }
}
