package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class FilterString {
    private final String filterString;
    private final Pattern pattern;

    public FilterString(String str) {
        Pattern patternCompile;
        this.filterString = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            Sentry.getCurrentScopes().getOptions().getLogger().log(SentryLevel.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.pattern = patternCompile;
    }

    public boolean equals(Object obj) {
        if (obj == null || FilterString.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.filterString, ((FilterString) obj).filterString);
    }

    public String getFilterString() {
        return this.filterString;
    }

    public int hashCode() {
        return Objects.hash(this.filterString);
    }

    public boolean matches(String str) {
        Pattern pattern = this.pattern;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }
}
