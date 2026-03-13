package org.apache.tika.detect;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class OverrideDetector implements Detector {
    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        String str = metadata.get(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE);
        if (str != null) {
            return MediaType.parse(str);
        }
        String str2 = metadata.get(TikaCoreProperties.CONTENT_TYPE_USER_OVERRIDE);
        return str2 != null ? MediaType.parse(str2) : MediaType.OCTET_STREAM;
    }
}
