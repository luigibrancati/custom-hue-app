package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BasicPolymorphicTypeValidator extends PolymorphicTypeValidator.Base implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeMatcher[] _baseTypeMatchers;
    protected final Set<Class<?>> _invalidBaseTypes;
    protected final TypeMatcher[] _subClassMatchers;
    protected final NameMatcher[] _subTypeNameMatchers;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        protected List<TypeMatcher> _baseTypeMatchers;
        protected Set<Class<?>> _invalidBaseTypes;
        protected List<TypeMatcher> _subTypeClassMatchers;
        protected List<NameMatcher> _subTypeNameMatchers;

        public Builder _appendBaseMatcher(TypeMatcher typeMatcher) {
            if (this._baseTypeMatchers == null) {
                this._baseTypeMatchers = new ArrayList();
            }
            this._baseTypeMatchers.add(typeMatcher);
            return this;
        }

        public Builder _appendSubClassMatcher(TypeMatcher typeMatcher) {
            if (this._subTypeClassMatchers == null) {
                this._subTypeClassMatchers = new ArrayList();
            }
            this._subTypeClassMatchers.add(typeMatcher);
            return this;
        }

        public Builder _appendSubNameMatcher(NameMatcher nameMatcher) {
            if (this._subTypeNameMatchers == null) {
                this._subTypeNameMatchers = new ArrayList();
            }
            this._subTypeNameMatchers.add(nameMatcher);
            return this;
        }

        public Builder allowIfBaseType(final Class<?> cls) {
            return _appendBaseMatcher(new TypeMatcher() { // from class: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder.1
                @Override // com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.TypeMatcher
                public boolean match(MapperConfig<?> mapperConfig, Class<?> cls2) {
                    return cls.isAssignableFrom(cls2);
                }
            });
        }

        public Builder allowIfSubType(final Class<?> cls) {
            return _appendSubClassMatcher(new TypeMatcher() { // from class: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder.4
                @Override // com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.TypeMatcher
                public boolean match(MapperConfig<?> mapperConfig, Class<?> cls2) {
                    return cls.isAssignableFrom(cls2);
                }
            });
        }

        public Builder allowIfSubTypeIsArray() {
            return _appendSubClassMatcher(new TypeMatcher() { // from class: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder.7
                @Override // com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.TypeMatcher
                public boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                    return cls.isArray();
                }
            });
        }

        public BasicPolymorphicTypeValidator build() {
            Set<Class<?>> set = this._invalidBaseTypes;
            List<TypeMatcher> list = this._baseTypeMatchers;
            TypeMatcher[] typeMatcherArr = list == null ? null : (TypeMatcher[]) list.toArray(new TypeMatcher[0]);
            List<NameMatcher> list2 = this._subTypeNameMatchers;
            NameMatcher[] nameMatcherArr = list2 == null ? null : (NameMatcher[]) list2.toArray(new NameMatcher[0]);
            List<TypeMatcher> list3 = this._subTypeClassMatchers;
            return new BasicPolymorphicTypeValidator(set, typeMatcherArr, nameMatcherArr, list3 != null ? (TypeMatcher[]) list3.toArray(new TypeMatcher[0]) : null);
        }

        public Builder denyForExactBaseType(Class<?> cls) {
            if (this._invalidBaseTypes == null) {
                this._invalidBaseTypes = new HashSet();
            }
            this._invalidBaseTypes.add(cls);
            return this;
        }

        public Builder allowIfBaseType(final Pattern pattern) {
            return _appendBaseMatcher(new TypeMatcher() { // from class: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder.2
                @Override // com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.TypeMatcher
                public boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                    return pattern.matcher(cls.getName()).matches();
                }
            });
        }

        public Builder allowIfSubType(final Pattern pattern) {
            return _appendSubNameMatcher(new NameMatcher() { // from class: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder.5
                @Override // com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.NameMatcher
                public boolean match(MapperConfig<?> mapperConfig, String str) {
                    return pattern.matcher(str).matches();
                }
            });
        }

        public Builder allowIfBaseType(final String str) {
            return _appendBaseMatcher(new TypeMatcher() { // from class: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder.3
                @Override // com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.TypeMatcher
                public boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                    return cls.getName().startsWith(str);
                }
            });
        }

        public Builder allowIfSubType(final String str) {
            return _appendSubNameMatcher(new NameMatcher() { // from class: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder.6
                @Override // com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.NameMatcher
                public boolean match(MapperConfig<?> mapperConfig, String str2) {
                    return str2.startsWith(str);
                }
            });
        }

        public Builder allowIfBaseType(TypeMatcher typeMatcher) {
            return _appendBaseMatcher(typeMatcher);
        }

        public Builder allowIfSubType(TypeMatcher typeMatcher) {
            return _appendSubClassMatcher(typeMatcher);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class NameMatcher {
        public abstract boolean match(MapperConfig<?> mapperConfig, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class TypeMatcher {
        public abstract boolean match(MapperConfig<?> mapperConfig, Class<?> cls);
    }

    public BasicPolymorphicTypeValidator(Set<Class<?>> set, TypeMatcher[] typeMatcherArr, NameMatcher[] nameMatcherArr, TypeMatcher[] typeMatcherArr2) {
        this._invalidBaseTypes = set;
        this._baseTypeMatchers = typeMatcherArr;
        this._subTypeNameMatchers = nameMatcherArr;
        this._subClassMatchers = typeMatcherArr2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Set<Class<?>> set = this._invalidBaseTypes;
        if (set != null && set.contains(rawClass)) {
            return PolymorphicTypeValidator.Validity.DENIED;
        }
        TypeMatcher[] typeMatcherArr = this._baseTypeMatchers;
        if (typeMatcherArr != null) {
            for (TypeMatcher typeMatcher : typeMatcherArr) {
                if (typeMatcher.match(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        NameMatcher[] nameMatcherArr = this._subTypeNameMatchers;
        if (nameMatcherArr != null) {
            for (NameMatcher nameMatcher : nameMatcherArr) {
                if (nameMatcher.match(mapperConfig, str)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        if (this._subClassMatchers != null) {
            Class<?> rawClass = javaType2.getRawClass();
            for (TypeMatcher typeMatcher : this._subClassMatchers) {
                if (typeMatcher.match(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }
}
