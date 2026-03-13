package Rc;

import Rc.f;
import bd.InterfaceC2909a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;
import uc.AbstractC6017a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends p implements InterfaceC2909a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f15073a;

    public e(Annotation annotation) {
        AbstractC4862t.e(annotation, "annotation");
        this.f15073a = annotation;
    }

    @Override // bd.InterfaceC2909a
    public boolean G() {
        return false;
    }

    public final Annotation Q() {
        return this.f15073a;
    }

    @Override // bd.InterfaceC2909a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public l t() {
        return new l(AbstractC6017a.b(AbstractC6017a.a(this.f15073a)));
    }

    @Override // bd.InterfaceC2909a
    public Collection b() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = AbstractC6017a.b(AbstractC6017a.a(this.f15073a)).getDeclaredMethods();
        AbstractC4862t.d(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            f.a aVar = f.f15074b;
            Object objInvoke = method.invoke(this.f15073a, null);
            AbstractC4862t.d(objInvoke, "method.invoke(annotation)");
            arrayList.add(aVar.a(objInvoke, kd.f.s(method.getName())));
        }
        return arrayList;
    }

    @Override // bd.InterfaceC2909a
    public kd.b c() {
        return d.a(AbstractC6017a.b(AbstractC6017a.a(this.f15073a)));
    }

    @Override // bd.InterfaceC2909a
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.f15073a == ((e) obj).f15073a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f15073a);
    }

    public String toString() {
        return e.class.getName() + ": " + this.f15073a;
    }
}
