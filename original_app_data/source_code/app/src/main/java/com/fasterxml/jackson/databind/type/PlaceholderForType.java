package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class PlaceholderForType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected JavaType _actualType;
    protected final int _ordinal;

    public PlaceholderForType(int i10) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), null, 1, null, null, false);
        this._ordinal = i10;
    }

    private <T> T _unsupported() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return (JavaType) _unsupported();
    }

    public JavaType actualType() {
        return this._actualType;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        return toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        sb2.append('$');
        sb2.append(this._ordinal + 1);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        return getErasedSignature(sb2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) _unsupported();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return (JavaType) _unsupported();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        return (JavaType) _unsupported();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    public void actualType(JavaType javaType) {
        this._actualType = javaType;
    }
}
