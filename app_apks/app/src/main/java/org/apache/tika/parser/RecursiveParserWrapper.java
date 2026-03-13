package org.apache.tika.parser;

import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.exception.CorruptedFileException;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.exception.ZeroByteFileException;
import org.apache.tika.extractor.ParentContentHandler;
import org.apache.tika.io.FilenameUtils;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.ContentHandlerFactory;
import org.apache.tika.sax.SecureContentHandler;
import org.apache.tika.sax.WriteLimiter;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RecursiveParserWrapper extends ParserDecorator {
    private static final long serialVersionUID = 9086536568120690938L;
    private final boolean catchEmbeddedExceptions;
    private final boolean inlineContent;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class EmbeddedParserDecorator extends StatefulParser {
        private static final long serialVersionUID = 207648200464263337L;
        private String embeddedIdPath;
        private String location;
        private final ParserState parserState;

        @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
        public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws SAXException {
            String str;
            TemporaryResources temporaryResources;
            TikaInputStream tikaInputStream;
            if (this.parserState.recursiveParserWrapperHandler.hasHitMaximumEmbeddedResources()) {
                return;
            }
            String resourceName = RecursiveParserWrapper.getResourceName(metadata, this.parserState.unknownCount);
            String str2 = this.location + resourceName;
            metadata.add(TikaCoreProperties.EMBEDDED_RESOURCE_PATH, str2);
            if (this.embeddedIdPath.equals("/")) {
                String str3 = this.embeddedIdPath;
                ParserState parserState = this.parserState;
                int i10 = parserState.embeddedCount + 1;
                parserState.embeddedCount = i10;
                str = str3 + i10;
            } else {
                String str4 = this.embeddedIdPath;
                ParserState parserState2 = this.parserState;
                int i11 = parserState2.embeddedCount + 1;
                parserState2.embeddedCount = i11;
                str = str4 + "/" + i11;
            }
            String str5 = str;
            metadata.add(TikaCoreProperties.EMBEDDED_ID_PATH, str5);
            metadata.set(TikaCoreProperties.EMBEDDED_ID, this.parserState.embeddedCount);
            ContentHandler newContentHandler = this.parserState.recursiveParserWrapperHandler.getNewContentHandler();
            this.parserState.recursiveParserWrapperHandler.startEmbeddedDocument(newContentHandler, metadata);
            Parser parser = (Parser) parseContext.get(Parser.class);
            parseContext.set(Parser.class, RecursiveParserWrapper.this.new EmbeddedParserDecorator(getWrappedParser(), str2, str5, this.parserState));
            long jCurrentTimeMillis = System.currentTimeMillis();
            RecursivelySecureContentHandler recursivelySecureContentHandler = (RecursivelySecureContentHandler) parseContext.get(RecursivelySecureContentHandler.class);
            ParentContentHandler parentContentHandler = (ParentContentHandler) parseContext.get(ParentContentHandler.class);
            parseContext.set(ParentContentHandler.class, new ParentContentHandler(recursivelySecureContentHandler));
            TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
            if (tikaInputStreamCast == null) {
                TemporaryResources temporaryResources2 = new TemporaryResources();
                tikaInputStream = TikaInputStream.get(Ne.a.a(inputStream), temporaryResources2, metadata);
                temporaryResources = temporaryResources2;
            } else {
                temporaryResources = null;
                tikaInputStream = tikaInputStreamCast;
            }
            TikaInputStream tikaInputStream2 = tikaInputStream;
            try {
                try {
                    try {
                        super.parse(inputStream, new RecursivelySecureContentHandler(newContentHandler, tikaInputStream2, recursivelySecureContentHandler.handlerCounter, recursivelySecureContentHandler.throwOnWriteLimitReached, parseContext), metadata, parseContext);
                        parseContext.set(Parser.class, parser);
                        parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                        parseContext.set(ParentContentHandler.class, parentContentHandler);
                        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                        this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                        if (temporaryResources != null) {
                            tikaInputStream2.close();
                        }
                    } catch (TikaException e10) {
                        if (e10 instanceof EncryptedDocumentException) {
                            metadata.set(TikaCoreProperties.IS_ENCRYPTED, true);
                        }
                        if (parseContext.get(ZeroByteFileException.IgnoreZeroByteFileException.class) == null || !(e10 instanceof ZeroByteFileException)) {
                            if (!RecursiveParserWrapper.this.catchEmbeddedExceptions) {
                                throw e10;
                            }
                            ParserUtils.recordParserFailure(this, e10, metadata);
                        }
                        parseContext.set(Parser.class, parser);
                        parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                        parseContext.set(ParentContentHandler.class, parentContentHandler);
                        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                        this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                        if (temporaryResources == null) {
                            return;
                        }
                        tikaInputStream2.close();
                    } catch (SAXException e11) {
                        if (WriteLimitReachedException.isWriteLimitReached(e11)) {
                            metadata.add(TikaCoreProperties.WRITE_LIMIT_REACHED, "true");
                            throw e11;
                        }
                        if (!RecursiveParserWrapper.this.catchEmbeddedExceptions) {
                            throw e11;
                        }
                        ParserUtils.recordParserFailure(this, e11, metadata);
                        parseContext.set(Parser.class, parser);
                        parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                        parseContext.set(ParentContentHandler.class, parentContentHandler);
                        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                        this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                        if (temporaryResources == null) {
                            return;
                        }
                        tikaInputStream2.close();
                    }
                } catch (CorruptedFileException e12) {
                    throw e12;
                }
            } catch (Throwable th) {
                parseContext.set(Parser.class, parser);
                parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                parseContext.set(ParentContentHandler.class, parentContentHandler);
                metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                if (temporaryResources != null) {
                    tikaInputStream2.close();
                }
                throw th;
            }
        }

        private EmbeddedParserDecorator(Parser parser, String str, String str2, ParserState parserState) {
            super(parser);
            this.embeddedIdPath = null;
            this.location = str;
            if (!str.endsWith("/")) {
                this.location = this.location + "/";
            }
            this.embeddedIdPath = str2;
            this.parserState = parserState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ParserState {
        private int embeddedCount;
        private final AbstractRecursiveParserWrapperHandler recursiveParserWrapperHandler;
        private AtomicInteger unknownCount;

        private ParserState(AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler) {
            this.unknownCount = new AtomicInteger(0);
            this.embeddedCount = 0;
            this.recursiveParserWrapperHandler = abstractRecursiveParserWrapperHandler;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class RecursivelySecureContentHandler extends SecureContentHandler {
        private static AtomicInteger COUNTER = new AtomicInteger();
        private final ContentHandler handler;
        private final SecureHandlerCounter handlerCounter;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f41582id;
        private final ParseContext parseContext;
        private final boolean throwOnWriteLimitReached;

        public RecursivelySecureContentHandler(ContentHandler contentHandler, TikaInputStream tikaInputStream, SecureHandlerCounter secureHandlerCounter, boolean z10, ParseContext parseContext) {
            super(contentHandler, tikaInputStream);
            this.f41582id = COUNTER.getAndIncrement();
            this.handler = contentHandler;
            this.handlerCounter = secureHandlerCounter;
            this.throwOnWriteLimitReached = z10;
            this.parseContext = parseContext;
        }

        private void handleWriteLimitReached() throws WriteLimitReachedException {
            this.handlerCounter.writeLimitReached = true;
            if (this.throwOnWriteLimitReached) {
                throw new WriteLimitReachedException(this.handlerCounter.totalWriteLimit);
            }
            ParseRecord parseRecord = (ParseRecord) this.parseContext.get(ParseRecord.class);
            if (parseRecord != null) {
                parseRecord.setWriteLimitReached(true);
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) throws SAXException {
            if (this.handlerCounter.writeLimitReached) {
                return;
            }
            if (this.handlerCounter.totalWriteLimit < 0) {
                super.characters(cArr, i10, i11);
                return;
            }
            int available = this.handlerCounter.getAvailable(i11);
            super.characters(cArr, i10, available);
            this.handlerCounter.addChars(available);
            if (available < i11) {
                handleWriteLimitReached();
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            this.handler.endElement(str, str2, str3);
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
            if (this.handlerCounter.writeLimitReached) {
                return;
            }
            if (this.handlerCounter.totalWriteLimit < 0) {
                super.ignorableWhitespace(cArr, i10, i11);
                return;
            }
            int available = this.handlerCounter.getAvailable(i11);
            super.ignorableWhitespace(cArr, i10, available);
            this.handlerCounter.addChars(available);
            if (available < i11) {
                handleWriteLimitReached();
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.handler.startElement(str, str2, str3, attributes);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SecureHandlerCounter {
        private int totalChars;
        private final int totalWriteLimit;
        private boolean writeLimitReached;

        public void addChars(int i10) {
            this.totalChars += i10;
        }

        public int getAvailable(int i10) {
            return Math.min(this.totalWriteLimit - this.totalChars, i10);
        }

        private SecureHandlerCounter(int i10) {
            this.writeLimitReached = false;
            this.totalChars = 0;
            this.totalWriteLimit = i10;
        }
    }

    public RecursiveParserWrapper(Parser parser) {
        this(parser, true);
    }

    public static String getResourceName(Metadata metadata, AtomicInteger atomicInteger) {
        String str;
        if (metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY) != null) {
            str = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        } else if (metadata.get(TikaCoreProperties.EMBEDDED_RELATIONSHIP_ID) != null) {
            str = metadata.get(TikaCoreProperties.EMBEDDED_RELATIONSHIP_ID);
        } else {
            Property property = TikaCoreProperties.VERSION_NUMBER;
            if (metadata.get(property) != null) {
                str = "version-number-" + metadata.get(property);
            } else {
                str = "embedded-" + atomicInteger.incrementAndGet();
            }
        }
        return FilenameUtils.getName(str);
    }

    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getWrappedParser().getSupportedTypes(parseContext);
    }

    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws SAXException {
        int writeLimit;
        boolean zIsThrowOnWriteLimitReached;
        Object obj;
        TikaInputStream tikaInputStream;
        if (!(contentHandler instanceof AbstractRecursiveParserWrapperHandler)) {
            throw new IllegalStateException("ContentHandler must implement RecursiveParserWrapperHandler");
        }
        AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler = (AbstractRecursiveParserWrapperHandler) contentHandler;
        ParserState parserState = new ParserState(abstractRecursiveParserWrapperHandler);
        parseContext.set(Parser.class, new EmbeddedParserDecorator(getWrappedParser(), "/", "/", parserState));
        ContentHandler newContentHandler = parserState.recursiveParserWrapperHandler.getNewContentHandler();
        long jCurrentTimeMillis = System.currentTimeMillis();
        parserState.recursiveParserWrapperHandler.startDocument();
        TemporaryResources temporaryResources = new TemporaryResources();
        ContentHandlerFactory contentHandlerFactory = abstractRecursiveParserWrapperHandler.getContentHandlerFactory();
        if (contentHandlerFactory instanceof WriteLimiter) {
            WriteLimiter writeLimiter = (WriteLimiter) contentHandlerFactory;
            writeLimit = writeLimiter.getWriteLimit();
            zIsThrowOnWriteLimitReached = writeLimiter.isThrowOnWriteLimitReached();
        } else {
            writeLimit = -1;
            zIsThrowOnWriteLimitReached = true;
        }
        boolean z10 = zIsThrowOnWriteLimitReached;
        try {
            tikaInputStream = TikaInputStream.get(inputStream, temporaryResources, metadata);
            obj = null;
        } catch (Throwable th) {
            th = th;
            obj = null;
        }
        try {
            RecursivelySecureContentHandler recursivelySecureContentHandler = new RecursivelySecureContentHandler(newContentHandler, tikaInputStream, new SecureHandlerCounter(writeLimit), z10, parseContext);
            parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
            getWrappedParser().parse(tikaInputStream, recursivelySecureContentHandler, metadata, parseContext);
        } catch (Throwable th2) {
            th = th2;
            try {
                if (th instanceof EncryptedDocumentException) {
                    metadata.set(TikaCoreProperties.IS_ENCRYPTED, "true");
                }
                if (!WriteLimitReachedException.isWriteLimitReached(th)) {
                    metadata.add(TikaCoreProperties.CONTAINER_EXCEPTION, ExceptionUtils.getFilteredStackTrace(th));
                    throw th;
                }
                metadata.set(TikaCoreProperties.WRITE_LIMIT_REACHED, "true");
            } catch (Throwable th3) {
                temporaryResources.dispose();
                metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                parserState.recursiveParserWrapperHandler.endDocument(newContentHandler, metadata);
                parserState.recursiveParserWrapperHandler.endDocument();
                parseContext.set(RecursivelySecureContentHandler.class, obj);
                throw th3;
            }
        }
        temporaryResources.dispose();
        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
        parserState.recursiveParserWrapperHandler.endDocument(newContentHandler, metadata);
        parserState.recursiveParserWrapperHandler.endDocument();
        parseContext.set(RecursivelySecureContentHandler.class, obj);
    }

    public RecursiveParserWrapper(Parser parser, boolean z10) {
        super(parser);
        this.inlineContent = false;
        this.catchEmbeddedExceptions = z10;
    }
}
