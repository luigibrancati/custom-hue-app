package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeBase extends JavaType implements JsonSerializable {
    private static final TypeBindings NO_BINDINGS = TypeBindings.emptyBindings();
    private static final JavaType[] NO_TYPES = new JavaType[0];
    private static final long serialVersionUID = 1;
    protected final TypeBindings _bindings;
    volatile transient String _canonicalName;
    protected final JavaType _superClass;
    protected final JavaType[] _superInterfaces;

    public TypeBase(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, i10, obj, obj2, z10);
        this._bindings = typeBindings == null ? NO_BINDINGS : typeBindings;
        this._superClass = javaType;
        this._superInterfaces = javaTypeArr;
    }

    public static JavaType _bogusSuperClass(Class<?> cls) {
        if (cls.getSuperclass() == null) {
            return null;
        }
        return TypeFactory.unknownType();
    }

    public static StringBuilder _classSignature(Class<?> cls, StringBuilder sb2, boolean z10) {
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if (cCharAt == '.') {
                    cCharAt = JsonPointer.SEPARATOR;
                }
                sb2.append(cCharAt);
            }
            if (z10) {
                sb2.append(';');
            }
            return sb2;
        }
        if (cls == Boolean.TYPE) {
            sb2.append('Z');
            return sb2;
        }
        if (cls == Byte.TYPE) {
            sb2.append('B');
            return sb2;
        }
        if (cls == Short.TYPE) {
            sb2.append('S');
            return sb2;
        }
        if (cls == Character.TYPE) {
            sb2.append('C');
            return sb2;
        }
        if (cls == Integer.TYPE) {
            sb2.append('I');
            return sb2;
        }
        if (cls == Long.TYPE) {
            sb2.append('J');
            return sb2;
        }
        if (cls == Float.TYPE) {
            sb2.append('F');
            return sb2;
        }
        if (cls == Double.TYPE) {
            sb2.append('D');
            return sb2;
        }
        if (cls == Void.TYPE) {
            sb2.append('V');
            return sb2;
        }
        throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
    }

    public String buildCanonicalName() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public int containedTypeCount() {
        return this._bindings.size();
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    @Deprecated
    public String containedTypeName(int i10) {
        return this._bindings.getBoundName(i10);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType findSuperType(Class<?> cls) {
        JavaType javaTypeFindSuperType;
        JavaType[] javaTypeArr;
        if (cls == this._class) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this._superInterfaces) != null) {
            int length = javaTypeArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                JavaType javaTypeFindSuperType2 = this._superInterfaces[i10].findSuperType(cls);
                if (javaTypeFindSuperType2 != null) {
                    return javaTypeFindSuperType2;
                }
            }
        }
        JavaType javaType = this._superClass;
        if (javaType == null || (javaTypeFindSuperType = javaType.findSuperType(cls)) == null) {
            return null;
        }
        return javaTypeFindSuperType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType[] findTypeParameters(Class<?> cls) {
        JavaType javaTypeFindSuperType = findSuperType(cls);
        return javaTypeFindSuperType == null ? NO_TYPES : javaTypeFindSuperType.getBindings().typeParameterArray();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public TypeBindings getBindings() {
        return this._bindings;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public abstract StringBuilder getErasedSignature(StringBuilder sb2);

    @Override // com.fasterxml.jackson.databind.JavaType
    public abstract StringBuilder getGenericSignature(StringBuilder sb2);

    @Override // com.fasterxml.jackson.databind.JavaType
    public List<JavaType> getInterfaces() {
        JavaType[] javaTypeArr = this._superInterfaces;
        if (javaTypeArr == null) {
            return Collections.EMPTY_LIST;
        }
        int length = javaTypeArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(javaTypeArr) : Collections.singletonList(javaTypeArr[0]) : Collections.EMPTY_LIST;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType getSuperClass() {
        return this._superClass;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(toCanonical());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeId = new WritableTypeId(this, JsonToken.VALUE_STRING);
        typeSerializer.writeTypePrefix(jsonGenerator, writableTypeId);
        serialize(jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId);
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public String toCanonical() {
        String str = this._canonicalName;
        return str == null ? buildCanonicalName() : str;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType containedType(int i10) {
        return this._bindings.getBoundType(i10);
    }

    public TypeBase(TypeBase typeBase) {
        super(typeBase);
        this._superClass = typeBase._superClass;
        this._superInterfaces = typeBase._superInterfaces;
        this._bindings = typeBase._bindings;
    }
}
