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
public final class m extends DataStoreProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ContentCardsDataStoreProvider$Companion f28483d = new ContentCardsDataStoreProvider$Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f28484e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f28487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(final Context context, String str, String apiKey) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28485a = str;
        this.f28486b = apiKey;
        this.f28487c = C4029l.b(new InterfaceC6082a() { // from class: r5.Q1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.m.a(context, this);
            }
        });
    }

    public static final String a(Context context, m mVar) {
        return StringUtils.getCacheFileSuffix(context, mVar.f28485a, mVar.f28486b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC4099i getDataStore() {
        Context context = getContext();
        String str = "com.appboy.storage.content_cards_storage_provider.cards" + ((String) this.f28487c.getValue());
        ContentCardsDataStoreProvider$Companion contentCardsDataStoreProvider$Companion = f28483d;
        return createOrGetDataStore(C4206t.n(new C4317b(context, str, null, null, new k(contentCardsDataStoreProvider$Companion), 12, null), new C4317b(getContext(), "com.braze.storage.content_cards_storage_provider.metadata" + ((String) this.f28487c.getValue()), null, null, new l(contentCardsDataStoreProvider$Companion), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f28484e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.contentcards." + ((String) this.f28487c.getValue());
    }
}
