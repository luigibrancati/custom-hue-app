package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface JsonNumberFormatVisitor extends JsonValueFormatVisitor {
    void numberType(JsonParser.NumberType numberType);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Base extends JsonValueFormatVisitor.Base implements JsonNumberFormatVisitor {
        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor
        public void numberType(JsonParser.NumberType numberType) {
        }
    }
}
