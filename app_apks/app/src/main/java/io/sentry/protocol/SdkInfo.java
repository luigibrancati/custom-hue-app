package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SdkInfo implements JsonUnknown, JsonSerializable {
    private String sdkName;
    private Map<String, Object> unknown;
    private Integer versionMajor;
    private Integer versionMinor;
    private Integer versionPatchlevel;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SdkInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SdkInfo deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            SdkInfo sdkInfo = new SdkInfo();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk_name":
                        sdkInfo.sdkName = objectReader.nextStringOrNull();
                        break;
                    case "version_patchlevel":
                        sdkInfo.versionPatchlevel = objectReader.nextIntegerOrNull();
                        break;
                    case "version_major":
                        sdkInfo.versionMajor = objectReader.nextIntegerOrNull();
                        break;
                    case "version_minor":
                        sdkInfo.versionMinor = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            sdkInfo.setUnknown(map);
            return sdkInfo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String SDK_NAME = "sdk_name";
        public static final String VERSION_MAJOR = "version_major";
        public static final String VERSION_MINOR = "version_minor";
        public static final String VERSION_PATCHLEVEL = "version_patchlevel";
    }

    public String getSdkName() {
        return this.sdkName;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Integer getVersionMajor() {
        return this.versionMajor;
    }

    public Integer getVersionMinor() {
        return this.versionMinor;
    }

    public Integer getVersionPatchlevel() {
        return this.versionPatchlevel;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sdkName != null) {
            objectWriter.name(JsonKeys.SDK_NAME).value(this.sdkName);
        }
        if (this.versionMajor != null) {
            objectWriter.name(JsonKeys.VERSION_MAJOR).value(this.versionMajor);
        }
        if (this.versionMinor != null) {
            objectWriter.name(JsonKeys.VERSION_MINOR).value(this.versionMinor);
        }
        if (this.versionPatchlevel != null) {
            objectWriter.name(JsonKeys.VERSION_PATCHLEVEL).value(this.versionPatchlevel);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setSdkName(String str) {
        this.sdkName = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVersionMajor(Integer num) {
        this.versionMajor = num;
    }

    public void setVersionMinor(Integer num) {
        this.versionMinor = num;
    }

    public void setVersionPatchlevel(Integer num) {
        this.versionPatchlevel = num;
    }
}
