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
public final class e extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BannersDataStoreProvider$Companion f28417d = new BannersDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28418e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28419a = str;
        this.f28420b = apiKey;
        this.f28421c = C4029l.b(new InterfaceC6082a() { // from class: r5.o1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.e.a(context, this);
            }
        });
    }

    public static final String a(Context context, e eVar) {
        return StringUtils.getCacheFileSuffix(context, eVar.f28419a, eVar.f28420b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        C4317b c4317bA = j1.k.a(getContext(), "com.braze.managers.banners.eligibility" + ((String) this.f28421c.getValue()), T.c(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String str = "com.braze.managers.banners.storage" + ((String) this.f28421c.getValue());
        BannersDataStoreProvider$Companion bannersDataStoreProvider$Companion = f28417d;
        return createOrGetDataStore(C4206t.n(c4317bA, new C4317b(context, str, null, null, new c(bannersDataStoreProvider$Companion), 12, null), new C4317b(getContext(), "com.braze.managers.banners.impressions" + ((String) this.f28421c.getValue()), null, null, new d(bannersDataStoreProvider$Companion), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28418e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.banners" + ((String) this.f28421c.getValue());
    }
}
