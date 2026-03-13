package org.apache.tika.fork;

import org.apache.tika.metadata.Metadata;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MetadataContentHandler extends DefaultHandler {
    private final Metadata metadata;

    public MetadataContentHandler(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if ("meta".equals(str2)) {
            this.metadata.add(attributes.getValue("name"), attributes.getValue("content"));
        }
    }
}
