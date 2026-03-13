package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class AsExternalTypeSerializer extends TypeSerializerBase {
    protected final String _typePropertyName;

    public AsExternalTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this._typePropertyName = str;
    }

    public final void _writeArrayPrefix(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartArray();
    }

    public final void _writeArraySuffix(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeEndArray();
        if (str != null) {
            jsonGenerator.writeStringField(this._typePropertyName, str);
        }
    }

    public final void _writeObjectPrefix(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
    }

    public final void _writeObjectSuffix(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeEndObject();
        if (str != null) {
            jsonGenerator.writeStringField(this._typePropertyName, str);
        }
    }

    public final void _writeScalarSuffix(Object obj, JsonGenerator jsonGenerator, String str) {
        if (str != null) {
            jsonGenerator.writeStringField(this._typePropertyName, str);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String getPropertyName() {
        return this._typePropertyName;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public AsExternalTypeSerializer forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new AsExternalTypeSerializer(this._idResolver, beanProperty, this._typePropertyName);
    }

    public final void _writeScalarPrefix(Object obj, JsonGenerator jsonGenerator) {
    }
}
