package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface JsonFormatVisitorWrapper extends JsonFormatVisitorWithSerializerProvider {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Base implements JsonFormatVisitorWrapper {
        protected SerializerProvider _provider;

        public Base() {
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonAnyFormatVisitor expectAnyFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonArrayFormatVisitor expectArrayFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonMapFormatVisitor expectMapFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonNullFormatVisitor expectNullFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonNumberFormatVisitor expectNumberFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonObjectFormatVisitor expectObjectFormat(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonStringFormatVisitor expectStringFormat(JavaType javaType) {
            return null;
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
    }

    JsonAnyFormatVisitor expectAnyFormat(JavaType javaType);

    JsonArrayFormatVisitor expectArrayFormat(JavaType javaType);

    JsonBooleanFormatVisitor expectBooleanFormat(JavaType javaType);

    JsonIntegerFormatVisitor expectIntegerFormat(JavaType javaType);

    JsonMapFormatVisitor expectMapFormat(JavaType javaType);

    JsonNullFormatVisitor expectNullFormat(JavaType javaType);

    JsonNumberFormatVisitor expectNumberFormat(JavaType javaType);

    JsonObjectFormatVisitor expectObjectFormat(JavaType javaType);

    JsonStringFormatVisitor expectStringFormat(JavaType javaType);
}
