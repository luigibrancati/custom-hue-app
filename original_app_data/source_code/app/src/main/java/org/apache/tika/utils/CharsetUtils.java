package org.apache.tika.utils;

import io.sentry.MeasurementUnit;
import io.sentry.protocol.ViewHierarchy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.OfficeOpenXMLCore;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CharsetUtils {
    private static final Map<String, Charset> COMMON_CHARSETS;
    private static Method getCharsetICU;
    private static Method isSupportedICU;
    private static final Pattern CHARSET_NAME_PATTERN = Pattern.compile("[ \\\"]*([^ >,;\\\"]+).*");
    private static final Pattern ISO_NAME_PATTERN = Pattern.compile(".*8859-(\\d+)");
    private static final Pattern CP_NAME_PATTERN = Pattern.compile("cp-(\\d+)");
    private static final Pattern WIN_NAME_PATTERN = Pattern.compile("win-?(\\d+)");

    static {
        HashMap map = new HashMap();
        COMMON_CHARSETS = map;
        Class<?> clsLoadClass = null;
        getCharsetICU = null;
        isSupportedICU = null;
        initCommonCharsets("Big5", "EUC-JP", "EUC-KR", "x-EUC-TW", "GB18030", "IBM855", "IBM866", "ISO-2022-CN", "ISO-2022-JP", "ISO-2022-KR", "ISO-8859-1", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-11", "ISO-8859-13", "ISO-8859-15", "KOI8-R", "x-MacCyrillic", "SHIFT_JIS", "UTF-8", "UTF-16BE", "UTF-16LE", "windows-1251", "windows-1252", "windows-1253", "windows-1255");
        map.put("iso-8851-1", (Charset) map.get("iso-8859-1"));
        map.put(ViewHierarchy.JsonKeys.WINDOWS, (Charset) map.get("windows-1252"));
        map.put("koi8r", (Charset) map.get("koi8-r"));
        try {
            clsLoadClass = CharsetUtils.class.getClassLoader().loadClass("com.ibm.icu.charset.CharsetICU");
        } catch (ClassNotFoundException unused) {
        }
        if (clsLoadClass != null) {
            try {
                getCharsetICU = clsLoadClass.getMethod("forNameICU", String.class);
                try {
                    isSupportedICU = clsLoadClass.getMethod("isSupported", String.class);
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public static String clean(String str) {
        try {
            return forName(str).name();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Charset forName(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        Matcher matcher = CHARSET_NAME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalCharsetNameException(str);
        }
        String strGroup = matcher.group(1);
        String lowerCase = strGroup.toLowerCase(Locale.ENGLISH);
        Map<String, Charset> map = COMMON_CHARSETS;
        Charset charset = map.get(lowerCase);
        if (charset != null) {
            return charset;
        }
        if (MeasurementUnit.NONE.equals(lowerCase) || "no".equals(lowerCase)) {
            throw new IllegalCharsetNameException(strGroup);
        }
        Matcher matcher2 = ISO_NAME_PATTERN.matcher(lowerCase);
        Matcher matcher3 = CP_NAME_PATTERN.matcher(lowerCase);
        Matcher matcher4 = WIN_NAME_PATTERN.matcher(lowerCase);
        if (matcher2.matches()) {
            strGroup = "iso-8859-" + matcher2.group(1);
            charset = map.get(strGroup);
        } else if (matcher3.matches()) {
            strGroup = OfficeOpenXMLCore.PREFIX + matcher3.group(1);
            charset = map.get(strGroup);
        } else if (matcher4.matches()) {
            strGroup = "windows-" + matcher4.group(1);
            charset = map.get(strGroup);
        }
        if (charset != null) {
            return charset;
        }
        Method method = getCharsetICU;
        if (method != null) {
            try {
                Charset charset2 = (Charset) method.invoke(null, strGroup);
                if (charset2 != null) {
                    return charset2;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return Charset.forName(strGroup);
    }

    private static Map<String, Charset> initCommonCharsets(String... strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            try {
                Charset charsetForName = Charset.forName(str);
                COMMON_CHARSETS.put(str.toLowerCase(Locale.ENGLISH), charsetForName);
                Iterator<String> it = charsetForName.aliases().iterator();
                while (it.hasNext()) {
                    COMMON_CHARSETS.put(it.next().toLowerCase(Locale.ENGLISH), charsetForName);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return map;
    }

    public static boolean isSupported(String str) {
        try {
            Method method = isSupportedICU;
            if (method == null || !((Boolean) method.invoke(null, str)).booleanValue()) {
                return Charset.isSupported(str);
            }
            return true;
        } catch (IllegalCharsetNameException | IllegalArgumentException | Exception unused) {
            return false;
        }
    }
}
