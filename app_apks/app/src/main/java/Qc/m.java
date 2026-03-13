package Qc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f14277a = new m();

    public final String a(Constructor constructor) {
        AbstractC4862t.e(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        AbstractC4862t.d(parameterTypes, "constructor.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            AbstractC4862t.d(parameterType, "parameterType");
            sb2.append(Rc.d.b(parameterType));
        }
        sb2.append(")V");
        String string = sb2.toString();
        AbstractC4862t.d(string, "sb.toString()");
        return string;
    }

    public final String b(Field field) {
        AbstractC4862t.e(field, "field");
        Class<?> type = field.getType();
        AbstractC4862t.d(type, "field.type");
        return Rc.d.b(type);
    }

    public final String c(Method method) {
        AbstractC4862t.e(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC4862t.d(parameterTypes, "method.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            AbstractC4862t.d(parameterType, "parameterType");
            sb2.append(Rc.d.b(parameterType));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        AbstractC4862t.d(returnType, "method.returnType");
        sb2.append(Rc.d.b(returnType));
        String string = sb2.toString();
        AbstractC4862t.d(string, "sb.toString()");
        return string;
    }
}
