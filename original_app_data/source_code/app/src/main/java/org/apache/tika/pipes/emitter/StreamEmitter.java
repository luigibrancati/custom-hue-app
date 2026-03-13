package org.apache.tika.pipes.emitter;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface StreamEmitter extends Emitter {
    void emit(String str, InputStream inputStream, Metadata metadata, ParseContext parseContext);
}
