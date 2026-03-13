package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface RTFMetadata {
    public static final String PREFIX_RTF_META = "rtf_meta";
    public static final String RTF_PICT_META_PREFIX = "rtf_pict:";
    public static final Property THUMBNAIL = Property.internalBoolean("rtf_meta:thumbnail");
    public static final Property EMB_APP_VERSION = Property.internalText("rtf_meta:emb_app_version");
    public static final Property EMB_CLASS = Property.internalText("rtf_meta:emb_class");
    public static final Property EMB_TOPIC = Property.internalText("rtf_meta:emb_topic");
    public static final Property EMB_ITEM = Property.internalText("rtf_meta:emb_item");
    public static final Property CONTAINS_ENCAPSULATED_HTML = Property.internalBoolean("rtf_meta:contains_encapsulated_html");
}
