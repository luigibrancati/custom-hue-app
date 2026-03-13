package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FilteringParserDelegate extends JsonParserDelegate {
    protected boolean _allowMultipleMatches;
    protected JsonToken _currToken;
    protected TokenFilterContext _exposedContext;
    protected TokenFilterContext _headContext;

    @Deprecated
    protected boolean _includeImmediateParent;
    protected boolean _includePath;
    protected TokenFilter _itemFilter;
    protected JsonToken _lastClearedToken;
    protected int _matchCount;
    protected TokenFilter rootFilter;

    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, boolean z10, boolean z11) {
        super(jsonParser);
        this.rootFilter = tokenFilter;
        this._itemFilter = tokenFilter;
        this._headContext = TokenFilterContext.createRootContext(tokenFilter);
        this._includePath = z10;
        this._allowMultipleMatches = z11;
    }

    private JsonToken _nextBuffered(TokenFilterContext tokenFilterContext) throws JsonParseException {
        this._exposedContext = tokenFilterContext;
        JsonToken jsonTokenNextTokenToRead = tokenFilterContext.nextTokenToRead();
        if (jsonTokenNextTokenToRead != null) {
            return jsonTokenNextTokenToRead;
        }
        while (tokenFilterContext != this._headContext) {
            tokenFilterContext = this._exposedContext.findChildOf(tokenFilterContext);
            this._exposedContext = tokenFilterContext;
            if (tokenFilterContext == null) {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
            JsonToken jsonTokenNextTokenToRead2 = tokenFilterContext.nextTokenToRead();
            if (jsonTokenNextTokenToRead2 != null) {
                return jsonTokenNextTokenToRead2;
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean _verifyAllowedMatches() {
        int i10 = this._matchCount;
        if (i10 != 0 && !this._allowMultipleMatches) {
            return false;
        }
        this._matchCount = i10 + 1;
        return true;
    }

    public JsonStreamContext _filterContext() {
        TokenFilterContext tokenFilterContext = this._exposedContext;
        return tokenFilterContext != null ? tokenFilterContext : this._headContext;
    }

    public final JsonToken _nextToken2() {
        TokenFilter tokenFilterCheckValue;
        JsonToken jsonToken_nextTokenWithBuffering;
        JsonToken jsonToken_nextTokenWithBuffering2;
        JsonToken jsonToken_nextTokenWithBuffering3;
        while (true) {
            JsonToken jsonTokenNextToken = this.delegate.nextToken();
            if (jsonTokenNextToken == null) {
                this._currToken = jsonTokenNextToken;
                return jsonTokenNextToken;
            }
            int iId = jsonTokenNextToken.id();
            if (iId != 1) {
                if (iId != 2) {
                    if (iId == 3) {
                        TokenFilter tokenFilter = this._itemFilter;
                        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
                        if (tokenFilter == tokenFilter2) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                            this._currToken = jsonTokenNextToken;
                            return jsonTokenNextToken;
                        }
                        if (tokenFilter == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter tokenFilterCheckValue2 = this._headContext.checkValue(tokenFilter);
                            if (tokenFilterCheckValue2 == null) {
                                this.delegate.skipChildren();
                            } else {
                                if (tokenFilterCheckValue2 != tokenFilter2) {
                                    tokenFilterCheckValue2 = tokenFilterCheckValue2.filterStartArray();
                                }
                                this._itemFilter = tokenFilterCheckValue2;
                                if (tokenFilterCheckValue2 == tokenFilter2) {
                                    this._headContext = this._headContext.createChildArrayContext(tokenFilterCheckValue2, true);
                                    this._currToken = jsonTokenNextToken;
                                    return jsonTokenNextToken;
                                }
                                TokenFilterContext tokenFilterContextCreateChildArrayContext = this._headContext.createChildArrayContext(tokenFilterCheckValue2, false);
                                this._headContext = tokenFilterContextCreateChildArrayContext;
                                if (this._includePath && (jsonToken_nextTokenWithBuffering2 = _nextTokenWithBuffering(tokenFilterContextCreateChildArrayContext)) != null) {
                                    this._currToken = jsonToken_nextTokenWithBuffering2;
                                    return jsonToken_nextTokenWithBuffering2;
                                }
                            }
                        }
                    } else if (iId != 4) {
                        if (iId != 5) {
                            TokenFilter tokenFilter3 = this._itemFilter;
                            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilter3 == tokenFilter4) {
                                this._currToken = jsonTokenNextToken;
                                return jsonTokenNextToken;
                            }
                            if (tokenFilter3 != null && ((tokenFilterCheckValue = this._headContext.checkValue(tokenFilter3)) == tokenFilter4 || (tokenFilterCheckValue != null && tokenFilterCheckValue.includeValue(this.delegate)))) {
                                if (_verifyAllowedMatches()) {
                                    this._currToken = jsonTokenNextToken;
                                    return jsonTokenNextToken;
                                }
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            TokenFilter tokenFilter5 = TokenFilter.INCLUDE_ALL;
                            if (fieldName == tokenFilter5) {
                                this._itemFilter = fieldName;
                                this._currToken = jsonTokenNextToken;
                                return jsonTokenNextToken;
                            }
                            if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                TokenFilter tokenFilterIncludeProperty = fieldName.includeProperty(currentName);
                                if (tokenFilterIncludeProperty == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = tokenFilterIncludeProperty;
                                    if (tokenFilterIncludeProperty == tokenFilter5) {
                                        if (_verifyAllowedMatches() && this._includePath) {
                                            this._currToken = jsonTokenNextToken;
                                            return jsonTokenNextToken;
                                        }
                                    } else if (this._includePath && (jsonToken_nextTokenWithBuffering = _nextTokenWithBuffering(this._headContext)) != null) {
                                        this._currToken = jsonToken_nextTokenWithBuffering;
                                        return jsonToken_nextTokenWithBuffering;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean zIsStartHandled = this._headContext.isStartHandled();
                TokenFilter filter = this._headContext.getFilter();
                if (filter != null && filter != TokenFilter.INCLUDE_ALL) {
                    filter.filterFinishArray();
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (zIsStartHandled) {
                    this._currToken = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
            } else {
                TokenFilter tokenFilter6 = this._itemFilter;
                TokenFilter tokenFilter7 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter6 == tokenFilter7) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter6, true);
                    this._currToken = jsonTokenNextToken;
                    return jsonTokenNextToken;
                }
                if (tokenFilter6 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter tokenFilterCheckValue3 = this._headContext.checkValue(tokenFilter6);
                    if (tokenFilterCheckValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (tokenFilterCheckValue3 != tokenFilter7) {
                            tokenFilterCheckValue3 = tokenFilterCheckValue3.filterStartObject();
                        }
                        this._itemFilter = tokenFilterCheckValue3;
                        if (tokenFilterCheckValue3 == tokenFilter7) {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilterCheckValue3, true);
                            this._currToken = jsonTokenNextToken;
                            return jsonTokenNextToken;
                        }
                        TokenFilterContext tokenFilterContextCreateChildObjectContext = this._headContext.createChildObjectContext(tokenFilterCheckValue3, false);
                        this._headContext = tokenFilterContextCreateChildObjectContext;
                        if (this._includePath && (jsonToken_nextTokenWithBuffering3 = _nextTokenWithBuffering(tokenFilterContextCreateChildObjectContext)) != null) {
                            this._currToken = jsonToken_nextTokenWithBuffering3;
                            return jsonToken_nextTokenWithBuffering3;
                        }
                    }
                }
            }
        }
    }

    public final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenFilterContext) {
        TokenFilter tokenFilterCheckValue;
        while (true) {
            JsonToken jsonTokenNextToken = this.delegate.nextToken();
            if (jsonTokenNextToken == null) {
                return jsonTokenNextToken;
            }
            int iId = jsonTokenNextToken.id();
            boolean z10 = false;
            if (iId != 1) {
                if (iId != 2) {
                    if (iId == 3) {
                        TokenFilter tokenFilterCheckValue2 = this._headContext.checkValue(this._itemFilter);
                        if (tokenFilterCheckValue2 == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
                            if (tokenFilterCheckValue2 != tokenFilter) {
                                tokenFilterCheckValue2 = tokenFilterCheckValue2.filterStartArray();
                            }
                            this._itemFilter = tokenFilterCheckValue2;
                            if (tokenFilterCheckValue2 == tokenFilter) {
                                this._headContext = this._headContext.createChildArrayContext(tokenFilterCheckValue2, true);
                                return _nextBuffered(tokenFilterContext);
                            }
                            this._headContext = this._headContext.createChildArrayContext(tokenFilterCheckValue2, false);
                        }
                    } else if (iId != 4) {
                        if (iId != 5) {
                            TokenFilter tokenFilter2 = this._itemFilter;
                            TokenFilter tokenFilter3 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilter2 == tokenFilter3) {
                                return _nextBuffered(tokenFilterContext);
                            }
                            if (tokenFilter2 != null && ((tokenFilterCheckValue = this._headContext.checkValue(tokenFilter2)) == tokenFilter3 || (tokenFilterCheckValue != null && tokenFilterCheckValue.includeValue(this.delegate)))) {
                                if (_verifyAllowedMatches()) {
                                    return _nextBuffered(tokenFilterContext);
                                }
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                            if (fieldName == tokenFilter4) {
                                this._itemFilter = fieldName;
                                return _nextBuffered(tokenFilterContext);
                            }
                            if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                TokenFilter tokenFilterIncludeProperty = fieldName.includeProperty(currentName);
                                if (tokenFilterIncludeProperty == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = tokenFilterIncludeProperty;
                                    if (tokenFilterIncludeProperty != tokenFilter4) {
                                        continue;
                                    } else {
                                        if (_verifyAllowedMatches()) {
                                            return _nextBuffered(tokenFilterContext);
                                        }
                                        this._itemFilter = this._headContext.setFieldName(currentName);
                                    }
                                }
                            }
                        }
                    }
                }
                TokenFilter filter = this._headContext.getFilter();
                if (filter != null && filter != TokenFilter.INCLUDE_ALL) {
                    filter.filterFinishArray();
                }
                TokenFilterContext tokenFilterContext2 = this._headContext;
                if (tokenFilterContext2 == tokenFilterContext && tokenFilterContext2.isStartHandled()) {
                    z10 = true;
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (z10) {
                    return jsonTokenNextToken;
                }
            } else {
                TokenFilter tokenFilter5 = this._itemFilter;
                TokenFilter tokenFilter6 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter5 == tokenFilter6) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter5, true);
                    return jsonTokenNextToken;
                }
                if (tokenFilter5 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter tokenFilterCheckValue3 = this._headContext.checkValue(tokenFilter5);
                    if (tokenFilterCheckValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (tokenFilterCheckValue3 != tokenFilter6) {
                            tokenFilterCheckValue3 = tokenFilterCheckValue3.filterStartObject();
                        }
                        this._itemFilter = tokenFilterCheckValue3;
                        if (tokenFilterCheckValue3 == tokenFilter6) {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilterCheckValue3, true);
                            return _nextBuffered(tokenFilterContext);
                        }
                        this._headContext = this._headContext.createChildObjectContext(tokenFilterCheckValue3, false);
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() {
        return this.delegate.getBigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.delegate.getBinaryValue(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean getBooleanValue() {
        return this.delegate.getBooleanValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public byte getByteValue() {
        return this.delegate.getByteValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() {
        JsonStreamContext jsonStreamContext_filterContext = _filterContext();
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return jsonStreamContext_filterContext.getCurrentName();
        }
        JsonStreamContext parent = jsonStreamContext_filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() {
        return this.delegate.getDecimalValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() {
        return this.delegate.getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() {
        return this.delegate.getEmbeddedObject();
    }

    public TokenFilter getFilter() {
        return this.rootFilter;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() {
        return this.delegate.getFloatValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getIntValue() {
        return this.delegate.getIntValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getLongValue() {
        return this.delegate.getLongValue();
    }

    public int getMatchCount() {
        return this._matchCount;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() {
        return this.delegate.getNumberType();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() {
        return this.delegate.getNumberValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return _filterContext();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public short getShortValue() {
        return this.delegate.getShortValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getText() {
        return this.delegate.getText();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        return this.delegate.getTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() {
        return this.delegate.getTextLength();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() {
        return this.delegate.getTextOffset();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean() {
        return this.delegate.getValueAsBoolean();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble() {
        return this.delegate.getValueAsDouble();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() {
        return this.delegate.getValueAsInt();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() {
        return this.delegate.getValueAsLong();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        return this.delegate.getValueAsString();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i10) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i10 == 0 : jsonToken.id() == i10;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken nextToken() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken():com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() throws JsonParseException {
        JsonToken jsonTokenNextToken = nextToken();
        return jsonTokenNextToken == JsonToken.FIELD_NAME ? nextToken() : jsonTokenNextToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public void overrideCurrentName(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws JsonParseException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            int i10 = 1;
            while (true) {
                JsonToken jsonTokenNextToken = nextToken();
                if (jsonTokenNextToken == null) {
                    break;
                }
                if (!jsonTokenNextToken.isStructStart()) {
                    if (jsonTokenNextToken.isStructEnd() && i10 - 1 == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean(boolean z10) {
        return this.delegate.getValueAsBoolean(z10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble(double d10) {
        return this.delegate.getValueAsDouble(d10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i10) {
        return this.delegate.getValueAsInt(i10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j10) {
        return this.delegate.getValueAsLong(j10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        return this.delegate.getValueAsString(str);
    }
}
