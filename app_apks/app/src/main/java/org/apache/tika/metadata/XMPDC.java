package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface XMPDC {
    public static final String PREFIX_DC = "xmp:dc";
    public static final String PREFIX_DC_TERMS = "xmp:dcterms";
    public static final Property FORMAT = Property.internalText("xmp:dc:format");
    public static final Property IDENTIFIER = Property.internalText("xmp:dc:identifier");
    public static final Property MODIFIED = Property.internalDate("xmp:dcterms:modified");
    public static final Property CONTRIBUTOR = Property.internalTextBag("xmp:dc:contributor");
    public static final Property COVERAGE = Property.internalText("xmp:dc:coverage");
    public static final Property CREATOR = Property.internalTextBag("xmp:dc:creator");
    public static final Property CREATED = Property.internalDate("xmp:dcterms:created");
    public static final Property DATE = Property.internalDate("xmp:dc:date");
    public static final Property DESCRIPTION = Property.internalText("xmp:dc:description");
    public static final Property LANGUAGE = Property.internalText("xmp:dc:language");
    public static final Property PUBLISHER = Property.internalText("xmp:dc:publisher");
    public static final Property RELATION = Property.internalText("xmp:dc:relation");
    public static final Property RIGHTS = Property.internalText("xmp:dc:rights");
    public static final Property SOURCE = Property.internalText("xmp:dc:source");
    public static final Property SUBJECT = Property.internalTextBag("xmp:dc:subject");
    public static final Property TITLE = Property.internalText("xmp:dc:title");
    public static final Property TYPE = Property.internalText("xmp:dc:type");
}
