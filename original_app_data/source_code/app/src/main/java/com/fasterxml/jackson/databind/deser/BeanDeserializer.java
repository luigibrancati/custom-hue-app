package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    private volatile transient NameTransformer _currentlyTransforming;
    protected transient Exception _nullFromCreator;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BeanReferring extends ReadableObjectId.Referring {
        private Object _bean;
        private final DeserializationContext _context;
        private final SettableBeanProperty _prop;

        public BeanReferring(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, PropertyValueBuffer propertyValueBuffer, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this._context = deserializationContext;
            this._prop = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws MismatchedInputException {
            if (this._bean == null) {
                DeserializationContext deserializationContext = this._context;
                SettableBeanProperty settableBeanProperty = this._prop;
                deserializationContext.reportInputMismatch(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this._prop.getDeclaringClass().getName());
            }
            this._prop.set(this._bean, obj2);
        }

        public void setBean(Object obj) {
            this._bean = obj;
        }
    }

    public BeanDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z10, boolean z11) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, hashSet, z10, z11);
    }

    private BeanReferring handleUnresolvedReference(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyValueBuffer propertyValueBuffer, UnresolvedForwardReference unresolvedForwardReference) {
        BeanReferring beanReferring = new BeanReferring(deserializationContext, unresolvedForwardReference, settableBeanProperty.getType(), propertyValueBuffer, settableBeanProperty);
        unresolvedForwardReference.getRoid().appendReferring(beanReferring);
        return beanReferring;
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws JsonMappingException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, objCreateUsingDefault, currentName, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, currentName);
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return objCreateUsingDefault;
    }

    public Exception _creatorReturnedNullException() {
        if (this._nullFromCreator == null) {
            this._nullFromCreator = new NullPointerException("JSON Creator returned null");
        }
        return this._nullFromCreator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer = this._arrayDelegateDeserializer;
        if (jsonDeserializer != null || (jsonDeserializer = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return objCreateUsingArrayDelegate;
        }
        if (!deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            }
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                return null;
            }
            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        if (jsonTokenNextToken == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return null;
        }
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != jsonToken) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return objDeserialize;
    }

    public final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        if (jsonToken != null) {
            switch (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()]) {
                case 1:
                    return deserializeFromString(jsonParser, deserializationContext);
                case 2:
                    return deserializeFromNumber(jsonParser, deserializationContext);
                case 3:
                    return deserializeFromDouble(jsonParser, deserializationContext);
                case 4:
                    return deserializeFromEmbedded(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return deserializeFromBoolean(jsonParser, deserializationContext);
                case 7:
                    return deserializeFromNull(jsonParser, deserializationContext);
                case 8:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    return this._vanillaProcessing ? vanillaDeserialize(jsonParser, deserializationContext, jsonToken) : this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objBuild;
        Object objWrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer propertyValueBufferStartBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken currentToken = jsonParser.getCurrentToken();
        ArrayList arrayList = null;
        TokenBuffer tokenBuffer = null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (!propertyValueBufferStartBuilding.readIdProperty(currentName)) {
                SettableBeanProperty settableBeanPropertyFindCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
                if (settableBeanPropertyFindCreatorProperty == null) {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
                    if (settableBeanPropertyFind != null) {
                        try {
                            propertyValueBufferStartBuilding.bufferProperty(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                        } catch (UnresolvedForwardReference e10) {
                            BeanReferring beanReferringHandleUnresolvedReference = handleUnresolvedReference(deserializationContext, settableBeanPropertyFind, propertyValueBufferStartBuilding, e10);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(beanReferringHandleUnresolvedReference);
                        }
                    } else {
                        Set<String> set = this._ignorableProps;
                        if (set == null || !set.contains(currentName)) {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                try {
                                    propertyValueBufferStartBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                                } catch (Exception e11) {
                                    wrapAndThrow(e11, this._beanType.getRawClass(), currentName, deserializationContext);
                                }
                            } else {
                                if (tokenBuffer == null) {
                                    tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                                }
                                tokenBuffer.writeFieldName(currentName);
                                tokenBuffer.copyCurrentStructure(jsonParser);
                            }
                        } else {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                        }
                    }
                } else if (activeView != null && !settableBeanPropertyFindCreatorProperty.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else if (propertyValueBufferStartBuilding.assignParameter(settableBeanPropertyFindCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFindCreatorProperty))) {
                    jsonParser.nextToken();
                    try {
                        objWrapInstantiationProblem = propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
                    } catch (Exception e12) {
                        objWrapInstantiationProblem = wrapInstantiationProblem(e12, deserializationContext);
                    }
                    if (objWrapInstantiationProblem == null) {
                        return deserializationContext.handleInstantiationProblem(handledType(), null, _creatorReturnedNullException());
                    }
                    jsonParser.setCurrentValue(objWrapInstantiationProblem);
                    if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                        return handlePolymorphic(jsonParser, deserializationContext, objWrapInstantiationProblem, tokenBuffer);
                    }
                    if (tokenBuffer != null) {
                        objWrapInstantiationProblem = handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, tokenBuffer);
                    }
                    return deserialize(jsonParser, deserializationContext, objWrapInstantiationProblem);
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            objBuild = propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
        } catch (Exception e13) {
            wrapInstantiationProblem(e13, deserializationContext);
            objBuild = null;
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objBuild);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BeanReferring) it.next()).setBean(objBuild);
            }
        }
        return tokenBuffer != null ? objBuild.getClass() != this._beanType.getRawClass() ? handlePolymorphic(null, deserializationContext, objBuild, tokenBuffer) : handleUnknownProperties(deserializationContext, objBuild, tokenBuffer) : objBuild;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e10) {
            this.wrapAndThrow(e10, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            return null;
        }
    }

    @Deprecated
    public Object _missingToken(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        throw deserializationContext.endOfInputException(handledType());
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartObjectToken()) {
            return _deserializeOther(jsonParser, deserializationContext, jsonParser.getCurrentToken());
        }
        if (this._vanillaProcessing) {
            return vanillaDeserialize(jsonParser, deserializationContext, jsonParser.nextToken());
        }
        jsonParser.nextToken();
        return this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeFromNull(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.requiresCustomCodec()) {
            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeEndObject();
        JsonParser jsonParserAsParser = tokenBuffer.asParser(jsonParser);
        jsonParserAsParser.nextToken();
        Object objVanillaDeserialize = this._vanillaProcessing ? vanillaDeserialize(jsonParserAsParser, deserializationContext, JsonToken.END_OBJECT) : deserializeFromObject(jsonParserAsParser, deserializationContext);
        jsonParserAsParser.close();
        return objVanillaDeserialize;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        Class<?> activeView;
        Object objectId;
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null && objectIdReader.maySerializeAsObject() && jsonParser.hasTokenId(5) && this._objectIdReader.isValidReferencePropertyName(jsonParser.getCurrentName(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (this._nonStandardCreation) {
            return this._unwrappedPropertyHandler != null ? deserializeWithUnwrapped(jsonParser, deserializationContext) : this._externalTypeIdHandler != null ? deserializeWithExternalTypeId(jsonParser, deserializationContext) : deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        if (jsonParser.canReadObjectId() && (objectId = jsonParser.getObjectId()) != null) {
            _handleTypedObjectId(jsonParser, deserializationContext, objCreateUsingDefault, objectId);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, objCreateUsingDefault, currentName, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, currentName);
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return objCreateUsingDefault;
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonGenerationException, JsonMappingException {
        ExternalTypeHandler externalTypeHandlerStart = this._externalTypeIdHandler.start();
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer propertyValueBufferStartBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyFindCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (settableBeanPropertyFindCreatorProperty != null) {
                if (!externalTypeHandlerStart.handlePropertyValue(jsonParser, deserializationContext, currentName, null) && propertyValueBufferStartBuilding.assignParameter(settableBeanPropertyFindCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFindCreatorProperty))) {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    try {
                        Object objBuild = propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
                        while (jsonTokenNextToken == JsonToken.FIELD_NAME) {
                            jsonParser.nextToken();
                            tokenBuffer.copyCurrentStructure(jsonParser);
                            jsonTokenNextToken = jsonParser.nextToken();
                        }
                        if (objBuild.getClass() == this._beanType.getRawClass()) {
                            return externalTypeHandlerStart.complete(jsonParser, deserializationContext, objBuild);
                        }
                        JavaType javaType = this._beanType;
                        return deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, objBuild.getClass()));
                    } catch (Exception e10) {
                        wrapAndThrow(e10, this._beanType.getRawClass(), currentName, deserializationContext);
                    }
                }
            } else if (!propertyValueBufferStartBuilding.readIdProperty(currentName)) {
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
                if (settableBeanPropertyFind != null) {
                    propertyValueBufferStartBuilding.bufferProperty(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                } else if (!externalTypeHandlerStart.handlePropertyValue(jsonParser, deserializationContext, currentName, null)) {
                    Set<String> set = this._ignorableProps;
                    if (set == null || !set.contains(currentName)) {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            propertyValueBufferStartBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        } else {
                            handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, currentName);
                        }
                    } else {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        try {
            return externalTypeHandlerStart.complete(jsonParser, deserializationContext, propertyValueBufferStartBuilding, propertyBasedCreator);
        } catch (Exception e11) {
            return this.wrapInstantiationProblem(e11, deserializationContext);
        }
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer propertyValueBufferStartBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyFindCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (settableBeanPropertyFindCreatorProperty != null) {
                if (propertyValueBufferStartBuilding.assignParameter(settableBeanPropertyFindCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFindCreatorProperty))) {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    try {
                        objWrapInstantiationProblem = propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
                    } catch (Exception e10) {
                        objWrapInstantiationProblem = wrapInstantiationProblem(e10, deserializationContext);
                    }
                    jsonParser.setCurrentValue(objWrapInstantiationProblem);
                    while (jsonTokenNextToken == JsonToken.FIELD_NAME) {
                        tokenBuffer.copyCurrentStructure(jsonParser);
                        jsonTokenNextToken = jsonParser.nextToken();
                    }
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    if (jsonTokenNextToken != jsonToken) {
                        deserializationContext.reportWrongTokenException(this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                    }
                    tokenBuffer.writeEndObject();
                    if (objWrapInstantiationProblem.getClass() == this._beanType.getRawClass()) {
                        return this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, objWrapInstantiationProblem, tokenBuffer);
                    }
                    deserializationContext.reportInputMismatch(settableBeanPropertyFindCreatorProperty, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                    return null;
                }
            } else if (!propertyValueBufferStartBuilding.readIdProperty(currentName)) {
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
                if (settableBeanPropertyFind != null) {
                    propertyValueBufferStartBuilding.bufferProperty(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                } else {
                    Set<String> set = this._ignorableProps;
                    if (set != null && set.contains(currentName)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                    } else if (this._anySetter == null) {
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.copyCurrentStructure(jsonParser);
                    } else {
                        TokenBuffer tokenBufferAsCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.append(tokenBufferAsCopyOfValue);
                        try {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            propertyValueBufferStartBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(tokenBufferAsCopyOfValue.asParserOnFirstToken(), deserializationContext));
                        } catch (Exception e11) {
                            wrapAndThrow(e11, this._beanType.getRawClass(), currentName, deserializationContext);
                        }
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            return this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding), tokenBuffer);
        } catch (Exception e12) {
            wrapInstantiationProblem(e12, deserializationContext);
            return null;
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer != null ? this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext)) : deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonGenerationException, JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        String currentName = jsonParser.hasTokenId(5) ? jsonParser.getCurrentName() : null;
        while (currentName != null) {
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
            if (settableBeanPropertyFind == null) {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, currentName);
                } else if (this._anySetter == null) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                } else {
                    TokenBuffer tokenBufferAsCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.append(tokenBufferAsCopyOfValue);
                    try {
                        this._anySetter.deserializeAndSet(tokenBufferAsCopyOfValue.asParserOnFirstToken(), deserializationContext, objCreateUsingDefault, currentName);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, objCreateUsingDefault, currentName, deserializationContext);
                    }
                }
            } else if (activeView == null || settableBeanPropertyFind.visibleInView(activeView)) {
                try {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e11) {
                    wrapAndThrow(e11, objCreateUsingDefault, currentName, deserializationContext);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, objCreateUsingDefault, tokenBuffer);
        return objCreateUsingDefault;
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws JsonMappingException {
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
                if (settableBeanPropertyFind == null) {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, currentName);
                } else if (settableBeanPropertyFind.visibleInView(cls)) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, currentName, deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this._currentlyTransforming == nameTransformer) {
            return this;
        }
        this._currentlyTransforming = nameTransformer;
        try {
            return new BeanDeserializer(this, nameTransformer);
        } finally {
            this._currentlyTransforming = null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public /* bridge */ /* synthetic */ BeanDeserializerBase withIgnorableProperties(Set set) {
        return withIgnorableProperties((Set<String>) set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z10) {
        return new BeanDeserializer(this, z10);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withIgnorableProperties(Set<String> set) {
        return new BeanDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z10) {
        super(beanDeserializerBase, z10);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        ExternalTypeHandler externalTypeHandlerStart = this._externalTypeIdHandler.start();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
            if (settableBeanPropertyFind != null) {
                if (jsonTokenNextToken.isScalarValue()) {
                    externalTypeHandlerStart.handleTypePropertyValue(jsonParser, deserializationContext, currentName, obj);
                }
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, currentName, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                } else if (!externalTypeHandlerStart.handlePropertyValue(jsonParser, deserializationContext, currentName, obj)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                        } catch (Exception e11) {
                            wrapAndThrow(e11, obj, currentName, deserializationContext);
                        }
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        return externalTypeHandlerStart.complete(jsonParser, deserializationContext, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object deserialize(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4, java.lang.Object r5) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r3.setCurrentValue(r5)
            com.fasterxml.jackson.databind.deser.impl.ValueInjector[] r0 = r2._injectables
            if (r0 == 0) goto La
            r2.injectValues(r4, r5)
        La:
            com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler r0 = r2._unwrappedPropertyHandler
            if (r0 == 0) goto L13
            java.lang.Object r2 = r2.deserializeWithUnwrapped(r3, r4, r5)
            return r2
        L13:
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler r0 = r2._externalTypeIdHandler
            if (r0 == 0) goto L1c
            java.lang.Object r2 = r2.deserializeWithExternalTypeId(r3, r4, r5)
            return r2
        L1c:
            boolean r0 = r3.isExpectedStartObjectToken()
            if (r0 == 0) goto L29
            java.lang.String r0 = r3.nextFieldName()
            if (r0 != 0) goto L34
            goto L60
        L29:
            r0 = 5
            boolean r0 = r3.hasTokenId(r0)
            if (r0 == 0) goto L60
            java.lang.String r0 = r3.getCurrentName()
        L34:
            boolean r1 = r2._needViewProcesing
            if (r1 == 0) goto L43
            java.lang.Class r1 = r4.getActiveView()
            if (r1 == 0) goto L43
            java.lang.Object r2 = r2.deserializeWithView(r3, r4, r5, r1)
            return r2
        L43:
            r3.nextToken()
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r1 = r2._beanProperties
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r1 = r1.find(r0)
            if (r1 == 0) goto L57
            r1.deserializeAndSet(r3, r4, r5)     // Catch: java.lang.Exception -> L52
            goto L5a
        L52:
            r1 = move-exception
            r2.wrapAndThrow(r1, r5, r0, r4)
            goto L5a
        L57:
            r2.handleUnknownVanilla(r3, r4, r5, r0)
        L5a:
            java.lang.String r0 = r3.nextFieldName()
            if (r0 != 0) goto L43
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonGenerationException, JsonMappingException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, currentName, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                } else if (this._anySetter == null) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                } else {
                    TokenBuffer tokenBufferAsCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.append(tokenBufferAsCopyOfValue);
                    try {
                        this._anySetter.deserializeAndSet(tokenBufferAsCopyOfValue.asParserOnFirstToken(), deserializationContext, obj, currentName);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, currentName, deserializationContext);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, obj, tokenBuffer);
        return obj;
    }
}
