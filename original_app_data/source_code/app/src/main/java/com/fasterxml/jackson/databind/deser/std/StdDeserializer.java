package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class StdDeserializer<T> extends JsonDeserializer<T> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _valueClass;
    protected final JavaType _valueType;
    protected static final int F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();
    protected static final int F_MASK_ACCEPT_ARRAYS = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();

    public StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final double parseDouble(String str) {
        if (NumberInput.NASTY_SMALL_DOUBLE.equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    public final boolean _byteOverflow(int i10) {
        return i10 < -128 || i10 > 255;
    }

    public Object _coerceEmptyString(DeserializationContext deserializationContext, boolean z10) throws MismatchedInputException {
        boolean z11;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            if (z10) {
                DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.isEnabled(deserializationFeature2)) {
                    z11 = false;
                    deserializationFeature = deserializationFeature2;
                }
            }
            return getNullValue(deserializationContext);
        }
        z11 = true;
        deserializationFeature = mapperFeature;
        _reportFailedNullCoerce(deserializationContext, z11, deserializationFeature, "empty String (\"\")");
        return null;
    }

    public Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        return DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? jsonParser.getBigIntegerValue() : DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? Long.valueOf(jsonParser.getLongValue()) : jsonParser.getBigIntegerValue();
    }

    public Object _coerceNullToken(DeserializationContext deserializationContext, boolean z10) throws MismatchedInputException {
        if (z10) {
            _verifyNullForPrimitive(deserializationContext);
        }
        return getNullValue(deserializationContext);
    }

    public Object _coerceTextualNull(DeserializationContext deserializationContext, boolean z10) throws MismatchedInputException {
        boolean z11;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            if (z10) {
                DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.isEnabled(deserializationFeature2)) {
                    z11 = false;
                    deserializationFeature = deserializationFeature2;
                }
            }
            return getNullValue(deserializationContext);
        }
        z11 = true;
        deserializationFeature = mapperFeature;
        _reportFailedNullCoerce(deserializationContext, z11, deserializationFeature, "String \"null\"");
        return null;
    }

    public String _coercedTypeDesc() {
        String strNameOf;
        JavaType valueType = getValueType();
        boolean z10 = true;
        if (valueType == null || valueType.isPrimitive()) {
            Class<?> clsHandledType = handledType();
            if (!clsHandledType.isArray() && !Collection.class.isAssignableFrom(clsHandledType) && !Map.class.isAssignableFrom(clsHandledType)) {
                z10 = false;
            }
            strNameOf = ClassUtil.nameOf(clsHandledType);
        } else {
            if (!valueType.isContainerType() && !valueType.isReferenceType()) {
                z10 = false;
            }
            strNameOf = "'" + valueType.toString() + "'";
        }
        if (z10) {
            return "as content of type " + strNameOf;
        }
        return "for type " + strNameOf;
    }

    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenNextToken == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                T tDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return tDeserialize;
            }
        } else {
            jsonParser.getCurrentToken();
        }
        return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.getCurrentToken(), jsonParser, (String) null, new Object[0]);
    }

    public T _deserializeFromEmpty(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    return null;
                }
                return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
        } else if (currentToken == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().trim().isEmpty()) {
            return null;
        }
        return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
    }

    public T _deserializeWrappedValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken = JsonToken.START_ARRAY;
        if (!jsonParser.hasToken(jsonToken)) {
            return deserialize(jsonParser, deserializationContext);
        }
        return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.getCurrentToken(), jsonParser, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", ClassUtil.nameOf(this._valueClass), jsonToken, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"), new Object[0]);
    }

    public void _failDoubleToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws MismatchedInputException {
        deserializationContext.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", jsonParser.getValueAsString(), str);
    }

    public final NullValueProvider _findNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, JsonDeserializer<?> jsonDeserializer) throws InvalidDefinitionException {
        if (nulls == Nulls.FAIL) {
            return beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(jsonDeserializer.handledType())) : NullsFailProvider.constructForProperty(beanProperty);
        }
        if (nulls != Nulls.AS_EMPTY) {
            if (nulls == Nulls.SKIP) {
                return NullsConstantProvider.skipper();
            }
            return null;
        }
        if (jsonDeserializer == null) {
            return null;
        }
        if ((jsonDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) jsonDeserializer).getValueInstantiator().canCreateUsingDefault()) {
            JavaType type = beanProperty.getType();
            deserializationContext.reportBadDefinition(type, String.format("Cannot create empty instance of %s, no default Creator", type));
        }
        AccessPattern emptyAccessPattern = jsonDeserializer.getEmptyAccessPattern();
        return emptyAccessPattern == AccessPattern.ALWAYS_NULL ? NullsConstantProvider.nuller() : emptyAccessPattern == AccessPattern.CONSTANT ? NullsConstantProvider.forValue(jsonDeserializer.getEmptyValue(deserializationContext)) : new NullsAsEmptyProvider(jsonDeserializer);
    }

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public final boolean _intOverflow(long j10) {
        return j10 < -2147483648L || j10 > 2147483647L;
    }

    public boolean _isEmptyOrTextualNull(String str) {
        return str.isEmpty() || "null".equals(str);
    }

    public final boolean _isIntNumber(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        for (int i10 = (cCharAt == '-' || cCharAt == '+') ? 1 : 0; i10 < length; i10++) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return false;
            }
        }
        return true;
    }

    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    public final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public Number _nonNullNumber(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    public boolean _parseBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
        return !WebrtcBuildVersion.maint_version.equals(jsonParser.getText());
    }

    @Deprecated
    public final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseBooleanPrimitive(deserializationContext, jsonParser, Boolean.TYPE);
    }

    public final byte _parseBytePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        return _byteOverflow(i_parseIntPrimitive) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, String.valueOf(i_parseIntPrimitive), "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) i_parseIntPrimitive;
    }

    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) {
        long jLongValue;
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId == 3) {
            return _parseDateFromArray(jsonParser, deserializationContext);
        }
        if (currentTokenId == 11) {
            return (Date) getNullValue(deserializationContext);
        }
        if (currentTokenId == 6) {
            return _parseDate(jsonParser.getText().trim(), deserializationContext);
        }
        if (currentTokenId != 7) {
            return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        try {
            jLongValue = jsonParser.getLongValue();
        } catch (JsonParseException | InputCoercionException unused) {
            jLongValue = ((Number) deserializationContext.handleWeirdNumberValue(this._valueClass, jsonParser.getNumberValue(), "not a valid 64-bit long for creating `java.util.Date`", new Object[0])).longValue();
        }
        return new Date(jLongValue);
    }

    public Date _parseDateFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        JsonToken currentToken;
        if (deserializationContext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)) {
            currentToken = jsonParser.nextToken();
            if (currentToken == JsonToken.END_ARRAY && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return (Date) getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                Date date_parseDate = _parseDate(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return date_parseDate;
            }
        } else {
            currentToken = jsonParser.getCurrentToken();
        }
        return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, currentToken, jsonParser, (String) null, new Object[0]);
    }

    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.getDoubleValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0.0d;
            }
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseDoublePrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0.0d;
            }
            if (currentTokenId == 7) {
                return jsonParser.getDoubleValue();
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return d_parseDoublePrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).doubleValue();
    }

    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.getFloatValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0.0f;
            }
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseFloatPrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0.0f;
            }
            if (currentTokenId == 7) {
                return jsonParser.getFloatValue();
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return f_parseFloatPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).floatValue();
    }

    public final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.getIntValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseIntPrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0;
            }
            if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "int");
                }
                return jsonParser.getValueAsInt();
            }
            if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0;
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return i_parseIntPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).intValue();
    }

    public final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.getLongValue();
        }
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 3) {
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseLongPrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0L;
            }
            if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "long");
                }
                return jsonParser.getValueAsLong();
            }
            if (currentTokenId == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0L;
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.nextToken();
            long j_parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return j_parseLongPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).longValue();
    }

    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        return _shortOverflow(i_parseIntPrimitive) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, String.valueOf(i_parseIntPrimitive), "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) i_parseIntPrimitive;
    }

    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING) {
            return jsonParser.getText();
        }
        if (currentToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
            String valueAsString = jsonParser.getValueAsString();
            return valueAsString != null ? valueAsString : (String) deserializationContext.handleUnexpectedToken(String.class, jsonParser);
        }
        Object embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject instanceof byte[]) {
            return deserializationContext.getBase64Variant().encode((byte[]) embeddedObject, false);
        }
        if (embeddedObject == null) {
            return null;
        }
        return embeddedObject.toString();
    }

    public void _reportFailedNullCoerce(DeserializationContext deserializationContext, boolean z10, Enum<?> r52, String str) throws MismatchedInputException {
        deserializationContext.reportInputMismatch(this, "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), z10 ? "enable" : "disable", r52.getClass().getSimpleName(), r52.name());
    }

    public final boolean _shortOverflow(int i10) {
        return i10 < -32768 || i10 > 32767;
    }

    public void _verifyEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
    }

    public final void _verifyNullForPrimitive(DeserializationContext deserializationContext) throws MismatchedInputException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
        }
    }

    public final void _verifyNullForPrimitiveCoercion(DeserializationContext deserializationContext, String str) throws MismatchedInputException {
        boolean z10;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!deserializationContext.isEnabled(deserializationFeature2)) {
                return;
            }
            z10 = false;
            deserializationFeature = deserializationFeature2;
        } else {
            z10 = true;
            deserializationFeature = mapperFeature;
        }
        _reportFailedNullCoerce(deserializationContext, z10, deserializationFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    public final void _verifyNullForScalarCoercion(DeserializationContext deserializationContext, String str) throws MismatchedInputException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        _reportFailedNullCoerce(deserializationContext, true, mapperFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    public void _verifyNumberForScalarCoercion(DeserializationContext deserializationContext, JsonParser jsonParser) throws MismatchedInputException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)", jsonParser.getText(), _coercedTypeDesc(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
    }

    public void _verifyStringForScalarCoercion(DeserializationContext deserializationContext, String str) throws MismatchedInputException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)", str, _coercedTypeDesc(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public NullValueProvider findContentNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) throws InvalidDefinitionException {
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        }
        if (nullsFindContentNullStyle != Nulls.FAIL) {
            NullValueProvider nullValueProvider_findNullProvider = _findNullProvider(deserializationContext, beanProperty, nullsFindContentNullStyle, jsonDeserializer);
            return nullValueProvider_findNullProvider != null ? nullValueProvider_findNullProvider : jsonDeserializer;
        }
        if (beanProperty != null) {
            return NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
        }
        JavaType javaTypeConstructType = deserializationContext.constructType(jsonDeserializer.handledType());
        if (javaTypeConstructType.isContainerType()) {
            javaTypeConstructType = javaTypeConstructType.getContentType();
        }
        return NullsFailProvider.constructForRootValue(javaTypeConstructType);
    }

    public Nulls findContentNullStyle(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (beanProperty != null) {
            return beanProperty.getMetadata().getContentNulls();
        }
        return null;
    }

    public JsonDeserializer<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) {
        AnnotatedMember member;
        Object objFindDeserializationContentConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (objFindDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) == null) {
            return jsonDeserializer;
        }
        Converter<Object, Object> converterConverterInstance = deserializationContext.converterInstance(beanProperty.getMember(), objFindDeserializationContentConverter);
        JavaType inputType = converterConverterInstance.getInputType(deserializationContext.getTypeFactory());
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(inputType, beanProperty);
        }
        return new StdDelegatingDeserializer(converterConverterInstance, inputType, jsonDeserializer);
    }

    public JsonDeserializer<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    public Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls) : deserializationContext.getDefaultPropertyFormat(cls);
    }

    public final NullValueProvider findValueNullProvider(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) {
        if (settableBeanProperty != null) {
            return _findNullProvider(deserializationContext, settableBeanProperty, propertyMetadata.getValueNulls(), settableBeanProperty.getValueDeserializer());
        }
        return null;
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this._valueClass;
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (obj == null) {
            obj = handledType();
        }
        if (deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            return;
        }
        jsonParser.skipChildren();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._valueClass;
    }

    public boolean isDefaultDeserializer(JsonDeserializer<?> jsonDeserializer) {
        return ClassUtil.isJacksonStdImpl(jsonDeserializer);
    }

    public boolean isDefaultKeyDeserializer(KeyDeserializer keyDeserializer) {
        return ClassUtil.isJacksonStdImpl(keyDeserializer);
    }

    public final boolean _parseBooleanPrimitive(DeserializationContext deserializationContext, JsonParser jsonParser, Class<?> cls) throws JsonMappingException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            _verifyNullForPrimitive(deserializationContext);
            return false;
        }
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return _parseBooleanFromInt(jsonParser, deserializationContext);
        }
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Boolean) deserializationContext.handleUnexpectedToken(cls, jsonParser)).booleanValue();
            }
            jsonParser.nextToken();
            boolean z_parseBooleanPrimitive = _parseBooleanPrimitive(deserializationContext, jsonParser, cls);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return z_parseBooleanPrimitive;
        }
        String strTrim = jsonParser.getText().trim();
        if ("true".equals(strTrim) || "True".equals(strTrim)) {
            return true;
        }
        if ("false".equals(strTrim) || "False".equals(strTrim)) {
            return false;
        }
        if (_isEmptyOrTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return false;
        }
        return Boolean.TRUE.equals((Boolean) deserializationContext.handleWeirdStringValue(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]));
    }

    public JavaType getValueType(DeserializationContext deserializationContext) {
        JavaType javaType = this._valueType;
        return javaType != null ? javaType : deserializationContext.constructType(this._valueClass);
    }

    public StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
        this._valueType = javaType;
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
        this._valueType = stdDeserializer._valueType;
    }

    public Date _parseDate(String str, DeserializationContext deserializationContext) {
        try {
            if (_isEmptyOrTextualNull(str)) {
                return (Date) getNullValue(deserializationContext);
            }
            return deserializationContext.parseDate(str);
        } catch (IllegalArgumentException e10) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", ClassUtil.exceptionMessage(e10));
        }
    }

    public final double _parseDoublePrimitive(DeserializationContext deserializationContext, String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(str)) {
                    return Double.NaN;
                }
            } else if (_isPosInf(str)) {
                return Double.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(str)) {
            return Double.NEGATIVE_INFINITY;
        }
        try {
            return parseDouble(str);
        } catch (IllegalArgumentException unused) {
            return this._nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid double value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public final float _parseFloatPrimitive(DeserializationContext deserializationContext, String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(str)) {
                    return Float.NaN;
                }
            } else if (_isPosInf(str)) {
                return Float.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(str)) {
            return Float.NEGATIVE_INFINITY;
        }
        try {
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return this._nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid float value", new Object[0])).floatValue();
        }
    }

    public final int _parseIntPrimitive(DeserializationContext deserializationContext, String str) {
        try {
            if (str.length() > 9) {
                long j10 = Long.parseLong(str);
                return _intOverflow(j10) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE)).intValue() : (int) j10;
            }
            return NumberInput.parseInt(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid int value", new Object[0])).intValue();
        }
    }

    public final long _parseLongPrimitive(DeserializationContext deserializationContext, String str) {
        try {
            return NumberInput.parseLong(str);
        } catch (IllegalArgumentException unused) {
            return this._nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid long value", new Object[0])).longValue();
        }
    }
}
