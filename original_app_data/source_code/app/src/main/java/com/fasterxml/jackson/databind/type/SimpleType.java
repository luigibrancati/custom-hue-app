package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SimpleType extends TypeBase {
    private static final long serialVersionUID = 1;

    public SimpleType(Class<?> cls) {
        this(cls, TypeBindings.emptyBindings(), null, null);
    }

    private static JavaType _buildSuperClass(Class<?> cls, TypeBindings typeBindings) {
        if (cls == null) {
            return null;
        }
        return cls == Object.class ? TypeFactory.unknownType() : new SimpleType(cls, typeBindings, _buildSuperClass(cls.getSuperclass(), typeBindings), null, null, null, false);
    }

    @Deprecated
    public static SimpleType construct(Class<?> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Map (class: " + cls.getName() + ")");
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Collection (class: " + cls.getName() + ")");
        }
        if (!cls.isArray()) {
            TypeBindings typeBindingsEmptyBindings = TypeBindings.emptyBindings();
            return new SimpleType(cls, typeBindingsEmptyBindings, _buildSuperClass(cls.getSuperclass(), typeBindingsEmptyBindings), null, null, null, false);
        }
        throw new IllegalArgumentException("Cannot construct SimpleType for an array (class: " + cls.getName() + ")");
    }

    public static SimpleType constructUnsafe(Class<?> cls) {
        return new SimpleType(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls2 == cls) {
            return this;
        }
        if (!cls2.isAssignableFrom(cls)) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Class<?> cls3 = this._class;
        if (superclass == cls3) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        if (superclass != null && cls3.isAssignableFrom(superclass)) {
            return new SimpleType(cls, this._bindings, _narrow(superclass), null, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            Class<?> cls4 = interfaces[i10];
            Class<?> cls5 = this._class;
            if (cls4 == cls5) {
                TypeBindings typeBindings = this._bindings;
                JavaType[] javaTypeArr = new JavaType[1];
                javaTypeArr[z10 ? 1 : 0] = this;
                return new SimpleType(cls, typeBindings, null, javaTypeArr, this._valueHandler, this._typeHandler, this._asStatic);
            }
            boolean z11 = z10;
            if (cls5.isAssignableFrom(cls4)) {
                return new SimpleType(cls, this._bindings, null, new JavaType[]{_narrow(cls4)}, this._valueHandler, this._typeHandler, this._asStatic);
            }
            i10++;
            z10 = z11;
        }
        throw new IllegalArgumentException("Internal error: Cannot resolve sub-type for Class " + cls.getName() + " to " + this._class.getName());
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this._class.getName());
        int size = this._bindings.size();
        if (size > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < size; i10++) {
                JavaType javaTypeContainedType = containedType(i10);
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(javaTypeContainedType.toCanonical());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        return TypeBase._classSignature(this._class, sb2, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        TypeBase._classSignature(this._class, sb2, false);
        int size = this._bindings.size();
        if (size > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < size; i10++) {
                sb2 = containedType(i10).getGenericSignature(sb2);
            }
            sb2.append('>');
        }
        sb2.append(';');
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasContentType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(buildCanonicalName());
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withTypeHandler(Object obj) {
        return this._typeHandler == obj ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    public SimpleType(TypeBase typeBase) {
        super(typeBase);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z10) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z10);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, typeBindings, javaType, javaTypeArr, i10, obj, obj2, z10);
    }
}
