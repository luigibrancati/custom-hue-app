package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Named;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BeanPropertyDefinition implements Named {
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();

    public boolean couldDeserialize() {
        return getMutator() != null;
    }

    public boolean couldSerialize() {
        return getAccessor() != null;
    }

    public abstract JsonInclude.Value findInclusion();

    public ObjectIdInfo findObjectIdInfo() {
        return null;
    }

    public String findReferenceName() {
        AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = findReferenceType();
        if (referencePropertyFindReferenceType == null) {
            return null;
        }
        return referencePropertyFindReferenceType.getName();
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        return null;
    }

    public Class<?>[] findViews() {
        return null;
    }

    public AnnotatedMember getAccessor() {
        AnnotatedMethod getter = getGetter();
        return getter == null ? getField() : getter;
    }

    public abstract AnnotatedParameter getConstructorParameter();

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        return ClassUtil.emptyIterator();
    }

    public abstract AnnotatedField getField();

    public abstract PropertyName getFullName();

    public abstract AnnotatedMethod getGetter();

    public abstract String getInternalName();

    public abstract PropertyMetadata getMetadata();

    public AnnotatedMember getMutator() {
        AnnotatedMember constructorParameter = getConstructorParameter();
        return (constructorParameter == null && (constructorParameter = getSetter()) == null) ? getField() : constructorParameter;
    }

    @Override // com.fasterxml.jackson.databind.util.Named
    public abstract String getName();

    public AnnotatedMember getNonConstructorMutator() {
        AnnotatedMethod setter = getSetter();
        return setter == null ? getField() : setter;
    }

    public abstract AnnotatedMember getPrimaryMember();

    public abstract JavaType getPrimaryType();

    public abstract Class<?> getRawPrimaryType();

    public abstract AnnotatedMethod getSetter();

    public abstract PropertyName getWrapperName();

    public abstract boolean hasConstructorParameter();

    public abstract boolean hasField();

    public abstract boolean hasGetter();

    public boolean hasName(PropertyName propertyName) {
        return getFullName().equals(propertyName);
    }

    public abstract boolean hasSetter();

    public abstract boolean isExplicitlyIncluded();

    public boolean isExplicitlyNamed() {
        return isExplicitlyIncluded();
    }

    public boolean isRequired() {
        return getMetadata().isRequired();
    }

    public boolean isTypeId() {
        return false;
    }

    public abstract BeanPropertyDefinition withName(PropertyName propertyName);

    public abstract BeanPropertyDefinition withSimpleName(String str);
}
