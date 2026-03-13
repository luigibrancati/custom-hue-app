package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SafeContentHandler extends ContentHandlerDecorator {
    private static final char[] REPLACEMENT = {65533};
    private final Output charactersOutput;
    private final Output ignorableWhitespaceOutput;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Output {
        void write(char[] cArr, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class StringOutput implements Output {
        private final StringBuilder builder;

        public String toString() {
            return this.builder.toString();
        }

        @Override // org.apache.tika.sax.SafeContentHandler.Output
        public void write(char[] cArr, int i10, int i11) {
            this.builder.append(cArr, i10, i11);
        }

        private StringOutput() {
            this.builder = new StringBuilder();
        }
    }

    public SafeContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        this.charactersOutput = new Output() { // from class: org.apache.tika.sax.a
            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i10, int i11) throws SAXException {
                SafeContentHandler.a(this.f41603a, cArr, i10, i11);
            }
        };
        this.ignorableWhitespaceOutput = new Output() { // from class: org.apache.tika.sax.b
            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i10, int i11) throws SAXException {
                SafeContentHandler.b(this.f41604a, cArr, i10, i11);
            }
        };
    }

    public static /* synthetic */ void a(SafeContentHandler safeContentHandler, char[] cArr, int i10, int i11) throws SAXException {
        safeContentHandler.getClass();
        super.characters(cArr, i10, i11);
    }

    public static /* synthetic */ void b(SafeContentHandler safeContentHandler, char[] cArr, int i10, int i11) throws SAXException {
        safeContentHandler.getClass();
        super.ignorableWhitespace(cArr, i10, i11);
    }

    private void filter(char[] cArr, int i10, int i11, Output output) {
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            int iCodePointAt = Character.codePointAt(cArr, i10, i12);
            int iCharCount = Character.charCount(iCodePointAt) + i10;
            if (isInvalid(iCodePointAt)) {
                if (i10 > i13) {
                    output.write(cArr, i13, i10 - i13);
                }
                writeReplacement(output);
                i13 = iCharCount;
            }
            i10 = iCharCount;
        }
        output.write(cArr, i13, i12 - i13);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        filter(cArr, i10, i11, this.charactersOutput);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        filter(cArr, i10, i11, this.ignorableWhitespaceOutput);
    }

    public boolean isInvalid(int i10) {
        return i10 < 32 ? (i10 == 9 || i10 == 10 || i10 == 13) ? false : true : i10 < 57344 ? i10 > 55295 : i10 < 65536 ? i10 > 65533 : i10 > 1114111;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int i10 = 0;
        while (true) {
            if (i10 >= attributes.getLength()) {
                break;
            }
            if (isInvalid(attributes.getValue(i10))) {
                AttributesImpl attributesImpl = new AttributesImpl();
                for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                    String value = attributes.getValue(i11);
                    if (i11 >= i10 && isInvalid(value)) {
                        Output stringOutput = new StringOutput();
                        filter(value.toCharArray(), 0, value.length(), stringOutput);
                        value = stringOutput.toString();
                    }
                    attributesImpl.addAttribute(attributes.getURI(i11), attributes.getLocalName(i11), attributes.getQName(i11), attributes.getType(i11), value);
                }
                attributes = attributesImpl;
            } else {
                i10++;
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void writeReplacement(Output output) {
        char[] cArr = REPLACEMENT;
        output.write(cArr, 0, cArr.length);
    }

    private boolean isInvalid(String str) {
        char[] charArray = str.toCharArray();
        int iCharCount = 0;
        while (iCharCount < charArray.length) {
            int iCodePointAt = Character.codePointAt(charArray, iCharCount);
            if (isInvalid(iCodePointAt)) {
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }
}
