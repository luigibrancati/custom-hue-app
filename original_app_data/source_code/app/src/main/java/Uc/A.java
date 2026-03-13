package Uc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f16834a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.c f16835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kd.b f16836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kd.b f16837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kd.b f16838e;

    static {
        kd.c cVar = new kd.c("kotlin.jvm.JvmField");
        f16835b = cVar;
        kd.b bVarM = kd.b.m(cVar);
        AbstractC4862t.d(bVarM, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f16836c = bVarM;
        kd.b bVarM2 = kd.b.m(new kd.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        AbstractC4862t.d(bVarM2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f16837d = bVarM2;
        kd.b bVarE = kd.b.e("kotlin/jvm/internal/RepeatableContainer");
        AbstractC4862t.d(bVarE, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f16838e = bVarE;
    }

    public static final String b(String propertyName) {
        AbstractC4862t.e(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + Kd.a.a(propertyName);
    }

    public static final boolean c(String name) {
        AbstractC4862t.e(name, "name");
        return Od.C.P(name, "get", false, 2, null) || Od.C.P(name, "is", false, 2, null);
    }

    public static final boolean d(String name) {
        AbstractC4862t.e(name, "name");
        return Od.C.P(name, "set", false, 2, null);
    }

    public static final String e(String propertyName) {
        String strA;
        AbstractC4862t.e(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            AbstractC4862t.d(strA, "this as java.lang.String).substring(startIndex)");
        } else {
            strA = Kd.a.a(propertyName);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    public static final boolean f(String name) {
        AbstractC4862t.e(name, "name");
        if (!Od.C.P(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return AbstractC4862t.f(97, cCharAt) > 0 || AbstractC4862t.f(cCharAt, 122) > 0;
    }

    public final kd.b a() {
        return f16838e;
    }
}
