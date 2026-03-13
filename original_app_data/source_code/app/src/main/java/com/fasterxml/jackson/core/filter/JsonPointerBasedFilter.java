package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonPointer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class JsonPointerBasedFilter extends TokenFilter {
    protected final JsonPointer _pathToMatch;

    public JsonPointerBasedFilter(String str) {
        this(JsonPointer.compile(str));
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public boolean _includeScalar() {
        return this._pathToMatch.matches();
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeElement(int i10) {
        JsonPointer jsonPointerMatchElement = this._pathToMatch.matchElement(i10);
        if (jsonPointerMatchElement == null) {
            return null;
        }
        return jsonPointerMatchElement.matches() ? TokenFilter.INCLUDE_ALL : new JsonPointerBasedFilter(jsonPointerMatchElement);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeProperty(String str) {
        JsonPointer jsonPointerMatchProperty = this._pathToMatch.matchProperty(str);
        if (jsonPointerMatchProperty == null) {
            return null;
        }
        return jsonPointerMatchProperty.matches() ? TokenFilter.INCLUDE_ALL : new JsonPointerBasedFilter(jsonPointerMatchProperty);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public String toString() {
        return "[JsonPointerFilter at: " + this._pathToMatch + "]";
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer) {
        this._pathToMatch = jsonPointer;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter filterStartArray() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter filterStartObject() {
        return this;
    }
}
