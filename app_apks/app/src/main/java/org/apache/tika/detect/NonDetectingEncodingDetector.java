package org.apache.tika.detect;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NonDetectingEncodingDetector implements EncodingDetector {
    private Charset charset;

    public NonDetectingEncodingDetector() {
        this.charset = StandardCharsets.UTF_8;
    }

    @Field
    private void setCharset(String str) {
        this.charset = Charset.forName(str);
    }

    @Override // org.apache.tika.detect.EncodingDetector
    public Charset detect(InputStream inputStream, Metadata metadata) {
        return this.charset;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public NonDetectingEncodingDetector(Charset charset) {
        Charset charset2 = StandardCharsets.UTF_8;
        this.charset = charset;
    }
}
