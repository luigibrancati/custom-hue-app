package org.apache.tika.embedder;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Embedder extends Serializable {
    void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext);

    Set<MediaType> getSupportedEmbedTypes(ParseContext parseContext);
}
