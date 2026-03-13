package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface OfficeOpenXMLCore {
    public static final String NAMESPACE_URI = "http://schemas.openxmlformats.org/package/2006/metadata/core-properties/";
    public static final String PREFIX = "cp";
    public static final Property CATEGORY = Property.externalText("cp:category");
    public static final Property CONTENT_STATUS = Property.externalText("cp:contentStatus");
    public static final Property LAST_MODIFIED_BY = Property.externalText("cp:lastModifiedBy");
    public static final Property LAST_PRINTED = Property.externalDate("cp:lastPrinted");
    public static final Property REVISION = Property.externalText("cp:revision");
    public static final Property VERSION = Property.externalText("cp:version");

    @Deprecated
    public static final Property SUBJECT = Property.composite(Property.externalText("cp:subject"), new Property[]{DublinCore.SUBJECT});
}
