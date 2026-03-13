package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Geographic {
    public static final Property LATITUDE = Property.internalReal("geo:lat");
    public static final Property LONGITUDE = Property.internalReal("geo:long");
    public static final Property ALTITUDE = Property.internalReal("geo:alt");
    public static final Property TIMESTAMP = Property.internalDate("geo:timestamp");
}
