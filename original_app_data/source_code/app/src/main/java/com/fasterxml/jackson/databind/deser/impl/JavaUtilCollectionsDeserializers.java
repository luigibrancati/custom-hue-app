package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JavaUtilCollectionsDeserializers {
    private static final Class<?> CLASS_AS_ARRAYS_LIST = Arrays.asList(null, null).getClass();
    private static final Class<?> CLASS_SINGLETON_LIST;
    private static final Class<?> CLASS_SINGLETON_MAP;
    private static final Class<?> CLASS_SINGLETON_SET;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST_ALIAS;
    private static final Class<?> CLASS_UNMODIFIABLE_MAP;
    private static final Class<?> CLASS_UNMODIFIABLE_SET;
    public static final int TYPE_AS_LIST = 7;
    private static final int TYPE_SINGLETON_LIST = 2;
    private static final int TYPE_SINGLETON_MAP = 3;
    private static final int TYPE_SINGLETON_SET = 1;
    private static final int TYPE_UNMODIFIABLE_LIST = 5;
    private static final int TYPE_UNMODIFIABLE_MAP = 6;
    private static final int TYPE_UNMODIFIABLE_SET = 4;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class JavaUtilCollectionsConverter implements Converter<Object, Object> {
        private final JavaType _inputType;
        private final int _kind;

        private void _checkSingleton(int i10) {
            if (i10 == 1) {
                return;
            }
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + i10 + " entries");
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this._kind) {
                case 1:
                    Set set = (Set) obj;
                    _checkSingleton(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    _checkSingleton(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    _checkSingleton(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getInputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getOutputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        private JavaUtilCollectionsConverter(int i10, JavaType javaType) {
            this._inputType = javaType;
            this._kind = i10;
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set setSingleton = Collections.singleton(bool);
        CLASS_SINGLETON_SET = setSingleton.getClass();
        CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(setSingleton).getClass();
        List listSingletonList = Collections.singletonList(bool);
        CLASS_SINGLETON_LIST = listSingletonList.getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(listSingletonList).getClass();
        CLASS_UNMODIFIABLE_LIST_ALIAS = Collections.unmodifiableList(new LinkedList()).getClass();
        Map mapSingletonMap = Collections.singletonMap("a", "b");
        CLASS_SINGLETON_MAP = mapSingletonMap.getClass();
        CLASS_UNMODIFIABLE_MAP = Collections.unmodifiableMap(mapSingletonMap).getClass();
    }

    public static JavaUtilCollectionsConverter converter(int i10, JavaType javaType, Class<?> cls) {
        return new JavaUtilCollectionsConverter(i10, javaType.findSuperType(cls));
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) {
        JavaUtilCollectionsConverter javaUtilCollectionsConverterConverter;
        if (javaType.hasRawClass(CLASS_AS_ARRAYS_LIST)) {
            javaUtilCollectionsConverterConverter = converter(7, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_LIST)) {
            javaUtilCollectionsConverterConverter = converter(2, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_SET)) {
            javaUtilCollectionsConverterConverter = converter(1, javaType, Set.class);
        } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST) || javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST_ALIAS)) {
            javaUtilCollectionsConverterConverter = converter(5, javaType, List.class);
        } else {
            if (!javaType.hasRawClass(CLASS_UNMODIFIABLE_SET)) {
                return null;
            }
            javaUtilCollectionsConverterConverter = converter(4, javaType, Set.class);
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverterConverter);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) {
        JavaUtilCollectionsConverter javaUtilCollectionsConverterConverter;
        if (javaType.hasRawClass(CLASS_SINGLETON_MAP)) {
            javaUtilCollectionsConverterConverter = converter(3, javaType, Map.class);
        } else {
            if (!javaType.hasRawClass(CLASS_UNMODIFIABLE_MAP)) {
                return null;
            }
            javaUtilCollectionsConverterConverter = converter(6, javaType, Map.class);
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverterConverter);
    }
}
