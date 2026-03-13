package org.apache.tika.detect;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class MagicDetector implements Detector {
    private final boolean isRegex;
    private final boolean isStringIgnoreCase;
    private final int length;
    private final byte[] mask;
    private final int offsetRangeBegin;
    private final int offsetRangeEnd;
    private final byte[] pattern;
    private final int patternLength;
    private final MediaType type;

    public MagicDetector(MediaType mediaType, byte[] bArr) {
        this(mediaType, bArr, 0);
    }

    private static byte[] decodeString(String str, String str2) {
        int i10 = 0;
        if (str.startsWith("0x")) {
            int length = (str.length() - 2) / 2;
            byte[] bArr = new byte[length];
            while (i10 < length) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(str.substring(i11 + 2, i11 + 4), 16);
                i10++;
            }
            return bArr;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i12 = 0;
        while (i12 < str.length()) {
            if (str.charAt(i12) == '\\') {
                int i13 = i12 + 1;
                if (str.charAt(i13) == '\\') {
                    charArrayWriter.write(92);
                } else if (str.charAt(i13) == 'x') {
                    charArrayWriter.write(Integer.parseInt(str.substring(i12 + 2, i12 + 4), 16));
                    i12 += 3;
                } else if (str.charAt(i13) == 'r') {
                    charArrayWriter.write(13);
                } else if (str.charAt(i13) == 'n') {
                    charArrayWriter.write(10);
                } else {
                    int i14 = i13;
                    while (i14 < i12 + 4 && i14 < str.length() && Character.isDigit(str.charAt(i14))) {
                        i14++;
                    }
                    charArrayWriter.write(Short.decode(WebrtcBuildVersion.maint_version + str.substring(i13, i14)).byteValue());
                    i12 = i14 + (-1);
                }
                i12 = i13;
            } else {
                charArrayWriter.write(str.charAt(i12));
            }
            i12++;
        }
        char[] charArray = charArrayWriter.toCharArray();
        if ("unicodeLE".equals(str2)) {
            byte[] bArr2 = new byte[charArray.length * 2];
            while (i10 < charArray.length) {
                int i15 = i10 * 2;
                char c10 = charArray[i10];
                bArr2[i15] = (byte) (c10 & 255);
                bArr2[i15 + 1] = (byte) (c10 >> '\b');
                i10++;
            }
            return bArr2;
        }
        if (!"unicodeBE".equals(str2)) {
            int length2 = charArray.length;
            byte[] bArr3 = new byte[length2];
            while (i10 < length2) {
                bArr3[i10] = (byte) charArray[i10];
                i10++;
            }
            return bArr3;
        }
        byte[] bArr4 = new byte[charArray.length * 2];
        while (i10 < charArray.length) {
            int i16 = i10 * 2;
            char c11 = charArray[i10];
            bArr4[i16] = (byte) (c11 >> '\b');
            bArr4[i16 + 1] = (byte) (c11 & 255);
            i10++;
        }
        return bArr4;
    }

    private static byte[] decodeValue(String str, String str2) {
        String strSubstring;
        int i10;
        if (str == null || str2 == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            strSubstring = str.substring(2);
            i10 = 16;
        } else {
            strSubstring = str;
            i10 = 8;
        }
        switch (str2) {
            case "host16":
            case "little16":
                int i11 = Integer.parseInt(strSubstring, i10);
                return new byte[]{(byte) (i11 & 255), (byte) (i11 >> 8)};
            case "host32":
            case "little32":
                long j10 = Long.parseLong(strSubstring, i10);
                return new byte[]{(byte) (j10 & 255), (byte) ((j10 & 65280) >> 8), (byte) ((j10 & 16711680) >> 16), (byte) ((j10 & (-16777216)) >> 24)};
            case "unicodeBE":
            case "unicodeLE":
            case "string":
            case "regex":
                return decodeString(str, str2);
            case "stringignorecase":
                return decodeString(str.toLowerCase(Locale.ROOT), str2);
            case "byte":
                return strSubstring.getBytes(StandardCharsets.UTF_8);
            case "big16":
                int i12 = Integer.parseInt(strSubstring, i10);
                return new byte[]{(byte) (i12 >> 8), (byte) (i12 & 255)};
            case "big32":
                long j11 = Long.parseLong(strSubstring, i10);
                return new byte[]{(byte) ((j11 & (-16777216)) >> 24), (byte) ((j11 & 16711680) >> 16), (byte) ((j11 & 65280) >> 8), (byte) (j11 & 255)};
            default:
                return null;
        }
    }

    public static MagicDetector parse(MediaType mediaType, String str, String str2, String str3, String str4) {
        int i10;
        int i11;
        int i12 = 0;
        if (str2 == null) {
            i10 = i12;
            i11 = i10;
        } else {
            int iIndexOf = str2.indexOf(58);
            if (iIndexOf == -1) {
                i12 = Integer.parseInt(str2);
                i10 = i12;
                i11 = i10;
            } else {
                int i13 = Integer.parseInt(str2.substring(0, iIndexOf));
                i11 = Integer.parseInt(str2.substring(iIndexOf + 1));
                i10 = i13;
            }
        }
        return new MagicDetector(mediaType, decodeValue(str3, str), str4 != null ? decodeValue(str4, str) : null, str.equals("regex"), str.equals("stringignorecase"), i10, i11);
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.offsetRangeEnd + this.length);
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.offsetRangeBegin;
                if (i10 >= i11) {
                    int i12 = this.length + (this.offsetRangeEnd - i11);
                    byte[] bArr = new byte[i12];
                    int i13 = inputStream.read(bArr);
                    if (i13 > 0) {
                        i10 += i13;
                    }
                    while (i13 != -1 && i10 < this.offsetRangeEnd + this.length) {
                        int i14 = i10 - this.offsetRangeBegin;
                        i13 = inputStream.read(bArr, i14, i12 - i14);
                        if (i13 > 0) {
                            i10 += i13;
                        }
                    }
                    if (this.isRegex) {
                        Matcher matcher = Pattern.compile(new String(this.pattern, StandardCharsets.UTF_8), this.isStringIgnoreCase ? 2 : 0).matcher(StandardCharsets.ISO_8859_1.decode(ByteBuffer.wrap(bArr)));
                        for (int i15 = 0; i15 <= this.offsetRangeEnd - this.offsetRangeBegin; i15++) {
                            matcher.region(i15, this.length + i15);
                            if (matcher.lookingAt()) {
                                return this.type;
                            }
                        }
                    } else {
                        if (i10 < this.offsetRangeBegin + this.length) {
                            return MediaType.OCTET_STREAM;
                        }
                        for (int i16 = 0; i16 <= this.offsetRangeEnd - this.offsetRangeBegin; i16++) {
                            boolean z10 = true;
                            for (int i17 = 0; z10 && i17 < this.length; i17++) {
                                int lowerCase = bArr[i16 + i17] & this.mask[i17];
                                if (this.isStringIgnoreCase) {
                                    lowerCase = Character.toLowerCase(lowerCase);
                                }
                                z10 = lowerCase == this.pattern[i17];
                            }
                            if (z10) {
                                return this.type;
                            }
                        }
                    }
                    return MediaType.OCTET_STREAM;
                }
                long jSkip = inputStream.skip(i11 - i10);
                if (jSkip > 0) {
                    i10 = (int) (((long) i10) + jSkip);
                } else {
                    if (inputStream.read() == -1) {
                        return MediaType.OCTET_STREAM;
                    }
                    i10++;
                }
            } finally {
                inputStream.reset();
            }
        }
    }

    public int getLength() {
        return this.patternLength;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.type);
        byte[] bArr = this.pattern;
        return "Magic Detection for " + strValueOf + " looking for " + bArr.length + " bytes = " + Arrays.toString(bArr) + " mask = " + Arrays.toString(this.mask);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, int i10) {
        this(mediaType, bArr, null, i10, i10);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, int i10, int i11) {
        this(mediaType, bArr, bArr2, false, i10, i11);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z10, int i10, int i11) {
        this(mediaType, bArr, bArr2, z10, false, i10, i11);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z10, boolean z11, int i10, int i11) {
        if (mediaType == null) {
            throw new IllegalArgumentException("Matching media type is null");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Magic match pattern is null");
        }
        if (i10 >= 0 && i11 >= i10) {
            this.type = mediaType;
            this.isRegex = z10;
            this.isStringIgnoreCase = z11;
            int iMax = Math.max(bArr.length, bArr2 != null ? bArr2.length : 0);
            this.patternLength = iMax;
            if (z10) {
                this.length = 8192;
            } else {
                this.length = iMax;
            }
            this.mask = new byte[iMax];
            this.pattern = new byte[iMax];
            for (int i12 = 0; i12 < this.patternLength; i12++) {
                if (bArr2 != null && i12 < bArr2.length) {
                    this.mask[i12] = bArr2[i12];
                } else {
                    this.mask[i12] = -1;
                }
                if (i12 < bArr.length) {
                    this.pattern[i12] = (byte) (bArr[i12] & this.mask[i12]);
                } else {
                    this.pattern[i12] = 0;
                }
            }
            this.offsetRangeBegin = i10;
            this.offsetRangeEnd = i11;
            return;
        }
        throw new IllegalArgumentException("Invalid offset range: [" + i10 + "," + i11 + "]");
    }
}
