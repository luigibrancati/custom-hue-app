package Rc;

import bd.InterfaceC2909a;
import gc.C4179C;
import gc.C4206t;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A extends p implements h, bd.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f15045a;

    public A(TypeVariable typeVariable) {
        AbstractC4862t.e(typeVariable, "typeVariable");
        this.f15045a = typeVariable;
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return false;
    }

    @Override // bd.y
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f15045a.getBounds();
        AbstractC4862t.d(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new n(type));
        }
        n nVar = (n) C4179C.H0(arrayList);
        return AbstractC4862t.a(nVar != null ? nVar.Q() : null, Object.class) ? C4206t.k() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && AbstractC4862t.a(this.f15045a, ((A) obj).f15045a);
    }

    @Override // bd.InterfaceC2912d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // bd.t
    public kd.f getName() {
        kd.f fVarS = kd.f.s(this.f15045a.getName());
        AbstractC4862t.d(fVarS, "identifier(typeVariable.name)");
        return fVarS;
    }

    public int hashCode() {
        return this.f15045a.hashCode();
    }

    @Override // bd.InterfaceC2912d
    public /* bridge */ /* synthetic */ InterfaceC2909a j(kd.c cVar) {
        return j(cVar);
    }

    @Override // Rc.h
    public AnnotatedElement r() {
        TypeVariable typeVariable = this.f15045a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public String toString() {
        return A.class.getName() + ": " + this.f15045a;
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
