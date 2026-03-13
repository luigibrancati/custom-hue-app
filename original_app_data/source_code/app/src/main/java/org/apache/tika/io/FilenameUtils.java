package org.apache.tika.io;

import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FilenameUtils {
    private static final Pattern ASCII_NUMERIC;
    private static final HashSet<Character> RESERVED = new HashSet<>(38);
    public static final char[] RESERVED_FILENAME_CHARACTERS;

    static {
        char[] cArr = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, '?', ':', '*', '<', '>', '|'};
        RESERVED_FILENAME_CHARACTERS = cArr;
        for (char c10 : cArr) {
            RESERVED.add(Character.valueOf(c10));
        }
        ASCII_NUMERIC = Pattern.compile("\\A\\.(?i)[a-z0-9]{1,5}\\Z");
    }

    public static String getName(String str) {
        if (str != null && !str.isEmpty()) {
            String strSubstring = str.substring(Math.max(str.lastIndexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER), Math.max(str.lastIndexOf("/"), str.lastIndexOf("\\"))) + 1);
            if (!strSubstring.equals("..") && !strSubstring.equals(".")) {
                return strSubstring;
            }
        }
        return "";
    }

    public static String getSuffixFromPath(String str) {
        String name = getName(str);
        int iLastIndexOf = name.lastIndexOf(".");
        if (iLastIndexOf <= -1 || name.length() - iLastIndexOf >= 6) {
            return "";
        }
        String strSubstring = name.substring(iLastIndexOf);
        return ASCII_NUMERIC.matcher(strSubstring).matches() ? strSubstring : "";
    }

    public static String normalize(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = charArray[i10];
            if (RESERVED.contains(Character.valueOf(c10))) {
                sb2.append('%');
                sb2.append(c10 < 16 ? WebrtcBuildVersion.maint_version : "");
                sb2.append(Integer.toHexString(c10).toUpperCase(Locale.ROOT));
            } else {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }
}
