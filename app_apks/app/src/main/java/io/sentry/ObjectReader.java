package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ObjectReader extends Closeable {
    static Date dateOrNull(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return DateUtils.getDateTime(str);
            } catch (Exception unused) {
                return DateUtils.getDateTimeWithMillisPrecision(str);
            }
        } catch (Exception e10) {
            iLogger.log(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e10);
            return null;
        }
    }

    void beginArray();

    void beginObject();

    void endArray();

    void endObject();

    boolean hasNext();

    boolean nextBoolean();

    Boolean nextBooleanOrNull();

    Date nextDateOrNull(ILogger iLogger);

    double nextDouble();

    Double nextDoubleOrNull();

    float nextFloat();

    Float nextFloatOrNull();

    int nextInt();

    Integer nextIntegerOrNull();

    <T> List<T> nextListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    long nextLong();

    Long nextLongOrNull();

    <T> Map<String, List<T>> nextMapOfListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    <T> Map<String, T> nextMapOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    String nextName();

    void nextNull();

    Object nextObjectOrNull();

    <T> T nextOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    String nextString();

    String nextStringOrNull();

    TimeZone nextTimeZoneOrNull(ILogger iLogger);

    void nextUnknown(ILogger iLogger, Map<String, Object> map, String str);

    JsonToken peek();

    void setLenient(boolean z10);

    void skipValue();
}
