package io.sentry;

import io.sentry.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class CustomSamplingContext {
    private final Map<String, Object> data = new HashMap();

    public Object get(String str) {
        Objects.requireNonNull(str, "key is required");
        return this.data.get(str);
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public void set(String str, Object obj) {
        Objects.requireNonNull(str, "key is required");
        this.data.put(str, obj);
    }
}
