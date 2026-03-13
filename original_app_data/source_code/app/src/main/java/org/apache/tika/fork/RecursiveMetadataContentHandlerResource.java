package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.RecursiveParserWrapperHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class RecursiveMetadataContentHandlerResource implements ForkResource {
    private static final ContentHandler DEFAULT_HANDLER = new DefaultHandler();
    private final AbstractRecursiveParserWrapperHandler handler;

    public RecursiveMetadataContentHandlerResource(RecursiveParserWrapperHandler recursiveParserWrapperHandler) {
        this.handler = recursiveParserWrapperHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) throws IOException {
        byte b10 = dataInputStream.readByte();
        byte b11 = dataInputStream.readByte();
        ContentHandler contentHandler = DEFAULT_HANDLER;
        if (b11 == 3) {
            contentHandler = (ContentHandler) readObject(dataInputStream);
        } else if (b11 != 4) {
            throw new IllegalArgumentException("Expected HANDLER_AND_METADATA or METADATA_ONLY, but got:" + ((int) b11));
        }
        Metadata metadata = (Metadata) readObject(dataInputStream);
        if (b10 == 1) {
            this.handler.endEmbeddedDocument(contentHandler, metadata);
        } else {
            if (b10 != 2) {
                throw new IllegalArgumentException("Expected either 0x01 or 0x02, but got: " + ((int) b10));
            }
            this.handler.endDocument(contentHandler, metadata);
        }
        byte b12 = dataInputStream.readByte();
        if (b12 == 5) {
            return;
        }
        throw new IOException("Expected the 'complete' signal, but got: " + ((int) b12));
    }

    private Object readObject(DataInputStream dataInputStream) throws IOException {
        try {
            return ForkObjectInputStream.readObject(dataInputStream, getClass().getClassLoader());
        } catch (ClassNotFoundException e10) {
            throw new IOException(e10);
        }
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
