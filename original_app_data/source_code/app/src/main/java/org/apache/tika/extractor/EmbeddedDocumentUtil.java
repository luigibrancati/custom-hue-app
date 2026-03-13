package org.apache.tika.extractor;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Iterator;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.PasswordProvider;
import org.apache.tika.parser.StatefulParser;
import org.apache.tika.utils.ExceptionUtils;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EmbeddedDocumentUtil implements Serializable {
    private final ParseContext context;
    private Detector detector;
    private final EmbeddedDocumentExtractor embeddedDocumentExtractor;
    private MimeTypes mimeTypes;
    private TikaConfig tikaConfig;

    public EmbeddedDocumentUtil(ParseContext parseContext) {
        this.context = parseContext;
        this.embeddedDocumentExtractor = getEmbeddedDocumentExtractor(parseContext);
    }

    private static boolean equals(Parser parser, Class cls) {
        if (parser == null) {
            return false;
        }
        return parser.getClass().equals(cls);
    }

    private static Parser findInComposite(CompositeParser compositeParser, Class cls, ParseContext parseContext) {
        Iterator<Parser> it = compositeParser.getAllComponentParsers().iterator();
        while (it.hasNext()) {
            Parser next = it.next();
            if (equals(next, cls)) {
                return next;
            }
            if (next instanceof ParserDecorator) {
                next = findInDecorated((ParserDecorator) next, cls);
            }
            if (equals(next, cls)) {
                return next;
            }
            if (next instanceof CompositeParser) {
                next = findInComposite((CompositeParser) next, cls, parseContext);
            }
            if (equals(next, cls)) {
                return next;
            }
        }
        return null;
    }

    private static Parser findInDecorated(ParserDecorator parserDecorator, Class cls) {
        Parser wrappedParser = parserDecorator.getWrappedParser();
        return (!equals(wrappedParser, cls) && (wrappedParser instanceof ParserDecorator)) ? findInDecorated((ParserDecorator) wrappedParser, cls) : wrappedParser;
    }

    public static EmbeddedDocumentExtractor getEmbeddedDocumentExtractor(ParseContext parseContext) {
        EmbeddedDocumentExtractor embeddedDocumentExtractor = (EmbeddedDocumentExtractor) parseContext.get(EmbeddedDocumentExtractor.class);
        if (embeddedDocumentExtractor != null) {
            return embeddedDocumentExtractor;
        }
        if (((Parser) parseContext.get(Parser.class)) == null) {
            TikaConfig tikaConfig = (TikaConfig) parseContext.get(TikaConfig.class);
            if (tikaConfig == null) {
                parseContext.set(Parser.class, new AutoDetectParser());
            } else {
                parseContext.set(Parser.class, new AutoDetectParser(tikaConfig));
            }
        }
        ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor = new ParsingEmbeddedDocumentExtractor(parseContext);
        parseContext.set(EmbeddedDocumentExtractor.class, parsingEmbeddedDocumentExtractor);
        return parsingEmbeddedDocumentExtractor;
    }

    public static Parser getStatelessParser(ParseContext parseContext) {
        Parser parser = (Parser) parseContext.get(Parser.class);
        if (parser == null) {
            return null;
        }
        return parser instanceof StatefulParser ? ((StatefulParser) parser).getWrappedParser() : parser;
    }

    public static void recordEmbeddedStreamException(Throwable th, Metadata metadata) {
        metadata.add(TikaCoreProperties.TIKA_META_EXCEPTION_EMBEDDED_STREAM, ExceptionUtils.getFilteredStackTrace(th));
    }

    public static void recordException(Throwable th, Metadata metadata) {
        metadata.add(TikaCoreProperties.TIKA_META_EXCEPTION_WARNING, ExceptionUtils.getFilteredStackTrace(th));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.tika.parser.Parser tryToFindExistingLeafParser(java.lang.Class r3, org.apache.tika.parser.ParseContext r4) {
        /*
            java.lang.Class<org.apache.tika.parser.Parser> r0 = org.apache.tika.parser.Parser.class
            java.lang.Object r0 = r4.get(r0)
            org.apache.tika.parser.Parser r0 = (org.apache.tika.parser.Parser) r0
            boolean r1 = equals(r0, r3)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            r1 = 0
            if (r0 == 0) goto L2e
            boolean r2 = r0 instanceof org.apache.tika.parser.ParserDecorator
            if (r2 == 0) goto L1c
            org.apache.tika.parser.ParserDecorator r0 = (org.apache.tika.parser.ParserDecorator) r0
            org.apache.tika.parser.Parser r0 = findInDecorated(r0, r3)
        L1c:
            boolean r2 = equals(r0, r3)
            if (r2 == 0) goto L23
            return r0
        L23:
            boolean r2 = r0 instanceof org.apache.tika.parser.CompositeParser
            if (r2 == 0) goto L2e
            org.apache.tika.parser.CompositeParser r0 = (org.apache.tika.parser.CompositeParser) r0
            org.apache.tika.parser.Parser r4 = findInComposite(r0, r3, r4)
            goto L2f
        L2e:
            r4 = r1
        L2f:
            if (r4 == 0) goto L38
            boolean r3 = equals(r4, r3)
            if (r3 == 0) goto L38
            return r4
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.extractor.EmbeddedDocumentUtil.tryToFindExistingLeafParser(java.lang.Class, org.apache.tika.parser.ParseContext):org.apache.tika.parser.Parser");
    }

    public Detector getDetector() {
        Detector detector = (Detector) this.context.get(Detector.class);
        if (detector != null) {
            return detector;
        }
        Detector detector2 = this.detector;
        if (detector2 != null) {
            return detector2;
        }
        Detector detector3 = getTikaConfig().getDetector();
        this.detector = detector3;
        return detector3;
    }

    public String getExtension(TikaInputStream tikaInputStream, Metadata metadata) {
        MimeType mimeTypeForName;
        String str = metadata.get(HttpHeaders.CONTENT_TYPE);
        MimeTypes mimeTypes = getMimeTypes();
        if (str != null) {
            try {
                mimeTypeForName = mimeTypes.forName(str);
            } catch (MimeTypeException unused) {
                mimeTypeForName = null;
            }
        } else {
            mimeTypeForName = null;
        }
        boolean z10 = false;
        if (mimeTypeForName == null) {
            try {
                mimeTypeForName = mimeTypes.forName(getDetector().detect(tikaInputStream, metadata).toString());
                z10 = true;
                tikaInputStream.reset();
            } catch (IOException | MimeTypeException unused2) {
            }
        }
        if (mimeTypeForName == null) {
            return ".bin";
        }
        if (z10) {
            metadata.set(HttpHeaders.CONTENT_TYPE, mimeTypeForName.toString());
        }
        return mimeTypeForName.getExtension();
    }

    public MimeTypes getMimeTypes() {
        MimeTypes mimeTypes = (MimeTypes) this.context.get(MimeTypes.class);
        if (mimeTypes != null) {
            return mimeTypes;
        }
        MimeTypes mimeTypes2 = this.mimeTypes;
        if (mimeTypes2 != null) {
            return mimeTypes2;
        }
        MimeTypes mimeRepository = getTikaConfig().getMimeRepository();
        this.mimeTypes = mimeRepository;
        return mimeRepository;
    }

    public PasswordProvider getPasswordProvider() {
        return (PasswordProvider) this.context.get(PasswordProvider.class);
    }

    public TikaConfig getTikaConfig() {
        if (this.tikaConfig == null) {
            TikaConfig tikaConfig = (TikaConfig) this.context.get(TikaConfig.class);
            this.tikaConfig = tikaConfig;
            if (tikaConfig == null) {
                this.tikaConfig = TikaConfig.getDefaultConfig();
            }
        }
        return this.tikaConfig;
    }

    public void parseEmbedded(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, boolean z10) {
        this.embeddedDocumentExtractor.parseEmbedded(inputStream, contentHandler, metadata, z10);
    }

    public boolean shouldParseEmbedded(Metadata metadata) {
        return getEmbeddedDocumentExtractor().shouldParseEmbedded(metadata);
    }

    private EmbeddedDocumentExtractor getEmbeddedDocumentExtractor() {
        return this.embeddedDocumentExtractor;
    }
}
