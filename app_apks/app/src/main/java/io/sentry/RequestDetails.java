package io.sentry;

import io.sentry.util.Objects;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RequestDetails {
    private final Map<String, String> headers;
    private final URL url;

    public RequestDetails(String str, Map<String, String> map) {
        Objects.requireNonNull(str, "url is required");
        Objects.requireNonNull(map, "headers is required");
        try {
            this.url = URI.create(str).toURL();
            this.headers = map;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public URL getUrl() {
        return this.url;
    }
}
