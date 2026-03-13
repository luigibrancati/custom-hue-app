package org.apache.tika.parser.multiple;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.tika.config.Param;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FallbackParser extends AbstractMultipleParser {
    public static final List<AbstractMultipleParser.MetadataPolicy> allowedPolicies = Arrays.asList(AbstractMultipleParser.MetadataPolicy.values());
    private static final long serialVersionUID = 5844409020977206167L;

    public FallbackParser(MediaTypeRegistry mediaTypeRegistry, Collection<? extends Parser> collection, Map<String, Param> map) {
        super(mediaTypeRegistry, collection, map);
    }

    @Override // org.apache.tika.parser.multiple.AbstractMultipleParser
    public boolean parserCompleted(Parser parser, Metadata metadata, ContentHandler contentHandler, ParseContext parseContext, Exception exc) {
        return exc != null;
    }

    public FallbackParser(MediaTypeRegistry mediaTypeRegistry, AbstractMultipleParser.MetadataPolicy metadataPolicy, Collection<? extends Parser> collection) {
        super(mediaTypeRegistry, metadataPolicy, collection);
    }

    public FallbackParser(MediaTypeRegistry mediaTypeRegistry, AbstractMultipleParser.MetadataPolicy metadataPolicy, Parser... parserArr) {
        super(mediaTypeRegistry, metadataPolicy, parserArr);
    }
}
