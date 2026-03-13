package org.apache.tika.sax;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ToHTMLContentHandler extends ToXMLContentHandler {
    private static final Set<String> EMPTY_ELEMENTS = new HashSet(Arrays.asList("area", "base", "basefont", "br", "col", "frame", "hr", "img", "input", "isindex", "link", "meta", "param"));

    public ToHTMLContentHandler(OutputStream outputStream, String str) {
        super(outputStream, str);
    }

    @Override // org.apache.tika.sax.ToXMLContentHandler, org.apache.tika.sax.ToTextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (this.inStartElement) {
            write('>');
            this.inStartElement = false;
            if (EMPTY_ELEMENTS.contains(str2)) {
                this.namespaces.clear();
                return;
            }
        }
        super.endElement(str, str2, str3);
    }

    public ToHTMLContentHandler() {
    }

    @Override // org.apache.tika.sax.ToXMLContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
    }
}
