package org.apache.tika.metadata;

import org.apache.tika.metadata.Property;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class PropertyTypeException extends IllegalArgumentException {
    public PropertyTypeException(String str) {
        super(str);
    }

    public PropertyTypeException(Property.PropertyType propertyType, Property.PropertyType propertyType2) {
        super("Expected a property of type " + String.valueOf(propertyType) + ", but received " + String.valueOf(propertyType2));
    }

    public PropertyTypeException(Property.ValueType valueType, Property.ValueType valueType2) {
        super("Expected a property with a " + String.valueOf(valueType) + " value, but received a " + String.valueOf(valueType2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PropertyTypeException(Property.PropertyType propertyType) {
        String str;
        if (propertyType != Property.PropertyType.COMPOSITE) {
            str = String.valueOf(propertyType) + " is not supported";
        } else {
            str = "Composite Properties must not include other Composite Properties as either Primary or Secondary";
        }
        super(str);
    }
}
