package io.sentry.util.network;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkRequestData {
    private final String method;
    private ReplayNetworkRequestOrResponse request;
    private Long requestBodySize;
    private ReplayNetworkRequestOrResponse response;
    private Long responseBodySize;
    private Integer statusCode;

    public NetworkRequestData(String str) {
        this.method = str;
    }

    public String getMethod() {
        return this.method;
    }

    public ReplayNetworkRequestOrResponse getRequest() {
        return this.request;
    }

    public Long getRequestBodySize() {
        return this.requestBodySize;
    }

    public ReplayNetworkRequestOrResponse getResponse() {
        return this.response;
    }

    public Long getResponseBodySize() {
        return this.responseBodySize;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setRequestDetails(ReplayNetworkRequestOrResponse replayNetworkRequestOrResponse) {
        this.request = replayNetworkRequestOrResponse;
        this.requestBodySize = replayNetworkRequestOrResponse.getSize();
    }

    public void setResponseDetails(int i10, ReplayNetworkRequestOrResponse replayNetworkRequestOrResponse) {
        this.statusCode = Integer.valueOf(i10);
        this.response = replayNetworkRequestOrResponse;
        this.responseBodySize = replayNetworkRequestOrResponse.getSize();
    }

    public String toString() {
        return "NetworkRequestData{method='" + this.method + "', statusCode=" + this.statusCode + ", requestBodySize=" + this.requestBodySize + ", responseBodySize=" + this.responseBodySize + ", request=" + this.request + ", response=" + this.response + '}';
    }
}
