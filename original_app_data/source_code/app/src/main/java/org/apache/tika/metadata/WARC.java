package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface WARC {
    public static final String PREFIX = "warc:";
    public static final Property WARC_WARNING = Property.externalTextBag("warc:warning");
    public static final Property WARC_RECORD_CONTENT_TYPE = Property.externalText("warc:record-content-type");
    public static final Property WARC_PAYLOAD_CONTENT_TYPE = Property.externalText("warc:payload-content-type");
    public static final Property WARC_RECORD_ID = Property.externalText("warc:WARC-Record-ID");
}
