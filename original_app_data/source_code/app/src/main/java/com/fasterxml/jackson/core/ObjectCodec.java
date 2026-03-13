package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectCodec extends TreeCodec implements Versioned {
    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract TreeNode createArrayNode();

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract TreeNode createObjectNode();

    public JsonFactory getFactory() {
        return getJsonFactory();
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract <T extends TreeNode> T readTree(JsonParser jsonParser);

    public abstract <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType);

    public abstract <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference);

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls);

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract JsonParser treeAsTokens(TreeNode treeNode);

    public abstract <T> T treeToValue(TreeNode treeNode, Class<T> cls);

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract Version version();

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode);

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj);
}
