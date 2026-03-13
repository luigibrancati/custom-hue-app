package Rc;

import Lc.m0;
import Lc.n0;
import bd.InterfaceC2909a;
import gc.C4179C;
import gc.C4204q;
import gc.C4206t;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends p implements h, v, bd.q {
    @Override // bd.InterfaceC2912d
    public boolean D() {
        return false;
    }

    @Override // bd.s
    public boolean P() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // bd.q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public l O() {
        Class<?> declaringClass = R().getDeclaringClass();
        AbstractC4862t.d(declaringClass, "member.declaringClass");
        return new l(declaringClass);
    }

    public abstract Member R();

    public final List S(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, InvocationTargetException {
        String str;
        AbstractC4862t.e(parameterTypes, "parameterTypes");
        AbstractC4862t.e(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List listB = C2115c.f15063a.b(R());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            z zVarA = z.f15104a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) C4179C.k0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + zVarA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new B(zVarA, parameterAnnotations[i10], str, z10 && i10 == C4204q.a0(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && AbstractC4862t.a(R(), ((t) obj).R());
    }

    @Override // bd.InterfaceC2912d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Rc.v
    public int getModifiers() {
        return R().getModifiers();
    }

    @Override // bd.t
    public kd.f getName() {
        String name = R().getName();
        kd.f fVarS = name != null ? kd.f.s(name) : null;
        return fVarS == null ? kd.h.f39567b : fVarS;
    }

    @Override // bd.s
    public n0 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? m0.h.f8766c : Modifier.isPrivate(modifiers) ? m0.e.f8763c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? Pc.c.f13293c : Pc.b.f13292c : Pc.a.f13291c;
    }

    public int hashCode() {
        return R().hashCode();
    }

    @Override // bd.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // bd.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // bd.InterfaceC2912d
    public /* bridge */ /* synthetic */ InterfaceC2909a j(kd.c cVar) {
        return j(cVar);
    }

    @Override // Rc.h
    public AnnotatedElement r() {
        Member memberR = R();
        AbstractC4862t.c(memberR, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberR;
    }

    public String toString() {
        return getClass().getName() + ": " + R();
    }

    @Override // Rc.h, bd.InterfaceC2912d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementR = r();
        return (annotatedElementR == null || (declaredAnnotations = annotatedElementR.getDeclaredAnnotations()) == null || (listB = i.b(declaredAnnotations)) == null) ? C4206t.k() : listB;
    }

    @Override // Rc.h, bd.InterfaceC2912d
    public e j(kd.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC4862t.e(fqName, "fqName");
        AnnotatedElement annotatedElementR = r();
        if (annotatedElementR == null || (declaredAnnotations = annotatedElementR.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, fqName);
    }
}
