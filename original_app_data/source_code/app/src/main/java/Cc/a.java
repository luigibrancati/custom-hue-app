package Cc;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f1237a;

    public a(Type elementType) {
        AbstractC4862t.e(elementType, "elementType");
        this.f1237a = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC4862t.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f1237a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return w.h(this.f1237a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
