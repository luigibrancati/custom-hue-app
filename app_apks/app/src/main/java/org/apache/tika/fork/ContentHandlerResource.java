package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ContentHandlerResource implements ForkResource {
    private final ContentHandler handler;

    public ContentHandlerResource(ContentHandler contentHandler) {
        this.handler = contentHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) throws SAXException, IOException {
        AttributesImpl attributesImpl;
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 1) {
            this.handler.startDocument();
            return;
        }
        if (unsignedByte == 2) {
            this.handler.endDocument();
            return;
        }
        if (unsignedByte == 3) {
            this.handler.startPrefixMapping(readString(dataInputStream), readString(dataInputStream));
            return;
        }
        if (unsignedByte == 4) {
            this.handler.endPrefixMapping(readString(dataInputStream));
            return;
        }
        if (unsignedByte == 5) {
            String string = readString(dataInputStream);
            String string2 = readString(dataInputStream);
            String string3 = readString(dataInputStream);
            int i10 = dataInputStream.readInt();
            if (i10 >= 0) {
                attributesImpl = new AttributesImpl();
                for (int i11 = 0; i11 < i10; i11++) {
                    attributesImpl.addAttribute(readString(dataInputStream), readString(dataInputStream), readString(dataInputStream), readString(dataInputStream), readString(dataInputStream));
                }
            } else {
                attributesImpl = null;
            }
            this.handler.startElement(string, string2, string3, attributesImpl);
            return;
        }
        if (unsignedByte == 6) {
            this.handler.endElement(readString(dataInputStream), readString(dataInputStream), readString(dataInputStream));
            return;
        }
        if (unsignedByte == 7) {
            char[] characters = readCharacters(dataInputStream);
            this.handler.characters(characters, 0, characters.length);
        } else if (unsignedByte == 8) {
            char[] characters2 = readCharacters(dataInputStream);
            this.handler.characters(characters2, 0, characters2.length);
        } else if (unsignedByte == 9) {
            this.handler.processingInstruction(readString(dataInputStream), readString(dataInputStream));
        } else if (unsignedByte == 10) {
            this.handler.skippedEntity(readString(dataInputStream));
        }
    }

    private char[] readCharacters(DataInputStream dataInputStream) {
        return readStringUTF(dataInputStream).toCharArray();
    }

    private String readString(DataInputStream dataInputStream) {
        if (dataInputStream.readBoolean()) {
            return readStringUTF(dataInputStream);
        }
        return null;
    }

    private String readStringUTF(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(dataInputStream.readUTF());
        }
        return sb2.toString();
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        try {
            internalProcess(dataInputStream);
            return null;
        } catch (SAXException e10) {
            return e10;
        }
    }
}
