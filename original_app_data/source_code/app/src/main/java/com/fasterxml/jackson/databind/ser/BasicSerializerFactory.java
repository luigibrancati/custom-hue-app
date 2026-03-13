package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    protected static final HashMap<String, JsonSerializer<?>> _concrete;
    protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape;
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
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> map = new HashMap<>();
        HashMap<String, JsonSerializer<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        map2.put(StringBuffer.class.getName(), toStringSerializer);
        map2.put(StringBuilder.class.getName(), toStringSerializer);
        map2.put(Character.class.getName(), toStringSerializer);
        map2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.addAll(map2);
        map2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        map2.put(Boolean.class.getName(), new BooleanSerializer(false));
        map2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        map2.put(Calendar.class.getName(), CalendarSerializer.instance);
        map2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.all()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                map2.put(entry.getKey().getName(), (JsonSerializer) value);
            } else {
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
        _concrete = map2;
        _concreteLazy = map;
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    public MapSerializer _checkMapContentInclusion(SerializerProvider serializerProvider, BeanDescription beanDescription, MapSerializer mapSerializer) {
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        Object defaultValue = null;
        boolean zIncludeFilterSuppressNulls = true;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.withContentInclusion(null, true) : mapSerializer;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        if (i10 == 1) {
            defaultValue = BeanUtil.getDefaultValue(contentType);
            if (defaultValue != null && defaultValue.getClass().isArray()) {
                defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                defaultValue = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i10 == 4 && (defaultValue = serializerProvider.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(defaultValue);
            }
        } else if (contentType.isReferenceType()) {
            defaultValue = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapSerializer.withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
    }

    public JsonSerializer<Object> _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) {
        Object objFindContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (objFindContentSerializer != null) {
            return serializerProvider.serializerInstance(annotated, objFindContentSerializer);
        }
        return null;
    }

    public JsonInclude.Value _findInclusionWithContent(SerializerProvider serializerProvider, BeanDescription beanDescription, JavaType javaType, Class<?> cls) {
        SerializationConfig config = serializerProvider.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, beanDescription.findPropertyInclusion(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 != null) {
            int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[defaultPropertyInclusion2.getValueInclusion().ordinal()];
            if (i10 == 4) {
                return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
            }
            if (i10 != 6) {
                return defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
            }
        }
        return defaultPropertyInclusion;
    }

    public JsonSerializer<Object> _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) {
        Object objFindKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (objFindKeySerializer != null) {
            return serializerProvider.serializerInstance(annotated, objFindKeySerializer);
        }
        return null;
    }

    public JsonSerializer<?> buildArraySerializer(SerializerProvider serializerProvider, ArrayType arrayType, BeanDescription beanDescription, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        ArrayType arrayType2;
        BeanDescription beanDescription2;
        TypeSerializer typeSerializer2;
        JsonSerializer<Object> jsonSerializer2;
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializerModifyArraySerializer = null;
        while (true) {
            if (!it.hasNext()) {
                arrayType2 = arrayType;
                beanDescription2 = beanDescription;
                typeSerializer2 = typeSerializer;
                jsonSerializer2 = jsonSerializer;
                break;
            }
            arrayType2 = arrayType;
            beanDescription2 = beanDescription;
            typeSerializer2 = typeSerializer;
            jsonSerializer2 = jsonSerializer;
            jsonSerializerModifyArraySerializer = it.next().findArraySerializer(config, arrayType2, beanDescription2, typeSerializer2, jsonSerializer2);
            if (jsonSerializerModifyArraySerializer != null) {
                break;
            }
            arrayType = arrayType2;
            beanDescription = beanDescription2;
            typeSerializer = typeSerializer2;
            jsonSerializer = jsonSerializer2;
        }
        if (jsonSerializerModifyArraySerializer == null) {
            Class<?> rawClass = arrayType2.getRawClass();
            if (jsonSerializer2 == null || ClassUtil.isJacksonStdImpl(jsonSerializer2)) {
                jsonSerializerModifyArraySerializer = String[].class == rawClass ? StringArraySerializer.instance : StdArraySerializers.findStandardImpl(rawClass);
            }
            if (jsonSerializerModifyArraySerializer == null) {
                jsonSerializerModifyArraySerializer = new ObjectArraySerializer(arrayType2.getContentType(), z10, typeSerializer2, jsonSerializer2);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializerModifyArraySerializer = it2.next().modifyArraySerializer(config, arrayType2, beanDescription2, jsonSerializerModifyArraySerializer);
            }
        }
        return jsonSerializerModifyArraySerializer;
    }

    public JsonSerializer<?> buildAtomicReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        boolean zIncludeFilterSuppressNulls;
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, referencedType, AtomicReference.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        Object defaultValue = null;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            zIncludeFilterSuppressNulls = false;
        } else {
            int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            zIncludeFilterSuppressNulls = true;
            if (i10 == 1) {
                defaultValue = BeanUtil.getDefaultValue(referencedType);
                if (defaultValue != null && defaultValue.getClass().isArray()) {
                    defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    defaultValue = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i10 == 4 && (defaultValue = serializerProvider.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                    zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(defaultValue);
                }
            } else if (referencedType.isReferenceType()) {
                defaultValue = MapSerializer.MARKER_FOR_EMPTY;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z10, typeSerializer, jsonSerializer).withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> buildCollectionSerializer(com.fasterxml.jackson.databind.SerializerProvider r9, com.fasterxml.jackson.databind.type.CollectionType r10, com.fasterxml.jackson.databind.BeanDescription r11, boolean r12, com.fasterxml.jackson.databind.jsontype.TypeSerializer r13, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r14) {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.SerializationConfig r1 = r9.getConfig()
            java.lang.Iterable r0 = r8.customSerializers()
            java.util.Iterator r6 = r0.iterator()
            r7 = 0
            r0 = r7
        Le:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r0 = r6.next()
            com.fasterxml.jackson.databind.ser.Serializers r0 = (com.fasterxml.jackson.databind.ser.Serializers) r0
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.findCollectionSerializer(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L25
            goto L2e
        L25:
            r10 = r2
            r11 = r3
            r13 = r4
            r14 = r5
            goto Le
        L2a:
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
        L2e:
            if (r0 != 0) goto L9c
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.findSerializerByAnnotations(r9, r2, r3)
            if (r0 != 0) goto L9c
            com.fasterxml.jackson.annotation.JsonFormat$Value r9 = r3.findExpectedFormat(r7)
            if (r9 == 0) goto L45
            com.fasterxml.jackson.annotation.JsonFormat$Shape r9 = r9.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r10 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r9 != r10) goto L45
            return r7
        L45:
            java.lang.Class r9 = r2.getRawClass()
            java.lang.Class<java.util.EnumSet> r10 = java.util.EnumSet.class
            boolean r10 = r10.isAssignableFrom(r9)
            if (r10 == 0) goto L62
            com.fasterxml.jackson.databind.JavaType r9 = r2.getContentType()
            boolean r10 = r9.isEnumImplType()
            if (r10 != 0) goto L5c
            goto L5d
        L5c:
            r7 = r9
        L5d:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.buildEnumSetSerializer(r7)
            goto L9c
        L62:
            com.fasterxml.jackson.databind.JavaType r10 = r2.getContentType()
            java.lang.Class r10 = r10.getRawClass()
            boolean r9 = r8.isIndexedList(r9)
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            if (r9 == 0) goto L87
            if (r10 != r11) goto L7e
            boolean r9 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl(r5)
            if (r9 == 0) goto L92
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r9 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance
        L7c:
            r0 = r9
            goto L92
        L7e:
            com.fasterxml.jackson.databind.JavaType r9 = r2.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r9 = r8.buildIndexedListSerializer(r9, r12, r4, r5)
            goto L7c
        L87:
            if (r10 != r11) goto L92
            boolean r9 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl(r5)
            if (r9 == 0) goto L92
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r9 = com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.instance
            goto L7c
        L92:
            if (r0 != 0) goto L9c
            com.fasterxml.jackson.databind.JavaType r9 = r2.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r0 = r8.buildCollectionSerializer(r9, r12, r4, r5)
        L9c:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r9 = r8._factoryConfig
            boolean r9 = r9.hasSerializerModifiers()
            if (r9 == 0) goto Lbf
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r8 = r8._factoryConfig
            java.lang.Iterable r8 = r8.serializerModifiers()
            java.util.Iterator r8 = r8.iterator()
        Lae:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lbf
            java.lang.Object r9 = r8.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r9 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r9
            com.fasterxml.jackson.databind.JsonSerializer r0 = r9.modifyCollectionSerializer(r1, r2, r3, r0)
            goto Lae
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public JsonSerializer<?> buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z10) {
        SerializationConfig config = serializerProvider.getConfig();
        if (!z10 && javaType.useStaticType() && (!javaType.isContainerType() || !javaType.getContentType().isJavaLangObject())) {
            z10 = true;
        }
        TypeSerializer typeSerializerCreateTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        if (typeSerializerCreateTypeSerializer != null) {
            z10 = false;
        }
        boolean z11 = z10;
        JsonSerializer<Object> jsonSerializer_findContentSerializer = _findContentSerializer(serializerProvider, beanDescription.getClassInfo());
        JsonSerializer<?> jsonSerializerModifyCollectionLikeSerializer = null;
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            JsonSerializer<Object> jsonSerializer_findKeySerializer = _findKeySerializer(serializerProvider, beanDescription.getClassInfo());
            if (mapLikeType.isTrueMapType()) {
                return buildMapSerializer(serializerProvider, (MapType) mapLikeType, beanDescription, z11, jsonSerializer_findKeySerializer, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            }
            BeanDescription beanDescription2 = beanDescription;
            Iterator<Serializers> it = customSerializers().iterator();
            while (it.hasNext()) {
                BeanDescription beanDescription3 = beanDescription2;
                jsonSerializerModifyCollectionLikeSerializer = it.next().findMapLikeSerializer(config, mapLikeType, beanDescription3, jsonSerializer_findKeySerializer, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
                beanDescription2 = beanDescription3;
                if (jsonSerializerModifyCollectionLikeSerializer != null) {
                    break;
                }
            }
            if (jsonSerializerModifyCollectionLikeSerializer == null) {
                jsonSerializerModifyCollectionLikeSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription2);
            }
            if (jsonSerializerModifyCollectionLikeSerializer != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
                while (it2.hasNext()) {
                    jsonSerializerModifyCollectionLikeSerializer = it2.next().modifyMapLikeSerializer(config, mapLikeType, beanDescription2, jsonSerializerModifyCollectionLikeSerializer);
                }
            }
            return jsonSerializerModifyCollectionLikeSerializer;
        }
        BeanDescription beanDescription4 = beanDescription;
        if (!javaType.isCollectionLikeType()) {
            if (javaType.isArrayType()) {
                return buildArraySerializer(serializerProvider, (ArrayType) javaType, beanDescription4, z11, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            }
            return null;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
        if (collectionLikeType.isTrueCollectionType()) {
            return buildCollectionSerializer(serializerProvider, (CollectionType) collectionLikeType, beanDescription4, z11, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
        }
        Iterator<Serializers> it3 = customSerializers().iterator();
        while (it3.hasNext()) {
            BeanDescription beanDescription5 = beanDescription4;
            jsonSerializerModifyCollectionLikeSerializer = it3.next().findCollectionLikeSerializer(config, collectionLikeType, beanDescription5, typeSerializerCreateTypeSerializer, jsonSerializer_findContentSerializer);
            beanDescription4 = beanDescription5;
            if (jsonSerializerModifyCollectionLikeSerializer != null) {
                break;
            }
        }
        if (jsonSerializerModifyCollectionLikeSerializer == null) {
            jsonSerializerModifyCollectionLikeSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription4);
        }
        if (jsonSerializerModifyCollectionLikeSerializer != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it4 = this._factoryConfig.serializerModifiers().iterator();
            while (it4.hasNext()) {
                jsonSerializerModifyCollectionLikeSerializer = it4.next().modifyCollectionLikeSerializer(config, collectionLikeType, beanDescription4, jsonSerializerModifyCollectionLikeSerializer);
            }
        }
        return jsonSerializerModifyCollectionLikeSerializer;
    }

    public JsonSerializer<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        JsonFormat.Value valueFindExpectedFormat = beanDescription.findExpectedFormat(null);
        if (valueFindExpectedFormat != null && valueFindExpectedFormat.getShape() == JsonFormat.Shape.OBJECT) {
            ((BasicBeanDescription) beanDescription).removeProperty("declaringClass");
            return null;
        }
        JsonSerializer<?> jsonSerializerConstruct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, beanDescription, valueFindExpectedFormat);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                jsonSerializerConstruct = it.next().modifyEnumSerializer(serializationConfig, javaType, beanDescription, jsonSerializerConstruct);
            }
        }
        return jsonSerializerConstruct;
    }

    public JsonSerializer<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new IndexedListSerializer(javaType, z10, typeSerializer, jsonSerializer);
    }

    public JsonSerializer<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z10, JavaType javaType2) {
        return new IterableSerializer(javaType2, z10, createTypeSerializer(serializationConfig, javaType2));
    }

    public JsonSerializer<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z10, JavaType javaType2) {
        return new IteratorSerializer(javaType2, z10, createTypeSerializer(serializationConfig, javaType2));
    }

    public JsonSerializer<?> buildMapEntrySerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z10, JavaType javaType2, JavaType javaType3) {
        Object defaultValue = null;
        if (JsonFormat.Value.merge(beanDescription.findExpectedFormat(null), serializerProvider.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z10, createTypeSerializer(serializerProvider.getConfig(), javaType3), null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.Entry.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i10 == 1) {
            defaultValue = BeanUtil.getDefaultValue(contentType);
            if (defaultValue != null && defaultValue.getClass().isArray()) {
                defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                defaultValue = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i10 == 4 && (defaultValue = serializerProvider.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(defaultValue);
            }
        } else if (contentType.isReferenceType()) {
            defaultValue = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
    }

    public JsonSerializer<?> buildMapSerializer(SerializerProvider serializerProvider, MapType mapType, BeanDescription beanDescription, boolean z10, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) {
        JsonFormat.Value valueFindExpectedFormat = beanDescription.findExpectedFormat(null);
        if (valueFindExpectedFormat != null && valueFindExpectedFormat.getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializerModifyMapSerializer = null;
        while (it.hasNext() && (jsonSerializerModifyMapSerializer = it.next().findMapSerializer(config, mapType, beanDescription, jsonSerializer, typeSerializer, jsonSerializer2)) == null) {
        }
        if (jsonSerializerModifyMapSerializer == null && (jsonSerializerModifyMapSerializer = findSerializerByAnnotations(serializerProvider, mapType, beanDescription)) == null) {
            Object objFindFilterId = findFilterId(config, beanDescription);
            JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription.getClassInfo());
            jsonSerializerModifyMapSerializer = _checkMapContentInclusion(serializerProvider, beanDescription, MapSerializer.construct(defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForSerialization() : null, mapType, z10, typeSerializer, jsonSerializer, jsonSerializer2, objFindFilterId));
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializerModifyMapSerializer = it2.next().modifyMapSerializer(config, mapType, beanDescription, jsonSerializerModifyMapSerializer);
            }
        }
        return jsonSerializerModifyMapSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createKeySerializer(SerializerProvider serializerProvider, JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription beanDescriptionIntrospect = config.introspect(javaType);
        JsonSerializer<?> jsonSerializerFindSerializer = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<Serializers> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext() && (jsonSerializerFindSerializer = it.next().findSerializer(config, javaType, beanDescriptionIntrospect)) == null) {
            }
        }
        if (jsonSerializerFindSerializer == null) {
            JsonSerializer<Object> jsonSerializer_findKeySerializer = _findKeySerializer(serializerProvider, beanDescriptionIntrospect.getClassInfo());
            if (jsonSerializer_findKeySerializer != null) {
                jsonSerializer = jsonSerializer_findKeySerializer;
            } else if (jsonSerializer == null && (jsonSerializer = StdKeySerializers.getStdKeySerializer(config, javaType.getRawClass(), false)) == null) {
                AnnotatedMember annotatedMemberFindJsonValueAccessor = beanDescriptionIntrospect.findJsonValueAccessor();
                if (annotatedMemberFindJsonValueAccessor != null) {
                    JsonSerializer<Object> stdKeySerializer = StdKeySerializers.getStdKeySerializer(config, annotatedMemberFindJsonValueAccessor.getRawType(), true);
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(annotatedMemberFindJsonValueAccessor.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    jsonSerializer = new JsonValueSerializer(annotatedMemberFindJsonValueAccessor, stdKeySerializer);
                } else {
                    jsonSerializer = StdKeySerializers.getFallbackKeySerializer(config, javaType.getRawClass());
                }
            }
        } else {
            jsonSerializer = jsonSerializerFindSerializer;
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer = it2.next().modifyKeySerializer(config, javaType, beanDescriptionIntrospect, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public abstract JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType);

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collectionCollectAndResolveSubtypesByClass;
        AnnotatedClass classInfo = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByClass = null;
        } else {
            collectionCollectAndResolveSubtypesByClass = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, classInfo);
        }
        if (typeResolverBuilderFindTypeResolver == null) {
            return null;
        }
        return typeResolverBuilderFindTypeResolver.buildTypeSerializer(serializationConfig, javaType, collectionCollectAndResolveSubtypesByClass);
    }

    public abstract Iterable<Serializers> customSerializers();

    public Converter<Object, Object> findConverter(SerializerProvider serializerProvider, Annotated annotated) {
        Object objFindSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (objFindSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, objFindSerializationConverter);
    }

    public JsonSerializer<?> findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer<?> jsonSerializer) {
        Converter<Object, Object> converterFindConverter = findConverter(serializerProvider, annotated);
        return converterFindConverter == null ? jsonSerializer : new StdDelegatingSerializer(converterFindConverter, converterFindConverter.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    public Object findFilterId(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    public JsonSerializer<?> findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z10) {
        return OptionalHandlerFactory.instance.findSerializer(serializerProvider.getConfig(), javaType, beanDescription);
    }

    public JsonSerializer<?> findReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z10) {
        JavaType contentType = referenceType.getContentType();
        TypeSerializer typeSerializerCreateTypeSerializer = (TypeSerializer) contentType.getTypeHandler();
        SerializationConfig config = serializerProvider.getConfig();
        if (typeSerializerCreateTypeSerializer == null) {
            typeSerializerCreateTypeSerializer = createTypeSerializer(config, contentType);
        }
        TypeSerializer typeSerializer = typeSerializerCreateTypeSerializer;
        JsonSerializer<Object> jsonSerializer = (JsonSerializer) contentType.getValueHandler();
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            ReferenceType referenceType2 = referenceType;
            BeanDescription beanDescription2 = beanDescription;
            JsonSerializer<?> jsonSerializerFindReferenceSerializer = it.next().findReferenceSerializer(config, referenceType2, beanDescription2, typeSerializer, jsonSerializer);
            if (jsonSerializerFindReferenceSerializer != null) {
                return jsonSerializerFindReferenceSerializer;
            }
            referenceType = referenceType2;
            beanDescription = beanDescription2;
        }
        ReferenceType referenceType3 = referenceType;
        BeanDescription beanDescription3 = beanDescription;
        if (referenceType3.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(serializerProvider, referenceType3, beanDescription3, z10, typeSerializer, jsonSerializer);
        }
        return null;
    }

    public final JsonSerializer<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z10) {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, beanDescription, z10, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, beanDescription, z10, (javaTypeArrFindTypeParameters2 == null || javaTypeArrFindTypeParameters2.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters2[0]);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        return null;
    }

    public final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember annotatedMemberFindJsonValueAccessor = beanDescription.findJsonValueAccessor();
        if (annotatedMemberFindJsonValueAccessor == null) {
            return null;
        }
        if (serializerProvider.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMemberFindJsonValueAccessor.getMember(), serializerProvider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new JsonValueSerializer(annotatedMemberFindJsonValueAccessor, findSerializerFromAnnotation(serializerProvider, annotatedMemberFindJsonValueAccessor));
    }

    public final JsonSerializer<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, BeanDescription beanDescription, boolean z10) {
        Class<? extends JsonSerializer<?>> cls;
        String name = javaType.getRawClass().getName();
        JsonSerializer<?> jsonSerializer = _concrete.get(name);
        return (jsonSerializer != null || (cls = _concreteLazy.get(name)) == null) ? jsonSerializer : (JsonSerializer) ClassUtil.createInstance(cls, false);
    }

    public final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z10) {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
        }
        Class<?> rawClass = javaType.getRawClass();
        JsonSerializer<?> jsonSerializerFindOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z10);
        if (jsonSerializerFindOptionalStdSerializer != null) {
            return jsonSerializerFindOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType javaTypeFindSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(serializerProvider, javaType, beanDescription, z10, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new InetAddressSerializer();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new InetSocketAddressSerializer();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new TimeZoneSerializer();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (!Number.class.isAssignableFrom(rawClass)) {
            return null;
        }
        JsonFormat.Value valueFindExpectedFormat = beanDescription.findExpectedFormat(null);
        if (valueFindExpectedFormat != null) {
            int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[valueFindExpectedFormat.getShape().ordinal()];
            if (i10 == 1) {
                return ToStringSerializer.instance;
            }
            if (i10 == 2 || i10 == 3) {
                return null;
            }
        }
        return NumberSerializer.instance;
    }

    public JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) {
        Object objFindSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (objFindSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, objFindSerializer));
    }

    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription, TypeSerializer typeSerializer) {
        if (typeSerializer != null) {
            return false;
        }
        JsonSerialize.Typing typingFindSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
        return (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) ? serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING) : typingFindSerializationTyping == JsonSerialize.Typing.STATIC;
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final SerializerFactory withAdditionalKeySerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(serializers));
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final SerializerFactory withAdditionalSerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(serializers));
    }

    public abstract SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig);

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        return withConfig(this._factoryConfig.withSerializerModifier(beanSerializerModifier));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    @Deprecated
    public JsonSerializer<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        BeanDescription beanDescriptionIntrospect = serializationConfig.introspect(javaType);
        JsonSerializer<?> jsonValueSerializer = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<Serializers> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext() && (jsonValueSerializer = it.next().findSerializer(serializationConfig, javaType, beanDescriptionIntrospect)) == null) {
            }
        }
        if (jsonValueSerializer != null) {
            jsonSerializer = jsonValueSerializer;
        } else if (jsonSerializer == null && (jsonSerializer = StdKeySerializers.getStdKeySerializer(serializationConfig, javaType.getRawClass(), false)) == null) {
            AnnotatedMember annotatedMemberFindJsonValueAccessor = beanDescriptionIntrospect.findJsonValueAccessor();
            if (annotatedMemberFindJsonValueAccessor != null) {
                JsonSerializer<Object> stdKeySerializer = StdKeySerializers.getStdKeySerializer(serializationConfig, annotatedMemberFindJsonValueAccessor.getRawType(), true);
                if (serializationConfig.canOverrideAccessModifiers()) {
                    ClassUtil.checkAndFixAccess(annotatedMemberFindJsonValueAccessor.getMember(), serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
                jsonValueSerializer = new JsonValueSerializer(annotatedMemberFindJsonValueAccessor, stdKeySerializer);
                jsonSerializer = jsonValueSerializer;
            } else {
                jsonSerializer = StdKeySerializers.getFallbackKeySerializer(serializationConfig, javaType.getRawClass());
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializer = it2.next().modifyKeySerializer(serializationConfig, javaType, beanDescriptionIntrospect, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new CollectionSerializer(javaType, z10, typeSerializer, jsonSerializer);
    }
}
