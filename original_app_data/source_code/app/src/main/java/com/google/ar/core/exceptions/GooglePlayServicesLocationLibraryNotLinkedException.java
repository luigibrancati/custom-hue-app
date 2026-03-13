package com.google.ar.core.exceptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesLocationLibraryNotLinkedException extends UnsupportedConfigurationException {
    public GooglePlayServicesLocationLibraryNotLinkedException() {
        this("");
    }

    public GooglePlayServicesLocationLibraryNotLinkedException(String str) {
        super("The Google Fused Location Provider for Android classes must be linked into the app's binary when calling Session.configure() with Geospatial mode enabled (Config.GeospatialMode.ENABLED). ".concat(String.valueOf(str)));
    }
}
