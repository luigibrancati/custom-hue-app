package org.apache.tika.detect;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NameDetector implements Detector {
    private final Map<Pattern, MediaType> patterns;

    public NameDetector(Map<Pattern, MediaType> map) {
        this.patterns = map;
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        String strDecode = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        if (strDecode != null) {
            int iIndexOf = strDecode.indexOf(63);
            if (iIndexOf != -1) {
                strDecode = strDecode.substring(0, iIndexOf);
            }
            int iLastIndexOf = strDecode.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                strDecode = strDecode.substring(iLastIndexOf + 1);
            }
            int iLastIndexOf2 = strDecode.lastIndexOf(92);
            if (iLastIndexOf2 != -1) {
                strDecode = strDecode.substring(iLastIndexOf2 + 1);
            }
            int iLastIndexOf3 = strDecode.lastIndexOf(35);
            int iLastIndexOf4 = strDecode.lastIndexOf(46);
            if (iLastIndexOf3 != -1 && (iLastIndexOf4 == -1 || iLastIndexOf3 > iLastIndexOf4)) {
                strDecode = strDecode.substring(0, iLastIndexOf3);
            }
            if (strDecode.indexOf(37) != -1) {
                try {
                    strDecode = URLDecoder.decode(strDecode, StandardCharsets.UTF_8.name());
                } catch (UnsupportedEncodingException e10) {
                    throw new IllegalStateException("UTF-8 not supported", e10);
                }
            }
            String strTrim = strDecode.trim();
            if (strTrim.length() > 0) {
                for (Map.Entry<Pattern, MediaType> entry : this.patterns.entrySet()) {
                    if (entry.getKey().matcher(strTrim).matches()) {
                        return entry.getValue();
                    }
                }
            }
        }
        return MediaType.OCTET_STREAM;
    }
}
