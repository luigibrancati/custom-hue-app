package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CreatorCandidate {
    protected final AnnotatedWithParams _creator;
    protected final AnnotationIntrospector _intr;
    protected final int _paramCount;
    protected final Param[] _params;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Param {
        public final AnnotatedParameter annotated;
        public final JacksonInject.Value injection;
        public final BeanPropertyDefinition propDef;

        public Param(AnnotatedParameter annotatedParameter, BeanPropertyDefinition beanPropertyDefinition, JacksonInject.Value value) {
            this.annotated = annotatedParameter;
            this.propDef = beanPropertyDefinition;
            this.injection = value;
        }

        public PropertyName fullName() {
            BeanPropertyDefinition beanPropertyDefinition = this.propDef;
            if (beanPropertyDefinition == null) {
                return null;
            }
            return beanPropertyDefinition.getFullName();
        }

        public boolean hasFullName() {
            BeanPropertyDefinition beanPropertyDefinition = this.propDef;
            if (beanPropertyDefinition == null) {
                return false;
            }
            return beanPropertyDefinition.getFullName().hasSimpleName();
        }
    }

    public CreatorCandidate(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, Param[] paramArr, int i10) {
        this._intr = annotationIntrospector;
        this._creator = annotatedWithParams;
        this._params = paramArr;
        this._paramCount = i10;
    }

    public static CreatorCandidate construct(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition[] beanPropertyDefinitionArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        Param[] paramArr = new Param[parameterCount];
        for (int i10 = 0; i10 < parameterCount; i10++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i10);
            paramArr[i10] = new Param(parameter, beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i10], annotationIntrospector.findInjectableValue(parameter));
        }
        return new CreatorCandidate(annotationIntrospector, annotatedWithParams, paramArr, parameterCount);
    }

    public AnnotatedWithParams creator() {
        return this._creator;
    }

    public PropertyName explicitParamName(int i10) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i10].propDef;
        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
            return null;
        }
        return beanPropertyDefinition.getFullName();
    }

    public PropertyName findImplicitParamName(int i10) {
        String strFindImplicitPropertyName = this._intr.findImplicitPropertyName(this._params[i10].annotated);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    public int findOnlyParamWithoutInjection() {
        int i10 = -1;
        for (int i11 = 0; i11 < this._paramCount; i11++) {
            if (this._params[i11].injection == null) {
                if (i10 >= 0) {
                    return -1;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public JacksonInject.Value injection(int i10) {
        return this._params[i10].injection;
    }

    public int paramCount() {
        return this._paramCount;
    }

    public PropertyName paramName(int i10) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i10].propDef;
        if (beanPropertyDefinition != null) {
            return beanPropertyDefinition.getFullName();
        }
        return null;
    }

    public AnnotatedParameter parameter(int i10) {
        return this._params[i10].annotated;
    }

    public BeanPropertyDefinition propertyDef(int i10) {
        return this._params[i10].propDef;
    }

    public String toString() {
        return this._creator.toString();
    }
}
