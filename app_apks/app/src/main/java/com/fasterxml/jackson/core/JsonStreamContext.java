package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonStreamContext {
    protected static final int TYPE_ARRAY = 1;
    protected static final int TYPE_OBJECT = 2;
    protected static final int TYPE_ROOT = 0;
    protected int _index;
    protected int _type;

    public JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i10 = this._index;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public JsonLocation getStartLocation(Object obj) {
        return JsonLocation.NA;
    }

    @Deprecated
    public final String getTypeDesc() {
        int i10 = this._type;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "OBJECT" : "ARRAY" : "ROOT";
    }

    public boolean hasCurrentIndex() {
        return this._index >= 0;
    }

    public boolean hasCurrentName() {
        return getCurrentName() != null;
    }

    public boolean hasPathSegment() {
        int i10 = this._type;
        if (i10 == 2) {
            return hasCurrentName();
        }
        if (i10 == 1) {
            return hasCurrentIndex();
        }
        return false;
    }

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public JsonPointer pathAsPointer() {
        return JsonPointer.forPath(this, false);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this._type;
        if (i10 == 0) {
            sb2.append("/");
        } else if (i10 != 1) {
            sb2.append('{');
            String currentName = getCurrentName();
            if (currentName != null) {
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                CharTypes.appendQuoted(sb2, currentName);
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else {
            sb2.append('[');
            sb2.append(getCurrentIndex());
            sb2.append(']');
        }
        return sb2.toString();
    }

    public String typeDesc() {
        int i10 = this._type;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "Object" : "Array" : "root";
    }

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public JsonPointer pathAsPointer(boolean z10) {
        return JsonPointer.forPath(this, z10);
    }

    public JsonStreamContext(int i10, int i11) {
        this._type = i10;
        this._index = i11;
    }

    public void setCurrentValue(Object obj) {
    }
}
