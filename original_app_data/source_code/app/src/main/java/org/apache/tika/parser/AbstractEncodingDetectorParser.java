package org.apache.tika.parser;

import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.EncodingDetector;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractEncodingDetectorParser implements Parser {
    private EncodingDetector encodingDetector;

    public AbstractEncodingDetectorParser() {
        this.encodingDetector = new DefaultEncodingDetector();
    }

    public EncodingDetector getEncodingDetector(ParseContext parseContext) {
        EncodingDetector encodingDetector = (EncodingDetector) parseContext.get(EncodingDetector.class);
        return encodingDetector != null ? encodingDetector : getEncodingDetector();
    }

    public void setEncodingDetector(EncodingDetector encodingDetector) {
        this.encodingDetector = encodingDetector;
    }

    public AbstractEncodingDetectorParser(EncodingDetector encodingDetector) {
        this.encodingDetector = encodingDetector;
    }

    public EncodingDetector getEncodingDetector() {
        return this.encodingDetector;
    }
}
