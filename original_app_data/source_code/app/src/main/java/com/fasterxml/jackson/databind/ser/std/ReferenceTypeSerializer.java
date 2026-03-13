package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final TypeSerializer _valueTypeSerializer;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    private final JsonSerializer<Object> _findCachedSerializer(SerializerProvider serializerProvider, Class<?> cls) {
        JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicSerializers.serializerFor(cls);
        if (jsonSerializerSerializerFor != null) {
            return jsonSerializerSerializerFor;
        }
        JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = this._referredType.hasGenericTypes() ? serializerProvider.findPrimaryPropertySerializer(serializerProvider.constructSpecializedType(this._referredType, cls), this._property) : serializerProvider.findPrimaryPropertySerializer(cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            jsonSerializerFindPrimaryPropertySerializer = jsonSerializerFindPrimaryPropertySerializer.unwrappingSerializer(nameTransformer);
        }
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, jsonSerializerFindPrimaryPropertySerializer);
        return jsonSerializerFindPrimaryPropertySerializer;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanProperty beanProperty) {
        return serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
    }

    public abstract Object _getReferenced(T t10);

    public abstract Object _getReferencedIfPresent(T t10);

    public abstract boolean _isValuePresent(T t10);

    public boolean _useStatic(SerializerProvider serializerProvider, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing typingFindSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (typingFindSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (typingFindSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonSerializer<Object> jsonSerializer_findSerializer = this._valueSerializer;
        if (jsonSerializer_findSerializer == null) {
            jsonSerializer_findSerializer = _findSerializer(jsonFormatVisitorWrapper.getProvider(), this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                jsonSerializer_findSerializer = jsonSerializer_findSerializer.unwrappingSerializer(nameTransformer);
            }
        }
        jsonSerializer_findSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, this._referredType);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object defaultValue;
        TypeSerializer typeSerializerForProperty = this._valueTypeSerializer;
        if (typeSerializerForProperty != null) {
            typeSerializerForProperty = typeSerializerForProperty.forProperty(beanProperty);
        }
        JsonSerializer<?> jsonSerializerFindAnnotatedContentSerializer = findAnnotatedContentSerializer(serializerProvider, beanProperty);
        if (jsonSerializerFindAnnotatedContentSerializer == null) {
            jsonSerializerFindAnnotatedContentSerializer = this._valueSerializer;
            if (jsonSerializerFindAnnotatedContentSerializer != null) {
                jsonSerializerFindAnnotatedContentSerializer = serializerProvider.handlePrimaryContextualization(jsonSerializerFindAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(serializerProvider, beanProperty, this._referredType)) {
                jsonSerializerFindAnnotatedContentSerializer = _findSerializer(serializerProvider, this._referredType, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> referenceTypeSerializerWithResolved = (this._property == beanProperty && this._valueTypeSerializer == typeSerializerForProperty && this._valueSerializer == jsonSerializerFindAnnotatedContentSerializer) ? this : withResolved(beanProperty, typeSerializerForProperty, jsonSerializerFindAnnotatedContentSerializer, this._unwrapper);
        if (beanProperty != null && (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), handledType())) != null && (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) != JsonInclude.Include.USE_DEFAULTS) {
            int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            boolean zIncludeFilterSuppressNulls = true;
            if (i10 != 1) {
                defaultValue = null;
                if (i10 != 2) {
                    if (i10 == 3) {
                        defaultValue = MARKER_FOR_EMPTY;
                    } else if (i10 == 4) {
                        defaultValue = serializerProvider.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                        if (defaultValue != null) {
                            zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(defaultValue);
                        }
                    } else if (i10 != 5) {
                        zIncludeFilterSuppressNulls = false;
                    }
                } else if (this._referredType.isReferenceType()) {
                    defaultValue = MARKER_FOR_EMPTY;
                }
            } else {
                defaultValue = BeanUtil.getDefaultValue(this._referredType);
                if (defaultValue != null && defaultValue.getClass().isArray()) {
                    defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
                }
            }
            if (this._suppressableValue != defaultValue || this._suppressNulls != zIncludeFilterSuppressNulls) {
                return referenceTypeSerializerWithResolved.withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
            }
        }
        return referenceTypeSerializerWithResolved;
    }

    public JavaType getReferredType() {
        return this._referredType;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t10) {
        if (!_isValuePresent(t10)) {
            return true;
        }
        Object obj_getReferenced = _getReferenced(t10);
        if (obj_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer_findCachedSerializer = this._valueSerializer;
        if (jsonSerializer_findCachedSerializer == null) {
            try {
                jsonSerializer_findCachedSerializer = _findCachedSerializer(serializerProvider, obj_getReferenced.getClass());
            } catch (JsonMappingException e10) {
                throw new RuntimeJsonMappingException(e10);
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? jsonSerializer_findCachedSerializer.isEmpty(serializerProvider, obj_getReferenced) : obj.equals(obj_getReferenced);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t10);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        JsonSerializer<Object> jsonSerializer_findCachedSerializer = this._valueSerializer;
        if (jsonSerializer_findCachedSerializer == null) {
            jsonSerializer_findCachedSerializer = _findCachedSerializer(serializerProvider, obj_getReferencedIfPresent.getClass());
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            jsonSerializer_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        } else {
            jsonSerializer_findCachedSerializer.serialize(obj_getReferencedIfPresent, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t10);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            }
        } else {
            JsonSerializer<Object> jsonSerializer_findCachedSerializer = this._valueSerializer;
            if (jsonSerializer_findCachedSerializer == null) {
                jsonSerializer_findCachedSerializer = _findCachedSerializer(serializerProvider, obj_getReferencedIfPresent.getClass());
            }
            jsonSerializer_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        JsonSerializer<?> jsonSerializerUnwrappingSerializer = this._valueSerializer;
        if (jsonSerializerUnwrappingSerializer == null || (jsonSerializerUnwrappingSerializer = jsonSerializerUnwrappingSerializer.unwrappingSerializer(nameTransformer)) != this._valueSerializer) {
            NameTransformer nameTransformer2 = this._unwrapper;
            if (nameTransformer2 != null) {
                nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
            }
            if (this._valueSerializer != jsonSerializerUnwrappingSerializer || this._unwrapper != nameTransformer) {
                return withResolved(this._property, this._valueTypeSerializer, jsonSerializerUnwrappingSerializer, nameTransformer);
            }
        }
        return this;
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z10);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z10) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        this._property = beanProperty;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z10;
    }
}
