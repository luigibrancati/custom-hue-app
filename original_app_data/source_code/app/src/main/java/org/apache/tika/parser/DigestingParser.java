package org.apache.tika.parser;

import java.io.InputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DigestingParser extends ParserDecorator {
    private final Digester digester;
    private final boolean skipContainerDocument;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Digester {
        void digest(InputStream inputStream, Metadata metadata, ParseContext parseContext);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface DigesterFactory {
        Digester build();

        boolean isSkipContainerDocument();

        void setSkipContainerDocument(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Encoder {
        String encode(byte[] bArr);
    }

    public DigestingParser(Parser parser, Digester digester, boolean z10) {
        super(parser);
        this.digester = digester;
        this.skipContainerDocument = z10;
    }

    private boolean shouldDigest(Metadata metadata) {
        if (this.digester == null) {
            return false;
        }
        if (!this.skipContainerDocument) {
            return true;
        }
        Integer num = metadata.getInt(TikaCoreProperties.EMBEDDED_DEPTH);
        return (num == null || num.intValue() == 0) ? false : true;
    }

    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        TemporaryResources temporaryResources = new TemporaryResources();
        TikaInputStream tikaInputStream = TikaInputStream.get(inputStream, temporaryResources, metadata);
        try {
            if (shouldDigest(metadata)) {
                this.digester.digest(tikaInputStream, metadata, parseContext);
            }
            super.parse(tikaInputStream, contentHandler, metadata, parseContext);
            temporaryResources.dispose();
        } catch (Throwable th) {
            temporaryResources.dispose();
            throw th;
        }
    }
}
