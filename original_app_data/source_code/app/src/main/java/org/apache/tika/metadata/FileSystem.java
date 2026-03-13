package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface FileSystem {
    public static final String PREFIX = "fs:";
    public static final Property CREATED = Property.externalDate("fs:created");
    public static final Property MODIFIED = Property.externalDate("fs:modified");
    public static final Property ACCESSED = Property.externalDate("fs:accessed");
}
