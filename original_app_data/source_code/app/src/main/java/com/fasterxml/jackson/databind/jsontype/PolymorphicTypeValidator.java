package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Base extends PolymorphicTypeValidator implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
            return Validity.INDETERMINATE;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
            return Validity.INDETERMINATE;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
            return Validity.INDETERMINATE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Validity {
        ALLOWED,
        DENIED,
        INDETERMINATE
    }

    public abstract Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType);

    public abstract Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str);

    public abstract Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2);
}
