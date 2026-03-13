package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    private static final int SER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
    private static final long serialVersionUID = 1;
    protected final PrettyPrinter _defaultPrettyPrinter;
    protected final FilterProvider _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;

    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = SER_FEATURE_DEFAULTS;
        this._filterProvider = null;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    private SerializationConfig _withJsonWriteFeatures(FormatFeature... formatFeatureArr) {
        JsonGenerator.Feature featureMappedFeature;
        int i10 = this._generatorFeatures;
        int i11 = this._generatorFeaturesToChange;
        int i12 = this._formatWriteFeatures;
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        int i16 = this._formatWriteFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i15 |= mask;
            i16 |= mask;
            if ((formatFeature instanceof JsonWriteFeature) && (featureMappedFeature = ((JsonWriteFeature) formatFeature).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i14 = mask2 | i14;
                i13 |= mask2;
            }
        }
        return (this._formatWriteFeatures == i15 && this._formatWriteFeaturesToChange == i16 && this._generatorFeatures == i13 && this._generatorFeaturesToChange == i14) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i13, i14, i15, i16);
    }

    private SerializationConfig _withoutJsonWriteFeatures(FormatFeature... formatFeatureArr) {
        JsonGenerator.Feature featureMappedFeature;
        int i10 = this._generatorFeatures;
        int i11 = this._generatorFeaturesToChange;
        int i12 = this._formatWriteFeatures;
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        int i16 = this._formatWriteFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i15 &= ~mask;
            i16 |= mask;
            if ((formatFeature instanceof JsonWriteFeature) && (featureMappedFeature = ((JsonWriteFeature) formatFeature).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i14 = mask2 | i14;
                i13 = (~mask2) & i13;
            }
        }
        return (this._formatWriteFeatures == i15 && this._formatWriteFeaturesToChange == i16 && this._generatorFeatures == i13 && this._generatorFeaturesToChange == i14) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i13, i14, i15, i16);
    }

    public PrettyPrinter constructDefaultPrettyPrinter() {
        PrettyPrinter prettyPrinter = this._defaultPrettyPrinter;
        return prettyPrinter instanceof Instantiatable ? (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance() : prettyPrinter;
    }

    public PrettyPrinter getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public FilterProvider getFilterProvider() {
        return this._filterProvider;
    }

    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    @Deprecated
    public JsonInclude.Include getSerializationInclusion() {
        JsonInclude.Include valueInclusion = getDefaultPropertyInclusion().getValueInclusion();
        return valueInclusion == JsonInclude.Include.USE_DEFAULTS ? JsonInclude.Include.ALWAYS : valueInclusion;
    }

    public final boolean hasSerializationFeatures(int i10) {
        return (this._serFeatures & i10) == i10;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        PrettyPrinter prettyPrinterConstructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.getPrettyPrinter() == null && (prettyPrinterConstructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.setPrettyPrinter(prettyPrinterConstructDefaultPrettyPrinter);
        }
        boolean zEnabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i10 = this._generatorFeaturesToChange;
        if (i10 != 0 || zEnabledIn) {
            int i11 = this._generatorFeatures;
            if (zEnabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i11 |= mask;
                i10 |= mask;
            }
            jsonGenerator.overrideStdFeatures(i11, i10);
        }
        int i12 = this._formatWriteFeaturesToChange;
        if (i12 != 0) {
            jsonGenerator.overrideFormatFeatures(this._formatWriteFeatures, i12);
        }
    }

    public <T extends BeanDescription> T introspect(JavaType javaType) {
        return (T) getClassIntrospector().forSerialization(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (this._serFeatures & serializationFeature.getMask()) != 0;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        return this._rootName != null ? !r0.isEmpty() : isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public SerializationConfig withDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        return this._defaultPrettyPrinter == prettyPrinter ? this : new SerializationConfig(this, prettyPrinter);
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int mask = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            mask |= serializationFeature.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFilters(FilterProvider filterProvider) {
        return filterProvider == this._filterProvider ? this : new SerializationConfig(this, filterProvider);
    }

    @Deprecated
    public SerializationConfig withPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int i10 = this._serFeatures & (~serializationFeature.getMask());
        return i10 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i10, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i10 = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            i10 &= ~serializationFeature.getMask();
        }
        return i10 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i10, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withMapperFeatures(int i10) {
        return new SerializationConfig(this, i10, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public final boolean isEnabled(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        return (feature.getMask() & this._generatorFeaturesToChange) != 0 ? (this._generatorFeatures & feature.getMask()) != 0 : jsonFactory.isEnabled(feature);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withRootName(PropertyName propertyName) {
        return (propertyName != null ? !propertyName.equals(this._rootName) : this._rootName != null) ? new SerializationConfig(this, propertyName) : this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i10 = (~serializationFeature.getMask()) & this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            i10 &= ~serializationFeature2.getMask();
        }
        return i10 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i10, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(SubtypeResolver subtypeResolver) {
        return subtypeResolver == this._subtypeResolver ? this : new SerializationConfig(this, subtypeResolver);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    public SerializationConfig withFeatures(JsonGenerator.Feature... featureArr) {
        int i10 = this._generatorFeatures;
        int i11 = i10;
        int i12 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i11 |= mask;
            i12 |= mask;
        }
        return (this._generatorFeatures == i11 && this._generatorFeaturesToChange == i12) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i11, i12, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(JsonGenerator.Feature... featureArr) {
        int i10 = this._generatorFeatures;
        int i11 = i10;
        int i12 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i11 &= ~mask;
            i12 |= mask;
        }
        return (this._generatorFeatures == i11 && this._generatorFeaturesToChange == i12) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i11, i12, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.with(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig without(JsonGenerator.Feature feature) {
        int i10 = this._generatorFeatures & (~feature.getMask());
        int mask = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == i10 && this._generatorFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i10, mask, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFeatures(FormatFeature... formatFeatureArr) {
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonWriteFeature)) {
            return _withJsonWriteFeatures(formatFeatureArr);
        }
        int i10 = this._formatWriteFeatures;
        int i11 = i10;
        int i12 = this._formatWriteFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i11 |= mask;
            i12 |= mask;
        }
        return (this._formatWriteFeatures == i11 && this._formatWriteFeaturesToChange == i12) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i11, i12);
    }

    public SerializationConfig without(FormatFeature formatFeature) {
        if (formatFeature instanceof JsonWriteFeature) {
            return _withoutJsonWriteFeatures(formatFeature);
        }
        int i10 = this._formatWriteFeatures & (~formatFeature.getMask());
        int mask = this._formatWriteFeaturesToChange | formatFeature.getMask();
        return (this._formatWriteFeatures == i10 && this._formatWriteFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i10, mask);
    }

    public SerializationConfig withoutFeatures(FormatFeature... formatFeatureArr) {
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonWriteFeature)) {
            return _withoutJsonWriteFeatures(formatFeatureArr);
        }
        int i10 = this._formatWriteFeatures;
        int i11 = i10;
        int i12 = this._formatWriteFeaturesToChange;
        for (FormatFeature formatFeature : formatFeatureArr) {
            int mask = formatFeature.getMask();
            i11 &= ~mask;
            i12 |= mask;
        }
        return (this._formatWriteFeatures == i11 && this._formatWriteFeaturesToChange == i12) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i11, i12);
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            mask |= serializationFeature2.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(JsonGenerator.Feature feature) {
        int mask = this._generatorFeatures | feature.getMask();
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    private SerializationConfig(SerializationConfig serializationConfig, SubtypeResolver subtypeResolver) {
        super(serializationConfig, subtypeResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(FormatFeature formatFeature) {
        if (formatFeature instanceof JsonWriteFeature) {
            return _withJsonWriteFeatures(formatFeature);
        }
        int mask = this._formatWriteFeatures | formatFeature.getMask();
        int mask2 = this._formatWriteFeaturesToChange | formatFeature.getMask();
        return (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
    }

    private SerializationConfig(SerializationConfig serializationConfig, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(serializationConfig, i10);
        this._serFeatures = i11;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i12;
        this._generatorFeaturesToChange = i13;
        this._formatWriteFeatures = i14;
        this._formatWriteFeaturesToChange = i15;
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, FilterProvider filterProvider) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, PropertyName propertyName) {
        super(serializationConfig, propertyName);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, PrettyPrinter prettyPrinter) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = prettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}
