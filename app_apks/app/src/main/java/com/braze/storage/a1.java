package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import g1.InterfaceC4099i;
import gc.C4205s;
import gc.T;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f28387d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28390c;

    static {
        new DustDataStoreProvider$Companion(null);
        f28387d = new ConcurrentHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28388a = str;
        this.f28389b = apiKey;
        this.f28390c = C4029l.b(new InterfaceC6082a() { // from class: r5.G0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.a1.a(context, this);
            }
        });
    }

    public static final String a(Context context, a1 a1Var) {
        return StringUtils.getCacheFileSuffix(context, a1Var.f28388a, a1Var.f28389b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(j1.k.a(getContext(), "com.braze.managers.dust.metadata" + ((String) this.f28390c.getValue()), T.c(DataStoreKey.MITE_KEY.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28387d;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.dust" + ((String) this.f28390c.getValue());
    }
}
