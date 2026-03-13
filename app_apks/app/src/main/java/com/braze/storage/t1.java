package com.braze.storage;

import i1.C4319d;
import k1.AbstractC4785h;
import kotlin.jvm.internal.C4844a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t1 extends C4844a implements vc.q {
    public t1(EventDuplicationValidatorDataStoreProvider$Companion eventDuplicationValidatorDataStoreProvider$Companion) {
        super(3, eventDuplicationValidatorDataStoreProvider$Companion, EventDuplicationValidatorDataStoreProvider$Companion.class, "migrateEventDuplicationMap", "migrateEventDuplicationMap(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // vc.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((EventDuplicationValidatorDataStoreProvider$Companion) this.receiver).migrateEventDuplicationMap((C4319d) obj, (AbstractC4785h) obj2);
    }
}
