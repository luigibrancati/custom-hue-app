package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class TokenFilter {
    public static final TokenFilter INCLUDE_ALL = new TokenFilter();

    public boolean _includeScalar() {
        return true;
    }

    public boolean includeBinary() {
        return _includeScalar();
    }

    public boolean includeBoolean(boolean z10) {
        return _includeScalar();
    }

    public boolean includeEmbeddedValue(Object obj) {
        return _includeScalar();
    }

    public boolean includeNull() {
        return _includeScalar();
    }

    public boolean includeNumber(int i10) {
        return _includeScalar();
    }

    public boolean includeRawValue() {
        return _includeScalar();
    }

    public boolean includeString(String str) {
        return _includeScalar();
    }

    public boolean includeValue(JsonParser jsonParser) {
        return _includeScalar();
    }

    public String toString() {
        return this == INCLUDE_ALL ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }

    public boolean includeNumber(long j10) {
        return _includeScalar();
    }

    public boolean includeString(Reader reader, int i10) {
        return _includeScalar();
    }

    public boolean includeNumber(float f10) {
        return _includeScalar();
    }

    public boolean includeNumber(double d10) {
        return _includeScalar();
    }

    public boolean includeNumber(BigDecimal bigDecimal) {
        return _includeScalar();
    }

    public boolean includeNumber(BigInteger bigInteger) {
        return _includeScalar();
    }

    public void filterFinishArray() {
    }

    public void filterFinishObject() {
    }

    public TokenFilter filterStartArray() {
        return this;
    }

    public TokenFilter filterStartObject() {
        return this;
    }

    public TokenFilter includeElement(int i10) {
        return this;
    }

    public TokenFilter includeProperty(String str) {
        return this;
    }

    public TokenFilter includeRootValue(int i10) {
        return this;
    }
}
