package org.apache.tika.detect;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ZeroSizeFileDetector implements Detector {
    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.mark(1);
                if (inputStream.read() == -1) {
                    return MediaType.EMPTY;
                }
            } finally {
                inputStream.reset();
            }
        }
        return MediaType.OCTET_STREAM;
    }
}
