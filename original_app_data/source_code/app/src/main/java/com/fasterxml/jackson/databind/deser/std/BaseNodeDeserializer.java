package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.RawValue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    public final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        Object embeddedObject = jsonParser.getEmbeddedObject();
        return embeddedObject == null ? jsonNodeFactory.nullNode() : embeddedObject.getClass() == byte[].class ? jsonNodeFactory.binaryNode((byte[]) embeddedObject) : embeddedObject instanceof RawValue ? jsonNodeFactory.rawValueNode((RawValue) embeddedObject) : embeddedObject instanceof JsonNode ? (JsonNode) embeddedObject : jsonNodeFactory.pojoNode(embeddedObject);
    }

    public final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.BIG_DECIMAL ? jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.isNaN() ? jsonNodeFactory.numberNode(jsonParser.getDoubleValue()) : jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : numberType == JsonParser.NumberType.FLOAT ? jsonNodeFactory.numberNode(jsonParser.getFloatValue()) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
    }

    public final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        JsonParser.NumberType numberType = (StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) != 0 ? DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.BIG_INTEGER : DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.LONG : jsonParser.getNumberType() : jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.INT ? jsonNodeFactory.numberNode(jsonParser.getIntValue()) : numberType == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.getLongValue()) : jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws MismatchedInputException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
    }

    public final JsonNode deserializeAny(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 2) {
            return jsonNodeFactory.objectNode();
        }
        switch (iCurrentTokenId) {
            case 5:
                return deserializeObjectAtName(jsonParser, deserializationContext, jsonNodeFactory);
            case 6:
                return jsonNodeFactory.textNode(jsonParser.getText());
            case 7:
                return _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
            case 9:
                return jsonNodeFactory.booleanNode(true);
            case 10:
                return jsonNodeFactory.booleanNode(false);
            case 11:
                return jsonNodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    public final ArrayNode deserializeArray(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        ArrayNode arrayNode = jsonNodeFactory.arrayNode();
        while (true) {
            switch (jsonParser.nextToken().id()) {
                case 1:
                    arrayNode.add(deserializeObject(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    arrayNode.add(deserializeAny(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 3:
                    arrayNode.add(deserializeArray(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 4:
                    return arrayNode;
                case 6:
                    arrayNode.add(jsonNodeFactory.textNode(jsonParser.getText()));
                    break;
                case 7:
                    arrayNode.add(_fromInt(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 9:
                    arrayNode.add(jsonNodeFactory.booleanNode(true));
                    break;
                case 10:
                    arrayNode.add(jsonNodeFactory.booleanNode(false));
                    break;
                case 11:
                    arrayNode.add(jsonNodeFactory.nullNode());
                    break;
                case 12:
                    arrayNode.add(_fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
            }
        }
    }

    public final ObjectNode deserializeObject(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws MismatchedInputException {
        JsonNode jsonNodeDeserializeObject;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String strNextFieldName = jsonParser.nextFieldName();
        while (strNextFieldName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenNextToken.id();
            if (iId == 1) {
                jsonNodeDeserializeObject = this.deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 3) {
                jsonNodeDeserializeObject = this.deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 6) {
                jsonNodeDeserializeObject = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (iId != 7) {
                switch (iId) {
                    case 9:
                        jsonNodeDeserializeObject = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNodeDeserializeObject = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        jsonNodeDeserializeObject = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        jsonNodeDeserializeObject = this._fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        jsonNodeDeserializeObject = this.deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                jsonNodeDeserializeObject = this._fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            JsonNode jsonNode = jsonNodeDeserializeObject;
            JsonNode jsonNodeReplace = objectNode.replace(strNextFieldName, jsonNode);
            BaseNodeDeserializer<T> baseNodeDeserializer = this;
            JsonParser jsonParser2 = jsonParser;
            DeserializationContext deserializationContext2 = deserializationContext;
            JsonNodeFactory jsonNodeFactory2 = jsonNodeFactory;
            if (jsonNodeReplace != null) {
                baseNodeDeserializer._handleDuplicateField(jsonParser2, deserializationContext2, jsonNodeFactory2, strNextFieldName, objectNode, jsonNodeReplace, jsonNode);
            }
            strNextFieldName = jsonParser2.nextFieldName();
            this = baseNodeDeserializer;
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            jsonNodeFactory = jsonNodeFactory2;
        }
        return objectNode;
    }

    public final ObjectNode deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws MismatchedInputException {
        JsonNode jsonNodeDeserializeObject;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String currentName = jsonParser.getCurrentName();
        while (currentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenNextToken.id();
            if (iId == 1) {
                jsonNodeDeserializeObject = this.deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 3) {
                jsonNodeDeserializeObject = this.deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 6) {
                jsonNodeDeserializeObject = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (iId != 7) {
                switch (iId) {
                    case 9:
                        jsonNodeDeserializeObject = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNodeDeserializeObject = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        jsonNodeDeserializeObject = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        jsonNodeDeserializeObject = this._fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        jsonNodeDeserializeObject = this.deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                jsonNodeDeserializeObject = this._fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            JsonNode jsonNode = jsonNodeDeserializeObject;
            JsonNode jsonNodeReplace = objectNode.replace(currentName, jsonNode);
            BaseNodeDeserializer<T> baseNodeDeserializer = this;
            JsonParser jsonParser2 = jsonParser;
            DeserializationContext deserializationContext2 = deserializationContext;
            JsonNodeFactory jsonNodeFactory2 = jsonNodeFactory;
            if (jsonNodeReplace != null) {
                baseNodeDeserializer._handleDuplicateField(jsonParser2, deserializationContext2, jsonNodeFactory2, currentName, objectNode, jsonNodeReplace, jsonNode);
            }
            currentName = jsonParser2.nextFieldName();
            this = baseNodeDeserializer;
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            jsonNodeFactory = jsonNodeFactory2;
        }
        return objectNode;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public final JsonNode updateArray(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (true) {
            switch (jsonParser.nextToken().id()) {
                case 1:
                    arrayNode.add(deserializeObject(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    arrayNode.add(deserializeAny(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 3:
                    arrayNode.add(deserializeArray(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 4:
                    return arrayNode;
                case 6:
                    arrayNode.add(nodeFactory.textNode(jsonParser.getText()));
                    break;
                case 7:
                    arrayNode.add(_fromInt(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 9:
                    arrayNode.add(nodeFactory.booleanNode(true));
                    break;
                case 10:
                    arrayNode.add(nodeFactory.booleanNode(false));
                    break;
                case 11:
                    arrayNode.add(nodeFactory.nullNode());
                    break;
                case 12:
                    arrayNode.add(_fromEmbedded(jsonParser, deserializationContext, nodeFactory));
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonNode updateObject(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, com.fasterxml.jackson.databind.node.ObjectNode r12) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r9 = this;
            boolean r0 = r10.isExpectedStartObjectToken()
            if (r0 == 0) goto Lc
            java.lang.String r0 = r10.nextFieldName()
        La:
            r5 = r0
            goto L20
        Lc:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            boolean r0 = r10.hasToken(r0)
            if (r0 != 0) goto L1b
            java.lang.Object r9 = r9.deserialize(r10, r11)
            com.fasterxml.jackson.databind.JsonNode r9 = (com.fasterxml.jackson.databind.JsonNode) r9
            return r9
        L1b:
            java.lang.String r0 = r10.getCurrentName()
            goto La
        L20:
            if (r5 == 0) goto Lb7
            com.fasterxml.jackson.core.JsonToken r0 = r10.nextToken()
            com.fasterxml.jackson.databind.JsonNode r7 = r12.get(r5)
            if (r7 == 0) goto L53
            boolean r1 = r7 instanceof com.fasterxml.jackson.databind.node.ObjectNode
            if (r1 == 0) goto L42
            r0 = r7
            com.fasterxml.jackson.databind.node.ObjectNode r0 = (com.fasterxml.jackson.databind.node.ObjectNode) r0
            com.fasterxml.jackson.databind.JsonNode r0 = r9.updateObject(r10, r11, r0)
            if (r0 == r7) goto L3c
            r12.set(r5, r0)
        L3c:
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            goto Lad
        L42:
            boolean r1 = r7 instanceof com.fasterxml.jackson.databind.node.ArrayNode
            if (r1 == 0) goto L53
            r0 = r7
            com.fasterxml.jackson.databind.node.ArrayNode r0 = (com.fasterxml.jackson.databind.node.ArrayNode) r0
            com.fasterxml.jackson.databind.JsonNode r0 = r9.updateArray(r10, r11, r0)
            if (r0 == r7) goto L3c
            r12.set(r5, r0)
            goto L3c
        L53:
            if (r0 != 0) goto L57
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
        L57:
            com.fasterxml.jackson.databind.node.JsonNodeFactory r4 = r11.getNodeFactory()
            int r0 = r0.id()
            r1 = 1
            if (r0 == r1) goto L9c
            r2 = 3
            if (r0 == r2) goto L97
            r2 = 6
            if (r0 == r2) goto L8e
            r2 = 7
            if (r0 == r2) goto L89
            switch(r0) {
                case 9: goto L84;
                case 10: goto L7e;
                case 11: goto L79;
                case 12: goto L74;
                default: goto L6e;
            }
        L6e:
            com.fasterxml.jackson.databind.JsonNode r0 = r9.deserializeAny(r10, r11, r4)
        L72:
            r8 = r0
            goto La1
        L74:
            com.fasterxml.jackson.databind.JsonNode r0 = r9._fromEmbedded(r10, r11, r4)
            goto L72
        L79:
            com.fasterxml.jackson.databind.node.NullNode r0 = r4.nullNode()
            goto L72
        L7e:
            r0 = 0
            com.fasterxml.jackson.databind.node.BooleanNode r0 = r4.booleanNode(r0)
            goto L72
        L84:
            com.fasterxml.jackson.databind.node.BooleanNode r0 = r4.booleanNode(r1)
            goto L72
        L89:
            com.fasterxml.jackson.databind.JsonNode r0 = r9._fromInt(r10, r11, r4)
            goto L72
        L8e:
            java.lang.String r0 = r10.getText()
            com.fasterxml.jackson.databind.node.TextNode r0 = r4.textNode(r0)
            goto L72
        L97:
            com.fasterxml.jackson.databind.node.ArrayNode r0 = r9.deserializeArray(r10, r11, r4)
            goto L72
        L9c:
            com.fasterxml.jackson.databind.node.ObjectNode r0 = r9.deserializeObject(r10, r11, r4)
            goto L72
        La1:
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            if (r7 == 0) goto Laa
            r1._handleDuplicateField(r2, r3, r4, r5, r6, r7, r8)
        Laa:
            r6.set(r5, r8)
        Lad:
            java.lang.String r5 = r2.nextFieldName()
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r6
            goto L20
        Lb7:
            r6 = r12
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.updateObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.ObjectNode):com.fasterxml.jackson.databind.JsonNode");
    }
}
