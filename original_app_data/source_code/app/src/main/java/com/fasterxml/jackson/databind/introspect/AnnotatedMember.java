package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AnnotatedMember extends Annotated implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient AnnotationMap _annotations;
    protected final transient TypeResolutionContext _typeContext;

    public AnnotatedMember(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap) {
        this._typeContext = typeResolutionContext;
        this._annotations = annotationMap;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    @Deprecated
    public Iterable<Annotation> annotations() {
        AnnotationMap annotationMap = this._annotations;
        return annotationMap == null ? Collections.EMPTY_LIST : annotationMap.annotations();
    }

    public final void fixAccess(boolean z10) {
        Member member = getMember();
        if (member != null) {
            ClassUtil.checkAndFixAccess(member, z10);
        }
    }

    public AnnotationMap getAllAnnotations() {
        return this._annotations;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotationMap annotationMap = this._annotations;
        if (annotationMap == null) {
            return null;
        }
        return (A) annotationMap.get(cls);
    }

    public abstract Class<?> getDeclaringClass();

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName();
    }

    public abstract Member getMember();

    @Deprecated
    public TypeResolutionContext getTypeContext() {
        return this._typeContext;
    }

    public abstract Object getValue(Object obj);

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final boolean hasAnnotation(Class<?> cls) {
        AnnotationMap annotationMap = this._annotations;
        if (annotationMap == null) {
            return false;
        }
        return annotationMap.has(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        AnnotationMap annotationMap = this._annotations;
        if (annotationMap == null) {
            return false;
        }
        return annotationMap.hasOneOf(clsArr);
    }

    public abstract void setValue(Object obj, Object obj2);

    public abstract Annotated withAnnotations(AnnotationMap annotationMap);

    public AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }
}
