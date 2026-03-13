package uc;

import Cc.d;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4851h;
import kotlin.jvm.internal.M;

/* JADX INFO: renamed from: uc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6017a {
    public static final d a(Annotation annotation) {
        AbstractC4862t.e(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        AbstractC4862t.d(clsAnnotationType, "annotationType(...)");
        d dVarE = e(clsAnnotationType);
        AbstractC4862t.c(dVarE, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return dVarE;
    }

    public static final Class b(d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        Class clsD = ((InterfaceC4851h) dVar).d();
        AbstractC4862t.c(clsD, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsD;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class c(d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        Class clsD = ((InterfaceC4851h) dVar).d();
        if (!clsD.isPrimitive()) {
            AbstractC4862t.c(clsD, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsD;
        }
        String name = clsD.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsD = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsD = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsD = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsD = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsD = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsD = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsD = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsD = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsD = Short.class;
                }
                break;
        }
        AbstractC4862t.c(clsD, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsD;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class d(d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        Class clsD = ((InterfaceC4851h) dVar).d();
        if (clsD.isPrimitive()) {
            AbstractC4862t.c(clsD, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return clsD;
        }
        String name = clsD.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final d e(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        return M.b(cls);
    }
}
