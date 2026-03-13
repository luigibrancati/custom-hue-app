package Rc;

import Rc.z;
import bd.InterfaceC2910b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends t implements bd.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f15098a;

    public u(Method member) {
        AbstractC4862t.e(member, "member");
        this.f15098a = member;
    }

    @Override // bd.r
    public boolean M() {
        return n() != null;
    }

    @Override // Rc.t
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Method R() {
        return this.f15098a;
    }

    @Override // bd.r
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public z getReturnType() {
        z.a aVar = z.f15104a;
        Type genericReturnType = R().getGenericReturnType();
        AbstractC4862t.d(genericReturnType, "member.genericReturnType");
        return aVar.a(genericReturnType);
    }

    @Override // bd.z
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = R().getTypeParameters();
        AbstractC4862t.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new A(typeVariable));
        }
        return arrayList;
    }

    @Override // bd.r
    public List i() {
        Type[] genericParameterTypes = R().getGenericParameterTypes();
        AbstractC4862t.d(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = R().getParameterAnnotations();
        AbstractC4862t.d(parameterAnnotations, "member.parameterAnnotations");
        return S(genericParameterTypes, parameterAnnotations, R().isVarArgs());
    }

    @Override // bd.r
    public InterfaceC2910b n() {
        Object defaultValue = R().getDefaultValue();
        if (defaultValue != null) {
            return f.f15074b.a(defaultValue, null);
        }
        return null;
    }
}
