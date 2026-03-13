package io.sentry.vendor.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    public static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004a, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004a, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:19:0x0054, B:21:0x0064, B:22:0x0066, B:24:0x0072, B:25:0x0075, B:27:0x007b, B:31:0x0085, B:36:0x0095, B:38:0x009d, B:49:0x00d2, B:51:0x00d8, B:53:0x00de, B:77:0x018b, B:57:0x00e8, B:58:0x0103, B:59:0x0104, B:63:0x0120, B:65:0x012d, B:68:0x0136, B:70:0x0155, B:73:0x0164, B:74:0x0186, B:76:0x0189, B:62:0x010f, B:79:0x01bc, B:80:0x01c3, B:42:0x00b5, B:43:0x00b8), top: B:91:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004a, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x004a, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:19:0x0054, B:21:0x0064, B:22:0x0066, B:24:0x0072, B:25:0x0075, B:27:0x007b, B:31:0x0085, B:36:0x0095, B:38:0x009d, B:49:0x00d2, B:51:0x00d8, B:53:0x00de, B:77:0x018b, B:57:0x00e8, B:58:0x0103, B:59:0x0104, B:63:0x0120, B:65:0x012d, B:68:0x0136, B:70:0x0155, B:73:0x0164, B:74:0x0186, B:76:0x0189, B:62:0x010f, B:79:0x01bc, B:80:0x01c3, B:42:0x00b5, B:43:0x00b8), top: B:91:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i10, int i11) {
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

    public static String format(Date date, boolean z10) {
        return format(date, z10, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        if (z10) {
            sb2.append('.');
            padInt(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            padInt(sb2, iAbs, 2);
            sb2.append(':');
            padInt(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }
}
