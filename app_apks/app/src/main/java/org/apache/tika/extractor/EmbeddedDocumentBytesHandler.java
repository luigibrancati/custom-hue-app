package org.apache.tika.extractor;

import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface EmbeddedDocumentBytesHandler extends Closeable {
    void add(int i10, Metadata metadata, InputStream inputStream);

    List<Integer> getIds();
}
