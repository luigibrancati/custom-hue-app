package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    private static final int DESER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final LinkedNode<DeserializationProblemHandler> _problemHandlers;

    public DeserializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = DESER_FEATURE_DEFAULTS;
        this._nodeFactory = JsonNodeFactory.instance;
        this._problemHandlers = null;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    private DeserializationConfig _withJsonReadFeatures(FormatFeature... formatFeatureArr) {
        JsonParser.Feature featureMappedFeature;
        int i10 = this._parserFeatures;
        int i11 = this._parserFeaturesToChange;
        int i12 = this._formatReadFeatures;
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        int i16 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i15 |= mask;
            i16 |= mask;
            if ((formatFeature instanceof JsonReadFeature) && (featureMappedFeature = ((JsonReadFeature) formatFeature).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i14 = mask2 | i14;
                i13 |= mask2;
            }
        }
        return (this._formatReadFeatures == i15 && this._formatReadFeaturesToChange == i16 && this._parserFeatures == i13 && this._parserFeaturesToChange == i14) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i13, i14, i15, i16);
    }

    private DeserializationConfig _withoutJsonReadFeatures(FormatFeature... formatFeatureArr) {
        JsonParser.Feature featureMappedFeature;
        int i10 = this._parserFeatures;
        int i11 = this._parserFeaturesToChange;
        int i12 = this._formatReadFeatures;
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        int i16 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i15 &= ~mask;
            i16 |= mask;
            if ((formatFeature instanceof JsonReadFeature) && (featureMappedFeature = ((JsonReadFeature) formatFeature).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i14 = mask2 | i14;
                i13 = (~mask2) & i13;
            }
        }
        return (this._formatReadFeatures == i15 && this._formatReadFeaturesToChange == i16 && this._parserFeatures == i13 && this._parserFeaturesToChange == i14) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i13, i14, i15, i16);
    }

    public TypeDeserializer findTypeDeserializer(JavaType javaType) {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        AnnotatedClass classInfo = introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = getAnnotationIntrospector().findTypeResolver(this, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByTypeId = null;
            if (typeResolverBuilderFindTypeResolver == null) {
                return null;
            }
        } else {
            collectionCollectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, classInfo);
        }
        return typeResolverBuilderFindTypeResolver.buildTypeDeserializer(this, javaType, collectionCollectAndResolveSubtypesByTypeId);
    }

    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public LinkedNode<DeserializationProblemHandler> getProblemHandlers() {
        return this._problemHandlers;
    }

    public final boolean hasDeserializationFeatures(int i10) {
        return (this._deserFeatures & i10) == i10;
    }

    public final boolean hasSomeOfFeatures(int i10) {
        return (this._deserFeatures & i10) != 0;
    }

    public void initialize(JsonParser jsonParser) {
        int i10 = this._parserFeaturesToChange;
        if (i10 != 0) {
            jsonParser.overrideStdFeatures(this._parserFeatures, i10);
        }
        int i11 = this._formatReadFeaturesToChange;
        if (i11 != 0) {
            jsonParser.overrideFormatFeatures(this._formatReadFeatures, i11);
        }
    }

    public <T extends BeanDescription> T introspect(JavaType javaType) {
        return (T) getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public <T extends BeanDescription> T introspectForBuilder(JavaType javaType) {
        return (T) getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public <T extends BeanDescription> T introspectForCreation(JavaType javaType) {
        return (T) getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (this._deserFeatures & deserializationFeature.getMask()) != 0;
    }

    public final boolean requiresFullValue() {
        return DeserializationFeature.FAIL_ON_TRAILING_TOKENS.enabledIn(this._deserFeatures);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        return this._rootName != null ? !r0.isEmpty() : isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int mask = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            mask |= deserializationFeature.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        return LinkedNode.contains(this._problemHandlers, deserializationProblemHandler) ? this : new DeserializationConfig(this, (LinkedNode<DeserializationProblemHandler>) new LinkedNode(deserializationProblemHandler, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        return this._problemHandlers == null ? this : new DeserializationConfig(this, (LinkedNode<DeserializationProblemHandler>) null);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int i10 = this._deserFeatures & (~deserializationFeature.getMask());
        return i10 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i10, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i10 = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            i10 &= ~deserializationFeature.getMask();
        }
        return i10 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i10, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withMapperFeatures(int i10) {
        return new DeserializationConfig(this, i10, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public final boolean isEnabled(JsonParser.Feature feature, JsonFactory jsonFactory) {
        return (feature.getMask() & this._parserFeaturesToChange) != 0 ? (this._parserFeatures & feature.getMask()) != 0 : jsonFactory.isEnabled(feature);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withRootName(PropertyName propertyName) {
        return (propertyName != null ? !propertyName.equals(this._rootName) : this._rootName != null) ? new DeserializationConfig(this, propertyName) : this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(SubtypeResolver subtypeResolver) {
        return this._subtypeResolver == subtypeResolver ? this : new DeserializationConfig(this, subtypeResolver);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i10 = (~deserializationFeature.getMask()) & this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i10 &= ~deserializationFeature2.getMask();
        }
        return i10 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i10, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(JsonParser.Feature... featureArr) {
        int i10 = this._parserFeatures;
        int i11 = i10;
        int i12 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i11 |= mask;
            i12 |= mask;
        }
        return (this._parserFeatures == i11 && this._parserFeaturesToChange == i12) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i11, i12, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(JsonParser.Feature... featureArr) {
        int i10 = this._parserFeatures;
        int i11 = i10;
        int i12 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i11 &= ~mask;
            i12 |= mask;
        }
        return (this._parserFeatures == i11 && this._parserFeaturesToChange == i12) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i11, i12, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            mask |= deserializationFeature2.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(JsonParser.Feature feature) {
        int i10 = this._parserFeatures & (~feature.getMask());
        int mask = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == i10 && this._parserFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i10, mask, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(deserializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig withFeatures(FormatFeature... formatFeatureArr) {
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonReadFeature)) {
            return _withJsonReadFeatures(formatFeatureArr);
        }
        int i10 = this._formatReadFeatures;
        int i11 = i10;
        int i12 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i11 |= mask;
            i12 |= mask;
        }
        return (this._formatReadFeatures == i11 && this._formatReadFeaturesToChange == i12) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i11, i12);
    }

    public DeserializationConfig without(FormatFeature formatFeature) {
        if (formatFeature instanceof JsonReadFeature) {
            return _withoutJsonReadFeatures(formatFeature);
        }
        int i10 = this._formatReadFeatures & (~formatFeature.getMask());
        int mask = this._formatReadFeaturesToChange | formatFeature.getMask();
        return (this._formatReadFeatures == i10 && this._formatReadFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i10, mask);
    }

    public DeserializationConfig withoutFeatures(FormatFeature... formatFeatureArr) {
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonReadFeature)) {
            return _withoutJsonReadFeatures(formatFeatureArr);
        }
        int i10 = this._formatReadFeatures;
        int i11 = i10;
        int i12 = this._formatReadFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i11 &= ~mask;
            i12 |= mask;
        }
        return (this._formatReadFeatures == i11 && this._formatReadFeaturesToChange == i12) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i11, i12);
    }

    public DeserializationConfig with(JsonParser.Feature feature) {
        int mask = this._parserFeatures | feature.getMask();
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(FormatFeature formatFeature) {
        if (formatFeature instanceof JsonReadFeature) {
            return _withJsonReadFeatures(formatFeature);
        }
        int mask = this._formatReadFeatures | formatFeature.getMask();
        int mask2 = this._formatReadFeaturesToChange | formatFeature.getMask();
        return (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(deserializationConfig, i10);
        this._deserFeatures = i11;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = i12;
        this._parserFeaturesToChange = i13;
        this._formatReadFeatures = i14;
        this._formatReadFeaturesToChange = i15;
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        return this._nodeFactory == jsonNodeFactory ? this : new DeserializationConfig(this, jsonNodeFactory);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, SubtypeResolver subtypeResolver) {
        super(deserializationConfig, subtypeResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, LinkedNode<DeserializationProblemHandler> linkedNode) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = linkedNode;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, PropertyName propertyName) {
        super(deserializationConfig, propertyName);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }
}
