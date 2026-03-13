package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    protected PrettyPrinter _cfgPrettyPrinter;

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.JsonGenerator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z10) {
            this._defaultState = z10;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i10) {
            return (this._mask & i10) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public void _copyCurrentContents(JsonParser jsonParser) {
        int i10 = 1;
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                return;
            }
            switch (jsonTokenNextToken.id()) {
                case 1:
                    writeStartObject();
                    break;
                case 2:
                    writeEndObject();
                    i10--;
                    if (i10 != 0) {
                        continue;
                    } else {
                        return;
                    }
                    break;
                case 3:
                    writeStartArray();
                    break;
                case 4:
                    writeEndArray();
                    i10--;
                    if (i10 != 0) {
                        continue;
                    } else {
                        return;
                    }
                    break;
                case 5:
                    writeFieldName(jsonParser.getCurrentName());
                    continue;
                case 6:
                    if (jsonParser.hasTextCharacters()) {
                        writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    } else {
                        writeString(jsonParser.getText());
                        continue;
                    }
                    break;
                case 7:
                    JsonParser.NumberType numberType = jsonParser.getNumberType();
                    if (numberType == JsonParser.NumberType.INT) {
                        writeNumber(jsonParser.getIntValue());
                    } else if (numberType == JsonParser.NumberType.BIG_INTEGER) {
                        writeNumber(jsonParser.getBigIntegerValue());
                    } else {
                        writeNumber(jsonParser.getLongValue());
                        continue;
                    }
                    break;
                case 8:
                    JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                    if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                        writeNumber(jsonParser.getDecimalValue());
                    } else if (numberType2 == JsonParser.NumberType.FLOAT) {
                        writeNumber(jsonParser.getFloatValue());
                    } else {
                        writeNumber(jsonParser.getDoubleValue());
                        continue;
                    }
                    break;
                case 9:
                    writeBoolean(true);
                    continue;
                case 10:
                    writeBoolean(false);
                    continue;
                case 11:
                    writeNull();
                    continue;
                case 12:
                    writeObject(jsonParser.getEmbeddedObject());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + jsonTokenNextToken);
            }
            i10++;
        }
    }

    public void _reportError(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public final void _verifyOffsets(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)));
        }
    }

    public void _writeSimpleObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long) {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double) {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                writeNumber((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                writeNumber((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                writeNumber(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                writeNumber(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            writeBoolean(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final JsonGenerator configure(Feature feature, boolean z10) {
        if (z10) {
            enable(feature);
            return this;
        }
        disable(feature);
        return this;
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws JsonGenerationException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        switch (jsonTokenCurrentToken == null ? -1 : jsonTokenCurrentToken.id()) {
            case -1:
                _reportError("No current event to copy");
                return;
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + jsonTokenCurrentToken);
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                JsonParser.NumberType numberType = jsonParser.getNumberType();
                if (numberType == JsonParser.NumberType.INT) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (numberType == JsonParser.NumberType.BIG_INTEGER) {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                } else {
                    writeNumber(jsonParser.getLongValue());
                    return;
                }
            case 8:
                JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (numberType2 == JsonParser.NumberType.FLOAT) {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                } else {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws JsonGenerationException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        int iId = jsonTokenCurrentToken == null ? -1 : jsonTokenCurrentToken.id();
        if (iId == 5) {
            writeFieldName(jsonParser.getCurrentName());
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            iId = jsonTokenNextToken != null ? jsonTokenNextToken.id() : -1;
        }
        if (iId == 1) {
            writeStartObject();
            _copyCurrentContents(jsonParser);
        } else if (iId != 3) {
            copyCurrentEvent(jsonParser);
        } else {
            writeStartArray();
            _copyCurrentContents(jsonParser);
        }
    }

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    @Override // java.io.Flushable
    public abstract void flush();

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public Object getCurrentValue() {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public FormatSchema getSchema() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public JsonGenerator overrideStdFeatures(int i10, int i11) {
        return setFeatureMask((i10 & i11) | (getFeatureMask() & (~i11)));
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    public void setCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i10);

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", getClass().getName(), formatSchema.getSchemaType()));
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract Version version();

    public void writeArray(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(iArr.length, i10, i11);
        writeStartArray(iArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            writeNumber(iArr[i10]);
            i10++;
        }
        writeEndArray();
    }

    public void writeArrayFieldStart(String str) {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10);

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11);

    public void writeBinary(byte[] bArr, int i10, int i11) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i10, i11);
    }

    public void writeBinaryField(String str, byte[] bArr) {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z10);

    public void writeBooleanField(String str, boolean z10) {
        writeFieldName(str);
        writeBoolean(z10);
    }

    public void writeEmbeddedObject(Object obj) throws JsonGenerationException {
        if (obj == null) {
            writeNull();
        } else {
            if (obj instanceof byte[]) {
                writeBinary((byte[]) obj);
                return;
            }
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public void writeFieldId(long j10) {
        writeFieldName(Long.toString(j10));
    }

    public abstract void writeFieldName(SerializableString serializableString);

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public void writeNullField(String str) {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d10);

    public abstract void writeNumber(float f10);

    public abstract void writeNumber(int i10);

    public abstract void writeNumber(long j10);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public void writeNumber(short s10) {
        writeNumber((int) s10);
    }

    public void writeNumberField(String str, short s10) {
        writeFieldName(str);
        writeNumber(s10);
    }

    public abstract void writeObject(Object obj);

    public void writeObjectField(String str, Object obj) {
        writeFieldName(str);
        writeObject(obj);
    }

    public void writeObjectFieldStart(String str) {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeObjectId(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public abstract void writeRaw(char c10);

    public void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRaw(String str);

    public abstract void writeRaw(String str, int i10, int i11);

    public abstract void writeRaw(char[] cArr, int i10, int i11);

    public abstract void writeRawUTF8String(byte[] bArr, int i10, int i11);

    public void writeRawValue(SerializableString serializableString) {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeRawValue(String str);

    public abstract void writeRawValue(String str, int i10, int i11);

    public abstract void writeRawValue(char[] cArr, int i10, int i11);

    public abstract void writeStartArray();

    public void writeStartArray(int i10) {
        writeStartArray();
    }

    public abstract void writeStartObject();

    public void writeStartObject(Object obj) {
        writeStartObject();
        setCurrentValue(obj);
    }

    public abstract void writeString(SerializableString serializableString);

    public void writeString(Reader reader, int i10) {
        _reportUnsupportedOperation();
    }

    public abstract void writeString(String str);

    public abstract void writeString(char[] cArr, int i10, int i11);

    public void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(TreeNode treeNode);

    public void writeTypeId(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) throws JsonGenerationException {
        Object obj = writableTypeId.f28898id;
        JsonToken jsonToken = writableTypeId.valueShape;
        if (canWriteTypeId()) {
            writableTypeId.wrapperWritten = false;
            writeTypeId(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.include = inclusion;
            }
            int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[inclusion.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    writeStartObject(writableTypeId.forValue);
                    writeStringField(writableTypeId.asProperty, strValueOf);
                    return writableTypeId;
                }
                if (i10 != 4) {
                    writeStartArray();
                    writeString(strValueOf);
                } else {
                    writeStartObject();
                    writeFieldName(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            writeStartObject(writableTypeId.forValue);
            return writableTypeId;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            writeStartArray();
        }
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[writableTypeId.include.ordinal()];
            if (i10 == 1) {
                Object obj = writableTypeId.f28898id;
                writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i10 != 2 && i10 != 3) {
                if (i10 != 5) {
                    writeEndObject();
                    return writableTypeId;
                }
                writeEndArray();
                return writableTypeId;
            }
        }
        return writableTypeId;
    }

    public abstract void writeUTF8String(byte[] bArr, int i10, int i11);

    public void writeBinary(byte[] bArr) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public void writeNumber(char[] cArr, int i10, int i11) {
        writeNumber(new String(cArr, i10, i11));
    }

    public void writeStartArray(Object obj) {
        writeStartArray();
        setCurrentValue(obj);
    }

    public int writeBinary(InputStream inputStream, int i10) {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i10);
    }

    public void writeNumberField(String str, int i10) {
        writeFieldName(str);
        writeNumber(i10);
    }

    public void writeStartObject(Object obj, int i10) {
        writeStartObject();
        setCurrentValue(obj);
    }

    public void writeStartArray(Object obj, int i10) {
        writeStartArray(i10);
        setCurrentValue(obj);
    }

    public void writeNumberField(String str, long j10) {
        writeFieldName(str);
        writeNumber(j10);
    }

    public void writeArray(long[] jArr, int i10, int i11) {
        if (jArr != null) {
            _verifyOffsets(jArr.length, i10, i11);
            writeStartArray(jArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(jArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void writeNumberField(String str, BigInteger bigInteger) {
        writeFieldName(str);
        writeNumber(bigInteger);
    }

    public void writeNumberField(String str, float f10) {
        writeFieldName(str);
        writeNumber(f10);
    }

    public void writeArray(double[] dArr, int i10, int i11) {
        if (dArr != null) {
            _verifyOffsets(dArr.length, i10, i11);
            writeStartArray(dArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(dArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void writeNumberField(String str, double d10) {
        writeFieldName(str);
        writeNumber(d10);
    }

    public void writeNumberField(String str, BigDecimal bigDecimal) {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeArray(String[] strArr, int i10, int i11) {
        if (strArr != null) {
            _verifyOffsets(strArr.length, i10, i11);
            writeStartArray(strArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeString(strArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i10) {
        return this;
    }

    public void writeOmittedField(String str) {
    }

    public JsonGenerator overrideFormatFeatures(int i10, int i11) {
        return this;
    }
}
