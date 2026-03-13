package org.apache.tika.sax;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.filter.NoOpFilter;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RecursiveParserWrapperHandler extends AbstractRecursiveParserWrapperHandler {
    private final MetadataFilter metadataFilter;
    protected final List<Metadata> metadataList;

    public RecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory) {
        this(contentHandlerFactory, -1, NoOpFilter.NOOP_FILTER);
    }

    private void writeFinalEmbeddedPaths() {
        HashMap map = new HashMap();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (Metadata metadata : this.metadataList) {
            String str = metadata.get(TikaCoreProperties.EMBEDDED_ID);
            if (str != null) {
                map.put(str, RecursiveParserWrapper.getResourceName(metadata, atomicInteger));
            }
        }
        for (Metadata metadata2 : this.metadataList) {
            String strSubstring = metadata2.get(TikaCoreProperties.EMBEDDED_ID_PATH);
            if (strSubstring != null) {
                if (strSubstring.startsWith("/")) {
                    strSubstring = strSubstring.substring(1);
                }
                String[] strArrSplit = strSubstring.split("/");
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : strArrSplit) {
                    sb2.append("/");
                    sb2.append((String) map.get(str2));
                }
                metadata2.set(TikaCoreProperties.FINAL_EMBEDDED_RESOURCE_PATH, sb2.toString());
            }
        }
    }

    public void addContent(ContentHandler contentHandler, Metadata metadata) {
        String string;
        if (contentHandler.getClass().equals(DefaultHandler.class) || (string = contentHandler.toString()) == null || org.apache.tika.config.a.a(string)) {
            return;
        }
        metadata.add(TikaCoreProperties.TIKA_CONTENT, string);
        metadata.add(TikaCoreProperties.TIKA_CONTENT_HANDLER, contentHandler.getClass().getSimpleName());
    }

    @Override // org.apache.tika.sax.AbstractRecursiveParserWrapperHandler
    public void endDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        super.endDocument(contentHandler, metadata);
        addContent(contentHandler, metadata);
        try {
            this.metadataFilter.filter(metadata);
            if (metadata.size() > 0) {
                this.metadataList.add(0, ParserUtils.cloneMetadata(metadata));
            }
            writeFinalEmbeddedPaths();
        } catch (TikaException e10) {
            throw new SAXException(e10);
        }
    }

    @Override // org.apache.tika.sax.AbstractRecursiveParserWrapperHandler
    public void endEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        super.endEmbeddedDocument(contentHandler, metadata);
        addContent(contentHandler, metadata);
        try {
            this.metadataFilter.filter(metadata);
            if (metadata.size() > 0) {
                this.metadataList.add(ParserUtils.cloneMetadata(metadata));
            }
        } catch (TikaException e10) {
            throw new SAXException(e10);
        }
    }

    public List<Metadata> getMetadataList() {
        return this.metadataList;
    }

    @Override // org.apache.tika.sax.AbstractRecursiveParserWrapperHandler
    public void startEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        super.startEmbeddedDocument(contentHandler, metadata);
    }

    public RecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory, int i10) {
        this(contentHandlerFactory, i10, NoOpFilter.NOOP_FILTER);
    }

    public RecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory, int i10, MetadataFilter metadataFilter) {
        super(contentHandlerFactory, i10);
        this.metadataList = new LinkedList();
        this.metadataFilter = metadataFilter;
    }
}
