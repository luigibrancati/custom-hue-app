package org.apache.tika.extractor;

import java.io.Serializable;
import org.apache.tika.io.TikaInputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ContainerExtractor extends Serializable {
    void extract(TikaInputStream tikaInputStream, ContainerExtractor containerExtractor, EmbeddedResourceHandler embeddedResourceHandler);

    boolean isSupported(TikaInputStream tikaInputStream);
}
