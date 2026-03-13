package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeSerializer {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.TypeSerializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = iArr;
            try {
                iArr[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void _writeLegacySuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        writableTypeId.wrapperWritten = !jsonGenerator.canWriteTypeId();
        writeTypeSuffix(jsonGenerator, writableTypeId);
    }

    public abstract TypeSerializer forProperty(BeanProperty beanProperty);

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract JsonTypeInfo.As getTypeInclusion();

    public WritableTypeId typeId(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[getTypeInclusion().ordinal()];
        if (i10 == 1) {
            writableTypeId.include = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
            return writableTypeId;
        }
        if (i10 == 2) {
            writableTypeId.include = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
            return writableTypeId;
        }
        if (i10 == 3) {
            writableTypeId.include = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
            return writableTypeId;
        }
        if (i10 == 4) {
            writableTypeId.include = WritableTypeId.Inclusion.WRAPPER_ARRAY;
            return writableTypeId;
        }
        if (i10 != 5) {
            VersionUtil.throwInternal();
            return writableTypeId;
        }
        writableTypeId.include = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        return writableTypeId;
    }

    @Deprecated
    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING, str));
    }

    public abstract WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);

    @Deprecated
    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING));
    }

    public abstract WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);

    @Deprecated
    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING));
    }

    @Deprecated
    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.VALUE_STRING));
    }

    public WritableTypeId typeId(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId writableTypeIdTypeId = typeId(obj, jsonToken);
        writableTypeIdTypeId.f28898id = obj2;
        return writableTypeIdTypeId;
    }

    public WritableTypeId typeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId writableTypeIdTypeId = typeId(obj, jsonToken);
        writableTypeIdTypeId.forValueType = cls;
        return writableTypeIdTypeId;
    }
}
