package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BeanUtil {
    public static Object getDefaultValue(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> clsPrimitiveType = ClassUtil.primitiveType(rawClass);
        if (clsPrimitiveType != null) {
            return ClassUtil.defaultValue(clsPrimitiveType);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    public static boolean isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        String packageName;
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType.isArray() && (packageName = ClassUtil.getPackageName(rawType.getComponentType())) != null && packageName.contains(".cglib")) {
            return packageName.startsWith("net.sf.cglib") || packageName.startsWith("org.hibernate.repackage.cglib") || packageName.startsWith("org.springframework.cglib");
        }
        return false;
    }

    public static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawType());
        return packageName != null && packageName.startsWith("groovy.lang");
    }

    public static boolean isGroovyMetaClassSetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawParameterType(0));
        return packageName != null && packageName.startsWith("groovy.lang");
    }

    public static String legacyManglePropertyName(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        while (true) {
            i10++;
            if (i10 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i10);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i10, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    public static String okNameForGetter(AnnotatedMethod annotatedMethod, boolean z10) {
        String name = annotatedMethod.getName();
        String strOkNameForIsGetter = okNameForIsGetter(annotatedMethod, name, z10);
        return strOkNameForIsGetter == null ? okNameForRegularGetter(annotatedMethod, name, z10) : strOkNameForIsGetter;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str, boolean z10) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType == Boolean.class || rawType == Boolean.TYPE) {
            return z10 ? stdManglePropertyName(str, 2) : legacyManglePropertyName(str, 2);
        }
        return null;
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str, boolean z10) {
        String name = annotatedMethod.getName();
        if (name.startsWith(str)) {
            return z10 ? stdManglePropertyName(name, str.length()) : legacyManglePropertyName(name, str.length());
        }
        return null;
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str, boolean z10) {
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        return z10 ? stdManglePropertyName(str, 3) : legacyManglePropertyName(str, 3);
    }

    @Deprecated
    public static String okNameForSetter(AnnotatedMethod annotatedMethod, boolean z10) {
        String strOkNameForMutator = okNameForMutator(annotatedMethod, "set", z10);
        if (strOkNameForMutator == null) {
            return null;
        }
        if ("metaClass".equals(strOkNameForMutator) && isGroovyMetaClassSetter(annotatedMethod)) {
            return null;
        }
        return strOkNameForMutator;
    }

    public static String stdManglePropertyName(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        int i11 = i10 + 1;
        if (i11 < length && Character.isUpperCase(str.charAt(i11))) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i11, length);
        return sb2.toString();
    }
}
