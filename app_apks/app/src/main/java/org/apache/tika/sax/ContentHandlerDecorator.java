package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ContentHandlerDecorator extends DefaultHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ContentHandler handler;

    public ContentHandlerDecorator(ContentHandler contentHandler) {
        this.handler = contentHandler;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        try {
            this.handler.characters(cArr, i10, i11);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        try {
            this.handler.endDocument();
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        try {
            this.handler.endElement(str, str2, str3);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        try {
            this.handler.endPrefixMapping(str);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        ContentHandler contentHandler = this.handler;
        if (contentHandler instanceof ErrorHandler) {
            ((ErrorHandler) contentHandler).error(sAXParseException);
        } else {
            super.error(sAXParseException);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        ContentHandler contentHandler = this.handler;
        if (contentHandler instanceof ErrorHandler) {
            ((ErrorHandler) contentHandler).fatalError(sAXParseException);
        } else {
            super.fatalError(sAXParseException);
        }
    }

    public void handleException(SAXException sAXException) throws SAXException {
        ContentHandler contentHandler = this.handler;
        if (!(contentHandler instanceof ContentHandlerDecorator)) {
            throw sAXException;
        }
        ((ContentHandlerDecorator) contentHandler).handleException(sAXException);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        try {
            this.handler.ignorableWhitespace(cArr, i10, i11);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        try {
            this.handler.processingInstruction(str, str2);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    public void setContentHandler(ContentHandler contentHandler) {
        this.handler = contentHandler;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.handler.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        try {
            this.handler.skippedEntity(str);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        try {
            this.handler.startDocument();
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        try {
            this.handler.startElement(str, str2, str3, attributes);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        try {
            this.handler.startPrefixMapping(str, str2);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    public String toString() {
        return this.handler.toString();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        ContentHandler contentHandler = this.handler;
        if (contentHandler instanceof ErrorHandler) {
            ((ErrorHandler) contentHandler).warning(sAXParseException);
        } else {
            super.warning(sAXParseException);
        }
    }

    public ContentHandlerDecorator() {
        this(new DefaultHandler());
    }
}
