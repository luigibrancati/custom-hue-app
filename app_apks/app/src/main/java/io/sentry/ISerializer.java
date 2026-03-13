package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ISerializer {
    <T> T deserialize(Reader reader, Class<T> cls);

    <T, R> T deserializeCollection(Reader reader, Class<T> cls, JsonDeserializer<R> jsonDeserializer);

    SentryEnvelope deserializeEnvelope(InputStream inputStream);

    String serialize(Map<String, Object> map);

    void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream);

    <T> void serialize(T t10, Writer writer);
}
