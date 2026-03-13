package io.sentry.util.network;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ReplayNetworkRequestOrResponse {
    private final NetworkBody body;
    private final Map<String, String> headers;
    private final Long size;

    public ReplayNetworkRequestOrResponse(Long l10, NetworkBody networkBody, Map<String, String> map) {
        this.size = l10;
        this.body = networkBody;
        this.headers = map;
    }

    public NetworkBody getBody() {
        return this.body;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Long getSize() {
        return this.size;
    }

    public String toString() {
        return "ReplayNetworkRequestOrResponse{size=" + this.size + ", body=" + this.body + ", headers=" + this.headers + '}';
    }
}
