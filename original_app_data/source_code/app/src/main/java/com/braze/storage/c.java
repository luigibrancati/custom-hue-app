package com.braze.storage;

import i1.C4319d;
import k1.AbstractC4785h;
import kotlin.jvm.internal.C4844a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c extends C4844a implements vc.q {
    public c(BannersDataStoreProvider$Companion bannersDataStoreProvider$Companion) {
        super(3, bannersDataStoreProvider$Companion, BannersDataStoreProvider$Companion.class, "migrateBannerStorageToJson", "migrateBannerStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // vc.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((BannersDataStoreProvider$Companion) this.receiver).migrateBannerStorageToJson((C4319d) obj, (AbstractC4785h) obj2);
    }
}
