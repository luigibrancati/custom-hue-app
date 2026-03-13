package io.flutter.view;

import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AccessibilityStringBuilder {
    private List<StringAttribute> attributes;
    private String locale;
    private String string;
    private String url;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class LocaleStringAttribute extends StringAttribute {
        String locale;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SpellOutStringAttribute extends StringAttribute {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class StringAttribute {
        int end;
        int start;
        StringAttributeType type;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class UrlStringAttribute extends StringAttribute {
        String url;

        private UrlStringAttribute() {
        }
    }

    public AccessibilityStringBuilder addAttributes(List<StringAttribute> list) {
        this.attributes = list;
        return this;
    }

    public AccessibilityStringBuilder addLocale(String str) {
        this.locale = str;
        return this;
    }

    public AccessibilityStringBuilder addString(String str) {
        this.string = str;
        return this;
    }

    public AccessibilityStringBuilder addUrl(String str) {
        this.url = str;
        return this;
    }

    public CharSequence build() {
        if (this.string == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.string);
        List<StringAttribute> list = this.attributes;
        if (list != null) {
            for (StringAttribute stringAttribute : list) {
                int iOrdinal = stringAttribute.type.ordinal();
                if (iOrdinal == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), stringAttribute.start, stringAttribute.end, 0);
                } else if (iOrdinal == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((LocaleStringAttribute) stringAttribute).locale)), stringAttribute.start, stringAttribute.end, 0);
                }
            }
        }
        String str = this.url;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan(this.url), 0, this.string.length(), 0);
        }
        String str2 = this.locale;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(this.locale)), 0, this.string.length(), 0);
        }
        return spannableString;
    }
}
