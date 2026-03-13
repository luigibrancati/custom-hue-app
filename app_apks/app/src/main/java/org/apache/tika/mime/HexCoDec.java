package org.apache.tika.mime;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class HexCoDec {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    private static int hexCharToNibble(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Not a hex char - '" + c10 + "'");
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static char[] encode(byte[] bArr, int i10, int i11) {
        char[] cArr = new char[i11 * 2];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + 1;
            byte b10 = bArr[i10];
            int i15 = b10 & ForkServer.ERROR;
            int i16 = i13 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i13] = cArr2[i15 >> 4];
            i13 += 2;
            cArr[i16] = cArr2[b10 & 15];
            i12++;
            i10 = i14;
        }
        return cArr;
    }

    public static byte[] decode(char[] cArr, int i10, int i11) {
        if ((i11 & 1) == 0) {
            int i12 = i11 / 2;
            byte[] bArr = new byte[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i10 + 1;
                int iHexCharToNibble = hexCharToNibble(cArr[i10]) * 16;
                i10 += 2;
                bArr[i13] = (byte) (iHexCharToNibble + hexCharToNibble(cArr[i14]));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length must be even");
    }
}
