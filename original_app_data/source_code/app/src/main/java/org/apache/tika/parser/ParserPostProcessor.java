package org.apache.tika.parser;

import java.io.InputStream;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.apache.tika.utils.RegexUtils;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ParserPostProcessor extends ParserDecorator {
    public ParserPostProcessor(Parser parser) {
        super(parser);
    }

    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        BodyContentHandler bodyContentHandler = new BodyContentHandler();
        super.parse(inputStream, new TeeContentHandler(contentHandler, bodyContentHandler), metadata, parseContext);
        String string = bodyContentHandler.toString();
        metadata.set("fulltext", string);
        metadata.set("summary", string.substring(0, Math.min(string.length(), 500)));
        Iterator<String> it = RegexUtils.extractLinks(string).iterator();
        while (it.hasNext()) {
            metadata.add("outlinks", it.next());
        }
    }
}
