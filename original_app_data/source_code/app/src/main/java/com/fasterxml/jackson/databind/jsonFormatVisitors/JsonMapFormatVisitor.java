package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface JsonMapFormatVisitor extends JsonFormatVisitorWithSerializerProvider {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Base implements JsonMapFormatVisitor {
        protected SerializerProvider _provider;

        public Base() {
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider
        public SerializerProvider getProvider() {
            return this._provider;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider
        public void setProvider(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public Base(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor
        public void keyFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor
        public void valueFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }
    }

    void keyFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);

    void valueFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
