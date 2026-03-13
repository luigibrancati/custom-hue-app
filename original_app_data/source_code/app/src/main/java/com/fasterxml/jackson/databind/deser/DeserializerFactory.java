package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeserializerFactory {
    protected static final Deserializers[] NO_DESERIALIZERS = new Deserializers[0];

    public abstract JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription);

    public abstract JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription);

    public abstract JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls);

    public abstract JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription);

    public abstract JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription);

    public abstract JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription);

    public abstract KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType);

    public abstract JsonDeserializer<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, BeanDescription beanDescription);

    public abstract JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription);

    public abstract JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription);

    public abstract JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription);

    public abstract TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription);

    public abstract boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls);

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver);

    public abstract DeserializerFactory withAdditionalDeserializers(Deserializers deserializers);

    public abstract DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers);

    public abstract DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier);

    public abstract DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators);
}
