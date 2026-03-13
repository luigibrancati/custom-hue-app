package com.braze.storage;

import i1.C4319d;
import k1.AbstractC4785h;
import kotlin.jvm.internal.C4844a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n2 extends C4844a implements vc.q {
    public n2(PushMaxDataStoreProvider$Companion pushMaxDataStoreProvider$Companion) {
        super(3, pushMaxDataStoreProvider$Companion, PushMaxDataStoreProvider$Companion.class, "migratePushMaxStorageToJson", "migratePushMaxStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // vc.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PushMaxDataStoreProvider$Companion) this.receiver).migratePushMaxStorageToJson((C4319d) obj, (AbstractC4785h) obj2);
    }
}
