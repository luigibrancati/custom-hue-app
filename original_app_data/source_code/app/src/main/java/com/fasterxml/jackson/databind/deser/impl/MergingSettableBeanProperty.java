package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class MergingSettableBeanProperty extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMember _accessor;

    public MergingSettableBeanProperty(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        super(settableBeanProperty);
        this._accessor = annotatedMember;
    }

    public static MergingSettableBeanProperty construct(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        return new MergingSettableBeanProperty(settableBeanProperty, annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object value = this._accessor.getValue(obj);
        Object objDeserialize = value == null ? this.delegate.deserialize(jsonParser, deserializationContext) : this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        if (objDeserialize != value) {
            this.delegate.set(obj, objDeserialize);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object value = this._accessor.getValue(obj);
        Object objDeserialize = value == null ? this.delegate.deserialize(jsonParser, deserializationContext) : this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        return (objDeserialize == value || objDeserialize == null) ? obj : this.delegate.setAndReturn(obj, objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) {
        if (obj2 != null) {
            this.delegate.set(obj, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) {
        return obj2 != null ? this.delegate.setAndReturn(obj, obj2) : obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        return new MergingSettableBeanProperty(settableBeanProperty, this._accessor);
    }

    public MergingSettableBeanProperty(MergingSettableBeanProperty mergingSettableBeanProperty, SettableBeanProperty settableBeanProperty) {
        super(settableBeanProperty);
        this._accessor = mergingSettableBeanProperty._accessor;
    }
}
