package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.NumberInput;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class JsonPointer {
    protected static final JsonPointer EMPTY = new JsonPointer();
    public static final char SEPARATOR = '/';
    protected final String _asString;
    protected volatile JsonPointer _head;
    protected final int _matchingElementIndex;
    protected final String _matchingPropertyName;
    protected final JsonPointer _nextSegment;

    public JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = "";
        this._matchingElementIndex = -1;
        this._asString = "";
    }

    private static void _appendEscape(StringBuilder sb2, char c10) {
        if (c10 == '0') {
            c10 = '~';
        } else if (c10 == '1') {
            c10 = SEPARATOR;
        } else {
            sb2.append('~');
        }
        sb2.append(c10);
    }

    private static void _appendEscaped(StringBuilder sb2, String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/') {
                sb2.append("~1");
            } else if (cCharAt == '~') {
                sb2.append("~0");
            } else {
                sb2.append(cCharAt);
            }
        }
    }

    private static String _fullPath(JsonPointer jsonPointer, String str) {
        if (jsonPointer == null) {
            StringBuilder sb2 = new StringBuilder(str.length() + 1);
            sb2.append(SEPARATOR);
            _appendEscaped(sb2, str);
            return sb2.toString();
        }
        String str2 = jsonPointer._asString;
        StringBuilder sb3 = new StringBuilder(str.length() + 1 + str2.length());
        sb3.append(SEPARATOR);
        _appendEscaped(sb3, str);
        sb3.append(str2);
        return sb3.toString();
    }

    private static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            return (length == 1 && cCharAt == '0') ? 0 : -1;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i10 = 1; i10 < length; i10++) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || NumberInput.parseLong(str) <= 2147483647L) {
            return NumberInput.parseInt(str);
        }
        return -1;
    }

    public static JsonPointer _parseQuotedTail(String str, int i10) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(Math.max(16, length));
        if (i10 > 2) {
            sb2.append((CharSequence) str, 1, i10 - 1);
        }
        int i11 = i10 + 1;
        _appendEscape(sb2, str.charAt(i10));
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '/') {
                return new JsonPointer(str, sb2.toString(), _parseTail(str.substring(i11)));
            }
            int i12 = i11 + 1;
            if (cCharAt != '~' || i12 >= length) {
                sb2.append(cCharAt);
                i11 = i12;
            } else {
                i11 += 2;
                _appendEscape(sb2, str.charAt(i12));
            }
        }
        return new JsonPointer(str, sb2.toString(), EMPTY);
    }

    public static JsonPointer _parseTail(String str) {
        int length = str.length();
        int i10 = 1;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/') {
                return new JsonPointer(str, str.substring(1, i10), _parseTail(str.substring(i10)));
            }
            i10++;
            if (cCharAt == '~' && i10 < length) {
                return _parseQuotedTail(str, i10);
            }
        }
        return new JsonPointer(str, str.substring(1), EMPTY);
    }

    public static JsonPointer compile(String str) {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) == '/') {
            return _parseTail(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public static JsonPointer empty() {
        return EMPTY;
    }

    public static JsonPointer forPath(JsonStreamContext jsonStreamContext, boolean z10) {
        if (jsonStreamContext == null) {
            return EMPTY;
        }
        if (!jsonStreamContext.hasPathSegment() && (!z10 || !jsonStreamContext.inRoot() || !jsonStreamContext.hasCurrentIndex())) {
            jsonStreamContext = jsonStreamContext.getParent();
        }
        JsonPointer jsonPointer = null;
        while (jsonStreamContext != null) {
            if (jsonStreamContext.inObject()) {
                String currentName = jsonStreamContext.getCurrentName();
                if (currentName == null) {
                    currentName = "";
                }
                jsonPointer = new JsonPointer(_fullPath(jsonPointer, currentName), currentName, jsonPointer);
            } else if (jsonStreamContext.inArray() || z10) {
                int currentIndex = jsonStreamContext.getCurrentIndex();
                String strValueOf = String.valueOf(currentIndex);
                jsonPointer = new JsonPointer(_fullPath(jsonPointer, strValueOf), strValueOf, currentIndex, jsonPointer);
            }
            jsonStreamContext = jsonStreamContext.getParent();
        }
        return jsonPointer == null ? EMPTY : jsonPointer;
    }

    public static JsonPointer valueOf(String str) {
        return compile(str);
    }

    public JsonPointer _constructHead() {
        JsonPointer jsonPointerLast = last();
        if (jsonPointerLast == this) {
            return EMPTY;
        }
        int length = jsonPointerLast._asString.length();
        JsonPointer jsonPointer = this._nextSegment;
        String str = this._asString;
        return new JsonPointer(str.substring(0, str.length() - length), this._matchingPropertyName, this._matchingElementIndex, jsonPointer._constructHead(length, jsonPointerLast));
    }

    public JsonPointer append(JsonPointer jsonPointer) {
        JsonPointer jsonPointer2 = EMPTY;
        if (this == jsonPointer2) {
            return jsonPointer;
        }
        if (jsonPointer == jsonPointer2) {
            return this;
        }
        String strSubstring = this._asString;
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        return compile(strSubstring + jsonPointer._asString);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof JsonPointer)) {
            return this._asString.equals(((JsonPointer) obj)._asString);
        }
        return false;
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int hashCode() {
        return this._asString.hashCode();
    }

    public JsonPointer head() {
        JsonPointer jsonPointer_constructHead = this._head;
        if (jsonPointer_constructHead == null) {
            if (this != EMPTY) {
                jsonPointer_constructHead = _constructHead();
            }
            this._head = jsonPointer_constructHead;
        }
        return jsonPointer_constructHead;
    }

    public JsonPointer last() {
        if (this == EMPTY) {
            return null;
        }
        while (true) {
            JsonPointer jsonPointer = this._nextSegment;
            if (jsonPointer == EMPTY) {
                return this;
            }
            this = jsonPointer;
        }
    }

    public JsonPointer matchElement(int i10) {
        if (i10 != this._matchingElementIndex || i10 < 0) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public boolean matches() {
        return this._nextSegment == null;
    }

    public boolean matchesElement(int i10) {
        return i10 == this._matchingElementIndex && i10 >= 0;
    }

    public boolean matchesProperty(String str) {
        return this._nextSegment != null && this._matchingPropertyName.equals(str);
    }

    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    public boolean mayMatchProperty() {
        return this._matchingPropertyName != null;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public String toString() {
        return this._asString;
    }

    public JsonPointer(String str, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    public JsonPointer _constructHead(int i10, JsonPointer jsonPointer) {
        if (this == jsonPointer) {
            return EMPTY;
        }
        JsonPointer jsonPointer2 = this._nextSegment;
        String str = this._asString;
        return new JsonPointer(str.substring(0, str.length() - i10), this._matchingPropertyName, this._matchingElementIndex, jsonPointer2._constructHead(i10, jsonPointer));
    }

    public JsonPointer(String str, String str2, int i10, JsonPointer jsonPointer) {
        this._asString = str;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i10;
    }
}
