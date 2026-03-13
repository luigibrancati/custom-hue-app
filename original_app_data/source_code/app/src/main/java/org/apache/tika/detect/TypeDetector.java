package org.apache.tika.detect;

import java.io.InputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TypeDetector implements Detector {
    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        MediaType mediaType;
        String str = metadata.get(HttpHeaders.CONTENT_TYPE);
        return (str == null || (mediaType = MediaType.parse(str)) == null) ? MediaType.OCTET_STREAM : mediaType;
    }
}
