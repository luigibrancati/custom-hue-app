package io.sentry;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class BaggageHeader {
    public static final String BAGGAGE_HEADER = "baggage";
    private final String value;

    public BaggageHeader(String str) {
        this.value = str;
    }

    public static BaggageHeader fromBaggageAndOutgoingHeader(Baggage baggage, List<String> list) {
        String headerString = baggage.toHeaderString(Baggage.fromHeader(list, true, baggage.logger).getThirdPartyHeader());
        if (headerString.isEmpty()) {
            return null;
        }
        return new BaggageHeader(headerString);
    }

    public String getName() {
        return BAGGAGE_HEADER;
    }

    public String getValue() {
        return this.value;
    }
}
