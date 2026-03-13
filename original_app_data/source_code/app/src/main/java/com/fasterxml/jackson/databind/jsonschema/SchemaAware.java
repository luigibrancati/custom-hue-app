package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface SchemaAware {
    JsonNode getSchema(SerializerProvider serializerProvider, Type type);

    JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z10);
}
