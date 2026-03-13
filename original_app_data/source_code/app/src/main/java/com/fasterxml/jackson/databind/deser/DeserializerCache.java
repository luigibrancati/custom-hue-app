package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    protected final LRUMap<JavaType, JsonDeserializer<Object>> _cachedDeserializers;
    protected final HashMap<JavaType, JsonDeserializer<Object>> _incompleteDeserializers;

    public DeserializerCache() {
        this(2000);
    }

    private boolean _hasCustomHandlers(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null || (contentType.getValueHandler() == null && contentType.getTypeHandler() == null)) {
            return javaType.isMapLikeType() && javaType.getKeyType().getValueHandler() != null;
        }
        return true;
    }

    private Class<?> _verifyAsClass(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class<?> cls2 = (Class) obj;
            if (cls2 == cls || ClassUtil.isBogusClass(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.fasterxml.jackson.databind.JavaType modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext r5, com.fasterxml.jackson.databind.introspect.Annotated r6, com.fasterxml.jackson.databind.JavaType r7) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r5.getAnnotationIntrospector()
            if (r0 != 0) goto L7
            return r7
        L7:
            boolean r1 = r7.isMapLikeType()
            if (r1 == 0) goto L2e
            com.fasterxml.jackson.databind.JavaType r1 = r7.getKeyType()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r1.getValueHandler()
            if (r1 != 0) goto L2e
            java.lang.Object r1 = r0.findKeyDeserializer(r6)
            if (r1 == 0) goto L2e
            com.fasterxml.jackson.databind.KeyDeserializer r1 = r5.keyDeserializerInstance(r6, r1)
            if (r1 == 0) goto L2e
            com.fasterxml.jackson.databind.type.MapLikeType r7 = (com.fasterxml.jackson.databind.type.MapLikeType) r7
            com.fasterxml.jackson.databind.type.MapLikeType r7 = r7.withKeyValueHandler(r1)
            r7.getKeyType()
        L2e:
            com.fasterxml.jackson.databind.JavaType r1 = r7.getContentType()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r1.getValueHandler()
            if (r1 != 0) goto L5d
            java.lang.Object r1 = r0.findContentDeserializer(r6)
            if (r1 == 0) goto L5d
            boolean r2 = r1 instanceof com.fasterxml.jackson.databind.JsonDeserializer
            if (r2 == 0) goto L47
            com.fasterxml.jackson.databind.JsonDeserializer r1 = (com.fasterxml.jackson.databind.JsonDeserializer) r1
            goto L56
        L47:
            java.lang.String r2 = "findContentDeserializer"
            java.lang.Class<com.fasterxml.jackson.databind.JsonDeserializer$None> r3 = com.fasterxml.jackson.databind.JsonDeserializer.None.class
            java.lang.Class r4 = r4._verifyAsClass(r1, r2, r3)
            if (r4 == 0) goto L56
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r5.deserializerInstance(r6, r4)
            goto L57
        L56:
            r4 = 0
        L57:
            if (r4 == 0) goto L5d
            com.fasterxml.jackson.databind.JavaType r7 = r7.withContentValueHandler(r4)
        L5d:
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r5.getConfig()
            com.fasterxml.jackson.databind.JavaType r4 = r0.refineDeserializationType(r4, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public JsonDeserializer<Object> _createAndCache2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws JsonMappingException {
        try {
            JsonDeserializer<Object> jsonDeserializer_createDeserializer = _createDeserializer(deserializationContext, deserializerFactory, javaType);
            if (jsonDeserializer_createDeserializer == 0) {
                return null;
            }
            boolean z10 = !_hasCustomHandlers(javaType) && jsonDeserializer_createDeserializer.isCachable();
            if (jsonDeserializer_createDeserializer instanceof ResolvableDeserializer) {
                this._incompleteDeserializers.put(javaType, jsonDeserializer_createDeserializer);
                ((ResolvableDeserializer) jsonDeserializer_createDeserializer).resolve(deserializationContext);
                this._incompleteDeserializers.remove(javaType);
            }
            if (z10) {
                this._cachedDeserializers.put(javaType, jsonDeserializer_createDeserializer);
            }
            return jsonDeserializer_createDeserializer;
        } catch (IllegalArgumentException e10) {
            throw JsonMappingException.from(deserializationContext, ClassUtil.exceptionMessage(e10), e10);
        }
    }

    public JsonDeserializer<Object> _createAndCacheValueDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer;
        synchronized (this._incompleteDeserializers) {
            try {
                JsonDeserializer<Object> jsonDeserializer_findCachedDeserializer = _findCachedDeserializer(javaType);
                if (jsonDeserializer_findCachedDeserializer != null) {
                    return jsonDeserializer_findCachedDeserializer;
                }
                int size = this._incompleteDeserializers.size();
                if (size > 0 && (jsonDeserializer = this._incompleteDeserializers.get(javaType)) != null) {
                    return jsonDeserializer;
                }
                try {
                    return _createAndCache2(deserializationContext, deserializerFactory, javaType);
                } finally {
                    if (size == 0 && this._incompleteDeserializers.size() > 0) {
                        this._incompleteDeserializers.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JsonDeserializer<Object> _createDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = deserializerFactory.mapAbstractType(config, javaType);
        }
        BeanDescription beanDescriptionIntrospect = config.introspect(javaType);
        JsonDeserializer<Object> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo());
        if (jsonDeserializerFindDeserializerFromAnnotation != null) {
            return jsonDeserializerFindDeserializerFromAnnotation;
        }
        JavaType javaTypeModifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo(), javaType);
        if (javaTypeModifyTypeByAnnotation != javaType) {
            beanDescriptionIntrospect = config.introspect(javaTypeModifyTypeByAnnotation);
            javaType = javaTypeModifyTypeByAnnotation;
        }
        Class<?> clsFindPOJOBuilder = beanDescriptionIntrospect.findPOJOBuilder();
        if (clsFindPOJOBuilder != null) {
            return deserializerFactory.createBuilderBasedDeserializer(deserializationContext, javaType, beanDescriptionIntrospect, clsFindPOJOBuilder);
        }
        Converter<Object, Object> converterFindDeserializationConverter = beanDescriptionIntrospect.findDeserializationConverter();
        if (converterFindDeserializationConverter == null) {
            return _createDeserializer2(deserializationContext, deserializerFactory, javaType, beanDescriptionIntrospect);
        }
        JavaType inputType = converterFindDeserializationConverter.getInputType(deserializationContext.getTypeFactory());
        if (!inputType.hasRawClass(javaType.getRawClass())) {
            beanDescriptionIntrospect = config.introspect(inputType);
        }
        return new StdDelegatingDeserializer(converterFindDeserializationConverter, inputType, _createDeserializer2(deserializationContext, deserializerFactory, inputType, beanDescriptionIntrospect));
    }

    public JsonDeserializer<?> _createDeserializer2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, BeanDescription beanDescription) {
        JsonFormat.Value valueFindExpectedFormat;
        JsonFormat.Value valueFindExpectedFormat2;
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return deserializerFactory.createEnumDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return deserializerFactory.createArrayDeserializer(deserializationContext, (ArrayType) javaType, beanDescription);
            }
            if (javaType.isMapLikeType() && ((valueFindExpectedFormat2 = beanDescription.findExpectedFormat(null)) == null || valueFindExpectedFormat2.getShape() != JsonFormat.Shape.OBJECT)) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                return mapLikeType.isTrueMapType() ? deserializerFactory.createMapDeserializer(deserializationContext, (MapType) mapLikeType, beanDescription) : deserializerFactory.createMapLikeDeserializer(deserializationContext, mapLikeType, beanDescription);
            }
            if (javaType.isCollectionLikeType() && ((valueFindExpectedFormat = beanDescription.findExpectedFormat(null)) == null || valueFindExpectedFormat.getShape() != JsonFormat.Shape.OBJECT)) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                return collectionLikeType.isTrueCollectionType() ? deserializerFactory.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, beanDescription) : deserializerFactory.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, beanDescription);
            }
        }
        return javaType.isReferenceType() ? deserializerFactory.createReferenceDeserializer(deserializationContext, (ReferenceType) javaType, beanDescription) : JsonNode.class.isAssignableFrom(javaType.getRawClass()) ? deserializerFactory.createTreeDeserializer(config, javaType, beanDescription) : deserializerFactory.createBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    public JsonDeserializer<Object> _findCachedDeserializer(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        if (_hasCustomHandlers(javaType)) {
            return null;
        }
        return this._cachedDeserializers.get(javaType);
    }

    public KeyDeserializer _handleUnknownKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        return (KeyDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }

    public JsonDeserializer<Object> _handleUnknownValueDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        if (ClassUtil.isConcrete(javaType.getRawClass())) {
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
        }
        return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
    }

    public int cachedDeserializersCount() {
        return this._cachedDeserializers.size();
    }

    public Converter<Object, Object> findConverter(DeserializationContext deserializationContext, Annotated annotated) {
        Object objFindDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(annotated);
        if (objFindDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(annotated, objFindDeserializationConverter);
    }

    public JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext deserializationContext, Annotated annotated, JsonDeserializer<Object> jsonDeserializer) {
        Converter<Object, Object> converterFindConverter = findConverter(deserializationContext, annotated);
        return converterFindConverter == null ? jsonDeserializer : new StdDelegatingDeserializer(converterFindConverter, converterFindConverter.getInputType(deserializationContext.getTypeFactory()), jsonDeserializer);
    }

    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object objFindDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(annotated);
        if (objFindDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, annotated, deserializationContext.deserializerInstance(annotated, objFindDeserializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyDeserializer findKeyDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        KeyDeserializer keyDeserializerCreateKeyDeserializer = deserializerFactory.createKeyDeserializer(deserializationContext, javaType);
        if (keyDeserializerCreateKeyDeserializer == 0) {
            return _handleUnknownKeyDeserializer(deserializationContext, javaType);
        }
        if (keyDeserializerCreateKeyDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) keyDeserializerCreateKeyDeserializer).resolve(deserializationContext);
        }
        return keyDeserializerCreateKeyDeserializer;
    }

    public JsonDeserializer<Object> findValueDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (jsonDeserializer_findCachedDeserializer != null) {
            return jsonDeserializer_findCachedDeserializer;
        }
        JsonDeserializer<Object> jsonDeserializer_createAndCacheValueDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType);
        return jsonDeserializer_createAndCacheValueDeserializer == null ? _handleUnknownValueDeserializer(deserializationContext, javaType) : jsonDeserializer_createAndCacheValueDeserializer;
    }

    public void flushCachedDeserializers() {
        this._cachedDeserializers.clear();
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (jsonDeserializer_findCachedDeserializer == null) {
            jsonDeserializer_findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType);
        }
        return jsonDeserializer_findCachedDeserializer != null;
    }

    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }

    public DeserializerCache(int i10) {
        this._incompleteDeserializers = new HashMap<>(8);
        this._cachedDeserializers = new LRUMap<>(Math.min(64, i10 >> 2), i10);
    }
}
