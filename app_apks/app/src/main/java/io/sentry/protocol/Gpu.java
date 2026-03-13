package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Gpu implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "gpu";
    private String apiType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private Integer f38782id;
    private Integer memorySize;
    private Boolean multiThreadedRendering;
    private String name;
    private String npotSupport;
    private Map<String, Object> unknown;
    private String vendorId;
    private String vendorName;
    private String version;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<Gpu> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Gpu deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Gpu gpu = new Gpu();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "npot_support":
                        gpu.npotSupport = objectReader.nextStringOrNull();
                        break;
                    case "vendor_id":
                        gpu.vendorId = objectReader.nextStringOrNull();
                        break;
                    case "multi_threaded_rendering":
                        gpu.multiThreadedRendering = objectReader.nextBooleanOrNull();
                        break;
                    case "id":
                        gpu.f38782id = objectReader.nextIntegerOrNull();
                        break;
                    case "name":
                        gpu.name = objectReader.nextStringOrNull();
                        break;
                    case "vendor_name":
                        gpu.vendorName = objectReader.nextStringOrNull();
                        break;
                    case "version":
                        gpu.version = objectReader.nextStringOrNull();
                        break;
                    case "api_type":
                        gpu.apiType = objectReader.nextStringOrNull();
                        break;
                    case "memory_size":
                        gpu.memorySize = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            gpu.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return gpu;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String API_TYPE = "api_type";
        public static final String ID = "id";
        public static final String MEMORY_SIZE = "memory_size";
        public static final String MULTI_THREADED_RENDERING = "multi_threaded_rendering";
        public static final String NAME = "name";
        public static final String NPOT_SUPPORT = "npot_support";
        public static final String VENDOR_ID = "vendor_id";
        public static final String VENDOR_NAME = "vendor_name";
        public static final String VERSION = "version";
    }

    public Gpu() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Gpu.class == obj.getClass()) {
            Gpu gpu = (Gpu) obj;
            if (Objects.equals(this.name, gpu.name) && Objects.equals(this.f38782id, gpu.f38782id) && Objects.equals(this.vendorId, gpu.vendorId) && Objects.equals(this.vendorName, gpu.vendorName) && Objects.equals(this.memorySize, gpu.memorySize) && Objects.equals(this.apiType, gpu.apiType) && Objects.equals(this.multiThreadedRendering, gpu.multiThreadedRendering) && Objects.equals(this.version, gpu.version) && Objects.equals(this.npotSupport, gpu.npotSupport)) {
                return true;
            }
        }
        return false;
    }

    public String getApiType() {
        return this.apiType;
    }

    public Integer getId() {
        return this.f38782id;
    }

    public Integer getMemorySize() {
        return this.memorySize;
    }

    public String getName() {
        return this.name;
    }

    public String getNpotSupport() {
        return this.npotSupport;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getVendorId() {
        return this.vendorId;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.f38782id, this.vendorId, this.vendorName, this.memorySize, this.apiType, this.multiThreadedRendering, this.version, this.npotSupport);
    }

    public Boolean isMultiThreadedRendering() {
        return this.multiThreadedRendering;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.f38782id != null) {
            objectWriter.name("id").value(this.f38782id);
        }
        if (this.vendorId != null) {
            objectWriter.name(JsonKeys.VENDOR_ID).value(this.vendorId);
        }
        if (this.vendorName != null) {
            objectWriter.name(JsonKeys.VENDOR_NAME).value(this.vendorName);
        }
        if (this.memorySize != null) {
            objectWriter.name("memory_size").value(this.memorySize);
        }
        if (this.apiType != null) {
            objectWriter.name(JsonKeys.API_TYPE).value(this.apiType);
        }
        if (this.multiThreadedRendering != null) {
            objectWriter.name(JsonKeys.MULTI_THREADED_RENDERING).value(this.multiThreadedRendering);
        }
        if (this.version != null) {
            objectWriter.name("version").value(this.version);
        }
        if (this.npotSupport != null) {
            objectWriter.name(JsonKeys.NPOT_SUPPORT).value(this.npotSupport);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public void setApiType(String str) {
        this.apiType = str;
    }

    public void setId(Integer num) {
        this.f38782id = num;
    }

    public void setMemorySize(Integer num) {
        this.memorySize = num;
    }

    public void setMultiThreadedRendering(Boolean bool) {
        this.multiThreadedRendering = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNpotSupport(String str) {
        this.npotSupport = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVendorId(String str) {
        this.vendorId = str;
    }

    public void setVendorName(String str) {
        this.vendorName = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public Gpu(Gpu gpu) {
        this.name = gpu.name;
        this.f38782id = gpu.f38782id;
        this.vendorId = gpu.vendorId;
        this.vendorName = gpu.vendorName;
        this.memorySize = gpu.memorySize;
        this.apiType = gpu.apiType;
        this.multiThreadedRendering = gpu.multiThreadedRendering;
        this.version = gpu.version;
        this.npotSupport = gpu.npotSupport;
        this.unknown = CollectionUtils.newConcurrentHashMap(gpu.unknown);
    }
}
