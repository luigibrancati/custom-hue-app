package org.apache.tika.sax;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ToXMLContentHandler extends ToTextContentHandler {
    private ElementInfo currentElement;
    private final String encoding;
    protected boolean inStartElement;
    protected final Map<String, String> namespaces;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ElementInfo {
        private final Map<String, String> namespaces;
        private final ElementInfo parent;

        public ElementInfo(ElementInfo elementInfo, Map<String, String> map) {
            this.parent = elementInfo;
            if (map.isEmpty()) {
                this.namespaces = Collections.EMPTY_MAP;
            } else {
                this.namespaces = new HashMap(map);
            }
        }

        public String getPrefix(String str) throws SAXException {
            String str2 = this.namespaces.get(str);
            if (str2 != null) {
                return str2;
            }
            ElementInfo elementInfo = this.parent;
            if (elementInfo != null) {
                return elementInfo.getPrefix(str);
            }
            if (str == null || str.isEmpty()) {
                return "";
            }
            throw new SAXException("Namespace " + str + " not declared");
        }

        public String getQName(String str, String str2) throws SAXException {
            String prefix = getPrefix(str);
            if (prefix.length() <= 0) {
                return str2;
            }
            return prefix + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2;
        }
    }

    public ToXMLContentHandler(OutputStream outputStream, String str) {
        super(outputStream, str);
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = str;
    }

    private void lazyCloseStartElement() throws SAXException {
        if (this.inStartElement) {
            write('>');
            this.inStartElement = false;
        }
    }

    private int writeCharsAndEntity(char[] cArr, int i10, int i11, String str) throws SAXException {
        super.characters(cArr, i10, i11 - i10);
        write('&');
        write(str);
        write(';');
        return i11 + 1;
    }

    private void writeEscaped(char[] cArr, int i10, int i11, boolean z10) throws SAXException {
        int iWriteCharsAndEntity = i10;
        while (i10 < i11) {
            char c10 = cArr[i10];
            if (c10 == '<') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i10, "lt");
            } else if (c10 == '>') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i10, "gt");
            } else if (c10 == '&') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i10, "amp");
            } else if (z10 && c10 == '\"') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i10, "quot");
            } else {
                i10++;
            }
            i10 = iWriteCharsAndEntity;
        }
        super.characters(cArr, iWriteCharsAndEntity, i11 - iWriteCharsAndEntity);
    }

    @Override // org.apache.tika.sax.ToTextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        lazyCloseStartElement();
        writeEscaped(cArr, i10, i11 + i10, false);
    }

    @Override // org.apache.tika.sax.ToTextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (this.inStartElement) {
            write(" />");
            this.inStartElement = false;
        } else {
            write("</");
            write(str3);
            write('>');
        }
        this.namespaces.clear();
        this.currentElement = this.currentElement.parent;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        if (this.encoding != null) {
            write("<?xml version=\"1.0\" encoding=\"");
            write(this.encoding);
            write("\"?>\n");
        }
        this.currentElement = null;
        this.namespaces.clear();
    }

    @Override // org.apache.tika.sax.ToTextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        lazyCloseStartElement();
        this.currentElement = new ElementInfo(this.currentElement, this.namespaces);
        write('<');
        write(this.currentElement.getQName(str, str2));
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            write(' ');
            write(this.currentElement.getQName(attributes.getURI(i10), attributes.getLocalName(i10)));
            write('=');
            write(JsonFactory.DEFAULT_QUOTE_CHAR);
            char[] charArray = attributes.getValue(i10).toCharArray();
            writeEscaped(charArray, 0, charArray.length, true);
            write(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        for (Map.Entry<String, String> entry : this.namespaces.entrySet()) {
            write(' ');
            write("xmlns");
            String value = entry.getValue();
            if (value.length() > 0) {
                write(':');
                write(value);
            }
            write('=');
            write(JsonFactory.DEFAULT_QUOTE_CHAR);
            char[] charArray2 = entry.getKey().toCharArray();
            writeEscaped(charArray2, 0, charArray2.length, true);
            write(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        this.namespaces.clear();
        this.inStartElement = true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
        try {
            ElementInfo elementInfo = this.currentElement;
            if (elementInfo != null) {
                if (str.equals(elementInfo.getPrefix(str2))) {
                    return;
                }
            }
        } catch (SAXException unused) {
        }
        this.namespaces.put(str2, str);
    }

    public void write(char c10) throws SAXException {
        super.characters(new char[]{c10}, 0, 1);
    }

    public void write(String str) throws SAXException {
        super.characters(str.toCharArray(), 0, str.length());
    }

    public ToXMLContentHandler(String str) {
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = str;
    }

    public ToXMLContentHandler() {
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = null;
    }
}
