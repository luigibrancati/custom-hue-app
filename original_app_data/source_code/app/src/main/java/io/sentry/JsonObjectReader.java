package io.sentry;

import io.sentry.vendor.gson.stream.JsonReader;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectReader implements ObjectReader {
    private final JsonReader jsonReader;

    public JsonObjectReader(Reader reader) {
        this.jsonReader = new JsonReader(reader);
    }

    @Override // io.sentry.ObjectReader
    public void beginArray() {
        this.jsonReader.beginArray();
    }

    @Override // io.sentry.ObjectReader
    public void beginObject() {
        this.jsonReader.beginObject();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.jsonReader.close();
    }

    @Override // io.sentry.ObjectReader
    public void endArray() {
        this.jsonReader.endArray();
    }

    @Override // io.sentry.ObjectReader
    public void endObject() {
        this.jsonReader.endObject();
    }

    @Override // io.sentry.ObjectReader
    public boolean hasNext() {
        return this.jsonReader.hasNext();
    }

    @Override // io.sentry.ObjectReader
    public boolean nextBoolean() {
        return this.jsonReader.nextBoolean();
    }

    @Override // io.sentry.ObjectReader
    public Boolean nextBooleanOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Boolean.valueOf(this.jsonReader.nextBoolean());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public Date nextDateOrNull(ILogger iLogger) throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return ObjectReader.dateOrNull(this.jsonReader.nextString(), iLogger);
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public double nextDouble() {
        return this.jsonReader.nextDouble();
    }

    @Override // io.sentry.ObjectReader
    public Double nextDoubleOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Double.valueOf(this.jsonReader.nextDouble());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public float nextFloat() {
        return (float) this.jsonReader.nextDouble();
    }

    @Override // io.sentry.ObjectReader
    public Float nextFloatOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public int nextInt() {
        return this.jsonReader.nextInt();
    }

    @Override // io.sentry.ObjectReader
    public Integer nextIntegerOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Integer.valueOf(this.jsonReader.nextInt());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> List<T> nextListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (this.jsonReader.peek() == JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        this.jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        if (this.jsonReader.hasNext()) {
            do {
                try {
                    arrayList.add(jsonDeserializer.deserialize(this, iLogger));
                } catch (Exception e10) {
                    iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in list.", e10);
                }
            } while (this.jsonReader.peek() == JsonToken.BEGIN_OBJECT);
        }
        this.jsonReader.endArray();
        return arrayList;
    }

    @Override // io.sentry.ObjectReader
    public long nextLong() {
        return this.jsonReader.nextLong();
    }

    @Override // io.sentry.ObjectReader
    public Long nextLongOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Long.valueOf(this.jsonReader.nextLong());
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public <T> Map<String, List<T>> nextMapOfListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        HashMap map = new HashMap();
        beginObject();
        if (hasNext()) {
            while (true) {
                String strNextName = nextName();
                List<T> listNextListOrNull = nextListOrNull(iLogger, jsonDeserializer);
                if (listNextListOrNull != null) {
                    map.put(strNextName, listNextListOrNull);
                }
                if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                    break;
                }
            }
        }
        endObject();
        return map;
    }

    @Override // io.sentry.ObjectReader
    public <T> Map<String, T> nextMapOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (this.jsonReader.peek() == JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        this.jsonReader.beginObject();
        HashMap map = new HashMap();
        if (this.jsonReader.hasNext()) {
            while (true) {
                try {
                    map.put(this.jsonReader.nextName(), jsonDeserializer.deserialize(this, iLogger));
                } catch (Exception e10) {
                    iLogger.log(SentryLevel.WARNING, "Failed to deserialize object in map.", e10);
                }
                if (this.jsonReader.peek() != JsonToken.BEGIN_OBJECT && this.jsonReader.peek() != JsonToken.NAME) {
                    break;
                }
            }
        }
        this.jsonReader.endObject();
        return map;
    }

    @Override // io.sentry.ObjectReader
    public String nextName() {
        return this.jsonReader.nextName();
    }

    @Override // io.sentry.ObjectReader
    public void nextNull() {
        this.jsonReader.nextNull();
    }

    @Override // io.sentry.ObjectReader
    public Object nextObjectOrNull() {
        return new JsonObjectDeserializer().deserialize(this);
    }

    @Override // io.sentry.ObjectReader
    public <T> T nextOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer) throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return jsonDeserializer.deserialize(this, iLogger);
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public String nextString() {
        return this.jsonReader.nextString();
    }

    @Override // io.sentry.ObjectReader
    public String nextStringOrNull() throws IOException {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return this.jsonReader.nextString();
        }
        this.jsonReader.nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public TimeZone nextTimeZoneOrNull(ILogger iLogger) throws IOException {
        if (this.jsonReader.peek() == JsonToken.NULL) {
            this.jsonReader.nextNull();
            return null;
        }
        try {
            return TimeZone.getTimeZone(this.jsonReader.nextString());
        } catch (Exception e10) {
            iLogger.log(SentryLevel.ERROR, "Error when deserializing TimeZone", e10);
            return null;
        }
    }

    @Override // io.sentry.ObjectReader
    public void nextUnknown(ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, nextObjectOrNull());
        } catch (Exception e10) {
            iLogger.log(SentryLevel.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.ObjectReader
    public JsonToken peek() {
        return this.jsonReader.peek();
    }

    @Override // io.sentry.ObjectReader
    public void setLenient(boolean z10) {
        this.jsonReader.setLenient(z10);
    }

    @Override // io.sentry.ObjectReader
    public void skipValue() throws IOException {
        this.jsonReader.skipValue();
    }
}
