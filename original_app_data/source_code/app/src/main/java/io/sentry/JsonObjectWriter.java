package io.sentry;

import io.sentry.vendor.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectWriter implements ObjectWriter {
    private final JsonObjectSerializer jsonObjectSerializer;
    private final JsonWriter jsonWriter;

    public JsonObjectWriter(Writer writer, int i10) {
        this.jsonWriter = new JsonWriter(writer);
        this.jsonObjectSerializer = new JsonObjectSerializer(i10);
    }

    @Override // io.sentry.ObjectWriter
    public String getIndent() {
        return this.jsonWriter.getIndent();
    }

    @Override // io.sentry.ObjectWriter
    public ObjectWriter jsonValue(String str) throws IOException {
        this.jsonWriter.jsonValue(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public void setIndent(String str) {
        this.jsonWriter.setIndent(str);
    }

    @Override // io.sentry.ObjectWriter
    public void setLenient(boolean z10) {
        this.jsonWriter.setLenient(z10);
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginArray() throws IOException {
        this.jsonWriter.beginArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginObject() throws IOException {
        this.jsonWriter.beginObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endArray() {
        this.jsonWriter.endArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endObject() {
        this.jsonWriter.endObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter name(String str) {
        this.jsonWriter.name(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter nullValue() throws IOException {
        this.jsonWriter.nullValue();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(String str) throws IOException {
        this.jsonWriter.value(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(boolean z10) throws IOException {
        this.jsonWriter.value(z10);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(Boolean bool) throws IOException {
        this.jsonWriter.value(bool);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(double d10) throws IOException {
        this.jsonWriter.value(d10);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(long j10) throws IOException {
        this.jsonWriter.value(j10);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(Number number) throws IOException {
        this.jsonWriter.value(number);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(ILogger iLogger, Object obj) {
        this.jsonObjectSerializer.serialize(this, iLogger, obj);
        return this;
    }
}
