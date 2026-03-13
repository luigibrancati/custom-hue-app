package com.braze.events;

import com.braze.requests.f;
import com.braze.requests.o;
import io.sentry.protocol.Request;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\nR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent;", "", "Lcom/braze/requests/o;", "brazeRequest", "Lcom/braze/communication/d;", "httpConnectorResult", "<init>", "(Lcom/braze/requests/o;Lcom/braze/communication/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/braze/requests/o;", "Lcom/braze/communication/d;", "responseCode", "I", "getResponseCode", "", "responseHeaders", "Ljava/util/Map;", "getResponseHeaders", "()Ljava/util/Map;", "", "requestInitiationTime", "Ljava/lang/Long;", "getRequestInitiationTime", "()Ljava/lang/Long;", "requestUrl", "Ljava/lang/String;", "getRequestUrl", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "requestType", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "getRequestType", "()Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "RequestType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BrazeNetworkFailureEvent {
    private final o brazeRequest;
    private final com.braze.communication.d httpConnectorResult;
    private final Long requestInitiationTime;
    private final RequestType requestType;
    private final String requestUrl;
    private final int responseCode;
    private final Map<String, String> responseHeaders;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_CARDS_SYNC", "OTHER", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestType {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ RequestType[] $VALUES;
        public static final RequestType CONTENT_CARDS_SYNC = new RequestType("CONTENT_CARDS_SYNC", 0);
        public static final RequestType OTHER = new RequestType("OTHER", 1);

        private static final /* synthetic */ RequestType[] $values() {
            return new RequestType[]{CONTENT_CARDS_SYNC, OTHER};
        }

        static {
            RequestType[] requestTypeArr$values = $values();
            $VALUES = requestTypeArr$values;
            $ENTRIES = AbstractC5277b.a(requestTypeArr$values);
        }

        private RequestType(String str, int i10) {
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) $VALUES.clone();
        }
    }

    public BrazeNetworkFailureEvent(o brazeRequest, com.braze.communication.d httpConnectorResult) {
        AbstractC4862t.e(brazeRequest, "brazeRequest");
        AbstractC4862t.e(httpConnectorResult, "httpConnectorResult");
        this.brazeRequest = brazeRequest;
        this.httpConnectorResult = httpConnectorResult;
        this.responseCode = httpConnectorResult.f27521a;
        this.responseHeaders = httpConnectorResult.f27522b;
        com.braze.requests.b bVar = (com.braze.requests.b) brazeRequest;
        this.requestInitiationTime = bVar.f28221e;
        this.requestUrl = bVar.e().f28347a;
        this.requestType = brazeRequest instanceof f ? RequestType.CONTENT_CARDS_SYNC : RequestType.OTHER;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) other;
        return AbstractC4862t.a(this.brazeRequest, brazeNetworkFailureEvent.brazeRequest) && AbstractC4862t.a(this.httpConnectorResult, brazeNetworkFailureEvent.httpConnectorResult);
    }

    public int hashCode() {
        return this.httpConnectorResult.hashCode() + (this.brazeRequest.hashCode() * 31);
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(brazeRequest=" + this.brazeRequest + ", httpConnectorResult=" + this.httpConnectorResult + ")";
    }
}
