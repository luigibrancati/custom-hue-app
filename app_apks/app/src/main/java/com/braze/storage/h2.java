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
public final class h2 extends DataStoreProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PushDeliveryDataStoreProvider$Companion f28451c = new PushDeliveryDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f28452d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4028k f28454b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(final Context context, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28453a = apiKey;
        this.f28454b = C4029l.b(new InterfaceC6082a() { // from class: r5.t1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.h2.a(context, this);
            }
        });
    }

    public static final String a(Context context, h2 h2Var) {
        return StringUtils.getCacheFileSuffix(context, null, h2Var.f28453a);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(new C4317b(getContext(), "com.braze.storage.braze_push_delivery_storage" + ((String) this.f28454b.getValue()), null, null, new g2(f28451c), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28452d;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_delivery." + this.f28453a;
    }
}
