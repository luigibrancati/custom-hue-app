package com.fasterxml.jackson.databind;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class RuntimeJsonMappingException extends RuntimeException {
    public RuntimeJsonMappingException(JsonMappingException jsonMappingException) {
        super(jsonMappingException);
    }

    public RuntimeJsonMappingException(String str) {
        super(str);
    }

    public RuntimeJsonMappingException(String str, JsonMappingException jsonMappingException) {
        super(str, jsonMappingException);
    }
}
