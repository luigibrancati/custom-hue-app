package org.apache.tika.language.detect;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LanguageNames {
    public static boolean equals(String str, String str2) {
        return Locale.forLanguageTag(str).equals(Locale.forLanguageTag(str2));
    }

    public static boolean hasMacroLanguage(String str) {
        return false;
    }

    public static boolean isMacroLanguage(String str) {
        return false;
    }

    public static String makeName(String str, String str2, String str3) {
        return new Locale.Builder().setLanguage(str).setScript(str2).setRegion(str3).build().toLanguageTag();
    }

    public static String normalizeName(String str) {
        return Locale.forLanguageTag(str).toLanguageTag();
    }

    public static String getMacroLanguage(String str) {
        return str;
    }
}
