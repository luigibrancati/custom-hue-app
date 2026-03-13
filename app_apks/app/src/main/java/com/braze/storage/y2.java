package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import g1.InterfaceC4099i;
import gc.C4205s;
import i1.C4317b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SdkMetadataDataStoreProvider$Companion f28609d = new SdkMetadataDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28610e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28611a = str;
        this.f28612b = apiKey;
        this.f28613c = C4029l.b(new InterfaceC6082a() { // from class: r5.A3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.y2.a(context, this);
            }
        });
    }

    public static final String a(Context context, y2 y2Var) {
        return StringUtils.getCacheFileSuffix(context, y2Var.f28611a, y2Var.f28612b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(new C4317b(getContext(), "com.braze.storage.sdk_metadata_cache" + ((String) this.f28613c.getValue()), null, null, new x2(f28609d), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28610e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_metadata" + ((String) this.f28613c.getValue());
    }
}
