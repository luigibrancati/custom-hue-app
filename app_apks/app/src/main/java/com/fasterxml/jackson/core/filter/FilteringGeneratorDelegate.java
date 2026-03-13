package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FilteringGeneratorDelegate extends JsonGeneratorDelegate {
    protected boolean _allowMultipleMatches;
    protected TokenFilterContext _filterContext;

    @Deprecated
    protected boolean _includeImmediateParent;
    protected boolean _includePath;
    protected TokenFilter _itemFilter;
    protected int _matchCount;
    protected TokenFilter rootFilter;

    public FilteringGeneratorDelegate(JsonGenerator jsonGenerator, TokenFilter tokenFilter, boolean z10, boolean z11) {
        super(jsonGenerator, false);
        this.rootFilter = tokenFilter;
        this._itemFilter = tokenFilter;
        this._filterContext = TokenFilterContext.createRootContext(tokenFilter);
        this._includePath = z10;
        this._allowMultipleMatches = z11;
    }

    public boolean _checkBinaryWrite() {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return false;
        }
        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
            return true;
        }
        if (!tokenFilter.includeBinary()) {
            return false;
        }
        _checkParentPath();
        return true;
    }

    public void _checkParentPath() {
        this._matchCount++;
        if (this._includePath) {
            this._filterContext.writePath(this.delegate);
        }
        if (this._allowMultipleMatches) {
            return;
        }
        this._filterContext.skipParentChecks();
    }

    public void _checkPropertyParentPath() {
        this._matchCount++;
        if (this._includePath) {
            this._filterContext.writePath(this.delegate);
        } else if (this._includeImmediateParent) {
            this._filterContext.writeImmediatePath(this.delegate);
        }
        if (this._allowMultipleMatches) {
            return;
        }
        this._filterContext.skipParentChecks();
    }

    public boolean _checkRawValueWrite() {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return false;
        }
        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
            return true;
        }
        if (!tokenFilter.includeRawValue()) {
            return false;
        }
        _checkParentPath();
        return true;
    }

    public TokenFilter getFilter() {
        return this.rootFilter;
    }

    public JsonStreamContext getFilterContext() {
        return this._filterContext;
    }

    public int getMatchCount() {
        return this._matchCount;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext getOutputContext() {
        return this._filterContext;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) {
        if (_checkBinaryWrite()) {
            this.delegate.writeBinary(base64Variant, bArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeBoolean(z10)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeBoolean(z10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() {
        TokenFilterContext tokenFilterContextCloseArray = this._filterContext.closeArray(this.delegate);
        this._filterContext = tokenFilterContextCloseArray;
        if (tokenFilterContextCloseArray != null) {
            this._itemFilter = tokenFilterContextCloseArray.getFilter();
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() {
        TokenFilterContext tokenFilterContextCloseObject = this._filterContext.closeObject(this.delegate);
        this._filterContext = tokenFilterContextCloseObject;
        if (tokenFilterContextCloseObject != null) {
            this._itemFilter = tokenFilterContextCloseObject.getFilter();
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldId(long j10) {
        writeFieldName(Long.toString(j10));
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) {
        TokenFilter fieldName = this._filterContext.setFieldName(str);
        if (fieldName == null) {
            this._itemFilter = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
        if (fieldName == tokenFilter) {
            this._itemFilter = fieldName;
            this.delegate.writeFieldName(str);
            return;
        }
        TokenFilter tokenFilterIncludeProperty = fieldName.includeProperty(str);
        this._itemFilter = tokenFilterIncludeProperty;
        if (tokenFilterIncludeProperty == tokenFilter) {
            _checkPropertyParentPath();
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNull()) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNull();
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNumber((int) s10)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(s10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectId(Object obj) throws JsonGenerationException {
        if (this._itemFilter != null) {
            this.delegate.writeObjectId(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectRef(Object obj) throws JsonGenerationException {
        if (this._itemFilter != null) {
            this.delegate.writeObjectRef(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeOmittedField(String str) {
        if (this._itemFilter != null) {
            this.delegate.writeOmittedField(str);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawUTF8String(bArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawValue(str);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray();
            return;
        }
        TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = tokenFilterCheckValue;
        if (tokenFilterCheckValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            this._itemFilter = tokenFilterCheckValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 != tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
            return;
        }
        _checkParentPath();
        this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
        this.delegate.writeStartArray();
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, true);
            this.delegate.writeStartObject();
            return;
        }
        TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
        if (tokenFilterCheckValue == null) {
            return;
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            tokenFilterCheckValue = tokenFilterCheckValue.filterStartObject();
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilterCheckValue, false);
            return;
        }
        _checkParentPath();
        this._filterContext = this._filterContext.createChildObjectContext(tokenFilterCheckValue, true);
        this.delegate.writeStartObject();
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeString(str)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeString(str);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeTypeId(Object obj) throws JsonGenerationException {
        if (this._itemFilter != null) {
            this.delegate.writeTypeId(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i10, int i11) {
        if (_checkRawValueWrite()) {
            this.delegate.writeUTF8String(bArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) {
        if (_checkBinaryWrite()) {
            return this.delegate.writeBinary(base64Variant, inputStream, i10);
        }
        return -1;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i10, int i11) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(str, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str, int i10, int i11) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawValue(str, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(char[] cArr, int i10, int i11) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRawValue(cArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNumber(i10)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(i10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i10, int i11) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(cArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i10, int i11) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            String str = new String(cArr, i10, i11);
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(this._itemFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeString(str)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeString(cArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) {
        TokenFilter fieldName = this._filterContext.setFieldName(serializableString.getValue());
        if (fieldName == null) {
            this._itemFilter = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
        if (fieldName == tokenFilter) {
            this._itemFilter = fieldName;
            this.delegate.writeFieldName(serializableString);
            return;
        }
        TokenFilter tokenFilterIncludeProperty = fieldName.includeProperty(serializableString.getValue());
        this._itemFilter = tokenFilterIncludeProperty;
        if (tokenFilterIncludeProperty == tokenFilter) {
            _checkPropertyParentPath();
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) {
        if (_checkRawValueWrite()) {
            this.delegate.writeRaw(c10);
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, true);
            this.delegate.writeStartObject(obj);
            return;
        }
        TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
        if (tokenFilterCheckValue == null) {
            return;
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            tokenFilterCheckValue = tokenFilterCheckValue.filterStartObject();
        }
        if (tokenFilterCheckValue == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilterCheckValue, true);
            this.delegate.writeStartObject(obj);
            return;
        }
        this._filterContext = this._filterContext.createChildObjectContext(tokenFilterCheckValue, false);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNumber(j10)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(j10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(int i10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray(i10);
            return;
        }
        TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = tokenFilterCheckValue;
        if (tokenFilterCheckValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            this._itemFilter = tokenFilterCheckValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
            this.delegate.writeStartArray(i10);
            return;
        }
        this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeString(serializableString.getValue())) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeString(serializableString);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNumber(bigInteger)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(bigInteger);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeString(reader, i10)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeString(reader, i10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilter, true);
            this.delegate.writeStartObject(obj, i10);
            return;
        }
        TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
        if (tokenFilterCheckValue == null) {
            return;
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            tokenFilterCheckValue = tokenFilterCheckValue.filterStartObject();
        }
        if (tokenFilterCheckValue == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildObjectContext(tokenFilterCheckValue, true);
            this.delegate.writeStartObject(obj, i10);
            return;
        }
        this._filterContext = this._filterContext.createChildObjectContext(tokenFilterCheckValue, false);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNumber(d10)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(d10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray(obj);
            return;
        }
        TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = tokenFilterCheckValue;
        if (tokenFilterCheckValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            this._itemFilter = tokenFilterCheckValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
            this.delegate.writeStartArray(obj);
            return;
        }
        this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNumber(f10)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(f10);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeNumber(bigDecimal)) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(bigDecimal);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i10) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter == tokenFilter2) {
            this._filterContext = this._filterContext.createChildArrayContext(tokenFilter, true);
            this.delegate.writeStartArray(obj, i10);
            return;
        }
        TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
        this._itemFilter = tokenFilterCheckValue;
        if (tokenFilterCheckValue == null) {
            this._filterContext = this._filterContext.createChildArrayContext(null, false);
            return;
        }
        if (tokenFilterCheckValue != tokenFilter2) {
            this._itemFilter = tokenFilterCheckValue.filterStartArray();
        }
        TokenFilter tokenFilter3 = this._itemFilter;
        if (tokenFilter3 == tokenFilter2) {
            _checkParentPath();
            this._filterContext = this._filterContext.createChildArrayContext(this._itemFilter, true);
            this.delegate.writeStartArray(obj, i10);
            return;
        }
        this._filterContext = this._filterContext.createChildArrayContext(tokenFilter3, false);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeRawValue()) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(str);
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(char[] cArr, int i10, int i11) {
        TokenFilter tokenFilter = this._itemFilter;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterCheckValue = this._filterContext.checkValue(tokenFilter);
            if (tokenFilterCheckValue == null) {
                return;
            }
            if (tokenFilterCheckValue != tokenFilter2 && !tokenFilterCheckValue.includeRawValue()) {
                return;
            } else {
                _checkParentPath();
            }
        }
        this.delegate.writeNumber(cArr, i10, i11);
    }
}
