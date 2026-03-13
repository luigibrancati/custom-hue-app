package org.apache.tika.sax;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EndDocumentShieldingContentHandler extends ContentHandlerDecorator {
    private boolean endDocumentCalled;

    public EndDocumentShieldingContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        this.endDocumentCalled = false;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        this.endDocumentCalled = true;
    }

    public boolean isEndDocumentWasCalled() {
        return this.endDocumentCalled;
    }

    public void reallyEndDocument() throws SAXException {
        super.endDocument();
    }
}
