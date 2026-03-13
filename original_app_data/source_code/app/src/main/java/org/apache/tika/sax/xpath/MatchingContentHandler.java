package org.apache.tika.sax.xpath;

import java.util.LinkedList;
import org.apache.tika.sax.ContentHandlerDecorator;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class MatchingContentHandler extends ContentHandlerDecorator {
    private Matcher matcher;
    private final LinkedList<Matcher> matchers;

    public MatchingContentHandler(ContentHandler contentHandler, Matcher matcher) {
        super(contentHandler);
        this.matchers = new LinkedList<>();
        this.matcher = matcher;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        if (this.matcher.matchesText()) {
            super.characters(cArr, i10, i11);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (this.matcher.matchesElement()) {
            super.endElement(str, str2, str3);
        }
        if (this.matchers.isEmpty()) {
            return;
        }
        this.matcher = this.matchers.removeFirst();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        if (this.matcher.matchesText()) {
            super.ignorableWhitespace(cArr, i10, i11);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        if (this.matcher.matchesText()) {
            super.skippedEntity(str);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        this.matchers.addFirst(this.matcher);
        this.matcher = this.matcher.descend(str, str2);
        AttributesImpl attributesImpl = new AttributesImpl();
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String uri = attributes.getURI(i10);
            String localName = attributes.getLocalName(i10);
            if (this.matcher.matchesAttribute(uri, localName)) {
                attributesImpl.addAttribute(uri, localName, attributes.getQName(i10), attributes.getType(i10), attributes.getValue(i10));
            }
        }
        if (this.matcher.matchesElement() || attributesImpl.getLength() > 0) {
            super.startElement(str, str2, str3, attributesImpl);
            if (this.matcher.matchesElement()) {
                return;
            }
            this.matcher = new CompositeMatcher(this.matcher, ElementMatcher.INSTANCE);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
    }
}
