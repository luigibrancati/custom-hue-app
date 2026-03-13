package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    private static final long serialVersionUID = 1;
    private List<ObjectIdResolver> _objectIdResolvers;
    protected transient LinkedHashMap<ObjectIdGenerator.IdKey, ReadableObjectId> _objectIds;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(DeserializerFactory deserializerFactory) {
            super(deserializerFactory, (DeserializerCache) null);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext copy() {
            ClassUtil.verifyMustOverride(Impl.class, this, "copy");
            return new Impl(this);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            return new Impl(this, deserializationConfig, jsonParser, injectableValues);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext with(DeserializerFactory deserializerFactory) {
            return new Impl(this, deserializerFactory);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            super(impl, deserializationConfig, jsonParser, injectableValues);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl(Impl impl, DeserializerFactory deserializerFactory) {
            super(impl, deserializerFactory);
        }
    }

    public DefaultDeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        super(deserializerFactory, deserializerCache);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        if (this._objectIds != null && isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            Iterator<Map.Entry<ObjectIdGenerator.IdKey, ReadableObjectId>> it = this._objectIds.entrySet().iterator();
            UnresolvedForwardReference unresolvedForwardReference = null;
            while (it.hasNext()) {
                ReadableObjectId value = it.next().getValue();
                if (value.hasReferringProperties() && !tryToResolveUnresolvedObjectId(value)) {
                    if (unresolvedForwardReference == null) {
                        unresolvedForwardReference = new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ");
                    }
                    Object obj = value.getKey().key;
                    Iterator<ReadableObjectId.Referring> itReferringProperties = value.referringProperties();
                    while (itReferringProperties.hasNext()) {
                        ReadableObjectId.Referring next = itReferringProperties.next();
                        unresolvedForwardReference.addUnresolvedId(obj, next.getBeanType(), next.getLocation());
                    }
                }
            }
            if (unresolvedForwardReference != null) {
                throw unresolvedForwardReference;
            }
        }
    }

    public DefaultDeserializationContext copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues);

    public ReadableObjectId createReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        return new ReadableObjectId(idKey);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj) {
        JsonDeserializer<?> jsonDeserializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonDeserializer) {
            jsonDeserializer = (JsonDeserializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == JsonDeserializer.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (!JsonDeserializer.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
            JsonDeserializer<?> jsonDeserializerDeserializerInstance = handlerInstantiator != null ? handlerInstantiator.deserializerInstance(this._config, annotated, cls) : null;
            jsonDeserializer = jsonDeserializerDeserializerInstance == null ? (JsonDeserializer) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : jsonDeserializerDeserializerInstance;
        }
        if (jsonDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) jsonDeserializer).resolve(this);
        }
        return jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver) {
        ObjectIdResolver objectIdResolverNewForDeserialization = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey idKeyKey = objectIdGenerator.key(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, ReadableObjectId> linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap<>();
        } else {
            ReadableObjectId readableObjectId = linkedHashMap.get(idKeyKey);
            if (readableObjectId != null) {
                return readableObjectId;
            }
        }
        List<ObjectIdResolver> list = this._objectIdResolvers;
        if (list != null) {
            Iterator<ObjectIdResolver> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ObjectIdResolver next = it.next();
                if (next.canUseFor(objectIdResolver)) {
                    objectIdResolverNewForDeserialization = next;
                    break;
                }
            }
        } else {
            this._objectIdResolvers = new ArrayList(8);
        }
        if (objectIdResolverNewForDeserialization == null) {
            objectIdResolverNewForDeserialization = objectIdResolver.newForDeserialization(this);
            this._objectIdResolvers.add(objectIdResolverNewForDeserialization);
        }
        ReadableObjectId readableObjectIdCreateReadableObjectId = createReadableObjectId(idKeyKey);
        readableObjectIdCreateReadableObjectId.setResolver(objectIdResolverNewForDeserialization);
        this._objectIds.put(idKeyKey, readableObjectIdCreateReadableObjectId);
        return readableObjectIdCreateReadableObjectId;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) {
        KeyDeserializer keyDeserializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof KeyDeserializer) {
            keyDeserializer = (KeyDeserializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == KeyDeserializer.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (!KeyDeserializer.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
            KeyDeserializer keyDeserializerKeyDeserializerInstance = handlerInstantiator != null ? handlerInstantiator.keyDeserializerInstance(this._config, annotated, cls) : null;
            keyDeserializer = keyDeserializerKeyDeserializerInstance == null ? (KeyDeserializer) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : keyDeserializerKeyDeserializerInstance;
        }
        if (keyDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) keyDeserializer).resolve(this);
        }
        return keyDeserializer;
    }

    public boolean tryToResolveUnresolvedObjectId(ReadableObjectId readableObjectId) {
        return readableObjectId.tryToResolveUnresolved(this);
    }

    public abstract DefaultDeserializationContext with(DeserializerFactory deserializerFactory);

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, injectableValues);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializerFactory deserializerFactory) {
        super(defaultDeserializationContext, deserializerFactory);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super(defaultDeserializationContext);
    }
}
