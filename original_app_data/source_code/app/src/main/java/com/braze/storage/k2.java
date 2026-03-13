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
public final class k2 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i2 f28476d = new i2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28477e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(final Context context, String str, String str2) {
        super(context);
        AbstractC4862t.e(context, "context");
        this.f28478a = str;
        this.f28479b = str2;
        this.f28480c = C4029l.b(new InterfaceC6082a() { // from class: r5.K1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.k2.a(context, this);
            }
        });
    }

    public static final String a(Context context, k2 k2Var) {
        return StringUtils.getCacheFileSuffix(context, k2Var.f28478a, k2Var.f28479b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        return createOrGetDataStore(C4205s.d(new C4317b(getContext(), "com.braze.storage.push_identifier_storage" + ((String) this.f28480c.getValue()), null, null, new j2(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28477e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_identifier" + ((String) this.f28480c.getValue());
    }
}
