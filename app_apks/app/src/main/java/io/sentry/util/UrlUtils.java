package io.sentry.util;

import io.sentry.ISpan;
import io.sentry.SpanDataConvention;
import io.sentry.protocol.Request;
import java.net.URI;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UrlUtils {
    public static final String SENSITIVE_DATA_SUBSTITUTE = "[Filtered]";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class UrlDetails {
        private final String fragment;
        private final String query;
        private final String url;

        public UrlDetails(String str, String str2, String str3) {
            this.url = str;
            this.query = str2;
            this.fragment = str3;
        }

        public void applyToRequest(Request request) {
            if (request == null) {
                return;
            }
            request.setUrl(this.url);
            request.setQueryString(this.query);
            request.setFragment(this.fragment);
        }

        public void applyToSpan(ISpan iSpan) {
            if (iSpan == null) {
                return;
            }
            String str = this.query;
            if (str != null) {
                iSpan.setData(SpanDataConvention.HTTP_QUERY_KEY, str);
            }
            String str2 = this.fragment;
            if (str2 != null) {
                iSpan.setData(SpanDataConvention.HTTP_FRAGMENT_KEY, str2);
            }
        }

        public String getFragment() {
            return this.fragment;
        }

        public String getQuery() {
            return this.query;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUrlOrFallback() {
            String str = this.url;
            return str == null ? "unknown" : str;
        }
    }

    private static String filterUserInfo(String str) {
        if (!str.contains("@")) {
            return str;
        }
        boolean zStartsWith = str.startsWith("@");
        String str2 = SENSITIVE_DATA_SUBSTITUTE;
        if (zStartsWith) {
            return SENSITIVE_DATA_SUBSTITUTE + str;
        }
        if (str.substring(0, str.indexOf(64)).contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            str2 = "[Filtered]:[Filtered]";
        }
        return str2 + str.substring(str.indexOf(64));
    }

    private static boolean isValidAbsoluteUrl(URI uri) {
        try {
            uri.toURL();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static UrlDetails parse(String str) {
        String str2;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute() && !isValidAbsoluteUrl(uri)) {
                return new UrlDetails(null, null, null);
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new UrlDetails(str2 + filterUserInfo(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment());
        } catch (Exception unused) {
            return new UrlDetails(null, null, null);
        }
    }

    public static UrlDetails parseNullable(String str) {
        if (str == null) {
            return null;
        }
        return parse(str);
    }
}
