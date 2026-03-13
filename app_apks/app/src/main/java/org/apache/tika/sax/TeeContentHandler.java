package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TeeContentHandler extends DefaultHandler {
    private final ContentHandler[] handlers;

    public TeeContentHandler(ContentHandler... contentHandlerArr) {
        this.handlers = contentHandlerArr;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.characters(cArr, i10, i11);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.endDocument();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.endElement(str, str2, str3);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.endPrefixMapping(str);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.ignorableWhitespace(cArr, i10, i11);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.processingInstruction(str, str2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.setDocumentLocator(locator);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.skippedEntity(str);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.startDocument();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.startElement(str, str2, str3, attributes);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        for (ContentHandler contentHandler : this.handlers) {
            contentHandler.startPrefixMapping(str, str2);
        }
    }
}
