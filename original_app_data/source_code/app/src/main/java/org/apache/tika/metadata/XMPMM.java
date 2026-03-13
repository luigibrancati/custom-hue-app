package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface XMPMM {
    public static final String NAMESPACE_URI = "http://ns.adobe.com/xap/1.0/mm/";
    public static final String PREFIX = "xmpMM";
    public static final String PREFIX_ = "xmpMM:";
    public static final Property DOCUMENTID = Property.externalText("xmpMM:DocumentID");
    public static final Property INSTANCEID = Property.externalText("xmpMM:InstanceID");
    public static final Property ORIGINAL_DOCUMENTID = Property.externalText("xmpMM:OriginalDocumentID");
    public static final Property RENDITION_CLASS = Property.externalOpenChoise("xmpMM:RenditionClass", "default", "draft", "low-res", "proof", "screen", "thumbnail");
    public static final Property RENDITION_PARAMS = Property.externalText("xmpMM:RenditionParams");
    public static final Property HISTORY_EVENT_INSTANCEID = Property.externalTextBag("xmpMM:History:InstanceID");
    public static final Property HISTORY_ACTION = Property.externalTextBag("xmpMM:History:Action");
    public static final Property HISTORY_WHEN = Property.externalTextBag("xmpMM:History:When");
    public static final Property HISTORY_SOFTWARE_AGENT = Property.externalTextBag("xmpMM:History:SoftwareAgent");
    public static final Property DERIVED_FROM_DOCUMENTID = Property.externalText("xmpMM:DerivedFrom:DocumentID");
    public static final Property DERIVED_FROM_INSTANCEID = Property.externalText("xmpMM:DerivedFrom:InstanceID");
}
