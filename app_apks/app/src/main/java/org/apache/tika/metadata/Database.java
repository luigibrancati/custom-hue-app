package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Database {
    public static final String PREFIX = "database:";
    public static final Property TABLE_NAME = Property.externalTextBag("database:table_name");
    public static final Property ROW_COUNT = Property.externalInteger("database:row_count");
    public static final Property COLUMN_COUNT = Property.externalInteger("database:column_count");
    public static final Property COLUMN_NAME = Property.externalTextBag("database:column_name");
}
