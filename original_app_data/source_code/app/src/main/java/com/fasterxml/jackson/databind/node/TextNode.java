package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    private static final long serialVersionUID = 2;
    protected final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    @Deprecated
    public static void appendQuoted(StringBuilder sb2, String str) {
        sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        CharTypes.appendQuoted(sb2, str);
        sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? EMPTY_STRING_NODE : new TextNode(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z10) {
        String str = this._value;
        if (str != null) {
            String strTrim = str.trim();
            if ("true".equals(strTrim)) {
                return true;
            }
            if ("false".equals(strTrim)) {
                return false;
            }
        }
        return z10;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d10) {
        return NumberInput.parseAsDouble(this._value, d10);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i10) {
        return NumberInput.parseAsInt(this._value, i10);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j10) {
        return NumberInput.parseAsLong(this._value, j10);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws InvalidFormatException {
        String strTrim = this._value.trim();
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(((strTrim.length() * 3) >> 2) + 4);
        try {
            base64Variant.decode(strTrim, byteArrayBuilder);
            return byteArrayBuilder.toByteArray();
        } catch (IllegalArgumentException e10) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e10.getMessage()), strTrim, byte[].class);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = this._value;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String textValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        String str2 = this._value;
        return str2 == null ? str : str2;
    }
}
