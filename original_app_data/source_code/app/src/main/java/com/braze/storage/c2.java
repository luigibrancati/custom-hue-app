package com.braze.storage;

import i1.C4319d;
import k1.AbstractC4785h;
import kotlin.jvm.internal.C4844a;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 extends C4844a implements vc.q {
    public c2(a2 a2Var) {
        super(3, a2Var, a2.class, "migrateGeofencesListToJson", "migrateGeofencesListToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // vc.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return GeofenceDataStoreProvider.getDataStore$migrateGeofencesListToJson((a2) this.receiver, (C4319d) obj, (AbstractC4785h) obj2, (InterfaceC4988e) obj3);
    }
}
