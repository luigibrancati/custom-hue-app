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
public final class o2 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PushMaxDataStoreProvider$Companion f28513d = new PushMaxDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28514e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28515a = str;
        this.f28516b = apiKey;
        this.f28517c = C4029l.b(new InterfaceC6082a() { // from class: r5.j2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.o2.a(context, this);
            }
        });
    }

    public static final String a(Context context, o2 o2Var) {
        return StringUtils.getCacheFileSuffix(context, o2Var.f28515a, o2Var.f28516b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4206t.n(j1.k.a(getContext(), "com.braze.storage.braze_push_max_metadata" + ((String) this.f28517c.getValue()), T.c(DataStoreKey.PUSH_MAX_LAST_UPDATE.getKey())), new C4317b(getContext(), "com.braze.storage.braze_push_max_storage" + ((String) this.f28517c.getValue()), null, null, new n2(f28513d), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28514e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.pushmax" + ((String) this.f28517c.getValue());
    }
}
