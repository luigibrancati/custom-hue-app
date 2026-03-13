package org.apache.tika.renderer;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Renderer extends Serializable {
    Set<MediaType> getSupportedTypes(ParseContext parseContext);

    RenderResults render(InputStream inputStream, Metadata metadata, ParseContext parseContext, RenderRequest... renderRequestArr);
}
