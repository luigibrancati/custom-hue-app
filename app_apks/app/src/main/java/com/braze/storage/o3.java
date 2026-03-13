package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import g1.InterfaceC4099i;
import gc.C4206t;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f28518d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(final Context context, String str, String str2) {
        super(context);
        AbstractC4862t.e(context, "context");
        this.f28519a = str;
        this.f28520b = str2;
        this.f28521c = C4029l.b(new InterfaceC6082a() { // from class: r5.k2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.o3.a(context, this);
            }
        });
    }

    public static final String a(Context context, o3 o3Var) {
        return StringUtils.getCacheFileSuffix(context, o3Var.f28519a, o3Var.f28520b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4206t.n(j1.k.b(getContext(), "com.appboy.storage.user_cache.v3" + ((String) this.f28521c.getValue()), null, 4, null), j1.k.b(getContext(), "com.braze.storage.user_cache.push_token_store" + ((String) this.f28521c.getValue()), null, 4, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28518d;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.user_cache" + ((String) this.f28521c.getValue());
    }
}
