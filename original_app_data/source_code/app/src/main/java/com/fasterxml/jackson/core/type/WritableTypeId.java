package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class WritableTypeId {
    public String asProperty;
    public Object extra;
    public Object forValue;
    public Class<?> forValueType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public Object f28898id;
    public Inclusion include;
    public JsonToken valueShape;
    public boolean wrapperWritten;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId() {
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, (Object) null);
    }

    public WritableTypeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        this(obj, jsonToken, (Object) null);
        this.forValueType = cls;
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.forValue = obj;
        this.f28898id = obj2;
        this.valueShape = jsonToken;
    }
}
