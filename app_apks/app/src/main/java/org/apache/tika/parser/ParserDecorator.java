package org.apache.tika.parser;

import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.parser.multiple.FallbackParser;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ParserDecorator implements Parser {
    private static final long serialVersionUID = -3861669115439125268L;
    private final Parser parser;

    public ParserDecorator(Parser parser) {
        this.parser = parser;
    }

    @Deprecated
    public static final Parser withFallbacks(Collection<? extends Parser> collection, Set<MediaType> set) {
        FallbackParser fallbackParser = new FallbackParser(MediaTypeRegistry.getDefaultRegistry(), AbstractMultipleParser.MetadataPolicy.KEEP_ALL, collection);
        return (set == null || set.isEmpty()) ? fallbackParser : withTypes(fallbackParser, set);
    }

    public static final Parser withTypes(Parser parser, final Set<MediaType> set) {
        return new ParserDecorator(parser) { // from class: org.apache.tika.parser.ParserDecorator.1
            private static final long serialVersionUID = -7345051519565330731L;

            @Override // org.apache.tika.parser.ParserDecorator
            public String getDecorationName() {
                return "With Types";
            }

            @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
            public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
                return set;
            }
        };
    }

    public static final Parser withoutTypes(Parser parser, final Set<MediaType> set) {
        return new ParserDecorator(parser) { // from class: org.apache.tika.parser.ParserDecorator.2
            private static final long serialVersionUID = 7979614774021768609L;

            @Override // org.apache.tika.parser.ParserDecorator
            public String getDecorationName() {
                return "Without Types";
            }

            @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
            public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
                HashSet hashSet = new HashSet(super.getSupportedTypes(parseContext));
                hashSet.removeAll(set);
                return hashSet;
            }
        };
    }

    public String getDecorationName() {
        return null;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return this.parser.getSupportedTypes(parseContext);
    }

    public Parser getWrappedParser() {
        return this.parser;
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        this.parser.parse(inputStream, contentHandler, metadata, parseContext);
    }
}
