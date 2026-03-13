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
public final class u1 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EventDuplicationValidatorDataStoreProvider$Companion f28580d = new EventDuplicationValidatorDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28581e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28582a = str;
        this.f28583b = apiKey;
        this.f28584c = C4029l.b(new InterfaceC6082a() { // from class: r5.i3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.u1.a(context, this);
            }
        });
    }

    public static final String a(Context context, u1 u1Var) {
        return StringUtils.getCacheFileSuffix(context, u1Var.f28582a, u1Var.f28583b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(new C4317b(getContext(), "com.appboy.storage.event_data_validator" + ((String) this.f28584c.getValue()), null, null, new t1(f28580d), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28581e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.storage.event_data_validator" + ((String) this.f28584c.getValue());
    }
}
