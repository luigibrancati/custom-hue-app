package com.braze.location;

import com.braze.storage.GeofenceDataStoreProvider;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f27795a;

    public a(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        AbstractC4862t.e(geofenceDataStoreProvider, "geofenceDataStoreProvider");
        this.f27795a = geofenceDataStoreProvider;
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(null).newInstance(null);
            AbstractC4862t.c(objNewInstance, "null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
            android.support.v4.media.session.a.a(objNewInstance);
        } catch (Exception unused) {
        }
    }
}
