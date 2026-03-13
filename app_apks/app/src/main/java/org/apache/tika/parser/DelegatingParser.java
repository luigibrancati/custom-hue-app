package org.apache.tika.parser;

import java.io.InputStream;
import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DelegatingParser implements Parser {
    public Parser getDelegateParser(ParseContext parseContext) {
        return (Parser) parseContext.get(Parser.class, EmptyParser.INSTANCE);
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getDelegateParser(parseContext).getSupportedTypes(parseContext);
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        getDelegateParser(parseContext).parse(inputStream, contentHandler, metadata, parseContext);
    }
}
