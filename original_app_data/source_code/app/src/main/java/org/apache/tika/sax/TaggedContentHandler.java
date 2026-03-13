package org.apache.tika.sax;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TaggedContentHandler extends ContentHandlerDecorator {
    public TaggedContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator
    public void handleException(SAXException sAXException) throws TaggedSAXException {
        throw new TaggedSAXException(sAXException, this);
    }

    public boolean isCauseOf(SAXException sAXException) {
        return (sAXException instanceof TaggedSAXException) && this == ((TaggedSAXException) sAXException).getTag();
    }

    public void throwIfCauseOf(Exception exc) throws SAXException {
        if (exc instanceof TaggedSAXException) {
            TaggedSAXException taggedSAXException = (TaggedSAXException) exc;
            if (this == taggedSAXException.getTag()) {
                throw taggedSAXException.getCause();
            }
        }
    }
}
