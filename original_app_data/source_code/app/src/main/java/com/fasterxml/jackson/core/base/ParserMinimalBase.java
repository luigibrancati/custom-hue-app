package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class ParserMinimalBase extends JsonParser {
    protected static final BigDecimal BD_MAX_INT;
    protected static final BigDecimal BD_MAX_LONG;
    protected static final BigDecimal BD_MIN_INT;
    protected static final BigDecimal BD_MIN_LONG;
    protected static final BigInteger BI_MAX_INT;
    protected static final BigInteger BI_MAX_LONG;
    protected static final BigInteger BI_MIN_INT;
    protected static final BigInteger BI_MIN_LONG;
    protected static final char CHAR_NULL = 0;
    protected static final int INT_0 = 48;
    protected static final int INT_9 = 57;
    protected static final int INT_APOS = 39;
    protected static final int INT_ASTERISK = 42;
    protected static final int INT_BACKSLASH = 92;
    protected static final int INT_COLON = 58;
    protected static final int INT_COMMA = 44;
    protected static final int INT_CR = 13;
    protected static final int INT_E = 69;
    protected static final int INT_HASH = 35;
    protected static final int INT_LBRACKET = 91;
    protected static final int INT_LCURLY = 123;
    protected static final int INT_LF = 10;
    protected static final int INT_MINUS = 45;
    protected static final int INT_PERIOD = 46;
    protected static final int INT_PLUS = 43;
    protected static final int INT_QUOTE = 34;
    protected static final int INT_RBRACKET = 93;
    protected static final int INT_RCURLY = 125;
    protected static final int INT_SLASH = 47;
    protected static final int INT_SPACE = 32;
    protected static final int INT_TAB = 9;
    protected static final int INT_e = 101;
    protected static final int MAX_ERROR_TOKEN_LENGTH = 256;
    protected static final double MAX_INT_D = 2.147483647E9d;
    protected static final long MAX_INT_L = 2147483647L;
    protected static final double MAX_LONG_D = 9.223372036854776E18d;
    protected static final double MIN_INT_D = -2.147483648E9d;
    protected static final long MIN_INT_L = -2147483648L;
    protected static final double MIN_LONG_D = -9.223372036854776E18d;
    protected static final byte[] NO_BYTES = new byte[0];
    protected static final int[] NO_INTS = new int[0];
    protected static final int NR_BIGDECIMAL = 16;
    protected static final int NR_BIGINT = 4;
    protected static final int NR_DOUBLE = 8;
    protected static final int NR_FLOAT = 32;
    protected static final int NR_INT = 1;
    protected static final int NR_LONG = 2;
    protected static final int NR_UNKNOWN = 0;
    protected JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(MIN_INT_L);
        BI_MIN_INT = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(MAX_INT_L);
        BI_MAX_INT = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        BI_MAX_LONG = bigIntegerValueOf4;
        BD_MIN_LONG = new BigDecimal(bigIntegerValueOf3);
        BD_MAX_LONG = new BigDecimal(bigIntegerValueOf4);
        BD_MIN_INT = new BigDecimal(bigIntegerValueOf);
        BD_MAX_INT = new BigDecimal(bigIntegerValueOf2);
    }

    public ParserMinimalBase() {
    }

    @Deprecated
    public static String _ascii(byte[] bArr) {
        try {
            return new String(bArr, "US-ASCII");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Deprecated
    public static byte[] _asciiBytes(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static final String _getCharDesc(int i10) {
        char c10 = (char) i10;
        if (Character.isISOControl(c10)) {
            return "(CTRL-CHAR, code " + i10 + ")";
        }
        if (i10 <= 255) {
            return "'" + c10 + "' (code " + i10 + ")";
        }
        return "'" + c10 + "' (code " + i10 + " / 0x" + Integer.toHexString(i10) + ")";
    }

    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e10) {
            _reportError(e10.getMessage());
        }
    }

    public abstract void _handleEOF();

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public String _longIntegerDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public String _longNumberDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final void _reportError(String str) {
        throw _constructError(str);
    }

    public void _reportInputCoercion(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    public void _reportInvalidEOF() {
        _reportInvalidEOF(" in " + this._currToken, this._currToken);
    }

    public void _reportInvalidEOFInValue(JsonToken jsonToken) {
        _reportInvalidEOF(jsonToken == JsonToken.VALUE_STRING ? " in a String value" : (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value", jsonToken);
    }

    public void _reportMissingRootWS(int i10) {
        _reportUnexpectedChar(i10, "Expected space separating root-level values");
    }

    public void _reportUnexpectedChar(int i10, String str) {
        if (i10 < 0) {
            _reportInvalidEOF();
        }
        String str2 = String.format("Unexpected character (%s)", _getCharDesc(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public void _throwInvalidSpace(int i10) {
        _reportError("Illegal character (" + _getCharDesc((char) i10) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public final void _wrapError(String str, Throwable th) throws JsonParseException {
        throw _constructError(str, th);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getCurrentName();

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonStreamContext getParsingContext();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getText();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract char[] getTextCharacters();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int getTextLength();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int getTextOffset();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean(boolean z10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            switch (jsonToken.id()) {
                case 6:
                    String strTrim = getText().trim();
                    if ("true".equals(strTrim)) {
                        return true;
                    }
                    if ("false".equals(strTrim) || _hasTextualNull(strTrim)) {
                        return false;
                    }
                    break;
                case 7:
                    return getIntValue() != 0;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Boolean) {
                        return ((Boolean) embeddedObject).booleanValue();
                    }
                    break;
            }
        }
        return z10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble(double d10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            switch (jsonToken.id()) {
                case 6:
                    String text = getText();
                    if (_hasTextualNull(text)) {
                        return 0.0d;
                    }
                    return NumberInput.parseAsDouble(text, d10);
                case 7:
                case 8:
                    return getDoubleValue();
                case 9:
                    return 1.0d;
                case 10:
                case 11:
                    return 0.0d;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).doubleValue();
                    }
                default:
                    return d10;
            }
        }
        return d10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getIntValue() : getValueAsInt(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getLongValue() : getValueAsLong(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        return getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean hasTextCharacters();

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i10) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i10 == 0 : jsonToken.id() == i10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean isClosed();

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonToken nextToken();

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() {
        JsonToken jsonTokenNextToken = nextToken();
        return jsonTokenNextToken == JsonToken.FIELD_NAME ? nextToken() : jsonTokenNextToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract void overrideCurrentName(String str);

    public void reportInvalidNumber(String str) {
        _reportError("Invalid numeric value: " + str);
    }

    public void reportOverflowInt() throws InputCoercionException {
        reportOverflowInt(getText());
    }

    public void reportOverflowLong() throws InputCoercionException {
        reportOverflowLong(getText());
    }

    public void reportUnexpectedNumberChar(int i10, String str) {
        String str2 = String.format("Unexpected character (%s) in numeric value", _getCharDesc(i10));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i10 = 1;
            while (true) {
                JsonToken jsonTokenNextToken = nextToken();
                if (jsonTokenNextToken == null) {
                    _handleEOF();
                    return this;
                }
                if (jsonTokenNextToken.isStructStart()) {
                    i10++;
                } else if (jsonTokenNextToken.isStructEnd()) {
                    i10--;
                    if (i10 == 0) {
                        break;
                    }
                } else if (jsonTokenNextToken == JsonToken.NOT_AVAILABLE) {
                    _reportError("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                }
            }
        }
        return this;
    }

    public ParserMinimalBase(int i10) {
        super(i10);
    }

    public final void _reportError(String str, Object obj) {
        throw _constructError(String.format(str, obj));
    }

    public void _reportInvalidEOF(String str, JsonToken jsonToken) {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? getText() : jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }

    public void reportOverflowInt(String str) throws InputCoercionException {
        reportOverflowInt(str, currentToken());
    }

    public void reportOverflowLong(String str) throws InputCoercionException {
        reportOverflowLong(str, currentToken());
    }

    public final void _reportError(String str, Object obj, Object obj2) {
        throw _constructError(String.format(str, obj, obj2));
    }

    @Deprecated
    public void _reportInvalidEOF(String str) throws JsonEOFException {
        throw new JsonEOFException(this, null, "Unexpected end-of-input" + str);
    }

    public void reportOverflowInt(String str, JsonToken jsonToken) throws InputCoercionException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of int (%d - %s)", _longIntegerDesc(str), Integer.MIN_VALUE, Integer.MAX_VALUE), jsonToken, Integer.TYPE);
    }

    public void reportOverflowLong(String str, JsonToken jsonToken) throws InputCoercionException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of long (%d - %s)", _longIntegerDesc(str), Long.MIN_VALUE, Long.MAX_VALUE), jsonToken, Long.TYPE);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken != null) {
            int iId = jsonToken.id();
            if (iId != 6) {
                switch (iId) {
                    case 9:
                        return 1;
                    case 10:
                    case 11:
                        return 0;
                    case 12:
                        Object embeddedObject = getEmbeddedObject();
                        if (embeddedObject instanceof Number) {
                            return ((Number) embeddedObject).intValue();
                        }
                    default:
                        return i10;
                }
            } else {
                String text = getText();
                if (_hasTextualNull(text)) {
                    return 0;
                }
                return NumberInput.parseAsInt(text, i10);
            }
        }
        return i10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken != null) {
            int iId = jsonToken.id();
            if (iId != 6) {
                switch (iId) {
                    case 9:
                        return 1L;
                    case 10:
                    case 11:
                        return 0L;
                    case 12:
                        Object embeddedObject = getEmbeddedObject();
                        if (embeddedObject instanceof Number) {
                            return ((Number) embeddedObject).longValue();
                        }
                    default:
                        return j10;
                }
            } else {
                String text = getText();
                if (_hasTextualNull(text)) {
                    return 0L;
                }
                return NumberInput.parseAsLong(text, j10);
            }
        }
        return j10;
    }

    @Deprecated
    public void _reportInvalidEOFInValue() throws JsonEOFException {
        _reportInvalidEOF(" in a value");
    }
}
