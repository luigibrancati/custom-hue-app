package Cc;

import fc.C4033p;
import gc.C4207u;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f1247a;

    public v(q typeParameter) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        this.f1247a = typeParameter;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return AbstractC4862t.a(getName(), typeVariable.getName()) && AbstractC4862t.a(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f1247a.getUpperBounds();
        ArrayList arrayList = new ArrayList(C4207u.v(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(w.c((p) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new C4033p("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f1247a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f1247a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getGenericDeclaration().hashCode() ^ getName().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
