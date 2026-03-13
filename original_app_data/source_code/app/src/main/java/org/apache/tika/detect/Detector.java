package org.apache.tika.detect;

import java.io.InputStream;
import java.io.Serializable;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Detector extends Serializable {
    MediaType detect(InputStream inputStream, Metadata metadata);
}
