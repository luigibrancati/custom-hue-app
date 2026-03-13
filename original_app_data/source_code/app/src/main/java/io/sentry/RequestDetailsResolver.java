package io.sentry;

import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RequestDetailsResolver {
    private static final String SENTRY_AUTH = "X-Sentry-Auth";
    private static final String USER_AGENT = "User-Agent";
    private final Dsn dsn;
    private final String sentryClientName;

    public RequestDetailsResolver(String str, String str2) {
        Objects.requireNonNull(str, "dsn is required");
        this.dsn = new Dsn(str);
        this.sentryClientName = str2;
    }

    public RequestDetails resolve() {
        String str;
        URI sentryUri = this.dsn.getSentryUri();
        String string = sentryUri.resolve(sentryUri.getPath() + "/envelope/").toString();
        String publicKey = this.dsn.getPublicKey();
        String secretKey = this.dsn.getSecretKey();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.sentryClientName);
        sb2.append(",sentry_key=");
        sb2.append(publicKey);
        if (secretKey == null || secretKey.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + secretKey;
        }
        sb2.append(str);
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put(USER_AGENT, this.sentryClientName);
        map.put(SENTRY_AUTH, string2);
        return new RequestDetails(string, map);
    }

    public RequestDetailsResolver(SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "options is required");
        this.dsn = sentryOptions.retrieveParsedDsn();
        this.sentryClientName = sentryOptions.getSentryClientName();
    }
}
