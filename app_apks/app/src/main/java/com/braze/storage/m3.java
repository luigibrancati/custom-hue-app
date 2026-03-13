package com.braze.storage;

import android.content.Context;
import com.braze.support.StringUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import g1.InterfaceC4099i;
import gc.C4206t;
import i1.C4317b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m3 extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TriggerDataStoreProvider$Companion f28493d = new TriggerDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28494e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28495a = str;
        this.f28496b = apiKey;
        this.f28497c = C4029l.b(new InterfaceC6082a() { // from class: r5.U1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.m3.a(context, this);
            }
        });
    }

    public static final String a(Context context, m3 m3Var) {
        return StringUtils.getCacheFileSuffix(context, m3Var.f28495a, m3Var.f28496b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        Context context = getContext();
        String str = "com.appboy.storage.triggers.actions" + ((String) this.f28497c.getValue());
        TriggerDataStoreProvider$Companion triggerDataStoreProvider$Companion = f28493d;
        return createOrGetDataStore(C4206t.n(new C4317b(context, str, null, null, new k3(triggerDataStoreProvider$Companion), 12, null), new C4317b(getContext(), "com.appboy.storage.triggers.re_eligibility" + ((String) this.f28497c.getValue()), null, null, new l3(triggerDataStoreProvider$Companion), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28494e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.triggers." + ((String) this.f28497c.getValue());
    }
}
