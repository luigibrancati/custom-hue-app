package org.apache.tika.parser.external;

import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.CompositeParser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompositeExternalParser extends CompositeParser {
    private static final long serialVersionUID = 6962436916649024024L;

    public CompositeExternalParser() {
        this(new MediaTypeRegistry());
    }

    public CompositeExternalParser(MediaTypeRegistry mediaTypeRegistry) {
        super(mediaTypeRegistry, ExternalParsersFactory.create());
    }
}
