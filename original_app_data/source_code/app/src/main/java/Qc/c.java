package Qc;

import Ic.j;
import dd.InterfaceC3913r;
import gc.C4204q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;
import td.EnumC5882e;
import uc.AbstractC6017a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14263a = new c();

    public final qd.f a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            AbstractC4862t.d(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            kd.b bVarA = Rc.d.a(cls);
            Kc.c cVar = Kc.c.f7792a;
            kd.c cVarB = bVarA.b();
            AbstractC4862t.d(cVarB, "javaClassId.asSingleFqName()");
            kd.b bVarM = cVar.m(cVarB);
            if (bVarM != null) {
                bVarA = bVarM;
            }
            return new qd.f(bVarA, i10);
        }
        if (AbstractC4862t.a(cls, Void.TYPE)) {
            kd.b bVarM2 = kd.b.m(j.a.f5791f.l());
            AbstractC4862t.d(bVarM2, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new qd.f(bVarM2, i10);
        }
        Ic.h hVarS = EnumC5882e.j(cls.getName()).s();
        AbstractC4862t.d(hVarS, "get(currentClass.name).primitiveType");
        if (i10 > 0) {
            kd.b bVarM3 = kd.b.m(hVarS.b());
            AbstractC4862t.d(bVarM3, "topLevel(primitiveType.arrayTypeFqName)");
            return new qd.f(bVarM3, i10 - 1);
        }
        kd.b bVarM4 = kd.b.m(hVarS.p());
        AbstractC4862t.d(bVarM4, "topLevel(primitiveType.typeFqName)");
        return new qd.f(bVarM4, i10);
    }

    public final void b(Class klass, InterfaceC3913r.c visitor) throws InvocationTargetException {
        AbstractC4862t.e(klass, "klass");
        AbstractC4862t.e(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        AbstractC4862t.d(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            AbstractC4862t.d(annotation, "annotation");
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void c(Class cls, InterfaceC3913r.d dVar) throws InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i10;
        int i11;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        AbstractC4862t.d(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i12 = 0;
        while (i12 < length) {
            Constructor<?> constructor = declaredConstructors[i12];
            kd.f fVar = kd.h.f39575j;
            m mVar = m.f14277a;
            AbstractC4862t.d(constructor, "constructor");
            InterfaceC3913r.e eVarA = dVar.a(fVar, mVar.a(constructor));
            if (eVarA == null) {
                constructorArr = declaredConstructors;
                i10 = length;
                i11 = i12;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                AbstractC4862t.d(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    AbstractC4862t.d(annotation, "annotation");
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                AbstractC4862t.d(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        Annotation[] annotations = parameterAnnotations[i13];
                        AbstractC4862t.d(annotations, "annotations");
                        int length4 = annotations.length;
                        int i14 = 0;
                        while (i14 < length4) {
                            Annotation annotation2 = annotations[i14];
                            Class clsB = AbstractC6017a.b(AbstractC6017a.a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i15 = length;
                            kd.b bVarA = Rc.d.a(clsB);
                            int i16 = i12;
                            AbstractC4862t.d(annotation2, "annotation");
                            InterfaceC3913r.a aVarB = eVarA.b(i13 + length2, bVarA, new b(annotation2));
                            if (aVarB != null) {
                                f14263a.h(aVarB, annotation2, clsB);
                            }
                            i14++;
                            declaredConstructors = constructorArr2;
                            length = i15;
                            i12 = i16;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i10 = length;
                i11 = i12;
                eVarA.a();
            }
            i12 = i11 + 1;
            declaredConstructors = constructorArr;
            length = i10;
        }
    }

    public final void d(Class cls, InterfaceC3913r.d dVar) throws InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC4862t.d(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            kd.f fVarS = kd.f.s(field.getName());
            AbstractC4862t.d(fVarS, "identifier(field.name)");
            m mVar = m.f14277a;
            AbstractC4862t.d(field, "field");
            InterfaceC3913r.c cVarB = dVar.b(fVarS, mVar.b(field), null);
            if (cVarB != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                AbstractC4862t.d(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    AbstractC4862t.d(annotation, "annotation");
                    f(cVarB, annotation);
                }
                cVarB.a();
            }
        }
    }

    public final void e(Class cls, InterfaceC3913r.d dVar) throws InvocationTargetException {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC4862t.d(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = declaredMethods[i10];
            kd.f fVarS = kd.f.s(method.getName());
            AbstractC4862t.d(fVarS, "identifier(method.name)");
            m mVar = m.f14277a;
            AbstractC4862t.d(method, "method");
            InterfaceC3913r.e eVarA = dVar.a(fVarS, mVar.c(method));
            if (eVarA == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                AbstractC4862t.d(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    AbstractC4862t.d(annotation, "annotation");
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                AbstractC4862t.d(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    Annotation[] annotations = annotationArr[i11];
                    AbstractC4862t.d(annotations, "annotations");
                    int length3 = annotations.length;
                    int i12 = 0;
                    while (i12 < length3) {
                        Annotation annotation2 = annotations[i12];
                        Class clsB = AbstractC6017a.b(AbstractC6017a.a(annotation2));
                        kd.b bVarA = Rc.d.a(clsB);
                        Method[] methodArr2 = declaredMethods;
                        AbstractC4862t.d(annotation2, "annotation");
                        InterfaceC3913r.a aVarB = eVarA.b(i11, bVarA, new b(annotation2));
                        if (aVarB != null) {
                            f14263a.h(aVarB, annotation2, clsB);
                        }
                        i12++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                eVarA.a();
            }
            i10++;
            declaredMethods = methodArr;
        }
    }

    public final void f(InterfaceC3913r.c cVar, Annotation annotation) throws InvocationTargetException {
        Class clsB = AbstractC6017a.b(AbstractC6017a.a(annotation));
        InterfaceC3913r.a aVarC = cVar.c(Rc.d.a(clsB), new b(annotation));
        if (aVarC != null) {
            f14263a.h(aVarC, annotation, clsB);
        }
    }

    public final void g(InterfaceC3913r.a aVar, kd.f fVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (AbstractC4862t.a(enclosingClass, Class.class)) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.e(fVar, a((Class) obj));
            return;
        }
        if (i.f14270a.contains(enclosingClass)) {
            aVar.f(fVar, obj);
            return;
        }
        if (Rc.d.h(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            AbstractC4862t.d(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            kd.b bVarA = Rc.d.a(enclosingClass);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            kd.f fVarS = kd.f.s(((Enum) obj).name());
            AbstractC4862t.d(fVarS, "identifier((value as Enum<*>).name)");
            aVar.d(fVar, bVarA, fVarS);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            AbstractC4862t.d(interfaces, "clazz.interfaces");
            Class annotationClass = (Class) C4204q.y0(interfaces);
            AbstractC4862t.d(annotationClass, "annotationClass");
            InterfaceC3913r.a aVarC = aVar.c(fVar, Rc.d.a(annotationClass));
            if (aVarC == null) {
                return;
            }
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarC, (Annotation) obj, annotationClass);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        InterfaceC3913r.b bVarB = aVar.b(fVar);
        if (bVarB == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            AbstractC4862t.d(componentType, "componentType");
            kd.b bVarA2 = Rc.d.a(componentType);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                kd.f fVarS2 = kd.f.s(((Enum) obj2).name());
                AbstractC4862t.d(fVarS2, "identifier((element as Enum<*>).name)");
                bVarB.c(bVarA2, fVarS2);
                i10++;
            }
        } else if (AbstractC4862t.a(componentType, Class.class)) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                AbstractC4862t.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarB.b(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                AbstractC4862t.d(componentType, "componentType");
                InterfaceC3913r.a aVarE = bVarB.e(Rc.d.a(componentType));
                if (aVarE != null) {
                    AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarE, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                bVarB.d(objArr4[i10]);
                i10++;
            }
        }
        bVarB.a();
    }

    public final void h(InterfaceC3913r.a aVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC4862t.d(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                AbstractC4862t.b(objInvoke);
                kd.f fVarS = kd.f.s(method.getName());
                AbstractC4862t.d(fVarS, "identifier(method.name)");
                g(aVar, fVarS, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void i(Class klass, InterfaceC3913r.d memberVisitor) throws InvocationTargetException {
        AbstractC4862t.e(klass, "klass");
        AbstractC4862t.e(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
