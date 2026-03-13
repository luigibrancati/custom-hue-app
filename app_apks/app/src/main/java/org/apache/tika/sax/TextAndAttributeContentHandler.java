package org.apache.tika.sax;

import org.apache.tika.utils.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TextAndAttributeContentHandler extends TextContentHandler {
    public TextAndAttributeContentHandler(ContentHandler contentHandler) {
        this(contentHandler, false);
    }

    @Override // org.apache.tika.sax.TextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        int length = attributes.getLength();
        if (length > 0) {
            char[] charArray = (str2.trim() + StringUtils.SPACE).toCharArray();
            characters(charArray, 0, charArray.length);
            for (int i10 = 0; i10 < length; i10++) {
                char[] charArray2 = (attributes.getLocalName(i10).trim() + StringUtils.SPACE).toCharArray();
                char[] charArray3 = (attributes.getValue(i10).trim() + StringUtils.SPACE).toCharArray();
                characters(charArray2, 0, charArray2.length);
                characters(charArray3, 0, charArray3.length);
            }
        }
    }

    public TextAndAttributeContentHandler(ContentHandler contentHandler, boolean z10) {
        super(contentHandler, z10);
    }
}
