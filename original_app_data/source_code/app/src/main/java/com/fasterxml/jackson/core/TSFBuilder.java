package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TSFBuilder;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class TSFBuilder<F extends JsonFactory, B extends TSFBuilder<F, B>> {
    protected int _factoryFeatures;
    protected InputDecorator _inputDecorator;
    protected OutputDecorator _outputDecorator;
    protected int _streamReadFeatures;
    protected int _streamWriteFeatures;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = JsonFactory.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();

    public TSFBuilder() {
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._streamReadFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._streamWriteFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._inputDecorator = null;
        this._outputDecorator = null;
    }

    private B _failNonJSON(Object obj) {
        throw new IllegalArgumentException("Feature " + obj.getClass().getName() + "#" + obj.toString() + " not supported for non-JSON backend");
    }

    public void _legacyDisable(JsonParser.Feature feature) {
        if (feature != null) {
            this._streamReadFeatures = (~feature.getMask()) & this._streamReadFeatures;
        }
    }

    public void _legacyEnable(JsonParser.Feature feature) {
        if (feature != null) {
            this._streamReadFeatures = feature.getMask() | this._streamReadFeatures;
        }
    }

    public abstract F build();

    public B configure(JsonFactory.Feature feature, boolean z10) {
        return z10 ? (B) enable(feature) : (B) disable(feature);
    }

    public B disable(JsonFactory.Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return (B) _this();
    }

    public B enable(JsonFactory.Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return (B) _this();
    }

    public int factoryFeaturesMask() {
        return this._factoryFeatures;
    }

    public InputDecorator inputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator outputDecorator() {
        return this._outputDecorator;
    }

    public int streamReadFeatures() {
        return this._streamReadFeatures;
    }

    public int streamWriteFeatures() {
        return this._streamWriteFeatures;
    }

    public void _legacyDisable(JsonGenerator.Feature feature) {
        if (feature != null) {
            this._streamWriteFeatures = (~feature.getMask()) & this._streamWriteFeatures;
        }
    }

    public void _legacyEnable(JsonGenerator.Feature feature) {
        if (feature != null) {
            this._streamWriteFeatures = feature.getMask() | this._streamWriteFeatures;
        }
    }

    public B configure(StreamReadFeature streamReadFeature, boolean z10) {
        return z10 ? (B) enable(streamReadFeature) : (B) disable(streamReadFeature);
    }

    public B inputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return (B) _this();
    }

    public B outputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return (B) _this();
    }

    public B configure(StreamWriteFeature streamWriteFeature, boolean z10) {
        return z10 ? (B) enable(streamWriteFeature) : (B) disable(streamWriteFeature);
    }

    public B disable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures = (~streamReadFeature.mappedFeature().getMask()) & this._streamReadFeatures;
        return (B) _this();
    }

    public B enable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures = streamReadFeature.mappedFeature().getMask() | this._streamReadFeatures;
        return (B) _this();
    }

    public B configure(JsonReadFeature jsonReadFeature, boolean z10) {
        return (B) _failNonJSON(jsonReadFeature);
    }

    public B configure(JsonWriteFeature jsonWriteFeature, boolean z10) {
        return (B) _failNonJSON(jsonWriteFeature);
    }

    public B disable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures = (~streamReadFeature.mappedFeature().getMask()) & this._streamReadFeatures;
        for (StreamReadFeature streamReadFeature2 : streamReadFeatureArr) {
            this._streamReadFeatures = (~streamReadFeature2.mappedFeature().getMask()) & this._streamReadFeatures;
        }
        return (B) _this();
    }

    public B enable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures = streamReadFeature.mappedFeature().getMask() | this._streamReadFeatures;
        for (StreamReadFeature streamReadFeature2 : streamReadFeatureArr) {
            this._streamReadFeatures = streamReadFeature2.mappedFeature().getMask() | this._streamReadFeatures;
        }
        return (B) _this();
    }

    public TSFBuilder(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    public TSFBuilder(int i10, int i11, int i12) {
        this._factoryFeatures = i10;
        this._streamReadFeatures = i11;
        this._streamWriteFeatures = i12;
    }

    public B disable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures = (~streamWriteFeature.mappedFeature().getMask()) & this._streamWriteFeatures;
        return (B) _this();
    }

    public B enable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures = streamWriteFeature.mappedFeature().getMask() | this._streamWriteFeatures;
        return (B) _this();
    }

    public B disable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures = (~streamWriteFeature.mappedFeature().getMask()) & this._streamWriteFeatures;
        for (StreamWriteFeature streamWriteFeature2 : streamWriteFeatureArr) {
            this._streamWriteFeatures = (~streamWriteFeature2.mappedFeature().getMask()) & this._streamWriteFeatures;
        }
        return (B) _this();
    }

    public B enable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures = streamWriteFeature.mappedFeature().getMask() | this._streamWriteFeatures;
        for (StreamWriteFeature streamWriteFeature2 : streamWriteFeatureArr) {
            this._streamWriteFeatures = streamWriteFeature2.mappedFeature().getMask() | this._streamWriteFeatures;
        }
        return (B) _this();
    }

    public B disable(JsonReadFeature jsonReadFeature) {
        return (B) _failNonJSON(jsonReadFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature) {
        return (B) _failNonJSON(jsonReadFeature);
    }

    public B disable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return (B) _failNonJSON(jsonReadFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return (B) _failNonJSON(jsonReadFeature);
    }

    public final B _this() {
        return this;
    }

    public B disable(JsonWriteFeature jsonWriteFeature) {
        return (B) _failNonJSON(jsonWriteFeature);
    }

    public B enable(JsonWriteFeature jsonWriteFeature) {
        return (B) _failNonJSON(jsonWriteFeature);
    }

    public B disable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return (B) _failNonJSON(jsonWriteFeature);
    }

    public B enable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return (B) _failNonJSON(jsonWriteFeature);
    }
}
