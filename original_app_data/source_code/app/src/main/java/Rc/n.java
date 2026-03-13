package Rc;

import Rc.z;
import bd.InterfaceC2909a;
import bd.InterfaceC2917i;
import bd.InterfaceC2918j;
import gc.C4206t;
import gc.C4207u;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends z implements InterfaceC2918j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f15092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2917i f15093c;

    public n(Type reflectType) {
        InterfaceC2917i lVar;
        AbstractC4862t.e(reflectType, "reflectType");
        this.f15092b = reflectType;
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            lVar = new l((Class) typeQ);
        } else if (typeQ instanceof TypeVariable) {
            lVar = new A((TypeVariable) typeQ);
        } else {
            if (!(typeQ instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeQ.getClass() + "): " + typeQ);
            }
            Type rawType = ((ParameterizedType) typeQ).getRawType();
            AbstractC4862t.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            lVar = new l((Class) rawType);
        }
        this.f15093c = lVar;
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return false;
    }

    @Override // bd.InterfaceC2918j
    public String E() {
        return Q().toString();
    }

    @Override // bd.InterfaceC2918j
    public String H() {
        throw new UnsupportedOperationException("Type not found: " + Q());
    }

    @Override // Rc.z
    public Type Q() {
        return this.f15092b;
    }

    @Override // bd.InterfaceC2918j
    public InterfaceC2917i a() {
        return this.f15093c;
    }

    @Override // bd.InterfaceC2912d
    public Collection getAnnotations() {
        return C4206t.k();
    }

    @Override // Rc.z, bd.InterfaceC2912d
    public InterfaceC2909a j(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return null;
    }

    @Override // bd.InterfaceC2918j
    public boolean s() {
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeQ).getTypeParameters();
            AbstractC4862t.d(typeParameters, "getTypeParameters()");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // bd.InterfaceC2918j
    public List z() {
        List listD = d.d(Q());
        z.a aVar = z.f15104a;
        ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }
}
