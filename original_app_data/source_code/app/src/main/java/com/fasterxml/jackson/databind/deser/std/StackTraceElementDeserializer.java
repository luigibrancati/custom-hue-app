package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public StackTraceElementDeserializer() {
        super((Class<?>) StackTraceElement.class);
    }

    @Deprecated
    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i10, String str4, String str5) {
        return constructValue(deserializationContext, str, str2, str3, i10, str4, str5, null);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i10, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i10);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != JsonToken.START_OBJECT) {
            if (jsonTokenCurrentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.nextToken();
            StackTraceElement stackTraceElementDeserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return stackTraceElementDeserialize;
        }
        String text = null;
        String text2 = null;
        String text3 = null;
        String text4 = "";
        String text5 = text4;
        String text6 = text5;
        int intValue = -1;
        while (true) {
            JsonToken jsonTokenNextValue = jsonParser.nextValue();
            if (jsonTokenNextValue == JsonToken.END_OBJECT) {
                return constructValue(deserializationContext, text4, text5, text6, intValue, text, text2, text3);
            }
            String currentName = jsonParser.getCurrentName();
            if ("className".equals(currentName)) {
                text4 = jsonParser.getText();
            } else if ("classLoaderName".equals(currentName)) {
                text3 = jsonParser.getText();
            } else if ("fileName".equals(currentName)) {
                text6 = jsonParser.getText();
            } else if ("lineNumber".equals(currentName)) {
                intValue = jsonTokenNextValue.isNumeric() ? jsonParser.getIntValue() : _parseIntPrimitive(jsonParser, deserializationContext);
            } else if ("methodName".equals(currentName)) {
                text5 = jsonParser.getText();
            } else if (!"nativeMethod".equals(currentName)) {
                if ("moduleName".equals(currentName)) {
                    text = jsonParser.getText();
                } else if ("moduleVersion".equals(currentName)) {
                    text2 = jsonParser.getText();
                } else if (!"declaringClass".equals(currentName) && !"format".equals(currentName)) {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, currentName);
                }
            }
            jsonParser.skipChildren();
        }
    }
}
