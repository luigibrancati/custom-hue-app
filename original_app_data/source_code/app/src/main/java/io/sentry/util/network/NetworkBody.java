package io.sentry.util.network;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkBody {
    private final Object body;
    private final List<NetworkBodyWarning> warnings;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum NetworkBodyWarning {
        JSON_TRUNCATED("JSON_TRUNCATED"),
        TEXT_TRUNCATED("TEXT_TRUNCATED"),
        INVALID_JSON("INVALID_JSON"),
        BODY_PARSE_ERROR("BODY_PARSE_ERROR");

        private final String value;

        NetworkBodyWarning(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public NetworkBody(Object obj) {
        this(obj, null);
    }

    public Object getBody() {
        return this.body;
    }

    public List<NetworkBodyWarning> getWarnings() {
        return this.warnings;
    }

    public String toString() {
        return "NetworkBody{body=" + this.body + ", warnings=" + this.warnings + '}';
    }

    public NetworkBody(Object obj, List<NetworkBodyWarning> list) {
        this.body = obj;
        this.warnings = list;
    }
}
