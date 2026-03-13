package org.apache.tika.sax;

import org.apache.tika.metadata.DublinCore;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Photoshop;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.XMP;
import org.apache.tika.metadata.XMPIdq;
import org.apache.tika.metadata.XMPMM;
import org.apache.tika.metadata.XMPRights;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class XMPContentHandler extends SafeContentHandler {
    private static final Attributes EMPTY_ATTRIBUTES = new AttributesImpl();
    public static final String RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
    public static final String XMP = "http://ns.adobe.com/xap/1.0/";
    private String prefix;
    private String uri;

    public XMPContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        this.prefix = null;
        this.uri = null;
    }

    private void description(Metadata metadata, String str, String str2) throws SAXException {
        int i10 = 0;
        for (Property property : Property.getProperties(str)) {
            String str3 = metadata.get(property);
            if (str3 != null) {
                int i11 = i10 + 1;
                if (i10 == 0) {
                    startDescription("", str, str2);
                }
                property(property.getName().substring(str.length() + 1), str3);
                i10 = i11;
            }
        }
        if (i10 > 0) {
            endDescription();
        }
    }

    public void endDescription() throws SAXException {
        endElement(RDF, "Description", "rdf:Description");
        endPrefixMapping(this.prefix);
        this.uri = null;
        this.prefix = null;
    }

    @Override // org.apache.tika.sax.SafeContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        endElement(RDF, "RDF", "rdf:RDF");
        endPrefixMapping(XMP.PREFIX);
        endPrefixMapping("rdf");
        super.endDocument();
    }

    public void metadata(Metadata metadata) throws SAXException {
        description(metadata, XMP.PREFIX, "http://ns.adobe.com/xap/1.0/");
        description(metadata, DublinCore.PREFIX_DC, DublinCore.NAMESPACE_URI_DC);
        description(metadata, "xmpTPg", "http://ns.adobe.com/xap/1.0/t/pg/");
        description(metadata, "xmpRigths", XMPRights.NAMESPACE_URI_XMP_RIGHTS);
        description(metadata, XMPMM.PREFIX, XMPMM.NAMESPACE_URI);
        description(metadata, XMPIdq.PREFIX, XMPIdq.NAMESPACE_URI);
        description(metadata, "xmpBJ", "http://ns.adobe.com/xap/1.0/bj/");
        description(metadata, "xmpDM", "http://ns.adobe.com/xmp/1.0/DynamicMedia/");
        description(metadata, "pdf", "http://ns.adobe.com/pdf/1.3/");
        description(metadata, Photoshop.PREFIX_PHOTOSHOP, "s http://ns.adobe.com/photoshop/1.0/");
        description(metadata, "crs", "http://ns.adobe.com/camera-raw-settings/1.0/");
        description(metadata, "tiff", "http://ns.adobe.com/tiff/1.0/");
        description(metadata, "exif", "http://ns.adobe.com/exif/1.0/");
        description(metadata, "aux", "http://ns.adobe.com/exif/1.0/aux/");
    }

    public void property(String str, String str2) throws SAXException {
        String str3 = this.prefix + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str;
        startElement(this.uri, str, str3, EMPTY_ATTRIBUTES);
        characters(str2.toCharArray(), 0, str2.length());
        endElement(this.uri, str, str3);
    }

    public void startDescription(String str, String str2, String str3) throws SAXException {
        this.prefix = str2;
        this.uri = str3;
        startPrefixMapping(str2, str3);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute(RDF, "about", "rdf:about", "CDATA", str);
        startElement(RDF, "Description", "rdf:Description", attributesImpl);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        super.startDocument();
        startPrefixMapping("rdf", RDF);
        startPrefixMapping(XMP.PREFIX, "http://ns.adobe.com/xap/1.0/");
        startElement(RDF, "RDF", "rdf:RDF", EMPTY_ATTRIBUTES);
    }
}
