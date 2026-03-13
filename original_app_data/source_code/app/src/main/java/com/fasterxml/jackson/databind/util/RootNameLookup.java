package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class RootNameLookup implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient LRUMap<ClassKey, PropertyName> _rootNames = new LRUMap<>(20, 200);

    public PropertyName findRootName(JavaType javaType, MapperConfig<?> mapperConfig) {
        return findRootName(javaType.getRawClass(), mapperConfig);
    }

    public Object readResolve() {
        return new RootNameLookup();
    }

    public PropertyName findRootName(Class<?> cls, MapperConfig<?> mapperConfig) {
        ClassKey classKey = new ClassKey(cls);
        PropertyName propertyName = this._rootNames.get(classKey);
        if (propertyName != null) {
            return propertyName;
        }
        PropertyName propertyNameFindRootName = mapperConfig.getAnnotationIntrospector().findRootName(mapperConfig.introspectClassAnnotations(cls).getClassInfo());
        if (propertyNameFindRootName == null || !propertyNameFindRootName.hasSimpleName()) {
            propertyNameFindRootName = PropertyName.construct(cls.getSimpleName());
        }
        this._rootNames.put(classKey, propertyNameFindRootName);
        return propertyNameFindRootName;
    }
}
