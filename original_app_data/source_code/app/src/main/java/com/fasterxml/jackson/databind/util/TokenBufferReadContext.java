package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.json.JsonReadContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class TokenBufferReadContext extends JsonStreamContext {
    protected String _currentName;
    protected Object _currentValue;
    protected final JsonStreamContext _parent;
    protected final JsonLocation _startLocation;

    public TokenBufferReadContext(JsonStreamContext jsonStreamContext, Object obj) {
        super(jsonStreamContext);
        this._parent = jsonStreamContext.getParent();
        this._currentName = jsonStreamContext.getCurrentName();
        this._currentValue = jsonStreamContext.getCurrentValue();
        if (jsonStreamContext instanceof JsonReadContext) {
            this._startLocation = ((JsonReadContext) jsonStreamContext).getStartLocation(obj);
        } else {
            this._startLocation = JsonLocation.NA;
        }
    }

    public static TokenBufferReadContext createRootContext(JsonStreamContext jsonStreamContext) {
        return jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, (JsonLocation) null);
    }

    public TokenBufferReadContext createChildArrayContext() {
        this._index++;
        return new TokenBufferReadContext(this, 1, -1);
    }

    public TokenBufferReadContext createChildObjectContext() {
        this._index++;
        return new TokenBufferReadContext(this, 2, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String getCurrentName() {
        return this._currentName;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this._currentValue;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public JsonStreamContext getParent() {
        return this._parent;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public boolean hasCurrentName() {
        return this._currentName != null;
    }

    public TokenBufferReadContext parentOrCopy() {
        JsonStreamContext jsonStreamContext = this._parent;
        return jsonStreamContext instanceof TokenBufferReadContext ? (TokenBufferReadContext) jsonStreamContext : jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, this._startLocation);
    }

    public void setCurrentName(String str) {
        this._currentName = str;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public void updateForValue() {
        this._index++;
    }

    public TokenBufferReadContext(JsonStreamContext jsonStreamContext, JsonLocation jsonLocation) {
        super(jsonStreamContext);
        this._parent = jsonStreamContext.getParent();
        this._currentName = jsonStreamContext.getCurrentName();
        this._currentValue = jsonStreamContext.getCurrentValue();
        this._startLocation = jsonLocation;
    }

    public TokenBufferReadContext() {
        super(0, -1);
        this._parent = null;
        this._startLocation = JsonLocation.NA;
    }

    public TokenBufferReadContext(TokenBufferReadContext tokenBufferReadContext, int i10, int i11) {
        super(i10, i11);
        this._parent = tokenBufferReadContext;
        this._startLocation = tokenBufferReadContext._startLocation;
    }
}
