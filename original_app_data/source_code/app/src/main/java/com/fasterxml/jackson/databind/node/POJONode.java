package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class POJONode extends ValueNode {
    private static final long serialVersionUID = 2;
    protected final Object _value;

    public POJONode(Object obj) {
        this._value = obj;
    }

    public boolean _pojoEquals(POJONode pOJONode) {
        Object obj = this._value;
        return obj == null ? pOJONode._value == null : obj.equals(pOJONode._value);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z10) {
        Object obj = this._value;
        return (obj == null || !(obj instanceof Boolean)) ? z10 : ((Boolean) obj).booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d10) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d10;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i10) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).intValue() : i10;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j10) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).longValue() : j10;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        Object obj = this._value;
        return obj == null ? "null" : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() {
        Object obj = this._value;
        return obj instanceof byte[] ? (byte[]) obj : super.binaryValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof POJONode)) {
            return _pojoEquals((POJONode) obj);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    public Object getPojo() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj = this._value;
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).serialize(jsonGenerator, serializerProvider);
        } else {
            serializerProvider.defaultSerializeValue(obj, jsonGenerator);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        Object obj = this._value;
        return obj == null ? str : obj.toString();
    }
}
