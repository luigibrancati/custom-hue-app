package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.JsonPointerBasedFilter;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ObjectReader extends ObjectCodec implements Versioned, Serializable {
    private static final long serialVersionUID = 2;
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders;
    private final TokenFilter _filter;
    protected final InjectableValues _injectableValues;
    protected transient JavaType _jsonNodeType;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    public Object _bind(JsonParser jsonParser, Object obj) throws MismatchedInputException, InvalidDefinitionException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            }
        } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
            JsonDeserializer<Object> jsonDeserializer_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext);
            obj = this._unwrapRoot ? _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType, jsonDeserializer_findRootDeserializer) : obj == null ? jsonDeserializer_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext) : jsonDeserializer_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, obj);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
        }
        return obj;
    }

    public Object _bindAndClose(JsonParser jsonParser) {
        Object objDeserialize;
        try {
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                objDeserialize = this._valueToUpdate;
                if (objDeserialize == null) {
                    objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
                }
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                objDeserialize = this._valueToUpdate;
            } else {
                JsonDeserializer<Object> jsonDeserializer_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext);
                if (this._unwrapRoot) {
                    objDeserialize = _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType, jsonDeserializer_findRootDeserializer);
                } else {
                    Object obj = this._valueToUpdate;
                    if (obj == null) {
                        objDeserialize = jsonDeserializer_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
                    } else {
                        jsonDeserializer_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, obj);
                        objDeserialize = this._valueToUpdate;
                    }
                }
            }
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return objDeserialize;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final JsonNode _bindAndCloseAsTree(JsonParser jsonParser) {
        try {
            JsonNode jsonNode_bindAsTree = _bindAsTree(jsonParser);
            if (jsonParser != null) {
                jsonParser.close();
            }
            return jsonNode_bindAsTree;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public <T> MappingIterator<T> _bindAndReadValues(JsonParser jsonParser) {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        jsonParser.nextToken();
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public final JsonNode _bindAsTree(JsonParser jsonParser) throws MismatchedInputException, InvalidDefinitionException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext;
        JsonNode jsonNodeNullNode;
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            return this._config.getNodeFactory().missingNode();
        }
        DeserializationConfig deserializationConfig = this._config;
        DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_TRAILING_TOKENS;
        boolean zIsEnabled = deserializationConfig.isEnabled(deserializationFeature);
        if (currentToken == JsonToken.VALUE_NULL) {
            jsonNodeNullNode = this._config.getNodeFactory().nullNode();
            if (!zIsEnabled) {
                return jsonNodeNullNode;
            }
            defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        } else {
            defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonDeserializer<Object> jsonDeserializer_findTreeDeserializer = _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext);
            jsonNodeNullNode = this._unwrapRoot ? (JsonNode) _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType(), jsonDeserializer_findTreeDeserializer) : (JsonNode) jsonDeserializer_findTreeDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
        }
        if (this._config.isEnabled(deserializationFeature)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return jsonNodeNullNode;
    }

    public final JsonNode _bindAsTreeOrNull(JsonParser jsonParser) throws MismatchedInputException, InvalidDefinitionException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext;
        JsonNode jsonNodeNullNode;
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            return null;
        }
        boolean zIsEnabled = this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        if (currentToken == JsonToken.VALUE_NULL) {
            jsonNodeNullNode = this._config.getNodeFactory().nullNode();
            if (!zIsEnabled) {
                return jsonNodeNullNode;
            }
            defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        } else {
            defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonDeserializer<Object> jsonDeserializer_findTreeDeserializer = _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext);
            jsonNodeNullNode = this._unwrapRoot ? (JsonNode) _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType(), jsonDeserializer_findTreeDeserializer) : (JsonNode) jsonDeserializer_findTreeDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
        }
        if (zIsEnabled) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return jsonNodeNullNode;
    }

    public JsonParser _considerFilter(JsonParser jsonParser, boolean z10) {
        return (this._filter == null || FilteringParserDelegate.class.isInstance(jsonParser)) ? jsonParser : new FilteringParserDelegate(jsonParser, this._filter, false, z10);
    }

    public Object _detectBindAndClose(byte[] bArr, int i10, int i11) throws JsonParseException {
        DataFormatReaders.Match matchFindFormat = this._dataFormatReaders.findFormat(bArr, i10, i11);
        if (!matchFindFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, matchFindFormat);
        }
        return matchFindFormat.getReader()._bindAndClose(matchFindFormat.createParserWithMatch());
    }

    public JsonNode _detectBindAndCloseAsTree(InputStream inputStream) throws JsonParseException {
        DataFormatReaders.Match matchFindFormat = this._dataFormatReaders.findFormat(inputStream);
        if (!matchFindFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, matchFindFormat);
        }
        JsonParser jsonParserCreateParserWithMatch = matchFindFormat.createParserWithMatch();
        jsonParserCreateParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return matchFindFormat.getReader()._bindAndCloseAsTree(jsonParserCreateParserWithMatch);
    }

    public <T> MappingIterator<T> _detectBindAndReadValues(DataFormatReaders.Match match, boolean z10) throws JsonParseException {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser jsonParserCreateParserWithMatch = match.createParserWithMatch();
        if (z10) {
            jsonParserCreateParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndReadValues(jsonParserCreateParserWithMatch);
    }

    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws InvalidDefinitionException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    public JsonDeserializer<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws InvalidDefinitionException {
        JavaType javaType_jsonNodeType = _jsonNodeType();
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this._rootDeserializers.get(javaType_jsonNodeType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType_jsonNodeType);
            if (jsonDeserializerFindRootValueDeserializer == null) {
                deserializationContext.reportBadDefinition(javaType_jsonNodeType, "Cannot find a deserializer for type " + javaType_jsonNodeType);
            }
            this._rootDeserializers.put(javaType_jsonNodeType, jsonDeserializerFindRootValueDeserializer);
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    public void _initForMultiRead(DeserializationContext deserializationContext, JsonParser jsonParser) {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
    }

    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws MismatchedInputException {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null) {
            return currentToken;
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return jsonTokenNextToken;
    }

    public InputStream _inputStream(URL url) {
        return FirebasePerfUrlConnection.openStream(url);
    }

    public final JavaType _jsonNodeType() {
        JavaType javaType = this._jsonNodeType;
        if (javaType != null) {
            return javaType;
        }
        JavaType javaTypeConstructType = getTypeFactory().constructType(JsonNode.class);
        this._jsonNodeType = javaTypeConstructType;
        return javaTypeConstructType;
    }

    public ObjectReader _new(ObjectReader objectReader, JsonFactory jsonFactory) {
        return new ObjectReader(objectReader, jsonFactory);
    }

    public <T> MappingIterator<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z10) {
        return new MappingIterator<>(this._valueType, jsonParser, deserializationContext, jsonDeserializer, z10, this._valueToUpdate);
    }

    public JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            try {
                jsonDeserializerFindRootValueDeserializer = createDeserializationContext(null).findRootValueDeserializer(javaType);
                if (jsonDeserializerFindRootValueDeserializer != null) {
                    this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    public void _reportUndetectableSource(Object obj) throws JsonParseException {
        throw new JsonParseException((JsonParser) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public void _reportUnkownFormat(DataFormatReaders dataFormatReaders, DataFormatReaders.Match match) throws JsonParseException {
        throw new JsonParseException((JsonParser) null, "Cannot detect format from input, does not look like any of detectable formats " + dataFormatReaders.toString());
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) throws JsonMappingException {
        Object objDeserialize;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken != jsonToken) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonTokenNextToken != jsonToken2) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        String currentName = jsonParser.getCurrentName();
        if (!simpleName.equals(currentName)) {
            deserializationContext.reportPropertyInputMismatch(javaType, currentName, "Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
        }
        jsonParser.nextToken();
        Object obj = this._valueToUpdate;
        if (obj == null) {
            objDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
            objDeserialize = this._valueToUpdate;
        }
        JsonToken jsonTokenNextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenNextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, this._valueType);
        }
        return objDeserialize;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws MismatchedInputException {
        Object obj;
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            Class<?> clsRawClass = ClassUtil.rawClass(javaType);
            if (clsRawClass == null && (obj = this._valueToUpdate) != null) {
                clsRawClass = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(clsRawClass, jsonParser, jsonTokenNextToken);
        }
    }

    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema == null || this._parserFactory.canUseSchema(formatSchema)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + formatSchema.getClass().getName() + " for format " + this._parserFactory.getFormatName());
    }

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, deserializationConfig);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        return dataFormatReaders != null ? objectReader_new.withFormatDetection(dataFormatReaders.with(deserializationConfig)) : objectReader_new;
    }

    public ObjectReader at(String str) {
        _assertNotNull("pointerExpr", str);
        return new ObjectReader(this, new JsonPointerBasedFilter(str));
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public JsonParser createNonBlockingByteArrayParser() {
        return this._parserFactory.createNonBlockingByteArrayParser();
    }

    public JsonParser createParser(File file) {
        _assertNotNull("src", file);
        return this._parserFactory.createParser(file);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        JsonDeserializer<Object> jsonDeserializer_prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        DataFormatReaders dataFormatReadersWithType = this._dataFormatReaders;
        if (dataFormatReadersWithType != null) {
            dataFormatReadersWithType = dataFormatReadersWithType.withType(javaType);
        }
        return _new(this, this._config, javaType, jsonDeserializer_prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReadersWithType);
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) {
        _assertNotNull("p", jsonParser);
        return _bindAsTreeOrNull(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser) {
        _assertNotNull("p", jsonParser);
        return (T) _bind(jsonParser, this._valueToUpdate);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) {
        _assertNotNull("p", jsonParser);
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonParser treeAsTokens(TreeNode treeNode) {
        _assertNotNull("n", treeNode);
        return new TreeTraversingParser((JsonNode) treeNode, withValueToUpdate(null));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("n", treeNode);
        try {
            return (T) readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e10) {
            throw e10;
        } catch (IOException e11) {
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    public ObjectReader withAttribute(Object obj, Object obj2) {
        return _with(this._config.withAttribute(obj, obj2));
    }

    public ObjectReader withAttributes(Map<?, ?> map) {
        return _with(this._config.withAttributes(map));
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new DataFormatReaders(objectReaderArr));
    }

    public ObjectReader withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        return _with(this._config.withHandler(deserializationProblemHandler));
    }

    public ObjectReader withRootName(String str) {
        return _with(this._config.withRootName(str));
    }

    @Deprecated
    public ObjectReader withType(JavaType javaType) {
        return forType(javaType);
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, null, this._schema, this._injectableValues, this._dataFormatReaders);
        }
        JavaType javaTypeConstructType = this._valueType;
        if (javaTypeConstructType == null) {
            javaTypeConstructType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaTypeConstructType, this._rootDeserializer, obj, this._schema, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withView(Class<?> cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader withoutAttribute(Object obj) {
        return _with(this._config.withoutAttribute(obj));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public ObjectReader withoutRootName() {
        return _with(this._config.withRootName(PropertyName.NO_NAME));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    public InputStream _inputStream(File file) {
        return new FileInputStream(file);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonNode createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonNode createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public JsonNode missingNode() {
        return this._config.getNodeFactory().missingNode();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public JsonNode nullNode() {
        return this._config.getNodeFactory().nullNode();
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withFeatures(featureArr));
    }

    public ObjectReader withFormatDetection(DataFormatReaders dataFormatReaders) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ObjectReader withRootName(PropertyName propertyName) {
        return _with(this._config.withRootName(propertyName));
    }

    @Deprecated
    public ObjectReader withType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withoutFeatures(featureArr));
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, jsonDeserializer, obj, formatSchema, injectableValues, dataFormatReaders);
    }

    public ObjectReader at(JsonPointer jsonPointer) {
        _assertNotNull("pointer", jsonPointer);
        return new ObjectReader(this, new JsonPointerBasedFilter(jsonPointer));
    }

    public JsonParser createParser(URL url) {
        _assertNotNull("src", url);
        return this._parserFactory.createParser(url);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._config.isEnabled(feature, this._parserFactory);
    }

    public JsonNode readTree(InputStream inputStream) {
        if (this._dataFormatReaders != null) {
            return _detectBindAndCloseAsTree(inputStream);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(inputStream), false));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        _assertNotNull("p", jsonParser);
        return (T) forType((Class<?>) cls).readValue(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) {
        _assertNotNull("p", jsonParser);
        return forType((TypeReference<?>) typeReference).readValues(jsonParser);
    }

    public ObjectReader with(JsonParser.Feature feature) {
        return _with(this._config.with(feature));
    }

    public ObjectReader withFeatures(FormatFeature... formatFeatureArr) {
        return _with(this._config.withFeatures(formatFeatureArr));
    }

    @Deprecated
    public ObjectReader withType(Type type) {
        return forType(this._config.getTypeFactory().constructType(type));
    }

    public ObjectReader without(JsonParser.Feature feature) {
        return _with(this._config.without(feature));
    }

    public ObjectReader withoutFeatures(FormatFeature... formatFeatureArr) {
        return _with(this._config.withoutFeatures(formatFeatureArr));
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return this._config.isEnabled(streamReadFeature.mappedFeature(), this._parserFactory);
    }

    public ObjectReader with(StreamReadFeature streamReadFeature) {
        return _with(this._config.with(streamReadFeature.mappedFeature()));
    }

    @Deprecated
    public ObjectReader withType(TypeReference<?> typeReference) {
        return forType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    public ObjectReader without(StreamReadFeature streamReadFeature) {
        return _with(this._config.without(streamReadFeature.mappedFeature()));
    }

    public JsonParser createParser(InputStream inputStream) {
        _assertNotNull("in", inputStream);
        return this._parserFactory.createParser(inputStream);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) {
        _assertNotNull("p", jsonParser);
        return (T) forType((TypeReference<?>) typeReference).readValue(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) {
        _assertNotNull("p", jsonParser);
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public ObjectReader with(FormatFeature formatFeature) {
        return _with(this._config.with(formatFeature));
    }

    public ObjectReader without(FormatFeature formatFeature) {
        return _with(this._config.without(formatFeature));
    }

    public Object _detectBindAndClose(DataFormatReaders.Match match, boolean z10) throws JsonParseException {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser jsonParserCreateParserWithMatch = match.createParserWithMatch();
        if (z10) {
            jsonParserCreateParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndClose(jsonParserCreateParserWithMatch);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public JsonNode readTree(Reader reader) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(reader), false));
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public JsonParser createParser(Reader reader) {
        _assertNotNull("r", reader);
        return this._parserFactory.createParser(reader);
    }

    public ObjectReader forType(TypeReference<?> typeReference) {
        return forType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) {
        _assertNotNull("p", jsonParser);
        return (T) forType((JavaType) resolvedType).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) {
        _assertNotNull("p", jsonParser);
        return forType(javaType).readValues(jsonParser);
    }

    public ObjectReader with(InjectableValues injectableValues) {
        return this._injectableValues == injectableValues ? this : _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, injectableValues, this._dataFormatReaders);
    }

    public JsonParser createParser(byte[] bArr) {
        _assertNotNull("content", bArr);
        return this._parserFactory.createParser(bArr);
    }

    public JsonNode readTree(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndCloseAsTree(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e10) {
            throw e10;
        } catch (IOException e11) {
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) {
        _assertNotNull("p", jsonParser);
        return (T) forType(javaType).readValue(jsonParser);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser) {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), false);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._parserFactory) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(objectReader_new);
        }
        return objectReader_new;
    }

    public JsonParser createParser(byte[] bArr, int i10, int i11) {
        _assertNotNull("content", bArr);
        return this._parserFactory.createParser(bArr, i10, i11);
    }

    public <T> T readValue(InputStream inputStream) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return (T) _detectBindAndClose(dataFormatReaders.findFormat(inputStream), false);
        }
        return (T) _bindAndClose(_considerFilter(createParser(inputStream), false));
    }

    public <T> MappingIterator<T> readValues(InputStream inputStream) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(inputStream), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(inputStream), true));
    }

    public JsonParser createParser(String str) {
        _assertNotNull("content", str);
        return this._parserFactory.createParser(str);
    }

    public JsonNode readTree(byte[] bArr) throws JsonParseException {
        _assertNotNull("json", bArr);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr), false));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(inputStream);
    }

    public ObjectReader with(FormatSchema formatSchema) {
        if (this._schema == formatSchema) {
            return this;
        }
        _verifySchemaType(formatSchema);
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, formatSchema, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = jsonDeserializer;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public JsonParser createParser(char[] cArr) {
        _assertNotNull("content", cArr);
        return this._parserFactory.createParser(cArr);
    }

    public <T> T readValue(Reader reader) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return (T) _bindAndClose(_considerFilter(createParser(reader), false));
    }

    public <T> MappingIterator<T> readValues(Reader reader) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(reader), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.nextToken();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public JsonParser createParser(char[] cArr, int i10, int i11) {
        _assertNotNull("content", cArr);
        return this._parserFactory.createParser(cArr, i10, i11);
    }

    public ObjectReader with(Locale locale) {
        return _with(this._config.with(locale));
    }

    public JsonNode readTree(byte[] bArr, int i10, int i11) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr, i10, i11), false));
    }

    public <T> T readValue(Reader reader, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(reader);
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with(this._config.with(timeZone));
    }

    public JsonParser createParser(DataInput dataInput) {
        _assertNotNull("content", dataInput);
        return this._parserFactory.createParser(dataInput);
    }

    public <T> T readValue(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return (T) _bindAndClose(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e10) {
            throw e10;
        } catch (IOException e11) {
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with(this._config.with(base64Variant));
    }

    public ObjectReader with(ContextAttributes contextAttributes) {
        return _with(this._config.with(contextAttributes));
    }

    public JsonNode readTree(DataInput dataInput) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(dataInput), false));
    }

    public <T> MappingIterator<T> readValues(String str) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(str), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.nextToken();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public <T> T readValue(String str, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(str);
    }

    public <T> T readValue(byte[] bArr) {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, 0, bArr.length);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr), false));
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(bArr);
    }

    public <T> T readValue(byte[] bArr, int i10, int i11) {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, i10, i11);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr, i10, i11), false));
    }

    public <T> MappingIterator<T> readValues(byte[] bArr, int i10, int i11) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(bArr, i10, i11), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(bArr, i10, i11), true));
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(bArr, i10, i11);
    }

    public final <T> MappingIterator<T> readValues(byte[] bArr) {
        _assertNotNull("src", bArr);
        return readValues(bArr, 0, bArr.length);
    }

    public <T> T readValue(File file) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return (T) _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(file)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(file), false));
    }

    public <T> MappingIterator<T> readValues(File file) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(file)), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(file), true));
    }

    public <T> T readValue(File file, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(file);
    }

    public <T> T readValue(URL url) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return (T) _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(url), false));
    }

    public <T> MappingIterator<T> readValues(URL url) {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return _bindAndReadValues(_considerFilter(createParser(url), true));
    }

    public <T> T readValue(URL url, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(url);
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = objectReader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = jsonFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public <T> T readValue(JsonNode jsonNode) throws JsonParseException {
        _assertNotNull("content", jsonNode);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(jsonNode);
        }
        return (T) _bindAndClose(_considerFilter(treeAsTokens(jsonNode), false));
    }

    public <T> MappingIterator<T> readValues(DataInput dataInput) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndReadValues(_considerFilter(createParser(dataInput), true));
    }

    public <T> T readValue(JsonNode jsonNode, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(jsonNode);
    }

    public <T> T readValue(DataInput dataInput) throws JsonParseException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return (T) _bindAndClose(_considerFilter(createParser(dataInput), false));
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) {
        return (T) forType((Class<?>) cls).readValue(dataInput);
    }

    public ObjectReader(ObjectReader objectReader, TokenFilter tokenFilter) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = tokenFilter;
    }
}
