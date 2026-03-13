package io.sentry;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class SentryValues<T> {
    private final List<T> values;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String VALUES = "values";
    }

    public SentryValues(List<T> list) {
        this.values = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    public List<T> getValues() {
        return this.values;
    }
}
