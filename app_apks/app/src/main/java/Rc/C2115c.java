package Rc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Rc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2115c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2115c f15063a = new C2115c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f15064b;

    /* JADX INFO: renamed from: Rc.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f15065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f15066b;

        public a(Method method, Method method2) {
            this.f15065a = method;
            this.f15066b = method2;
        }

        public final Method a() {
            return this.f15066b;
        }

        public final Method b() {
            return this.f15065a;
        }
    }

    public final a a(Member member) {
        AbstractC4862t.e(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), d.f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodA;
        AbstractC4862t.e(member, "member");
        a aVarA = f15064b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f15064b;
                if (aVarA == null) {
                    aVarA = f15063a.a(member);
                    f15064b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            AbstractC4862t.c(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
