package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode implements JsonNodeCreator {
    private static final long serialVersionUID = 1;
    protected final JsonNodeFactory _nodeFactory;

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract JsonToken asToken();

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract JsonNode get(int i10);

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract JsonNode get(String str);

    public JsonNode missingNode() {
        return this._nodeFactory.missingNode();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode pojoNode(Object obj) {
        return this._nodeFactory.pojoNode(obj);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode rawValueNode(RawValue rawValue) {
        return this._nodeFactory.rawValueNode(rawValue);
    }

    public abstract T removeAll();

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract int size();

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ArrayNode arrayNode(int i10) {
        return this._nodeFactory.arrayNode(i10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final BooleanNode booleanNode(boolean z10) {
        return this._nodeFactory.booleanNode(z10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final TextNode textNode(String str) {
        return this._nodeFactory.textNode(str);
    }

    public ContainerNode() {
        this._nodeFactory = null;
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final BinaryNode binaryNode(byte[] bArr) {
        return this._nodeFactory.binaryNode(bArr);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final BinaryNode binaryNode(byte[] bArr, int i10, int i11) {
        return this._nodeFactory.binaryNode(bArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(byte b10) {
        return this._nodeFactory.numberNode(b10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(short s10) {
        return this._nodeFactory.numberNode(s10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(int i10) {
        return this._nodeFactory.numberNode(i10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(long j10) {
        return this._nodeFactory.numberNode(j10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(float f10) {
        return this._nodeFactory.numberNode(f10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(double d10) {
        return this._nodeFactory.numberNode(d10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(BigInteger bigInteger) {
        return this._nodeFactory.numberNode(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(BigDecimal bigDecimal) {
        return this._nodeFactory.numberNode(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Byte b10) {
        return this._nodeFactory.numberNode(b10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Short sh) {
        return this._nodeFactory.numberNode(sh);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Integer num) {
        return this._nodeFactory.numberNode(num);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Long l10) {
        return this._nodeFactory.numberNode(l10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Float f10) {
        return this._nodeFactory.numberNode(f10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Double d10) {
        return this._nodeFactory.numberNode(d10);
    }
}
