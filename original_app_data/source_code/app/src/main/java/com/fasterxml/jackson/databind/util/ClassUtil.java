package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassUtil {
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Annotation[] NO_ANNOTATIONS = new Annotation[0];
    private static final Ctor[] NO_CTORS = new Ctor[0];
    private static final Iterator<?> EMPTY_ITERATOR = Collections.emptyIterator();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Ctor {
        private transient Annotation[] _annotations;
        public final Constructor<?> _ctor;
        private transient Annotation[][] _paramAnnotations;
        private int _paramCount = -1;

        public Ctor(Constructor<?> constructor) {
            this._ctor = constructor;
        }

        public Constructor<?> getConstructor() {
            return this._ctor;
        }

        public Annotation[] getDeclaredAnnotations() {
            Annotation[] annotationArr = this._annotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this._ctor.getDeclaredAnnotations();
            this._annotations = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class<?> getDeclaringClass() {
            return this._ctor.getDeclaringClass();
        }

        public int getParamCount() {
            int i10 = this._paramCount;
            if (i10 >= 0) {
                return i10;
            }
            int length = this._ctor.getParameterTypes().length;
            this._paramCount = length;
            return length;
        }

        public Annotation[][] getParameterAnnotations() {
            Annotation[][] annotationArr = this._paramAnnotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this._ctor.getParameterAnnotations();
            this._paramAnnotations = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    private static void _addRawSuperTypes(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z10) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z10) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (Class<?> cls3 : _interfaces(cls)) {
            _addRawSuperTypes(cls3, cls2, collection, true);
        }
        _addRawSuperTypes(cls.getSuperclass(), cls2, collection, true);
    }

    private static void _addSuperTypes(JavaType javaType, Class<?> cls, Collection<JavaType> collection, boolean z10) {
        Class<?> rawClass;
        if (javaType == null || (rawClass = javaType.getRawClass()) == cls || rawClass == Object.class) {
            return;
        }
        if (z10) {
            if (collection.contains(javaType)) {
                return;
            } else {
                collection.add(javaType);
            }
        }
        Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            _addSuperTypes(it.next(), cls, collection, true);
        }
        _addSuperTypes(javaType.getSuperClass(), cls, collection, true);
    }

    private static Class<?>[] _interfaces(Class<?> cls) {
        return cls.getInterfaces();
    }

    public static String backticked(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('`');
        sb2.append(str);
        sb2.append('`');
        return sb2.toString();
    }

    public static String canBeABeanType(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    @Deprecated
    public static void checkAndFixAccess(Member member) {
        checkAndFixAccess(member, false);
    }

    public static String classNameOf(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return nameOf(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Class<?> classOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T createInstance(Class<T> cls, boolean z10) {
        Constructor constructorFindConstructor = findConstructor(cls, z10);
        if (constructorFindConstructor == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return (T) constructorFindConstructor.newInstance(null);
        } catch (Exception e10) {
            unwrapAndThrowAsIAE(e10, "Failed to instantiate class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static <T> Iterator<T> emptyIterator() {
        return (Iterator<T>) EMPTY_ITERATOR;
    }

    public static String exceptionMessage(Throwable th) {
        return th instanceof JsonProcessingException ? ((JsonProcessingException) th).getOriginalMessage() : th.getMessage();
    }

    public static Annotation[] findClassAnnotations(Class<?> cls) {
        return isObjectOrPrimitive(cls) ? NO_ANNOTATIONS : cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z10) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (z10) {
                checkAndFixAccess(declaredConstructor, z10);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            unwrapAndThrowAsIAE(e10, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumSet<?> enumSet) {
        return !enumSet.isEmpty() ? findEnumType((Enum<?>) enumSet.iterator().next()) : EnumTypeLocator.instance.enumTypeFor(enumSet);
    }

    public static <T extends Annotation> Enum<?> findFirstAnnotatedEnumValue(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> r82 : cls.getEnumConstants()) {
                    if (name.equals(r82.name())) {
                        return r82;
                    }
                }
            }
        }
        return null;
    }

    public static List<Class<?>> findRawSuperTypes(Class<?> cls, Class<?> cls2, boolean z10) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        _addRawSuperTypes(cls, cls2, arrayList, z10);
        return arrayList;
    }

    public static List<Class<?>> findSuperClasses(Class<?> cls, Class<?> cls2, boolean z10) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z10) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static List<JavaType> findSuperTypes(JavaType javaType, Class<?> cls, boolean z10) {
        if (javaType == null || javaType.hasRawClass(cls) || javaType.hasRawClass(Object.class)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        _addSuperTypes(javaType, cls, arrayList, z10);
        return arrayList;
    }

    public static String getClassDescription(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return nameOf(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] getClassMethods(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                throw e10;
            }
            try {
                return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
            } catch (ClassNotFoundException e11) {
                e10.addSuppressed(e11);
                throw e10;
            }
        }
    }

    public static Ctor[] getConstructors(Class<?> cls) {
        if (cls.isInterface() || isObjectOrPrimitive(cls)) {
            return NO_CTORS;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        Ctor[] ctorArr = new Ctor[length];
        for (int i10 = 0; i10 < length; i10++) {
            ctorArr[i10] = new Ctor(declaredConstructors[i10]);
        }
        return ctorArr;
    }

    @Deprecated
    public static Field[] getDeclaredFields(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    @Deprecated
    public static Method[] getDeclaredMethods(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Class<?> getDeclaringClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getDeclaringClass();
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] getGenericInterfaces(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type getGenericSuperclass(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> getOuterClass(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (hasEnclosingMethod(cls)) {
                    return null;
                }
                return getEnclosingClass(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static String getPackageName(Class<?> cls) {
        Package r02 = cls.getPackage();
        if (r02 == null) {
            return null;
        }
        return r02.getName();
    }

    public static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static String getTypeDescription(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(javaType.toCanonical());
        sb2.append('`');
        return sb2.toString();
    }

    public static boolean hasClass(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean hasEnclosingMethod(Class<?> cls) {
        return (isObjectOrPrimitive(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    @Deprecated
    public static boolean hasGetterSignature(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return (parameterTypes == null || parameterTypes.length == 0) && Void.TYPE != method.getReturnType();
    }

    public static boolean isBogusClass(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == NoClass.class;
    }

    public static boolean isCollectionMapOrArray(Class<?> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public static boolean isConcrete(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean isEnumType(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean isJDKClass(Class<?> cls) {
        return cls.getName().startsWith("java.");
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return obj == null || isJacksonStdImpl(obj.getClass());
    }

    public static String isLocalType(Class<?> cls, boolean z10) {
        try {
            boolean zIsStatic = Modifier.isStatic(cls.getModifiers());
            if (!zIsStatic && hasEnclosingMethod(cls)) {
                return "local/anonymous";
            }
            if (z10 || zIsStatic) {
                return null;
            }
            if (getEnclosingClass(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean isNonStaticInnerClass(Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || getEnclosingClass(cls) == null) ? false : true;
    }

    public static boolean isObjectOrPrimitive(Class<?> cls) {
        return cls == CLS_OBJECT || cls.isPrimitive();
    }

    public static boolean isProxyType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static String nameOf(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append("[]");
                i10--;
            } while (i10 > 0);
            simpleName = sb2.toString();
        }
        return backticked(simpleName);
    }

    public static <T> T nonNull(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static String nonNullString(String str) {
        return str == null ? "" : str;
    }

    public static String nullOrToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Class<?> primitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static String quotedOr(Object obj, String str) {
        return obj == null ? str : String.format("\"%s\"", obj);
    }

    public static Class<?> rawClass(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static void throwAsIAE(Throwable th) {
        throwAsIAE(th, th.getMessage());
    }

    public static <T> T throwAsMappingException(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException jsonMappingExceptionFrom = JsonMappingException.from(deserializationContext, iOException.getMessage());
        jsonMappingExceptionFrom.initCause(iOException);
        throw jsonMappingExceptionFrom;
    }

    public static Throwable throwIfError(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th;
    }

    public static Throwable throwIfIOE(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        return th;
    }

    public static Throwable throwIfRTE(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    public static Throwable throwRootCauseIfIOE(Throwable th) {
        return throwIfIOE(getRootCause(th));
    }

    public static void unwrapAndThrowAsIAE(Throwable th) {
        throwAsIAE(getRootCause(th));
    }

    public static void verifyMustOverride(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    public static Class<?> wrapperType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkAndFixAccess(Member member, boolean z10) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z10) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e10) {
                if (accessibleObject.isAccessible()) {
                    return;
                }
                throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e10.getMessage());
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static boolean isConcrete(Member member) {
        return (member.getModifiers() & 1536) == 0;
    }

    public static boolean isJacksonStdImpl(Class<?> cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static void throwAsIAE(Throwable th, String str) {
        throwIfRTE(th);
        throwIfError(th);
        throw new IllegalArgumentException(str, th);
    }

    public static void unwrapAndThrowAsIAE(Throwable th, String str) {
        throwAsIAE(getRootCause(th), str);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class EnumTypeLocator {
        static final EnumTypeLocator instance = new EnumTypeLocator();
        private final Field enumSetTypeField = locateField(EnumSet.class, "elementType", Class.class);
        private final Field enumMapTypeField = locateField(EnumMap.class, "elementType", Class.class);

        private EnumTypeLocator() {
        }

        private Object get(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        private static Field locateField(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i10];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i10++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumSet<?> enumSet) {
            Field field = this.enumSetTypeField;
            if (field != null) {
                return (Class) get(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumMap<?, ?> enumMap) {
            Field field = this.enumMapTypeField;
            if (field != null) {
                return (Class) get(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return findEnumType((Enum<?>) enumMap.keySet().iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumMap);
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2) {
        return findSuperTypes(cls, cls2, new ArrayList(8));
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        _addRawSuperTypes(cls, cls2, list, false);
        return list;
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static Class<? extends Enum<?>> findEnumType(Enum<?> r22) {
        Class cls = r22.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static String nameOf(Named named) {
        if (named == null) {
            return "[null]";
        }
        return backticked(named.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> findEnumType(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }
}
