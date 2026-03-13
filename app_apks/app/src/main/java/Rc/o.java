package Rc;

import bd.InterfaceC2919k;
import gc.C4202o;
import gc.C4206t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends t implements InterfaceC2919k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f15094a;

    public o(Constructor member) {
        AbstractC4862t.e(member, "member");
        this.f15094a = member;
    }

    @Override // Rc.t
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Constructor R() {
        return this.f15094a;
    }

    @Override // bd.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = R().getTypeParameters();
        AbstractC4862t.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new A(typeVariable));
        }
        return arrayList;
    }

    @Override // bd.InterfaceC2919k
    public List i() {
        Type[] realTypes = R().getGenericParameterTypes();
        AbstractC4862t.d(realTypes, "types");
        if (realTypes.length == 0) {
            return C4206t.k();
        }
        Class declaringClass = R().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            realTypes = (Type[]) C4202o.u(realTypes, 1, realTypes.length);
        }
        Annotation[][] realAnnotations = R().getParameterAnnotations();
        if (realAnnotations.length < realTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + R());
        }
        if (realAnnotations.length > realTypes.length) {
            AbstractC4862t.d(realAnnotations, "annotations");
            realAnnotations = (Annotation[][]) C4202o.u(realAnnotations, realAnnotations.length - realTypes.length, realAnnotations.length);
        }
        AbstractC4862t.d(realTypes, "realTypes");
        AbstractC4862t.d(realAnnotations, "realAnnotations");
        return S(realTypes, realAnnotations, R().isVarArgs());
    }
}
