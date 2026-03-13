package io.sentry;

import java.net.URI;
import java.util.Locale;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DsnUtil {
    public static boolean urlContainsDsnHost(SentryOptions sentryOptions, String str) {
        URI sentryUri;
        String host;
        if (sentryOptions == null || str == null || sentryOptions.getDsn() == null || (host = (sentryUri = sentryOptions.retrieveParsedDsn().getSentryUri()).getHost()) == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = host.toLowerCase(locale);
        int port = sentryUri.getPort();
        if (port <= 0) {
            return str.toLowerCase(locale).contains(lowerCase);
        }
        return str.toLowerCase(locale).contains(lowerCase + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + port);
    }
}
