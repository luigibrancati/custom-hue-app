package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import com.fasterxml.jackson.databind.cfg.PackageVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class JsonMapper extends ObjectMapper {
    private static final long serialVersionUID = 1;

    public JsonMapper() {
        this(new JsonFactory());
    }

    public static Builder builder() {
        return new Builder(new JsonMapper());
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public boolean isEnabled(JsonReadFeature jsonReadFeature) {
        return isEnabled(jsonReadFeature.mappedFeature());
    }

    public Builder rebuild() {
        return new Builder(copy());
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder extends MapperBuilder<JsonMapper, Builder> {
        public Builder(JsonMapper jsonMapper) {
            super(jsonMapper);
        }

        public Builder configure(JsonReadFeature jsonReadFeature, boolean z10) {
            if (z10) {
                ((JsonMapper) this._mapper).enable(jsonReadFeature.mappedFeature());
                return this;
            }
            ((JsonMapper) this._mapper).disable(jsonReadFeature.mappedFeature());
            return this;
        }

        public Builder disable(JsonReadFeature... jsonReadFeatureArr) {
            for (JsonReadFeature jsonReadFeature : jsonReadFeatureArr) {
                ((JsonMapper) this._mapper).disable(jsonReadFeature.mappedFeature());
            }
            return this;
        }

        public Builder enable(JsonReadFeature... jsonReadFeatureArr) {
            for (JsonReadFeature jsonReadFeature : jsonReadFeatureArr) {
                ((JsonMapper) this._mapper).enable(jsonReadFeature.mappedFeature());
            }
            return this;
        }

        public Builder configure(JsonWriteFeature jsonWriteFeature, boolean z10) {
            if (z10) {
                ((JsonMapper) this._mapper).enable(jsonWriteFeature.mappedFeature());
                return this;
            }
            ((JsonMapper) this._mapper).disable(jsonWriteFeature.mappedFeature());
            return this;
        }

        public Builder disable(JsonWriteFeature... jsonWriteFeatureArr) {
            for (JsonWriteFeature jsonWriteFeature : jsonWriteFeatureArr) {
                ((JsonMapper) this._mapper).disable(jsonWriteFeature.mappedFeature());
            }
            return this;
        }

        public Builder enable(JsonWriteFeature... jsonWriteFeatureArr) {
            for (JsonWriteFeature jsonWriteFeature : jsonWriteFeatureArr) {
                ((JsonMapper) this._mapper).enable(jsonWriteFeature.mappedFeature());
            }
            return this;
        }
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    public static Builder builder(JsonFactory jsonFactory) {
        return new Builder(new JsonMapper(jsonFactory));
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper
    public JsonMapper copy() {
        _checkInvalidCopy(JsonMapper.class);
        return new JsonMapper(this);
    }

    public boolean isEnabled(JsonWriteFeature jsonWriteFeature) {
        return isEnabled(jsonWriteFeature.mappedFeature());
    }

    public JsonMapper(JsonMapper jsonMapper) {
        super(jsonMapper);
    }
}
