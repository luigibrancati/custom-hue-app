package org.apache.tika.mime;

import io.sentry.SentryOptions;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class Patterns implements Serializable {
    private static final long serialVersionUID = -5778015347278111140L;
    private final MediaTypeRegistry registry;
    private final Map<String, MimeType> names = new HashMap();
    private final Map<String, MimeType> extensions = new HashMap();
    private final SortedMap<String, MimeType> globs = new TreeMap(new LengthComparator());
    private int minExtensionLength = Integer.MAX_VALUE;
    private int maxExtensionLength = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class LengthComparator implements Comparator<String>, Serializable {
        private static final long serialVersionUID = 8468289702915532359L;

        private LengthComparator() {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            int length = str2.length() - str.length();
            return length == 0 ? str.compareTo(str2) : length;
        }
    }

    public Patterns(MediaTypeRegistry mediaTypeRegistry) {
        this.registry = mediaTypeRegistry;
    }

    private void addExtension(String str, MimeType mimeType) throws MimeTypeException {
        MimeType mimeType2 = this.extensions.get(str);
        if (mimeType2 == null || this.registry.isSpecializationOf(mimeType2.getType(), mimeType.getType())) {
            this.extensions.put(str, mimeType);
            int length = str.length();
            this.minExtensionLength = Math.min(this.minExtensionLength, length);
            this.maxExtensionLength = Math.max(this.maxExtensionLength, length);
            return;
        }
        if (mimeType2 == mimeType || this.registry.isSpecializationOf(mimeType.getType(), mimeType2.getType())) {
            return;
        }
        throw new MimeTypeException("Conflicting extension pattern: " + str);
    }

    private void addGlob(String str, MimeType mimeType) throws MimeTypeException {
        MimeType mimeType2 = this.globs.get(str);
        if (mimeType2 == null || this.registry.isSpecializationOf(mimeType2.getType(), mimeType.getType())) {
            this.globs.put(str, mimeType);
        } else {
            if (mimeType2 == mimeType || this.registry.isSpecializationOf(mimeType.getType(), mimeType2.getType())) {
                return;
            }
            throw new MimeTypeException("Conflicting glob pattern: " + str);
        }
    }

    private void addName(String str, MimeType mimeType) throws MimeTypeException {
        MimeType mimeType2 = this.names.get(str);
        if (mimeType2 == null || this.registry.isSpecializationOf(mimeType2.getType(), mimeType.getType())) {
            this.names.put(str, mimeType);
        } else {
            if (mimeType2 == mimeType || this.registry.isSpecializationOf(mimeType.getType(), mimeType2.getType())) {
                return;
            }
            throw new MimeTypeException("Conflicting name pattern: " + str);
        }
    }

    private String compile(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\\A");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '?') {
                sb2.append('.');
            } else if (cCharAt == '*') {
                sb2.append(SentryOptions.DEFAULT_PROPAGATION_TARGETS);
            } else if ("\\[]^.-$+(){}|".indexOf(cCharAt) != -1) {
                sb2.append('\\');
                sb2.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append("\\z");
        return sb2.toString();
    }

    public void add(String str, MimeType mimeType) {
        add(str, false, mimeType);
    }

    public MimeType matches(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Name is missing");
        }
        if (this.names.containsKey(str)) {
            return this.names.get(str);
        }
        for (int iMin = Math.min(this.maxExtensionLength, str.length()); iMin >= this.minExtensionLength; iMin--) {
            String strSubstring = str.substring(str.length() - iMin);
            if (this.extensions.containsKey(strSubstring)) {
                return this.extensions.get(strSubstring);
            }
        }
        for (Map.Entry<String, MimeType> entry : this.globs.entrySet()) {
            if (str.matches(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void add(String str, boolean z10, MimeType mimeType) {
        if (str == null || mimeType == null) {
            throw new IllegalArgumentException("Pattern and/or mime type is missing");
        }
        if (z10) {
            addGlob(str, mimeType);
            return;
        }
        if (str.indexOf(42) == -1 && str.indexOf(63) == -1 && str.indexOf(91) == -1) {
            addName(str, mimeType);
            return;
        }
        if (!str.startsWith("*") || str.indexOf(42, 1) != -1 || str.indexOf(63) != -1 || str.indexOf(91) != -1) {
            addGlob(compile(str), mimeType);
            return;
        }
        String strSubstring = str.substring(1);
        addExtension(strSubstring, mimeType);
        mimeType.addExtension(strSubstring);
    }
}
