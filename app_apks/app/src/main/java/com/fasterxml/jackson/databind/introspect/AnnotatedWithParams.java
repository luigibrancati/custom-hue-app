package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final AnnotationMap[] _paramAnnotations;

    public AnnotatedWithParams(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap);
        this._paramAnnotations = annotationMapArr;
    }

    public final void addOrOverrideParam(int i10, Annotation annotation) {
        AnnotationMap annotationMap = this._paramAnnotations[i10];
        if (annotationMap == null) {
            annotationMap = new AnnotationMap();
            this._paramAnnotations[i10] = annotationMap;
        }
        annotationMap.add(annotation);
    }

    public abstract Object call();

    public abstract Object call(Object[] objArr);

    public abstract Object call1(Object obj);

    public final int getAnnotationCount() {
        return this._annotations.size();
    }

    @Deprecated
    public abstract Type getGenericParameterType(int i10);

    public final AnnotatedParameter getParameter(int i10) {
        return new AnnotatedParameter(this, getParameterType(i10), this._typeContext, getParameterAnnotations(i10), i10);
    }

    public final AnnotationMap getParameterAnnotations(int i10) {
        AnnotationMap[] annotationMapArr = this._paramAnnotations;
        if (annotationMapArr == null || i10 < 0 || i10 >= annotationMapArr.length) {
            return null;
        }
        return annotationMapArr[i10];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i10);

    public abstract Class<?> getRawParameterType(int i10);

    public AnnotatedParameter replaceParameterAnnotations(int i10, AnnotationMap annotationMap) {
        this._paramAnnotations[i10] = annotationMap;
        return getParameter(i10);
    }

    public AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, AnnotationMap[] annotationMapArr) {
        super(annotatedWithParams);
        this._paramAnnotations = annotationMapArr;
    }
}
