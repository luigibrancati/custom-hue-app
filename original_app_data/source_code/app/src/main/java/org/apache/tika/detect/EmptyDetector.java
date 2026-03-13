package org.apache.tika.detect;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EmptyDetector implements Detector {
    public static final EmptyDetector INSTANCE = new EmptyDetector();

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        return MediaType.OCTET_STREAM;
    }
}
