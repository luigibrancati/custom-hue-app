package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ExternalTypeHandler {
    private final JavaType _beanType;
    private final Map<String, Object> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private final JavaType _beanType;
        private final List<ExtTypedProperty> _properties = new ArrayList();
        private final Map<String, Object> _nameToPropertyIndex = new HashMap();

        public Builder(JavaType javaType) {
            this._beanType = javaType;
        }

        private void _addPropertyIndex(String str, Integer num) {
            Object obj = this._nameToPropertyIndex.get(str);
            if (obj == null) {
                this._nameToPropertyIndex.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this._nameToPropertyIndex.put(str, linkedList);
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer numValueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            _addPropertyIndex(settableBeanProperty.getName(), numValueOf);
            _addPropertyIndex(typeDeserializer.getPropertyName(), numValueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i10 = 0; i10 < size; i10++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i10);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (settableBeanPropertyFind != null) {
                    extTypedProperty.linkTypeProperty(settableBeanPropertyFind);
                }
                extTypedPropertyArr[i10] = extTypedProperty;
            }
            return new ExternalTypeHandler(this._beanType, extTypedPropertyArr, this._nameToPropertyIndex, null, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            return this._typeDeserializer.getDefaultImpl() != null;
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }
    }

    public ExternalTypeHandler(JavaType javaType, ExtTypedProperty[] extTypedPropertyArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._beanType = javaType;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = map;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    private final boolean _handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i10) throws JsonGenerationException {
        if (!this._properties[i10].hasTypePropertyName(str)) {
            return false;
        }
        if (obj == null || this._tokens[i10] == null) {
            this._typeIds[i10] = str2;
            return true;
        }
        _deserializeAndSet(jsonParser, deserializationContext, obj, i10, str2);
        this._tokens[i10] = null;
        return true;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i10, String str) throws JsonGenerationException {
        JsonParser jsonParserAsParser = this._tokens[i10].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(jsonParserAsParser);
        tokenBuffer.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBuffer.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        return this._properties[i10].getProperty().deserialize(jsonParserAsParser2, deserializationContext);
    }

    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i10, String str) throws JsonGenerationException {
        JsonParser jsonParserAsParser = this._tokens[i10].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i10].getProperty().set(obj, null);
            return;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(jsonParserAsParser);
        tokenBuffer.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBuffer.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        this._properties[i10].getProperty().deserializeAndSet(jsonParserAsParser2, deserializationContext, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10, java.lang.Object r11) throws com.fasterxml.jackson.databind.exc.MismatchedInputException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r0 = r8._properties
            int r0 = r0.length
            r1 = 0
            r6 = r1
        L5:
            if (r6 >= r0) goto L8f
            java.lang.String[] r1 = r8._typeIds
            r1 = r1[r6]
            if (r1 != 0) goto L72
            com.fasterxml.jackson.databind.util.TokenBuffer[] r2 = r8._tokens
            r2 = r2[r6]
            if (r2 != 0) goto L19
        L13:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            goto Lb2
        L19:
            com.fasterxml.jackson.core.JsonToken r3 = r2.firstToken()
            boolean r3 = r3.isScalarValue()
            if (r3 == 0) goto L6c
            com.fasterxml.jackson.core.JsonParser r2 = r2.asParser(r9)
            r2.nextToken()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r3 = r8._properties
            r3 = r3[r6]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r3 = r3.getProperty()
            com.fasterxml.jackson.databind.JavaType r4 = r3.getType()
            java.lang.Object r2 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(r2, r10, r4)
            if (r2 == 0) goto L40
            r3.set(r11, r2)
            goto L13
        L40:
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r2 = r8._properties
            r2 = r2[r6]
            boolean r2 = r2.hasDefaultType()
            if (r2 != 0) goto L64
            java.lang.Class r2 = r11.getClass()
            java.lang.String r3 = r3.getName()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r4 = r8._properties
            r4 = r4[r6]
            java.lang.String r4 = r4.getTypePropertyName()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "Missing external type id property '%s'"
            r10.reportPropertyInputMismatch(r2, r3, r5, r4)
            goto L6c
        L64:
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r1 = r8._properties
            r1 = r1[r6]
            java.lang.String r1 = r1.getDefaultTypeId()
        L6c:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r1
            goto Laf
        L72:
            com.fasterxml.jackson.databind.util.TokenBuffer[] r2 = r8._tokens
            r2 = r2[r6]
            if (r2 != 0) goto L6c
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r9 = r8._properties
            r9 = r9[r6]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r9 = r9.getProperty()
            boolean r0 = r9.isRequired()
            if (r0 != 0) goto L91
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r0 = r10.isEnabled(r0)
            if (r0 == 0) goto L8f
            goto L91
        L8f:
            r5 = r11
            goto Lba
        L91:
            java.lang.Class r0 = r11.getClass()
            java.lang.String r1 = r9.getName()
            java.lang.String r9 = r9.getName()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r8 = r8._properties
            r8 = r8[r6]
            java.lang.String r8 = r8.getTypePropertyName()
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r8}
            java.lang.String r9 = "Missing property '%s' for external type id '%s'"
            r10.reportPropertyInputMismatch(r0, r1, r9, r8)
            return r11
        Laf:
            r2._deserializeAndSet(r3, r4, r5, r6, r7)
        Lb2:
            int r6 = r6 + 1
            r8 = r2
            r9 = r3
            r10 = r4
            r11 = r5
            goto L5
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, java.lang.String r12, java.lang.Object r13) throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r9 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9._nameToPropertyIndex
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto La
            r9 = 0
            return r9
        La:
            boolean r1 = r0 instanceof java.util.List
            r2 = 1
            if (r1 == 0) goto L73
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r13 = r0.iterator()
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r1 = r9._properties
            int r3 = r0.intValue()
            r1 = r1[r3]
            boolean r12 = r1.hasTypePropertyName(r12)
            if (r12 == 0) goto L4d
            java.lang.String r11 = r10.getText()
            r10.skipChildren()
            java.lang.String[] r10 = r9._typeIds
            int r12 = r0.intValue()
            r10[r12] = r11
        L38:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L72
            java.lang.String[] r10 = r9._typeIds
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10[r12] = r11
            goto L38
        L4d:
            com.fasterxml.jackson.databind.util.TokenBuffer r12 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r12.<init>(r10, r11)
            r12.copyCurrentStructure(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r10 = r9._tokens
            int r11 = r0.intValue()
            r10[r11] = r12
        L5d:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L72
            com.fasterxml.jackson.databind.util.TokenBuffer[] r10 = r9._tokens
            java.lang.Object r11 = r13.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10[r11] = r12
            goto L5d
        L72:
            return r2
        L73:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r7 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r0 = r9._properties
            r0 = r0[r7]
            boolean r12 = r0.hasTypePropertyName(r12)
            if (r12 == 0) goto L97
            java.lang.String[] r12 = r9._typeIds
            java.lang.String r0 = r10.getText()
            r12[r7] = r0
            r10.skipChildren()
            if (r13 == 0) goto Lbd
            com.fasterxml.jackson.databind.util.TokenBuffer[] r12 = r9._tokens
            r12 = r12[r7]
            if (r12 == 0) goto Lbd
            goto Lab
        L97:
            com.fasterxml.jackson.databind.util.TokenBuffer r12 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r12.<init>(r10, r11)
            r12.copyCurrentStructure(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r0 = r9._tokens
            r0[r7] = r12
            if (r13 == 0) goto Lbd
            java.lang.String[] r12 = r9._typeIds
            r12 = r12[r7]
            if (r12 == 0) goto Lbd
        Lab:
            java.lang.String[] r12 = r9._typeIds
            r8 = r12[r7]
            r0 = 0
            r12[r7] = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r3._deserializeAndSet(r4, r5, r6, r7, r8)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r9 = r3._tokens
            r9[r7] = r0
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z10 = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (!(obj2 instanceof List)) {
            return _handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            ExternalTypeHandler externalTypeHandler = this;
            JsonParser jsonParser2 = jsonParser;
            DeserializationContext deserializationContext2 = deserializationContext;
            String str2 = str;
            Object obj3 = obj;
            if (externalTypeHandler._handleTypePropertyValue(jsonParser2, deserializationContext2, str2, obj3, text, ((Integer) it.next()).intValue())) {
                z10 = true;
            }
            this = externalTypeHandler;
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            str = str2;
            obj = obj3;
        }
        return z10;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._beanType = externalTypeHandler._beanType;
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r13, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r14) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }
}
