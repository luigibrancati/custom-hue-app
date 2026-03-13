package org.apache.tika.sax;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ToTextContentHandler extends DefaultHandler {
    private static final String SCRIPT = "SCRIPT";
    private static final String STYLE = "STYLE";
    private int scriptDepth;
    private int styleDepth;
    private final Writer writer;

    public ToTextContentHandler(Writer writer) {
        this.styleDepth = 0;
        this.scriptDepth = 0;
        this.writer = writer;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        if (this.styleDepth + this.scriptDepth != 0) {
            return;
        }
        try {
            this.writer.write(cArr, i10, i11);
        } catch (IOException e10) {
            throw new SAXException("Error writing: " + new String(cArr, i10, i11), e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        try {
            this.writer.flush();
        } catch (IOException e10) {
            throw new SAXException("Error flushing character output", e10);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        String upperCase = str3 == null ? "" : str3.toUpperCase(Locale.ENGLISH);
        if (upperCase.equals(STYLE)) {
            this.styleDepth--;
        }
        if (upperCase.equals(SCRIPT)) {
            this.scriptDepth--;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        characters(cArr, i10, i11);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        String upperCase = str3 == null ? "" : str3.toUpperCase(Locale.ENGLISH);
        if (upperCase.equals(STYLE)) {
            this.styleDepth++;
        }
        if (upperCase.equals(SCRIPT)) {
            this.scriptDepth++;
        }
    }

    public String toString() {
        return this.writer.toString();
    }

    public ToTextContentHandler(OutputStream outputStream, String str) {
        this(new OutputStreamWriter(outputStream, str));
    }

    public ToTextContentHandler() {
        this(new StringWriter());
    }
}
