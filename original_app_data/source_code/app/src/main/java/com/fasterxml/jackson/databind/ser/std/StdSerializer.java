package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class StdSerializer<T> extends JsonSerializer<T> implements JsonFormatVisitable, SchemaAware, Serializable {
    private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
    private static final long serialVersionUID = 1;
    protected final Class<T> _handledType;

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final boolean _nonEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public ObjectNode createSchemaNode(String str) {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", str);
        return objectNode;
    }

    public JsonSerializer<?> findAnnotatedContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Object objFindContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return serializerProvider.serializerInstance(member, objFindContentSerializer);
    }

    public JsonSerializer<?> findContextualConvertingSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) {
        Object obj = KEY_CONTENT_CONVERTER_LOCK;
        Map identityHashMap = (Map) serializerProvider.getAttribute(obj);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            serializerProvider.setAttribute(obj, (Object) identityHashMap);
        } else if (identityHashMap.get(beanProperty) != null) {
            return jsonSerializer;
        }
        identityHashMap.put(beanProperty, Boolean.TRUE);
        try {
            JsonSerializer<?> jsonSerializerFindConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
            return jsonSerializerFindConvertingContentSerializer != null ? serializerProvider.handleSecondaryContextualization(jsonSerializerFindConvertingContentSerializer, beanProperty) : jsonSerializer;
        } finally {
            identityHashMap.remove(beanProperty);
        }
    }

    @Deprecated
    public JsonSerializer<?> findConvertingContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) {
        AnnotatedMember member;
        Object objFindSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (objFindSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
            return jsonSerializer;
        }
        Converter<Object, Object> converterConverterInstance = serializerProvider.converterInstance(beanProperty.getMember(), objFindSerializationContentConverter);
        JavaType outputType = converterConverterInstance.getOutputType(serializerProvider.getTypeFactory());
        if (jsonSerializer == null && !outputType.isJavaLangObject()) {
            jsonSerializer = serializerProvider.findValueSerializer(outputType);
        }
        return new StdDelegatingSerializer(converterConverterInstance, outputType, jsonSerializer);
    }

    public Boolean findFormatFeature(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(serializerProvider.getConfig(), cls) : serializerProvider.getDefaultPropertyFormat(cls);
    }

    public JsonInclude.Value findIncludeOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyInclusion(serializerProvider.getConfig(), cls) : serializerProvider.getDefaultPropertyInclusion(cls);
    }

    public PropertyFilter findPropertyFilter(SerializerProvider serializerProvider, Object obj, Object obj2) {
        FilterProvider filterProvider = serializerProvider.getFilterProvider();
        if (filterProvider == null) {
            serializerProvider.reportBadDefinition((Class<?>) handledType(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return filterProvider.findPropertyFilter(obj, obj2);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public Class<T> handledType() {
        return this._handledType;
    }

    public boolean isDefaultSerializer(JsonSerializer<?> jsonSerializer) {
        return ClassUtil.isJacksonStdImpl(jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public abstract void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonSerializer<?> jsonSerializer, JavaType javaType2) {
        JsonArrayFormatVisitor jsonArrayFormatVisitorExpectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (_neitherNull(jsonArrayFormatVisitorExpectArrayFormat, jsonSerializer)) {
            jsonArrayFormatVisitorExpectArrayFormat.itemsFormat(jsonSerializer, javaType2);
        }
    }

    public void visitFloatFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) {
        JsonNumberFormatVisitor jsonNumberFormatVisitorExpectNumberFormat = jsonFormatVisitorWrapper.expectNumberFormat(javaType);
        if (jsonNumberFormatVisitorExpectNumberFormat != null) {
            jsonNumberFormatVisitorExpectNumberFormat.numberType(numberType);
        }
    }

    public void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) {
        JsonIntegerFormatVisitor jsonIntegerFormatVisitorExpectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (_neitherNull(jsonIntegerFormatVisitorExpectIntegerFormat, numberType)) {
            jsonIntegerFormatVisitorExpectIntegerFormat.numberType(numberType);
        }
    }

    public void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectStringFormat(javaType);
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z10 = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z10 || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z10) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z10) {
        ObjectNode objectNode = (ObjectNode) getSchema(serializerProvider, type);
        if (!z10) {
            objectNode.put("required", !z10);
        }
        return objectNode;
    }

    public void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonValueFormat jsonValueFormat) {
        JsonStringFormatVisitor jsonStringFormatVisitorExpectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (jsonStringFormatVisitorExpectStringFormat != null) {
            jsonStringFormatVisitorExpectStringFormat.format(jsonValueFormat);
        }
    }

    public StdSerializer(JavaType javaType) {
        this._handledType = (Class<T>) javaType.getRawClass();
    }

    public ObjectNode createSchemaNode(String str, boolean z10) {
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode(str);
        if (!z10) {
            objectNodeCreateSchemaNode.put("required", !z10);
        }
        return objectNodeCreateSchemaNode;
    }

    public void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonFormatTypes jsonFormatTypes) {
        JsonArrayFormatVisitor jsonArrayFormatVisitorExpectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (jsonArrayFormatVisitorExpectArrayFormat != null) {
            jsonArrayFormatVisitorExpectArrayFormat.itemsFormat(jsonFormatTypes);
        }
    }

    public void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) {
        JsonIntegerFormatVisitor jsonIntegerFormatVisitorExpectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (jsonIntegerFormatVisitorExpectIntegerFormat != null) {
            if (numberType != null) {
                jsonIntegerFormatVisitorExpectIntegerFormat.numberType(numberType);
            }
            if (jsonValueFormat != null) {
                jsonIntegerFormatVisitorExpectIntegerFormat.format(jsonValueFormat);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z10) {
        this._handledType = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = (Class<T>) stdSerializer._handledType;
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, int i10) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z10 = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z10 || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z10) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, i10);
    }
}
