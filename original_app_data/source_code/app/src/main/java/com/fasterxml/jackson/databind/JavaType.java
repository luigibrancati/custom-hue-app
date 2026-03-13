package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JavaType extends ResolvedType implements Serializable, Type {
    private static final long serialVersionUID = 1;
    protected final boolean _asStatic;
    protected final Class<?> _class;
    protected final int _hash;
    protected final Object _typeHandler;
    protected final Object _valueHandler;

    public JavaType(Class<?> cls, int i10, Object obj, Object obj2, boolean z10) {
        this._class = cls;
        this._hash = cls.getName().hashCode() + i10;
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z10;
    }

    @Deprecated
    public abstract JavaType _narrow(Class<?> cls);

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public abstract JavaType containedType(int i10);

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public abstract int containedTypeCount();

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    @Deprecated
    public abstract String containedTypeName(int i10);

    public JavaType containedTypeOrUnknown(int i10) {
        JavaType javaTypeContainedType = containedType(i10);
        return javaTypeContainedType == null ? TypeFactory.unknownType() : javaTypeContainedType;
    }

    public abstract boolean equals(Object obj);

    public abstract JavaType findSuperType(Class<?> cls);

    public abstract JavaType[] findTypeParameters(Class<?> cls);

    @Deprecated
    public JavaType forcedNarrowBy(Class<?> cls) {
        return cls == this._class ? this : _narrow(cls);
    }

    public abstract TypeBindings getBindings();

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getContentType() {
        return null;
    }

    public Object getContentTypeHandler() {
        return null;
    }

    public Object getContentValueHandler() {
        return null;
    }

    public String getErasedSignature() {
        StringBuilder sb2 = new StringBuilder(40);
        getErasedSignature(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder getErasedSignature(StringBuilder sb2);

    public String getGenericSignature() {
        StringBuilder sb2 = new StringBuilder(40);
        getGenericSignature(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder getGenericSignature(StringBuilder sb2);

    public abstract List<JavaType> getInterfaces();

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getKeyType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final Class<?> getRawClass() {
        return this._class;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getReferencedType() {
        return null;
    }

    public abstract JavaType getSuperClass();

    public <T> T getTypeHandler() {
        return (T) this._typeHandler;
    }

    public <T> T getValueHandler() {
        return (T) this._valueHandler;
    }

    public boolean hasContentType() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean hasGenericTypes() {
        return containedTypeCount() > 0;
    }

    public boolean hasHandlers() {
        return (this._typeHandler == null && this._valueHandler == null) ? false : true;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final boolean hasRawClass(Class<?> cls) {
        return this._class == cls;
    }

    public boolean hasValueHandler() {
        return this._valueHandler != null;
    }

    public final int hashCode() {
        return this._hash;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean isArrayType() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean isCollectionLikeType() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean isConcrete() {
        if ((this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public abstract boolean isContainerType();

    public final boolean isEnumImplType() {
        return ClassUtil.isEnumType(this._class) && this._class != Enum.class;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final boolean isEnumType() {
        return ClassUtil.isEnumType(this._class);
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final boolean isInterface() {
        return this._class.isInterface();
    }

    public final boolean isJavaLangObject() {
        return this._class == Object.class;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean isMapLikeType() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    public final boolean isTypeOrSubTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean isTypeOrSuperTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract String toString();

    public final boolean useStaticType() {
        return this._asStatic;
    }

    public abstract JavaType withContentType(JavaType javaType);

    public abstract JavaType withContentTypeHandler(Object obj);

    public abstract JavaType withContentValueHandler(Object obj);

    public JavaType withHandlersFrom(JavaType javaType) {
        Object typeHandler = javaType.getTypeHandler();
        JavaType javaTypeWithTypeHandler = typeHandler != this._typeHandler ? withTypeHandler(typeHandler) : this;
        Object valueHandler = javaType.getValueHandler();
        return valueHandler != this._valueHandler ? javaTypeWithTypeHandler.withValueHandler(valueHandler) : javaTypeWithTypeHandler;
    }

    public abstract JavaType withStaticTyping();

    public abstract JavaType withTypeHandler(Object obj);

    public abstract JavaType withValueHandler(Object obj);

    public JavaType(JavaType javaType) {
        this._class = javaType._class;
        this._hash = javaType._hash;
        this._valueHandler = javaType._valueHandler;
        this._typeHandler = javaType._typeHandler;
        this._asStatic = javaType._asStatic;
    }
}
