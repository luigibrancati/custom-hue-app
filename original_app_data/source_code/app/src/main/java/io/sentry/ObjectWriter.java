package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ObjectWriter {
    ObjectWriter beginArray();

    ObjectWriter beginObject();

    ObjectWriter endArray();

    ObjectWriter endObject();

    String getIndent();

    ObjectWriter jsonValue(String str);

    ObjectWriter name(String str);

    ObjectWriter nullValue();

    void setIndent(String str);

    void setLenient(boolean z10);

    ObjectWriter value(double d10);

    ObjectWriter value(long j10);

    ObjectWriter value(ILogger iLogger, Object obj);

    ObjectWriter value(Boolean bool);

    ObjectWriter value(Number number);

    ObjectWriter value(String str);

    ObjectWriter value(boolean z10);
}
