package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface DublinCore {
    public static final String NAMESPACE_URI_DC = "http://purl.org/dc/elements/1.1/";
    public static final String NAMESPACE_URI_DC_TERMS = "http://purl.org/dc/terms/";
    public static final String PREFIX_DC = "dc";
    public static final String PREFIX_DC_TERMS = "dcterms";
    public static final Property FORMAT = Property.internalText("dc:format");
    public static final Property IDENTIFIER = Property.internalText("dc:identifier");
    public static final Property MODIFIED = Property.internalDate("dcterms:modified");
    public static final Property CONTRIBUTOR = Property.internalTextBag("dc:contributor");
    public static final Property COVERAGE = Property.internalText("dc:coverage");
    public static final Property CREATOR = Property.internalTextBag("dc:creator");
    public static final Property CREATED = Property.internalDate("dcterms:created");
    public static final Property DATE = Property.internalDate("dc:date");
    public static final Property DESCRIPTION = Property.internalText("dc:description");
    public static final Property LANGUAGE = Property.internalText("dc:language");
    public static final Property PUBLISHER = Property.internalText("dc:publisher");
    public static final Property RELATION = Property.internalText("dc:relation");
    public static final Property RIGHTS = Property.internalText("dc:rights");
    public static final Property SOURCE = Property.internalText("dc:source");
    public static final Property SUBJECT = Property.internalTextBag("dc:subject");
    public static final Property TITLE = Property.internalText("dc:title");
    public static final Property TYPE = Property.internalText("dc:type");
}
