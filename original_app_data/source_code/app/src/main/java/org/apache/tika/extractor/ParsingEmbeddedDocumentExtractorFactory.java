package org.apache.tika.extractor;

import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ParsingEmbeddedDocumentExtractorFactory implements EmbeddedDocumentExtractorFactory {
    private boolean writeFileNameToContent = true;

    @Override // org.apache.tika.extractor.EmbeddedDocumentExtractorFactory
    public EmbeddedDocumentExtractor newInstance(Metadata metadata, ParseContext parseContext) {
        ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor = new ParsingEmbeddedDocumentExtractor(parseContext);
        parsingEmbeddedDocumentExtractor.setWriteFileNameToContent(this.writeFileNameToContent);
        return parsingEmbeddedDocumentExtractor;
    }

    @Field
    public void setWriteFileNameToContent(boolean z10) {
        this.writeFileNameToContent = z10;
    }
}
