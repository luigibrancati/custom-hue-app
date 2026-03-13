package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SubtypeResolver {
    @Deprecated
    public Collection<NamedType> collectAndResolveSubtypes(AnnotatedMember annotatedMember, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, JavaType javaType) {
        return collectAndResolveSubtypesByClass(mapperConfig, annotatedMember, javaType);
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, mapperConfig.getAnnotationIntrospector(), javaType);
    }

    public abstract void registerSubtypes(Collection<Class<?>> collection);

    public abstract void registerSubtypes(NamedType... namedTypeArr);

    public abstract void registerSubtypes(Class<?>... clsArr);

    @Deprecated
    public Collection<NamedType> collectAndResolveSubtypes(AnnotatedClass annotatedClass, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector) {
        return collectAndResolveSubtypesByClass(mapperConfig, annotatedClass);
    }

    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        return collectAndResolveSubtypes(annotatedClass, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        return collectAndResolveSubtypes(annotatedClass, mapperConfig, mapperConfig.getAnnotationIntrospector());
    }

    public SubtypeResolver copy() {
        return this;
    }
}
