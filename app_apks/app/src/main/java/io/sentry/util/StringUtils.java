package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class StringUtils {
    private static final String CORRUPTED_NIL_UUID = "0000-0000";
    public static final String PROPER_NIL_UUID = "00000000-0000-0000-0000-000000000000";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Pattern PATTERN_WORD_SNAKE_CASE = Pattern.compile("[\\W_]+");

    private StringUtils() {
    }

    public static String byteCountToString(long j10) {
        if (-1000 < j10 && j10 < 1000) {
            return j10 + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
        while (true) {
            if (j10 > -999950 && j10 < 999950) {
                return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j10 / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j10 /= 1000;
            stringCharacterIterator.next();
        }
    }

    public static String calculateStringHash(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(UTF_8))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                iLogger.log(SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th) {
                iLogger.log(SentryLevel.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        return null;
    }

    public static String camelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] strArrSplit = PATTERN_WORD_SNAKE_CASE.split(str, -1);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb2.append(capitalize(str2));
        }
        return sb2.toString();
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(strSubstring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static int countOf(String str, char c10) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    public static String getStringAfterDot(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i10 = iLastIndexOf + 1)) ? str : str.substring(i10);
    }

    public static String join(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<? extends CharSequence> it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
            while (it.hasNext()) {
                sb2.append(charSequence);
                sb2.append(it.next());
            }
        }
        return sb2.toString();
    }

    public static String normalizeUUID(String str) {
        return str.equals(CORRUPTED_NIL_UUID) ? PROPER_NIL_UUID : str;
    }

    public static String removePrefix(String str, String str2) {
        return str == null ? "" : str.indexOf(str2) == 0 ? str.substring(str2.length()) : str;
    }

    public static String removeSurrounding(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    public static String substringBefore(String str, String str2) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
