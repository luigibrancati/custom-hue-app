package org.apache.tika.parser;

import java.io.InputStream;
import java.util.Collections;
import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.sax.XHTMLContentHandler;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EmptyParser implements Parser {
    public static final EmptyParser INSTANCE = new EmptyParser();
    private static final long serialVersionUID = -4218649699095732123L;

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return Collections.EMPTY_SET;
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        XHTMLContentHandler xHTMLContentHandler = new XHTMLContentHandler(contentHandler, metadata);
        xHTMLContentHandler.startDocument();
        xHTMLContentHandler.endDocument();
    }
}
