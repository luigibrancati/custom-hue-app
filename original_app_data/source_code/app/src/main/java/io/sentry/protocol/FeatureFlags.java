package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.FeatureFlag;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class FeatureFlags implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "flags";
    private Map<String, Object> unknown;
    private List<FeatureFlag> values;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<FeatureFlags> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public FeatureFlags deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            List arrayList = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("values")) {
                    arrayList = objectReader.nextListOrNull(iLogger, new FeatureFlag.Deserializer());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            FeatureFlags featureFlags = new FeatureFlags((List<FeatureFlag>) arrayList);
            featureFlags.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return featureFlags;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String VALUES = "values";
    }

    public FeatureFlags() {
        this.values = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeatureFlags.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.values, ((FeatureFlags) obj).values);
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public List<FeatureFlag> getValues() {
        return this.values;
    }

    public int hashCode() {
        return Objects.hash(this.values);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("values").value(iLogger, this.values);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setValues(List<FeatureFlag> list) {
        this.values = list;
    }

    public FeatureFlags(FeatureFlags featureFlags) {
        this.values = featureFlags.values;
        this.unknown = CollectionUtils.newConcurrentHashMap(featureFlags.unknown);
    }

    public FeatureFlags(List<FeatureFlag> list) {
        this.values = list;
    }
}
