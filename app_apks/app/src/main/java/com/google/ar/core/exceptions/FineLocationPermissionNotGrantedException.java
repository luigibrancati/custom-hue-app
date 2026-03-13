package com.google.ar.core.exceptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FineLocationPermissionNotGrantedException extends SecurityException {
    public FineLocationPermissionNotGrantedException() {
        this("");
    }

    public FineLocationPermissionNotGrantedException(String str) {
        super("The Android permission ACCESS_FINE_LOCATION has not been granted prior to calling Session.configure() with Geospatial mode enabled (Config.GeospatialMode.ENABLED).".concat(String.valueOf(str)));
    }
}
