package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ExpandedTitleContentHandler extends ContentHandlerDecorator {
    private static final String TITLE_TAG = "TITLE";
    private boolean isTitleTagOpen;

    public ExpandedTitleContentHandler() {
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        if (!this.isTitleTagOpen || i11 != 0) {
            super.characters(cArr, i10, i11);
        } else {
            try {
                super.characters(new char[0], 0, 1);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
        if (TITLE_TAG.equalsIgnoreCase(str2) && XHTMLContentHandler.XHTML.equals(str)) {
            this.isTitleTagOpen = false;
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        super.startDocument();
        this.isTitleTagOpen = false;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if (TITLE_TAG.equalsIgnoreCase(str2) && XHTMLContentHandler.XHTML.equals(str)) {
            this.isTitleTagOpen = true;
        }
    }

    public ExpandedTitleContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
    }
}
