package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JacksonInject {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Value implements JacksonAnnotationValue<JacksonInject>, Serializable {
        protected static final Value EMPTY = new Value(null, null);
        private static final long serialVersionUID = 1;
        protected final Object _id;
        protected final Boolean _useInput;

        public Value(Object obj, Boolean bool) {
            this._id = obj;
            this._useInput = bool;
        }

        private static boolean _empty(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        public static Value construct(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            return _empty(obj, bool) ? EMPTY : new Value(obj, bool);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value forId(Object obj) {
            return construct(obj, null);
        }

        public static Value from(JacksonInject jacksonInject) {
            return jacksonInject == null ? EMPTY : construct(jacksonInject.value(), jacksonInject.useInput().asBoolean());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (OptBoolean.equals(this._useInput, value._useInput)) {
                    Object obj2 = this._id;
                    return obj2 == null ? value._id == null : obj2.equals(value._id);
                }
            }
            return false;
        }

        public Object getId() {
            return this._id;
        }

        public Boolean getUseInput() {
            return this._useInput;
        }

        public boolean hasId() {
            return this._id != null;
        }

        public int hashCode() {
            Object obj = this._id;
            int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this._useInput;
            return bool != null ? iHashCode + bool.hashCode() : iHashCode;
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this._id, this._useInput);
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JacksonInject> valueFor() {
            return JacksonInject.class;
        }

        public boolean willUseInput(boolean z10) {
            Boolean bool = this._useInput;
            return bool == null ? z10 : bool.booleanValue();
        }

        public Value withId(Object obj) {
            return (obj != null ? !obj.equals(this._id) : this._id != null) ? new Value(obj, this._useInput) : this;
        }

        public Value withUseInput(Boolean bool) {
            return (bool != null ? !bool.equals(this._useInput) : this._useInput != null) ? new Value(this._id, bool) : this;
        }
    }

    OptBoolean useInput() default OptBoolean.DEFAULT;

    String value() default "";
}
