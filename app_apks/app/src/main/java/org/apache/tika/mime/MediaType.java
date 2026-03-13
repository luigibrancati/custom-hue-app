package org.apache.tika.mime;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaType implements Comparable<MediaType>, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String VALID_CHARS = "([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)";
    private static final long serialVersionUID = -3831000556189036392L;
    private final Map<String, String> parameters;
    private final int semicolon;
    private final int slash;
    private final String string;
    private static final Pattern SPECIAL = Pattern.compile("[\\(\\)<>@,;:\\\\\"/\\[\\]\\?=]");
    private static final Pattern SPECIAL_OR_WHITESPACE = Pattern.compile("[\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]");
    private static final Pattern TYPE_PATTERN = Pattern.compile("(?s)\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*/\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*($|;.*)");
    private static final Pattern CHARSET_FIRST_PATTERN = Pattern.compile("(?is)\\s*(charset\\s*=\\s*[^\\c;\\s]+)\\s*;\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*/\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*");
    private static final Map<String, MediaType> SIMPLE_TYPES = new HashMap();
    public static final MediaType OCTET_STREAM = parse(MimeTypes.OCTET_STREAM);
    public static final MediaType EMPTY = parse("application/x-empty");
    public static final MediaType TEXT_PLAIN = parse(MimeTypes.PLAIN_TEXT);
    public static final MediaType TEXT_HTML = parse("text/html");
    public static final MediaType APPLICATION_XML = parse(MimeTypes.XML);
    public static final MediaType APPLICATION_ZIP = parse("application/zip");

    public MediaType(String str, String str2, Map<String, String> map) {
        String strTrim = str.trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = strTrim.toLowerCase(locale);
        String lowerCase2 = str2.trim().toLowerCase(locale);
        int length = lowerCase.length();
        this.slash = length;
        this.semicolon = length + 1 + lowerCase2.length();
        if (map.isEmpty()) {
            this.parameters = Collections.EMPTY_MAP;
            this.string = lowerCase + "/" + lowerCase2;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lowerCase);
        sb2.append(JsonPointer.SEPARATOR);
        sb2.append(lowerCase2);
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            treeMap.put(entry.getKey().trim().toLowerCase(Locale.ENGLISH), entry.getValue());
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb2.append("; ");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            String str3 = (String) entry2.getValue();
            if (SPECIAL_OR_WHITESPACE.matcher(str3).find()) {
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                sb2.append(SPECIAL.matcher(str3).replaceAll("\\\\$0"));
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                sb2.append(str3);
            }
        }
        this.string = sb2.toString();
        this.parameters = Collections.unmodifiableSortedMap(treeMap);
    }

    public static MediaType application(String str) {
        return parse("application/" + str);
    }

    public static MediaType audio(String str) {
        return parse("audio/" + str);
    }

    public static MediaType image(String str) {
        return parse("image/" + str);
    }

    private static boolean isSimpleName(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '-' && cCharAt != '+' && cCharAt != '.' && cCharAt != '_' && (('0' > cCharAt || cCharAt > '9') && ('a' > cCharAt || cCharAt > 'z'))) {
                return false;
            }
        }
        return str.length() > 0;
    }

    public static MediaType parse(String str) {
        if (str == null) {
            return null;
        }
        Map<String, MediaType> map = SIMPLE_TYPES;
        synchronized (map) {
            try {
                MediaType mediaType = map.get(str);
                if (mediaType == null) {
                    int iIndexOf = str.indexOf(47);
                    if (iIndexOf == -1) {
                        return null;
                    }
                    if (map.size() < 10000 && isSimpleName(str.substring(0, iIndexOf)) && isSimpleName(str.substring(iIndexOf + 1))) {
                        mediaType = new MediaType(str, iIndexOf);
                        map.put(str, mediaType);
                    }
                }
                if (mediaType != null) {
                    return mediaType;
                }
                Matcher matcher = TYPE_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return new MediaType(matcher.group(1), matcher.group(2), parseParameters(matcher.group(3)));
                }
                Matcher matcher2 = CHARSET_FIRST_PATTERN.matcher(str);
                if (matcher2.matches()) {
                    return new MediaType(matcher2.group(2), matcher2.group(3), parseParameters(matcher2.group(1)));
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Map<String, String> parseParameters(String str) {
        String strSubstring;
        if (str.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        while (str.length() > 0) {
            int iIndexOf = str.indexOf(59);
            String strSubstring2 = "";
            if (iIndexOf != -1) {
                String strSubstring3 = str.substring(0, iIndexOf);
                strSubstring = str.substring(iIndexOf + 1);
                str = strSubstring3;
            } else {
                strSubstring = "";
            }
            int iIndexOf2 = str.indexOf(61);
            if (iIndexOf2 != -1) {
                strSubstring2 = str.substring(iIndexOf2 + 1);
                str = str.substring(0, iIndexOf2);
            }
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                map.put(strTrim, unquote(strSubstring2.trim()));
            }
            str = strSubstring;
        }
        return map;
    }

    public static Set<MediaType> set(MediaType... mediaTypeArr) {
        HashSet hashSet = new HashSet();
        for (MediaType mediaType : mediaTypeArr) {
            if (mediaType != null) {
                hashSet.add(mediaType);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static MediaType text(String str) {
        return parse("text/" + str);
    }

    private static Map<String, String> union(Map<String, String> map, Map<String, String> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        if (map2.isEmpty()) {
            return map;
        }
        HashMap map3 = new HashMap();
        map3.putAll(map);
        map3.putAll(map2);
        return map3;
    }

    private static String unquote(String str) {
        while (true) {
            if (!str.startsWith("\"") && !str.startsWith("'")) {
                break;
            }
            str = str.substring(1);
        }
        while (true) {
            if (!str.endsWith("\"") && !str.endsWith("'")) {
                return str;
            }
            str = str.substring(0, str.length() - 1);
        }
    }

    public static MediaType video(String str) {
        return parse("video/" + str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MediaType) {
            return this.string.equals(((MediaType) obj).string);
        }
        return false;
    }

    public MediaType getBaseType() {
        return this.parameters.isEmpty() ? this : parse(this.string.substring(0, this.semicolon));
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public String getSubtype() {
        return this.string.substring(this.slash + 1, this.semicolon);
    }

    public String getType() {
        return this.string.substring(0, this.slash);
    }

    public boolean hasParameters() {
        return !this.parameters.isEmpty();
    }

    public int hashCode() {
        return this.string.hashCode();
    }

    public String toString() {
        return this.string;
    }

    @Override // java.lang.Comparable
    public int compareTo(MediaType mediaType) {
        return this.string.compareTo(mediaType.string);
    }

    public static Set<MediaType> set(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            MediaType mediaType = parse(str);
            if (mediaType != null) {
                hashSet.add(mediaType);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public MediaType(String str, String str2) {
        this(str, str2, (Map<String, String>) Collections.EMPTY_MAP);
    }

    private MediaType(String str, int i10) {
        this.string = str;
        this.slash = i10;
        this.semicolon = str.length();
        this.parameters = Collections.EMPTY_MAP;
    }

    public MediaType(MediaType mediaType, Map<String, String> map) {
        this(mediaType.getType(), mediaType.getSubtype(), union(mediaType.parameters, map));
    }

    public MediaType(MediaType mediaType, String str, String str2) {
        this(mediaType, (Map<String, String>) Collections.singletonMap(str, str2));
    }

    public MediaType(MediaType mediaType, Charset charset) {
        this(mediaType, "charset", charset.name());
    }
}
