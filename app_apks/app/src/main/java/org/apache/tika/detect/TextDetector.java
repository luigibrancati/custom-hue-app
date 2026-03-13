package org.apache.tika.detect;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TextDetector implements Detector {
    private static final int DEFAULT_NUMBER_OF_BYTES_TO_TEST = 512;
    private static final boolean[] IS_CONTROL_BYTE;
    private static final long serialVersionUID = 4774601079503507765L;
    private final int bytesToTest;

    static {
        boolean[] zArr = new boolean[32];
        IS_CONTROL_BYTE = zArr;
        Arrays.fill(zArr, true);
        zArr[9] = false;
        zArr[10] = false;
        zArr[12] = false;
        zArr[13] = false;
        zArr[27] = false;
    }

    public TextDetector() {
        this(512);
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.bytesToTest);
        try {
            TextStatistics textStatistics = new TextStatistics();
            byte[] bArr = new byte[RecognitionOptions.UPC_E];
            int i10 = inputStream.read(bArr, 0, Math.min(this.bytesToTest, RecognitionOptions.UPC_E));
            int i11 = 0;
            while (i10 != -1 && i11 < this.bytesToTest) {
                textStatistics.addData(bArr, 0, i10);
                i11 += i10;
                i10 = inputStream.read(bArr, 0, Math.min(this.bytesToTest - i11, RecognitionOptions.UPC_E));
            }
            if (!textStatistics.isMostlyAscii() && !textStatistics.looksLikeUTF8()) {
                MediaType mediaType = MediaType.OCTET_STREAM;
                inputStream.reset();
                return mediaType;
            }
            MediaType mediaType2 = MediaType.TEXT_PLAIN;
            inputStream.reset();
            return mediaType2;
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    public TextDetector(int i10) {
        this.bytesToTest = i10;
    }
}
