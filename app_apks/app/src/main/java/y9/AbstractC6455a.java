package y9;

import java.util.TimeZone;

/* JADX INFO: renamed from: y9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6455a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f48497a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static int b(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date c(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.AbstractC6455a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int d(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
