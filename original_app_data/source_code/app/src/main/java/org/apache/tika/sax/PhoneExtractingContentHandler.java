package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PhoneExtractingContentHandler extends ContentHandlerDecorator {
    private static final String PHONE_NUMBERS = "phonenumbers";
    private final Metadata metadata;
    private final StringBuilder stringBuilder;

    public PhoneExtractingContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.metadata = metadata;
        this.stringBuilder = new StringBuilder();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        try {
            this.stringBuilder.append(new String(Arrays.copyOfRange(cArr, i10, i10 + i11)));
            super.characters(cArr, i10, i11);
        } catch (SAXException e10) {
            handleException(e10);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
        Iterator<String> it = CleanPhoneText.extractPhoneNumbers(this.stringBuilder.toString()).iterator();
        while (it.hasNext()) {
            this.metadata.add(PHONE_NUMBERS, it.next());
        }
    }

    public PhoneExtractingContentHandler() {
        this(new DefaultHandler(), new Metadata());
    }
}
