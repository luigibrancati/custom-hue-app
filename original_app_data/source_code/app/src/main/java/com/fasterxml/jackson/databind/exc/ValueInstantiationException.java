package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ValueInstantiationException extends JsonMappingException {
    protected final JavaType _type;

    public ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        super(jsonParser, str, th);
        this._type = javaType;
    }

    public static ValueInstantiationException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new ValueInstantiationException(jsonParser, str, javaType);
    }

    public JavaType getType() {
        return this._type;
    }

    public static ValueInstantiationException from(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        return new ValueInstantiationException(jsonParser, str, javaType, th);
    }

    public ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
    }
}
