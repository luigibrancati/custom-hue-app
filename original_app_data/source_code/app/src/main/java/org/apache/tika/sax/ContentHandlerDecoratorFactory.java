package org.apache.tika.sax;

import java.io.Serializable;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ContentHandlerDecoratorFactory extends Serializable {
    ContentHandler decorate(ContentHandler contentHandler, Metadata metadata, ParseContext parseContext);
}
