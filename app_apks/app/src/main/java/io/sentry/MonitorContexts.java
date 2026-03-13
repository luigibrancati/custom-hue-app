package io.sentry;

import io.sentry.SpanContext;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class MonitorContexts extends ConcurrentHashMap<String, Object> implements JsonSerializable {
    private static final long serialVersionUID = 3987329379811822556L;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<MonitorContexts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public MonitorContexts deserialize(ObjectReader objectReader, ILogger iLogger) {
            MonitorContexts monitorContexts = new MonitorContexts();
            objectReader.beginObject();
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("trace")) {
                    monitorContexts.setTrace(new SpanContext.Deserializer().deserialize(objectReader, iLogger));
                } else {
                    Object objNextObjectOrNull = objectReader.nextObjectOrNull();
                    if (objNextObjectOrNull != null) {
                        monitorContexts.put(strNextName, objNextObjectOrNull);
                    }
                }
            }
            objectReader.endObject();
            return monitorContexts;
        }
    }

    public MonitorContexts() {
    }

    private <T> T toContextType(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public SpanContext getTrace() {
        return (SpanContext) toContextType("trace", SpanContext.class);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                objectWriter.name(str).value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public void setTrace(SpanContext spanContext) {
        Objects.requireNonNull(spanContext, "traceContext is required");
        put("trace", spanContext);
    }

    public MonitorContexts(MonitorContexts monitorContexts) {
        for (Map.Entry<String, Object> entry : monitorContexts.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("trace".equals(entry.getKey()) && (value instanceof SpanContext)) {
                    setTrace(new SpanContext((SpanContext) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}
