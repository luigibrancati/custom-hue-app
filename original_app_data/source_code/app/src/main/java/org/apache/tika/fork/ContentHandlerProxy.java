package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ContentHandlerProxy implements ContentHandler, ForkProxy {
    public static final int CHARACTERS = 7;
    public static final int END_DOCUMENT = 2;
    public static final int END_ELEMENT = 6;
    public static final int END_PREFIX_MAPPING = 4;
    public static final int IGNORABLE_WHITESPACE = 8;
    public static final int PROCESSING_INSTRUCTION = 9;
    public static final int SKIPPED_ENTITY = 10;
    public static final int START_DOCUMENT = 1;
    public static final int START_ELEMENT = 5;
    public static final int START_PREFIX_MAPPING = 3;
    private static final long serialVersionUID = 737511106054617524L;
    private transient DataOutputStream output;
    private final int resource;

    public ContentHandlerProxy(int i10) {
        this.resource = i10;
    }

    private void doneSending() throws SAXException {
        try {
            this.output.flush();
        } catch (IOException e10) {
            throw new SAXException("Unexpected fork proxy problem", e10);
        }
    }

    private void sendCharacters(char[] cArr, int i10, int i11) throws SAXException {
        try {
            writeString(new String(cArr, i10, i11));
        } catch (IOException e10) {
            throw new SAXException("Unexpected fork proxy problem", e10);
        }
    }

    private void sendRequest(int i10) throws SAXException {
        try {
            this.output.writeByte(3);
            this.output.writeByte(this.resource);
            this.output.writeByte(i10);
        } catch (IOException e10) {
            throw new SAXException("Unexpected fork proxy problem", e10);
        }
    }

    private void sendString(String str) throws SAXException {
        try {
            if (str == null) {
                this.output.writeBoolean(false);
            } else {
                this.output.writeBoolean(true);
                writeString(str);
            }
        } catch (IOException e10) {
            throw new SAXException("Unexpected fork proxy problem", e10);
        }
    }

    private void writeString(String str) throws IOException {
        int iCeil = (int) Math.ceil(((double) str.length()) / ((double) 21845));
        this.output.writeInt(iCeil);
        int i10 = 0;
        while (i10 < iCeil) {
            this.output.writeUTF(str.substring(i10 * 21845, i10 < iCeil + (-1) ? (i10 + 1) * 21845 : str.length()));
            i10++;
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        sendRequest(7);
        sendCharacters(cArr, i10, i11);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        sendRequest(2);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        sendRequest(6);
        sendString(str);
        sendString(str2);
        sendString(str3);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        sendRequest(4);
        sendString(str);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        sendRequest(8);
        sendCharacters(cArr, i10, i11);
        doneSending();
    }

    @Override // org.apache.tika.fork.ForkProxy
    public void init(DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        this.output = dataOutputStream;
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        sendRequest(9);
        sendString(str);
        sendString(str2);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        sendRequest(10);
        sendString(str);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        sendRequest(1);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        sendRequest(5);
        sendString(str);
        sendString(str2);
        sendString(str3);
        int length = attributes != null ? attributes.getLength() : -1;
        try {
            this.output.writeInt(length);
            for (int i10 = 0; i10 < length; i10++) {
                sendString(attributes.getURI(i10));
                sendString(attributes.getLocalName(i10));
                sendString(attributes.getQName(i10));
                sendString(attributes.getType(i10));
                sendString(attributes.getValue(i10));
            }
            doneSending();
        } catch (IOException e10) {
            throw new SAXException("Unexpected fork proxy problem", e10);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        sendRequest(3);
        sendString(str);
        sendString(str2);
        doneSending();
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }
}
