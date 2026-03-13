package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class SerializerCache {
    private final HashMap<TypeKey, JsonSerializer<Object>> _sharedMap = new HashMap<>(64);
    private final AtomicReference<ReadOnlyClassToSerializerMap> _readOnlyMap = new AtomicReference<>();

    private final synchronized ReadOnlyClassToSerializerMap _makeReadOnlyLookupMap() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMapFrom;
        readOnlyClassToSerializerMapFrom = this._readOnlyMap.get();
        if (readOnlyClassToSerializerMapFrom == null) {
            readOnlyClassToSerializerMapFrom = ReadOnlyClassToSerializerMap.from(this._sharedMap);
            this._readOnlyMap.set(readOnlyClassToSerializerMapFrom);
        }
        return readOnlyClassToSerializerMapFrom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(cls, false), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(javaType, true), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void flush() {
        this._sharedMap.clear();
    }

    public ReadOnlyClassToSerializerMap getReadOnlyLookupMap() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap = this._readOnlyMap.get();
        return readOnlyClassToSerializerMap != null ? readOnlyClassToSerializerMap : _makeReadOnlyLookupMap();
    }

    public synchronized int size() {
        return this._sharedMap.size();
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(javaType, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(cls, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(cls, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(javaType, false));
        }
        return jsonSerializer;
    }

    public void addTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(cls, true), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(javaType, false), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) {
        synchronized (this) {
            try {
                JsonSerializer<Object> jsonSerializerPut = this._sharedMap.put(new TypeKey(cls, false), jsonSerializer);
                JsonSerializer<Object> jsonSerializerPut2 = this._sharedMap.put(new TypeKey(javaType, false), jsonSerializer);
                if (jsonSerializerPut == null || jsonSerializerPut2 == null) {
                    this._readOnlyMap.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
