package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryAttributes {
    private final Map<String, SentryAttribute> attributes;

    private SentryAttributes(Map<String, SentryAttribute> map) {
        this.attributes = map;
    }

    public static SentryAttributes fromMap(Map<String, Object> map) {
        if (map == null) {
            return new SentryAttributes(new ConcurrentHashMap());
        }
        SentryAttributes sentryAttributes = new SentryAttributes(new ConcurrentHashMap(map.size()));
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                sentryAttributes.add(SentryAttribute.named(key, entry.getValue()));
            }
        }
        return sentryAttributes;
    }

    public static SentryAttributes of(SentryAttribute... sentryAttributeArr) {
        if (sentryAttributeArr == null) {
            return new SentryAttributes(new ConcurrentHashMap());
        }
        SentryAttributes sentryAttributes = new SentryAttributes(new ConcurrentHashMap(sentryAttributeArr.length));
        for (SentryAttribute sentryAttribute : sentryAttributeArr) {
            sentryAttributes.add(sentryAttribute);
        }
        return sentryAttributes;
    }

    public void add(SentryAttribute sentryAttribute) {
        if (sentryAttribute == null) {
            return;
        }
        this.attributes.put(sentryAttribute.getName(), sentryAttribute);
    }

    public Map<String, SentryAttribute> getAttributes() {
        return this.attributes;
    }
}
