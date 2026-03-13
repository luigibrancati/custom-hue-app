package org.apache.tika.pipes;

import java.io.Serializable;
import java.util.Objects;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.fetcher.FetchKey;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FetchEmitTuple implements Serializable {
    public static final ON_PARSE_EXCEPTION DEFAULT_ON_PARSE_EXCEPTION = ON_PARSE_EXCEPTION.EMIT;
    private EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig;
    private EmitKey emitKey;
    private final FetchKey fetchKey;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f41590id;
    private final Metadata metadata;
    private final ON_PARSE_EXCEPTION onParseException;
    private final ParseContext parseContext;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ON_PARSE_EXCEPTION {
        SKIP,
        EMIT
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey) {
        this(str, fetchKey, emitKey, new Metadata());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) obj;
            if (Objects.equals(this.f41590id, fetchEmitTuple.f41590id) && Objects.equals(this.fetchKey, fetchEmitTuple.fetchKey) && Objects.equals(this.emitKey, fetchEmitTuple.emitKey) && Objects.equals(this.metadata, fetchEmitTuple.metadata) && Objects.equals(this.parseContext, fetchEmitTuple.parseContext) && this.onParseException == fetchEmitTuple.onParseException && Objects.equals(this.embeddedDocumentBytesConfig, fetchEmitTuple.embeddedDocumentBytesConfig)) {
                return true;
            }
        }
        return false;
    }

    public EmitKey getEmitKey() {
        return this.emitKey;
    }

    public FetchKey getFetchKey() {
        return this.fetchKey;
    }

    public String getId() {
        return this.f41590id;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public ON_PARSE_EXCEPTION getOnParseException() {
        return this.onParseException;
    }

    public ParseContext getParseContext() {
        return this.parseContext;
    }

    public int hashCode() {
        return (((((((((((Objects.hashCode(this.f41590id) * 31) + Objects.hashCode(this.fetchKey)) * 31) + Objects.hashCode(this.emitKey)) * 31) + Objects.hashCode(this.metadata)) * 31) + Objects.hashCode(this.parseContext)) * 31) + Objects.hashCode(this.onParseException)) * 31) + Objects.hashCode(this.embeddedDocumentBytesConfig);
    }

    public void setEmitKey(EmitKey emitKey) {
        this.emitKey = emitKey;
    }

    public String toString() {
        return "FetchEmitTuple{id='" + this.f41590id + "', fetchKey=" + String.valueOf(this.fetchKey) + ", emitKey=" + String.valueOf(this.emitKey) + ", metadata=" + String.valueOf(this.metadata) + ", parseContext=" + String.valueOf(this.parseContext) + ", onParseException=" + String.valueOf(this.onParseException) + ", embeddedDocumentBytesConfig=" + String.valueOf(this.embeddedDocumentBytesConfig) + "}";
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey, Metadata metadata) {
        this(str, fetchKey, emitKey, metadata, new ParseContext());
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey, Metadata metadata, ParseContext parseContext) {
        this(str, fetchKey, emitKey, metadata, parseContext, ON_PARSE_EXCEPTION.EMIT);
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey, Metadata metadata, ParseContext parseContext, ON_PARSE_EXCEPTION on_parse_exception) {
        this.f41590id = str;
        this.fetchKey = fetchKey;
        this.emitKey = emitKey;
        this.metadata = metadata;
        this.parseContext = parseContext;
        this.onParseException = on_parse_exception;
    }
}
