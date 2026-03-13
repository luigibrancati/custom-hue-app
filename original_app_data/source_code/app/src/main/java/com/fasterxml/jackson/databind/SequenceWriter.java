package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SequenceWriter implements Versioned, Closeable, Flushable {
    protected final boolean _cfgCloseCloseable;
    protected final boolean _cfgFlush;
    protected final boolean _closeGenerator;
    protected boolean _closed;
    protected final SerializationConfig _config;
    protected PropertySerializerMap _dynamicSerializers;
    protected final JsonGenerator _generator;
    protected boolean _openArray;
    protected final DefaultSerializerProvider _provider;
    protected final JsonSerializer<Object> _rootSerializer;
    protected final TypeSerializer _typeSerializer;

    public SequenceWriter(DefaultSerializerProvider defaultSerializerProvider, JsonGenerator jsonGenerator, boolean z10, ObjectWriter.Prefetch prefetch) {
        this._provider = defaultSerializerProvider;
        this._generator = jsonGenerator;
        this._closeGenerator = z10;
        this._rootSerializer = prefetch.getValueSerializer();
        this._typeSerializer = prefetch.getTypeSerializer();
        SerializationConfig config = defaultSerializerProvider.getConfig();
        this._config = config;
        this._cfgFlush = config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
        this._cfgCloseCloseable = config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
        this._dynamicSerializers = PropertySerializerMap.emptyForRootValues();
    }

    private final JsonSerializer<Object> _findAndAddDynamic(Class<?> cls) {
        TypeSerializer typeSerializer = this._typeSerializer;
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddRootValueSerializer = typeSerializer == null ? this._dynamicSerializers.findAndAddRootValueSerializer(cls, this._provider) : this._dynamicSerializers.addSerializer(cls, new TypeWrappedSerializer(typeSerializer, this._provider.findValueSerializer(cls, (BeanProperty) null)));
        this._dynamicSerializers = serializerAndMapResultFindAndAddRootValueSerializer.map;
        return serializerAndMapResultFindAndAddRootValueSerializer.serializer;
    }

    public SequenceWriter _writeCloseableValue(Object obj) throws Throwable {
        Closeable closeable = (Closeable) obj;
        try {
            JsonSerializer<Object> jsonSerializer_findAndAddDynamic = this._rootSerializer;
            if (jsonSerializer_findAndAddDynamic == null) {
                Class<?> cls = obj.getClass();
                JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicSerializers.serializerFor(cls);
                jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor == null ? _findAndAddDynamic(cls) : jsonSerializerSerializerFor;
            }
            this._provider.serializeValue(this._generator, obj, null, jsonSerializer_findAndAddDynamic);
            if (this._cfgFlush) {
                this._generator.flush();
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable.close();
            return this;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this._closed) {
            return;
        }
        this._closed = true;
        if (this._openArray) {
            this._openArray = false;
            this._generator.writeEndArray();
        }
        if (this._closeGenerator) {
            this._generator.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this._closed) {
            return;
        }
        this._generator.flush();
    }

    public SequenceWriter init(boolean z10) {
        if (z10) {
            this._generator.writeStartArray();
            this._openArray = true;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    public SequenceWriter write(Object obj) {
        if (obj == null) {
            this._provider.serializeValue(this._generator, null);
            return this;
        }
        if (this._cfgCloseCloseable && (obj instanceof Closeable)) {
            return _writeCloseableValue(obj);
        }
        JsonSerializer<Object> jsonSerializer_findAndAddDynamic = this._rootSerializer;
        if (jsonSerializer_findAndAddDynamic == null) {
            Class<?> cls = obj.getClass();
            JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicSerializers.serializerFor(cls);
            jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor == null ? _findAndAddDynamic(cls) : jsonSerializerSerializerFor;
        }
        this._provider.serializeValue(this._generator, obj, null, jsonSerializer_findAndAddDynamic);
        if (this._cfgFlush) {
            this._generator.flush();
        }
        return this;
    }

    public SequenceWriter writeAll(Object[] objArr) {
        for (Object obj : objArr) {
            write(obj);
        }
        return this;
    }

    public <C extends Collection<?>> SequenceWriter writeAll(C c10) {
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    public SequenceWriter writeAll(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    private final JsonSerializer<Object> _findAndAddDynamic(JavaType javaType) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultAddSerializer;
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            serializerAndMapResultAddSerializer = this._dynamicSerializers.findAndAddRootValueSerializer(javaType, this._provider);
        } else {
            serializerAndMapResultAddSerializer = this._dynamicSerializers.addSerializer(javaType, new TypeWrappedSerializer(typeSerializer, this._provider.findValueSerializer(javaType, (BeanProperty) null)));
        }
        this._dynamicSerializers = serializerAndMapResultAddSerializer.map;
        return serializerAndMapResultAddSerializer.serializer;
    }

    public SequenceWriter write(Object obj, JavaType javaType) throws JsonMappingException {
        if (obj == null) {
            this._provider.serializeValue(this._generator, null);
            return this;
        }
        if (this._cfgCloseCloseable && (obj instanceof Closeable)) {
            return _writeCloseableValue(obj, javaType);
        }
        JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicSerializers.serializerFor(javaType.getRawClass());
        if (jsonSerializerSerializerFor == null) {
            jsonSerializerSerializerFor = _findAndAddDynamic(javaType);
        }
        this._provider.serializeValue(this._generator, obj, javaType, jsonSerializerSerializerFor);
        if (this._cfgFlush) {
            this._generator.flush();
        }
        return this;
    }

    public SequenceWriter _writeCloseableValue(Object obj, JavaType javaType) throws Throwable {
        Closeable closeable = (Closeable) obj;
        try {
            JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicSerializers.serializerFor(javaType.getRawClass());
            if (jsonSerializerSerializerFor == null) {
                jsonSerializerSerializerFor = _findAndAddDynamic(javaType);
            }
            this._provider.serializeValue(this._generator, obj, javaType, jsonSerializerSerializerFor);
            if (this._cfgFlush) {
                this._generator.flush();
            }
            try {
                closeable.close();
                return this;
            } catch (Throwable th) {
                th = th;
                closeable = null;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
