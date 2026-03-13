package org.apache.tika.extractor;

import af.c;
import af.e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import org.apache.tika.exception.CorruptedFileException;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.EmbeddedContentHandler;
import org.apache.tika.sax.XHTMLContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RUnpackExtractor extends ParsingEmbeddedDocumentExtractor {
    private long bytesExtracted;
    private EmbeddedBytesSelector embeddedBytesSelector;
    private final long maxEmbeddedBytesForExtraction;
    private static final c LOGGER = e.l(ParsingEmbeddedDocumentExtractor.class);
    private static final File ABSTRACT_PATH = new File("");

    public RUnpackExtractor(ParseContext parseContext, long j10) {
        super(parseContext);
        this.embeddedBytesSelector = EmbeddedBytesSelector.ACCEPT_ALL;
        this.bytesExtracted = 0L;
        this.maxEmbeddedBytesForExtraction = j10;
    }

    private void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata) {
        getDelegatingParser().parse(inputStream, new EmbeddedContentHandler(new BodyContentHandler(contentHandler)), metadata, this.context);
    }

    private void parseWithBytes(TikaInputStream tikaInputStream, ContentHandler contentHandler, Metadata metadata) {
        Path path = tikaInputStream.getPath();
        try {
            parse(Ne.a.a(tikaInputStream), contentHandler, metadata);
        } finally {
            storeEmbeddedBytes(path, metadata);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void storeEmbeddedBytes(java.nio.file.Path r10, org.apache.tika.metadata.Metadata r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.extractor.RUnpackExtractor.storeEmbeddedBytes(java.nio.file.Path, org.apache.tika.metadata.Metadata):void");
    }

    public EmbeddedBytesSelector getEmbeddedBytesSelector() {
        return this.embeddedBytesSelector;
    }

    @Override // org.apache.tika.extractor.ParsingEmbeddedDocumentExtractor, org.apache.tika.extractor.EmbeddedDocumentExtractor
    public void parseEmbedded(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, boolean z10) throws SAXException, IOException {
        TemporaryResources temporaryResources;
        Object openContainer;
        if (z10) {
            AttributesImpl attributesImpl = new AttributesImpl();
            attributesImpl.addAttribute("", Constants.CLASS, Constants.CLASS, "CDATA", "package-entry");
            contentHandler.startElement(XHTMLContentHandler.XHTML, "div", "div", attributesImpl);
        }
        String str = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        if (isWriteFileNameToContent() && str != null && str.length() > 0 && z10) {
            contentHandler.startElement(XHTMLContentHandler.XHTML, "h1", "h1", new AttributesImpl());
            char[] charArray = str.toCharArray();
            contentHandler.characters(charArray, 0, charArray.length);
            contentHandler.endElement(XHTMLContentHandler.XHTML, "h1", "h1");
        }
        try {
            temporaryResources = new TemporaryResources();
        } catch (CorruptedFileException e10) {
            throw new IOException(e10);
        } catch (EncryptedDocumentException e11) {
            recordException(e11, this.context);
        } catch (TikaException e12) {
            recordException(e12, this.context);
        }
        try {
            TikaInputStream tikaInputStream = TikaInputStream.get(Ne.a.a(inputStream), temporaryResources, metadata);
            if ((inputStream instanceof TikaInputStream) && (openContainer = ((TikaInputStream) inputStream).getOpenContainer()) != null) {
                tikaInputStream.setOpenContainer(openContainer);
            }
            if (((EmbeddedDocumentBytesHandler) this.context.get(EmbeddedDocumentBytesHandler.class)) != null) {
                parseWithBytes(tikaInputStream, contentHandler, metadata);
            } else {
                parse(tikaInputStream, contentHandler, metadata);
            }
            temporaryResources.close();
            if (z10) {
                contentHandler.endElement(XHTMLContentHandler.XHTML, "div", "div");
            }
        } finally {
        }
    }

    public void setEmbeddedBytesSelector(EmbeddedBytesSelector embeddedBytesSelector) {
        this.embeddedBytesSelector = embeddedBytesSelector;
    }
}
