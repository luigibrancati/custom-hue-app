package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface TreeNode {
    JsonToken asToken();

    TreeNode at(JsonPointer jsonPointer);

    TreeNode at(String str);

    Iterator<String> fieldNames();

    TreeNode get(int i10);

    TreeNode get(String str);

    boolean isArray();

    boolean isContainerNode();

    boolean isMissingNode();

    boolean isObject();

    boolean isValueNode();

    JsonParser.NumberType numberType();

    TreeNode path(int i10);

    TreeNode path(String str);

    int size();

    JsonParser traverse();

    JsonParser traverse(ObjectCodec objectCodec);
}
