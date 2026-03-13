package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@JacksonStdImpl
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    protected JsonSerializer<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _sortKeys;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;
    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$1, reason: invalid class name */
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

    public MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z10, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z10;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, Object obj) {
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicValueSerializers.serializerFor(cls);
        return jsonSerializerSerializerFor != null ? jsonSerializerSerializerFor : this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer construct(java.util.Set<java.lang.String> r9, com.fasterxml.jackson.databind.JavaType r10, boolean r11, com.fasterxml.jackson.databind.jsontype.TypeSerializer r12, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r13, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r14, java.lang.Object r15) {
        /*
            if (r10 != 0) goto L7
            com.fasterxml.jackson.databind.JavaType r10 = com.fasterxml.jackson.databind.ser.std.MapSerializer.UNSPECIFIED_TYPE
            r3 = r10
            r4 = r3
            goto L1f
        L7:
            com.fasterxml.jackson.databind.JavaType r0 = r10.getKeyType()
            java.lang.Class<java.util.Properties> r1 = java.util.Properties.class
            boolean r1 = r10.hasRawClass(r1)
            if (r1 == 0) goto L1a
            com.fasterxml.jackson.databind.JavaType r10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType()
        L17:
            r4 = r10
            r3 = r0
            goto L1f
        L1a:
            com.fasterxml.jackson.databind.JavaType r10 = r10.getContentType()
            goto L17
        L1f:
            r10 = 0
            if (r11 != 0) goto L2e
            if (r4 == 0) goto L2b
            boolean r11 = r4.isFinal()
            if (r11 == 0) goto L2b
            r10 = 1
        L2b:
            r11 = r10
        L2c:
            r5 = r11
            goto L37
        L2e:
            java.lang.Class r0 = r4.getRawClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L2c
            r5 = r10
        L37:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r2 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r15 == 0) goto L47
            com.fasterxml.jackson.databind.ser.std.MapSerializer r9 = r1.withFilterId(r15)
            return r9
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.construct(java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    public void _ensureOverride(String str) {
        ClassUtil.verifyMustOverride(MapSerializer.class, this, str);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultFindAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return serializerAndMapResultFindAndAddSecondarySerializer.serializer;
    }

    public boolean _hasNullKey(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    public Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!_hasNullKey(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                _writeNullKeyedEntry(jsonGenerator, serializerProvider, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    public void _writeNullKeyedEntry(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializer_findSerializer;
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this._keyType, this._property);
        if (obj != null) {
            jsonSerializer_findSerializer = this._valueSerializer;
            if (jsonSerializer_findSerializer == null) {
                jsonSerializer_findSerializer = _findSerializer(serializerProvider, obj);
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == MARKER_FOR_EMPTY) {
                if (jsonSerializer_findSerializer.isEmpty(serializerProvider, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            jsonSerializer_findSerializer = serializerProvider.getDefaultNullValueSerializer();
        }
        try {
            jsonSerializerFindNullKeySerializer.serialize(null, jsonGenerator, serializerProvider);
            jsonSerializer_findSerializer.serialize(obj, jsonGenerator, serializerProvider);
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, e10, obj, "");
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonMapFormatVisitor jsonMapFormatVisitorExpectMapFormat = jsonFormatVisitorWrapper.expectMapFormat(javaType);
        if (jsonMapFormatVisitorExpectMapFormat != null) {
            jsonMapFormatVisitorExpectMapFormat.keyFormat(this._keySerializer, this._keyType);
            JsonSerializer<Object> jsonSerializer_findAndAddDynamic = this._valueSerializer;
            if (jsonSerializer_findAndAddDynamic == null) {
                jsonSerializer_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, this._valueType, jsonFormatVisitorWrapper.getProvider());
            }
            jsonMapFormatVisitorExpectMapFormat.valueFormat(jsonSerializer_findAndAddDynamic, this._valueType);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<?> jsonSerializerSerializerInstance;
        JsonSerializer<Object> jsonSerializerSerializerInstance2;
        boolean zBooleanValue;
        JsonInclude.Include contentInclusion;
        AnnotatedMember member;
        Object objFindFilterId;
        Boolean feature;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        Object defaultValue = null;
        AnnotatedMember member2 = beanProperty == null ? null : beanProperty.getMember();
        if (StdSerializer._neitherNull(member2, annotationIntrospector)) {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member2);
            jsonSerializerSerializerInstance = objFindKeySerializer != null ? serializerProvider.serializerInstance(member2, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member2);
            jsonSerializerSerializerInstance2 = objFindContentSerializer != null ? serializerProvider.serializerInstance(member2, objFindContentSerializer) : null;
        } else {
            jsonSerializerSerializerInstance = null;
            jsonSerializerSerializerInstance2 = null;
        }
        if (jsonSerializerSerializerInstance2 == null) {
            jsonSerializerSerializerInstance2 = this._valueSerializer;
        }
        JsonSerializer<?> jsonSerializerFindContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializerSerializerInstance2);
        if (jsonSerializerFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            jsonSerializerFindContextualConvertingSerializer = serializerProvider.findContentValueSerializer(this._valueType, beanProperty);
        }
        JsonSerializer<?> jsonSerializer = jsonSerializerFindContextualConvertingSerializer;
        if (jsonSerializerSerializerInstance == null) {
            jsonSerializerSerializerInstance = this._keySerializer;
        }
        JsonSerializer<?> jsonSerializerFindKeySerializer = jsonSerializerSerializerInstance == null ? serializerProvider.findKeySerializer(this._keyType, beanProperty) : serializerProvider.handleSecondaryContextualization(jsonSerializerSerializerInstance, beanProperty);
        Set<String> hashSet = this._ignoredEntries;
        boolean zIncludeFilterSuppressNulls = false;
        if (StdSerializer._neitherNull(member2, annotationIntrospector)) {
            JsonIgnoreProperties.Value valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member2);
            if (valueFindPropertyIgnorals != null) {
                Set<String> setFindIgnoredForSerialization = valueFindPropertyIgnorals.findIgnoredForSerialization();
                if (StdSerializer._nonEmpty(setFindIgnoredForSerialization)) {
                    hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                    Iterator<String> it = setFindIgnoredForSerialization.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next());
                    }
                }
            }
            zBooleanValue = Boolean.TRUE.equals(annotationIntrospector.findSerializationSortAlphabetically(member2));
        } else {
            zBooleanValue = false;
        }
        Set<String> set = hashSet;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Map.class);
        if (valueFindFormatOverrides != null && (feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) != null) {
            zBooleanValue = feature.booleanValue();
        }
        MapSerializer mapSerializerWithResolved = withResolved(beanProperty, jsonSerializerFindKeySerializer, jsonSerializer, set, zBooleanValue);
        if (beanProperty != null && (member = beanProperty.getMember()) != null && (objFindFilterId = annotationIntrospector.findFilterId(member)) != null) {
            mapSerializerWithResolved = mapSerializerWithResolved.withFilterId(objFindFilterId);
        }
        JsonInclude.Value valueFindIncludeOverrides = findIncludeOverrides(serializerProvider, beanProperty, Map.class);
        if (valueFindIncludeOverrides == null || (contentInclusion = valueFindIncludeOverrides.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return mapSerializerWithResolved;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        if (i10 == 1) {
            defaultValue = BeanUtil.getDefaultValue(this._valueType);
            if (defaultValue != null && defaultValue.getClass().isArray()) {
                defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    defaultValue = serializerProvider.includeFilterInstance(null, valueFindIncludeOverrides.getContentFilter());
                    if (defaultValue != null) {
                        zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(defaultValue);
                    }
                } else if (i10 == 5) {
                }
                return mapSerializerWithResolved.withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
            }
            defaultValue = MARKER_FOR_EMPTY;
        } else if (this._valueType.isReferenceType()) {
            defaultValue = MARKER_FOR_EMPTY;
        }
        zIncludeFilterSuppressNulls = true;
        return mapSerializerWithResolved.withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JsonSerializer<?> getContentSerializer() {
        return this._valueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    public JsonSerializer<?> getKeySerializer() {
        return this._keySerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("object", true);
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, serializerProvider, null);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        try {
            Object key = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    key = entry.getKey();
                    if (key == null) {
                        serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
                    } else if (set == null || !set.contains(key)) {
                        jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
                    }
                    if (value == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        JsonSerializer<Object> jsonSerializer_findSerializer = this._valueSerializer;
                        if (jsonSerializer_findSerializer == null) {
                            jsonSerializer_findSerializer = _findSerializer(serializerProvider, value);
                        }
                        jsonSerializer_findSerializer.serialize(value, jsonGenerator, serializerProvider);
                    }
                } catch (Exception e10) {
                    e = e10;
                    obj = key;
                    wrapAndThrow(serializerProvider, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        JsonSerializer<Object> jsonSerializer2 = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer2.serialize(key, jsonGenerator, serializerProvider);
                }
                Object value = entry.getValue();
                if (value == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    try {
                        jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                    } catch (Exception e10) {
                        wrapAndThrow(serializerProvider, e10, map, String.valueOf(key));
                    }
                } else {
                    jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    public void serializeFilteredAnyProperties(SerializerProvider serializerProvider, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, PropertyFilter propertyFilter, Object obj2) throws IOException {
        JsonSerializer<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z10 = MARKER_FOR_EMPTY == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                JsonSerializer<Object> jsonSerializerFindNullKeySerializer = key == null ? serializerProvider.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(serializerProvider, value);
                    }
                    if (z10) {
                        if (!defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                            mapProperty.reset(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                            propertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, mapProperty);
                        }
                    } else if (obj2 == null || !obj2.equals(value)) {
                        mapProperty.reset(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                        propertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        propertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, mapProperty);
                    } catch (Exception e10) {
                        wrapAndThrow(serializerProvider, e10, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyFilter propertyFilter, Object obj) throws IOException {
        JsonSerializer<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z10 = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                JsonSerializer<Object> jsonSerializerFindNullKeySerializer = key == null ? serializerProvider.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(serializerProvider, value);
                    }
                    if (z10) {
                        if (!defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                            mapProperty.reset(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                            propertyFilter.serializeAsField(map, jsonGenerator, serializerProvider, mapProperty);
                        }
                    } else if (obj == null || !obj.equals(value)) {
                        mapProperty.reset(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                        propertyFilter.serializeAsField(map, jsonGenerator, serializerProvider, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, jsonSerializerFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        propertyFilter.serializeAsField(map, jsonGenerator, serializerProvider, mapProperty);
                    } catch (Exception e10) {
                        wrapAndThrow(serializerProvider, e10, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0069 A[EXC_TOP_SPLITTER, PHI: r6
      0x0069: PHI (r6v3 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) = 
      (r6v2 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
      (r6v5 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
      (r6v5 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
      (r6v5 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
     binds: [B:26:0x004a, B:32:0x005d, B:34:0x0060, B:36:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void serializeOptionalFields(java.util.Map<?, ?> r9, com.fasterxml.jackson.core.JsonGenerator r10, com.fasterxml.jackson.databind.SerializerProvider r11, java.lang.Object r12) throws java.io.IOException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r8._valueTypeSerializer
            if (r0 == 0) goto L8
            r8.serializeTypedFields(r9, r10, r11, r12)
            return
        L8:
            java.util.Set<java.lang.String> r0 = r8._ignoredEntries
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.MARKER_FOR_EMPTY
            if (r1 != r12) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            if (r4 != 0) goto L34
            com.fasterxml.jackson.databind.JavaType r5 = r8._keyType
            com.fasterxml.jackson.databind.BeanProperty r6 = r8._property
            com.fasterxml.jackson.databind.JsonSerializer r5 = r11.findNullKeySerializer(r5, r6)
            goto L3f
        L34:
            if (r0 == 0) goto L3d
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L3d
            goto L19
        L3d:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r5 = r8._keySerializer
        L3f:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L4f
            boolean r6 = r8._suppressNulls
            if (r6 == 0) goto L4a
            goto L19
        L4a:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r11.getDefaultNullValueSerializer()
            goto L69
        L4f:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r6 = r8._valueSerializer
            if (r6 != 0) goto L57
            com.fasterxml.jackson.databind.JsonSerializer r6 = r8._findSerializer(r11, r3)
        L57:
            if (r1 == 0) goto L60
            boolean r7 = r6.isEmpty(r11, r3)
            if (r7 == 0) goto L69
            goto L19
        L60:
            if (r12 == 0) goto L69
            boolean r7 = r12.equals(r3)
            if (r7 == 0) goto L69
            goto L19
        L69:
            r5.serialize(r4, r10, r11)     // Catch: java.lang.Exception -> L70
            r6.serialize(r3, r10, r11)     // Catch: java.lang.Exception -> L70
            goto L19
        L70:
            r3 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r8.wrapAndThrow(r11, r3, r9, r4)
            goto L19
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeOptionalFields(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object):void");
    }

    public void serializeTypedFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer;
        JsonSerializer<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        boolean z10 = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this._keyType, this._property);
            } else if (set == null || !set.contains(key)) {
                jsonSerializerFindNullKeySerializer = this._keySerializer;
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this._valueSerializer;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = _findSerializer(serializerProvider, value);
                }
                if (z10) {
                    if (!defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                        jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                        defaultNullValueSerializer.serializeWithType(value, jsonGenerator, serializerProvider, this._valueTypeSerializer);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, serializerProvider, this._valueTypeSerializer);
                }
            } else if (!this._suppressNulls) {
                defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
                try {
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, serializerProvider, this._valueTypeSerializer);
                } catch (Exception e10) {
                    wrapAndThrow(serializerProvider, e10, map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeWithoutTypeInfo(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        PropertyFilter propertyFilterFindPropertyFilter;
        if (map.isEmpty()) {
            return;
        }
        if (this._sortKeys || serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
            map = _orderEntries(map, jsonGenerator, serializerProvider);
        }
        Map<?, ?> map2 = map;
        Object obj = this._filterId;
        if (obj != null && (propertyFilterFindPropertyFilter = findPropertyFilter(serializerProvider, obj, map2)) != null) {
            serializeFilteredFields(map2, jsonGenerator, serializerProvider, propertyFilterFindPropertyFilter, this._suppressableValue);
            return;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null || this._suppressNulls) {
            serializeOptionalFields(map2, jsonGenerator, serializerProvider, obj2);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            serializeFieldsUsing(map2, jsonGenerator, serializerProvider, jsonSerializer);
        } else {
            serializeFields(map2, jsonGenerator, serializerProvider);
        }
    }

    public MapSerializer withContentInclusion(Object obj, boolean z10) {
        if (obj == this._suppressableValue && z10 == this._suppressNulls) {
            return this;
        }
        _ensureOverride("withContentInclusion");
        return new MapSerializer(this, this._valueTypeSerializer, obj, z10);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, boolean z10) {
        _ensureOverride("withResolved");
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, jsonSerializer, jsonSerializer2, set);
        return z10 != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z10) : mapSerializer;
    }

    @Deprecated
    public void _ensureOverride() {
        _ensureOverride("N/A");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public MapSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        if (this._valueTypeSerializer == typeSerializer) {
            return this;
        }
        _ensureOverride("_withValueTypeSerializer");
        return new MapSerializer(this, typeSerializer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Map<?, ?> map) {
        JsonSerializer<Object> jsonSerializer_findSerializer;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null && !this._suppressNulls) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        boolean z10 = MARKER_FOR_EMPTY == obj;
        if (jsonSerializer != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this._suppressNulls) {
                        return false;
                    }
                } else if (z10) {
                    if (!jsonSerializer.isEmpty(serializerProvider, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    jsonSerializer_findSerializer = _findSerializer(serializerProvider, obj3);
                } catch (JsonMappingException unused) {
                }
                if (z10) {
                    if (!jsonSerializer_findSerializer.isEmpty(serializerProvider, obj3)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject(map);
        serializeWithoutTypeInfo(map, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.setCurrentValue(map);
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(map, JsonToken.START_OBJECT));
        serializeWithoutTypeInfo(map, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride("withFilterId");
        return new MapSerializer(this, obj, this._sortKeys);
    }

    @Deprecated
    public MapSerializer withContentInclusion(Object obj) {
        return new MapSerializer(this, this._valueTypeSerializer, obj, this._suppressNulls);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultFindAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return serializerAndMapResultFindAndAddSecondarySerializer.serializer;
    }

    @Deprecated
    public static MapSerializer construct(String[] strArr, JavaType javaType, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2, Object obj) {
        return construct(ArrayBuilders.arrayToSet(strArr), javaType, z10, typeSerializer, jsonSerializer, jsonSerializer2, obj);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
    }

    public MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer, Object obj, boolean z10) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z10;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z10) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z10;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer, Object obj) {
        this(mapSerializer, typeSerializer, obj, false);
    }
}
