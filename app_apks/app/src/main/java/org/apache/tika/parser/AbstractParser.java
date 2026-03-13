package org.apache.tika.parser;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class AbstractParser implements Parser {
    private static final long serialVersionUID = 7186985395903074255L;

    @Deprecated
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata) {
        parse(inputStream, contentHandler, metadata, new ParseContext());
    }
}
