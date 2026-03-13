package org.apache.tika.config;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.exception.TikaConfigException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ParamField {
    public static final String DEFAULT = "#default";
    private static final Map<Class<?>, Class<?>> PRIMITIVE_MAP = new HashMap<Class<?>, Class<?>>() { // from class: org.apache.tika.config.ParamField.1
        {
            put(Integer.TYPE, Integer.class);
            put(Short.TYPE, Short.class);
            put(Boolean.TYPE, Boolean.class);
            put(Long.TYPE, Long.class);
            put(Float.TYPE, Float.class);
            put(Double.TYPE, Double.class);
        }
    };
    private java.lang.reflect.Field field;
    private final String name;
    private final boolean required;
    private Method setter;
    private final Class<?> type;

    public ParamField(AccessibleObject accessibleObject) {
        if (accessibleObject instanceof java.lang.reflect.Field) {
            this.field = (java.lang.reflect.Field) accessibleObject;
        } else {
            this.setter = (Method) accessibleObject;
        }
        Field field = (Field) accessibleObject.getAnnotation(Field.class);
        this.required = field.required();
        this.name = retrieveParamName(field);
        this.type = retrieveType();
    }

    private String retrieveParamName(Field field) {
        if (!field.name().equals(DEFAULT)) {
            return field.name();
        }
        java.lang.reflect.Field field2 = this.field;
        if (field2 != null) {
            return field2.getName();
        }
        String name = this.setter.getName();
        if (!name.startsWith("set") || name.length() <= 3) {
            return this.setter.getName();
        }
        return name.substring(3, 4).toLowerCase(Locale.ROOT) + name.substring(4);
    }

    private Class retrieveType() throws TikaConfigException {
        Class<?> type;
        java.lang.reflect.Field field = this.field;
        if (field != null) {
            type = field.getType();
        } else {
            Class<?>[] parameterTypes = this.setter.getParameterTypes();
            if (parameterTypes.length != 1) {
                String str = "Invalid setter method. Must have one and only one parameter. ";
                if (this.setter.getName().startsWith("get")) {
                    str = "Invalid setter method. Must have one and only one parameter. Perhaps the annotation is misplaced on " + this.setter.getName() + " while a set'X' is expected?";
                }
                throw new TikaConfigException(str);
            }
            type = parameterTypes[0];
        }
        if (!type.isPrimitive()) {
            return type;
        }
        Map<Class<?>, Class<?>> map = PRIMITIVE_MAP;
        return map.containsKey(type) ? map.get(type) : type;
    }

    public void assignValue(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        java.lang.reflect.Field field = this.field;
        if (field != null) {
            field.set(obj, obj2);
        } else {
            this.setter.invoke(obj, obj2);
        }
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public String getName() {
        return this.name;
    }

    public Method getSetter() {
        return this.setter;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isRequired() {
        return this.required;
    }

    public String toString() {
        return "ParamField{name='" + this.name + "', type=" + String.valueOf(this.type) + ", required=" + this.required + "}";
    }
}
