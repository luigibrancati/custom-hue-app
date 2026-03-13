package org.apache.tika.pipes.extractor;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.emitter.TikaEmitterException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EmittingEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private static final Metadata METADATA = new Metadata();
    private static final ParseContext PARSE_CONTEXT = new ParseContext();
    private final EmitKey containerEmitKey;
    private final EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig;
    private final StreamEmitter emitter;

    public EmittingEmbeddedDocumentBytesHandler(FetchEmitTuple fetchEmitTuple, EmitterManager emitterManager) throws TikaConfigException {
        this.containerEmitKey = fetchEmitTuple.getEmitKey();
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) fetchEmitTuple.getParseContext().get(EmbeddedDocumentBytesConfig.class);
        this.embeddedDocumentBytesConfig = embeddedDocumentBytesConfig;
        if (embeddedDocumentBytesConfig == null) {
            throw new TikaConfigException("EmbeddedDocumentBytesConfig must not be null!");
        }
        Emitter emitter = emitterManager.getEmitter(embeddedDocumentBytesConfig.getEmitter());
        if (emitter instanceof StreamEmitter) {
            this.emitter = (StreamEmitter) emitter;
            return;
        }
        throw new TikaConfigException("Emitter " + embeddedDocumentBytesConfig.getEmitter() + " must implement a StreamEmitter");
    }

    @Override // org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler, org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i10, Metadata metadata, InputStream inputStream) throws IOException {
        try {
            this.emitter.emit(getEmitKey(this.containerEmitKey.getEmitKey(), i10, this.embeddedDocumentBytesConfig, metadata), inputStream, METADATA, PARSE_CONTEXT);
        } catch (TikaEmitterException e10) {
            throw new IOException(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        StreamEmitter streamEmitter = this.emitter;
        if (streamEmitter instanceof Closeable) {
            ((Closeable) streamEmitter).close();
        }
    }
}
